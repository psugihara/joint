
var pass = require('pass');
var conns = pass.conns;
var tag = pass.tag;
var tags = pass.tags;
var untag = pass.untag;
var contains = pass.contains;

var server = {};

server.register = function (callbacks) {
  console.log('CONN ID: '+this.conn.id);
  for(var i in callbacks) {
    this.conn[i] = callbacks[i];
  }
};

server.setName = function (name) {
  this.conn.name = name;
};

server.join = function (room) {
  var rooms = tags(this.conn);
  var r, c;
  for(r in rooms)
    if(r == room) return;
  for(r in rooms) {
    var connections = conns(rooms[r]);
    for(c in connections) {
      if(this.conn != connections[c])
        connections[c].onLeave(this.conn.name, rooms[r]);
    }
    untag(this.conn, rooms[r]);
  }
  tag(this.conn, room);
  var connections = conns(room);
  for(c in connections)
    connections[c].onEnter(this.conn.name, room);
};

server.chat = function (message) {
  var name = this.conn.name;
  var rooms = tags(this.conn);
  console.log('tags for '+name+': '+rooms);
  for(var i in rooms) {
    var connections = conns(rooms[i]);
    for(var c in connections)
      connections[c].receive(name, message);
  }
};

server.log = function (message) {
  console.log(message);
};

module.exports = server;
