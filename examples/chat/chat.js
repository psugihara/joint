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
  var __0 = conns();
  for (var __c = 0, __0len = __0.length; __c < __0len; __c++) {
    console.log(__0[__c]);
    __0[__c].onMsg(msg);
  }
};

module.exports = server;
