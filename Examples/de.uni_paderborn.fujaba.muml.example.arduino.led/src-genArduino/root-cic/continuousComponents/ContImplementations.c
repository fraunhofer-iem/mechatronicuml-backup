#include "ContImplementations.h"
/** Start of user code user includes **/

/**End of user code**/
	void write_voltage_oflEDComponent_C2(int8_T value){
	/** Start of user code write_voltage_oflEDComponent_C2 **/ 

		//only call the API call, if the value has changed
		if ((reference != 0 && value == 0) || (reference == 0 && value != 0)){

			//set value for LED
			if (value){
				//TODO turnon LED
			}
			else{
				//TODO turnoff LED
			}
		}
	/**End of user code**/

}

