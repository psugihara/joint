#!/usr/bin/env node

/**
 * -----------------------------------------------------------------------------  
 * author: Peter
 * contributors: Nick
 * /examples/multi-room-chat/client.js  
 * The client-side JavaScript for the Multi-Room Chat example
 *------------------------------------------------------------------------------
 */


// This is the main executable for the Pass translator and server.
// Running this program with 3 arguments will translate the Pass to JS
// and start a Node.js server on the given port which serves files from the 
// given directory.
// The JS outputted from the translator should be wrapped in a function closure.

/*jshint node: true*/

      
var path = require('path'),
    fs  = require('fs');


// ####Argument Validation
// _______________________

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
// ______________________

if (path.extname(sourcePath) == '.pass') {
  // Compile to this directory and run with the new source path.
  require('./passc.js').compileToFile(sourcePath, false, run);
} else {
  run(sourcePath);
}


// ####Program Execution
// _____________________

function run (sourcePath) {

  var program = require(sourcePath);

  // If there's no server to start, we're done.
  if (!(port && staticPath))
    return;

  // ####Server Configuration

  var connect = require('connect'),
      browserify = require('browserify'),
      dnode = require('dnode'),
      http = require('http'),
      lib  = path.join(path.dirname(fs.realpathSync(__filename)), '../lib'),
      connections = require(lib + '/connections.js');

  var app = connect();

  // Wrap dnode in pass.js, wih a little extra sugar at the end.
  var b = browserify({
    require: 'dnode',
    mount: '/pass.js'
  });
  b.append(fs.readFileSync(lib + '/browser/pass_client.js'));
  app.use(b);

  app.use(connect.static(staticPath));

  var server = http.createServer(app);

  dnode(function (client, conn) {
    // Bind server functions to dnode object with the connection.
    for (var key in program) {
      this[key] = program[key].bind({"conn":conn});
    }

    connections.onConnect(conn);

    conn.on('end', function() {
      connections.onDisconnect(conn);
    });
  }).listen(server);

  console.log("running '" + path.basename(process.argv[2]) + "' on port " + port);
  server.listen(port);
}
