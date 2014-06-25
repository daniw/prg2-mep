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
mkdir html
for i in [0-9]*/; do mkdir html/$i; done

# convert files from markdown to html and correct links to other files
pandoc README.md > html/index.html
sed -i -e 's/.md/.md.html/g' html/index.html

for i in [0-9]*/*.md; do pandoc $i > html/$i.html; sed -i -e 's/.md/.md.html/g' -e 's/README/index/g' html/$i.html; done

