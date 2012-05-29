/*jshint node: true*/

var joint = require('joint');

var server = {};

server.arrive = function (msgCallback) {
  this.conn.onMsg = msgCallback;
};

server.broadcast = function (msg) {
  joint.conns().map(function (c) {
    c.onMsg(msg);
  });
};

module.exports = server;
