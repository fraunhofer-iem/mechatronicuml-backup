
/**
 * @file 
 * @author generated
 * @brief This reflects a concrete ComponentInstanceConfiguration (CIC) for the ECU: sectionControlBrick 
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
#include "components/sectionControlComponent.h"

//include RTSC files
#include "RTSCs/rootsectionControlRTSCStateChart.h"

 /**
  * @brief Configures the ComponentInstanceConfiguration for the ECU: sectionControlBrick
  * @details This method creates a whole ComponentInstanceConfiguration
  *           The ComponentInstances, their Ports and their MessageBuffer, and their Realtime-StateCharts are created.
  *            Furthermore, the CIC is initialized.
  */
void configureSectionControlBrickCIC(void);


/**
* @brief Initialize function for ECU: sectionControlBrick
* @details This is the initialize function for ECU: sectionControlBrick. This function calls the initialization function
*	 for the middleware of the ECU and of all AtomicComponentInstances which are allocated on this ECU.
*/
void initializeSectionControlBrickCIC(void);

#endif /*CIC_H*/
