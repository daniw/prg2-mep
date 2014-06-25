#!/bin/bash

###############################################################################
### Script to convert markdown files to html files and change links 
### to the corresponding html files. 
###
### dependencies: 
###     pandoc
###############################################################################

# change to current directory
cd $PWD

# create folder for html files
rm -rf html
mkdir html
for i in [0-9]*/; do mkdir html/$i; done

# convert files from markdown to html and correct links to other files
pandoc -s README.md > html/index.md.html
sed -i -e 's/.md/.md.html/g' html/index.md.html

for i in [0-9]*/*.md; do pandoc -s $i > html/$i.html; sed -i -e 's/.md/.md.html/g' -e 's/README/index/g' html/$i.html; done
