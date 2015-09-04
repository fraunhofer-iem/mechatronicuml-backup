#include "ContImplementations.h"
/** Start of user code user includes **/
#include <stdio.h>
#include <stdlib.h>

int reference = 0;
/**End of user code**/
	void write_voltage_oflEDComponent_C2(int8_T value){
	/** Start of user code write_voltage_oflEDComponent_C2 **/ 
		if ((reference != 0 && value == 0) || (reference == 0 && value != 0)){
			reference = value;
			printf("%d",value);
			fflush(stdout);
		}
	/**End of user code**/

}

