#include <stdarg.h>
#include <stddef.h>
#include <setjmp.h>
#include <cmocka.h>
#include "databaseConnector.c"

/* A test case that does nothing and succeeds. */ 
static void null_test_success(void **state) {
	(void) state; /*unused*/
	defineProductionStationForOrder(1,1);
	defineProductionStationForOrder(2,2);
	defineProductionStationForOrder(3,3);
	node* first = getFirst();
	assert_true(first->stationID==1);
	assert_true(first->next->stationID==2);
	assert_true(first->next->next->stationID==3);
	printf("TestFirst=1:%d\n",first->stationID);
	printf("TestSecond=2:%d\n",first->next->stationID);
	printf("TestThird=3:%d\n",first->next->next->stationID);
}

int main(void) {
	const struct CMUnitTest tests[] = { 
	cmocka_unit_test(null_test_success),
	};
	return cmocka_run_group_tests(tests, NULL, NULL);
}
