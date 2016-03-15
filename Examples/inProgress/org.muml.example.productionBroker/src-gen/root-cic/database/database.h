#ifndef DATABASE_H
#define DATABASE_H

#include <stdio.h>  /* puts() */
#include <stdlib.h> /* exit() */
/* Make sure this header file is available.*/
#include "unqlite.h"

/* function declaration */
int insertOrder(unqlite *pDb, int orderID, int incredientID, int amount);
int deleteOrder(unqlite *pDb, int orderID);
int searchOrder(unqlite *pDb, int orderID);
int getOrderIncredientID(unqlite *pDb, int orderID);
int getOrderAmount(unqlite *pDb, int orderID);
#endif
