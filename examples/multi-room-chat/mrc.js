var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
var server = {};

server.register = function (callbacks) {
  var conn = this.conn;
  __0 = keys(callbacks);
  for (var __i = 0, __len = __0.length; __i < __len; __i++) {
    conn[__0[__i]] = callbacks[__0[__i]];
  }
};
server.setName = function (name) {
  var conn = this.conn;
  conn.name = name;
};
server.join = function (newRoom) {
  var conn = this.conn;
  var newRoomMembers, broadcast, oldRoom;
  oldRoom = getTag(conn);
  if (oldRoom && oldRoom == newRoom) {
    return;
  }
  if (oldRoom) {
    var oldRoomMembers;
    oldRoomMembers = conns(oldRoom);
    __1 = oldRoomMembers;
    for (var __c = 0, __len = __1.length; __c < __len; __c++) {
      __1[__c].onLeave(conn.name, oldRoom);
    }
  }
  setTag(conn, newRoom);
  broadcast = 0;
  if (agIsLive(oldRoom) || agIsLive(newRoom)) {
    broadcast = 1;
  }
  newRoomMembers = conns(newRoom);
  __2 = newRoomMembers;
  for (var __c = 0, __len = __2.length; __c < __len; __c++) {
    __2[__c].onEnter(conn.name, newRoom);
  }
  if (broadcast) {
    var tags;
    tags = allTags();
    __3 = conns();
    for (var __c = 0, __len = __3.length; __c < __len; __c++) {
      __3[__c].getRooms(tags);
    }
  }
};
server.chat = function (message) {
  var conn = this.conn;
  var connections, room;
  room = getTag(conn);
  connections = conns(room);
  __4 = connections;
  for (var __c = 0, __len = __4.length; __c < __len; __c++) {
    __4[__c].receive(conn.name, message);
  }
};

module.exports = server;
