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
 * @brief Implemtation of the Parameterbinding: overtakeeMotorL_velocityContR_InitApi of the Port-Instance: PortInstance: velocityContR of the ComponentInstance: overtakeeMotorL 
 */
		void overtakeeMotorL_velocityContR_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorL_velocityContR_ExecApi of the Port-Instance: PortInstance: velocityContR of the ComponentInstance: overtakeeMotorL 
 */
		void overtakeeMotorL_velocityContR_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorR_velocityContL_InitApi of the Port-Instance: PortInstance: velocityContL of the ComponentInstance: overtakeeMotorR 
 */
		void overtakeeMotorR_velocityContL_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorR_velocityContL_ExecApi of the Port-Instance: PortInstance: velocityContL of the ComponentInstance: overtakeeMotorR 
 */
		void overtakeeMotorR_velocityContL_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeLine_lineLight_InitApi of the Port-Instance: PortInstance: lineLight of the ComponentInstance: overtakeeLine 
 */
		void overtakeeLine_lineLight_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeLine_lineLight_ExecApi of the Port-Instance: PortInstance: lineLight of the ComponentInstance: overtakeeLine 
 */
		int overtakeeLine_lineLight_ExecApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeDistance_distanceOvertakee_InitApi of the Port-Instance: PortInstance: distanceOvertakee of the ComponentInstance: overtakeeDistance 
 */
		void overtakeeDistance_distanceOvertakee_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeDistance_distanceOvertakee_ExecApi of the Port-Instance: PortInstance: distanceOvertakee of the ComponentInstance: overtakeeDistance 
 */
		int overtakeeDistance_distanceOvertakee_ExecApi();	


		void overtakeeLine_lineLight_InitApi_real();
#endif /*APICALL_H_ */
