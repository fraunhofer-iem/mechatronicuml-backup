
#include "iDManagementOpRep.h"
#include <stdio.h>
#include <time.h>
/** Start of user code User includes **/ 


/**End of user code**/

int32_T IDManagement_iDManagementGetID(){

/** Start of user code IDManagement_iDManagementGetID **/ 
//@TODO: add your implementation here
#warning Missing implemenation of repository operation 'IDManagement_iDManagementGetID'
	//default return value
  srand(clock());
	int32_T ret = rand();
	printf("RandNr:%d",ret);
	return ret;
/**End of user code**/

}




