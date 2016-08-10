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
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_MessagessimpleOrder_MessagesprovideOrderRecipeGenerator_TopicprovideOrder");
												
															DDS_MessagessimpleOrder_MessagesDataWriter* concrete_writer = DDS_MessagessimpleOrder_MessagesDataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_MessagessimpleOrder_Messages *instance = DDS_MessagessimpleOrder_MessagesTypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->orderID = msg->orderID;
																	instance->ingredientID = msg->ingredientID;
																	instance->amount = msg->amount;
															
															//write the actual data
															DDS_MessagessimpleOrder_MessagesDataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_MessagessimpleOrder_MessagesTypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
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

						
								static PortHandle* create_PROVIDEORDERDDSHandle(recipeGeneratorComponent_Builder* b, PortHandle *ptr){
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
								DDS_TheParticipantFactory, b->PROVIDEORDER_op.dds_option.domainID,
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
									*DDS_StringSeq_get_reference(&pubQoS.partition.name, 0) =  DDS_String_dup("4300");
								
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
									type_name = DDS_MessagessimpleOrder_MessagesTypeSupport_get_type_name();
									retcode = DDS_MessagessimpleOrder_MessagesTypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_MessagessimpleOrder_MessagesprovideOrderRecipeGenerator_TopicprovideOrder", type_name,
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
		

			RecipeGeneratorComponent* MCC_create_RecipeGeneratorComponent(uint8_T ID){
			struct recipeGeneratorComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_RECIPEGENERATORRECIPEGENERATOR:
					b.ID = ID;
							b.PROVIDEORDER = PORT_UNCONNECTED;
							b.createPROVIDEORDERHandle = &create_PROVIDEORDERDDSHandle;
							b.PROVIDEORDER_op.dds_option.domainID = 0;
							b.PROVIDEORDER_op.dds_option.partition = 4300;
				break;
			default:
				break;
			}
			return MCC_RecipeGeneratorComponent_Builder(&b);
			}
		
