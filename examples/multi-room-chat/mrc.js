
var pass = require('pass');

for (var x in pass) {
  global[x] = pass[x];
}

var server = {};

server.register = function (callbacks) {
  for(var i in callbacks) {
    this.conn[i] = callbacks[i];
  }
};

server.setName = function (name) {
  this.conn.name = name;
};

server.join = function (newRoom) {
  var oldRoom = getTag(this.conn);
  if(oldRoom && oldRoom == newRoom) return;
  if(oldRoom) {
    var oldRoomMembers = conns(oldRoom);
    for(var c in oldRoomMembers)
      oldRoomMembers[c].onLeave(this.conn.name, oldRoom);
  }
  setTag(this.conn, newRoom);
  var newRoomMembers = conns(newRoom);
  for(var c in newRoomMembers)
    newRoomMembers[c].onEnter(this.conn.name, newRoom);
};

server.chat = function (message) {
  var room = getTag(this.conn);
  var connections = conns(room);
  for(var c in connections)
    connections[c].receive(this.conn.name, message);
};

server.log = function (message) {
  console.log(message);
};

module.exports = server;
