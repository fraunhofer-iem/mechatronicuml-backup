/*
 * Connects to the database microservice specified in the config.json
 *
 */
#include <stdlib.h>
#include <string.h> /* strchr(), strlen(), .. */
#include <curl/curl.h>
#include <time.h>
#include "cJSON.h"

int insertOrder(int orderId, int ingredientID, int amount, int timeout);
int defineProductionStationForOrder(int orderID, int productionStationID);
int getOrderIngredientID(int orderID);
int getOrderAmount(int orderID);
int searchOrder(int searchingPS, int producibleIngredients);
int markOrderAsDone(int orderID);
int heartBeatProductionStation(int productionStationID);
int markOrdersAsFailedForUnreachableStations();

typedef struct producingStation {
	int stationID;
	int orderID;
	time_t lastSeen;
	struct producingStation *next;
} node;

CURL *curl;
char *url;
int baseUrlLength;
const int LONGEST_API_URL=33;
struct producingStation *first;
time_t tnow;
const int NO_OF_CHARS_FOR_INT = 12;
int lastAnswerFromGet;


char * readConfigFile()
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
	else
	{
		printf("Could not open config.json.\n");
	}
	if (buffer)
	{
		cJSON *root = cJSON_Parse(buffer);
		if (root)
		{
			baseUrlLength=strlen(cJSON_GetObjectItem(root, "baseurl")->valuestring);
			url = malloc(baseUrlLength);
			sprintf(url, "%s", cJSON_GetObjectItem(root, "baseurl")->valuestring);
			cJSON_Delete(root);
			printf("Found the following baseurl: %s\n", url);
		}
	}

	return url;
}
/**
 * Write callback for curl get
 */
size_t write_data(void *ptr, size_t size, size_t count, void *stream)
{
    printf("Got the following answer: \n\n-----------------\n%s\n-----------\n\n", (char *)ptr);
    lastAnswerFromGet = atoi((char*) ptr);
    return size * count;
}

/**
 * Takes a json string and sends it to the server via post request
 *
 */
int getFromDatabaseServer(char *apiEndPointAndUrlEncodedInfo, int sizeOfEndpointAndInfo)
{
	curl = curl_easy_init();
	if (curl)
	{
		//Compute and set full url of endpoint
		if (!url){
			url = readConfigFile();
		}
		char *fullUrl = malloc(baseUrlLength+sizeOfEndpointAndInfo);
		strcpy(fullUrl, url);
		strncat(fullUrl, apiEndPointAndUrlEncodedInfo, sizeOfEndpointAndInfo);
		curl_easy_setopt(curl, CURLOPT_URL, fullUrl);

		printf("Trying to get from %s\n", fullUrl);

		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);
		curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_data);

		CURLcode res = curl_easy_perform(curl);
		if (res != CURLE_OK)
		{
			fprintf(stderr, "curl_easy_perform() failed: %s\n", curl_easy_strerror(res));
			return -1;
		}
		else{
			return lastAnswerFromGet;
		}
		curl_easy_cleanup(curl);
	}
}

/**
 * Takes a json string and sends it to the server via post request
 *
 */
void postToDatabaseServer(char *apiEndPoint, char *jsonString)
{
	curl = curl_easy_init();
	if (curl)
	{
		//Compute and set full url of endpoint
		if (!url){
			url = readConfigFile();
		}
		char *fullUrl = malloc(baseUrlLength+LONGEST_API_URL);
		strcpy(fullUrl, url);
		strncat(fullUrl, apiEndPoint, LONGEST_API_URL);
		curl_easy_setopt(curl, CURLOPT_URL, fullUrl);

		printf("Json String %s \nSent to %s\n", jsonString, fullUrl);

		/* setting correct headers so that the server will interpret the post body as json */
		struct curl_slist *headers = NULL;
		headers = curl_slist_append(headers, "Accept: application/json");
		headers = curl_slist_append(headers, "Content-Type: application/json");
		headers = curl_slist_append(headers, "charsets: utf-8");
		curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);

		/* pass in a pointer to the data - libcurl will not copy */
		curl_easy_setopt(curl, CURLOPT_POSTFIELDS, jsonString);
		CURLcode res = curl_easy_perform(curl);

		if (res != CURLE_OK)
		{
			fprintf(stderr, "curl_easy_perform() failed: %s\n",
					curl_easy_strerror(res));
		}
		else
		{
			 long responseCode;
			 res = curl_easy_getinfo(curl, CURLINFO_RESPONSE_CODE, &responseCode);

			 if((CURLE_OK == res) && responseCode)
			 {
				if (responseCode != 200){
					printf("Something went wrong while posting, status code: %ld \n", responseCode);
				}
			 }
		}
		curl_easy_cleanup(curl);
	}
}


