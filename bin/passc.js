#!/usr/bin/env node

// This is the main entrypoint to the Pass compiler.

/*jshint node: true*/

var fs = require('fs'),
    path = require('path'),
    source = path.resolve(process.argv[2]),
    target = process.cwd() + '/' + path.basename(source, '.pass'),
    compiler = path.join(path.dirname(fs.realpathSync(__filename)), '../compiler');

process.chdir(compiler);
var exec = require('child_process').exec,
    ps = exec('java PassC ' + source, finished);

function finished (error, stdout, stderr) {
  if (error === null) {
    fs.writeFile(target, stdout);
  } else {
    console.log(stdout);
    console.log(stderr);
  }
}