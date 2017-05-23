//general includes
#include "Middleware/MiddlewareCore.h"

#include "lib/Debug.h"
		#include "continuousComponents/contImplementations.h"	
//including all files for used Components
#include "components/receiverComponent_Interface.h"
#include "components/senderComponent_Interface.h"


//variables for component instances

Middleware* mw;

int main(){
//create and  initialize middleware object
 Middleware_create();
			MessageID * messageIDsOfbufferOfc1Component;
					//create instance C1 of type SenderComponent
					 mw->c1Component = SenderComponent_create();
						mw->c1Component->outPort = Port_create(PORT_C1SENDEROUT1, 0, NULL);
			
					//create behavior for component c1Component
					mw->c1Component->stateChart = SenderSenderStateChart_create(mw->c1Component);
			
			MessageID * messageIDsOfbufferOfc2Component;
					//create instance C2 of type ReceiverComponent
					 mw->c2Component = ReceiverComponent_create();
								messageIDsOfbufferOfc2Component = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfc2Component[0] = MESSAGE_M1MYMESSAGEM1MESSAGE;
								MessageBuffer* myBufferin1C2 = MessageBuffer_create(5,false,1,messageIDsOfbufferOfc2Component);
			
							MessageBuffer** allBuffersOfC2in = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
							allBuffersOfC2in[0] = myBufferin1C2;
				
							mw->c2Component->inPort = Port_create(PORT_C2RECEIVERIN1, 1, allBuffersOfC2in);
						
					//create behavior for component c2Component
					mw->c2Component->stateChart = ReceiverReceiverStateChart_create(mw->c2Component);
			

					mw->c2Component->setterOf_LED = write_LED_oflEDComponent_led;
//initialize continuous parts
initializeContinuousImplementations();
#ifdef DEBUG
printDebugInformation("Initialization done...start execution.\n");
#endif
while (1){
			SenderComponent_processStep(mw->c1Component);
			ReceiverComponent_processStep(mw->c2Component);
}
}
