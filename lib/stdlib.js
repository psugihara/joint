/*jshint node: true*/

var stdlib = {};
var groups = {};

//*****BEGIN MULTIPLE TAGS API*****

//adds a tag to the connection
stdlib.pushTag = function (conn, name) {
  
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
};

//removes a tag from the connection
stdlib.popTag = function (conn, tag) {

  //if no tag specified, return
  if(!tag) return;

  //if the connection does not have the tag, return
  if(!Boolean(conn.tags) || !contains(conn.tags, tag)) return;
  
  //remove the tag from the connection's tags
  conn.tags.splice(conn.tags.indexOf(tag), 1);

  //remove the connection from the group for the tag
  groups[tag].splice(groups[tag].indexOf(conn), 1);

  //if the group is empty, remove it from open groups
  if(groups[tag].length === 0) 
    delete groups[tag];
};

//returns the array of tags for a connection
stdlib.getTags = function (conn) {
  if(arguments.length === 0)
    return this.allTags();
  var r = [];
  for(var t in conn.tags)
    r[t] = conn.tags[t];
  return r;
};

//*****END MULTIPLE TAGS API*****


//*****BEGIN SINGLE TAG API*****

//sets the sole tag of the connection to the name
//specified, removing all other tags if necessary
stdlib.setTag = function(conn, name) {
  
  //return if tag is already set to 'name'
  if(this.getTag(conn) === name && this.getTags(conn).length === 1) return;

  //remove all other tags
  this.clearTags(conn);

  //add the new tag
  this.pushTag(conn, name);
};

//returns the first tag in the connection's tag array
stdlib.getTag = function(conn) {
  if(!conn.tags || conn.tags.length === 0)
     return null;
  return conn.tags[0];
};

//*****END SINGLE TAG API*****


//*****BEGIN UNIVERSAL FUNCTIONS*****

//clears all tags for the connection
stdlib.clearTags = function(conn) {
  var tags;
  while((tags = this.getTags(conn)).length > 0)
    this.popTag(conn, tags[0]);
};

//tests to see if any client has the specified tag
var tagIsLive = function(tag) {
  return contains(this.allTags(), tag);
};

//returns array-like object containing all connections associated with the tag
stdlib.conns = function (tag) {
  var ret = [];
  if(arguments.length > 0) {
    if(Boolean(groups[tag])) {
      for(var c in groups[tag])
        ret.push(groups[tag][c]);
    }
  } else {
    ret = connections.allConns();
  }

  return ret;
};

//tests to see if a connection has a tag
stdlib.hasTag = function(conn, tag) {
  return contains(conn.tags, tag);
};

//returns all tags presently associated
//with at least one connection
stdlib.allTags = function () {
  var tags = [];
  for(var t in groups)
    tags.push(t);
  return tags;
};

//*****END UNIVERSAL FUNCTIONS*****

module.exports = stdlib;

var connections = require('./connections.js');

//*****PRIVATE FUNCTIONS BELOW*****

var contains = function (arr, obj) {
  return arr.indexOf(obj) >= 0;
};
