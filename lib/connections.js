var connLib = {};

var all = [];

var stdlib = require('stdlib');

connLib.onConnect = function(conn) {
  all.push(conn);
}

connLib.onDisconnect = function(conn) {
  var tags = stdlib.tags(conn);
  for(var t in tags)
    stdlib.untag(conn, t);
  all.splice(all.indexOf(conn), 1);
}

module.exports = connLib;
