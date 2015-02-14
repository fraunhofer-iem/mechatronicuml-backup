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
 * @brief Implemtation of the Parameterbinding: overtakerMotorR_velocity_InitApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakerMotorR 
 */
		void overtakerMotorR_velocity_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakerMotorR_velocity_ExecApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakerMotorR 
 */
		void overtakerMotorR_velocity_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: overtakerMotorL_velocity_InitApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakerMotorL 
 */
		void overtakerMotorL_velocity_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakerMotorL_velocity_ExecApi of the Port-Instance: PortInstance: velocity of the ComponentInstance: overtakerMotorL 
 */
		void overtakerMotorL_velocity_ExecApi(int);	
/**
 * @brief Implemtation of the Parameterbinding: overtakerDistance_distance_InitApi of the Port-Instance: PortInstance: distance of the ComponentInstance: overtakerDistance 
 */
		void overtakerDistance_distance_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakerDistance_distance_ExecApi of the Port-Instance: PortInstance: distance of the ComponentInstance: overtakerDistance 
 */
		int overtakerDistance_distance_ExecApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakerLine_lineLight_InitApi of the Port-Instance: PortInstance: lineLight of the ComponentInstance: overtakerLine 
 */
		void overtakerLine_lineLight_InitApi();	
/**
 * @brief Implemtation of the Parameterbinding: overtakerLine_lineLight_ExecApi of the Port-Instance: PortInstance: lineLight of the ComponentInstance: overtakerLine 
 */
		int overtakerLine_lineLight_ExecApi();	



#endif /*APICALL_H_ */
