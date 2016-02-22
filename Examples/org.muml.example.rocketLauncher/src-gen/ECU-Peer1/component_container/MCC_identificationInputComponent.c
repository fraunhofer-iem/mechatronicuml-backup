			// Container HeaderFile
			#include "MCC_identificationInputComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct identificationInputComponent_Builder
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
								* @brief The builder struct for the Component Type: IdentificationInput
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct identificationInputComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus CODE; /**< The status of port code */
					PortHandle* (*createCODEHandle)(struct identificationInputComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port code */
					struct port_option CODE_op; /**< The port_option for the PortHandle of port code */
		}identificationInputComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct identificationInputComponent_Builder
		*@details Shall be used when creating a struct identificationInputComponent_Builder manually
		*/
		static const identificationInputComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .CODE_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type IdentificationInput
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static IdentificationInputComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

								/**
								*
								*@brief The Send method for DirectedTypedPort code 
								*
								*/	
								void MCC_IdentificationInputComponent_code_send_value(Port* port, int32_T* msg){
													LocalHandle* localHandle;
										switch(port->handle->type) {
													case PORT_HANDLE_TYPE_LOCAL:
														localHandle = (LocalHandle*) port->handle->concreteHandle;
														//dont handle a pointer over the the buffer, because msg is already a pointer
														publishMessage(localHandle->pubID, 0, msg);
														break;
										default:
											break;	
										}
									}
			
			
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type IdentificationInput
		*@details This method creates and initializes a component instance properly by using the struct identificationInputComponent_Builder
		*/
			static IdentificationInputComponent* MCC_IdentificationInputComponent_Builder(identificationInputComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				//For each port initialize it
					if(b->CODE != PORT_DEACTIVATED) {
					instancePool[pool_index].code.status = b->CODE;
					instancePool[pool_index].code.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].code.handle->port = &(instancePool[pool_index].code);
					b->createCODEHandle(b, (instancePool[pool_index].code.handle));
					//instancePool[pool_index].code.handle->port = &(instancePool[pool_index].code);
				}
			
				return &instancePool[pool_index++];
			}

							 	static PortHandle* create_CODELocalHandle(identificationInputComponent_Builder* b, PortHandle *ptr){
							 		ptr->type = PORT_HANDLE_TYPE_LOCAL;
							 		LocalHandle* hndl = malloc(sizeof(LocalHandle)+0*sizeof(LocalSubscriber));
							 		ptr->concreteHandle = hndl;
							 		hndl->pubID = b->CODE_op.local_option.pubID;
							 		hndl->subID = b->CODE_op.local_option.subID;
							 		return ptr;
							 	}
						
		

			IdentificationInputComponent* MCC_create_IdentificationInputComponent(uint8_T ID){
			struct identificationInputComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_PEER1INPUTIDENTIFICATIONINPUT:
					b.ID = ID;
							b.CODE = PORT_ACTIVE;
							b.createCODEHandle = &create_CODELocalHandle;
							b.CODE_op.local_option.pubID = -24519;
							b.CODE_op.local_option.subID = -25176;
				break;
			default:
				break;
			}
			return MCC_IdentificationInputComponent_Builder(&b);
			}
		
