Pass Style Guide
================

This document lays out conventions for the Pass code and documentation used in official examples.

## General
* Indent with 2 spaces. This is actually enforced by the compiler. Never use tabs.
* Use a maximum 79 characters per line. This limits confusing nesting, among other things.
* Use line breaks between function definitions.
* Use 1 space before and after assignment operators.
* Use 1 space before and after function argument lists in declarations.
* Don't use spaces after `{`, `[`, or `(` or before `}`, `]`, or `)`.

## Functions
* Don't use spaces between the function name and opening `(` in a function call.

## Naming
* All variables should start with a lowercase letter and use camelCase.
* Keep variable names short but descriptive.

## Comments
* In a multiline comment terminate the line after the opening hash and before the closing hash.
* In a single line comment use a single space after the opening hash and before the closing hash.

##Example
####Good.pass:

	#
	This program follows these Pass coding conventions.
	This is a multiline comment.
	#
	
	# Return the sum of 2 numbers. #
	addNums = (a, b) ~
	  return a + b	  	  
	
	d = {one: 1, two: 2}
	log(addNums(d.one, d.two))
	
	
####Bad.pass:

	#This program doesn't follow these Pass coding conventions.
	This is a multiline comment.#
	
	# Return the sum of 2 numbers. #
	add_nums= (a, b)~
	  return a+b	  	  
	
	D = { one: 1, two: 2 }
	log ( add_nums( D.one, D.two ) )