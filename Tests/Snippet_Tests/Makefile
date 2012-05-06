JFLAGS = -g
JC = javac
.SUFFIXES: .java 
.java:
	javac $<

default:
	cp ../../compiler/Pass.g Pass.g;
	java org.antlr.Tool Pass.g; 
	javac TestSnippets.java;
   
tests: 
	@echo "Testing all Snippets in ./Snippets. Test passes if no error" ;
	@echo "-----------------------";
	@for file in ./Snippets/*; do \
	echo "===================New Pass Grammar Test===================="; \
	java TestSnippets $$file; \
	done

testsOut: 
	@echo "Testing all Snippets in ./Snippets. Test passes if no error" > output.txt 2>&1 ;
	@echo "-----------------------" >> output.txt 2>&1;
	@for file in ./Snippets/*; do \
	echo "===================New Pass Grammar Test====================" >> output.txt 2>&1; \
	java TestSnippets $$file >> output.txt 2>&1; \
	done

clean:
	$(RM) *.class PassLexer.java PassParser.java Pass.tokens Pass.g output.txt
