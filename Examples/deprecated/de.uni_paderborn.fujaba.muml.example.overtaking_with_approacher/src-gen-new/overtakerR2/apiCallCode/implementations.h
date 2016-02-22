#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
/**
 * @file 
 * @author generated
 * @brief Specification of API-Calls for the Continuous Port Instances
 * @details This files contains the implementation of the API-Bindings for the Continuous Port Instance as it is specified in the API-Port-Mapping.
 *          The abstract API-Calls which are used in the Realtime-Statecharts are implemented here.
 */

#ifndef APICALL_H_
#define APICALL_H_

#include "../lib/types.h"

 /***

 		method to initialize all
 	*/

 		void initAll();

/**
 * @brief Implemtation of the Parameterbinding: approacherColor_color_InitApi of the Port-Instance: PortInstance: color of the ComponentInstance: approacherColor 
 */
		void overtakerColor_color_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: approacherColor_color_ExecApi of the Port-Instance: PortInstance: color of the ComponentInstance: approacherColor 
 */
		int overtakerColor_color_ExecApi();	



#endif /*APICALL_H_ */
