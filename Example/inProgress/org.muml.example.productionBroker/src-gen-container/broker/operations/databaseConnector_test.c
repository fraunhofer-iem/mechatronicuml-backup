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
	node* first = getFirst();
	printf("TestString:%d\n",first->stationID);
	printf("TestNext:%d\n",first->next->stationID);
}

int main(void) {
	const struct CMUnitTest tests[] = { 
	cmocka_unit_test(null_test_success),
	};
	return cmocka_run_group_tests(tests, NULL, NULL);
}
