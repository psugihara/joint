#!/usr/bin/env node

// This is the main entrypoint to the Pass compiler.

/*jshint node: true*/

var fs = require('fs'),
    path = require('path'),
    child = require('child_process'),
    compiler = path.join(path.dirname(fs.realpathSync(__filename)), '../compiler');
    thirdPass = path.join(path.dirname(fs.realpathSync(__filename)), '../compiler/thirdPass');
var minify = false;
var outputfile = null;
var inputfile = null;
var stdOut = false;
var usageString = "\
USAGE: pass <input-file.pass> <options>\n\
<no arguments>          pass interpreter\n\
-h, --help              this help information prompt and exit\n\
-m, --min               add extra optimizations like minification\n\
-o, --out <output-file> specify an custom output filename other than the default\n\
-s, --stdout            print the output program to standard out"

// If there is an argument, give it to PassC.
processOptions(process.argv);
if(inputfile != null){
  compileToFile(inputfile);

} else {
  startREPL();
}
function processOptions(argv){
  var s;
  for(var i in argv){
    s = argv[i];
    if(s === "-h" || s === "-help" || s === "?"){
      console.log("\
This is the pass translator, it compiles pass into javascript.\n\
If no arguments are specified the pass interpreter will start.\n\
If you specifiy an input file with no options the input file \"program.pass\" will\n\
translated to the output file \"program.js\"\nThis program will be human readable.\n\
If you want super optimized, minified, non-human readable code use the -o option.\n\
\n"+usageString);
      process.exit(0);
    } else if (s === "-m" || s === "--min") {
      minify = true;
    } else if (s === "-o" || s === "--out") {
      if (argv[parseInt(i)+1] === undefined) {
        console.log("ERROR: you must specify an output file after -o\n\n"+usageString);
        process.exit(-1);
      }
      outputfile = argv[++i]; 

    } else if (s === "-s" || s === "--stdout") {
      stdOut = true;
    } else if (s.charAt(0) === "-") {
      console.log("ERROR: " + s + " is an invalid option.\n\n"+usageString);
      process.exit(-1);
    } else if (argv[parseInt(i)-1] != "-o" && argv[parseInt(i)-1] != "-out" && s != undefined && s!="node" && parseInt(i)>1) {
      inputfile = s;
    }
  }
}

function startREPL () {
  prompt();
  
  process.chdir(compiler);
  var javaPassC = child.spawn('java', ['PassC']);

  javaPassC.stdout.pipe(process.stdout, { end: false });
  javaPassC.stderr.pipe(process.stderr, { end: false });

  process.stdin.resume();
  process.stdin.pipe(javaPassC.stdin, { end: false });

  javaPassC.stdout.on('data', prompt);
  javaPassC.on('exit', startREPL);
}

function prompt () {
  process.stdout.write('~~~> ');
}

// Take the name of a source file relative to the current directory and
// output the compiled js. When done compiling, call cb with target path
// as arg.
function compileToFile (sourceName, cb) {
  var source = path.resolve(sourceName);
  target = process.cwd() + '/' + path.basename(source, '.pass') + '.js';
  if(outputfile != null){
    target = process.cwd() + '/' + path.basename(path.resolve(outputfile)) ;
  }

  process.chdir(compiler);
  
  child.exec('java PassC ' + source, function (error, stdout, stderr) {

      if (error === null) {
	if ((stdOut && outputfile != null) || !stdOut) {
        fs.writeFile(target, stdout, function (err) {
          if (cb){
            cb(target);          
	  }
          });
        } 
         
        if (stdOut && !minify) {
          console.log(stdout);
        }
        //call minify function
        if(minify){
        //TODO fix path compiler.jar
          process.chdir(thirdPass);
      	target = "/home/albatros/t/pass/bin/out.js";
          child.exec("java -jar compiler.jar --js "+ target  +" --js_output_file "+ target +" --warning_level VERBOSE", function (error, stdout, stderr) {
            if(error === null) {
              if ((stdOut && outputfile != null) || !stdOut) {
                fs.writeFile(target, stdout, function (err) {
       	          if (cb){
                    cb(target);          
	          }
                });
              }
              if (stdOut) {
                console.log(stdout);
              } 
            }else {
              console.log("The third phase of code generation should never throw errors. Something is fishy in semantic anylsis...")
              console.log(stdout);
              console.log(stderr);
            }  
            });
        }
        
      }else {
        console.log(stdout);
        console.log(stderr);
      }  
  });
}

function toConsole (error, stdout, stderr) {
  console.log(stdout);
  if (stderr)
    console.log(stderr);
  process.exit(0);
}
module.exports.compileToFile = compileToFile;
