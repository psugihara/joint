Pass Language Tutorial
======================

##Introduction

With the recent emergence of WebSockets, developers now have a protocol which is built for two-way communication between the client and server. Unfortunately, the tedious HTTP request/response model that was designed to facilitate a main function of the internet’s early origins as a distributed, static file system of one-way communications has been folded into most libraries that support this new protocol. As a result, in order to write a functional real-time web application, a programmer must first learn these older protocols and the associated syntax for initializing a server, establishing socket connections, and other verbose functions associated with the traditional client-server architecture. 

With the development of the Pass language, however, this repetitive, boilerplate configuration is taken care of by default so that the programmer may immediately begin work on the main application logic. The entire network architecture is abstracted into a few intuitive functions that facilitate easy, seamless communication between server and client. Pass also allows for exposure of functions on the server to be called like any other function on the client, and vice versa.

The following is a brief introduction to these features as well as other nuances that the Pass language has to offer to the future of programming. We will not cover every detail of the language at this time. However, we will bring to light everything that is required to get a programmer moving in the right direction so that he/she may reach the most important stage that is development of logic and application in a hassle-free, significantly reduced amount of time.

###Audience

The Pass language will prove useful to anyone who wants to write web applications that require real-time client-server communication. It is assumed that the reader of this document has some experience building interactive websites using JavaScript and HTML but knowledge of another server side language, or even experience with server-dependent applications, is not required.

##Hello world: writing to stdout

We begin with the obligatory Hello World program, hello.pass:

```
log("Hello world!")
```

The built in function `log()` writes a string to stdout. String literals such as `"Hello world!"` above are always enclosed in double quotes. Lines are generally terminated with newline characters.

Assuming the Pass interpreter is in the user's path and we are in the same directory as *hello.pass*, we may now run our program from the command line with `$ pass ./hello.pass` (omitting the dollar sign).

The line `Hello world!` will now be printed to the console.

##Hello outside world: serving static files

How about something a bit more practical? The basic function of every Pass program is to transparently start a server that listens and serves static files on a specified port. To accomplish this, we supply two additional  command line arguments with the port number and a file directory to use as the root from which to serve static files.

Before trying this, let's add a directory called *static* which contains an *index.html*. The HTML file will simply contain:

```
Hello outside world!
```

We now have two files *./hello.pass*, and *./static/index.html* and we can start our server with the following line.

```
$ pass ./hello.pass 8080 ./static
```

