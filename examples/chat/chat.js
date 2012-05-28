/*jshint node: true*/

var sp = require('spliff');

var server = {};

server.arrive = function (msgCallback) {
  this.conn.onMsg = msgCallback;
};

server.broadcast = function (msg) {
  sp.conns().map(function (c) {
    c.onMsg(msg);
  });
};

module.exports = server;