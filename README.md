![image](https://github.com/ptrsghr/Joint/raw/master/docs/images/joint.png)

##Introduction

The recent emergence of the WebSocket protocol has given developers a new tool to deploy dynamic real-time connections and content between the client and server. Unfortunately, the tedious HTTP request/response model that was designed to facilitate the the internet’s early role as a distributed, static file system, has been folded into most libraries that support this new protocol. In order to write a functional real-time web application, a programmer must first learn these older protocols as well as the associated syntax for initializing a server, establishing socket connections, and other verbose functions associated with the traditional client-server architecture. This is tedious, time consuming and now thanks to Joint, not always necessary.

Joint takes care of this repetitive, boilerplate configuration automatically so that the programmer can immediately begin work on the main application logic. The entire network architecture is abstracted into a few intuitive functions that facilitate seamless communication between server and client. Joint also allows functions on the server to be called like any other function on the client, and vice versa. Moreover once these connections are established, Joint provides convenient functions to help organize, search through, and keep track of them.


##Installation
Joint requires *node.js* and *npm*. Once you have these dependencies, simply:


	npm install joint -g


##Logger

To give a peek at the power and simplicity of Joint, we first present a simple connection logger. Our logger program will write to stdout when a new user connects.

####Server
Joint allows us to write functions on the server which can be called from the client HTML as if they were included in the client side code. These functions run on the server but in a bit, we’ll show you how easy it is to get the results back in the client. The following two lines are the entire code listing for our *logger.js* program.

	
	var server = {};
	
	server.arrive = function (name) {
	    console.log(name + " arrived");
	};
	
	module.exports = server;


The first line creates the server object. The `server` object contains methods to be called by the client. Next, the assignment maps the key `arrive` to a function that prints the client's name to *stdout*. Lastly, we always export the server object to be used by Joint.

####Client
The client side code in our modified *index.html* will import Joint's client-side library,  *pass.js*, and call the function we just defined on our server. The full code listing is as follows.


    <script src=/pass.js></script>
    <script>
      pass.connect(function (server) {
        server.arrive(prompt(“Hi, what’s your name?”));
      });
    </script>


The script *pass.js* is automatically generated and served by the Joint server. Including it and calling `pass.connect()` passes functions in the server dictionary to the client so that we can call `arrive()` in the client-side JavaScript. The connection function takes a callback function with `server` as an argument. This function is called when the connection is successfully established. Before `arrive()` is called, the user will be prompted to enter their name as the argument so that we know who they are on the server.

####Run it!
With this index.html in the *static* directory, we can have the server start listening on port 8080 just as we did in the previous example:


	$ joint logger.js 8080 static


If we visit [http://localhost:8080/](http://localhost:8080/) and enter our name, `ourName arrived` will be printed on the console. We can record the activity log by routing stdout to a file: 


	$ joint logger.js 8080 static > activity.log


We’ve created a simple activity logger with just five lines of server code! One could imagine extending this example to collect analytics about user activity in real-time. For instance, perhaps each button press in a single-page web app could be logged in order to evaluate the effectiveness of a user interface.

##Real-time chat: *conn*, *conns()*, and callbacks

Hopefully, the last example illuminated the power and ease of exposing server-side functions to client-side scripts. But Joint isn’t just for one-way communication. To show just how useful Joint can be for real-time bidirectional client-server interactions, we now present a simple chat server. The chat server will allow clients to broadcast messages to all registered users.

####Server
In our application, when a client application connects to the server, it registers with a callback function to let the server know how to contact it. When a client sends a message, the server iterates through all connected clients, calling the callback function that was passed to it by each connection. The code listing for our new *chat.js* file is shown below.

	var joint = require('joint');
	
	var server = {};
	
	server.arrive = function (msgCallback) {
	  this.conn.onMsg = msgCallback;
	};
	
	server.broadcast = function (msg) {
	  joint.conns().map(function (c) {
	    c.onMsg(msg);
	  });
	};
	
	module.exports = server;
    
The first function takes a single argument,  `msgCallback` that is added as a value to the dictionary `conn` with key `“onMsg”`. Like `server`, `this.conn` is a special object. Joint maintains a `conn` object for each client connection. This object is intended to store client-specific information (such as a usernames and callbacks). The `this.conn` may be used within the body of an exposed `server` function to reference the object of the client that invoked the function. Here we register a callback function by which the Joint program can send a message back to the client. Notice that functions can be assigned or passed as function arguments just as a string or number can be.

The second function also takes a single argument, `msg` which is a string to send to all other connected clients. The built in function `conns()` returns an array containing all of the conn objects for connected clients. Here we use `conns().map()` to call the `onMsg` callback on each client. Finally, we again export the `server` object to be used by Joint.


####Client 
The bare bones GUI will consist of a text input box and a submit button. When the submit button is clicked, the client will broadcast the string in the text box then clear the text box. The full code listing for the client file *index.html* is below.

    <input id="msgInput">
    <input type="submit" onClick="send()">
    
    <script src="pass.js"></script>
    <script>
        var inputBox = document.getElementById("msgInput");
        var send;
        pass.connect(function (server) {
          send = function () {
            server.broadcast(inputBox.value); // broadcast input
            inputBox.value = ""; // clear text box       
          }
          function rcv(msg) {
            console.log(msg);
          }
          server.arrive(rcv); // register rev callback
        });
    </script>

We assume basic familiarity with JavaScript and HTML but again there are a few important lines specific to Joint that the reader should note. Namely, the first `script` tag includes the client side *pass.js* file which gives access to `server` functions inside of `pass.connect()`'s callback.

####Chat!
This program can be run in the same matter as the previous example. Try opening the page in two browser windows and watch as your chat instantly appears in the console of one after you send it from the other.

###Why callbacks?
An astute reader may have noticed that our `server` functions never "return" values. Rather they are written in a continuation-passing style. A callback function is passed to the server which passes results as arguments to the callback function when it is done with the computation. This style, which should be familiar to JavaScript programmers who have written event-oriented user interfaces, has a number of advantages. For instance, without "return" values, it impossible to make blocking calls to the server.

As a quick exercise, consider the difference between the following two JavaScript snippets.

	// Snippet 1:
	var x = hardWork();
	Console.log("Ready for more work!");

	// Snippet 2:
	var x;
	hardWorkAsync(function(result) { x = result; });
	Console.log("Ready for more work!");


Can you predict the difference in output? The first piece of code will block on the first line, waiting for `hardWork()` to return a value for the assignment before it prints to the console. In the second snippet, `x` is instantiated then `hardWorkAsync()` is called with a callback function as an argument. However, the interpreter does not wait for the function to complete or the assignment to occur before immediately printing to the console.

In this way, control flow is synchronous but function calls are asynchronous. Since JavaScript executes on single threads, waiting for a value to return from a function call will inevitable block the next statement from being executed. This is especially apparent with the *remote* function calls due to the reality of network latency.

##Publish-subscribe: grouping connections with *tags*
What if we only want to broadcast certain things to certain clients? In our final example, we will show you how to create a simple [Publish-Subscribe](http://en.wikipedia.org/wiki/Publish–subscribe_pattern) server that allows clients to listen on and broadcast to different channels.

You're probably wondering how we can write such an application in a reasonable amount of lines, and without tedious implementation of lots of data structures. Client grouping is usually a critical component when building scalable web applications. Conveniently, this functionality is provided by the Joint library.

First, we create an exposed function that serves two purposes: it subscribes the client to the specified channel, and stores the client’s handler for receiving messages in the client connection dictionary. We subscribe a client to a group through the use of the `pushTag()` function, which takes two arguments: the `conn` dictionary of the client, and the group name (a string).

    server.subscribe = function (channel, onMsg) {
      joint.pushTag(this.conn, channel);
      this.conn.onMsg = onMsg;
    };

We then create an exposed function that allows a client to publish a message to a channel:

    server.publish = function (message, channel) {
      conns(channel).map(function (c) {
        c.onMsg(message);
      });
    };

You've seen the `conns()` function before--when called with no parameter, it returns an array of all client `conn` dictionaries. When a group name is provided as a parameter, it returns the array of client `conn` dictionaries that are tagged with the group name.

Also, note that with the above implementation of `publish()`, we have the option to not specify a channel, in which case the function broadcasts to all open channels on the server.

Finally, we can unsubscribe a client from a specified channel or, if no channel is specified, all channels to which the client is subscribed. We do this by calling the `popTag()` function as shown:

    server.unsubscribe = function (channel) {
      if (channel)
        popTag(this.conn, channel);
      else
      	channels(this.conn).map(function (c) {
          popTag(this.conn, c);
      	});       
    };

With these functions, we have written a fully functional Publish-Subscribe server in under 20 lines of JavaScript.

##Conclusion

Hopefully, this tutorial has given you a good feel for what kinds of applications are best suited for Joint, and how few lines of code are required to build them. With some luck you should be able to have a simple application of your own up and running in just minutes. We hope you will enjoy using Joint as much as we enjoyed designing it!
