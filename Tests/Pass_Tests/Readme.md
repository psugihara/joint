# * ----------------------------------------------------------------------------- #
# * author: Andrew Lamping 								     #
# * Readme.md										     #
# * This file contains makefile instructions for Pass program/file testing.	     #
# * These instructions are laid out in ./Readme.md			            #
# *------------------------------------------------------------------------------ #

===================================
Summary
===================================
This folder holds the Makefile and the corresponding directories of Pass files/programs that were used in the testing
of the Pass compiler. There are three directories that are described below that the Makefile uses for testing.

Before these tests can be run, the following Makefile commands must be executed:
$make clean
$make

The first command, 'make clean', cleans the current directory of files that may have been created from a previous run
of 'make'. The second command 'make' then compiles all necessary files needed to run the tests. This is done by copying
the files into the current directory and then compiling inside the directory.

===================================
Directories
===================================

-----------------------------------
Test_Files
-----------------------------------
This directory contains 76 functional .pass programs that are to be translated into JavaScript. 
The .pass files are designed to test basic-advanced features of the compiler.
Each file is named input#.pass, where '#' ranges from 1-76, corresponding to the 76 total .pass files.
First, the file tested is printed including its path and contents.
Then, the compiler's translation into JavaScript is printed.

To test these files, the following Makefile command is executed:
$make tests

The following is a sample output of one test on ./Test_Files/input9.pass:


===================New Pass Translation Test====================
./Test_Files/input9.pass
log("48292949i2409dn0idn")
------------------JS Below-------------------------
var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
var server = {};

console.log("48292949i2409dn0idn");

module.exports = server;


This is the end of the example. The Makefile also supports redirecting the stdout and stderr to a file in the current
directory, output.txt. To do this, run the following command:
$make testsOut


-----------------------------------
Eff_Tests
-----------------------------------
This directory contains two subdirectories, ./programs and ./errorFiles. 

------
./programs
------
./programs contains 12 working .pass programs that are quite long in their length. Each program has the naming convention
'program#.pass' where '#' is a number ranging from 1-12. 
These programs were used to test the run time of the compiler in compiling these programs. They use the file Efficiency.java, 
which is located in the Eff_Tests directory, to measure the run time of the Pass compiler (see Efficiency.java for more details). 
The test also notifies if the test has passed or failed. A failing test is a runtime > 2 seconds.

To test these run times, run the following commands:
$make effTests

The following is an example output of a test:
===================New Pass Runtime Test====================
./Eff_Tests/programs/program1.pass
--------------
Testing ./Eff_Tests/programs/program1.pass
Elapsed time in ms = 370
PASSED.


To redirect the output of the testing to a file in the current directory, output.txt, run the following command:
$make effTestsOut

-----------------------------------
./errorFiles
-----------------------------------
./errorFiles contains 62 .pass programs that contain errors of various sorts. 
The files have the naming convention of 'error#.pass' where '#' ranges from 1-62.
These programs were used to test the error reporting of the compiler. They use the file Error.java, which is located
in the Eff_Tests directory, to print out the stdout and stderror of each pass program as compiled by the compiler. 

To test these programs, run the following command:
$make errorTests

The following is an example output of a test:
===================New Pass Error Test====================
./Eff_Tests/errorFiles/error1.pass
--------------
Testing ./Eff_Tests/errorFiles/error1.pass
Standard output of the program:

Standard error of the program (if any):

1 Error has occured
./Eff_Tests/errorFiles/error1.pass line 0:-1


To redirect the output of the testing to a file in the current directory, output.txt, run the following command:
$make errorTestsOut

-----------------------------------
RT_Tests
-----------------------------------
RT_Tests contains 19 .pass programs that contain semantic errors that will result in runtime errors. 
The programs have the naming convention 'rte#.pass' where '#' ranges from 1-19.
Each program is compiled by the Pass compiler and the stdout is printed.

To test these programs, run the following command:
$make rtTests

The following is an example output of a test:
===================New Pass Runtime Error Test====================
./RT_Tests/rte15.pass
var pass = require('pass');
for (var x in pass)
  global[x] = pass[x];
var fun, x;
var server = {};

fun = 1;
fun = [1, 2, 3, 4, 5, 6, 7];
x = 0;
if (fun == 1) {
  console.log("oops!");
}

module.exports = server;


To redirect the testing output to a file in the current directory, output.txt, run the following command:
$make rtTestsOut