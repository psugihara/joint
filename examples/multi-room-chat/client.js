  var server;
  var connected = false;

  pass.connect(5050, function(remote) {
    server = remote;
    
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
    server.log('joinroomcalled');
    var room = document.getElementById('room-name').value;
    server.log(room + ', ' + room.length);
    if(room.length > 0)
      server.join(room);
  }

  var sendMessage = function() {
    var message = document.getElementById('chat-message').value;
    if(message.length > 0)
      server.chat(message);
  }

  var setName = function() {
    var name = document.getElementById('name').value;
    if(name.length > 0)
      server.setName(name);
  }

  setTimeout(function() {
    server.register(callbacks);
  }, 1000);
