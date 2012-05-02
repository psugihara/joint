var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
var server = {};

server.arrive = function (msgCallback) {
  var conn = this.conn;
  conn.onMsg = msgCallback;
};
server.broadcast = function (msg) {
  var conn = this.conn;
  for (c in conns()) {
    console.log(conns()[c]);
    conns()[c].onMsg(msg);
  }
};

module.exports = server;
