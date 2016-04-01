#!/bin/bash
##
## Shell Script Buckinster Test Commando generation @adann
## for our Buckminster/Jenkins installation
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


function build_command(){
	svn co https://svn-serv.cs.upb.de/mechatronicuml/trunk/DevelopmentTools/build.execution
	QUERY=$(find . -maxdepth 2 -iname "*.cquery" -printf "%P")
	XTEND=$(find . -iname "*.xtend")
	BUILDCOMMAND="build -c"
	if [ -n "$XTEND" ] 
	then
		$BUILDCOMMAND="build -c --continueonerror
launch -l build.execution/New_configuration.launch --stdout --stderr
build"
	fi
	cat <<EOF > build_command.txt
importtargetdefinition -A 'https://svn-serv.cs.upb.de/mechatronicuml/trunk/UpdateSite/de.uni_paderborn.fujaba.targetPlatformBuild/headless.target'
import $QUERY
$BUILDCOMMAND
perform -D target.os=* -D target.ws=* -D target.arch=* ${QUERY%/*}#site.p2
EOF
}
 
function junit_test(){
	if [ -e build_command.txt ]
	then
	        cat /dev/null > junit_command.txt
	else
	        touch junit_command.txt
	fi
	find -name "*.test*.launch" |
	while read filename
	do
	 directory=`dirname $filename | xargs -I{} basename {}`
	 name=`basename $filename`
	if [[ $name != *.ui* ]] 
	then
	        echo "junit -t 120 -l '$directory/$name' -o 'output/junit/$name.xml'"  >> junit_command.txt
	fi
	done
}

function manage_copyright_license_vendor(){
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
}


manage_copyright_license_vendor
build_command
junit_test
