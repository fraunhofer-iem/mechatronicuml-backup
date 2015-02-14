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

/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorL_velocity_InitApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakeeMotorL 
 */
		void overtakeeMotorL_velocity_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorL_velocity_ExecApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakeeMotorL 
 */
		void overtakeeMotorL_velocity_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorR_velocity_InitApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakeeMotorR 
 */
		void overtakeeMotorR_velocity_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakeeMotorR_velocity_ExecApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakeeMotorR 
 */
		void overtakeeMotorR_velocity_ExecApi(int);	
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



#endif /*APICALL_H_ */
