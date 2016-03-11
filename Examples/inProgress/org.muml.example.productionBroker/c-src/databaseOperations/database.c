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
 * The KV store layer is presented to host applications via a set of interfaces, these includes:
 * unqlite_kv_store(), unqlite_kv_append(), unqlite_kv_fetch_callback(), unqlite_kv_append_fmt(),
 * unqlite_kv_delete(), unqlite_kv_fetch(), etc.
 *
 * For an introduction to the UnQLite C/C++ interface, please refer to:
 *        http://unqlite.org/api_intro.html
 * For the full C/C++ API reference guide, please refer to:
 *        http://unqlite.org/c_api.html
 * UnQLite in 5 Minutes or Less:
 *        http://unqlite.org/intro.html
 * The Architecture of the UnQLite Database Engine:
 *        http://unqlite.org/arch.html
 * For an introduction to the UnQLite cursor interface, please refer to:
 *        http://unqlite.org/c_api/unqlite_kv_cursor.html
 * For an introduction to Jx9 which is the scripting language which power
 * the Document-Store interface to UnQLite, please refer to:
 *        http://unqlite.org/jx9.html
 */
/* $SymiscID: unqlite_kv_intro.c v1.0 FreeBSD 2013-05-14 10:17 stable <chm@symisc.net> $ */
/*
 * Make sure you have the latest release of UnQLite from:
 *  http://unqlite.org/downloads.html
 */
#include <stdio.h>  /* puts() */
#include <stdlib.h> /* exit() */
/* Make sure this header file is available.*/
#include "unqlite.h"

/* function declaration */
int insertOrder(unqlite *pDb, int orderID, int incredientID, int amount);
int deleteOrder(unqlite *pDb, int orderID);
int getOrderIncredientID(unqlite *pDb, int orderID);
int getOrderAmount(unqlite *pDb, int orderID);



/*
 * Extract the database error log and exit.
 */
static void Fatal(unqlite *pDb, const char *zMsg)
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
	else
	{
		if (zMsg)
		{
			puts(zMsg);
		}
	}
	/* Manually shutdown the library */
	unqlite_lib_shutdown();
	/* Exit immediately */
	exit(0);
}
/* Forward declaration: Data consumer callback */
static int DataConsumerCallback(const void *pData, unsigned int nDatalen,
		void *pUserData /* Unused */);


int insertOrder(unqlite *pDb, int orderID, int incredientID, int amount)
{
	int rc;

	char orderIDincredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":incredient")];
	char incredientBuffer[sizeof("incredientID:") + sizeof(int)];
	char orderIDamountBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":amount")];
	char amountBuffer[sizeof("amount:") + sizeof(int)];

	sprintf(orderIDincredientBuffer, "orderID:%d:incredient", orderID);
	sprintf(incredientBuffer, "incredientID:%d", incredientID);
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);
	sprintf(amountBuffer, "amount:%d", amount);

	/*Store some records*/
	rc = unqlite_kv_store(pDb, orderIDincredientBuffer, -1, incredientBuffer,
			sizeof(incredientBuffer));  // test => 'Hello World'
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		return rc;
	}
	else
	{
		printf("Insert Successful IncredientBuffer:%s\n",orderIDincredientBuffer);
	}
	rc = unqlite_kv_store(pDb, orderIDamountBuffer, -1, amountBuffer,
			sizeof(amountBuffer));  // test => 'Hello World'
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		return rc;
	}
	return rc;
}

int defineProductionStationForOrder(unqlite *pDb, int orderID, int productionStationID)
{
	int rc;

	char orderIDProductionStationBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":productionStation")];
	char productionStationBuffer[sizeof("productionStationID:") + sizeof(int)];

	sprintf(orderIDProductionStationBuffer, "orderID:%d:productionStation", orderID);
	sprintf(productionStationBuffer, "productionStationID:%d", productionStationID);

	/*Store some records*/
	rc = unqlite_kv_store(pDb, orderIDProductionStationBuffer, -1, productionStationBuffer,
			sizeof(productionStationBuffer));  // test => 'Hello World'
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		return rc;
	}
	else
	{
		printf("Insert Successful %s\n",orderIDProductionStationBuffer);

	}
	return rc;
}

int deleteOrder(unqlite *pDb, int orderID)
{
	//TODO ABfangen, wenn es die ORDERID NICHT GIBT
	int rc;

	char orderIDincredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":incredient")];
	char orderIDamountBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":amount")];
	char orderIDProductionStationBuffer[sizeof("orderID:") + sizeof(int)
				+ sizeof(":productionStation")];

	sprintf(orderIDincredientBuffer, "orderID:%d:incredient", orderID);
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);
	sprintf(orderIDProductionStationBuffer, "orderID:%d:productionStation", orderID);

	/*Delete some records*/
	rc = unqlite_kv_delete(pDb, orderIDincredientBuffer, -1);
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		printf("Delete Error for %s\n",orderIDincredientBuffer);
		return rc;
	}

	rc = unqlite_kv_delete(pDb, orderIDamountBuffer, -1);
	if (rc != UNQLITE_OK)
	{
		printf("Delete Error for %s\n",orderIDamountBuffer);

		// Insertion fail, extract database error log and exit
		return rc;
	}

	rc = unqlite_kv_delete(pDb, orderIDProductionStationBuffer, -1);
	if (rc != UNQLITE_OK)
	{
		printf("Delete Error for %s\n",orderIDProductionStationBuffer);

		// Insertion fail, extract database error log and exit
		return rc;
	}
	return rc;

}

