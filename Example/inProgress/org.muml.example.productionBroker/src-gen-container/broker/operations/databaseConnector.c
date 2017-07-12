/*
 * Connects to the database microservice specified in the config.json
 *
 */

#include <time.h>
#include <string.h> /* strchr(), strlen(), .. */
#include <curl/curl.h>
#include "cJSON.h"

const char * readConfigFile();
int getFromDatabaseServer(char *jsonString);
void postToDatabaseServer(char *jsonString);
int insertOrder(int orderId, int ingredientID, int amount, int timeout);
int defineProductionStationForOrder(int orderID, int productionStationID);
int getOrderIngredientID(int orderID);
int getOrderAmount(int orderID);
int searchOrder(int searchingPS, int producibleIngredients);
int deleteOrder(int orderID);
int heartBeatProductionStation(int productionStationID);

CURL *curl;
char *url = readConfigFile();

/**
 * Takes a json string and sends it to the server via post request
 *
 */
int getFromDatabaseServer(char *jsonString)
{
	curl = curl_easy_init();
	if (curl)
	{
		/* First set the URL that is about to receive our POST. This URL can
		   just as well be a https:// URL if that is what should receive the data. */
		curl_easy_setopt(curl, CURLOPT_URL, url);
		/* Only allow HTTP traffic */
		curl_easy_setopt(curl, CURLOPT_PROTOCOLS, CURLPROTO_HTTP);
		printf("Json String: %s \n", jsonString);
		//setting correct headers so that the server will interpret the post body as json
		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "Accept: application/json");
		headers = curl_slist_append(headers, "Content-Type: application/json");
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);
		//TODO put get info from string here
		/* Perform the request, res will get the return code */
		CURLcode res = curl_easy_perform(curl);
		/* Check for errors */
		if (res != CURLE_OK)
		{
			fprintf(stderr, "curl_easy_perform() failed: %s\n",
					curl_easy_strerror(res));
		}
		curl_easy_cleanup(curl);
	}
}

/**
 * Takes a json string and sends it to the server via post request
 *
 */
void postToDatabaseServer(char *jsonString)
{
	curl = curl_easy_init();
	if (curl)
	{
		/* First set the URL that is about to receive our POST. This URL can
		   just as well be a https:// URL if that is what should receive the data. */
		curl_easy_setopt(curl, CURLOPT_URL, url);
		/* Only allow HTTP traffic */
		curl_easy_setopt(curl, CURLOPT_PROTOCOLS, CURLPROTO_HTTP);
		printf("Json String: %s \n", jsonString);
		/* setting correct headers so that the server will interpret the post body as json */
		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "Accept: application/json");
		headers = curl_slist_append(headers, "Content-Type: application/json");
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);

		/* pass in a pointer to the data - libcurl will not copy */
		curl_easy_setopt(curl, CURLOPT_POSTFIELDS, jsonString);
		/* Perform the request, res will get the return code */
		CURLcode res = curl_easy_perform(curl);
		/* Check for errors */
		if (res != CURLE_OK)
		{
			fprintf(stderr, "curl_easy_perform() failed: %s\n",
					curl_easy_strerror(res));
		}
		curl_easy_cleanup(curl);
	}
	else printf ("No database");
}

const char * readConfigFile()
{
	char *buffer = 0;
	long length;
	char *url = "";

	FILE *fp = fopen("config.json", "r");
	if (fp)
	{
		fseek(fp, 0, SEEK_END);
		length = ftell(fp);
		fseek(fp, 0, SEEK_SET);
		buffer = malloc(length);
		if (buffer)
		{
			fread(buffer, 1, length, fp);
		}
		fclose(fp);
	}
	if (buffer)
	{
		cJSON *root = cJSON_Parse(buffer);
		if (root)
		{
			url = malloc(strlen(cJSON_GetObjectItem(root, "url")->valuestring));
			sprintf(url, "%s", cJSON_GetObjectItem(root, "url")->valuestring);
			cJSON_Delete(root);
		}
	}

	return url;
}

/**
 * Inserts and order with its ID, ingredient and amount and initial status "IDLE"
 * and the current time as orderTime
 *
 */
