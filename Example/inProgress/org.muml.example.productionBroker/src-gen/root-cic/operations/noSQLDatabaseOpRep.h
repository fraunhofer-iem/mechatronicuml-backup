#ifndef NOSQLDATABASE_H_
#define NOSQLDATABASE_H_
#ifdef __cplusplus
  extern "C" {
#endif

	#include "../types/standardTypes.h"
	#include "../types/customTypes.h"


			
		/**
		 * @brief Implementation stub of operation insertOrder
 		 * @details This function shall contain the implementation of the operation insertOrder.
		 * @param orderID @param incredientID @param amount 
		 */
		int32_T noSQLDatabase_noSQLDatabaseInsertOrder(int32_T orderID, int32_T incredientID, int32_T amount);
		/**
		 * @brief Implementation stub of operation deleteOrder
 		 * @details This function shall contain the implementation of the operation deleteOrder.
		 * @param orderID 
		 */
		int32_T noSQLDatabase_noSQLDatabaseDeleteOrder(int32_T orderID);
		/**
		 * @brief Implementation stub of operation getOrderIncredientID
 		 * @details This function shall contain the implementation of the operation getOrderIncredientID.
		 * @param orderID 
		 */
		int32_T noSQLDatabase_noSQLDatabaseGetOrderIncredientID(int32_T orderID);
		/**
		 * @brief Implementation stub of operation getOrderAmount
 		 * @details This function shall contain the implementation of the operation getOrderAmount.
		 * @param orderID 
		 */
		int32_T noSQLDatabase_noSQLDatabaseGetOrderAmount(int32_T orderID);
		/**
		 * @brief Implementation stub of operation createDatabase
 		 * @details This function shall contain the implementation of the operation createDatabase.
		 * 
		 */
		int32_T noSQLDatabase_noSQLDatabaseCreateDatabase();
		/**
		 * @brief Implementation stub of operation defineProductionStationForOrder
 		 * @details This function shall contain the implementation of the operation defineProductionStationForOrder.
		 * @param orderID @param productionStationID 
		 */
		int32_T noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID);
		/**
		 * @brief Implementation stub of operation searchOrder
 		 * @details This function shall contain the implementation of the operation searchOrder.
		 * @param orderID 
		 */
		int32_T noSQLDatabase_noSQLDatabaseSearchOrder(int32_T orderID);


#ifdef __cplusplus
  }
#endif
#endif /*NOSQLDATABASE_H_ */
