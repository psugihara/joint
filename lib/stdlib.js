// ###Pass built in functions
// TODO: Comment the shit out of these.

var stdlib = {};
var groups = {};

var contains = function (arr, obj) {
  for(var i in arr)
    if(arr[i] == obj)
      return true;
  return false;
};

var tag = function (connection, name) {
  console.log('tag: ' + connection + ' ' + name);
  if(contains(connection.tags, tag)) return;
  if(!Boolean(connection.tags))
    connection.tags = [];
  if(!contains(connection.tags, name)) {
    connection.tags.push(name);
    if(!Boolean(groups[name]))
      groups[name] = [];
    groups[name].push(connection);
  }
};

var untag = function (connection, tag) {
  console.log('untag ' + connection + ' ' + tag);
  if(!contains(connection.tags, tag)) return;
  connection.tags.splice(connection.tags.indexOf(tag), 1);
  groups[tag].splice(groups[tag].indexOf(connection), 1);
  for(var i in groups[tag])
    console.log('  '+groups[tag][i].name);
};

var tags = function (connection) {
  console.log('tags: ' + connection);
  return connection.tags;
};

var conns = function (tag) {
  console.log('conns: ' + tag); 
  if(tag)
    return groups[tag];
  else
    return all;
};

stdlib.contains = contains;
stdlib.tag = tag;
stdlib.tags = tags;
stdlib.untag = untag;
stdlib.conns = conns;

module.exports = stdlib;
