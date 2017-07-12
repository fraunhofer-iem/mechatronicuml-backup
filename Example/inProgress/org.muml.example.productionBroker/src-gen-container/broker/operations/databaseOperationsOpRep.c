
#include "databaseOperationsOpRep.h"
/** Start of user code User includes **/ 
#include "databaseConnector.c"

/**End of user code**/

int32_T databaseOperations_databaseOperationsInsertOrder(int32_T orderID, int32_T ingredientID, int32_T amount, int32_T timeout){

/** Start of user code databaseOperations_databaseOperationsInsertOrder **/ 
	return insertOrder(orderID, ingredientID, amount, timeout);
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsDeleteOrder(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsDeleteOrder **/ 
	return deleteOrder(orderID);
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsGetOrderIngredientID(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsGetOrderIngredientID **/ 
	return getOrderIngredientID(orderID);
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsGetOrderAmount(int32_T orderID){

/** Start of user code databaseOperations_databaseOperationsGetOrderAmount **/ 
	return getOrderAmount(orderID);
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID){

/** Start of user code databaseOperations_databaseOperationsDefineProductionStationForOrder **/ 
	return defineProductionStationForOrder(orderID, productionStationID);
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsSearchOrder(int32_T searchingPS, int32_T producibleIngredients){

/** Start of user code databaseOperations_databaseOperationsSearchOrder **/ 
	return searchOrder(searchingPS, producibleIngredients);
/**End of user code**/

}



int32_T databaseOperations_databaseOperationsHeartbeatProductionStation(int32_T psID){

/** Start of user code databaseOperations_databaseOperationsHeartbeatProductionStation **/ 
	return heartBeatProductionStation(psID);
/**End of user code**/

}




