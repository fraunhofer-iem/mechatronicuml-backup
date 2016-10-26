			// Container HeaderFile
			#include "MCC_mainComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct mainComponent_Builder
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
								* @brief The builder struct for the Component Type: Main
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct mainComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus LED_VOLTAGE; /**< The status of port LED_voltage */
					PortHandle* (*createLED_VOLTAGEHandle)(struct mainComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port LED_voltage */
					struct port_option LED_VOLTAGE_op; /**< The port_option for the PortHandle of port LED_voltage */
		}mainComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct mainComponent_Builder
		*@details Shall be used when creating a struct mainComponent_Builder manually
		*/
		static const mainComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .LED_VOLTAGE_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type Main
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static MainComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

								/**
								*
								*@brief The Send method for DirectedTypedPort LED_voltage 
								*
								*/	
								void MCC_MainComponent_LED_voltage_send_value(Port* port, int8_T* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_MAIN_LED_VOLTAGE_Topic");
															DDS_MAIN_LED_VOLTAGEDataWriter* concrete_writer = DDS_MAIN_LED_VOLTAGEDataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_MAIN_LED_VOLTAGE *instance = DDS_MAIN_LED_VOLTAGETypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
															instance->value = *msg;
															//write the actual data
															DDS_MAIN_LED_VOLTAGEDataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_MAIN_LED_VOLTAGETypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
												
														break;
												
										default:
											break;	
										}
									}
			
			
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type Main
		*@details This method creates and initializes a component instance properly by using the struct mainComponent_Builder
		*/
			static MainComponent* MCC_MainComponent_Builder(mainComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = MainRootRTSCStateChart_create(
					&instancePool[pool_index]);
				//call init after RTSC was created
				MainComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
					if(b->LED_VOLTAGE != PORT_DEACTIVATED) {
					instancePool[pool_index].LED_voltage.status = b->LED_VOLTAGE;
					instancePool[pool_index].LED_voltage.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].LED_voltage.handle->port = &(instancePool[pool_index].LED_voltage);
					b->createLED_VOLTAGEHandle(b, (instancePool[pool_index].LED_voltage.handle));
					//instancePool[pool_index].LED_voltage.handle->port = &(instancePool[pool_index].LED_voltage);
				}
			
				return &instancePool[pool_index++];
			}

						
							static PortHandle* create_LED_VOLTAGEDDSHandle(mainComponent_Builder* b, PortHandle *ptr){
								DDS_Topic *topic = NULL;
								const char *type_name = NULL;
								DDS_ReturnCode_t retcode;
								DDS_DataWriter *writer = NULL;
								DDS_DataReader *reader = NULL;
								
								//FIXME: create fixed QoS attributes including partition
							
								ptr->type = PORT_HANDLE_TYPE_DDS;
								DDSHandle *hndl = malloc(sizeof(DDSHandle));
								ptr->concreteHandle = hndl;
							
								//create domain participant
								hndl->participant = DDS_DomainParticipantFactory_create_participant(
								DDS_TheParticipantFactory, b->LED_VOLTAGE_op.dds_option.domainID,
										&DDS_PARTICIPANT_QOS_DEFAULT,
										NULL /* listener */, DDS_STATUS_MASK_NONE);
								if (hndl->participant == NULL) {
									printf("create_participant error\n");
									publisher_shutdown(hndl->participant);
									return NULL;
								}
								//create Publisher
								hndl->publisher = DDS_DomainParticipant_create_publisher(hndl->participant,
										&DDS_PUBLISHER_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
								if (hndl->publisher == NULL) {
									printf("create_publisher error\n");
									publisher_shutdown(hndl->participant);
									return NULL;
								}
							
									//register the dataType
									type_name = DDS_MAIN_LED_VOLTAGETypeSupport_get_type_name();
									retcode = DDS_MAIN_LED_VOLTAGETypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MAIN_LED_VOLTAGE_Topic", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//create writer for Topic
									writer = DDS_Publisher_create_datawriter(hndl->publisher, topic,
											&DDS_DATAWRITER_QOS_DEFAULT, NULL /* listener */,
											DDS_STATUS_MASK_NONE);
									if (writer == NULL) {
										printf("create_datawriter error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
							
							
								return ptr;
								}	
		

			MainComponent* MCC_create_MainComponent(uint8_T ID){
			struct mainComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_C1MAIN:
					b.ID = ID;
							b.LED_VOLTAGE = PORT_UNCONNECTED;
							b.createLED_VOLTAGEHandle = &create_LED_VOLTAGEDDSHandle;
							b.LED_VOLTAGE_op.dds_option.domainID = 0;
							b.LED_VOLTAGE_op.dds_option.partition = -20106;
				break;
			default:
				break;
			}
			return MCC_MainComponent_Builder(&b);
			}
		
