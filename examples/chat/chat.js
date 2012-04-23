// Possible generated output for chat.pass.

/*jshint node: true*/

var server = {};

server.arrive = function (msgCallback) {
  conn.onMsg = msgCallback;
}

server.broadcast = function (msg) {
  for c in conns()
    c.onMsg(msg)
}

exports.server = server;