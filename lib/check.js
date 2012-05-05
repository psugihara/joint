var lib = require('./stdlib.js');

var conn = {tags: ['x', 'y', 'z', 'a']};

console.log(conn);

lib.popTag(conn, 'y');
