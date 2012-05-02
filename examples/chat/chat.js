17
17
17
var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
server = {};

server.arrive = function (msgCallback) {
  conn.onMsg = msgCallback;
};
server.broadcast = function (msg) {
  for (c in conns()) {
    console.log(conns()[c]);
    conns()[c].onMsg(msg);
  }
};

module.exports = server;
