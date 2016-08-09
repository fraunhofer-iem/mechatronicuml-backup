			// Container HeaderFile
			#include "MCC_brokerComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct brokerComponent_Builder
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
								* @brief The builder struct for the Component Type: Broker
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct brokerComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus GETORDER; /**< The status of port getOrder */
					PortHandle* (*createGETORDERHandle)(struct brokerComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port getOrder */
					struct port_option GETORDER_op; /**< The port_option for the PortHandle of port getOrder */
					PortStatus BROKERFORPSPORT; /**< The status of port brokerForPSPort */
					PortHandle* (*createBROKERFORPSPORTHandle)(struct brokerComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port brokerForPSPort */
					struct port_option BROKERFORPSPORT_op; /**< The port_option for the PortHandle of port brokerForPSPort */
		}brokerComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct brokerComponent_Builder
		*@details Shall be used when creating a struct brokerComponent_Builder manually
		*/
		static const brokerComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .GETORDER_op.local_option={0,0}  , PORT_DEACTIVATED, NULL, .BROKERFORPSPORT_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type Broker
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static BrokerComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

			
									/**
									*
									*@brief The Check method for DiscretePort getOrder  and message MessagesSimpleOrder 
									*@details Checks if  buffer contains a message of type MessagesSimpleOrder  
									*
									*/	
										bool_t MCC_BrokerComponent_getOrder_exists_MessagesSimpleOrder_Messages_Message(Port* port){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Receiv method for DiscretePort getOrder  and message MessagesSimpleOrder
									*@details Receives  a message of type MessagesSimpleOrder  
									*
									*/	
											bool_t MCC_BrokerComponent_getOrder_recv_MessagesSimpleOrder_Messages_Message(Port* port, MessagesSimpleOrder_Messages_Message* msg){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
							
									/**
									*
									*@brief The Check method for DiscretePort brokerForPSPort  and message MessagesDoneOrder 
									*@details Checks if  buffer contains a message of type MessagesDoneOrder  
									*
									*/	
										bool_t MCC_BrokerComponent_brokerForPSPort_exists_MessagesDoneOrder_Messages_Message(Port* port){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Receiv method for DiscretePort brokerForPSPort  and message MessagesDoneOrder
									*@details Receives  a message of type MessagesDoneOrder  
									*
									*/	
											bool_t MCC_BrokerComponent_brokerForPSPort_recv_MessagesDoneOrder_Messages_Message(Port* port, MessagesDoneOrder_Messages_Message* msg){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Check method for DiscretePort brokerForPSPort  and message MessagesGetOrder 
									*@details Checks if  buffer contains a message of type MessagesGetOrder  
									*
									*/	
										bool_t MCC_BrokerComponent_brokerForPSPort_exists_MessagesGetOrder_Messages_Message(Port* port){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Receiv method for DiscretePort brokerForPSPort  and message MessagesGetOrder
									*@details Receives  a message of type MessagesGetOrder  
									*
									*/	
											bool_t MCC_BrokerComponent_brokerForPSPort_recv_MessagesGetOrder_Messages_Message(Port* port, MessagesGetOrder_Messages_Message* msg){
											switch(port->handle->type) {
											default:
												break;	
											}
											return false;
										}
							
								/**
								*
								*@brief The Send method for DiscretePort brokerForPSPort  and message MessagesOrderForPS
								*@details Send  a message of type MessagesOrderForPS  
								*
								*/	
									void MCC_BrokerComponent_brokerForPSPort_send_MessagesOrderForPS_Messages_Message(Port* port, MessagesOrderForPS_Messages_Message* msg){
										switch(port->handle->type) {
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort brokerForPSPort  and message MessagesNoOrder
								*@details Send  a message of type MessagesNoOrder  
								*
								*/	
									void MCC_BrokerComponent_brokerForPSPort_send_MessagesNoOrder_Messages_Message(Port* port, MessagesNoOrder_Messages_Message* msg){
										switch(port->handle->type) {
										default:
											break;	
										}
									}
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type Broker
		*@details This method creates and initializes a component instance properly by using the struct brokerComponent_Builder
		*/
			static BrokerComponent* MCC_BrokerComponent_Builder(brokerComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = BrokerBrokerStateChart_create(
					&instancePool[pool_index]);
				//call init after RTSC was created
				BrokerComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
					if(b->GETORDER != PORT_DEACTIVATED) {
					instancePool[pool_index].getOrderPort.status = b->GETORDER;
					instancePool[pool_index].getOrderPort.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].getOrderPort.handle->port = &(instancePool[pool_index].getOrderPort);
					b->createGETORDERHandle(b, (instancePool[pool_index].getOrderPort.handle));
					//instancePool[pool_index].getOrderPort.handle->port = &(instancePool[pool_index].getOrderPort);
				}
					if(b->BROKERFORPSPORT != PORT_DEACTIVATED) {
					instancePool[pool_index].brokerForPSPortPort.status = b->BROKERFORPSPORT;
					instancePool[pool_index].brokerForPSPortPort.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].brokerForPSPortPort.handle->port = &(instancePool[pool_index].brokerForPSPortPort);
					b->createBROKERFORPSPORTHandle(b, (instancePool[pool_index].brokerForPSPortPort.handle));
					//instancePool[pool_index].brokerForPSPortPort.handle->port = &(instancePool[pool_index].brokerForPSPortPort);
				}
			
				return &instancePool[pool_index++];
			}

		

			BrokerComponent* MCC_create_BrokerComponent(uint8_T ID){
			struct brokerComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_BROKERBROKER:
					b.ID = ID;
				break;
			default:
				break;
			}
			return MCC_BrokerComponent_Builder(&b);
			}
		
