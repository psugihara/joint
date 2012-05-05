var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
var server = {};

server.register = function (callbacks) {
  var conn = this.conn;
  var j;
  j = 0;
  for (i in callbacks) {
    conn[j] = callbacks[i];
    j += 1;
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
    return
  }
  if (oldRoom) {
    var oldRoomMembers;
    oldRoomMembers = conns(oldRoom);
    for (c in oldRoomMembers) {
      oldRoomMembers[c].onLeave(conn.name, oldRoom);
    }
  }
  setTag(conn, newRoom);
  newRoomMembers = conns(newRoom);
  for (c in newRoomMembers) {
    newRoomMembers[c].onEnter(conn.name, newRoom);
  }
};
server.chat = function (message) {
  var conn = this.conn;
  var connections, room;
  room = getTag(conn);
  connections = conns(room);
  for (c in connections) {
    connections[c].receive(conn.name, message);
  }
};

