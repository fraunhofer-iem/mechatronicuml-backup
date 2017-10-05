#include <stdarg.h>
#include <stddef.h>
#include <setjmp.h>
#include <cmocka.h>
#include "databaseConnector.c"

/* A test case that tests if three production stations are added in the right sequent */ 
static void test_add_three_stations(void **state) {
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

}


/* A test case that adds and removes a station. */ 
static void test_add_and_remove_one_station(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	markOrderAsDone(1);
	assert_null(first);
}

/* A test case that adds and removes a station. */ 
static void test_add_three_stations_and_delete_second(void **state) {
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

int main(void) {
	const struct CMUnitTest tests[] = { 
	cmocka_unit_test(test_add_three_stations),
	cmocka_unit_test(test_add_and_remove_one_station),
	cmocka_unit_test(test_add_three_stations_and_delete_second),
	};
	return cmocka_run_group_tests(tests, NULL, NULL);
}
