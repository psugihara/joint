  var server;
  var connected = false;

  pass.connect(function(remote) {
    server = remote;
    server.register(callbacks);
    var name = "";
    do {
    name =  prompt("Please enter your name:");
    } while (name == null || name.length == 0);
    server.setName(name);
  });

  var dispName = function(name) {
    if(Boolean(name))
      return name;
    return "[anonymous]";
  }

  var receive = function (name, message) {
    append(dispName(name) + " : " + message);
  }

  var onEnter = function (name, room) {
    append(dispName(name) + ' entered \'' + room + '\'<br>');
    var members = document.getElementById('members').innerHTML;
    document.getElementById('members').innerHTML = members + " " + name;
  }

  var onLeave = function (name, room) {
    append(dispName(name) + ' left \'' + room + '\'<br>');
    var members = document.getElementById('members').innerHTML;
    var i = members.indexOf(name);
    members = members.slice(0, i) + members.slice(i + name.length);
    document.getElementById('members').innerHTML = members;
  }

  var append = function (message) {
    var oNewNode = document.createElement("DIV");
    oNewNode.innerHTML = message;
    var x = document.getElementById("messages");
    x.appendChild(oNewNode);
    x.scrollTop = x.scrollHeight;
  }

  var getRooms = function(rooms) {
    var list = "";
    for(var i in rooms)
      list += "  " + rooms[i];
    document.getElementById("rooms").innerHTML = list;
  }

  var getMembers = function(members) {
    var list = "";
    for(var i in members)
      list += "  " + members[i];
    document.getElementById("members").innerHTML = list;
  }

  var callbacks = {'receive':receive, 'onEnter':onEnter, 'onLeave':onLeave, 'getRooms':getRooms, 'getMembers':getMembers};

  var joinRoom = function() {
    var room = document.getElementById('room-input').value;
    if(room.length == 0) return;
    document.getElementById('room-input').value = "";
    document.getElementById('members-label').style.color = "blue";
    document.getElementById('room-name').style.color = "red";
    document.getElementById('room-name').innerHTML = room;
    if(room.length > 0)
      server.join(room);
  }

  var sendMessage = function() {
    var message = document.getElementById('chat-message').value;
    document.getElementById('chat-message').value = "";
   if(message.length > 0)
      server.chat(message);
  }

  var setName = function() {
    var name = document.getElementById('name').value;
    document.getElementById('name').value = "";
    if(name.length > 0)
      server.setName(name);
  }
