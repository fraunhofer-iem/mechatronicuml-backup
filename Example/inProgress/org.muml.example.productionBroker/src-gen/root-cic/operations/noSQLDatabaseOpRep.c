
#include "operations.h"
/** Start of user code User includes **/ 

#include <stdio.h>
#include <stdlib.h>
#include "../database/database.h"



//global pointer for db and cursor TODO: alloc statically memory
unqlite *pDb; /* Database handle */
unqlite_kv_cursor *pCur; /* Cursor handle */


static const char zBanner[] =
{ "============================================================\n"
  "ReciepeBroker - MUML Demonstrator                           \n"
  "                                         http://www.muml.org\n"
  "============================================================\n" };

/**End of user code**/

int32_T noSQLDatabase_noSQLDatabaseInsertOrder(int32_T orderID, int32_T incredientID, int32_T amount){

/** Start of user code noSQLDatabase_noSQLDatabaseInsertOrder **/ 

	int32_T ret = 0;
	ret = insertOrder(pDb, orderID, incredientID, amount);
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseDeleteOrder(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseDeleteOrder **/ 
	int32_T ret = 0;
	ret = deleteOrder(pDb, orderID);
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseGetOrderIncredientID(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseGetOrderIncredientID **/ 
//@TODO: add your implementation here
#warning Missing implemenation of repository operation 'noSQLDatabase_noSQLDatabaseGetOrderIncredientID'
	//default return value
	int32_T ret = 0;
	ret = getOrderIncredientID(pDb, orderID);
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseGetOrderAmount(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseGetOrderAmount **/ 
//@TODO: add your implementation here
#warning Missing implemenation of repository operation 'noSQLDatabase_noSQLDatabaseGetOrderAmount'
	//default return value
	int32_T ret = 0;
	ret = getOrderAmount(pDb, orderID);
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseCreateDatabase(){

/** Start of user code noSQLDatabase_noSQLDatabaseCreateDatabase **/ 
		//int i,
		int rc;
		int orderID = 55655;
		int incredientID = 3556;
		int amount = 266;
		size_t nBytes;  //Data length
		char *zBuf;     //Dynamically allocated buffer

		puts(zBanner);

		/* Open our database*/
		rc = unqlite_open(&pDb, "testMe.db", UNQLITE_OPEN_CREATE);
		if (rc != UNQLITE_OK)
		{
			//Fatal(0, "Out of memory");
		}else{

			printf("DB created...\n");
			fflush(stdout);
		}
	int32_T ret = 0;
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder(int32_T orderID, int32_T productionStationID){

/** Start of user code noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder **/ 
//@TODO: add your implementation here
#warning Missing implemenation of repository operation 'noSQLDatabase_noSQLDatabaseDefineProductionStationForOrder'
	//default return value
	int32_T ret = 0;
	ret = defineProductionStationForOrder(pDb, orderID, productionStationID);
	return ret;
/**End of user code**/

}



int32_T noSQLDatabase_noSQLDatabaseSearchOrder(int32_T orderID){

/** Start of user code noSQLDatabase_noSQLDatabaseSearchOrder **/ 
//@TODO: add your implementation here
#warning Missing implemenation of repository operation 'noSQLDatabase_noSQLDatabaseSearchOrder'
	//default return value
	int32_T ret = 0;
	ret = searchOrder(pDb, orderID);
	return ret;
/**End of user code**/

}




