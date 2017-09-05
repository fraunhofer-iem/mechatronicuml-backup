
#include "databaseOperationsOpRep.h"
/** Start of user code User includes **/ 
#include "databaseConnector.c"

/**End of user code**/

int32_T databaseOperations_databaseOperationsInsertOrder(int32_T orderID, int32_T ingredientID, int32_T amount, int32_T timeout){

/** Start of user code databaseOperations_databaseOperationsInsertOrder **/ 
	int32_T ret = insertOrder(orderID, ingredientID, amount, timeout);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsMarkOrderAsDone(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsMarkOrderAsDone **/ 
	int32_T ret = markOrderAsDone(orderID);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsGetOrderIngredientID(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsGetOrderIngredientID **/ 
	int32_T ret = getOrderIngredientID(orderID);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsGetOrderAmount(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsGetOrderAmount **/ 
	int32_T ret = getOrderAmount(orderID);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID){

/** Start of user code databaseOperations_databaseOperationsDefineProductionStationForOrder **/ 
	int32_T ret = defineProductionStationForOrder(orderID, productionStationID);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsSearchOrder(int32_T searchingPS, int32_T producibleIngredients){

/** Start of user code databaseOperations_databaseOperationsSearchOrder **/ 
	int32_T ret = searchOrder(searchingPS, producibleIngredients);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsHeartbeatProductionStation(int32_T psID){

/** Start of user code databaseOperations_databaseOperationsHeartbeatProductionStation **/ 
	int32_T ret = heartBeatProductionStation(psID);
	return ret;
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsMarkOrdersAsFailedForUnreachableStations(){

/** Start of user code databaseOperations_databaseOperationsMarkOrdersAsFailedForUnreachableStations **/ 
	int32_T ret = markOrdersAsFailedForUnreachableStations();
	return ret;
/**End of user code**/

}




