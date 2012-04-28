CC = javac
CC1 = java org.antlr.Tool
CFLAGS = -nowarn

all : *.java
	make clean; $(CC1) Pass.g; $(CC) $(CFLAGS) *.java; echo "usage: java PassC <INPUT_FILE.pass>"

clean: *.class
	rm *.class PassParser.java PassLexer.java Pass.tokens
