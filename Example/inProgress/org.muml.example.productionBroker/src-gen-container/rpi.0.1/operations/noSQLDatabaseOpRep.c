
#include "noSQLDatabaseOpRep.h"
/** Start of user code User includes **/ 
#include "database.c"


/**End of user code**/

int32_T noSQLDatabase_noSQLDatabaseInsertOrder(int32_T orderID, int32_T ingredientID, int32_T amount){


/** Start of user code noSQLDatabase_noSQLDatabaseInsertOrder **/ 
//@TODO: add your implementation here
	int32_T ret = insertOrder(orderID, ingredientID, amount);
	if (ret != 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseDeleteOrder(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseDeleteOrder **/ 
	int32_T ret = deleteOrder(orderID);
	if (ret != 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseGetOrderIngredientID(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseGetOrderIngredientID **/ 
	int32_T ret = getOrderIngredientID(orderID);
	if (ret < 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseGetOrderAmount(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseGetOrderAmount **/ 
	int32_T ret = getOrderAmount(orderID);
	if (ret < 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseCreateDatabase(){

/** Start of user code noSQLDatabase_noSQLDatabaseCreateDatabase **/ 
	int32_T ret = createDatabase();
	if (ret != 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID){

/** Start of user code noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder **/ 
	int32_T ret = defineProductionStationForOrder(orderID, productionStationID);
	if (ret < 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseSearchOrder(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseSearchOrder **/ 
//@TODO: add your implementation here
#warning Missing implemenation of repository operation 'noSQLDatabase_noSQLDatabaseSearchOrder'
	//default return value
	int32_T ret = 0;
	return ret;
/**End of user code**/

}
