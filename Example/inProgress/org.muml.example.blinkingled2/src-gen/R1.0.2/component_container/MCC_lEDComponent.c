			// Container HeaderFile
			#include "MCC_lEDComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct lEDComponent_Builder
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
								* @brief The builder struct for the Component Type: LED
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct lEDComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus VOLTAGE; /**< The status of port voltage */
					PortHandle* (*createVOLTAGEHandle)(struct lEDComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port voltage */
					struct port_option VOLTAGE_op; /**< The port_option for the PortHandle of port voltage */
		}lEDComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct lEDComponent_Builder
		*@details Shall be used when creating a struct lEDComponent_Builder manually
		*/
		static const lEDComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .VOLTAGE_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type LED
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static LEDComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

								/**
								*
								*@brief method to test if message exists for DirectedTypedPort voltage 
								*@details looksup if the  buffer contains a messages
								*
								*/
									bool_t MCC_LEDComponent_voltage_exists_value(Port* port){
												DDS_Subscriber* subscriber;
												DDS_DataReader* reader;
												struct DDS_SampleInfo sample_info;
												DDS_ReturnCode_t retcode;
										switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
															//find correct dataReader
															subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
															reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_MAIN_LED_VOLTAGE_Topic");
														//	DDS_LED_VOLTAGEDataReader* concrete_reader = DDS_LED_VOLTAGEDataReader_narrow(reader);
															int availableSamples = 0;
															struct DDS_DataReaderCacheStatus myStatus = DDS_DataReaderCacheStatus_INITIALIZER; 
															retcode = DDS_DataReader_get_datareader_cache_status(reader, &myStatus); 
															if(retcode != DDS_RETCODE_OK)
																return false;
															availableSamples = myStatus.sample_count;
															DDS_DataReaderCacheStatus_finalize(&myStatus);   
															if(availableSamples>0)
																return true;
															else
																return false;
														break;
												
										default:
											break;	
										}
										return false;
									}
								/**
								*
								*@brief The Receive method for DirectedTypedPort voltage 
								*
								*/	
								bool_t MCC_LEDComponent_voltage_recv_value(Port* port, int8_T* msg){
												DDS_Subscriber* subscriber;
												DDS_DataReader* reader;
												struct DDS_SampleInfo sample_info;
												DDS_ReturnCode_t retcode;
										switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
															//find correct dataReader
															subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
															reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_MAIN_LED_VOLTAGE_Topic");
															DDS_MAIN_LED_VOLTAGEDataReader* concrete_reader = DDS_MAIN_LED_VOLTAGEDataReader_narrow(reader);
															//create DDS_Instance to read
															DDS_MAIN_LED_VOLTAGE *instance = DDS_MAIN_LED_VOLTAGETypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															retcode = DDS_MAIN_LED_VOLTAGEDataReader_take_next_sample(concrete_reader, instance,
																	&sample_info);
															if (retcode == DDS_RETCODE_NO_DATA) {
																printf("no new data\n");
																return false;
															}
															//make message transformation
															*msg = (int8_T) (instance->value);
															printf("new data %d\n",*msg);
															DDS_MAIN_LED_VOLTAGETypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																											
															return true;
														break;
												
										default:
											break;	
										}
										return false;
									}	
			
			
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type LED
		*@details This method creates and initializes a component instance properly by using the struct lEDComponent_Builder
		*/
			static LEDComponent* MCC_LEDComponent_Builder(lEDComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				//For each port initialize it
					if(b->VOLTAGE != PORT_DEACTIVATED) {
					Port* port = (Port*) &(instancePool[pool_index].voltage);
					port->status = b->VOLTAGE;
					port->handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			port->handle->port = port;
					b->createVOLTAGEHandle(b, (port->handle));
					//instancePool[pool_index].voltage.handle->port = &(instancePool[pool_index].voltage);
				}
			
				return &instancePool[pool_index++];
			}

						
							static PortHandle* create_VOLTAGEDDSHandle(lEDComponent_Builder* b, PortHandle *ptr){
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
								DDS_TheParticipantFactory, b->VOLTAGE_op.dds_option.domainID,
										&DDS_PARTICIPANT_QOS_DEFAULT,
										NULL /* listener */, DDS_STATUS_MASK_NONE);
								if (hndl->participant == NULL) {
									printf("create_participant error\n");
									publisher_shutdown(hndl->participant);
									return NULL;
								}
							
								hndl->subscriber = DDS_DomainParticipant_create_subscriber(
										hndl->participant, &DDS_SUBSCRIBER_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
								if (hndl->subscriber == NULL) {
									printf("create_subscriber error\n");
									subscriber_shutdown(hndl->participant);
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
									topic = DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MAIN_LED_VOLTAGE_Topic", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//create reader for Topic
									reader = DDS_Subscriber_create_datareader(hndl->subscriber,
										DDS_Topic_as_topicdescription(topic), &DDS_DATAREADER_QOS_DEFAULT,
										NULL, DDS_STATUS_MASK_ALL);
									if (reader == NULL) {
										printf("create_datareader error\n");
										subscriber_shutdown(hndl->participant);
										return NULL;
									}
							
								return ptr;
								}	
		

			LEDComponent* MCC_create_LEDComponent(uint8_T ID){
			struct lEDComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_C2LED:
					b.ID = ID;
							b.VOLTAGE = PORT_UNCONNECTED;
							b.createVOLTAGEHandle = &create_VOLTAGEDDSHandle;
							b.VOLTAGE_op.dds_option.domainID = 0;
							b.VOLTAGE_op.dds_option.partition = -20106;
				break;
			default:
				break;
			}
			return MCC_LEDComponent_Builder(&b);
			}
		
