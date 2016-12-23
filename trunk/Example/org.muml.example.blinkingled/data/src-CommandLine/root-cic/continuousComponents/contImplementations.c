#include "ContImplementations.h"
/** Start of user code user includes **/
#include <stdio.h>
/**End of user code**/


void initializeContinuousImplementations(){
/** Start of user code initialize continuous components **/
	printf("System is started successfully.\n");
	printf("Current state of LED:  ");
	fflush(stdout);
/**End of user code**/

}
	int8_T Root_cicSysSystemC2Voltage_Reference = 0;
	void write_voltage_oflEDComponent_C2(int8_T value){

	if (Root_cicSysSystemC2Voltage_Reference != value){
	/** Start of user code write_voltage_oflEDComponent_C2 **/ 
		if (value == 1){
			printf("\b1");
		}else {
			printf("\b0");
		}

		fflush(stdout);
	/**End of user code**/
	Root_cicSysSystemC2Voltage_Reference = value;
	}

}
