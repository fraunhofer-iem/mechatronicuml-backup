/*
 * Compile this file together with the sqlite database engine source code
 * to generate the executable. 
 *
 */
 
 
#include <stdio.h>  /* puts() */
#include <stdlib.h> /* exit() */
#include <string.h> /* strchr(), strlen(), .. */
#include "sqlite3.h"

/* Pointer to database */
sqlite3 *db;

int createDatabase();
int insertOrder(int orderId, int ingredientID, int amount);
int defineProductionStationForOrder(int orderID, int productionStationID);
int getOrderIngredientID(int orderID);
int getOrderAmount(int orderID);

int main()
{
	createDatabase();
	insertOrder(1,2,3);
	int ingredientID = getOrderIngredientID(1);
	printf("2=%d \n",ingredientID);
	int amount = getOrderAmount(1);
	printf("3=%d \n",amount);
	defineProductionStationForOrder(1,1);
	sqlite3_close(db);
	return 0;
}


static int callback(void *NotUsed, int argc, char **argv, char **azColName)
{
    int i;
    for(i=0; i<argc; i++){
      printf("%s = %s\n", azColName[i], argv[i] ? argv[i] : "NULL");
    }
    printf("\n");
    return 0;
}

/**
 *  Opens a database and creates an new one, if no 'test.db' file is existent
 **/
int createDatabase()
{
	int rc;
	char *errMsg=0;
	
	rc = sqlite3_open("test", &db);
    if( rc ){
      fprintf(stderr, "Can't open database: %s\n", sqlite3_errmsg(db));
      sqlite3_close(db);
      return(1);
    }

    //Create table Orders
    const char *sqlOrders = "DROP TABLE IF EXISTS Orders;"
    				   "CREATE TABLE Orders (OrderID INT, Ingredient INT, Amount INT, OrderStatus TEXT, OrderTime INT, ProductionTime INT);";

    rc = sqlite3_exec(db, sqlOrders, callback, 0, &errMsg);
    if( rc ){
    	fprintf(stderr, "SQL error: %s\n", errMsg);
    	sqlite3_free(errMsg);
    	return(1);
    }
    //Create table productionStations
    const char *sqlProdStation = "DROP TABLE IF EXISTS ProductionStations;"
    		 	 	 	 	 	 "CREATE TABLE ProductionStations (ProductionStationID INT, OrderID INT);";

    rc = sqlite3_exec(db, sqlProdStation, callback, 0, &errMsg);
    if( rc ){
    	fprintf(stderr, "SQL error: %s\n", errMsg);
    	sqlite3_free(errMsg);
    	return(1);
    }

	printf("Database successfully created. \n");
	return 0;
}

/**
 * Inserts and order with its ID, ingredient and amount and initial status "IDLE"
 * and the current time as orderTime
 */
