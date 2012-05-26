

Spliff: Pass the functions
======================

<link rel="stylesheet" href="http://yandex.st/highlightjs/6.1/styles/github.min.css">
<script src="http://yandex.st/highlightjs/6.1/languages/javascript.min.js"></script>
<script src="http://yandex.st/highlightjs/6.1/highlight.min.js"></script>
<script>
hljs.initHighlightingOnLoad()
</script>

##Introduction

The recent emergence of WebSockets has given developers a new tool to deploy dynamic real time connections and content between the client and server. Unfortunately, the tedious HTTP request/response model that was designed to facilitate the the internet’s early role as a distributed, static file system, has been folded into most libraries that support this new protocol. In order to write a functional real-time web application, a programmer must first learn these older protocols as well as the associated syntax for initializing a server, establishing socket connections, and other verbose functions associated with the traditional client-server architecture. This is tedious, time consuming and thanks to Spliff, now often unnecessary.

Spliff take care of this repetitive, boilerplate configuration automatically so that the programmer can immediately begin work on the main application logic. The entire network architecture is abstracted into a few intuitive functions that facilitate seamless communication between server and client. Spliff also allows functions on the server to be called like any other function on the client, and vice versa. Moreover once these connections are established, Pass provides convenient data structures to help organize, search through, and keep track of them.

###Audience

It is our hope that the Pass programming language will prove useful to anyone who wants to write web applications requiring real-time client-server communication. It is assumed that the reader of this document has some experience building interactive websites using JavaScript and HTML but knowledge of another server side language, or even experience with server-dependent applications, is not required.

##Hello outside world: serving static files

How about something a bit more practical? The basic function of every Pass program is to transparently start a server that listens and serves static files on a specified port. To accomplish this, we supply two additional command line arguments with the port number and a file directory to use as the root from which to serve static files.

Before trying this, let's add a directory at the current path called *static* that contains an *index.html*. The HTML file will simply contain:

```
Hello outside world!
```

We now have two files *hello.js*, and *static/index.html* and we can start our server with the following line.

```
$ spliff hello.js 8080 static
```

