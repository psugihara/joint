var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
var server = {};

server.register = function (callbacks) {
  var conn = this.conn;
  __tmp = keys(callbacks);
  for (var __i = 0, __len = keys(callbacks).length; __i < __len; __i++) {
    conn[__tmp[__i]] = callbacks[__tmp[__i]];
  }
};
server.setName = function (name) {
  var conn = this.conn;
  conn.name = name;
};
server.join = function (newRoom) {
  var conn = this.conn;
  var newRoomMembers, oldRoom;
  oldRoom = getTag(conn);
  if (oldRoom && oldRoom == newRoom) {
    return;
  }
  if (oldRoom) {
    var oldRoomMembers;
    oldRoomMembers = conns(oldRoom);
    __tmp = oldRoomMembers;
    for (var __c = 0, __len = oldRoomMembers.length; __c < __len; __c++) {
      __tmp[__c].onLeave(conn.name, oldRoom);
    }
  }
  setTag(conn, newRoom);
  newRoomMembers = conns(newRoom);
  __tmp = newRoomMembers;
  for (var __c = 0, __len = newRoomMembers.length; __c < __len; __c++) {
    __tmp[__c].onEnter(conn.name, newRoom);
  }
};
server.chat = function (message) {
  var conn = this.conn;
  var connections, room;
  room = getTag(conn);
  connections = conns(room);
  __tmp = connections;
  for (var __c = 0, __len = connections.length; __c < __len; __c++) {
    __tmp[__c].receive(conn.name, message);
  }
};

module.exports = server;
