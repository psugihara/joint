// ###Pass built in functions
// TODO: Comment the shit out of these.

var stdlib = {};
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

module.exports = stdlib;
