//general includes
#include "Middleware/MiddlewareCore.h"

#include "lib/Debug.h"
//including all files for used Components
#include "components/productionStationComponent_Interface.h"
#include "components/brokerComponent_Interface.h"
#include "components/recipeGeneratorComponent_Interface.h"


//variables for component instances

Middleware* mw;

int main(){
//create and  initialize middleware object
 Middleware_create();
			MessageID * messageIDsOfbufferOfbrokerComponent;
					//create instance Broker of type BrokerComponent
					 mw->brokerComponent = BrokerComponent_create();
								messageIDsOfbufferOfbrokerComponent = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfbrokerComponent[0] = MESSAGE_MESSAGESSIMPLEORDERMESSAGESMESSAGE;
								MessageBuffer* buffergetOrder1Broker = MessageBuffer_create(5,false,1,messageIDsOfbufferOfbrokerComponent);
			
							MessageBuffer** allBuffersOfBrokergetOrder = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
							allBuffersOfBrokergetOrder[0] = buffergetOrder1Broker;
				
							mw->brokerComponent->getOrderPort = Port_create(PORT_BROKERBROKERGETORDER1, 1, allBuffersOfBrokergetOrder);
						
								messageIDsOfbufferOfbrokerComponent = (MessageID*) calloc(3,sizeof(MessageID));
									messageIDsOfbufferOfbrokerComponent[0] = MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE;
									messageIDsOfbufferOfbrokerComponent[1] = MESSAGE_MESSAGESFAILORDERMESSAGESMESSAGE;
									messageIDsOfbufferOfbrokerComponent[2] = MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE;
								MessageBuffer* orderBufferbrokerForPSBroker = MessageBuffer_create(1000,false,3,messageIDsOfbufferOfbrokerComponent);
			
							MessageBuffer** allBuffersOfBrokerbrokerForPSPort = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
							allBuffersOfBrokerbrokerForPSPort[0] = orderBufferbrokerForPSBroker;
				
							mw->brokerComponent->brokerForPSPortPort = Port_create(PORT_BROKERBROKERBROKERFORPS, 1, allBuffersOfBrokerbrokerForPSPort);
						
					//create behavior for component brokerComponent
					mw->brokerComponent->stateChart = BrokerBrokerStateChart_create(mw->brokerComponent);
			
			MessageID * messageIDsOfbufferOfrecipeGeneratorComponent;
					//create instance RecipeGenerator of type RecipeGeneratorComponent
					 mw->recipeGeneratorComponent = RecipeGeneratorComponent_create();
						mw->recipeGeneratorComponent->provideOrderPort = Port_create(PORT_RECIPEGENERATORRECIPEGENERATORPROVIDEORDER1, 0, NULL);
			
					//create behavior for component recipeGeneratorComponent
					mw->recipeGeneratorComponent->stateChart = RecipeGeneratorReciepeGeneratorStateChart_create(mw->recipeGeneratorComponent);
			
			MessageID * messageIDsOfbufferOfproductionStationComponent;
					//create instance ProductionStation of type ProductionStationComponent
					 mw->productionStationComponent = ProductionStationComponent_create();
								messageIDsOfbufferOfproductionStationComponent = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfproductionStationComponent[0] = MESSAGE_MESSAGESORDERFORPSMESSAGESMESSAGE;
								MessageBuffer* OrderForPSBuffergetOrder1ProductionStation = MessageBuffer_create(100,true,1,messageIDsOfbufferOfproductionStationComponent);
			
							MessageBuffer** allBuffersOfProductionStationgetOrder = (MessageBuffer**) malloc(1*sizeof(MessageBuffer*));
							allBuffersOfProductionStationgetOrder[0] = OrderForPSBuffergetOrder1ProductionStation;
				
							mw->productionStationComponent->getOrderPort = Port_create(PORT_PRODUCTIONSTATIONPRODUCTIONSTATIONGETORDER1, 1, allBuffersOfProductionStationgetOrder);
						
					//create behavior for component productionStationComponent
					mw->productionStationComponent->stateChart = ProductionStationPorductionStationRTSCStateChart_create(mw->productionStationComponent);
			

#ifdef DEBUG
printDebugInformation("Initialization done...start execution.\n");
#endif
while (1){
			BrokerComponent_processStep(mw->brokerComponent);
			RecipeGeneratorComponent_processStep(mw->recipeGeneratorComponent);
			ProductionStationComponent_processStep(mw->productionStationComponent);
}
}
