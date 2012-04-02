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

var app = require('http').createServer(handler).listen(port)

var dnode = require('dnode')
var server = dnode({
  testTimesTwenty : function (n, cb) { cb(n * 20) }
}).listen(app);
