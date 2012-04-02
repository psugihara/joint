#!/usr/bin/env node

// Peter Sugihara, March 2012

var path = require('path')
var fs = require('fs')


// ####Argument Validation
// ___________________

var sourcePath, port, staticPath

// Print a diagnostic message followed by the usage line, then die.
var usageDie = function(message) {
  if (message)
    console.log(message)
  console.log('usage: pass <path/program.pass> [<port#> <static directory>]')
  process.exit()
}

// Verify that the command was called with the correct number of arguments.
if (process.argv.length !== 3 && process.argv.length !== 5) {
  usageDie('invalid number of arguments')
}

sourcePath = path.resolve(process.argv[2])
// Verify that the source path exists and points to a Pass program.
if (!path.existsSync(sourcePath))
  usageDie('file not found: ' + sourcePath)
if (!path.extname(sourcePath) === 'pass')
  usageDie('Pass programs must have .pass extension')

if (process.argv.length === 5) {
  // Verify that the port is a number in the correct range.
  port = parseFloat(process.argv[3])
  if (!port || port < 0 || port > 65535) {
    usageDie('invalid port number')
  }

  // Verify that the static path exists and points to a directory.
  staticPath = path.resolve(process.argv[4])
  if (!path.existsSync(staticPath))
    usageDie('file not found: ' + staticPath)
  if (!fs.statSync(staticPath).isDirectory())
    usageDie('static arg must be directory')
}

var fs = require('fs')
function handler (req, res) {

  function response(err, data) {
    if(!err) {
      res.writeHead(200)
      res.write(data)
      res.end()
    }
  }

  if(req.url == '/')
    fs.readFile('index.html', response)
  else
    fs.readFile(__dirname + req.url, response)
}

var groups = {}

function contains (arr, obj) {
  for(var i in arr)
    if(arr[i] == obj)
      return true
  return false
}

function tag (connection, tag) {
  if(!contains(connection.tags, tag)) {
    connection.tags.push(tag)
    if(!Boolean(groups[tag]))
      groups[tag] = []
    groups[tag].push(connection)
  }
}

function untag (connection, tag) {
  connection.tags.pop(tag)
  groups[tag].pop(connection)
}

function tags (connection) {
  return connection.tags
}

function conns (tag) {
  return groups[tag]
}

var app = require('http').createServer(handler).listen(port)

var dnode = require('dnode')
var server = dnode(function (client, conn) {

  this.register = function (name, callbacks) {
    conn.name = name
    conn.tags = []
    console.log('CONN ID: '+conn.id)
    for(var i in callbacks) {
      conn[i] = callbacks[i]
    }
  }

  this.join = function (room) {
    var rooms = tags(conn)
    for(var i in rooms) {
      untag(conn, rooms[i])
      var connections = conns(rooms[i])
      for(var c in connections)
        connections[c].onLeave(conn.name)
    }
    tag(conn, room)
    var connections = conns(room)
    for(var c in connections) {
      console.log('CONN ID: '+conn.id)
      connections[c].onEnter(conn.name)
    }
  }

  this.chat = function (message) {
    var name = conn.name
    var connections = conns(conn.tags)
    for(var c in connections) {
      console.log('sending to '+connections[c].name)
      connections[c].receive(name, message)
    }
  }

  this.log = function (message) {
    console.log(message)
  }
  
}).listen(app)
