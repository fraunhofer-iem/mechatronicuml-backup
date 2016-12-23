		#ifndef MCC_MCC_LAUNCHERCOMPONENT_H_
		#define MCC_MCC_LAUNCHERCOMPONENT_H_

#ifdef __cplusplus
  extern "C" {
#endif	
				// Library
				#include "../../../src-genV1_working/ECU-Launch/container_lib/ContainerTypes.h"
				#include "../../../src-genV1_working/ECU-Launch/container_lib/LocalBufferManager.h"
				
			
				//Identifier of this ECU
				#include "../../../src-genV1_working/ECU-Launch/ECU_Identifier.h"
			
				//DDS Specific includes
			//DDS SPECIFIC including flag
				#include "../../../src-genV1_working/ECU-Launch/container_lib/DDS_Custom_Lib.h"
				#include "../../../src-genV1_working/ECU-Launch/dds/MUML_DDS.h"
				#include "../../../src-genV1_working/ECU-Launch/dds/MUML_DDSPlugin.h"
				#include "../../../src-genV1_working/ECU-Launch/dds/MUML_DDSSupport.h"
				#include "ndds/ndds_c.h"
			//DDS SPECIFIC including flag
				
				//include the component_interfache header
				#include "../../../src-genV1_working/ECU-Launch/components/launcherComponent_Interface.h"
					
			/**
			 * @file 
			 * @author generated
			 * @brief Specification of Component Container for Component of Type: Atomic_Component_Launcher
			 * @details This files contains an implementation of the container interfaces of a components
			 */
				
									/**
									 * @brief Forward Declaration of the method MCC_create_LauncherComponent
									 * @details The method for initializing and creating a component instance oc type: Atomic_Component_Launcher
									 */
				LauncherComponent* MCC_create_LauncherComponent(uint8_T id);
#ifdef __cplusplus
  }
#endif
		#endif /* MCC_MCC_LAUNCHERCOMPONENT_H_ */
