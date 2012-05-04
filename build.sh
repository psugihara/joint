#!/bin/sh
#this script builds the self contained class binaries for the pass compiler
#Note: you must have antler installed for this build script to work
#The files produced by this build script do not require antler!

cd compiler

make
cp *.java bin
make clean
cd bin
                         
for file in $(grep -il "org.antlr.runtime" ./  -R)
do
sed -e "s/org.antlr.runtime/runtime/ig" $file > /tmp/tempfile.tmp
mv /tmp/tempfile.tmp $file
done
javac *.java
rm *.java Pass.g Makefile README
echo "Pass compiler package is built!\nSee output is in compiler/bin"

