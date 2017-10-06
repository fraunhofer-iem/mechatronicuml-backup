#include <stdarg.h>
#include <stddef.h>
#include <setjmp.h>
#include <cmocka.h>
#include <unistd.h>
#include "databaseConnector.h"

/* A test case that adds and removes a station. */ 
static void testAddAndRemoveOneStationAsDone(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	markOrderAsDone(1);
	assert_null(first);
}

static void testAndRemoveOneStationAsUnreachable(void **state) {
	(void) state;
	defineProductionStationForOrder(1,1);
	heartBeatProductionStation(1);
	sleep(3);
	markOrdersAsFailedForUnreachableStations();
	assert_non_null(first);
	sleep(3);
	markOrdersAsFailedForUnreachableStations();
	assert_null(first);
}

/* A test case that tests if three production stations are added in the right sequent */ 
static void testAddAndRemoveThreeStationsAsDone(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==2);
	assert_true(first->next->next->stationID==3);
	printf("TestFirst=1:%d\n",first->stationID);
	printf("TestSecond=2:%d\n",first->next->stationID);
	printf("TestThird=3:%d\n",first->next->next->stationID);
	//clean up 
	markOrderAsDone(1);
	assert_true(first->stationID==2);
	markOrderAsDone(2);
	assert_true(first->stationID==3);
	markOrderAsDone(3);
	assert_null(first);
	defineProductionStationForOrder(1,1);
	assert_true(first->stationID==1);
	markOrderAsDone(1);
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void test3(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	printf("TestFirst=1:%d\n",first->stationID);
	printf("TestSecond=2:%d\n",first->next->stationID);
	printf("TestThird=3:%d\n",first->next->next->stationID);
	markOrderAsDone(2);
	printf("TestFirst==1:%d\n",first->stationID);
	printf("TestSecond==3:%d\n",first->next->stationID);
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==3);
	//clean up 
	markOrderAsDone(1);
	markOrderAsDone(3);
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void test5(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	sleep(2);
	markOrdersAsFailedForUnreachableStations();
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==2);
	assert_true(first->next->next->stationID==3);
	sleep(4);
	heartBeatProductionStation(1);
	heartBeatProductionStation(3);
	markOrdersAsFailedForUnreachableStations();
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==3);
	//clean up 
	markOrderAsDone(1);
	markOrderAsDone(3);
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void test6(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	sleep(6);
	markOrdersAsFailedForUnreachableStations();
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void test7(void **state) {
	(void) state; /*unused*/
	assert_true(markOrderAsDone(1)==-1);
}

/* A test case that adds and removes a station. */ 
static void test8(void **state) {
	(void) state; /*unused*/
	assert_true(heartBeatProductionStation(1)==-1);
}

int main(void) {
	const struct CMUnitTest tests[] = { 
    cmocka_unit_test(testAddAndRemoveOneStationAsDone),    
	cmocka_unit_test(testAddAndRemoveThreeStationsAsDone),
	cmocka_unit_test(testAndRemoveOneStationAsUnreachable),
	cmocka_unit_test(test3),
	cmocka_unit_test(test5),
	cmocka_unit_test(test6),
	cmocka_unit_test(test7),
	cmocka_unit_test(test8),
	};
	return cmocka_run_group_tests(tests, NULL, NULL);
}