int getOrderIncredientID(unqlite *pDb, int orderID)
{
	//TODO ABfangen, wenn es die ORDERID NICHT GIBT

	int rc;
	size_t nBytes;  //Data length
	char *zBuf;     //Dynamically allocated buffer

	char orderIDincredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":incredient")];
	//char orderIDamountBuffer[sizeof("orderID:")+sizeof(int)+sizeof(":amount")];

	sprintf(orderIDincredientBuffer, "orderID:%d:incredient", orderID);
//	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);

	/*Get some records*/
	rc = unqlite_kv_fetch(pDb, orderIDincredientBuffer, -1, NULL, &nBytes);
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		printf("Fehlerhaftes Lesen");
		return rc;
	}
	else
	{
		printf("Lesen sollte geklappt haben");
	}

	//Allocate a buffer big enough to hold the record content
	zBuf = (char *) malloc(nBytes);
	if (zBuf == NULL)
	{
		printf("Fehlerhaftes Lesen");
	}
	//Read Database and Copy record content in our buffer
	rc = unqlite_kv_fetch(pDb, orderIDincredientBuffer, -1, zBuf, &nBytes);
	const char ch = ':';
	char *ret;
	ret = strchr(zBuf, ch);
	memmove(ret, ret + 1, strlen(ret));
	int incredientID = atoi(ret);
	printf("IncredientID:%d\n", incredientID);

	free(zBuf);

	return incredientID;

}


int getOrderAmount(unqlite *pDb, int orderID)
{
	//TODO ABfangen, wenn es die ORDERID NICHT GIBT
	int rc;
	size_t nBytes;  //Data length
	char *zBuf;     //Dynamically allocated buffer

	//construct key for noSQL Database
	char orderIDamountBuffer[sizeof("orderID:")+sizeof(int)+sizeof(":amount")];
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);

	/*Get amount for the orderID record*/
	rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, NULL, &nBytes);
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		printf("No Record Found\n");
		return rc;
	}
	else
	{
		printf("Record Found for OrderID:%d\n",orderID);
	}

	//Allocate a buffer big enough to hold the record content
	zBuf = (char *) malloc(nBytes);
	if (zBuf == NULL)
	{
		printf("No Record Found\n");
	}
	//Copy record content in our buffer
	rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, zBuf, &nBytes);
	//Find Position of ":"
	const char ch = ':';
	char *ret;
	//remove all characters before ":"
	ret = strchr(zBuf, ch);
	//remove first character which should be ":"
	memmove(ret, ret + 1, strlen(ret));
	// convert character that reprents the amount for  the orderID into int
	int amount = atoi(ret);
	printf("Amount:%d\n", amount);

	free(zBuf);

	return amount;

}


#ifdef __WINNT__
#include <Windows.h>
#else
/* Assume UNIX */
#include <unistd.h>
#endif
/*
 * The following define is used by the UNIX build process and have
 * no particular meaning on windows.
 */
#ifndef STDOUT_FILENO
#define STDOUT_FILENO	1
#endif
/*
 * Data consumer callback [unqlite_kv_fetch_callback(), unqlite_kv_cursor_key_callback(), etc.).
 *
 * Rather than allocating a static or dynamic buffer (Inefficient scenario for large data).
 * The caller simply need to supply a consumer callback which is responsible of consuming
 * the record data perhaps redirecting it (i.e. Record data) to its standard output (STDOUT),
 * disk file, connected peer and so forth.
 * Depending on how large the extracted data, the callback may be invoked more than once.
 */
static int DataConsumerCallback(const void *pData, unsigned int nDatalen,
		void *pUserData /* Unused */)
{
#ifdef __WINNT__
	BOOL rc;
	rc = WriteFile(GetStdHandle(STD_OUTPUT_HANDLE),pData,(DWORD)nDatalen,0,0);
	if( !rc )
	{
		/* Abort processing */
		return UNQLITE_ABORT;
	}
#else
	ssize_t nWr;
	nWr = write(STDOUT_FILENO, pData, nDatalen);
	if (nWr < 0)
	{
		/* Abort processing */
		return UNQLITE_ABORT;
	}
#endif /* __WINT__ */

	/* All done, data was redirected to STDOUT */
	return UNQLITE_OK;
}
