// ###Pass built in functions
// TODO: Comment the shit out of these.

var stdlib = {};
var groups = {};

var contains = function (arr, obj) {
  return arr.indexOf(obj) >= 0;
}


//*****BEGIN MULTIPLE TAGS API*****

//adds a tag to the connection
var pushTag = function (conn, name) {
  //console.log('pushTag ' + conn.name + ' ' + name);

  //initialize tags if necessary
  if(!Boolean(conn.tags))
    conn.tags = [];

  //no duplicates allowed
  else if(contains(conn.tags, name))
    return;

  //add tag to connection's tags
  conn.tags.push(name);

  //initialize group for the tag if necessary
  if(!Boolean(groups[name]))
    groups[name] = [];

  //add the connection to the group
  groups[name].push(conn);
}

//removes a tag from the connection
var popTag = function (conn, tag) {
  //console.log('popTag ' + conn.name + ' ' + tag);

  //if no tag specified, return
  if(!tag) return;

  console.log('passed first check');

  //if the connection does not have the tag, return
  if(!Boolean(conn.tags) || !contains(conn.tags, tag)) return;
  
  console.log('passed checks');

  //remove the tag from the connection's tags
  conn.tags.splice(conn.tags.indexOf(tag), 1);

  //remove the connection from the group for the tag
  groups[tag].splice(groups[tag].indexOf(conn), 1);

  //if the group is empty, remove it from open groups
  if(groups[tag].length == 0) {delete groups[tag]; console.log('deleted room "'+tag+'"');}
}

//returns the array of tags for a connection
var getTags = function (conn) {
  if(!conn) return;
  var r = [];
  for(var t in conn.tags)
    r[t] = conn.tags[t];
  return r;
}

//*****END MULTIPLE TAGS API*****


//*****BEGIN SINGLE TAG API*****

//sets the sole tag of the connection to the name
//specified, removing all other tags if necessary
var setTag = function(conn, name) {
  //console.log('setTag ' + conn + ' ' + name);

  //return if tag is already set to 'name'
  if(getTag(conn) == name) return;

  //remove all other tags
  clearTags(conn);

  //add the new tag
  pushTag(conn, name);
}

//returns the first tag in the connection's tag array
var getTag = function(conn) {
  //console.log('getTag ' + conn);

  //if 
  if(!conn.tags || conn.tags.length == 0) {
     //console.log('--> returns null');
     return null;
  }
  //console.log('-->returns "' + conn.tags[0] + '"');
  return conn.tags[0];
}

//*****END SINGLE TAG API*****


//*****BEGIN UNIVERSAL FUNCTIONS*****

//clears all tags for the connection
var clearTags = function(conn) {
  var tags;
  while((tags = getTags(conn)).length > 0)
    popTag(conn, tags[0]);
}

//returns all tags presently associated
//with at least one connection
var allTags = function () {
  var tags = [];
  for(var t in groups)
    tags.push(t);
  return tags;
}

//returns all connections associated with the tag
var conns = function (tag) {
  if(conns.arguments.length > 0)
    if(Boolean(groups[tag]))
      return groups[tag];
    else
      return [];
  return connections.allConns();
}

//tests to see if a connection has a tag
var hasTag = function(conn, tag) {
  return contains(conn.tags, tag);
}

//*****END UNIVERSAL FUNCTIONS*****

var keys = function(arr) {
  var ret = [];
  for (var i in arr)
    ret.push(i);
  return ret;
}

stdlib.contains = contains;

stdlib.getTags = getTags;
stdlib.pushTag = pushTag;
stdlib.popTag = popTag;

stdlib.setTag = setTag;
stdlib.getTag = getTag;

stdlib.clearTags = clearTags;
stdlib.allTags = allTags;
stdlib.conns = conns;
stdlib.hasTag = hasTag;

stdlib.keys = keys;

module.exports = stdlib;

var connections = require('./connections.js');