This will start a Pass server on port 8080 which serves files from the directory *static*. We will see the same output as before on the console and in a browser, visiting the url [http://localhost:8080/](http://localhost:8080/) will retrieve our *index.html*.

##Logger: using dictionaries, functions, and string concatenation

That's a bit more useful, but then what's the point of that pesky *.pass* file? Indeed, it was absolutely trivial in the last example. To give a peak at the power and simplicity of the Pass programming language, we now present a simple connection logger. Our logger program will write to stdout when a new user connects.

####Server
Pass allows us to write functions on the server which can be called from the client HTML as if they were included in the client side code. These functions run on the server but in a bit, we’ll show you how easy it is to get the results back in the client. The following two lines are the entire code listing for our *logger.pass* program.

```
server.arrive = (name) ~
  log(name + “ arrived”)
```

The first line declares a function which can be called by the client. The built-in variable `server` is a dictionary. Dictionaries in Pass, similar to objects in JavaScript, are data structures which map variable keys to values of any type (function, number, string, array, or dictionary). Dictionary values can be accessed and assigned using the dot notation shown above. This assignment maps the key `arrive` to a function. Functions are denoted by a comma-delimited, parentheses-enclosed argument list (which may be empty) followed by a tilde. The function here takes the single argument `name`. The variable server is a special dictionary. Any functions that are mapped to keys in server can be called by the client.

The second line is the body block of our function. Enclosed blocks are indicated by a 2-space indent at the start of the line. The `log()` function should be familiar from the last example. The overloaded `+` operator, when used with strings, will create a new string which is a concatenation of the original two strings. When a string and a number are used with the `+` operator, the number is coerced to a string before being concatenated.

####Client 
The client side code in our modified *index.html* will import the *pass.js* client-side library and call the function we just defined on our server. The full code listing is as follows.


    <script src=/pass.js></script>
    <script>
      pass.connect(function (server) {
        server.arrive(prompt(“Hi, what’s your name?”));
      });
    </script>


The script *pass.js* is automatically generated and served by the Pass server. Including it and calling `pass.connect()` passes functions in the server dictionary to the client so that we can call `arrive()` in the client-side JavaScript. The connection function takes a callback function with `server` as an argument. This function is called when the connection is successfully established. Before `arrive()` is called, the user will be prompted to enter their name as the argument so that we know who they are on the server.

####Run it!
With this index.html in the *static* directory, we can have the server start listening on port 8080 just as we did in the previous example:

```
$ pass logger.pass 8080 static
```

If we visit [http://localhost:8080/](http://localhost:8080/) and enter our name, `ourName` arrived will be printed on the console. We can record the activity log by routing stdout to a file: 

```
$ pass logger.pass 8080 static > activity.log
```

We’ve created a simple activity logger in just two lines of code! One could imagine extending this example to collect analytics about user activity in real-time. For instance, perhaps each button press in a single-page web app could be logged in order to evaluate the effectiveness of a user interface.

### Numbers
In Pass, all numbers are floating point numbers. All of the usual operations and operator assignments, familiar from JavaScript, Java, or C are available with the exception of postfix and prefix incrementation. So if we wanted to add a counter for the total number of connections, we could simply add the line

```
count = 0
```

to the top of our file, and

```
count += 1
```

somewhere inside the function.

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

The second function also takes a single argument, msg which is a string to send to all other connected clients. Here we see a new flow control mechanism, the `for` loop, which iterates over the set of *values* in the collection (to iterate over the keys, simply use the native construct `keys([collection])`). The built in function `conns()` returns an array containing all of the conn dictionaries for connected clients. Pass arrays are zero-indexed and may contain values of any type. The for construct iterates through values in an array, assigning each value to the variable `c` at the start of each iteration then executing the indented body block which starts on the next line. The `conns()` function in the declaration of the loop is only called once, so if the return value of `conns()` changes the execution of the loop with not be affected.

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

We assume basic familiarity with JavaScript and HTML but there are a few important lines specific to Pass that the reader should note. Namely, the first `script` tag includes the client side *pass.js* file which gives access to `server` functions.

####Chat!
This program can be run in the same matter as the previous few examples. Try opening the page in two browser windows and watch as your chat instantly appears in the console of one after you send it from the other.

###Why callbacks?
An astute reader may have noticed that our `server` functions never "return" values. Rather they are written in a continuation-passing style. A callback function is passed to the server which passes results as arguments to the callback function when it is done with the computation. This style, which should be familiar to JavaScript programers who have written event-oriented user interfaces, has a number of advantages. For instance, without "return" values, it impossible to make blocking calls to the server.

As a quick exercise, consider the difference between the following two JavaScript snippets.

```
var x = hardWork();
Console.log("Ready for more work!");
```
```
var x;
hardWorkAsync(function(result) { x = result; });
Console.log("Ready for more work!");
```

Can you predict the difference in output? The first piece of code will block on the first line, waiting for `hardWork()` to return a value for the assignment before it prints to the console. In the second snippet, `x` is instantiated then `hardWorkAsync()` is called with a callback function as an argument. However, the interpreter does not wait for the function to complete or the assignment to occur before immediately printing to the console.

In this way, control flow is synchronous but function calls are asynchronous. Since Pass and JavaScript each execute on single threads, waiting for a value to return from a function call will inevitable block the next statement from being executed. This is especially apparent with the *remote* function calls in Pass due to the reality of network latency.

##Publish-subscribe: grouping connections with *tags*
What if we only want to broadcast certain things to certain clients? In our final example, we will show you how to create a simple "Publish-Subscribe" application that allows clients to listen on and broadcast to different channels.

You're probably wondering how we can write such an application in a reasonable amount of lines, and without tedious implementation of lots of data structures. Client grouping is usually a critical component when building scalable web applications. Conveniently, this functionality is provided in Pass through a small number of native functions. These functions will be utilized and explained in the present example.

First, we create an exposed function that serves two purposes: it subscribes the client to the specified channel, and stores the client’s handler for receiving messages in the client connection dictionary. We subscribe a client to a group through the use of the `pushTag()` function, which takes two arguments: the `conn` dictionary of the client, and the group name (a string).

    server.subscribe = (channel, onMsg) ~
      pushTag(conn, channel)
      conn.onMsg = onMsg

We then create an exposed function that allows a client to publish a message to a channel:

    server.publish = (message, channel) ~
      for connection in conns(channel)
        connection.onMsg(message)

You've seen the `conns()` function before--when called with no parameter, it returns an array of all client `conn` dictionaries. When a group name is provided as a parameter, it returns the array of client `conn` dictionaries that are tagged with the group name.

Also, note that with the above implementation of `publish()`, we have the option to not specify a channel, in which case the function broadcasts to all open channels on the server.

We can also easily implement a function that publishes a message to each channel that the client is currently subscribed to:

    server.publishAllSubscribed = function(message) {
      var tags = getTags(conn);    
      (var i = 0; i < tags.length; i++) {    
        for connection in chas(nela[i]) {
          connection.onMsg(message);
        }        
      }
    }

The `getTags()` function takes a client `conn` dictionary as a parameter and returns an array of group names that the client belongs to. Just like the `conns()` function, when no parameter is provided `getTags()` returns an array of all open group names.

Finally, we can unsubscribe a client from a specified channel or, if no channel is specified, all channels to which the client is subscribed. We do this by calling the `popTag()` function as shown:

    server.unsubscribe = (channel) ~
      if channel
        popTag(conn, channel)
      else
        for channel in channels(conn)
          popTag(conn, channel)

With these functions, we have written a fully functional Publish-Subscribe server in under 20 lines of Pass code.

Note that while these methods of accessing client dictionaries are the only ones native to Pass, a programmer is free to design a custom dictionary that may better suit the needs of a particular application. For example, one might create a dictionary where user names are the keys that map to that user’s client dictionary.

###Making dictionaries and arrays
The array literal consists of an open square bracket, followed by a comma-separated list of values, followed by a closing square bracket. Values may be of mixed type.

```
[0, "one", 2]
```

The dictionary literal consists of an open curly brace, followed by comma-separated paris of colon-separated key identifiers and values, followed by a closing curly brace. A dictionary literal may also contain mixed type values.

```
{user1: "John", user2: "Jim", user3: 0}
```

Arrays and dictionaries may be assigned to variables just like functions or numbers with the variable name and assignment operator on the left hand side. Like functions and numbers, they may also be passed into operations as literals.

###Passing to Pass
When passing arguments into Pass functions from client-side JavaScript, it is important to know what data types they will take in the Pass function and vice versa. Pass datatypes have been designed with this in mind. The simple rule of thumb is that they are what they look like.

* JavaScript Strings ⟺ Pass strings with the same value.
* JavaScript Numbers ⟺ Pass numbers with the same value.
* JavaScript Arrays ⟺ Pass arrays.
* Javascript Functions ⟺ Pass functions.
* JavaScript Objects (except for those mentioned above) ⟺ Pass dictionaries.

##Conclusion

Hopefully, this tutorial has given you a good idea about what kinds of applications are best suited for Pass, and how few lines of Pass code are required to build fully functional real-time web applications. We have covered all the basic functionality of the language. With some luck you should be able to have a simple application of your own up and running in just minutes. We hope you will enjoy using our language as much as we enjoyed designing it! 

For a more detailed look at the language, please see the Pass Reference Manual.

Best,

*Rafael Castellanos | Cody De La Vara | Andy Lamping | Nick Pizzoferrato | Peter Sugihara*
