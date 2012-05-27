var sp = require('spliff');

var server = {};

server.register = function (callbacks) {
  for (for key in callbacks) {
    this.conn[key] = callbacks[key];
  }
  this.conn.setRooms(getTags());
};

server.setName = function (name) {
  var conn = this.conn;
  conn.name = name;
};

server.join = function (newRoom) {
  var conn = this.conn;
  var newMembers, broadcast, i, oldRoom;
  oldRoom = getTag(conn);
  if (oldRoom && oldRoom == newRoom) {
    return;
  }
  if (oldRoom) {
    var __1 = conns(oldRoom);
    for (var __c = 0, __1len = __1.length; __c < __1len; __c++) {
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
  var __2 = conns(newRoom);
  for (var __c = 0, __2len = __2.length; __c < __2len; __c++) {
    __2[__c].onEnter(conn.name, newRoom);
    newMembers[i] = __2[__c].name;
    i += 1;
  }
  if (broadcast) {
    var tags;
    tags = getTags();
    var __3 = conns();
    for (var __c = 0, __3len = __3.length; __c < __3len; __c++) {
      __3[__c].getRooms(tags);
    }
  }
  conn.getMembers(newMembers);
};

server.chat = function (message) {
  var conn = this.conn;
  var room;
  room = getTag(conn);
  var __4 = conns(room);
  for (var __c = 0, __4len = __4.length; __c < __4len; __c++) {
    __4[__c].receive(conn.name, message);
  }
};

module.exports = server;
