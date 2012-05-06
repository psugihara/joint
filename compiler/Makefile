# ------------------------------------------------------------------------------
# author: Rafael
# Makefile
# Makefile for the compiler
# ------------------------------------------------------------------------------
CC = javac
CC1 = java org.antlr.Tool
CFLAGS = -nowarn

all : *.java
	$(CC1) Pass.g; $(CC) $(CFLAGS) *.java

clean: *.class
	rm *.class PassParser.java PassLexer.java Pass.tokens
