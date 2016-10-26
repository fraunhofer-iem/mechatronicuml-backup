			// Container HeaderFile
			#include "MCC_systemComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct systemComponent_Builder
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
								* @brief The builder struct for the Component Type: System
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct systemComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
		}systemComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct systemComponent_Builder
		*@details Shall be used when creating a struct systemComponent_Builder manually
		*/
		static const systemComponent_Builder INIT_BUILDER = { 0,  };
		/**
		*
		*@brief The pool of component instance of Component Type System
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static SystemComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

			
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type System
		*@details This method creates and initializes a component instance properly by using the struct systemComponent_Builder
		*/
			static SystemComponent* MCC_SystemComponent_Builder(systemComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = (
					&instancePool[pool_index]);
				//call init after RTSC was created
				SystemComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
			
				return &instancePool[pool_index++];
			}

		

			SystemComponent* MCC_create_SystemComponent(uint8_T ID){
			struct systemComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_SYSSYSTEM:
					b.ID = ID;
				break;
			default:
				break;
			}
			return MCC_SystemComponent_Builder(&b);
			}
		
