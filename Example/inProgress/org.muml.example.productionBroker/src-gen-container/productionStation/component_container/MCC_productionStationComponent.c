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
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_MessagesorderForPS_MessagesbrokerForPSPortBroker_TopicbrokerForPSPort");
															//	DDS_MessagesOrderForPS_MessagesDataReader* concrete_reader = DDS_MessagesOrderForPS_MessagesDataReader_narrow(reader);
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
									*@brief The Receiv method for DiscretePort getOrder  and message MessagesOrderForPS
									*@details Receives  a message of type MessagesOrderForPS  
									*
									*/	
											bool_t MCC_ProductionStationComponent_getOrder_recv_MessagesOrderForPS_Messages_Message(Port* port, MessagesOrderForPS_Messages_Message* msg){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_MessagesorderForPS_MessagesbrokerForPSPortBroker_TopicbrokerForPSPort");
																DDS_MessagesorderForPS_MessagesDataReader* concrete_reader = DDS_MessagesorderForPS_MessagesDataReader_narrow(reader);
																//create DDS_Instance to read
																DDS_MessagesorderForPS_Messages *instance = DDS_MessagesorderForPS_MessagesTypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
																retcode = DDS_MessagesorderForPS_MessagesDataReader_take_next_sample(concrete_reader, instance,
																		&sample_info);
																if (retcode == DDS_RETCODE_NO_DATA) {
																	return false;
																}
																//make message transformation
																		msg->receiverPsID = instance->receiverPsID;
																		msg->orderID = instance->orderID;
																		msg->ingredientID = instance->ingredientID;
																		msg->amount = instance->amount;
																
																DDS_MessagesorderForPS_MessagesTypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																return true;
															break;
													
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
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_MessagesnoOrder_MessagesbrokerForPSPortBroker_TopicbrokerForPSPort");
															//	DDS_MessagesNoOrder_MessagesDataReader* concrete_reader = DDS_MessagesNoOrder_MessagesDataReader_narrow(reader);
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
									*@brief The Receiv method for DiscretePort getOrder  and message MessagesNoOrder
									*@details Receives  a message of type MessagesNoOrder  
									*
									*/	
											bool_t MCC_ProductionStationComponent_getOrder_recv_MessagesNoOrder_Messages_Message(Port* port, MessagesNoOrder_Messages_Message* msg){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_MessagesnoOrder_MessagesbrokerForPSPortBroker_TopicbrokerForPSPort");
																DDS_MessagesnoOrder_MessagesDataReader* concrete_reader = DDS_MessagesnoOrder_MessagesDataReader_narrow(reader);
																//create DDS_Instance to read
																DDS_MessagesnoOrder_Messages *instance = DDS_MessagesnoOrder_MessagesTypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
																retcode = DDS_MessagesnoOrder_MessagesDataReader_take_next_sample(concrete_reader, instance,
																		&sample_info);
																if (retcode == DDS_RETCODE_NO_DATA) {
																	return false;
																}
																//make message transformation
																		msg->receiverPsID = instance->receiverPsID;
																
																DDS_MessagesnoOrder_MessagesTypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																return true;
															break;
													
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
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_MessagesdoneOrder_MessagesgetOrderProductionStation_TopicgetOrder");
												
															DDS_MessagesdoneOrder_MessagesDataWriter* concrete_writer = DDS_MessagesdoneOrder_MessagesDataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_MessagesdoneOrder_Messages *instance = DDS_MessagesdoneOrder_MessagesTypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->orderID = msg->orderID;
															
															//write the actual data
															DDS_MessagesdoneOrder_MessagesDataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_MessagesdoneOrder_MessagesTypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
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
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_MessagesgetOrder_MessagesgetOrderProductionStation_TopicgetOrder");
												
															DDS_MessagesgetOrder_MessagesDataWriter* concrete_writer = DDS_MessagesgetOrder_MessagesDataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_MessagesgetOrder_Messages *instance = DDS_MessagesgetOrder_MessagesTypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->psID = msg->psID;
																	instance->producibleIngredients = msg->producibleIngredients;
															
															//write the actual data
															DDS_MessagesgetOrder_MessagesDataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_MessagesgetOrder_MessagesTypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort getOrder  and message MessagesHeartbeat
								*@details Send  a message of type MessagesHeartbeat  
								*
								*/	
									void MCC_ProductionStationComponent_getOrder_send_MessagesHeartbeat_Messages_Message(Port* port, MessagesHeartbeat_Messages_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_Messagesheartbeat_MessagesgetOrderProductionStation_TopicgetOrder");
												
															DDS_Messagesheartbeat_MessagesDataWriter* concrete_writer = DDS_Messagesheartbeat_MessagesDataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_Messagesheartbeat_Messages *instance = DDS_Messagesheartbeat_MessagesTypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->psID = msg->psID;
															
															//write the actual data
															DDS_Messagesheartbeat_MessagesDataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_Messagesheartbeat_MessagesTypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
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
				instancePool[pool_index].stateChart = ProductionStationProductionStationRTSCStateChart_create(
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

						
								static PortHandle* create_GETORDERDDSHandle(productionStationComponent_Builder* b, PortHandle *ptr){
								DDS_Topic *topic = NULL;
								const char *type_name = NULL;
								DDS_ReturnCode_t retcode;
								DDS_DataWriter *writer = NULL;
								DDS_DataReader *reader = NULL;
								
								//FIXME: create fixed QoS attributes including partition
							
								ptr->type = PORT_HANDLE_TYPE_DDS;
								DDSHandle *hndl = malloc(sizeof(DDSHandle));
								ptr->concreteHandle = hndl;
							
									//set variables for listeners
									hndl->numOfReaderToMatch= 2 ;
									hndl->numOfWriterToMatch= 3  ;
							
								//create domain participant
								hndl->participant = DDS_DomainParticipantFactory_create_participant(
								DDS_TheParticipantFactory, b->GETORDER_op.dds_option.domainID,
										&DDS_PARTICIPANT_QOS_DEFAULT,
										NULL /* listener */, DDS_STATUS_MASK_NONE);
								if (hndl->participant == NULL) {
									printf("create_participant error\n");
									publisher_shutdown(hndl->participant);
									return NULL;
								}
							
								//create PublisherLister
								DDS_StatusMask pubmask = DDS_STATUS_MASK_NONE;
								struct DDS_PublisherListener pub_listener = DDS_PublisherListener_INITIALIZER;
																
								pub_listener.as_datawriterlistener.on_liveliness_lost=PublisherListener_LivelinessLost;
								pub_listener.as_datawriterlistener.on_publication_matched=PublisherListener_PublicationMatched;
								pub_listener.as_datawriterlistener.as_listener.listener_data=ptr;
								pubmask = DDS_LIVELINESS_LOST_STATUS | DDS_PUBLICATION_MATCHED_STATUS;
									
							
							
								//create Publisher Partition
								struct DDS_PublisherQos pubQoS = DDS_PublisherQos_INITIALIZER;
								retcode = DDS_DomainParticipant_get_default_publisher_qos(hndl->participant,&pubQoS);
								 if (retcode != DDS_RETCODE_OK) {
							       printf("get_default_publisher_qos error\n");
								    return NULL;
								 }
								 	DDS_StringSeq_ensure_length(&pubQoS.partition.name, 1, 1);
									*DDS_StringSeq_get_reference(&pubQoS.partition.name, 0) =  DDS_String_dup("12336");
								
								//create Publisher
								hndl->publisher = DDS_DomainParticipant_create_publisher(hndl->participant,
										&pubQoS, &pub_listener /* listener */,
										pubmask);
								DDS_PublisherQos_finalize(&pubQoS);
								if (hndl->publisher == NULL) {
									printf("create_publisher error\n");
									publisher_shutdown(hndl->participant);
									return NULL;
								}
							
								//create Writer QoS
									struct DDS_DataWriterQos writerQoS = DDS_DataWriterQos_INITIALIZER;
									retcode = DDS_Publisher_get_default_datawriter_qos(hndl->publisher, &writerQoS);
									if (retcode != DDS_RETCODE_OK) {
							      		 printf("get_default_publisher_qos error\n");
								    	return NULL;
									}
								
									//register the dataType
									type_name = DDS_MessagesdoneOrder_MessagesTypeSupport_get_type_name();
									retcode = DDS_MessagesdoneOrder_MessagesTypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic = DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MessagesdoneOrder_MessagesgetOrderProductionStation_TopicgetOrder", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
							
									
							
											writerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
									//create writer for Topic
									writer = DDS_Publisher_create_datawriter(hndl->publisher, topic,
											&writerQoS, NULL /* listener */,
											DDS_STATUS_MASK_NONE);
							
							
									if (writer == NULL) {
										printf("create_datawriter error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the dataType
									type_name = DDS_MessagesgetOrder_MessagesTypeSupport_get_type_name();
									retcode = DDS_MessagesgetOrder_MessagesTypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic = DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MessagesgetOrder_MessagesgetOrderProductionStation_TopicgetOrder", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
							
									
							
											writerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
									//create writer for Topic
									writer = DDS_Publisher_create_datawriter(hndl->publisher, topic,
											&writerQoS, NULL /* listener */,
											DDS_STATUS_MASK_NONE);
							
							
									if (writer == NULL) {
										printf("create_datawriter error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the dataType
									type_name = DDS_Messagesheartbeat_MessagesTypeSupport_get_type_name();
									retcode = DDS_Messagesheartbeat_MessagesTypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic = DDS_DomainParticipant_create_topic(hndl->participant, "DDS_Messagesheartbeat_MessagesgetOrderProductionStation_TopicgetOrder", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
							
									
							
											writerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
									//create writer for Topic
									writer = DDS_Publisher_create_datawriter(hndl->publisher, topic,
											&writerQoS, NULL /* listener */,
											DDS_STATUS_MASK_NONE);
							
							
									if (writer == NULL) {
										printf("create_datawriter error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
								DDS_DataWriterQos_finalize(&writerQoS);
							
								//create SubscriberListener	
								DDS_StatusMask submask = DDS_STATUS_MASK_NONE;
								struct DDS_SubscriberListener sub_listener = DDS_SubscriberListener_INITIALIZER;
																
								sub_listener.as_datareaderlistener.on_liveliness_changed=SubscriberListener_LivelinessChanged;
								sub_listener.as_datareaderlistener.on_subscription_matched=SubscriberListener_SubscriptionMatched;
								sub_listener.as_datareaderlistener.as_listener.listener_data=ptr;
								submask = DDS_LIVELINESS_CHANGED_STATUS | DDS_SUBSCRIPTION_MATCHED_STATUS;
										
								
							
								//create Subscriber Partition
								struct DDS_SubscriberQos subQoS = DDS_SubscriberQos_INITIALIZER;
								retcode = DDS_DomainParticipant_get_default_subscriber_qos(hndl->participant,&subQoS);
								 if (retcode != DDS_RETCODE_OK) {
							       printf("get_default_publisher_qos error\n");
								    return NULL;
								 }
								 	DDS_StringSeq_ensure_length(&subQoS.partition.name, 1, 1);
									*DDS_StringSeq_get_reference(&subQoS.partition.name, 0) =  DDS_String_dup("12336");
							
								//create Subscriber
								hndl->subscriber = DDS_DomainParticipant_create_subscriber(
										hndl->participant, &subQoS, &sub_listener /* listener */,
										submask);
								DDS_SubscriberQos_finalize(&subQoS);
								if (hndl->subscriber == NULL) {
									printf("create_subscriber error\n");
									subscriber_shutdown(hndl->participant);
									return NULL;
								}
							
								//create Reader QoS
									struct DDS_DataReaderQos readerQoS = DDS_DataReaderQos_INITIALIZER;
									retcode = DDS_Subscriber_get_default_datareader_qos(hndl->subscriber, &readerQoS);
									if (retcode != DDS_RETCODE_OK) {
							      		 printf("get_default_subscriber_qos error\n");
								    	return NULL;
									}
							
									//register the dataType
									type_name = DDS_MessagesorderForPS_MessagesTypeSupport_get_type_name();
									retcode = DDS_MessagesorderForPS_MessagesTypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic = DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MessagesorderForPS_MessagesbrokerForPSPortBroker_TopicbrokerForPSPort", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									
											readerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
										readerQoS.history.depth=100;
											readerQoS.history.kind=DDS_KEEP_LAST_HISTORY_QOS;
										
									
							
							
									//create reader for Topic
									reader = DDS_Subscriber_create_datareader(hndl->subscriber,
										DDS_Topic_as_topicdescription(topic), &readerQoS,
										NULL, DDS_STATUS_MASK_ALL);
							
									if (reader == NULL) {
										printf("create_datareader error\n");
										subscriber_shutdown(hndl->participant);
										return NULL;
									}
									//register the dataType
									type_name = DDS_MessagesnoOrder_MessagesTypeSupport_get_type_name();
									retcode = DDS_MessagesnoOrder_MessagesTypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic = DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MessagesnoOrder_MessagesbrokerForPSPortBroker_TopicbrokerForPSPort", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									
											readerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
										readerQoS.history.depth=100;
											readerQoS.history.kind=DDS_KEEP_LAST_HISTORY_QOS;
										
									
							
							
									//create reader for Topic
									reader = DDS_Subscriber_create_datareader(hndl->subscriber,
										DDS_Topic_as_topicdescription(topic), &readerQoS,
										NULL, DDS_STATUS_MASK_ALL);
							
									if (reader == NULL) {
										printf("create_datareader error\n");
										subscriber_shutdown(hndl->participant);
										return NULL;
									}
										DDS_DataReaderQos_finalize(&readerQoS);
									
								return ptr;
								}	
		

		
		

			ProductionStationComponent* MCC_create_ProductionStationComponent(uint8_T ID){
			struct productionStationComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_PRODUCTIONSTATIONPRODUCTIONSTATION:
					b.ID = ID;
							b.GETORDER = PORT_UNCONNECTED;
							b.createGETORDERHandle = &create_GETORDERDDSHandle;
							b.GETORDER_op.dds_option.domainID = 0;
							b.GETORDER_op.dds_option.partition = 12336;
				break;
			default:
				break;
			}
			return MCC_ProductionStationComponent_Builder(&b);
			}
		