int insertOrder(int orderID, int ingredientID, int amount, int timeout)
{
	// Get current time for order info
	time_t rawtime;
	struct tm * timeinfo;
	time (&rawtime);
	timeinfo = localtime (&rawtime);
	prinf(timeinfo);
	printf ("Current local time and date: %s", asctime(timeinfo));
	//TODO get correct time format

	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "Amount", amount);
	cJSON_AddNumberToObject(order, "Ingredient", ingredientID);
	cJSON_AddNumberToObject(order, "OrderID", orderID);
	cJSON_AddStringToObject(order, "OrderStatus", "IDLE");
	cJSON_AddNumberToObject(order, "OrderTime", timeinfo);
	cJSON_AddNumberToObject(order, "Timeout", timeout);
	postToDatabaseServer(cJSON_Print(order));

	return 0;
}

/**
 * Inserts pair orderId and productionStation into the table OrderAllocation
 * Sets status of the order in table Orders to 'IN_PRODUCTION'
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	cJSON *orderAllocation = cJSON_CreateObject();
	cJSON_AddNumberToObject(orderAllocation, "OrderID", orderID);
	cJSON_AddNumberToObject(orderAllocation, "ProductionStationID", productionStationID);
	postToDatabaseServer(cJSON_Print(orderAllocation));

	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "OrderID", orderID);
	cJSON_AddStringToObject(order, "OrderStatus", "IN_PRODUCTION");
	//TODO get correct time
	cJSON_AddNumberToObject(order, "ProductionStartTime: Date,", time);
	postToDatabaseServer(cJSON_Print(order));

	return 0;
}

/**
 * Sets orderStatus to DONE
 */
int deleteOrder(int orderID)
{
	//TODO get correct time

	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "OrderID", orderID);
	cJSON_AddStringToObject(orders, "OrderStatus", "DONE");
	cJSON_AddNumberToObject(order, "ProductionEndTime", timeinfo);
	postToDatabaseServer(cJSON_Print(order));

	return 0;
}


/**
 * Retrieve the ingredientID for the order with the given id.
 */
int getOrderIngredientID(int orderID)
{
	//TODO get ingredient
	int ingredientID = getFromDatabaseServer(cJSON_Print(update));
	printf("Successfully retrieved ingredientID %d for order %d.\n", ingredientID, orderID);
	return ingredientID;
}

/**
 * Retrieve the amount for the order with the given id.
 */
int getOrderAmount(int orderID)
{
	//TODO get amount
	int orderAmount = getFromDatabaseServer(cJSON_Print(update));
	printf("Successfully retrieved amount %d for order %d.\n", orderAmount, orderID);
	return orderAmount;
}

/**
 * Searches an order without a production station assigned
 */
int searchOrder(int searchingPS, int producibleIngredients)
{
	//TODO search order
	cJSON *update;
	update = cJSON_CreateObject();
	cJSON_AddItemToObject(update, "update", cJSON_CreateString("searchOrder"));
	cJSON *changedTables;
	cJSON_AddItemToObject(update, "changedTables", changedTables = cJSON_CreateObject());
	cJSON *productionStations;
	cJSON_AddItemToObject(changedTables, "ProductionStations", productionStations = cJSON_CreateObject());
	cJSON_AddNumberToObject(productionStations, "ProductionStationID", searchingPS);

	int orderID = getFromDatabaseServer(cJSON_Print(update));

	return orderID;
}


/**
 * Inserts and order with its ID, ingredient and amount and initial status "IDLE"
 * and the current time as orderTime
 */
int heartBeatProductionStation(int productionStationID)
{
	//Send notification about seen production station to the visualization server
	//json format: {update: {searchOrder, changedTables: {ProductionStations: {ProductionStationID: id}}}}
	cJSON *update;
	update = cJSON_CreateObject();
	cJSON_AddItemToObject(update, "update", cJSON_CreateString("searchOrder"));
	cJSON *changedTables;
	cJSON_AddItemToObject(update, "changedTables", changedTables = cJSON_CreateObject());
	cJSON *productionStations;
	cJSON_AddItemToObject(changedTables, "ProductionStations", productionStations = cJSON_CreateObject());
	cJSON_AddNumberToObject(productionStations, "ProductionStationID", productionStationID);

    postToDatabaseServer(cJSON_Print(update));

	return 0;
}

