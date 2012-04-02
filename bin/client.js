

  var server;

  DNode.connect(5050, function(remote) {
    server = remote;
  });

  var callback = function (name, message) {
    console.log(name + ': ' + message);
  }
