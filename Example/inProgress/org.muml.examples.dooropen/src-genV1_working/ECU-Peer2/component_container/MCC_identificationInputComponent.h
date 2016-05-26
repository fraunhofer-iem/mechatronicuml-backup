		#ifndef MCC_MCC_IDENTIFICATIONINPUTCOMPONENT_H_
		#define MCC_MCC_IDENTIFICATIONINPUTCOMPONENT_H_

#ifdef __cplusplus
  extern "C" {
#endif	
				// Library
				#include "../container_lib/ContainerTypes.h"
				#include "../container_lib/LocalBufferManager.h"
				
			
				//Identifier of this ECU
				#include "../ECU_Identifier.h"
			
				//DDS Specific includes
			//DDS SPECIFIC including flag
				#include "../container_lib/DDS_Custom_Lib.h"
				#include "../dds/MUML_DDS.h"
				#include "../dds/MUML_DDSPlugin.h"
				#include "../dds/MUML_DDSSupport.h"
				#include "ndds/ndds_c.h"
			//DDS SPECIFIC including flag
				
				//include the component_interfache header
				#include "../../../src-genV1_working/ECU-Peer2/components/identificationInputComponent_Interface.h"
					
			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Component Container for Component of Type: Atomic_Component_IdentificationInput
			 * @details This files contains an implementation of the container interfaces of a components
			 */
				
									/**
									 * @brief Forward Declaration of the method MCC_create_IdentificationInputComponent
									 * @details The method for initializing and creating a component instance oc type: Atomic_Component_IdentificationInput
									 */
				IdentificationInputComponent* MCC_create_IdentificationInputComponent(uint8_T id);
#ifdef __cplusplus
  }
#endif
		#endif /* MCC_MCC_IDENTIFICATIONINPUTCOMPONENT_H_ */
