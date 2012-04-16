CC = javac
CC1 = java org.antlr.Tool
CFLAGS = -nowarn

all : *.java
	make clean; $(CC1) Pass.g; $(CC) $(CFLAGS) *.java; echo "usage: java T1 <INPUT_FILE.pass>"

clean: *.class
	rm *.class
