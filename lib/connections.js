var connLib = {};

var all = [];

var stdlib = require('./stdlib.js');

connLib.onConnect = function(conn) {
  console.log('new client joined');
  all.push(conn);
  console.log('-->total clients: ' + all.length);
}

connLib.onDisconnect = function(conn) {
  console.log('client disconnected');
  var tags = stdlib.getTags(conn);
  for(var t in tags)
    stdlib.popTag(conn, tags[t]);
  all.splice(all.indexOf(conn), 1);
  console.log('-->total clients: ' + all.length);
}

connLib.allConns = function() {
  console.log('allConns called');
  return all;
}

module.exports = connLib;
