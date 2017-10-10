#include <stdarg.h>
#include <stddef.h>
#include <setjmp.h>
#include <cmocka.h>
#include <unistd.h>
#include "databaseConnector.h"

/**
 * Test cases:
 * 1. Insert and order and search it
 * 2. Search for order returns negative value when no orders are present
 * 3. 
 *
*/

/* A test case that adds and removes a station. */ 
static void testInsertOrderCanBeFoundOnSearch(void **state) {
	(void) state; /*unused*/
	int result = insertOrder(1, 1, 1, 0);
    assert_true(result==0);
	result =  searchOrder(42, 1);
	assert_true(result==1);
    markOrderAsDone(1);
}

static void testSearchOrderReturnsNegativeValueForNoOrders(void **state) {
	(void) state;
	int result =  searchOrder(42, 1);
    assert_true(result <0);
}


int main(void) {
	const struct CMUnitTest tests[] = { 
    cmocka_unit_test(testInsertOrderCanBeFoundOnSearch),    
	cmocka_unit_test(testSearchOrderReturnsNegativeValueForNoOrders)
	};
	return cmocka_run_group_tests(tests, NULL, NULL);
}
