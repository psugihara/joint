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

function compileToFile(sourceName) {
  var source = path.resolve(sourceName),
      target = process.cwd() + '/' + path.basename(source, '.pass') + '.js';

  process.chdir(compiler);
  var ps = exec('java PassC ' + source, toFile.bind({target:target}));
}

function toFile (error, stdout, stderr) {
  if (error === null) {
    fs.writeFile(this.target, stdout);
  } else {
    console.log(stdout);
    console.log(stderr);
  }
}

function toConsole (error, stdout, stderr) {
  console.log(stdout);
  if (stderr)
    console.log(stderr);
  process.exit(0);
}

module.exports.compileToFile = compileToFile;