
#include "iDManagementOpRep.h"
/** Start of user code User includes **/ 
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include "cJSON.h"
/**End of user code**/

int32_T IDManagement_iDManagementGetID(){

/** Start of user code IDManagement_iDManagementGetID **/ 
	int32_T ID;
	srand(clock());
	ID = rand();
	printf("Generated random id: %ld\n",ID);
	return ID;
/**End of user code**/

}




