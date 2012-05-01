#!/usr/bin/env node

// This is the main entrypoint to the Pass compiler.

/*jshint node: true*/

var fs = require('fs'),
    path = require('path'),
    exec = require('child_process').exec,
    compiler = path.join(path.dirname(fs.realpathSync(__filename)), '../compiler'),
    target;

// If there is an argument, give it to PassC.
if (process.argv.length > 2) {
  compileToFile(process.argv[2]);
} else {
  process.stdin.resume();
  process.stdin.on("data", function(chunk) {
    process.chdir(compiler);
    exec('echo "' + chunk + '" | java PassC', toConsole)
  });
}


// Take the name of a source file relative to the current directory and
// output the compiled js. When done compiling, call cb with target path
// as arg.
function compileToFile(sourceName, cb) {
  var source = path.resolve(sourceName),
      target = process.cwd() + '/' + path.basename(source, '.pass') + '.js';

  process.chdir(compiler);
  var ps = exec('java PassC ' + source, function (error, stdout, stderr) {
      if (error === null) {
        fs.writeFile(target, stdout);
        if (cb)
          cb(target);
      } else {
        console.log('error');
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