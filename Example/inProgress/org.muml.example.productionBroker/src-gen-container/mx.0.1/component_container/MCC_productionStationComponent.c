			// Container HeaderFile
			#include "MCC_productionStationComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct productionStationComponent_Builder
								*/ 
			struct port_option {
			union {
				struct{
				uint16_T pubID;
				uint16_T subID;
				} local_option;
				struct {
					int domainID;
					int partition;
				} dds_option;
			};
		};
		
								/**
								*  
								* @brief The builder struct for the Component Type: ProductionStation
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct productionStationComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus GETORDER; /**< The status of port getOrder */
					PortHandle* (*createGETORDERHandle)(struct productionStationComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port getOrder */
					struct port_option GETORDER_op; /**< The port_option for the PortHandle of port getOrder */
		}productionStationComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct productionStationComponent_Builder
		*@details Shall be used when creating a struct productionStationComponent_Builder manually
		*/
		static const productionStationComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .GETORDER_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type ProductionStation
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static ProductionStationComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

			
									/**
									*
									*@brief The Check method for DiscretePort getOrder  and message MessagesOrderForPS 
									*@details Checks if  buffer contains a message of type MessagesOrderForPS  
									*
									*/	
										bool_t MCC_ProductionStationComponent_getOrder_exists_MessagesOrderForPS_Messages_Message(Port* port){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Receiv method for DiscretePort getOrder  and message MessagesOrderForPS
									*@details Receives  a message of type MessagesOrderForPS  
									*
									*/	
											bool_t MCC_ProductionStationComponent_getOrder_recv_MessagesOrderForPS_Messages_Message(Port* port, MessagesOrderForPS_Messages_Message* msg){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Check method for DiscretePort getOrder  and message MessagesNoOrder 
									*@details Checks if  buffer contains a message of type MessagesNoOrder  
									*
									*/	
										bool_t MCC_ProductionStationComponent_getOrder_exists_MessagesNoOrder_Messages_Message(Port* port){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Receiv method for DiscretePort getOrder  and message MessagesNoOrder
									*@details Receives  a message of type MessagesNoOrder  
									*
									*/	
											bool_t MCC_ProductionStationComponent_getOrder_recv_MessagesNoOrder_Messages_Message(Port* port, MessagesNoOrder_Messages_Message* msg){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
							
								/**
								*
								*@brief The Send method for DiscretePort getOrder  and message MessagesDoneOrder
								*@details Send  a message of type MessagesDoneOrder  
								*
								*/	
									void MCC_ProductionStationComponent_getOrder_send_MessagesDoneOrder_Messages_Message(Port* port, MessagesDoneOrder_Messages_Message* msg){
										switch(port->handle->type) {
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort getOrder  and message MessagesGetOrder
								*@details Send  a message of type MessagesGetOrder  
								*
								*/	
									void MCC_ProductionStationComponent_getOrder_send_MessagesGetOrder_Messages_Message(Port* port, MessagesGetOrder_Messages_Message* msg){
										switch(port->handle->type) {
										default:
											break;	
										}
									}
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type ProductionStation
		*@details This method creates and initializes a component instance properly by using the struct productionStationComponent_Builder
		*/
			static ProductionStationComponent* MCC_ProductionStationComponent_Builder(productionStationComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = ProductionStationPorductionStationRTSCStateChart_create(
					&instancePool[pool_index]);
				//call init after RTSC was created
				ProductionStationComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
					if(b->GETORDER != PORT_DEACTIVATED) {
					instancePool[pool_index].getOrderPort.status = b->GETORDER;
					instancePool[pool_index].getOrderPort.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].getOrderPort.handle->port = &(instancePool[pool_index].getOrderPort);
					b->createGETORDERHandle(b, (instancePool[pool_index].getOrderPort.handle));
					//instancePool[pool_index].getOrderPort.handle->port = &(instancePool[pool_index].getOrderPort);
				}
			
				return &instancePool[pool_index++];
			}

		

			ProductionStationComponent* MCC_create_ProductionStationComponent(uint8_T ID){
			struct productionStationComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_PRODUCTIONSTATIONPRODUCTIONSTATION:
					b.ID = ID;
				break;
			default:
				break;
			}
			return MCC_ProductionStationComponent_Builder(&b);
			}
		