/**
 * Inserts an order with its ID, ingredient, amount and timeout
 *
 */
int insertOrder(int orderID, int ingredientID, int amount, int timeout)
{
	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "amount", amount);
	cJSON_AddNumberToObject(order, "ingredient", ingredientID);
	cJSON_AddNumberToObject(order, "orderID", orderID);
	cJSON_AddNumberToObject(order, "timeout", timeout);
	postToDatabaseServer("order/insert" , cJSON_Print(order));

	return 0;
}

/**
 * Defines a production station as producer of the order with the given ID
 */
int defineProductionStationForOrder(int orderID, int productionStationID)
{
	cJSON *request = cJSON_CreateObject();
	cJSON_AddNumberToObject(request, "orderID", orderID);
	cJSON_AddNumberToObject(request, "productionStationID", productionStationID);
	postToDatabaseServer("productionStation/assignOrder",cJSON_Print(request));

	//Add tuple to list of producing stations
	if (first==NULL)
	{
		first = malloc(sizeof(node));
		first->orderID = orderID;
		first->stationID = productionStationID;
		first->lastSeen= time(&tnow);
		first->next = NULL;
	}else
	{
		struct producingStation *endOfList=first;
		while(endOfList->next != NULL)
		{
			endOfList = endOfList->next;
		}
		struct producingStation *newElement = endOfList->next;
		newElement = malloc(sizeof(node));
		newElement->orderID = orderID;
		newElement->stationID = productionStationID;
		newElement->lastSeen= time(&tnow);
		newElement->next = NULL;
	}

	printf("Assigned productionStation %d to order %d\n", productionStationID, orderID);

	return 0;
}

/**
 * Sets orderStatus to DONE
 */
int markOrderAsDone(int orderID)
{
	cJSON *order = cJSON_CreateObject();
	cJSON_AddNumberToObject(order, "orderID", orderID);
	postToDatabaseServer("order/done", cJSON_Print(order));

	//Find producing station in list and remove it
	if (first == NULL)
	{
		printf("Error: Order done without producing station");
		exit(1);
	}
	//Remove first item from the list if that's the station that's done
	if (first->orderID == orderID)
	{
		struct producingStation *next_node = first->next;
		 free(first);
		 first = next_node;
		 return 0;
	}
	struct producingStation *currentStation=first;
	while (currentStation->next-> orderID != orderID)
	{
		if (currentStation->next != NULL)
		{
			currentStation = currentStation->next;
		} else{
			printf("Error: Order done without producing station");
			exit(1);
		}
	}
	struct producingStation* stationToRemove = currentStation -> next;
	currentStation -> next = stationToRemove -> next;
	free(stationToRemove);

	return 0;
}

/**
 * Retrieve the ingredientID for the order with the given id.
 */
int getOrderIngredientID(int orderID)
{
	int sizeOfEndpointAndInfo = sizeof("order/get/ingredient/")+NO_OF_CHARS_FOR_INT;
	char *stringEndpointAndInfo = malloc(sizeOfEndpointAndInfo);
	strcpy(stringEndpointAndInfo, "order/get/ingredient/");
	char str[NO_OF_CHARS_FOR_INT];
	sprintf(str, "%d", orderID);
	strncat(stringEndpointAndInfo, str, NO_OF_CHARS_FOR_INT);
	int ingredientID = getFromDatabaseServer(stringEndpointAndInfo, sizeOfEndpointAndInfo);
	printf("Successfully retrieved ingredientID %d for order %d.\n", ingredientID, orderID);
	return ingredientID;
}

