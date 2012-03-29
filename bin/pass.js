#!/usr/bin/env node

// Peter Sugihara
// March 2012

var path = require('path')

var sourcePath, port, staticPath

var usageDie = function(message) {
  if (message)
    console.log(message)
  console.log('usage: pass program.pass [port# static directory]')
  process.exit()
}

if (process.argv.length != 3 && process.argv.length != 5) {
  usageDie('invalid arguments')
}

sourcePath = path.resolve(process.argv[2])
if (!path.existsSync(sourcePath))
  usageDie('file not found: ' + sourcePath)
if (!path.extname(sourcePath) == 'pass')
  usageDie('Pass programs must have .pass extension.')

if (process.argv.length == 5) {
  port = parseFloat(process.argv[3])
  if (port == Nan) {
    usageDie('invalid port number')
  }
  staticPath = path.resolve(process.argv[4])
  if (!path.existsSync(staticPath))
    usageDie('file not found: ' + staticPath)
}

// function handler (req, res) {
//   fs.readFile(__dirname + '/index.html',
//   function (err, data) {
//     if (err) {
//       res.writeHead(500)
//       return res.end('Error loading index.html')
//     }
//     res.writeHead(200)
//     res.end(data)
//   });
// }

// var app = require('http').createServer(handler).listen(port)