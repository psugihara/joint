/*jshint node: true*/

_ = require('underscore');

var stdlib = {};
var groups = {};

//*****BEGIN MULTIPLE TAGS API*****

//adds a tag to the connection
var pushTag = function (conn, name) {
  
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
var popTag = function (conn, tag) {

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
var getTags = function (conn) {
  if(arguments.length === 0)
    return allTags();
  var r = [];
  for(var t in conn.tags)
    r[t] = conn.tags[t];
  return r;
};

//*****END MULTIPLE TAGS API*****


//*****BEGIN SINGLE TAG API*****

//sets the sole tag of the connection to the name
//specified, removing all other tags if necessary
var setTag = function(conn, name) {
  
  //return if tag is already set to 'name'
  if(getTag(conn) === name && getTags(conn).length === 1) return;

  //remove all other tags
  clearTags(conn);

  //add the new tag
  pushTag(conn, name);
};

//returns the first tag in the connection's tag array
var getTag = function(conn) {
  if(!conn.tags || conn.tags.length === 0)
     return null;
  return conn.tags[0];
};

//*****END SINGLE TAG API*****


//*****BEGIN UNIVERSAL FUNCTIONS*****

//clears all tags for the connection
var clearTags = function(conn) {
  var tags;
  while((tags = getTags(conn)).length > 0)
    popTag(conn, tags[0]);
};

//tests to see if any client has the specified tag
var tagIsLive = function(tag) {
  return contains(allTags(), tag);
};

//returns array-like object containing all connections associated with the tag
var conns = function (tag) {
  var ret = [];
  if(arguments.length > 0) {
    if(Boolean(groups[tag])) {
      for(var c in groups[tag])
        ret.push(groups[tag][c]);
    }
  } else {
    ret = connections.allConns();
  }

  // Backbone methods to attach to the conns array.
  var methods = ['forEach', 'each', 'map', 'reduce', 'reduceRight', 'find',
  'detect', 'filter', 'select', 'reject', 'every', 'all', 'some', 'any',
  'include', 'contains', 'invoke', 'max', 'min', 'sortBy', 'sortedIndex',
  'toArray', 'size', 'first', 'initial', 'rest', 'last', 'without', 'indexOf',
  'shuffle', 'lastIndexOf', 'isEmpty', 'groupBy'];

  _.each(methods, function(method) {
    ret[method] = function() {
      return _[method].apply(_, [ret].concat(_.toArray(arguments)));
    };
  });

  return ret;
};

//tests to see if a connection has a tag
var hasTag = function(conn, tag) {
  return contains(conn.tags, tag);
};

//returns all tags presently associated
//with at least one connection
var allTags = function () {
  var tags = [];
  for(var t in groups)
    tags.push(t);
  return tags;
};

//*****END UNIVERSAL FUNCTIONS*****

stdlib.getTags = getTags;
stdlib.pushTag = pushTag;
stdlib.popTag = popTag;

stdlib.setTag = setTag;
stdlib.getTag = getTag;

stdlib.clearTags = clearTags;
stdlib.tagIsLive = tagIsLive;
stdlib.conns = conns;
stdlib.hasTag = hasTag;
stdlib.allTags = allTags;

module.exports = stdlib;

var connections = require('./connections.js');


//*****PRIVATE FUNCTIONS BELOW*****

var contains = function (arr, obj) {
  return arr.indexOf(obj) >= 0;
};
