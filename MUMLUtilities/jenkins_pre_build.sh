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
function junit_test(){
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
	if [[ $name != *.ui* ]] 
	then
	        echo "junit -t 120 -l '$directory/$name' -o 'output/junit/$name.xml'"  >> build_command.txt
	fi
	done
}

function manifest_vendor(){
	find $PWD -name "MANIFEST.MF" |while read fname
	do
		sed -i 's/Bundle-Vendor:\s*$/Bundle-Vendor: Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT/' $fname
	done

	find $PWD -name "plugin.properties" |while read fname
	do
		sed -i 's/Bundle-Vendor: www\.example\.org/Bundle-Vendor: Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT/' $fname
	done
}

function feature_provider(){
	find $PWD -name "feature.properties" |while read fname
	do
		sed -i 's/providerName=\s*$/providerName=Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT/' $fname
		sed -i 's/license=\s*$/license=Fujaba Licence Agreement\\n July 21, 2012\\n\\n This feature is free software; you can redistribute and\/or modify it under the terms of the Eclipse Public License (EPL) as published by the Eclipse Foundation. You can access the full text of the license agreement under http:\/\/www.eclipse.org\/legal\/epl-v10.html \\n This feature is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE./' $fname
		sed -i 's/copyright=\s*$/copyright=Copyright (C) Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany \\n All rights reserved. This program and the accompanying materials\\n are made available under the terms of the Eclipse Public License v1.0\\n which accompanies this distribution, and is available at\\n http:\/\/www.eclipse.org\/legal\/epl-v10.html/' $fname
	done
}

manifest_vendor
feature_provider
junit_test
