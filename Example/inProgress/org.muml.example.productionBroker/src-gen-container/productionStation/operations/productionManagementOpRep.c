
#include "productionManagementOpRep.h"
/** Start of user code User includes **/ 
#include <time.h>

/**End of user code**/

int32_T ProductionManagement_productionManagementGetProducibleIngredients(){

/** Start of user code ProductionManagement_productionManagementGetProducibleIngredients **/ 
	//default return value
	int32_T ret = 0;
	
	srand(clock());
	int32_T ret = rand()%6;
	printf("Ingredience:%d",ret);
	return ret;

/**End of user code**/

}




