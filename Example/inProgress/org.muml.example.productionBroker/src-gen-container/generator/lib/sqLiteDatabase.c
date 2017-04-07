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
int searchOrder(int orderID, int producibleIngredients);
int deleteOrder(int orderID);
void extractLogsAndExit();

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
    		 	 	 	 	 	 "CREATE TABLE ProductionStations (ProductionStationID INT, ProducibleIngredients TEXT);";

    rc = sqlite3_exec(db, sqlProdStation, callback, 0, &errMsg);
    if( rc ){
    	fprintf(stderr, "SQL error: %s\n", errMsg);
    	sqlite3_free(errMsg);
    	return(1);
    }

    //Create table OrderAllocation
    const char *sqlOrderAllocation = "DROP TABLE IF EXISTS OrderAllocation;"
    		 	 	 	 	 	 "CREATE TABLE OrderAllocation (ProductionStationID INT, OrderID INT);";

    rc = sqlite3_exec(db, sqlOrderAllocation, callback, 0, &errMsg);
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
 * Inserts pair orderId and productionStation into the table OrderAllocation
 * Sets status of the order in table Orders to 'InProduction'
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	int rc=0;
	sqlite3_stmt *orderStatusStmt;

	//Set status of the order
	const char *orderStatus = "Update Orders Set OrderStatus='InProduction' WHERE OrderID=?";

	rc = sqlite3_prepare_v2(db, orderStatus,-1, &orderStatusStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order status update: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Bind parameters
	rc= sqlite3_bind_int(orderStatusStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Execute statement, once step is sufficient for insertions
	rc = sqlite3_step(orderStatusStmt);
	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order status update: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	sqlite3_finalize(orderStatusStmt);


	//Insert the allocation into the OrderAllocation Table
	//Prepare statement
	const char *orderAllocation = "INSERT INTO OrderAllocation (ProductionStationID, OrderID) "
					"VALUES (?, ?);";
	sqlite3_stmt *orderAllocStmt;
	rc = sqlite3_prepare_v2(db, orderAllocation,-1, &orderAllocStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order allocation: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(orderAllocStmt, 1, productionStationID);
	if( rc ){
		fprintf(stderr, "Error for productionStationID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	rc= sqlite3_bind_int(orderAllocStmt, 2, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Execute statement, once step is sufficient for insertions
	rc = sqlite3_step(orderAllocStmt);

	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order allocation: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	sqlite3_finalize(orderAllocStmt);
	printf("Successfully defined production station %d for order %d.\n", productionStationID, orderID);
	return 0;
}


/**
 * Sets orderStatus to DONE
 */
int deleteOrder(int orderID)
{
	int rc=0;

	sqlite3_stmt *orderStatusStmt;

	//Set status of the order
	const char *orderStatus = "Update Orders Set OrderStatus='DONE' WHERE OrderID=?";

	rc = sqlite3_prepare_v2(db, orderStatus,-1, &orderStatusStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order status update: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Bind parameters
	rc= sqlite3_bind_int(orderStatusStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Execute statement, once step is sufficient for insertions
	rc = sqlite3_step(orderStatusStmt);
	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order status update: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	sqlite3_finalize(orderStatusStmt);

	printf("Successfully marked order %d as finished.\n", orderID);
	return 0;

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
int searchOrder(int orderId, int producibleIngredients)
{
	int rc=0;

	//Insert the Productionstation into the ProductionStation Table
	//Prepare statement
	const char *productionStation = "INSERT INTO ProductionStations (ProductionStationID, ProducibleIngredients) "
					"VALUES (?, ?);";
	sqlite3_stmt *prodStatStmt;
	rc = sqlite3_prepare_v2(db, productionStation,-1, &prodStatStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for production station insertion: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(prodStatStmt, 1, productionStationID);
	if( rc ){
		fprintf(stderr, "Error for productionStationID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	rc= sqlite3_bind_text(prodStatStmt, 2, producibleIngredients);
	if( rc ){
		fprintf(stderr, "Error for producibleIngredients: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Execute statement, once step is sufficient for insertions
	rc = sqlite3_step(prodStatStmt);

	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for production station insertion: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	sqlite3_finalize(prodStatStmt);
	printf("Successfully inserted production station %d.\n", productionStationID);


	sqlite3_stmt *searchOrderStmt;

	//Prepare statement
	const char *searchOrder = "Select OrderID from Orders Where OrderStatus = 'IDLE' and Ingredient=?;";

	rc = sqlite3_prepare_v2(db, searchOrder,-1, &searchOrderStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return -1;
	}
	//Bind parameters
	rc =sqlite3_bind_int(searchOrderStmt, 1, producibleIngredients);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Execute statement
	rc = sqlite3_step(searchOrderStmt);
	//No order found
	if (rc==SQLITE_DONE){
		printf("No order with status IDLE found.\n");
		sqlite3_finalize(searchOrderStmt);
		return -6; //Keep result code from unqlite so database implementations can be used interchangeably
	}
	//No results but also not done -> Something went wrong
	if( rc!=SQLITE_ROW ){
		fprintf(stderr, "Could not execute statement for order retrieval: %s\n", sqlite3_errmsg(db));
		sqlite3_finalize(searchOrderStmt);
		return -1;
	}
	//There are results
	int orderID = sqlite3_column_int(searchOrderStmt, 0);
	sqlite3_finalize(searchOrderStmt);
	printf("Successfully retrieved order %d with status IDLE.\n", orderID);
	return orderID;
}

/*
 * Extract the database error log and exit.
 */
void extractLogsAndExit()
{
	//Sqlite3 will print error logs to stderr by default, no need for extra operation
	// Exit immediately
	exit(0);
}
