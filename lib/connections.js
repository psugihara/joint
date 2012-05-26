/*jshint node: true*/

var connLib = {};

var all = [];

var stdlib = require('./stdlib.js');

connLib.onConnect = function(conn) {
  all.push(conn);
};

connLib.onDisconnect = function(conn) {
  var tags = stdlib.getTags(conn);
  for(var t in tags)
    stdlib.popTag(conn, tags[t]);
  all.splice(all.indexOf(conn), 1);
};

connLib.allConns = function() {
  var ret = [];
  for(var c in all)
    ret[c] = all[c];
  return ret;
};

module.exports = connLib;
