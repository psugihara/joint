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
	java PassC ./Test_Files/helloworld.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;

tests: 
	@echo "Testing all Pass files in ./Pass_Test_Files" ;
	@echo "-----------------------";
	java PassC ./Test_Files/helloworld.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input1.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/input1EO.txt;
	java PassC ./Test_Files/input2.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input3.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input4.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input5.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input6.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input7.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input8.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input9.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input10.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input11.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input12.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input13.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input14.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input15.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input16.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input17.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input18.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input19.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input20.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input21.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input22.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input23.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input24.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input25.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input26.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input27.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input28.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input29.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input30.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input31.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input32.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input33.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input34.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input35.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input36.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input37.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input38.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input39.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input40.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input41.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input42.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input43.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input44.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input45.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input46.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input47.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input48.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input49.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input50.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input51.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input52.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input53.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input54.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input55.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input56.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input57.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input58.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input59.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input60.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input61.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input62.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input63.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input64.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input65.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input66.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input67.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input68.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input69.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input70.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input71.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input72.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input73.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input74.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;
	java PassC ./Test_Files/input75.pass > ./output.txt;
	diff ./output.txt ./Test_Files/Expected_Outputs/helloworldEO.txt;






	
clean:
	$(RM) *.class PassLexer.java PassParser.java Pass.tokens Pass.g PassC.java PassNode.java CodeGenerator.java
