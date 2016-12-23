
/**
 * @file 
 * @author generated
 * @brief This reflects a concrete ComponentInstanceConfiguration (CIC) for the ECU: approacherR1 
 * @details 
 */
		
#ifndef CIC_H
#define CIC_H
//include standard headers
#include "lib/port.h"
#include "lib/MessageBuffer.h"
#include "Middleware/MiddlewareCore.h"
#include "lib/MiddlewareTypes.h"
#include "apiCallCode/implementations.h"

//include component files
#include "components/motorComponent.h"
#include "components/motorComponent.h"
#include "components/approacherDriverComponent.h"
#include "components/lineComponent.h"
#include "components/distanceComponent.h"

//include RTSC files
#include "RTSCs/rootMotorStateChart.h"
#include "RTSCs/rootMotorStateChart.h"
#include "RTSCs/rootapproacherDriverRTSCStateChart.h"
#include "RTSCs/rootLineStateChart.h"
#include "RTSCs/rootDistanceStateChart.h"

 /**
  * @brief Configures the ComponentInstanceConfiguration for the ECU: approacherR1
  * @details This method creates a whole ComponentInstanceConfiguration
  *           The ComponentInstances, their Ports and their MessageBuffer, and their Realtime-StateCharts are created.
  *            Furthermore, the CIC is initialized.
  */
void configureApproacherR1CIC(void);


/**
* @brief Initialize function for ECU: approacherR1
* @details This is the initialize function for ECU: approacherR1. This function calls the initialization function
*	 for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this ECU.
*/
void initializeApproacherR1CIC(void);

#endif /*CIC_H*/
