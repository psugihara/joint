JFLAGS = -g
JC = javac
.SUFFIXES: .java 
.java:
	javac $<

default:
	cp ../../PhaseI/Pass.g Pass.g;
	java org.antlr.Tool Pass.g;
	cp ../../PhaseI/PassC.java PassC.java;
	cp ../../PhaseI/PassNode.java PassNode.java;
	cp ../../PhaseI/CodeGenerator.java CodeGenerator.java; 
	javac ./*.java;

tests: 
	@echo "Testing all Pass files in ./Pass_Test_Files" ;
	@echo "-----------------------";
	java PassC ./Pass_Test_Files/helloworld.pass;
	
clean:
	$(RM) *.class PassLexer.java PassParser.java Pass.tokens Pass.g PassC.java PassNode.java CodeGenerator.java
