			// Container HeaderFile
			#include "MCC_launchDelegatorComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct launchDelegatorComponent_Builder
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
								* @brief The builder struct for the Component Type: LaunchDelegator
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct launchDelegatorComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus CODE; /**< The status of port code */
					PortHandle* (*createCODEHandle)(struct launchDelegatorComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port code */
					struct port_option CODE_op; /**< The port_option for the PortHandle of port code */
					PortStatus VERIFIER; /**< The status of port verifier */
					PortHandle* (*createVERIFIERHandle)(struct launchDelegatorComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port verifier */
					struct port_option VERIFIER_op; /**< The port_option for the PortHandle of port verifier */
		}launchDelegatorComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct launchDelegatorComponent_Builder
		*@details Shall be used when creating a struct launchDelegatorComponent_Builder manually
		*/
		static const launchDelegatorComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .CODE_op.local_option={0,0}  , PORT_DEACTIVATED, NULL, .VERIFIER_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type LaunchDelegator
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static LaunchDelegatorComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

								/**
								*
								*@brief method to test if message exists for DirectedTypedPort code 
								*@details looksup if the  buffer contains a messages
								*
								*/
									bool_t MCC_LaunchDelegatorComponent_code_exists_value(Port* port){
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
								*@brief The Receive method for DirectedTypedPort code 
								*
								*/	
								bool_t MCC_LaunchDelegatorComponent_code_recv_value(Port* port, int32_T* msg){
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
								*@brief The Send method for DiscretePort verifier  and message M1LaunchCode
								*@details Send  a message of type M1LaunchCode  
								*
								*/	
									void MCC_LaunchDelegatorComponent_verifier_send_M1LaunchCode_M1_Message(Port* port, M1LaunchCode_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1launchCode_M1verifierLaunchDelegator_Topicverifier");
												
															DDS_M1launchCode_M1DataWriter* concrete_writer = DDS_M1launchCode_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1launchCode_M1 *instance = DDS_M1launchCode_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->id = msg->id;
															
															//write the actual data
															DDS_M1launchCode_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1launchCode_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type LaunchDelegator
		*@details This method creates and initializes a component instance properly by using the struct launchDelegatorComponent_Builder
		*/
			static LaunchDelegatorComponent* MCC_LaunchDelegatorComponent_Builder(launchDelegatorComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = LaunchDelegatorLaunchDelegatorStateChart_create(
					&instancePool[pool_index]);
				//call init after RTSC was created
				LaunchDelegatorComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
					if(b->CODE != PORT_DEACTIVATED) {
					instancePool[pool_index].code.status = b->CODE;
					instancePool[pool_index].code.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].code.handle->port = &(instancePool[pool_index].code);
					b->createCODEHandle(b, (instancePool[pool_index].code.handle));
					//instancePool[pool_index].code.handle->port = &(instancePool[pool_index].code);
				}
					if(b->VERIFIER != PORT_DEACTIVATED) {
					instancePool[pool_index].verifierPort.status = b->VERIFIER;
					instancePool[pool_index].verifierPort.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].verifierPort.handle->port = &(instancePool[pool_index].verifierPort);
					b->createVERIFIERHandle(b, (instancePool[pool_index].verifierPort.handle));
					//instancePool[pool_index].verifierPort.handle->port = &(instancePool[pool_index].verifierPort);
				}
			
				return &instancePool[pool_index++];
			}

							 	static PortHandle* create_CODELocalHandle(launchDelegatorComponent_Builder* b, PortHandle *ptr){
							 		ptr->type = PORT_HANDLE_TYPE_LOCAL;
							 		LocalHandle* hndl = malloc(sizeof(LocalHandle)+1*sizeof(LocalSubscriber));
							 		ptr->concreteHandle = hndl;
							 		hndl->pubID = b->CODE_op.local_option.pubID;
							 		hndl->subID = b->CODE_op.local_option.subID;
							 		//create space for Subscriber
							 		hndl->numOfSubs = 1;
							 		subscribeToMessage(&(hndl->localSubscribers[0] ),hndl->subID, 0, 1, sizeof(int32_T), true);
							 		return ptr;
							 	}
						
						
								static PortHandle* create_VERIFIERDDSHandle(launchDelegatorComponent_Builder* b, PortHandle *ptr){
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
									hndl->numOfReaderToMatch= 0 ;
									hndl->numOfWriterToMatch= 1  ;
							
								//create domain participant
								hndl->participant = DDS_DomainParticipantFactory_create_participant(
								DDS_TheParticipantFactory, b->VERIFIER_op.dds_option.domainID,
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
									*DDS_StringSeq_get_reference(&pubQoS.partition.name, 0) =  DDS_String_dup("7270");
								
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
									type_name = DDS_M1launchCode_M1TypeSupport_get_type_name();
									retcode = DDS_M1launchCode_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1launchCode_M1verifierLaunchDelegator_Topicverifier", type_name,
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
							
									
								return ptr;
								}	
		

			LaunchDelegatorComponent* MCC_create_LaunchDelegatorComponent(uint8_T ID){
			struct launchDelegatorComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_PEER2LAUNCHDELEGATOR:
					b.ID = ID;
							b.VERIFIER = PORT_UNCONNECTED;
							b.createVERIFIERHandle = &create_VERIFIERDDSHandle;
							b.VERIFIER_op.dds_option.domainID = 0;
							b.VERIFIER_op.dds_option.partition = 7270;
							b.CODE = PORT_ACTIVE;
							b.createCODEHandle = &create_CODELocalHandle;
							b.CODE_op.local_option.pubID = 27567;
							b.CODE_op.local_option.subID = -26371;
				break;
			default:
				break;
			}
			return MCC_LaunchDelegatorComponent_Builder(&b);
			}
		
