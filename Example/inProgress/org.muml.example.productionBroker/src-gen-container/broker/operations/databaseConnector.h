/*
 * Connects to the database microservice specified in the config.json
 *
 */
#include <stdint.h>
#include <stdlib.h>
#include <string.h> /* strchr(), strlen(), .. */
#include <curl/curl.h>
#include "cJSON.h"
#include <time.h>
#include "clock.h"


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
	u_int64_t lastSeen;
	struct producingStation *next;
} node;

struct producingStation *first;
