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
int searchOrder();
int deleteOrder(int orderID);

int main()
{
	createDatabase();
	insertOrder(1,2,3);
	int ingredientID = getOrderIngredientID(1);
	printf("2=%d \n",ingredientID);
	int amount = getOrderAmount(1);
	printf("3=%d \n",amount);
	defineProductionStationForOrder(1,1);
	int foundOrder = searchOrder();
	printf("FoundOrder=%d \n",foundOrder);
	insertOrder(4,5,6);
	foundOrder = searchOrder();
	printf("FoundOrder=%d \n",foundOrder);
	deleteOrder(1);
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
 * Inserts pair orderId and productionStation into the table ProductionStations
 * Sets status of the order in table Orders to 'InProduction'
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	int rc=0;
	sqlite3_stmt *orderStatusStmt;
	sqlite3_stmt *prodStationStmt;

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


	//Insert the production station into the Production Station Table
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
 * Deletes order from table Order and from table ProductionStations
 */
int deleteOrder(int orderID)
{
	int rc=0;
	sqlite3_stmt *deleteOrderPSStmt;
	sqlite3_stmt *deleteOrderStmt;

	//Prepare statement
	const char *deleteOrderPS = "Update Orders Set OrderID=-1 Where OrderID = ?;";

	rc = sqlite3_prepare_v2(db, deleteOrderPS,-1, &deleteOrderPSStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order deletion: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(deleteOrderPSStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Execute statement, once step is sufficient for deletions
	rc = sqlite3_step(deleteOrderPSStmt);
	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order deletion: %s\n", sqlite3_errmsg(db));
		return -1;
	}
	sqlite3_finalize(deleteOrderPSStmt);

	//Prepare statement
	const char *deleteOrder = "Delete from Orders Where OrderID = ?;";

	rc = sqlite3_prepare_v2(db, deleteOrder,-1, &deleteOrderStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order deletion: %s\n", sqlite3_errmsg(db));
		return rc;
	}

	//Bind parameters
	rc =sqlite3_bind_int(deleteOrderStmt, 1, orderID);
	if( rc ){
		fprintf(stderr, "Error for orderID: %s\n", sqlite3_errmsg(db));
		return rc;
	}
	//Execute statement, once step is sufficient for deletions
	rc = sqlite3_step(deleteOrderStmt);
	if( rc!=SQLITE_DONE ){
		fprintf(stderr, "Could not execute statement for order deletion: %s\n", sqlite3_errmsg(db));
		return -1;
	}

	sqlite3_finalize(deleteOrderStmt);
	printf("Successfully deleted order %d.\n", orderID);
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
int searchOrder()
{
	int rc=0;
	sqlite3_stmt *searchOrderStmt;

	//Prepare statement
	const char *searchOrder = "Select OrderID from Orders Where OrderStatus = 'IDLE';";

	rc = sqlite3_prepare_v2(db, searchOrder,-1, &searchOrderStmt,0);
	if( rc ){
		fprintf(stderr, "Could not prepare statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return -1;
	}

	//Execute statement
	rc = sqlite3_step(searchOrderStmt);
	//There should be a row of results
	if( rc!=SQLITE_ROW ){
		fprintf(stderr, "Could not execute statement for order retrieval: %s\n", sqlite3_errmsg(db));
		return -1;
	}

	int orderID = sqlite3_column_int(searchOrderStmt, 0);

	sqlite3_finalize(searchOrderStmt);
	printf("Successfully retrieved order %d with status IDLE.\n", orderID);
	return orderID;

}

