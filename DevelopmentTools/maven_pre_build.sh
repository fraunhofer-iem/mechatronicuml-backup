#!/bin/bash
##
## Shell Script for Maven/Jenkins Installation
## manages copyright license 
## 
## Steps to execute this script in jenkins:
## 1) Go to the Job
## 2) Add Pre-Build-Step "Run shell script" 
## 3) Enter the following:
## "wget https://svn-serv.cs.upb.de/mechatronicuml/trunk/DevelopmentTools/maven_pre_build.sh
##  sh maven_pre_build.sh"


wget https://svn-serv.cs.upb.de/mechatronicuml/trunk/DevelopmentTools/PropertiesCheck.java
javac  PropertiesCheck.java
find $PWD -name "MANIFEST.MF" |while read fname
do
    sed -i 's/Bundle-Vendor:.*$/Bundle-Vendor: Software Engineering Group, Heinz Nixdorf Institute, Paderborn University, and Fraunhofer Research Institution for Mechatronic Systems Design IEM, Germany/' $fname
done


find $PWD -name "feature.xml" |while read fname
do
    java -cp . PropertiesCheck $fname
done