int insertOrder(int orderID, int ingredientID, int amount)
{
	int rc=0;
	char *errMsg=0;
	sqlite3_stmt *orderInsertionStmt;

	//Prepare statement
	const char *orderInsertion = "INSERT INTO Orders (OrderID, Ingredient, Amount, OrderStatus, OrderTime) "
					"VALUES (?, ?, ?, 'IDLE', datetime('now'));";

	rc = sqlite3_prepare_v2(db,orderInsertion,-1, &orderInsertionStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order insertion: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc= sqlite3_bind_int(orderInsertionStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	rc =sqlite3_bind_int(orderInsertionStmt, 2, ingredientID);
	if( rc ){
		fprintf(stderr, "Error for ingredientID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	rc = sqlite3_bind_int(orderInsertionStmt, 3, amount);
	if( rc ){
		fprintf(stderr, "Error for amount: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Execute statement, once step is sufficient for insertions
	rc = sqlite3_step(orderInsertionStmt);

	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order insertion: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	sqlite3_finalize(orderInsertionStmt);
	printf("Successfully inserted order: %d\n",orderID);
	return 0;
}


/**
 * Inserts pair orderId and productionStation.
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	int rc=0;
	sqlite3_stmt *prodStationStmt;

	//Prepare statement
	const char *prodStation = "INSERT INTO ProductionStations (ProductionStationID, OrderID) "
					"VALUES (?, ?);";

	rc = sqlite3_prepare_v2(db, prodStation,-1, &prodStationStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order insertion: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(prodStationStmt, 1, productionStationID);
	if( rc ){
		fprintf(stderr, "Error for productionStationID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	rc= sqlite3_bind_int(prodStationStmt, 2, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Execute statement, once step is sufficient for insertions
	rc = sqlite3_step(prodStationStmt);

	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order insertion: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	sqlite3_finalize(prodStationStmt);
	printf("Successfully defined ProductionStation %d for order %d.\n", productionStationID, orderID);
	return 0;
}


/**
 * Deletes order including ingredient, amount and production station
 */
int deleteOrder(int orderID)
{
	int rc=0;

	//Delete order and ingredient combination
	/*char orderIDingredientBuffer[sizeof("orderID:") + sizeof(int)
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
	printf("Order %d successfully deleted. \n", orderID); */

	return rc;

}
/**
 * Retrieve the ingredientID for the order with the given id.
 */
int getOrderIngredientID(int orderID)
{
	int rc=0;
	sqlite3_stmt *getIngredientStmt;

	//Prepare statement
	const char *getIngredient = "Select Ingredient from Orders Where OrderID = ?;";

	rc = sqlite3_prepare_v2(db, getIngredient,-1, &getIngredientStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(getIngredientStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Execute statement, once step is sufficient for insertions

	rc = sqlite3_step(getIngredientStmt);
	//There should be a row of results
	if( rc!=SQLITE_ROW ){
		fprintf(stderr, "Could not execute statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return -1;
	}

	int ingredientID = sqlite3_column_int(getIngredientStmt, 0);

	sqlite3_finalize(getIngredientStmt);

	printf("Successfully retrieved ingredientID %d for order %d.\n", ingredientID, orderID);

	return ingredientID;
}


int getOrderAmount(int orderID)
{
	int rc=0;
	sqlite3_stmt *getAmountStmt;

	//Prepare statement
	const char *getAmount = "Select Amount from Orders Where OrderID = ?;";

	rc = sqlite3_prepare_v2(db, getAmount,-1, &getAmountStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(getAmountStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Execute statement, once step is sufficient for insertions

	rc = sqlite3_step(getAmountStmt);
	//There should be a row of results
	if( rc!=SQLITE_ROW ){
		fprintf(stderr, "Could not execute statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return -1;
	}

	int amount = sqlite3_column_int(getAmountStmt, 0);

	sqlite3_finalize(getAmountStmt);

	printf("Successfully retrieved amount %d for order %d.\n", amount, orderID);

	return amount;
}
/**
 * Searches an order without a production station assigned
 */
int searchOrder(int latestOrderID)
{
	int rc; /*
	size_t nBytes;

	printf("Searching for an unassigned order with ID up to %d\n",latestOrderID);

	for (int i=startSearch; i<=latestOrderID; i++){

		//Check amount if that order even still exists
		char orderIDamountBuffer[sizeof("orderID:")+sizeof(int)+sizeof(":amount")];
		sprintf(orderIDamountBuffer, "orderID:%d:amount", i);

		rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, NULL, &nBytes);
		if (rc == UNQLITE_NOTFOUND)
		{
			// That order does not exist anymore.
			// If this is where we would start searching, we could search from the next index on
			if (i==startSearch){
				printf("Increasing startSearch to %d \n",i+1);
				startSearch=i+1;
			}
			continue;
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
				printf("Found existent order without production station. OrderId=%d\n",i);
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
	printf("No unassigned order found.\n");
	return UNQLITE_NOTFOUND; */

	return 0;

}

