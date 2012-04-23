// ###Pass built in functions
// TODO: Comment the shit out of these.

var stdlib;

var groups = {};

stdlib.contains = function (arr, obj) {
  for(var i in arr)
    if(arr[i] == obj)
      return true;
  return false;
};

stdlib.tag = function (connection, name) {
  console.log('tagging '+connection.name+' with tag '+name);
  if(!Boolean(connection.tags))
    connection.tags = [];
  if(!contains(connection.tags, name)) {
    connection.tags.push(name);
    if(!Boolean(groups[name]))
      groups[name] = [];
    groups[name].push(connection);
    console.log('members of group '+name+':');
    for(var i in groups[name])
      console.log('  '+groups[name][i].name);
  }
};

stdlib.untag = function (connection, tag) {
  console.log('untagging '+connection.name+' with tag '+tag);
  connection.tags.splice(connection.tags.indexOf(tag), 1);
  groups[tag].splice(groups[tag].indexOf(connection), 1);
  console.log('members of group '+tag+':');
  for(var i in groups[tag])
    console.log('  '+groups[tag][i].name);
};

stdlib.tags = function (connection) {
  return connection.tags;
};

stdlib.conns = function (tag) {
  console.log('members of group '+tag+':');
  for(var i in groups[tag])
    console.log('  '+groups[tag][i].name);
  return groups[tag];
};

stdlib.register = function (callbacks) {
  console.log('CONN ID: '+conn.id);
  for(var i in callbacks) {
    conn[i] = callbacks[i];
  }
};

stdlib.setName = function (name) {
  conn.name = name;
};

stdlib.join = function (room) {
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

stdlib.chat = function (message) {
  var name = conn.name;
  var rooms = tags(conn);
  console.log('tags for '+name+': '+rooms);
  for(var i in rooms) {
    var connections = conns(rooms[i]);
    for(var c in connections)
      connections[c].receive(name, message);
  }
};

stdlib.log = function (message) {
  console.log(message);
};

exports = stdlib;