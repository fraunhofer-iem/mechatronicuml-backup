#!/bin/sh
noOfProd=$1

for prodID in `seq 1 $noOfProd`;
do
   	#Make a new folder on the basis of the folder called 'productionStation'
	cp -rf productionStation/ productionStation$prodID/
	#In IDManagement replace the return, so this will return prodID as the ID
	sed  -i 's/int32_T\sret\s=\s0\;/int32_T ret = '$prodID'\;/g' productionStation$prodID/operations/iDManagementOpRep.c
	#Compile the code
	cd productionStation$prodID
	make
	./app > out.txt &
	cd ..
done