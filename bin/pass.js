#!/usr/bin/env node

// Pass.js
// This is the main executable for the Pass translator and server.
// Running this program with 3 arguments will translate the Pass to JS
// and start a Node.js server on the given port which serves files from the 
// given directory.
// The JS outputted from the translator should be wrapped in a function closure.
// Node may do this at the file level by default, we'll see.

/*jshint node: true*/

var path = require('path');
var fs = require('fs');


// ####Argument Validation
// ___________________

var sourcePath, port, staticPath;

// Print a diagnostic message followed by the usage line, then die.
var usageDie = function (message) {
  if (message)
    console.log(message);
  console.log('usage: pass <path/program.pass> [<port#> <static directory>]');
  process.exit();
};

// Verify that the command was called with the correct number of arguments.
if (process.argv.length !== 3 && process.argv.length !== 5) {
  usageDie('invalid number of arguments');
}

sourcePath = path.resolve(process.argv[2]);
// Verify that the source path exists and has a valid extension.
if (!path.existsSync(sourcePath))
  usageDie('file not found: ' + sourcePath);
if (path.extname(sourcePath) !== '.pass' && path.extname(sourcePath) !== '.js')
  usageDie('Server program must have .pass or .js extension');

if (process.argv.length === 5) {
  // Verify that the port is a number in the correct range.
  port = parseFloat(process.argv[3]);
  if (!port || port < 0 || port > 65535) {
    usageDie('invalid port number');
  }

  // Verify that the static path exists and points to a directory.
  staticPath = path.resolve(process.argv[4]);
  if (!path.existsSync(staticPath))
    usageDie('file not found: ' + staticPath);
  if (!fs.statSync(staticPath).isDirectory())
    usageDie('static arg must be directory');
}

// ####Source Compilation

// if (path.extname(sourcePath) == 'pass')
//   sourcePath = COMPILED SOURCE

var passProgram = require(sourcePath);

// If there's no server to start, we're done.
if (!(port && staticPath))
  process.exit(0);

// ####Server Configuration

var connect = require('connect');
var browserify = require('browserify');
var dnode = require('dnode');
var http = require('http');
var lib  = path.join(path.dirname(fs.realpathSync(__filename)), '../lib');
var stdlib = require(lib + '/stdlib.js');

var app = connect();

// Wrap dnode in pass.js, wih a little extra sugar at the end.
var b = browserify({
  require: 'dnode',
  mount: '/pass.js'
});
b.append(fs.readFileSync(__dirname + '/../browser/pass_client.js'));
app.use(b);

app.use(connect.static(staticPath));

var server = http.createServer(app);

var tag = stdlib.tag;
var tags = stdlib.tags;
var contains = stdlib.contains;
var conns = stdlib.conns;
var untag = stdlib.untag;

dnode(function (client, conn) {
  var key;

  // Expose all functions on the server object in the passProgram.
  for (key in passProgram.server)
    if (typeof(passProgram.server[key]) === 'function')
      this[key] = passProgram.server[key];

  conn.on('end', function() {
     var tagged = tags(conn);
     for (var t in tagged)
       untag(conn, tagged[t]); 
  });

}).listen(server);

server.listen(port);
