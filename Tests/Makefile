JFLAGS = -g
JC = javac
.SUFFIXES: .java 
.java:
	javac $<

default:
	cp ../PhaseI/Pass.g ./Pass.g;
	java org.antlr.Tool Pass.g; 
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
	java TestSnippets ./Snippets/input41;
	java TestSnippets ./Snippets/input42;
	java TestSnippets ./Snippets/input43;
	java TestSnippets ./Snippets/input44;
	java TestSnippets ./Snippets/input45;
	java TestSnippets ./Snippets/input46;
	java TestSnippets ./Snippets/input47;
	java TestSnippets ./Snippets/input48;
	java TestSnippets ./Snippets/input49;
	java TestSnippets ./Snippets/input50;
	java TestSnippets ./Snippets/input51;
	java TestSnippets ./Snippets/input52;
	java TestSnippets ./Snippets/input53;
	java TestSnippets ./Snippets/input54;
	java TestSnippets ./Snippets/input55;
	java TestSnippets ./Snippets/input56;
	java TestSnippets ./Snippets/input57;
	java TestSnippets ./Snippets/input58;
	java TestSnippets ./Snippets/input59;
	java TestSnippets ./Snippets/input60;
	java TestSnippets ./Snippets/input61;
	java TestSnippets ./Snippets/input62;
	java TestSnippets ./Snippets/input63;
	java TestSnippets ./Snippets/input64;
	java TestSnippets ./Snippets/input65;
	java TestSnippets ./Snippets/input66;
	java TestSnippets ./Snippets/input67;
	java TestSnippets ./Snippets/input68;
	java TestSnippets ./Snippets/input69;
	java TestSnippets ./Snippets/input70;
	java TestSnippets ./Snippets/input71;
	java TestSnippets ./Snippets/input72;
	java TestSnippets ./Snippets/input73;
	java TestSnippets ./Snippets/input74;
	java TestSnippets ./Snippets/input75;
	java TestSnippets ./Snippets/input76;



clean:
	$(RM) *.class PassLexer.java PassParser.java Pass.tokens Pass.g
