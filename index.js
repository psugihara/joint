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
  if (message);
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

// if (path.extname(sourcePath) == 'pass')
//   sourcePath = COMPILED SOURCE

// ###Pass built in functions
// TODO: Comment the shit out of these.


var groups = {};

function contains (arr, obj) {
  for(var i in arr)
    if(arr[i] == obj)
      return true;
  return false;
}

function tag (connection, name) {
  console.log('tagging '+connection.name+' with tag '+name);
  if(!Boolean(connection.tags))
    connection.tags = [];
  if(!contains(connection.tags, name)) {
    connection.tags.push(name);
    if(!Boolean(groups[name]))
      groups[name] = [];
    groups[name].push(connection);
    console.log('members of group '+name+':');
    for(var i in groups[name])
      console.log('  '+groups[name][i].name);
  }
}

function untag (connection, tag) {
  console.log('untagging '+connection.name+' with tag '+tag);
  connection.tags.splice(connection.tags.indexOf(tag), 1);
  groups[tag].splice(groups[tag].indexOf(connection), 1);
  console.log('members of group '+tag+':');
  for(var i in groups[tag])
    console.log('  '+groups[tag][i].name);
}

function tags (connection) {
  return connection.tags;
}

function conns (tag) {
  console.log('members of group '+tag+':');
  for(var i in groups[tag])
    console.log('  '+groups[tag][i].name);
  return groups[tag];
}

// ####Server Configuration

var connect = require('connect');
var browserify = require('browserify');
var dnode = require('dnode');
var http = require('http');

var app = connect();

// Wrap dnode in pass.js, wih a little extra sugar at the end.
var b = browserify({
  require: 'dnode',
  mount: '/pass.js'
});
b.append(fs.readFileSync(__dirname + '/browser/pass_client.js'));
app.use(b);

app.use(connect.static(staticPath));

var server = http.createServer(app);

var passProgram = require(sourcePath);

dnode(function (client, conn) {

  // Expose all functions on the server object.
  var key;
  for (key in passProgram.server)
    if (typeof(passProgram.server[key]) === 'function')
      this[key] = passProgram.server[key];

  // this.register = function (callbacks) {
  //   console.log('CONN ID: '+conn.id);
  //   for(var i in callbacks) {
  //     conn[i] = callbacks[i];
  //   }
  // };

  // this.setName = function (name) {
  //   conn.name = name;
  // };

  // this.join = function (room) {
  //   var rooms = tags(conn);
  //   var r, c;
  //   for(r in rooms)
  //     if(r == room) return;
  //   for(r in rooms) {
  //     var connections = conns(r);
  //     for(c in connections) {
  //       if(conn != connections[c])
  //         connections[c].onLeave(conn.name, r);
  //     }
  //     untag(conn, r);
  //   }
  //   tag(conn, room);
  //   var connections = conns(room);
  //   for(c in connections)
  //     connections[c].onEnter(conn.name, room);
  // };

  // this.chat = function (message) {
  //   var name = conn.name;
  //   var rooms = tags(conn);
  //   console.log('tags for '+name+': '+rooms);
  //   for(var i in rooms) {
  //     var connections = conns(rooms[i]);
  //     for(var c in connections)
  //       connections[c].receive(name, message);
  //   }
  // };

  // this.log = function (message) {
  //   console.log(message);
  // };
  
}).listen(server);

server.listen(port);