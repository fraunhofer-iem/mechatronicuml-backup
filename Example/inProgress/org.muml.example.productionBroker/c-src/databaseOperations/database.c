/*
 * Compile this file together with the UnQLite database engine source code
 * to generate the executable. For example:
 *  gcc -W -Wall -O6 unqlite_kv_intro.c unqlite.c -o unqlite_kv
 */
/*
 * This simple program is a quick introduction on how to embed and start
 * experimenting with UnQLite without having to do a lot of tedious
 * reading and configuration.
 *
 * Introduction to the Key/Value Store Interfaces:
 *
 * UnQLite is a standard key/value store similar to BerkeleyDB, Tokyo Cabinet, LevelDB, etc.
 * But, with a rich feature set including support for transactions (ACID), concurrent reader, etc.
 * Under the KV store, both keys and values are treated as simple arrays of bytes, so content
 * can be anything from ASCII strings, binary blob and even disk files.
 *
 * For an introduction to the UnQLite C/C++ interface, please refer to:
 *        http://unqlite.org/api_intro.html
 * For the full C/C++ API reference guide, please refer to:
 *        http://unqlite.org/c_api.html
 * UnQLite in 5 Minutes or Less:
 *        http://unqlite.org/intro.html
 *
 */
#include <stdio.h>  /* puts() */
#include <stdlib.h> /* exit() */
#include <string.h> /* strchr(), strlen(), .. */
/* Make sure this header file is available.*/
#include "unqlite.h"


/* Pointer to data base file */
unqlite *pDb;
int startSearch=0;



/**
 *  Opens a database and creates an new one, if no 'test.db' file is existent
 **/
int createDatabase()
{
	int rc;

	 rc = unqlite_open(&pDb,"test.db",UNQLITE_OPEN_TEMP_DB);
	 if( rc != UNQLITE_OK )
	 {
		 printf("Database could not be created. Return code: %d\n",rc);
		 return rc;
	 }
	 printf("Database successfully created. \n");
	 return 0;
}

/**
 * Inserts and order with its ID, ingredient and amount.
 * If any insertion fails, the entire transaction is
 * rolled back.
 * If all insertions are successful, the transaction is automatically
 * committed.
 * Keys are in the format "orderID:42:ingredient", respectively logic
 * for logic.
 */
int insertOrder(int orderID, int ingredientID, int amount)
{
	int rc; //return code

	char orderIDingredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":ingredient")];
	char ingredientBuffer[sizeof("ingredientID:") + sizeof(int)];

	sprintf(orderIDingredientBuffer, "orderID:%d:ingredient", orderID);
	sprintf(ingredientBuffer, "ingredientID:%d", ingredientID);


	//Insert order with ingredient
	rc = unqlite_kv_store(pDb, orderIDingredientBuffer, -1, ingredientBuffer,
			sizeof(ingredientBuffer));
	if (rc != UNQLITE_OK)
	{
		unqlite_rollback(pDb);
		printf("Error while inserting ingredient: %s\n",orderIDingredientBuffer);
		return rc;
	}
	else
	{
		printf("Successfully inserted ingredient: %s\n",orderIDingredientBuffer);
	}
	//Insert order with amount
	char orderIDamountBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":amount")];
	char amountBuffer[sizeof("amount:") + sizeof(int)];
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);
	sprintf(amountBuffer, "amount:%d", amount);
	rc = unqlite_kv_store(pDb, orderIDamountBuffer, -1, amountBuffer,
			sizeof(amountBuffer));
	if (rc != UNQLITE_OK)
	{
		unqlite_rollback(pDb);
		printf("Error while inserting amount: %s\n",orderIDamountBuffer);
		return rc;
	}
	unqlite_commit(pDb);
	printf("Successfully inserted amount: %s\n",orderIDamountBuffer);
	return rc;
}


