			// Container HeaderFile
			#include "MCC_launcherComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct launcherComponent_Builder
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
								* @brief The builder struct for the Component Type: Launcher
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct launcherComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus LAUNCH; /**< The status of port launch */
					PortHandle* (*createLAUNCHHandle)(struct launcherComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port launch */
					struct port_option LAUNCH_op; /**< The port_option for the PortHandle of port launch */
		}launcherComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct launcherComponent_Builder
		*@details Shall be used when creating a struct launcherComponent_Builder manually
		*/
		static const launcherComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .LAUNCH_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type Launcher
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static LauncherComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

								/**
								*
								*@brief method to test if message exists for DirectedTypedPort launch 
								*@details looksup if the  buffer contains a messages
								*
								*/
									bool_t MCC_LauncherComponent_launch_exists_value(Port* port){
													LocalHandle* localHandle;
													int i = 0;
										switch(port->handle->type) {
													case PORT_HANDLE_TYPE_LOCAL:
														localHandle = (LocalHandle*) port->handle->concreteHandle;
														MessageBuffer* buf = NULL;
														//dont handle a pointer over the the buffer, because msg is already a pointer
														for (i = 0; i < localHandle->numOfSubs; i++) {
															if (localHandle->localSubscribers[i].msgID == 0) {
																buf = localHandle->localSubscribers[i].buffer;
																break;
															}
														}
														return MessageBuffer_doesMessageExists(buf);
														break;
										default:
											break;	
										}
										return false;
									}
								/**
								*
								*@brief The Receive method for DirectedTypedPort launch 
								*
								*/	
								bool_t MCC_LauncherComponent_launch_recv_value(Port* port, bool_T* msg){
													LocalHandle* localHandle;
													int i = 0;
										switch(port->handle->type) {
													case PORT_HANDLE_TYPE_LOCAL:
														localHandle = (LocalHandle*) port->handle->concreteHandle;
														MessageBuffer* buf = NULL;
														//dont handle a pointer over the the buffer, because msg is already a pointer
														for (i = 0; i < localHandle->numOfSubs; i++) {
															if (localHandle->localSubscribers[i].msgID == 0) {
																buf = localHandle->localSubscribers[i].buffer;
																break;
															}
														}
														return MessageBuffer_dequeue(buf, msg);
														break;
										default:
											break;	
										}
										return false;
									}	
			
			
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type Launcher
		*@details This method creates and initializes a component instance properly by using the struct launcherComponent_Builder
		*/
			static LauncherComponent* MCC_LauncherComponent_Builder(launcherComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				//For each port initialize it
					if(b->LAUNCH != PORT_DEACTIVATED) {
					instancePool[pool_index].launch.status = b->LAUNCH;
					instancePool[pool_index].launch.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].launch.handle->port = &(instancePool[pool_index].launch);
					b->createLAUNCHHandle(b, (instancePool[pool_index].launch.handle));
					//instancePool[pool_index].launch.handle->port = &(instancePool[pool_index].launch);
				}
			
				return &instancePool[pool_index++];
			}

							 	static PortHandle* create_LAUNCHLocalHandle(launcherComponent_Builder* b, PortHandle *ptr){
							 		ptr->type = PORT_HANDLE_TYPE_LOCAL;
							 		LocalHandle* hndl = malloc(sizeof(LocalHandle)+1*sizeof(LocalSubscriber));
							 		ptr->concreteHandle = hndl;
							 		hndl->pubID = b->LAUNCH_op.local_option.pubID;
							 		hndl->subID = b->LAUNCH_op.local_option.subID;
							 		//create space for Subscriber
							 		hndl->numOfSubs = 1;
							 		subscribeToMessage(&(hndl->localSubscribers[0] ),hndl->subID, 0, 1, sizeof(bool_T), true);
							 		return ptr;
							 	}
						
		

			LauncherComponent* MCC_create_LauncherComponent(uint8_T ID){
			struct launcherComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_LAUNCHERLAUNCHER:
					b.ID = ID;
							b.LAUNCH = PORT_ACTIVE;
							b.createLAUNCHHandle = &create_LAUNCHLocalHandle;
							b.LAUNCH_op.local_option.pubID = 30276;
							b.LAUNCH_op.local_option.subID = -4985;
				break;
			default:
				break;
			}
			return MCC_LauncherComponent_Builder(&b);
			}
		
