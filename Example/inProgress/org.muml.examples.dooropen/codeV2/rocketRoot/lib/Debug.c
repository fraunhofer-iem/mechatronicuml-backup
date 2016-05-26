/*
 * Debug.c
 *
 *  Created on: 15.06.2015
 *      Author: badrobot
 */

#include "Debug.h"
 
#ifdef C99

void printDebugInformation(char * debugInformation){

	printf("%lu : %s\n",clock(),debugInformation);
	fflush(stdout);
}
#endif /* C99 */

#ifdef ARDUINO
void printDebugInformation(char * debugInformation){

	Serial.println("%lu : %s\n",millis(),debugInformation);

}
#endif /* ARDUINO */

