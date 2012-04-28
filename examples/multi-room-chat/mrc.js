
var pass = require('pass');
var conns = pass.conns;
var tag = pass.tag;
var tags = pass.tags;
var untag = pass.untag;
var contains = pass.contains;

var server = {};

server.register = function (callbacks) {
  console.log('CONN ID: '+conn.id);
  for(var i in callbacks) {
    conn[i] = callbacks[i];
  }
};

server.setName = function (name) {
  conn.name = name;
};

server.join = function (room) {
  var rooms = tags(conn);
  var r, c;
  for(r in rooms)
    if(r == room) return;
  for(r in rooms) {
    var connections = conns(r);
    for(c in connections) {
      if(conn != connections[c])
        connections[c].onLeave(conn.name, r);
    }
    untag(conn, r);
  }
  tag(conn, room);
  var connections = conns(room);
  for(c in connections)
    connections[c].onEnter(conn.name, room);
};

server.chat = function (message) {
  var name = conn.name;
  var rooms = tags(conn);
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
