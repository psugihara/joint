JFLAGS = -g
JC = javac
.SUFFIXES: .java 
.java:
	javac $<

default:
	cp ../../compiler/Pass.g Pass.g;
	java org.antlr.Tool Pass.g;
	javac *.java

tests:
	java org.antlr.gunit.Interp TerminalTests.gunit

	
clean:
	$(RM) *.class *.java Pass.tokens Pass.g output.txt
