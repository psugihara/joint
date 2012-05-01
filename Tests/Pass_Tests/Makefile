JFLAGS = -g
JC = javac
.SUFFIXES: .java 
.java:
	javac $<

default:
	cp ../../compiler/Pass.g Pass.g;
	java org.antlr.Tool Pass.g;
	cp ../../compiler/PassC.java PassC.java;
	cp ../../compiler/PassNode.java PassNode.java;
	cp ../../compiler/CodeGenerator.java CodeGenerator.java;
	cp ../../compiler/CodeOptimizer.java CodeOptimizer.java; 
	javac ./*.java;

effTests:
	cp ../../compiler/Pass.g Pass.g;
	java org.antlr.Tool Pass.g;
	cp ../../compiler/PassC.java PassC.java;
	cp ../../compiler/PassNode.java PassNode.java;
	cp ../../compiler/CodeGenerator.java CodeGenerator.java;
	cp ../../compiler/CodeOptimizer.java CodeOptimizer.java; 
	cp ./Eff_Tests/Efficiency.java Efficiency.java;  
	javac ./*.java;
	@echo "--------------------------------------------------";
	@echo "Testing Runtimes of Pass Programs in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java Efficiency ./Test_Files/program1.pass;
	java Efficiency ./Test_Files/program2.pass;
	java Efficiency ./Test_Files/program3.pass;
	java Efficiency ./Test_Files/program4.pass;
	java Efficiency ./Test_Files/program5.pass;
	java Efficiency ./Test_Files/program6.pass;
	java Efficiency ./Test_Files/program7.pass;
	java Efficiency ./Test_Files/program8.pass;
	java Efficiency ./Test_Files/program9.pass;
	java Efficiency ./Test_Files/program10.pass;

test: 
	java PassC ./Test_Files/test.pass;


tests: 
	@echo "Testing all Pass files in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/helloworld.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input1.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input2.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input3.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input4.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input5.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input6.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input7.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input8.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input9.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input10.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input11.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input12.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input13.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input14.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input15.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input16.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input17.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input18.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input19.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input20.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input21.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input22.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input23.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input24.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input25.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input26.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input27.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input28.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input29.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input30.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input31.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input32.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input33.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input34.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input35.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input36.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input37.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input38.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input39.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input40.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input41.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input42.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input43.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input44.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input45.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input46.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input47.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input48.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input49.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input50.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input51.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input52.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input53.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input54.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input55.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input56.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input57.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input58.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input59.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input60.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input61.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input62.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input63.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input64.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input65.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input66.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input67.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input68.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input69.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input70.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input71.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input72.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input73.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input74.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input75.pass;
	@echo "--------------------------------------------------";

tests10: 
	@echo "Testing helloworld + input1-10 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/helloworld.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input1.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input2.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input3.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input4.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input5.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input6.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input7.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input8.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input9.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input10.pass;
	@echo "--------------------------------------------------";

tests20:
	@echo "Testing input11-input20 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input11.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input12.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input13.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input14.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input15.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input16.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input17.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input18.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input19.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input20.pass;
	@echo "--------------------------------------------------";

tests30:
	@echo "Testing input21-input30 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input21.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input22.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input23.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input24.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input25.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input26.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input27.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input28.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input29.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input30.pass;
	@echo "--------------------------------------------------";


tests40:
	@echo "Testing input31-input40 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input31.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input32.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input33.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input34.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input35.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input36.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input37.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input38.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input39.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input40.pass;
	@echo "--------------------------------------------------";


tests50:
	@echo "Testing input41-input50 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input41.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input42.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input43.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input44.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input45.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input46.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input47.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input48.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input49.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input50.pass;
	@echo "--------------------------------------------------";


tests60:
	@echo "Testing input51-input60 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input51.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input52.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input53.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input54.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input55.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input56.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input57.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input58.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input59.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input60.pass;
	@echo "--------------------------------------------------";


tests70:
	@echo "Testing input61-input70 in ./Test_Files" ;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input61.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input62.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input63.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input64.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input65.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input66.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input67.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input68.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input69.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input70.pass;
	@echo "--------------------------------------------------";

tests75:
	@echo "Testing input71-input75 in ./Test_Files" ;
	java PassC ./Test_Files/input71.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input72.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input73.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input74.pass;
	@echo "--------------------------------------------------";
	java PassC ./Test_Files/input75.pass;
	@echo "--------------------------------------------------";






	
clean:
	$(RM) *.class *.java Pass.tokens Pass.g PassC.java PassNode.java CodeGenerator.java


