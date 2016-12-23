
/**
 * @file 
 * @author generated
 * @brief This reflects a concrete ComponentInstanceConfiguration (CIC) for the ECU: overtakeeR2 
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
#include "components/overtakeeCommunicatorComponent.h"
#include "components/colorComponent.h"

//include RTSC files
#include "RTSCs/rootovertakeeCommunicatorRTSCStateChart.h"
#include "RTSCs/rootColorStateChart.h"

 /**
  * @brief Configures the ComponentInstanceConfiguration for the ECU: overtakeeR2
  * @details This method creates a whole ComponentInstanceConfiguration
  *           The ComponentInstances, their Ports and their MessageBuffer, and their Realtime-StateCharts are created.
  *            Furthermore, the CIC is initialized.
  */
void configureOvertakeeR2CIC(void);


/**
* @brief Initialize function for ECU: overtakeeR2
* @details This is the initialize function for ECU: overtakeeR2. This function calls the initialization function
*	 for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this ECU.
*/
void initializeOvertakeeR2CIC(void);

#endif /*CIC_H*/
