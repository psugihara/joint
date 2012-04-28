// Possible generated output for chat.pass.

/*jshint node: true*/

var pass = require('pass')
var conns = pass.conns;
var server = {};

server.arrive = function (msgCallback) {
  this.conn.onMsg = msgCallback;
}

server.broadcast = function (msg) {
  this.conn.onMsg(msg);
  // var connections = conns();
  // for (var c in connections)
  //   connections[c].onMsg(msg);
}

module.exports = server;
