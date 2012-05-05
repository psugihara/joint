  var server;
  var connected = false;

  pass.connect(5050, function(remote) {
    server = remote;
    server.register(callbacks);
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
  }

  var onLeave = function (name, room) {
    append(dispName(name) + ' left \'' + room + '\'<br>');
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
      list += " " + rooms[i];
    document.getElementById("rooms").innerHTML = list;
  }

  var callbacks = {'receive':receive, 'onEnter':onEnter, 'onLeave':onLeave, 'getRooms':getRooms};

  var joinRoom = function() {
    var room = document.getElementById('room-name').value;
    document.getElementById('room-name').value = "";
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
