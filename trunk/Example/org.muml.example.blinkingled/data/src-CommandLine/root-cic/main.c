//general includes
#include "Middleware/MiddlewareCore.h"

#include "lib/Debug.h"
#include "continuousComponents/ContImplementations.h"
//including all files for used Components
#include "components/mainComponent.h"
#include "RTSCs/mainRootRTSCStateChart.h"

//variables for component instances

Middleware* mw;

int main(){
//create and  initialize middleware object
 Middleware_create();
			MessageID * messageIDsOfbufferOfc1Component;
					//create instance C1 of type MainComponent
					 mw->c1Component = MainComponent_create();
					//create behavior for component c1Component
					mw->c1Component->stateChart = MainRootRTSCStateChart_create(mw->c1Component);
			

					mw->c1Component->setterOf_LED_voltage = write_voltage_oflEDComponent_C2;
					initializeContinuousImplementations();
#ifdef DEBUG
printDebugInformation("Initialization done...start execution.\n");
#endif
while (1){
			MainComponent_processStep(mw->c1Component);
}
}
