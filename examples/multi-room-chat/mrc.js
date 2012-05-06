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
  conn.getRooms(getTags());
}
;
server.setName = function (name) {
  var conn = this.conn;
  conn.name = name;
}
;
server.join = function (newRoom) {
  var conn = this.conn;
  var newMembers, broadcast, i, oldRoom;
  oldRoom = getTag(conn);
  if (oldRoom && oldRoom == newRoom) {
    return;
  }
  if (oldRoom) {
    __1 = conns(oldRoom);
    for (var __c = 0, __len = __1.length; __c < __len; __c++) {
      __1[__c].onLeave(conn.name, oldRoom);
    }
  }
  broadcast = 0;
  if (!tagIsLive(newRoom)) {
    broadcast = 1;
  }
  setTag(conn, newRoom);
  if (!tagIsLive(oldRoom)) {
    broadcast = 1;
  }
  newMembers = [];
  i = 0;
  __2 = conns(newRoom);
  for (var __c = 0, __len = __2.length; __c < __len; __c++) {
    __2[__c].onEnter(conn.name, newRoom);
    newMembers[i] = __2[__c].name;
    i += 1;
  }
  if (broadcast) {
    var tags;
    tags = getTags();
    __3 = conns();
    for (var __c = 0, __len = __3.length; __c < __len; __c++) {
      __3[__c].getRooms(tags);
    }
  }
  conn.getMembers(newMembers);
}
;
server.chat = function (message) {
  var conn = this.conn;
  var room;
  room = getTag(conn);
  __4 = conns(room);
  for (var __c = 0, __len = __4.length; __c < __len; __c++) {
    __4[__c].receive(conn.name, message);
  }
}
;

module.exports = server;
