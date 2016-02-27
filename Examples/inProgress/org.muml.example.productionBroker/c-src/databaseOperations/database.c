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
 * Banner.
 */
static const char zBanner[] =
{ "============================================================\n"
		"UnQLite Key/Value Store Intro                              \n"
		"                                         http://unqlite.org/\n"
		"============================================================\n" };
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

int main(int argc, char *argv[])
{
	unqlite *pDb; /* Database handle */
	unqlite_kv_cursor *pCur; /* Cursor handle */
	//int i,
	int rc;
	int orderID = 5;
	int incredientID = 3;
	int amount = 2;
	size_t nBytes;  //Data length
	char *zBuf;     //Dynamically allocated buffer

	puts(zBanner);

	/* Open our database*/
	rc = unqlite_open(&pDb, "testMe.db", UNQLITE_OPEN_CREATE);
	if (rc != UNQLITE_OK)
	{
		Fatal(0, "Out of memory");
	}

	rc = insertOrder(pDb, orderID, incredientID, amount);
	getOrderIncredientID(pDb, orderID);
	getOrderAmount(pDb, orderID);

//	/* Allocate a new cursor instance */
//	rc = unqlite_kv_cursor_init(pDb,&pCur);
//	if( rc != UNQLITE_OK ){
//		Fatal(0,"Out of memory");
//	}
//	/* Point to the first record */
//	unqlite_kv_cursor_first_entry(pCur);
//
//	//Extract data size first
//	rc = unqlite_kv_fetch(pDb,"orderID:5:incredient",-1,NULL,&nBytes);
//	if( rc != UNQLITE_OK ){
//	  //return;
//	}
//
//	//Allocate a buffer big enough to hold the record content
//	zBuf = (char *)malloc(nBytes);
//	if( zBuf == NULL ){
//		//return;
//	}
//	printf ("size:%d\n\t",nBytes);
//
//
//	//Copy record content in our buffer
//	unqlite_kv_fetch(pDb,"orderID:5:incredient",-1,zBuf,&nBytes);
//
//	//Play with zBuf...
//	if( rc != UNQLITE_OK ){
//		 printf ("fehler");
//	}
//	//Play with zBuf...
//	 printf ("zBuf:%s", zBuf);
//
/////test for deleting data
//	 rc = deleteOrder(pDb, orderID);
//
//	//Extract data size first
//	rc = unqlite_kv_fetch(pDb,"orderID:5:incredient",-1,NULL,&nBytes);
//	if( rc != UNQLITE_OK ){
//	  //return;
//	}
//
//	//Allocate a buffer big enough to hold the record content
//	zBuf = (char *)malloc(nBytes);
//	if( zBuf == NULL ){
//		//return;
//	}
//
//
//	//Copy record content in our buffer
//	unqlite_kv_fetch(pDb,"orderID:5:incredient",-1,zBuf,&nBytes);
//
//	//Play with zBuf...
//	if( rc != UNQLITE_OK ){
//		 printf ("fehler");
//	}
//	//Play with zBuf...
//	 printf ("SecondzBuf:%s", zBuf);
//
//
//	free(zBuf);
//
//	/* Finally, Release our cursor */
//	unqlite_kv_cursor_release(pDb,pCur);

	/* Auto-commit the transaction and close our database */
	unqlite_close(pDb);
	return 0;
}

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
	rc = unqlite_kv_store(pDb, orderIDamountBuffer, -1, amountBuffer,
			sizeof(amountBuffer));  // test => 'Hello World'
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		return rc;
	}
	return rc;

}

int deleteOrder(unqlite *pDb, int orderID)
{
	int rc;

	char orderIDincredientBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":incredient")];
	char orderIDamountBuffer[sizeof("orderID:") + sizeof(int)
			+ sizeof(":amount")];

	sprintf(orderIDincredientBuffer, "orderID:%d:incredient", orderID);
	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);

	/*Store some records*/
	rc = unqlite_kv_delete(pDb, orderIDincredientBuffer, -1); // test => 'Hello World'
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		printf("Fehlerhaftes Loeschen");
		return rc;
	}
	else
	{
		printf("Loeschen sollte geklappt haben");
	}
	rc = unqlite_kv_delete(pDb, "orderIDamountBuffer", -1); // test => 'Hello World'
	if (rc != UNQLITE_OK)
	{
		// Insertion fail, extract database error log and exit
		return rc;
	}
	return rc;

}

int getOrderIncredientID(unqlite *pDb, int orderID)
{
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
	//Copy record content in our buffer
	rc = unqlite_kv_fetch(pDb, orderIDincredientBuffer, -1, zBuf, &nBytes);
	//Play with zBuf...
	if (rc != UNQLITE_OK)
	{
		printf("fehlerT\n");
	}
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
	int rc;
	size_t nBytes;  //Data length
	char *zBuf;     //Dynamically allocated buffer

	char orderIDamountBuffer[sizeof("orderID:")+sizeof(int)+sizeof(":amount")];

	sprintf(orderIDamountBuffer, "orderID:%d:amount", orderID);

	/*Get some records*/
	rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, NULL, &nBytes);
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
	//Copy record content in our buffer
	rc = unqlite_kv_fetch(pDb, orderIDamountBuffer, -1, zBuf, &nBytes);
	//Play with zBuf...
	if (rc != UNQLITE_OK)
	{
		printf("fehlerT\n");
	}
	const char ch = ':';
	char *ret;
	ret = strchr(zBuf, ch);
	memmove(ret, ret + 1, strlen(ret));
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
