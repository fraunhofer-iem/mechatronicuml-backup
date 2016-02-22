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
	int8_T Root_cicS1SystemLedLED_Reference = 0;
	void write_LED_oflEDComponent_led(int8_T value){

	if (Root_cicS1SystemLedLED_Reference != value){
	/** Start of user code write_LED_oflEDComponent_led **/ 
 if (value == 0){
      digitalWrite(LEDPIN, HIGH);
    }
    else{
      digitalWrite(LEDPIN, LOW);
    }
	/**End of user code**/
	Root_cicS1SystemLedLED_Reference = value;
	}

}

