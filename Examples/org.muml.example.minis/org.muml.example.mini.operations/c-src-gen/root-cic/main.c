//general includes
#include "Middleware/MiddlewareCore.h"

#include "lib/Debug.h"
//including all files for used Components
#include "components/aComponentComponent_Interface.h"


//variables for component instances

Middleware* mw;

int main(){
//create and  initialize middleware object
 Middleware_create();
			MessageID * messageIDsOfbufferOfa1Component;
					//create instance A1 of type AComponentComponent
					 mw->a1Component = AComponentComponent_create();
					//create behavior for component a1Component
					mw->a1Component->stateChart = AComponentRootStatechartStateChart_create(mw->a1Component);
			

#ifdef DEBUG
printDebugInformation("Initialization done...start execution.\n");
#endif
while (1){
			AComponentComponent_processStep(mw->a1Component);
}
}
