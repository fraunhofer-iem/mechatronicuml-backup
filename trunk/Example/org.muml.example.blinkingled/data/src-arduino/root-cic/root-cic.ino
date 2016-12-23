//general includes
#include "MiddlewareCore.h"
#include "Debug.h"
#include "ContImplementations.h"
//including all files for used Components
#include "mainComponent.h"
#include "mainRootRTSCStateChart.h"

//variables for component instances

Middleware* mw;

void setup(){
  Serial.begin(9600);
//initialize continuous components
initializeContinuousImplementations();

//create and  initialize middleware object
 Middleware_create();
			MessageID * messageIDsOfbufferOfc1Component;
					//create instance C1 of type MainComponent
					 mw->c1Component = MainComponent_create();
					//create behavior for component c1Component
					mw->c1Component->stateChart = MainRootRTSCStateChart_create(mw->c1Component);
			

					mw->c1Component->setterOf_LED_voltage = write_voltage_oflEDComponent_C2;
#ifdef DEBUG
printDebugInformation("Initialization done...start execution.\n");
#endif
}

void loop(){

			MainComponent_processStep(mw->c1Component);

}
