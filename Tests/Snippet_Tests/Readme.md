# * ----------------------------------------------------------------------------- #
# * author: Andrew Lamping 								     #
# * Readme.md										     #
# * This file explains how the Makefile and grammar testing works for             #
# * ./Snippet_Tests     								     #
# *------------------------------------------------------------------------------ #

===================================
Summary
===================================
This folder holds the Makefile and the corresponding directory of files that were used early
in the stages of testing the Pass grammar. 

Before these tests can be run, the following Makefile commands must be executed:
$make clean
$make

The first command, 'make clean', cleans the current directory of files that may have been created from a previous run
of 'make'. The second command 'make' then compiles all necessary files needed to run the tests. This is done by copying
the files into the current directory and then compiling inside the directory.


------------
/Snippets
------------
This directory contains 76 files that tested basic functionality of the grammar.
The naming convention is 'input#' where '#' ranges from 1-76.

Each file is tested using the pass grammar's lexer and parser, run in TestSnippets.java. If the file does not contain an error,
there is no output. Otherwise, the error is printed. 

To run these tests, execute the following command:
$make tests

The following is a sample output of a passing test followed by a failing test:

===================New Pass Grammar Test====================
./Snippets/input11
===================New Pass Grammar Test====================
./Snippets/input12
2 Errors have occured
Line 3:18 undefined variable 'untag'
Line 6:43 undefined variable 'untag'


To redirect the output of these tests to a file in the current directory, output.txt, execute the following command:
$make testsOut
