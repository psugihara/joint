/**
 * -----------------------------------------------------------------------------
 * author: Nicolo Pizzoferrato
 * contributors:
 * stdLibTests.js
 * Test suite for the standard library.
 *------------------------------------------------------------------------------
 */


var lib = require('../../lib/stdlib.js');
var con = require('../../lib/connections.js');

var c1 = {name: 'client1'};
var c2 = {name: 'client2'};

var die = function(message) {
  console.log(message);
  process.exit();
}

var array_eql = function(arr1, arr2) {
  console.log('array_eql called:')
  console.log('-->' + arr1);
  console.log('-->' + arr2);
  if(arr1.length != arr2.length) return false;
  for (var i in arr1) {
    if(arr1[i] != arr2[i])
      return false;
  }
  return true;
}

con.onConnect(c1);
if(!array_eql(lib.conns(), [c1]))
  die('failed to add new client to all conns');

lib.pushTag(c1, 'x');
if(!array_eql(lib.getTags(c1), ['x']))
  die('failed to tag "x" to client 1');
if(!array_eql(lib.allTags(), ['x']))
  die('failed to add "x" to allTags');
if(lib.getTag(c1) != 'x')
  die('getTag returned improper value');
if(!array_eql(lib.conns('x'), [c1]))
  die('conns("x") failed after push');

lib.pushTag(c1, 'y');
if(!array_eql(lib.getTags(c1), ['x' , 'y']))
  die('failed to add tag "y" to client 1');
if(!array_eql(lib.allTags(), ['x', 'y']))
  die('failed to add "y" to allTags');

lib.popTag(c1, 'x');
if(!array_eql(lib.getTags(c1), ['y']))
  die('popTag failed, array output: ' + lib.getTags(c1));
if(!array_eql(lib.allTags(), ['y']))
  die('allTags returned incorrect value after popTag');
if(Boolean(lib.conns('x')))
  die('conns("x") returned bad value (should evaluate to false');
if(!array_eql(lib.conns('y'), [c1]))
  die('conns("y") failed after popTag');

lib.setTag(c1, 'z');
if(!array_eql(lib.getTags(c1), ['z'])) {console.log(lib.getTags(c1));
  die('setTag did not change tags as specified');}
if(!array_eql(lib.allTags(), ['z']))
  die('allTags were not updated after setTag');
if(!array_eql(lib.conns('z'), [ c1 ]))
  die('conns("z") returned wrong value');

con.onConnect(c2);
lib.setTag(c2, 'z');
if(!array_eql(lib.conns('z'), [c1 , c2]))
  die('conns("z") returned wrong value after c2 joined');
if(!array_eql(lib.allTags(), ['z']))
  die('allTags returned incorrect value after setTag');

lib.pushTag(c1, 'x');
lib.pushTag(c1, 'y');
if(!array_eql(lib.getTags(c1), ['z', 'x', 'y']))
  die('pushTags failed');
if(!array_eql(lib.allTags(), ['z', 'x', 'y']))
  die('allTags returned incorrect value after re-pushing');

if(lib.hasTag(c1, 'n'))
  die('hasTag false positive');
if(!lib.hasTag(c1, 'x'))
  die('hasTag false negative');

if(!array_eql(lib.conns('z'), [c1, c2]))
  die('conns("z") returned wrong value with both clients');
if(!array_eql(lib.conns(), [c1, c2]))
  die('conns with no params returned wrong value');
if(Boolean(lib.conns('n')))
  die('conns with empty tag set returned value: ' + lib.conns('n'));

lib.clearTags(c1);
if(Boolean(lib.getTag(c1)))
  die('clearTags failed, returned ' + lib.getTag(c1));

lib.clearTags(c2);
if(!array_eql(lib.allTags(), []))
  die('allTags returned incorrect value after clearTags');

die('all tests passed successfully!');
