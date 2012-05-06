
# * ----------------------------------------------------------------------------- #
# * author: Andrew Lamping 								     #
# * Makefile										     #
# * This file contains makefile instructions for Pass program/file testing.	     #
# * These instructions are laid out in ./Readme.md			            #
# *------------------------------------------------------------------------------ #


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
	cp ../../compiler/SecondPass.java SecondPass.java;
	cp ../../compiler/FirstPass.java FirstPass.java;
	cp ./Eff_Tests/Efficiency.java Efficiency.java;
	cp ./Eff_Tests/Error.java Error.java;    
	javac ./*.java;

effTests:
	@echo "Testing runtimes/efficiency of Pass programs in ./Eff_Tests/progams";
	@for file in ./Eff_Tests/programs/*.pass; do \
	echo "===================New Pass Runtime Test===================="; \
	echo $$file; \
	java Efficiency $$file; \
	done

effTestsOut:
	@echo "Testing runtimes/efficiency of Pass programs in ./Eff_Tests/progams" > output.txt 2>&1;
	@for file in ./Eff_Tests/programs/*.pass; do \
	echo "===================New Pass Runtime Test====================" >> output.txt 2>&1; \
	echo $$file >> output.txt 2>&1 ; \
	java Efficiency $$file >> output.txt 2>&1 ; \
	done
	
errorTests:
	@echo "Testing stdout/stderr of invalid Pass programs in ./Eff_Tests/errorFiles";
	@for file in ./Eff_Tests/errorFiles/*.pass; do \
	echo "===================New Pass Error Test===================="; \
	echo $$file; \
	java Error $$file; \
	done

errorTestsOut:
	@echo "Testing stdout/stderr of invalid Pass programs in ./Eff_Tests/errorFiles" > output.txt 2>&1;
	@for file in ./Eff_Tests/errorFiles/*.pass; do \
	echo "===================New Pass Error Test====================" >> output.txt 2>&1; \
	echo $$file >> output.txt 2>&1; \
	java Error $$file >> output.txt 2>&1; \
	done

tests: 
	@echo "Testing translation of all Pass programs in ./Test_Files";
	@echo "This prints out the pass program followed by its translation into JavaScript";
	@for file in ./Test_Files/*.pass ; do \
	echo "===================New Pass Translation Test===================="; \
	echo $$file; \
	cat $$file; \
	echo "\n------------------JS Below-------------------------";\
	java PassC $$file;\
	done

testsOut: 
	@echo "Testing translation of all Pass programs in ./Test_Files" > output.txt 2>&1 ;
	@echo "This prints out the pass program followed by its translation into JavaScript" >> output.txt 2>&1 ;
	@for file in ./Test_Files/*.pass ; do \
	echo "===================New Pass Translation Test====================" >> output.txt 2>&1; \
	echo $$file >> output.txt 2>&1; \
	cat $$file >> output.txt 2>&1; \
	echo "\n------------------JS Below-------------------------" >> output.txt 2>&1; \
	java PassC $$file >> output.txt 2>&1; \
	done
	
clean:
	$(RM) *.class *.java Pass.tokens Pass.g output.txt






