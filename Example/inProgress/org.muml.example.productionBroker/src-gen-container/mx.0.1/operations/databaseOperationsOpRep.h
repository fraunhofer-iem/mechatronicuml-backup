#ifndef DATABASEOPERATIONS_H_
#define DATABASEOPERATIONS_H_
#ifdef __cplusplus
  extern "C" {
#endif

	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"


			
		/**
		 * @brief Implementation stub of operation insertOrder
 		 * @details This function shall contain the implementation of the operation insertOrder.
		 * @param orderID @param ingredientID @param amount 
		 */
		int32_T databaseOperations_databaseOperationsInsertOrder(int32_T orderID, int32_T ingredientID, int32_T amount);
		/**
		 * @brief Implementation stub of operation deleteOrder
 		 * @details This function shall contain the implementation of the operation deleteOrder.
		 * @param orderID 
		 */
		int32_T databaseOperations_databaseOperationsDeleteOrder(int32_T orderID);
		/**
		 * @brief Implementation stub of operation getOrderIngredientID
 		 * @details This function shall contain the implementation of the operation getOrderIngredientID.
		 * @param orderID 
		 */
		int32_T databaseOperations_databaseOperationsGetOrderIngredientID(int32_T orderID);
		/**
		 * @brief Implementation stub of operation getOrderAmount
 		 * @details This function shall contain the implementation of the operation getOrderAmount.
		 * @param orderID 
		 */
		int32_T databaseOperations_databaseOperationsGetOrderAmount(int32_T orderID);
		/**
		 * @brief Implementation stub of operation createDatabase
 		 * @details This function shall contain the implementation of the operation createDatabase.
		 * 
		 */
		int32_T databaseOperations_databaseOperationsCreateDatabase();
		/**
		 * @brief Implementation stub of operation defineProductionStationForOrder
 		 * @details This function shall contain the implementation of the operation defineProductionStationForOrder.
		 * @param orderID @param productionStationID 
		 */
		int32_T databaseOperations_databaseOperationsDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID);
		/**
		 * @brief Implementation stub of operation searchOrder
 		 * @details This function shall contain the implementation of the operation searchOrder.
		 * @param orderID @param producibleIngredients 
		 */
		int32_T databaseOperations_databaseOperationsSearchOrder(int32_T orderID, int32_T producibleIngredients);


#ifdef __cplusplus
  }
#endif
#endif /*DATABASEOPERATIONS_H_ */
