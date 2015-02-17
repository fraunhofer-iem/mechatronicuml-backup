#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_lineleader.h"

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
 * @brief Implemtation of the Parameterbinding: approacherMotorR_velocityContR_InitApi of the Port-Instance: PortInstance: velocityContR of the ComponentInstance: approacherMotorR 
 */
		void approacherMotorR_velocityContR_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: approacherMotorR_velocityContR_ExecApi of the Port-Instance: PortInstance: velocityContR of the ComponentInstance: approacherMotorR 
 */
		void approacherMotorR_velocityContR_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: approacherMotorL_velocityContL_InitApi of the Port-Instance: PortInstance: velocityContL of the ComponentInstance: approacherMotorL 
 */
		void approacherMotorL_velocityContL_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: approacherMotorL_velocityContL_ExecApi of the Port-Instance: PortInstance: velocityContL of the ComponentInstance: approacherMotorL 
 */
		void approacherMotorL_velocityContL_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: approacherLine_lineLight_InitApi of the Port-Instance: PortInstance: lineLight of the ComponentInstance: approacherLine 
 */
		void approacherLine_lineLight_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: approacherLine_lineLight_ExecApi of the Port-Instance: PortInstance: lineLight of the ComponentInstance: approacherLine 
 */
		int approacherLine_lineLight_ExecApi();	
/**
 * @brief Implemtation of the Parameterbinding: approacherDistance_distance_InitApi of the Port-Instance: PortInstance: distance of the ComponentInstance: approacherDistance 
 */
		void approacherDistance_distance_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: approacherDistance_distance_ExecApi of the Port-Instance: PortInstance: distance of the ComponentInstance: approacherDistance 
 */
		int approacherDistance_distance_ExecApi();	



#endif /*APICALL_H_ */
