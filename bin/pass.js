#!/usr/bin/env node

// Peter Sugihara
// March 2012

var sourcePath, port, staticPath;

getArgs = function() {
  var USAGE = 'Usage: pass program.pass [port# static directory]';
  // print process.argv
  if (process.argv.length != 3 && process.argv.length != 5) {
    console.log(USAGE);
    process.exit();
  }

  sourcePath = process.argv[2];

  if (process.argv.length == 5) {
    port = parseFloat(process.argv[3]);
    if (port == Nan)
      console.log(USAGE);
    staticPath = process.argv[4];
  }
}

getArgs();