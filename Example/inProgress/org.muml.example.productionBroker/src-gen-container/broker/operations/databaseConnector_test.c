#include <stdarg.h>
#include <stddef.h>
#include <setjmp.h>
#include <cmocka.h>
#include <unistd.h>
#include "databaseConnector.h"

/**
 * Test cases:
 * 1. Remove first station (With/Without Successors) x (AsDone/AsUnreachable)
 * 2. Remove second station (With/Without Successors) x (AsDone/AsUnreachable)
 * 3. Remove station in the middle of a list (AsDone/AsUnreachable)
 * 4. Remove last station (AsDone/AsUnreachable)
 * 5. Remove unreachable stations from empty list
 * 6. Remove unreachable stations for list of only reachable stations
 * 7. Remove multiple unreachable stations (Station from start/middle/end of list)^2
 * 8. Remove all stations as unreachable
 * 
 * Misuse cases:
 * I. Heartbeat without producing stations
 * II. Done order without producing stations
 *
*/

/* A test case that adds and removes a station. */ 
static void testAddAndRemoveOneStationAsDone(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
    assert_true(first->stationID==1);
    assert_true(first->orderID==1);
    //TODO test timestamp
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

static void testRemoveFirstStationAsDone(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
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

static void testRemoveFirstStationAsUnreachable(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	sleep(5);
	heartBeatProductionStation(2);
    heartBeatProductionStation(3);
	markOrdersAsFailedForUnreachableStations();
	assert_true(first->stationID==2);
	markOrderAsDone(3);
	markOrderAsDone(2);
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

static void testRemoveSecondStationAsDoneWithSuccessor(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	markOrderAsDone(2);
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==3);
	//clean up 
	markOrderAsDone(1);
	markOrderAsDone(3);
	assert_null(first);
}
 
static void testRemoveSecondStationAsUnreachableWithSuccessor(void **state) {
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

static void testRemoveSecondStationAsDoneWithoutSuccessor(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	markOrderAsDone(2);
	assert_true(first->stationID==1);
	assert_null(first->next);
	//clean up 
	markOrderAsDone(1);
	assert_null(first);
}
 
static void testRemoveSecondStationAsUnreachableWithoutSuccessor(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	sleep(2);
	markOrdersAsFailedForUnreachableStations();
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==2);
	sleep(4);
	heartBeatProductionStation(1);
	markOrdersAsFailedForUnreachableStations();
	assert_true(first->stationID==1);
    assert_null(first->next);
	//clean up 
	markOrderAsDone(1);
	assert_null(first);
}

static void testRemoveMiddleStationAsDone(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
    defineProductionStationForOrder(3,3);
    defineProductionStationForOrder(4,4);
	markOrderAsDone(3);
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==2);
    assert_true(first->next->next->stationID==4);
    assert_null(first->next->next->next);
	//clean up 
	markOrderAsDone(1);
    markOrderAsDone(2);
    markOrderAsDone(4);
	assert_null(first);
}
 
static void testRemoveMiddleStationAsUnreachable(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
    defineProductionStationForOrder(3,3);
    defineProductionStationForOrder(4,4);
	sleep(5);
	heartBeatProductionStation(1);
    heartBeatProductionStation(2);
    heartBeatProductionStation(4);
	markOrdersAsFailedForUnreachableStations();
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==2);
    assert_true(first->next->next->stationID==4);
    assert_null(first->next->next->next);
	//clean up 
	markOrderAsDone(1);
    markOrderAsDone(2);
    markOrderAsDone(4);
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void testRemoveAllStationsAsUnreachable(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	sleep(6);
	markOrdersAsFailedForUnreachableStations();
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void testDoneForEmptyList(void **state) {
	(void) state; /*unused*/
	assert_true(markOrderAsDone(1)==-1);
}

/* A test case that adds and removes a station. */ 
static void testHeartBeatForEmptyList(void **state) {
        (void) state; /*unused*/
        assert_true(heartBeatProductionStation(1)==-1);
}

static void testDoneWithoutProducingStationWithTheRightID(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	assert_true(markOrderAsDone(3)==-1);
}

int main(void) {
	const struct CMUnitTest tests[] = { 
    cmocka_unit_test(testAddAndRemoveOneStationAsDone),    
	cmocka_unit_test(testAndRemoveOneStationAsUnreachable),
    cmocka_unit_test(testRemoveFirstStationAsDone),
    cmocka_unit_test(testRemoveFirstStationAsUnreachable),
	cmocka_unit_test(testRemoveSecondStationAsDoneWithSuccessor),
	cmocka_unit_test(testRemoveSecondStationAsUnreachableWithSuccessor),
	cmocka_unit_test(testRemoveSecondStationAsDoneWithoutSuccessor),
	cmocka_unit_test(testRemoveSecondStationAsUnreachableWithoutSuccessor),        
    cmocka_unit_test(testAddAndRemoveThreeStationsAsDone),
    cmocka_unit_test(testRemoveMiddleStationAsDone),
    cmocka_unit_test(testRemoveMiddleStationAsUnreachable),    
	cmocka_unit_test(testRemoveAllStationsAsUnreachable),
	cmocka_unit_test(testDoneForEmptyList),
	cmocka_unit_test(testHeartBeatForEmptyList),
	cmocka_unit_test(testDoneWithoutProducingStationWithTheRightID),
	};
	return cmocka_run_group_tests(tests, NULL, NULL);
}
