
#include "databaseOperationsOpRep.h"
/** Start of user code User includes **/
#include "sqLiteDatabase.c"

/**End of user code**/

int32_T databaseOperations_databaseOperationsInsertOrder(int32_T orderID, int32_T ingredientID, int32_T amount){

/** Start of user code databaseOperations_databaseOperationsInsertOrder **/
	int32_T ret = insertOrder(orderID, ingredientID, amount);
	if (ret != 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsDeleteOrder(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsDeleteOrder **/
	int32_T ret = deleteOrder(orderID);
	if (ret != 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsGetOrderIngredientID(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsGetOrderIngredientID **/
	int32_T ret = getOrderIngredientID(orderID);
	if (ret < 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsGetOrderAmount(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsGetOrderAmount **/
	int32_T ret = getOrderAmount(orderID);
	if (ret < 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsCreateDatabase(){

/** Start of user code databaseOperations_databaseOperationsCreateDatabase **/
	int32_T ret = createDatabase();
	if (ret != 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID){

/** Start of user code databaseOperations_databaseOperationsDefineProductionStationForOrder **/
	int32_T ret = defineProductionStationForOrder(orderID, productionStationID);
	if (ret < 0){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsSearchOrder(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsSearchOrder **/
	int32_T ret = searchOrder(orderID);
	//Normally everything below zero is an error code.
	//Here it's possible we don't find an order to assign and it's not an error
	if (ret < 0 && ret != -6){
		extractLogsAndExit();
	}
	return ret;
/**End of user code**/

}




