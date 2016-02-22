
/**
 * @file 
 * @author generated
 * @brief This reflects a concrete ComponentInstanceConfiguration (CIC) for the ECU: raspberryPi01 
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
#include "components/pickUpBotComponent.h"

//include RTSC files
#include "RTSCs/rootPickUpBotCmpRTSCStateChart.h"

 /**
  * @brief Configures the ComponentInstanceConfiguration for the ECU: raspberryPi01
  * @details This method creates a whole ComponentInstanceConfiguration
  *           The ComponentInstances, their Ports and their MessageBuffer, and their Realtime-StateCharts are created.
  *            Furthermore, the CIC is initialized.
  */
void configureRaspberryPi01CIC(void);


/**
* @brief Initialize function for ECU: raspberryPi01
* @details This is the initialize function for ECU: raspberryPi01. This function calls the initialization function
*	 for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this ECU.
*/
void initializeRaspberryPi01CIC(void);

#endif /*CIC_H*/