/**
 * Retrieve the amount for the order with the given id.
 */
int getOrderAmount(int orderID)
{
	int sizeOfEndpointAndInfo = sizeof("order/get/amount/")+NO_OF_CHARS_FOR_INT;
	char *stringEndpointAndInfo = malloc(sizeOfEndpointAndInfo);
	strcpy(stringEndpointAndInfo, "order/get/amount/");
	char str[NO_OF_CHARS_FOR_INT];
	sprintf(str, "%d", orderID);
	strncat(stringEndpointAndInfo, str, NO_OF_CHARS_FOR_INT);
	int orderAmount = getFromDatabaseServer(stringEndpointAndInfo, sizeOfEndpointAndInfo);
	printf("Successfully retrieved amount %d for order %d.\n", orderAmount, orderID);
	return orderAmount;
}

/**
 * Searches an order without a production station assigned
 */
int searchOrder(int searchingPS, int producibleIngredients)
{
	int sizeOfEndpointAndInfo = sizeof("order/search?psID=")+NO_OF_CHARS_FOR_INT*2+sizeof("&ingredientIDs=[]");
	char *stringEndpointAndInfo = malloc(sizeOfEndpointAndInfo);
	strcpy(stringEndpointAndInfo, "order/search?psID=");
	char str[NO_OF_CHARS_FOR_INT];
	sprintf(str, "%d", searchingPS);
	strncat(stringEndpointAndInfo, str, NO_OF_CHARS_FOR_INT);
	strncat(stringEndpointAndInfo, "&ingredientIDs=[", sizeof("&ingredientIDs=["));
	sprintf(str, "%d", producibleIngredients);
	strncat(stringEndpointAndInfo, str, NO_OF_CHARS_FOR_INT);
	strncat(stringEndpointAndInfo, "]", sizeof("]"));
	int orderID = getFromDatabaseServer(stringEndpointAndInfo, sizeOfEndpointAndInfo);
	if (orderID==404){
		printf("No matching order found.\n");
	}
	printf("Found order %d.\n", orderID);
	return orderID;
}


/**
 * Updates the last time we saw the producing productionStation
 */
int heartBeatProductionStation(int productionStationID)
{
	if (first == NULL)
	{
		printf("Error: Heart beat without producing station. (No list)\n");
		exit(1);
	}
	//Find producing station in list and update its lastSeen time stamp
	struct producingStation *currentStation=first;
	while (currentStation->stationID != productionStationID)
	{
		if (currentStation->next != NULL)
		{
			currentStation = currentStation->next;
		} else{
			printf("Error: Heart beat without producing station. (No matching element)\n");
			exit(1);
		}
	}
	currentStation->lastSeen = time(&tnow);

	return 0;
}

/**
 * Checks periodically whether any of the production stations that are meant to be producing for us
 * have not sent a heart beat in a while
 */
int markOrdersAsFailedForUnreachableStations(){
	//Only traverse list if there is a list
	printf("Checking for unreachable stations\n");
	if (first != NULL)
	{
		printf("We have producing stations\n");
		//Check all time stamps
		struct producingStation *currentStation=first;
		while(currentStation != NULL){
			if (currentStation ->lastSeen < (time(&tnow)-3000)){
				printf("We found an unreachable station.\n");
				//We found a station that failed
				//Find that station in list and remove it
				//Remove first item from the list if that's the failed station
				if (first->stationID == currentStation->stationID)
				{
					struct producingStation *next_node = first->next;
					 free(first);
					 first = next_node;
					 continue;
				}
				struct producingStation *prevStation=first;
				while (prevStation->next-> stationID != currentStation -> stationID)
				{
					if (prevStation->next != NULL)
					{
						prevStation = prevStation->next;
					} else{
						printf("Error: Order failed without producing station");
						exit(1);
					}
				}
				struct producingStation* stationToRemove = prevStation -> next;
				currentStation -> next = stationToRemove -> next;
				free(stationToRemove);
				printf("Successfully removed station.\n");
			}
			currentStation = currentStation -> next;
		}
	}
	return 0;
}

