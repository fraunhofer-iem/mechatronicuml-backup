#include "ContImplementations.h"
/** Start of user code user includes **/


#include "Arduino.h"


int LEDPIN = 9;
/**End of user code**/


void initializeContinuousImplementations(){
/** Start of user code initialize continuous components **/
	pinMode(LEDPIN, OUTPUT);
/**End of user code**/

}
	int8_T Root_cicSysSystemC2Voltage_Reference = 0;
	void write_voltage_oflEDComponent_C2(int8_T value){

	if (Root_cicSysSystemC2Voltage_Reference != value){
	/** Start of user code write_voltage_oflEDComponent_C2 **/ 
		if (value == 1){
			digitalWrite(LEDPIN, HIGH);
		}
		else{
			digitalWrite(LEDPIN, LOW);
		}
	/**End of user code**/
	Root_cicSysSystemC2Voltage_Reference = value;
	}

}

