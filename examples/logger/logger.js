// Possible generated output for logger.pass.
// server.arrive = (name) ~
//   log(name + “ arrived”)
/*jshint node: true*/

var server = {};

server.arrive = function (name) {
    console.log(name + " arrived");
};

exports.server = server;