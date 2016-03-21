
/**
 * @file 
 * @author generated
 * @brief Specification of the Core Functionality of the Middleware
 * @details This files contains the main Functions of the Middleware and the global variable Middleware mw
 * 
 */

#ifndef MIDDLEWARECORE_H_
#define MIDDLEWARECORE_H_
#include "stdlib.h"
#include "MiddlewareInternalLogic.h"
#include "../lib/MiddlewareTypes.h"
#include "../GlobalIdentifier.h"
#include "../lib/NetworkMessageBuffer.h"
#include "../lib/NetworkInterface.h"
#include "../messages/messages_types.h" 
#include <string.h>

//import all needed ComponentHeaders
#include "../components/motorComponent.h"
#include "../components/motorComponent.h"
#include "../components/overtakerDriverComponent.h"
#include "../components/distanceComponent.h"
#include "../components/lineComponent.h"



/**
 * 
 * @brief Description of the Middleware for the ECU: overtakerR1
 * @details It contains the Components, which are allocated on a ECU, the NetworkInterfaces of the ECU: overtakerR1
 */
typedef struct Middleware {

//Create components?
	MotorComponent* overtakerMotorRComponent; /**< The ComponentInstance: overtakerMotorR of Type: MotorComponent , which is allocated on the ECU: overtakerR1 */

	MotorComponent* overtakerMotorLComponent; /**< The ComponentInstance: overtakerMotorL of Type: MotorComponent , which is allocated on the ECU: overtakerR1 */

	OvertakerDriverComponent* overtakerDriverComponent; /**< The ComponentInstance: overtakerDriver of Type: OvertakerDriverComponent , which is allocated on the ECU: overtakerR1 */

	DistanceComponent* overtakerDistanceComponent; /**< The ComponentInstance: overtakerDistance of Type: DistanceComponent , which is allocated on the ECU: overtakerR1 */

	LineComponent* overtakerLineComponent; /**< The ComponentInstance: overtakerLine of Type: LineComponent , which is allocated on the ECU: overtakerR1 */


//intern NetworkInterface	
NetworkInterface* intern;  /**< Pointer to the internal NetworkInterface of the ECU: overtakerR1  */
//Create Networkinterfaces
	NetworkInterface* virtualBluetoothPort; /**< Pointer the the NetworkInterface: virtualBluetoothPort of the ECU: overtakerR1 */
	NetworkInterface* VirtualWifiPort; /**< Pointer the the NetworkInterface: VirtualWifiPort of the ECU: overtakerR1 */
	NetworkInterface* inputPort4; /**< Pointer the the NetworkInterface: inputPort4 of the ECU: overtakerR1 */
	NetworkInterface* usbPort; /**< Pointer the the NetworkInterface: usbPort of the ECU: overtakerR1 */

//Create NetworkMessageBuffer
NetworkMessageBuffer* outgoing; /**< Pointer to the NetworkMessageBuffer, which stores the outgoing #MiddlewareMessage%s */
NetworkMessageBuffer* incoming; /**< Pointer to the NetworkMessageBuffer, which stores the incoming #MiddlewareMessage%s */

ECUID idOfECU; /**< The ECUID of the ECU: overtakerR1 on which the Middleware is executed */

}Middleware;


/**
 * @brief Global Variable Middleware
 * @details Since, the Middleware is used in different places, we use this global variable to access the Middleware
 * @\warning Only one Middleware is allowed per ECU
 */
extern Middleware *mw;

/**
 * @brief Creates the Middleware
 * @details Allocates Memory for the struct Middleware, creates its #NetworkInterface%s, and initializes the Middleware
 * @return A Pointer to the new created Middleware
 * @note This Function is called by the system initialization (once)
 */
Middleware* Middleware_create(void);

/**
 * @brief Initialize the Middleware
 * @details This Function initializes the Middleware, by setting Middleware::idOfECU, and creating the NetworkMessageBuffer Middleware::incoming, and Middleware::outgoing
 * @return True, if the Middleware is successfully initialized, otherwise False
  */
bool_t Middelware_init(void);

/**
 * @brief Destroys the Middleware
 * @details Frees the Memory for the struct Middleware
 * @return True, if the Middleware is successfully destroyed, otherwise False
 */
bool_t Middleware_destroy(void);

/**
 * @brief Takes an arbitary Message, and stores it the NetworkMessatgeBuffer::outgoing
 * @details Takes an arbitary Message, and iff it is a ProtoBuf Message transforms it into an byte-Array, finally the Messages is enqued in Middleware::outgoing
 * 
 * @param targetPort The PortID of the target Port to which this Message shall be send
 * @param id The MessageID of the Message which shall be send
 * @param msg The Message to send
 * @return True
 * @todo  always returns true
 */
bool_t MW_sendMessage(PortID targetPort, MessageID id, void *msg);

/**
 * @brief Delivers received Messages to the correct #MessageBuffer%s
 * @details Dequeues alls Messages out of Middleware::incoming and delivers them to the correct #MessageBuffer%s
 * @note This Function will be called periodically
 * @return True
 * @todo  always returns true
 */
bool_t MW_deliverReceivedMessages(void);

/**
 * @brief Receives Messages for every known NetworkInterface
 * @details Calls the receive Function for each NetworkInterface, which is contained in the struct Middleware
 *          and enques them in Middleware::incoming
 * @return False
 * @todo  Always returns false
 */
bool_t MW_NIreceiveMessages(void);

/**
 * @brief All outgoing Messages are sent via a corresponding NetworkInterface
 * @details Takes all Messages from Middleware::outgoing, and selects for each the corresponding NetworkInterace, and sends the Message via send Function of the NetworkInterface
 * @return False
 * @todo  Always returns false
 */
bool_t MW_NIsendMessages(void);



#endif /* MIDDLEWARECORE_H_ */

