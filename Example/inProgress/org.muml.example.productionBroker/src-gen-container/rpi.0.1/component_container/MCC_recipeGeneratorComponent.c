			// Container HeaderFile
			#include "MCC_recipeGeneratorComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct recipeGeneratorComponent_Builder
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
								* @brief The builder struct for the Component Type: RecipeGenerator
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct recipeGeneratorComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus PROVIDEORDER; /**< The status of port provideOrder */
					PortHandle* (*createPROVIDEORDERHandle)(struct recipeGeneratorComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port provideOrder */
					struct port_option PROVIDEORDER_op; /**< The port_option for the PortHandle of port provideOrder */
		}recipeGeneratorComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct recipeGeneratorComponent_Builder
		*@details Shall be used when creating a struct recipeGeneratorComponent_Builder manually
		*/
		static const recipeGeneratorComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .PROVIDEORDER_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type RecipeGenerator
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static RecipeGeneratorComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

			
							
								/**
								*
								*@brief The Send method for DiscretePort provideOrder  and message MessagesSimpleOrder
								*@details Send  a message of type MessagesSimpleOrder  
								*
								*/	
									void MCC_RecipeGeneratorComponent_provideOrder_send_MessagesSimpleOrder_Messages_Message(Port* port, MessagesSimpleOrder_Messages_Message* msg){
										switch(port->handle->type) {
										default:
											break;	
										}
									}
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type RecipeGenerator
		*@details This method creates and initializes a component instance properly by using the struct recipeGeneratorComponent_Builder
		*/
			static RecipeGeneratorComponent* MCC_RecipeGeneratorComponent_Builder(recipeGeneratorComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = RecipeGeneratorReciepeGeneratorStateChart_create(
					&instancePool[pool_index]);
				//call init after RTSC was created
				RecipeGeneratorComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
					if(b->PROVIDEORDER != PORT_DEACTIVATED) {
					instancePool[pool_index].provideOrderPort.status = b->PROVIDEORDER;
					instancePool[pool_index].provideOrderPort.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].provideOrderPort.handle->port = &(instancePool[pool_index].provideOrderPort);
					b->createPROVIDEORDERHandle(b, (instancePool[pool_index].provideOrderPort.handle));
					//instancePool[pool_index].provideOrderPort.handle->port = &(instancePool[pool_index].provideOrderPort);
				}
			
				return &instancePool[pool_index++];
			}

		

			RecipeGeneratorComponent* MCC_create_RecipeGeneratorComponent(uint8_T ID){
			struct recipeGeneratorComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_RECIPEGENERATORRECIPEGENERATOR:
					b.ID = ID;
				break;
			default:
				break;
			}
			return MCC_RecipeGeneratorComponent_Builder(&b);
			}
		
