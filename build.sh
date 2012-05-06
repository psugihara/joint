#!/bin/sh
# ---------------------------------------------------------------------------
# author: Rafael
# build.sh
# this script builds the self contained class binaries for the pass compiler 
# from the source
# Note: you must have antler installed for this build script to work
# The files produced by this build script do not require antler!
# ---------------------------------------------------------------------------

cd compiler
make
cp *.java ../pass-production/bin/compiler
make clean
#copy bin files 
cd ../pass-production/bin
cp ../../bin/*.js  ./    
sed -e "s:'../compiler':'./compiler':ig" passc.js > .oUt
cp .oUt passc.js
rm .oUt "*.js"          
cd compiler
#remove antlr runtime dependency
for file in $(grep -il "org.antlr.runtime" ./  -R)
do
sed -e "s:org.antlr.runtime:runtime:ig" $file > /tmp/tempfile.tmp
mv /tmp/tempfile.tmprm $file
done
javac *.java
rm *.java 
#copy lib files
cd ../../
cp ../lib ./ -R
#copy install scripts
cp ../install.sh ./
cp ../package.json ./
#copy other stuff
cp ../examples ./ -R
cp ../LICENSE ./
#put it all into a tarbar
cd ..
tar cvzf pass.tar.gz pass-production
cd pass-production
#clean up the pass-production directory
rm examples lib ./bin/*.js ./bin/compiler/*.class -rf
cd ..
#done
echo "Pass compiler package is built and tared!\noutput files > pass.tar.gz"
sh
