//general includes
#include "Middleware/MiddlewareCore.h"

#include "lib/Debug.h"
//including all files for used Components
#include "components/recipeGeneratorComponent_Interface.h"
#include "components/productionStationComponent_Interface.h"
#include "components/brokerComponent_Interface.h"


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
						
								messageIDsOfbufferOfbrokerComponent = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfbrokerComponent[0] = MESSAGE_MESSAGESDONEORDERMESSAGESMESSAGE;
								MessageBuffer* doneOrderBufferbrokerForPSBroker = MessageBuffer_create(5,false,1,messageIDsOfbufferOfbrokerComponent);
			
								messageIDsOfbufferOfbrokerComponent = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfbrokerComponent[0] = MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE;
									MessageBuffer* noOrderBufferbrokerForPSBroker = MessageBuffer_create(5,false,1,messageIDsOfbufferOfbrokerComponent);
			
								messageIDsOfbufferOfbrokerComponent = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfbrokerComponent[0] = MESSAGE_MESSAGESGETORDERMESSAGESMESSAGE;
								MessageBuffer* getOrderBufferbrokerForPSBroker = MessageBuffer_create(5,false,1,messageIDsOfbufferOfbrokerComponent);
			
							MessageBuffer** allBuffersOfBrokerbrokerForPSPort = (MessageBuffer**) malloc(3*sizeof(MessageBuffer*));
							allBuffersOfBrokerbrokerForPSPort[0] = doneOrderBufferbrokerForPSBroker;
							allBuffersOfBrokerbrokerForPSPort[1] = noOrderBufferbrokerForPSBroker;
							allBuffersOfBrokerbrokerForPSPort[2] = getOrderBufferbrokerForPSBroker;
				
							mw->brokerComponent->brokerForPSPortPort = Port_create(PORT_BROKERBROKERBROKERFORPS, 3, allBuffersOfBrokerbrokerForPSPort);
						
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
									MessageBuffer* OrderForPSBuffergetOrder1ProductionStation = MessageBuffer_create(2,true,1,messageIDsOfbufferOfproductionStationComponent);
			
								messageIDsOfbufferOfproductionStationComponent = (MessageID*) calloc(1,sizeof(MessageID));
									messageIDsOfbufferOfproductionStationComponent[0] = MESSAGE_MESSAGESNOORDERMESSAGESMESSAGE;
								MessageBuffer* noOrderBuffergetOrder1ProductionStation = MessageBuffer_create(2,false,1,messageIDsOfbufferOfproductionStationComponent);
			
							MessageBuffer** allBuffersOfProductionStationgetOrder = (MessageBuffer**) malloc(2*sizeof(MessageBuffer*));
							allBuffersOfProductionStationgetOrder[0] = OrderForPSBuffergetOrder1ProductionStation;
							allBuffersOfProductionStationgetOrder[1] = noOrderBuffergetOrder1ProductionStation;
				
							mw->productionStationComponent->getOrderPort = Port_create(PORT_PRODUCTIONSTATIONPRODUCTIONSTATIONGETORDER1, 2, allBuffersOfProductionStationgetOrder);
						
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
