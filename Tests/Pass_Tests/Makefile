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

test: 
	java PassC ./Test_Files/test.pass


tests: 
	@echo "Testing all Pass files in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/helloworld.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input1.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input1EO.txt;
	java PassC ./Test_Files/input2.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input2EO.txt;
	java PassC ./Test_Files/input3.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input3EO.txt;
	java PassC ./Test_Files/input4.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input4EO.txt;
	java PassC ./Test_Files/input5.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input5EO.txt;
	java PassC ./Test_Files/input6.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input6EO.txt;
	java PassC ./Test_Files/input7.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input7EO.txt;
	java PassC ./Test_Files/input8.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input8EO.txt;
	java PassC ./Test_Files/input9.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input9EO.txt;
	java PassC ./Test_Files/input10.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input10EO.txt;
	java PassC ./Test_Files/input11.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input11EO.txt;
	java PassC ./Test_Files/input12.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input12EO.txt;
	java PassC ./Test_Files/input13.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input13EO.txt;
	java PassC ./Test_Files/input14.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input14EO.txt;
	java PassC ./Test_Files/input15.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input15EO.txt;
	java PassC ./Test_Files/input16.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input16EO.txt;
	java PassC ./Test_Files/input17.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input17EO.txt;
	java PassC ./Test_Files/input18.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input18EO.txt;
	java PassC ./Test_Files/input19.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input19EO.txt;
	java PassC ./Test_Files/input20.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input20EO.txt;
	java PassC ./Test_Files/input21.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input21EO.txt;
	java PassC ./Test_Files/input22.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input22EO.txt;
	java PassC ./Test_Files/input23.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input23EO.txt;
	java PassC ./Test_Files/input24.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input24EO.txt;
	java PassC ./Test_Files/input25.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input25EO.txt;
	java PassC ./Test_Files/input26.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input26EO.txt;
	java PassC ./Test_Files/input27.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input27EO.txt;
	java PassC ./Test_Files/input28.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input28EO.txt;
	java PassC ./Test_Files/input29.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input29EO.txt;
	java PassC ./Test_Files/input30.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input30EO.txt;
	java PassC ./Test_Files/input31.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input31EO.txt;
	java PassC ./Test_Files/input32.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input32EO.txt;
	java PassC ./Test_Files/input33.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input33EO.txt;
	java PassC ./Test_Files/input34.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input34EO.txt;
	java PassC ./Test_Files/input35.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input35EO.txt;
	java PassC ./Test_Files/input36.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input36EO.txt;
	java PassC ./Test_Files/input37.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input37EO.txt;
	java PassC ./Test_Files/input38.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input38EO.txt;
	java PassC ./Test_Files/input39.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input39EO.txt;
	java PassC ./Test_Files/input40.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input40EO.txt;
	java PassC ./Test_Files/input41.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input41EO.txt;
	java PassC ./Test_Files/input42.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input42EO.txt;
	java PassC ./Test_Files/input43.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input43EO.txt;
	java PassC ./Test_Files/input44.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input44EO.txt;
	java PassC ./Test_Files/input45.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input45EO.txt;
	java PassC ./Test_Files/input46.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input46EO.txt;
	java PassC ./Test_Files/input47.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input47EO.txt;
	java PassC ./Test_Files/input48.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input48EO.txt;
	java PassC ./Test_Files/input49.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input49EO.txt;
	java PassC ./Test_Files/input50.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input50EO.txt;
	java PassC ./Test_Files/input51.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input51EO.txt;
	java PassC ./Test_Files/input52.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input52EO.txt;
	java PassC ./Test_Files/input53.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input53EO.txt;
	java PassC ./Test_Files/input54.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input54EO.txt;
	java PassC ./Test_Files/input55.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input55EO.txt;
	java PassC ./Test_Files/input56.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input56EO.txt;
	java PassC ./Test_Files/input57.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input57EO.txt;
	java PassC ./Test_Files/input58.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input58EO.txt;
	java PassC ./Test_Files/input59.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input59EO.txt;
	java PassC ./Test_Files/input60.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input60EO.txt;
	java PassC ./Test_Files/input61.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input61EO.txt;
	java PassC ./Test_Files/input62.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input62EO.txt;
	java PassC ./Test_Files/input63.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input63EO.txt;
	java PassC ./Test_Files/input64.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input64EO.txt;
	java PassC ./Test_Files/input65.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input65EO.txt;
	java PassC ./Test_Files/input66.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input66EO.txt;
	java PassC ./Test_Files/input67.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input67EO.txt;
	java PassC ./Test_Files/input68.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input68EO.txt;
	java PassC ./Test_Files/input69.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input69EO.txt;
	java PassC ./Test_Files/input70.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input70EO.txt;
	java PassC ./Test_Files/input71.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input71EO.txt;
	java PassC ./Test_Files/input72.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input72EO.txt;
	java PassC ./Test_Files/input73.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input73EO.txt;
	java PassC ./Test_Files/input74.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input74EO.txt;
	java PassC ./Test_Files/input75.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input75EO.txt;

