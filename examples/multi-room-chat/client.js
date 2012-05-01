  var server;
  var connected = false;

  pass.connect(5050, function(remote) {
    server = remote;
    server.register(callbacks);
  });

  var receive = function (name, message) {
    append(name + ' : ' + message + '<br>');
  }

  var onEnter = function (name, room) {
    append(name + ' entered \'' + room + '\'<br>');
  }

  var onLeave = function (name, room) {
    append(name + ' left \'' + room + '\'<br>');
  }

  var append = function (message) {
    var oNewNode = document.createElement("DIV");
    oNewNode.innerHTML = message;
    document.body.appendChild(oNewNode);
  }

  var callbacks = {'receive':receive, 'onEnter':onEnter, 'onLeave':onLeave};

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
