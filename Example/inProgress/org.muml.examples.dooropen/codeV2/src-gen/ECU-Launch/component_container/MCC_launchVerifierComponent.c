			// Container HeaderFile
			#include "MCC_launchVerifierComponent.h"
		
								/**
								*  
								* @brief The options a port declases
								* @details Thes options are used in the struct launchVerifierComponent_Builder
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
								* @brief The builder struct for the Component Type: LaunchVerifier
								* @details This is a realization of the builder pattern, the struct represents a Concrete Builder
								*/ 
		typedef struct launchVerifierComponent_Builder {
				uint8_T ID;
				//create Builder Functions for each Port
					PortStatus PEER1; /**< The status of port peer1 */
					PortHandle* (*createPEER1Handle)(struct launchVerifierComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port peer1 */
					struct port_option PEER1_op; /**< The port_option for the PortHandle of port peer1 */
					PortStatus PEER2; /**< The status of port peer2 */
					PortHandle* (*createPEER2Handle)(struct launchVerifierComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port peer2 */
					struct port_option PEER2_op; /**< The port_option for the PortHandle of port peer2 */
					PortStatus VERIFIEDLAUNCH; /**< The status of port verifiedLaunch */
					PortHandle* (*createVERIFIEDLAUNCHHandle)(struct launchVerifierComponent_Builder*, PortHandle*); /**< The builder method to create a PortHandle for port verifiedLaunch */
					struct port_option VERIFIEDLAUNCH_op; /**< The port_option for the PortHandle of port verifiedLaunch */
		}launchVerifierComponent_Builder;
		
		/**
		*
		*@brief A initializer for the struct launchVerifierComponent_Builder
		*@details Shall be used when creating a struct launchVerifierComponent_Builder manually
		*/
		static const launchVerifierComponent_Builder INIT_BUILDER = { 0,  PORT_DEACTIVATED, NULL, .PEER1_op.local_option={0,0}  , PORT_DEACTIVATED, NULL, .PEER2_op.local_option={0,0}  , PORT_DEACTIVATED, NULL, .VERIFIEDLAUNCH_op.local_option={0,0}   };
		/**
		*
		*@brief The pool of component instance of Component Type LaunchVerifier
		*@details The container manages the resource instances in this pool, and this pool allocates the memory for component instances statically
		*/
			static LaunchVerifierComponent instancePool [1];
			static int pool_length = 0;
			static int pool_index = 0;

								/**
								*
								*@brief The Send method for DirectedTypedPort verifiedLaunch 
								*
								*/	
								void MCC_LaunchVerifierComponent_verifiedLaunch_send_value(Port* port, bool_T* msg){
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
									*@brief The Check method for DiscretePort peer1  and message M1LaunchCode 
									*@details Checks if  buffer contains a message of type M1LaunchCode  
									*
									*/	
										bool_t MCC_LaunchVerifierComponent_peer1_exists_M1LaunchCode_M1_Message(Port* port){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1launchCode_M1verifierLaunchDelegator_Topicverifier");
															//	DDS_M1LaunchCode_M1DataReader* concrete_reader = DDS_M1LaunchCode_M1DataReader_narrow(reader);
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
									*@brief The Receiv method for DiscretePort peer1  and message M1LaunchCode
									*@details Receives  a message of type M1LaunchCode  
									*
									*/	
											bool_t MCC_LaunchVerifierComponent_peer1_recv_M1LaunchCode_M1_Message(Port* port, M1LaunchCode_M1_Message* msg){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1launchCode_M1verifierLaunchDelegator_Topicverifier");
																DDS_M1launchCode_M1DataReader* concrete_reader = DDS_M1launchCode_M1DataReader_narrow(reader);
																//create DDS_Instance to read
																DDS_M1launchCode_M1 *instance = DDS_M1launchCode_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
																retcode = DDS_M1launchCode_M1DataReader_take_next_sample(concrete_reader, instance,
																		&sample_info);
																if (retcode == DDS_RETCODE_NO_DATA) {
																	return false;
																}
																//make message transformation
																		msg->id = instance->id;
																
																DDS_M1launchCode_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																return true;
															break;
													
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Check method for DiscretePort peer1  and message M1Ready 
									*@details Checks if  buffer contains a message of type M1Ready  
									*
									*/	
										bool_t MCC_LaunchVerifierComponent_peer1_exists_M1Ready_M1_Message(Port* port){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1ready_M1verifierLaunchDelegator_Topicverifier");
															//	DDS_M1Ready_M1DataReader* concrete_reader = DDS_M1Ready_M1DataReader_narrow(reader);
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
									*@brief The Receiv method for DiscretePort peer1  and message M1Ready
									*@details Receives  a message of type M1Ready  
									*
									*/	
											bool_t MCC_LaunchVerifierComponent_peer1_recv_M1Ready_M1_Message(Port* port, M1Ready_M1_Message* msg){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1ready_M1verifierLaunchDelegator_Topicverifier");
																DDS_M1ready_M1DataReader* concrete_reader = DDS_M1ready_M1DataReader_narrow(reader);
																//create DDS_Instance to read
																DDS_M1ready_M1 *instance = DDS_M1ready_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
																retcode = DDS_M1ready_M1DataReader_take_next_sample(concrete_reader, instance,
																		&sample_info);
																if (retcode == DDS_RETCODE_NO_DATA) {
																	return false;
																}
																//make message transformation
																		msg->dummy = instance->dummy;
																
																DDS_M1ready_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																return true;
															break;
													
											default:
												break;	
											}
											return false;
										}
							
								/**
								*
								*@brief The Send method for DiscretePort peer1  and message M1AccessGranted
								*@details Send  a message of type M1AccessGranted  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer1_send_M1AccessGranted_M1_Message(Port* port, M1AccessGranted_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1accessGranted_M1peer1LaunchVerifier_Topicpeer1");
												
															DDS_M1accessGranted_M1DataWriter* concrete_writer = DDS_M1accessGranted_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1accessGranted_M1 *instance = DDS_M1accessGranted_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1accessGranted_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1accessGranted_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort peer1  and message M1AccessDenied
								*@details Send  a message of type M1AccessDenied  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer1_send_M1AccessDenied_M1_Message(Port* port, M1AccessDenied_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1accessDenied_M1peer1LaunchVerifier_Topicpeer1");
												
															DDS_M1accessDenied_M1DataWriter* concrete_writer = DDS_M1accessDenied_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1accessDenied_M1 *instance = DDS_M1accessDenied_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1accessDenied_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1accessDenied_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort peer1  and message M1OtherReady
								*@details Send  a message of type M1OtherReady  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer1_send_M1OtherReady_M1_Message(Port* port, M1OtherReady_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1otherReady_M1peer1LaunchVerifier_Topicpeer1");
												
															DDS_M1otherReady_M1DataWriter* concrete_writer = DDS_M1otherReady_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1otherReady_M1 *instance = DDS_M1otherReady_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1otherReady_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1otherReady_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort peer1  and message M1CompleteDeny
								*@details Send  a message of type M1CompleteDeny  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer1_send_M1CompleteDeny_M1_Message(Port* port, M1CompleteDeny_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1completeDeny_M1peer1LaunchVerifier_Topicpeer1");
												
															DDS_M1completeDeny_M1DataWriter* concrete_writer = DDS_M1completeDeny_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1completeDeny_M1 *instance = DDS_M1completeDeny_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1completeDeny_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1completeDeny_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
									/**
									*
									*@brief The Check method for DiscretePort peer2  and message M1LaunchCode 
									*@details Checks if  buffer contains a message of type M1LaunchCode  
									*
									*/	
										bool_t MCC_LaunchVerifierComponent_peer2_exists_M1LaunchCode_M1_Message(Port* port){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1launchCode_M1verifierLaunchDelegator_Topicverifier");
															//	DDS_M1LaunchCode_M1DataReader* concrete_reader = DDS_M1LaunchCode_M1DataReader_narrow(reader);
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
									*@brief The Receiv method for DiscretePort peer2  and message M1LaunchCode
									*@details Receives  a message of type M1LaunchCode  
									*
									*/	
											bool_t MCC_LaunchVerifierComponent_peer2_recv_M1LaunchCode_M1_Message(Port* port, M1LaunchCode_M1_Message* msg){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1launchCode_M1verifierLaunchDelegator_Topicverifier");
																DDS_M1launchCode_M1DataReader* concrete_reader = DDS_M1launchCode_M1DataReader_narrow(reader);
																//create DDS_Instance to read
																DDS_M1launchCode_M1 *instance = DDS_M1launchCode_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
																retcode = DDS_M1launchCode_M1DataReader_take_next_sample(concrete_reader, instance,
																		&sample_info);
																if (retcode == DDS_RETCODE_NO_DATA) {
																	return false;
																}
																//make message transformation
																		msg->id = instance->id;
																
																DDS_M1launchCode_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																return true;
															break;
													
											default:
												break;	
											}
											return false;
										}
									/**
									*
									*@brief The Check method for DiscretePort peer2  and message M1Ready 
									*@details Checks if  buffer contains a message of type M1Ready  
									*
									*/	
										bool_t MCC_LaunchVerifierComponent_peer2_exists_M1Ready_M1_Message(Port* port){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1ready_M1verifierLaunchDelegator_Topicverifier");
															//	DDS_M1Ready_M1DataReader* concrete_reader = DDS_M1Ready_M1DataReader_narrow(reader);
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
									*@brief The Receiv method for DiscretePort peer2  and message M1Ready
									*@details Receives  a message of type M1Ready  
									*
									*/	
											bool_t MCC_LaunchVerifierComponent_peer2_recv_M1Ready_M1_Message(Port* port, M1Ready_M1_Message* msg){
													DDS_Subscriber* subscriber;
													DDS_DataReader* reader;
													struct DDS_SampleInfo sample_info;
													DDS_ReturnCode_t retcode;
											switch(port->handle->type) {
															case PORT_HANDLE_TYPE_DDS:
																//find correct dataReader
																//transform DDS Message to MUML Message
																subscriber = ((DDSHandle *) port->handle->concreteHandle)->subscriber;
																reader = DDS_Subscriber_lookup_datareader(subscriber, "DDS_M1ready_M1verifierLaunchDelegator_Topicverifier");
																DDS_M1ready_M1DataReader* concrete_reader = DDS_M1ready_M1DataReader_narrow(reader);
																//create DDS_Instance to read
																DDS_M1ready_M1 *instance = DDS_M1ready_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
																retcode = DDS_M1ready_M1DataReader_take_next_sample(concrete_reader, instance,
																		&sample_info);
																if (retcode == DDS_RETCODE_NO_DATA) {
																	return false;
																}
																//make message transformation
																		msg->dummy = instance->dummy;
																
																DDS_M1ready_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
																return true;
															break;
													
											default:
												break;	
											}
											return false;
										}
							
								/**
								*
								*@brief The Send method for DiscretePort peer2  and message M1AccessGranted
								*@details Send  a message of type M1AccessGranted  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer2_send_M1AccessGranted_M1_Message(Port* port, M1AccessGranted_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1accessGranted_M1peer2LaunchVerifier_Topicpeer2");
												
															DDS_M1accessGranted_M1DataWriter* concrete_writer = DDS_M1accessGranted_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1accessGranted_M1 *instance = DDS_M1accessGranted_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1accessGranted_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1accessGranted_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort peer2  and message M1AccessDenied
								*@details Send  a message of type M1AccessDenied  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer2_send_M1AccessDenied_M1_Message(Port* port, M1AccessDenied_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1accessDenied_M1peer2LaunchVerifier_Topicpeer2");
												
															DDS_M1accessDenied_M1DataWriter* concrete_writer = DDS_M1accessDenied_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1accessDenied_M1 *instance = DDS_M1accessDenied_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1accessDenied_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1accessDenied_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort peer2  and message M1OtherReady
								*@details Send  a message of type M1OtherReady  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer2_send_M1OtherReady_M1_Message(Port* port, M1OtherReady_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1otherReady_M1peer2LaunchVerifier_Topicpeer2");
												
															DDS_M1otherReady_M1DataWriter* concrete_writer = DDS_M1otherReady_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1otherReady_M1 *instance = DDS_M1otherReady_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1otherReady_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1otherReady_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
								/**
								*
								*@brief The Send method for DiscretePort peer2  and message M1CompleteDeny
								*@details Send  a message of type M1CompleteDeny  
								*
								*/	
									void MCC_LaunchVerifierComponent_peer2_send_M1CompleteDeny_M1_Message(Port* port, M1CompleteDeny_M1_Message* msg){
												DDS_Publisher* publisher;
												DDS_DataWriter* writer;
										switch(port->handle->type) {
														case PORT_HANDLE_TYPE_DDS:
															// Find correct dataWriter
															publisher = ((DDSHandle *) port->handle->concreteHandle)->publisher;
															writer = DDS_Publisher_lookup_datawriter(publisher, "DDS_M1completeDeny_M1peer2LaunchVerifier_Topicpeer2");
												
															DDS_M1completeDeny_M1DataWriter* concrete_writer = DDS_M1completeDeny_M1DataWriter_narrow(writer);
															//create DDS_Instance to write
															DDS_M1completeDeny_M1 *instance = DDS_M1completeDeny_M1TypeSupport_create_data_ex(DDS_BOOLEAN_TRUE);
															//make message transformation
																	instance->dummy = msg->dummy;
															
															//write the actual data
															DDS_M1completeDeny_M1DataWriter_write(concrete_writer, instance, &DDS_HANDLE_NIL);
															//delete DDS instance
															DDS_M1completeDeny_M1TypeSupport_delete_data_ex(instance,DDS_BOOLEAN_TRUE);
														break;
												
										default:
											break;	
										}
									}
			
			
		
		/**
		*
		*@brief The builder for component instance of Component Type LaunchVerifier
		*@details This method creates and initializes a component instance properly by using the struct launchVerifierComponent_Builder
		*/
			static LaunchVerifierComponent* MCC_LaunchVerifierComponent_Builder(launchVerifierComponent_Builder* b){
				instancePool[pool_index].ID = b->ID;
				instancePool[pool_index].stateChart = LaunchVerifierLaunchVerifierStateChart_create(
					&instancePool[pool_index]);
				//call init after RTSC was created
				LaunchVerifierComponent_initialize(&instancePool[pool_index]);
				//For each port initialize it
					if(b->PEER1 != PORT_DEACTIVATED) {
					instancePool[pool_index].peer1Port.status = b->PEER1;
					instancePool[pool_index].peer1Port.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].peer1Port.handle->port = &(instancePool[pool_index].peer1Port);
					b->createPEER1Handle(b, (instancePool[pool_index].peer1Port.handle));
					//instancePool[pool_index].peer1Port.handle->port = &(instancePool[pool_index].peer1Port);
				}
					if(b->PEER2 != PORT_DEACTIVATED) {
					instancePool[pool_index].peer2Port.status = b->PEER2;
					instancePool[pool_index].peer2Port.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].peer2Port.handle->port = &(instancePool[pool_index].peer2Port);
					b->createPEER2Handle(b, (instancePool[pool_index].peer2Port.handle));
					//instancePool[pool_index].peer2Port.handle->port = &(instancePool[pool_index].peer2Port);
				}
					if(b->VERIFIEDLAUNCH != PORT_DEACTIVATED) {
					instancePool[pool_index].verifiedLaunch.status = b->VERIFIEDLAUNCH;
					instancePool[pool_index].verifiedLaunch.handle = (PortHandle*) malloc(sizeof(PortHandle));
		 			instancePool[pool_index].verifiedLaunch.handle->port = &(instancePool[pool_index].verifiedLaunch);
					b->createVERIFIEDLAUNCHHandle(b, (instancePool[pool_index].verifiedLaunch.handle));
					//instancePool[pool_index].verifiedLaunch.handle->port = &(instancePool[pool_index].verifiedLaunch);
				}
			
				return &instancePool[pool_index++];
			}

						
								static PortHandle* create_PEER1DDSHandle(launchVerifierComponent_Builder* b, PortHandle *ptr){
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
									hndl->numOfWriterToMatch= 4  ;
							
								//create domain participant
								hndl->participant = DDS_DomainParticipantFactory_create_participant(
								DDS_TheParticipantFactory, b->PEER1_op.dds_option.domainID,
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
									*DDS_StringSeq_get_reference(&pubQoS.partition.name, 0) =  DDS_String_dup("-24893");
								
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
									type_name = DDS_M1accessGranted_M1TypeSupport_get_type_name();
									retcode = DDS_M1accessGranted_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1accessGranted_M1peer1LaunchVerifier_Topicpeer1", type_name,
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
									type_name = DDS_M1accessDenied_M1TypeSupport_get_type_name();
									retcode = DDS_M1accessDenied_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1accessDenied_M1peer1LaunchVerifier_Topicpeer1", type_name,
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
									type_name = DDS_M1otherReady_M1TypeSupport_get_type_name();
									retcode = DDS_M1otherReady_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1otherReady_M1peer1LaunchVerifier_Topicpeer1", type_name,
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
									type_name = DDS_M1completeDeny_M1TypeSupport_get_type_name();
									retcode = DDS_M1completeDeny_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1completeDeny_M1peer1LaunchVerifier_Topicpeer1", type_name,
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
									*DDS_StringSeq_get_reference(&subQoS.partition.name, 0) =  DDS_String_dup("-24893");
							
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
									
											readerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
										readerQoS.history.depth=1;
											readerQoS.history.kind=DDS_KEEP_ALL_HISTORY_QOS;
										
									
							
							
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
									type_name = DDS_M1ready_M1TypeSupport_get_type_name();
									retcode = DDS_M1ready_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1ready_M1verifierLaunchDelegator_Topicverifier", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									
											readerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
										readerQoS.history.depth=1;
											readerQoS.history.kind=DDS_KEEP_ALL_HISTORY_QOS;
										
									
							
							
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
						
								static PortHandle* create_PEER2DDSHandle(launchVerifierComponent_Builder* b, PortHandle *ptr){
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
									hndl->numOfWriterToMatch= 4  ;
							
								//create domain participant
								hndl->participant = DDS_DomainParticipantFactory_create_participant(
								DDS_TheParticipantFactory, b->PEER2_op.dds_option.domainID,
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
									type_name = DDS_M1accessGranted_M1TypeSupport_get_type_name();
									retcode = DDS_M1accessGranted_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1accessGranted_M1peer2LaunchVerifier_Topicpeer2", type_name,
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
									type_name = DDS_M1accessDenied_M1TypeSupport_get_type_name();
									retcode = DDS_M1accessDenied_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1accessDenied_M1peer2LaunchVerifier_Topicpeer2", type_name,
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
									type_name = DDS_M1otherReady_M1TypeSupport_get_type_name();
									retcode = DDS_M1otherReady_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1otherReady_M1peer2LaunchVerifier_Topicpeer2", type_name,
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
									type_name = DDS_M1completeDeny_M1TypeSupport_get_type_name();
									retcode = DDS_M1completeDeny_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1completeDeny_M1peer2LaunchVerifier_Topicpeer2", type_name,
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
									*DDS_StringSeq_get_reference(&subQoS.partition.name, 0) =  DDS_String_dup("7270");
							
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
									
											readerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
										readerQoS.history.depth=1;
											readerQoS.history.kind=DDS_KEEP_ALL_HISTORY_QOS;
										
									
							
							
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
									type_name = DDS_M1ready_M1TypeSupport_get_type_name();
									retcode = DDS_M1ready_M1TypeSupport_register_type(hndl->participant, type_name);
									if (retcode != DDS_RETCODE_OK) {
										printf("register_type error %d\n", retcode);
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									//register the topic
									topic=DDS_DomainParticipant_create_topic(hndl->participant, "DDS_M1ready_M1verifierLaunchDelegator_Topicverifier", type_name,
										&DDS_TOPIC_QOS_DEFAULT, NULL /* listener */,
										DDS_STATUS_MASK_NONE);
									if (topic == NULL) {
										printf("create_topic error\n");
										publisher_shutdown(hndl->participant);
										return NULL;
									}
									
											readerQoS.reliability.kind=DDS_BEST_EFFORT_RELIABILITY_QOS;
									
										readerQoS.history.depth=1;
											readerQoS.history.kind=DDS_KEEP_ALL_HISTORY_QOS;
										
									
							
							
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
							 	static PortHandle* create_VERIFIEDLAUNCHLocalHandle(launchVerifierComponent_Builder* b, PortHandle *ptr){
							 		ptr->type = PORT_HANDLE_TYPE_LOCAL;
							 		LocalHandle* hndl = malloc(sizeof(LocalHandle)+0*sizeof(LocalSubscriber));
							 		ptr->concreteHandle = hndl;
							 		hndl->pubID = b->VERIFIEDLAUNCH_op.local_option.pubID;
							 		hndl->subID = b->VERIFIEDLAUNCH_op.local_option.subID;
							 		return ptr;
							 	}
						
		

			LaunchVerifierComponent* MCC_create_LaunchVerifierComponent(uint8_T ID){
			struct launchVerifierComponent_Builder b = INIT_BUILDER;
			switch(ID){
				case CI_LAUNCHVERIFIERLAUNCHVERIFIER:
					b.ID = ID;
							b.PEER2 = PORT_UNCONNECTED;
							b.createPEER2Handle = &create_PEER2DDSHandle;
							b.PEER2_op.dds_option.domainID = 0;
							b.PEER2_op.dds_option.partition = 7270;
							b.PEER1 = PORT_UNCONNECTED;
							b.createPEER1Handle = &create_PEER1DDSHandle;
							b.PEER1_op.dds_option.domainID = 0;
							b.PEER1_op.dds_option.partition = -24893;
							b.VERIFIEDLAUNCH = PORT_ACTIVE;
							b.createVERIFIEDLAUNCHHandle = &create_VERIFIEDLAUNCHLocalHandle;
							b.VERIFIEDLAUNCH_op.local_option.pubID = -4985;
							b.VERIFIEDLAUNCH_op.local_option.subID = 30276;
				break;
			default:
				break;
			}
			return MCC_LaunchVerifierComponent_Builder(&b);
			}
		