/**
 * Inserts key-value pair for orderId and productionStation.
 * Rolls back transaction when insert fails.
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	int rc;

	char orderIDProductionStationBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":productionStation")];
	char productionStationBuffer[sizeof("productionStationID:") + sizeof(int)];

	sprintf(orderIDProductionStationBuffer, "orderID:%d:productionStation", orderID);
	sprintf(productionStationBuffer, "productionStationID:%d", productionStationID);

	rc = unqlite_kv_store(pDb, orderIDProductionStationBuffer, -1, productionStationBuffer,
			sizeof(productionStationBuffer));
	if (rc != UNQLITE_OK)
	{
		unqlite_rollback(pDb);
		printf("Error while inserting production station: %s\n",orderIDProductionStationBuffer);
		return rc;
	}
	unqlite_commit(pDb);
	printf("Successfully inserted production station: %s\n",orderIDProductionStationBuffer);
	return rc;
}


/**
 * Deletes order including ingredient, amount and production station
 */
int deleteOrder(int orderID)
{
	int rc;

	//Delete order and ingredient combination
	char orderIDingredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":ingredient")];

	sprintf(orderIDingredientBuffer, "orderID:%d:ingredient", orderID);

	rc = unqlite_kv_delete(pDb, orderIDingredientBuffer, -1);
	if (rc != UNQLITE_OK)
	{
		// Deletion failed, roll back and output error
		unqlite_rollback(pDb);
		printf("Error while deleting order with ingredient: %s\n",orderIDingredientBuffer);
		return rc;
	}


	//Delete order and amount combination
	char orderIDamountBuffer[sizeof("orderID:") + sizeof(int)
				+ sizeof(":amount")];
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);

	rc = unqlite_kv_delete(pDb, orderIDamountBuffer, -1);
	if (rc != UNQLITE_OK)
	{
		// Deletion failed, roll back and output error
		unqlite_rollback(pDb);
		printf("Error while deleting order with amount: %s\n",orderIDamountBuffer);
		return rc;
	}

	//Delete order and production station combination
	char orderIDProductionStationBuffer[sizeof("orderID:") + sizeof(int)
				+ sizeof(":productionStation")];
	sprintf(orderIDProductionStationBuffer, "orderID:%d:productionStation", orderID);

	rc = unqlite_kv_delete(pDb, orderIDProductionStationBuffer, -1);
	if (rc != UNQLITE_OK)
	{
		printf("Delete Error for %s\n",orderIDProductionStationBuffer);
		if (rc == UNQLITE_NOTFOUND)
		{
			//Deletion needs to be possible if there was no production station
			printf("No production station for Order %d \n", orderID);
		}
		else
		{
			// Deletion failed, roll back and output error
			unqlite_rollback(pDb);
			printf("Error while deleting order with production station: %s\n",orderIDProductionStationBuffer);
			return rc;
		}
	}
	unqlite_commit(pDb);
	printf("Order %d successfully deleted. \n", orderID);

	return UNQLITE_OK;

}
/**
 * Retrieve the ingredientID for the order with the given id.
 */
int getOrderIngredientID(int orderID)
{
	int rc;
	size_t nBytes;  //Data length
	char *zBuf;     //Dynamically allocated buffer

	char orderIDingredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":ingredient")];

	sprintf(orderIDingredientBuffer, "orderID:%d:ingredient", orderID);


	rc = unqlite_kv_fetch(pDb, orderIDingredientBuffer, -1, NULL, &nBytes);
	if (rc != UNQLITE_OK)
	{
		printf("Reading failed. \n");
		printf("Return code: %d\n",rc);
		return rc;
	}

	printf("Successfully read from database. \n");


	//Allocate a buffer big enough to hold the record content
	zBuf = (char *) malloc(nBytes);
	if (zBuf == NULL)
	{
		printf("Reading failed, because buffer for records could not be allocated. \n");
	}
	//Read Database and Copy record content in our buffer
	rc = unqlite_kv_fetch(pDb, orderIDingredientBuffer, -1, zBuf, &nBytes);
	const char ch = ':';
	char *ret;
	ret = strchr(zBuf, ch);
	memmove(ret, ret + 1, strlen(ret));
	int ingredientID = atoi(ret);
	printf("IngredientID:%d\n", ingredientID);

	free(zBuf);

	return ingredientID;

}


