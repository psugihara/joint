#!/usr/bin/env node
/**
 * -----------------------------------------------------------------------------
 * author: Peter
 * contributors: Rafael
 * passc.js
 * handles the output from PassC.java and calls third pass optimizations *------------------------------------------------------------------------------
 */
// This is the main entrypoint to the Pass compiler.

/*jshint node: true*/

var fs = require('fs'),
    path = require('path'),
    child = require('child_process'),
    compiler = path.join(path.dirname(fs.realpathSync(__filename)),
    '../compiler'),
    cwd = process.cwd(),
    thirdPass = path.join(compiler + "/thirdPass");

// If there is an argument, give it to PassC.
if (process.argv.length > 2) {
  compileToFile(process.argv[2]);
} else {
  startREPL();
}

// This is never run by the end user. It is for Pass lang development use.
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
function compileToFile (sourceName, opt, cb) {
  
  var source = path.resolve(sourceName),
      target = cwd + '/' + path.basename(source, '.pass') + '.js';
   
  process.chdir(compiler);
  child.exec('java PassC ' + source, function (error, stdout, stderr) {
      if (error === null) {
        fs.writeFile(target, stdout, function (err) {
          if (opt)
            optimize(target, cb);
          else if (cb)
            cb(target);
        });
      } else {
        console.log(stdout);
        console.log(stderr);
      }
  });
}

function optimize (target, cb) {
  process.chdir(thirdPass);
  child.exec("java -jar compiler.jar " + target  + " --js_output_file " 
  + cwd + "/.oUt --compilation_level SIMPLE_OPTIMIZATIONS;cd " + cwd + 
  ";cat .oUt > " + target + ";rm .oUt", function () {
    cb(target);
  });
}

function toConsole (error, stdout, stderr) {
  console.log(stdout);
  if (stderr)
    console.log(stderr);
  process.exit(0);
}

module.exports.compileToFile = compileToFile;
