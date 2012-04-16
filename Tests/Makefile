JFLAGS = -g
JC = javac
.SUFFIXES: .java 
.java:
	javac $<

default: 
	java org.antlr.Tool ../PhaseI/Pass.g;
	javac TestSnippets.java;
   
tests: 
	@echo "Testing all Snippets in ./Snippets. Test passes if no error" ;
	@echo "-----------------------";
	java TestSnippets ./Snippets/input1;
	java TestSnippets ./Snippets/input2;
	java TestSnippets ./Snippets/input3;
	java TestSnippets ./Snippets/input4;
	java TestSnippets ./Snippets/input5;
	java TestSnippets ./Snippets/input6;
	java TestSnippets ./Snippets/input7;
	java TestSnippets ./Snippets/input8;
	java TestSnippets ./Snippets/input9;
	java TestSnippets ./Snippets/input10;
	java TestSnippets ./Snippets/input11;
	java TestSnippets ./Snippets/input12;
	java TestSnippets ./Snippets/input13;
	java TestSnippets ./Snippets/input14;
	java TestSnippets ./Snippets/input15;
	java TestSnippets ./Snippets/input16;
	java TestSnippets ./Snippets/input17;
	java TestSnippets ./Snippets/input18;
	java TestSnippets ./Snippets/input19;
	java TestSnippets ./Snippets/input20;
	java TestSnippets ./Snippets/input21;
	java TestSnippets ./Snippets/input22;
	java TestSnippets ./Snippets/input23;
	java TestSnippets ./Snippets/input24;
	java TestSnippets ./Snippets/input25;
	java TestSnippets ./Snippets/input26;
	java TestSnippets ./Snippets/input27;
	java TestSnippets ./Snippets/input28;
	java TestSnippets ./Snippets/input29;
	java TestSnippets ./Snippets/input30;
	java TestSnippets ./Snippets/input31;
	java TestSnippets ./Snippets/input32;
	java TestSnippets ./Snippets/input33;
	java TestSnippets ./Snippets/input34;
	java TestSnippets ./Snippets/input35;
	java TestSnippets ./Snippets/input36;
	java TestSnippets ./Snippets/input37;
	java TestSnippets ./Snippets/input38;
	java TestSnippets ./Snippets/input39;
	java TestSnippets ./Snippets/input40;

clean:
	$(RM) *.class