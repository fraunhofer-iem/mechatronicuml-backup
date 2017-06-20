
#include "iDManagementOpRep.h"
/** Start of user code User includes **/ 
#include <stdio.h>
#include <time.h>


/**End of user code**/

int32_T IDManagement_iDManagementGetID(){

/** Start of user code IDManagement_iDManagementGetID **/ 
//@TODO: add your implementation here
	srand(clock());
	int32_T ret = rand();
	printf("RandNr:%d",ret);
	return ret;
/**End of user code**/
}