tests10: 
	@echo "Testing helloworld + input1-10 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/helloworld.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input1.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input1EO.txt;
	java PassC ./Test_Files/input2.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input2EO.txt;
	java PassC ./Test_Files/input3.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input3EO.txt;
	java PassC ./Test_Files/input4.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input4EO.txt;
	java PassC ./Test_Files/input5.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input5EO.txt;
	java PassC ./Test_Files/input6.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input6EO.txt;
	java PassC ./Test_Files/input7.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input7EO.txt;
	java PassC ./Test_Files/input8.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input8EO.txt;
	java PassC ./Test_Files/input9.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input9EO.txt;
	java PassC ./Test_Files/input10.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input10EO.txt;

tests20:
	@echo "Testing input11-input20 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input11.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input11EO.txt;
	java PassC ./Test_Files/input12.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input12EO.txt;
	java PassC ./Test_Files/input13.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input13EO.txt;
	java PassC ./Test_Files/input14.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input14EO.txt;
	java PassC ./Test_Files/input15.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input15EO.txt;
	java PassC ./Test_Files/input16.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input16EO.txt;
	java PassC ./Test_Files/input17.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input17EO.txt;
	java PassC ./Test_Files/input18.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input18EO.txt;
	java PassC ./Test_Files/input19.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input19EO.txt;
	java PassC ./Test_Files/input20.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input20EO.txt;

tests30:
	@echo "Testing input21-input30 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input21.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input21EO.txt;
	java PassC ./Test_Files/input22.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input22EO.txt;
	java PassC ./Test_Files/input23.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input23EO.txt;
	java PassC ./Test_Files/input24.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input24EO.txt;
	java PassC ./Test_Files/input25.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input25EO.txt;
	java PassC ./Test_Files/input26.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input26EO.txt;
	java PassC ./Test_Files/input27.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input27EO.txt;
	java PassC ./Test_Files/input28.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input28EO.txt;
	java PassC ./Test_Files/input29.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input29EO.txt;
	java PassC ./Test_Files/input30.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input30EO.txt;




tests40:
	@echo "Testing input31-input40 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input31.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input31EO.txt;
	java PassC ./Test_Files/input32.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input32EO.txt;
	java PassC ./Test_Files/input33.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input33EO.txt;
	java PassC ./Test_Files/input34.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input34EO.txt;
	java PassC ./Test_Files/input35.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input35EO.txt;
	java PassC ./Test_Files/input36.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input36EO.txt;
	java PassC ./Test_Files/input37.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input37EO.txt;
	java PassC ./Test_Files/input38.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input38EO.txt;
	java PassC ./Test_Files/input39.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input39EO.txt;
	java PassC ./Test_Files/input40.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input40EO.txt;
	java PassC ./Test_Files/input41.pass > ./output.txt;


tests50:
	@echo "Testing input41-input50 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input41.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input41EO.txt;
	java PassC ./Test_Files/input42.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input42EO.txt;
	java PassC ./Test_Files/input43.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input43EO.txt;
	java PassC ./Test_Files/input44.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input44EO.txt;
	java PassC ./Test_Files/input45.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input45EO.txt;
	java PassC ./Test_Files/input46.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input46EO.txt;
	java PassC ./Test_Files/input47.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input47EO.txt;
	java PassC ./Test_Files/input48.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input48EO.txt;
	java PassC ./Test_Files/input49.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input49EO.txt;
	java PassC ./Test_Files/input50.pass > ./output.txt;


tests60:
	@echo "Testing input51-input60 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input51.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input51EO.txt;
	java PassC ./Test_Files/input52.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input52EO.txt;
	java PassC ./Test_Files/input53.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input53EO.txt;
	java PassC ./Test_Files/input54.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input54EO.txt;
	java PassC ./Test_Files/input55.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input55EO.txt;
	java PassC ./Test_Files/input56.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input56EO.txt;
	java PassC ./Test_Files/input57.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input57EO.txt;
	java PassC ./Test_Files/input58.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input58EO.txt;
	java PassC ./Test_Files/input59.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input59EO.txt;
	java PassC ./Test_Files/input60.pass > ./output.txt;


tests70:
	@echo "Testing input61-input70 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input61.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input61EO.txt;
	java PassC ./Test_Files/input62.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input62EO.txt;
	java PassC ./Test_Files/input63.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input63EO.txt;
	java PassC ./Test_Files/input64.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input64EO.txt;
	java PassC ./Test_Files/input65.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input65EO.txt;
	java PassC ./Test_Files/input66.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input66EO.txt;
	java PassC ./Test_Files/input67.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input67EO.txt;
	java PassC ./Test_Files/input68.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input68EO.txt;
	java PassC ./Test_Files/input69.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input69EO.txt;
	java PassC ./Test_Files/input70.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input70EO.txt;

tests75:
	@echo "Testing input71-input75 in ./Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/input71.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input71EO.txt;
	java PassC ./Test_Files/input72.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input72EO.txt;
	java PassC ./Test_Files/input73.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input73EO.txt;
	java PassC ./Test_Files/input74.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input74EO.txt;
	java PassC ./Test_Files/input75.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input75EO.txt;







	
clean:
	$(RM) *.class PassLexer.java PassParser.java Pass.tokens Pass.g PassC.java PassNode.java CodeGenerator.java