int getOrderAmount(int orderID)
{
	int rc;
	size_t nBytes;  //Data length
	char *zBuf;     //Dynamically allocated buffer

	//construct key for noSQL Database
	char orderIDamountBuffer[sizeof("orderID:")+sizeof(int)+sizeof(":amount")];
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);

	/*Get amount for the orderID record*/
	printf("Trying to retrieve amount for %s \n",orderIDamountBuffer);
	rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, NULL, &nBytes);
	if (rc < UNQLITE_OK)
	{
		// Fetch failed
		printf("Reading failed. Return code: %d\n",rc);
		return rc;
	}

	printf("Record Found for OrderID: %d\n",orderID);

	//Allocate a buffer big enough to hold the record content
	zBuf = (char *) malloc(nBytes);
	if (zBuf == NULL)
	{
		printf("Error: Buffer was empty.\n");
	}
	//Copy record content in our buffer
	rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, zBuf, &nBytes);
	//Find Position of ":"
	const char ch = ':';
	char *ret;
	printf("zBuf=%s\n", zBuf);
	//remove all characters before ":"
	ret = strchr(zBuf, ch);
	//remove first character which should be ":"
	memmove(ret, ret + 1, strlen(ret));
	// convert character that represents the amount for  the orderID into int
	int amount = atoi(ret);
	printf("Amount:%d\n", amount);

	free(zBuf);

	return amount;

}
/**
 * Searches an order without a production station assigned
 */
int searchOrder(int latestOrderID)
{
	int rc;
	size_t nBytes;

	printf("Searching for an unassigned order with ID up to %d\n",latestOrderID);

	for (int i=startSearch; i<latestOrderID; i++){

		//Check amount if that order even still exists
		char orderIDamountBuffer[sizeof("orderID:")+sizeof(int)+sizeof(":amount")];
		sprintf(orderIDamountBuffer, "orderID:%d:amount", i);

		rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, NULL, &nBytes);
		if (rc == UNQLITE_NOTFOUND)
		{
			// That order does not exist anymore. Next time we can start searching
			// from the next index on
			startSearch=i+1;
			break;
		}
		else if (rc < 0){
			//There is some other problem, stop searching
			printf("Error during search for unassigned order, return code:%d\n", rc);
			return rc;
		}
		if (rc == 0){
			//We found an existent order

			char orderIDProductionStationBuffer[sizeof("orderID:") + sizeof(int)
						+ sizeof(":productionStation")];
			sprintf(orderIDProductionStationBuffer, "orderID:%d:productionStation", i);

			rc = unqlite_kv_fetch(pDb, orderIDProductionStationBuffer, -1, NULL, &nBytes);
			if (rc == UNQLITE_NOTFOUND)
			{
				//Jackpot. This is an order which exists, but does not have a production station.
				return i;
			}
			else if (rc < 0){
				//There is some other problem, stop searching
				printf("Error during search for unassigned order, return code:%d\n", rc);
				return rc;
			}
		}

	}
	//So we tried all possible orders, but everything has a production station already
	return UNQLITE_NOTFOUND;

}



/*
 * Extract the database error log and exit.
 */
static void extractLogsAndExit()
{
	if (pDb)
	{
		const char *zErr;
		int iLen = 0; /* Stupid cc warning */

		/* Extract the database error log */
		unqlite_config(pDb, UNQLITE_CONFIG_ERR_LOG, &zErr, &iLen);
		if (iLen > 0)
		{
			/* Output the DB error log */
			puts(zErr); /* Always null termniated */
		}
	}
	/* Manually shutdown the library */
	unqlite_lib_shutdown();
	/* Exit immediately */
	exit(0);
}
