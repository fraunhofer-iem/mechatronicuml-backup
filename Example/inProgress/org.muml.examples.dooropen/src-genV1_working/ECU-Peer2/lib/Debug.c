/*
 * Debug.c
 *
 *  Created on: 15.06.2015
 *      Author: badrobot
 */

#include "../../../src-genV1_working/ECU-Peer2/lib/Debug.h"
 

void printDebugInformation(char * debugInformation){

	printf("%lu : %s\n",clock(),debugInformation);
	fflush(stdout);
}