This will start a Pass server on port 8080 which serves files from the directory *./static*. We will see the same output as before on the console and in a browser, visiting the url [http://localhost:8080/](http://localhost:8080/) will retrieve our *index.html*.

##Logger: using dictionaries, functions, and string concatenation

That's a bit more useful, but then what's the point of that pesky *.pass* file? Indeed, it was absolutely trivial in the last example. To give a peak at the power and simplicity of the Pass programming language, we now present a simple connection logger. Our logger program will write to stdout when a new user connects.

####Server
Pass allows us to write functions on the server which can be called from the client HTML as if they were included in the client side code. These functions run on the server but in a bit, we’ll show you how easy it is to get the results back in the client. The following two lines are the entire code listing for our *logger.pass* program.

```
server.arrive = (name) ~
  log(name + “ arrived”)
```

The first line declares a function which can be called by the client. The built-in variable server is a dictionary. Dictionaries in Pass, similar to objects in JavaScript, are data structures which map keys of type String to values of any type (function, number, string, array, or dictionary). Dictionary values can be accessed and assigned using the dot notation shown above. This assignment maps the key `“arrive”` to a function. Functions are denoted by a comma-delimited, parentheses-enclosed argument list (which may be empty) followed by a tilde. The function here takes the single argument `name`.The variable server is a special dictionary. Any functions that are mapped to keys in server can be called by the client.

The second line is the body block of our function. Enclosed blocks are indicated by a 2-space indent at the start of the line. The `log()` function should be familiar from the last example. The overloaded `+` operator, when used with strings, will create a new string which is a concatenation of the original two strings. When a string and a number are used with the `+` operator, the number is coerced to a string before being concatenated.

####Client 
The client side code in our modified *index.html* will import the *pass.js* client-side library and call the function we just defined on our server. The full code listing is as follows.


	<script src=/pass.js></script>
	<script>
	  server.arrive(prompt(“Hi, what’s your name?”));
	</script>


The script *pass.js* is automatically generated and served by the Pass server. Including it passes functions in the server dictionary to the client so that we can call `arrive()` in the client-side JavaScript. Before `arrive()` is called, the user will be prompted to enter their name as the argument so that we know who they are on the server.

####Run it!
With this index.html in the *./static* directory, we can have the server start listening on port 8080 just as we did in the previous example:

```
$ pass ./logger.pass 8080 ./static
```

If we visit [http://localhost:8080/](http://localhost:8080/) and enter our name, `ourName` arrived will be printed on the console. We can record the activity log by routing stdout to a file: 

```
$ pass ./logger.pass 8080 ./static > activity.log
```

We’ve created a simple activity logger in just two lines of code! One could imagine extending this example to collect analytics about user activity in real-time. For instance, perhaps each button press in a single-page web app could be logged in order to evaluate the effectiveness of a user interface.


##Real-time chat: *conn*, *conns()*, arrays, for, and callbacks

Hopefully, the last example illuminated the power and ease of exposing server-side functions written in Pass to client-side scripts. But Pass isn’t just for one-way communication. To show just how useful Pass can be for real-time bidirectional client-server interactions, we now present a simple chat server. The chat server will allow clients to broadcast messages to all registered users.

####Server
In our application, when a client application connects to the server, it registers with a callback function to let the server know how to contact it. When a client sends a message, the server iterates through all connected clients, calling the callback function that was passed to it by each connection. The code listing for our new chat.pass file is shown below.

	server.arrive = (msgCallback) ~
	  conn.onMsg = msgCallback
	
	server.broadcast = (msg) ~
	  for c in conns()
	    c.onMsg(msg)
	
The first function takes a single argument,  `msgCallback` that is added as a value to the dictionary `conn` with key `“onMsg”`. Like server, the variable `conn` is a special dictionary. Pass maintains a `conn` dictionary for each client connection. This dictionary is intended to store client-specific information (such as a usernames and callbacks). The `conn` keyword may be used within the body of an exposed `server` function to reference the dictionary of the client that invoked the function. Here we register a callback function by which the Pass program can send a message back to the client. Notice that functions can be assigned or passed as function arguments just as a string or number can be.

The second function also takes a single argument, msg which is a string to send to all other connected clients. Here we see a new flow control mechanism, the for loop. The built in function `conns()` returns an array containing all of the conn dictionaries for connected clients. Pass arrays are zero-indexed and may contain values of any type. The for construct iterates through values in an array, assigning each value to the variable `c` at the start of each iteration then executing the indented body block which starts on the next line.

####Client 
The bare bones GUI will consist of a text input box and a submit button. When the submit button is clicked, the client will broadcast the string in the textbox then clear the textbox. The full code listing for the client file *index.html* is below.

	<input id="msgInput">
	<input type="submit" onClick="send()">
	
	<script src="/pass.js"></script>
	<script>
		var inputBox = document.getElementById("msgInput");
	    function send() {
	        server.broadcast(inputBox.value); // broadcast input
	        inputBox.value = ""; // clear text box       
	    }
	    function rcv(msg) {
	        console.log(msg);
	    }
	    server.arrive(rcv); // register rcv callback
	</script>

We assume basic familiarity with JavaScript and HTML but there are a few important lines specific to Pass that the reader should note. Namely, the first `script` tag includes the clientside *pass.js* file which gives access to `server` functions.

####Chat!
This program can be run in the same matter as the previous few examples. Try opening the page in two browser windows and watch as your chat instantly appears in the console of one after you send it from the other.

###Why callbacks?
An astute reader may have noticed that our `server` functions never "return" values. Rather they are written in continuation-passing style. A callback function is passed to the server which passes results as arguments to the callback function when it is done with the computation. This style, which should be familiar to JavaScript programers who have done event-oriented user interfaces, has a number of advantages. For instance, it makes it impossible to make blocking calls to the server. Since JavaScript executes on a single thread, waiting for a value to return from a function call will inevitable block the next statement from being executed. This is especially apparent with the *remote* function calls in Pass due to the reality of network latency.

##Publish-subscribe: grouping connections with *tags*
