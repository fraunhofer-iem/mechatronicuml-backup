#!/bin/bash
##
## Shell Script Buckinster Test Commando generation
## Orignal Script by
## Author: Benjamin
## Last-Modification-Date: 2014-05-14
## under https://sdqweb.ipd.kit.edu/wiki/Palladio_Build_Infrastructure
## modified by Andreas for our Buckminster/Jenkins installation
## creates a build_command.txt for buckminster to execute the JUnit tests
## 
## Steps to execute this script in jenkins:
## 1) Go to the Job
## 2) Add Build-Step "Run shell script" 
## 3) Enter "sh /data/jenkins/jenkins_junit.sh"
## 4) Add Build-Step "Run Buckminster"
## 5) In the field Script-File enter "build_command.txt"
## 6) Add Post-Build Step "Publish Test Result"
## 7) In the Path-Field enter "output/junit/*.xml"
##
##
## Steps to update the script on jenkins:
## 1) Copy new Version to /data/jenkins
## 2) set rights for jenkins user
## 3) set executable
##
## 
 
if [ -e build_command.txt ]
then
        cat /dev/null > build_command.txt
else
        touch build_command.txt
fi
find -name "*.test*.launch" |
while read filename
do
 directory=`dirname $filename | xargs -I{} basename {}`
 name=`basename $filename`
 echo "junit -t 120 -l'$directory/$name' -o 'output/junit/$name.xml'"  >> build_command.txt
done
