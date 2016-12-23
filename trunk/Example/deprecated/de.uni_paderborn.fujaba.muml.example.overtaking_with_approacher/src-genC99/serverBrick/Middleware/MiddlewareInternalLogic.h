/**
 * @file 
 * @author generated
 * @brief Specification of the Core Functionality of the Middleware
 * @details This files contains the  Functions for Routing and to Identify Ports based on their PortID
 * 
 */
#ifndef MIDDLEWAREINTERNALLOGIC_H_
#define MIDDLEWAREINTERNALLOGIC_H_
#include "stdlib.h"
#include "../lib/MiddlewareTypes.h"
#include "../lib/NetworkInterface.h"
#include "../lib/port.h"
#include "MiddlewareCore.h"
#include "../GlobalIdentifier.h"


/**
 * @brief Determines for a PortID the ECUID of the target ECU
 * @details To determine the target ECU a ECU-table, based on the allocation-model
 * For now, only a switch-case statement. 
 * @todo Later this should be implemented in some hash-table to allow changes during runtime.
 * 
 * @param targetPort the PortID of the target Port
 * @return the ECUID of the target ECU
 */
ECUID MW_getTargetECU(PortID targetPort);

/**
 * @brief  Determines the target ECU for Network Communication
 * @details When a Message is received, we have to look if this Messages is for this ECU or shall be forwared to another ECU.
 *          Thus, this Function return the next ECU to which a Message shall be forwarded
 * 
 * @param ecu the ECUID of the target ECU
 * @return the ECUID of the NextStepECU, if the ECU is not reachable -1 is returned
 * @note if the ECU is not reachable -1 is returned
 */
ECUID MW_getNextStepECU(ECUID ecu);

/**
 * @brief Get returns a NetworkInterface which is able to contact the NextStep-ECU
 * @details When the NextStep-ECU is determinded via ECUID MW_getNextStepECU(ECUID ecu), then this Function returns the corresponding NetworkInterface
 *          over which the NextStep-ECU can be contacted
 * 
 * @param ecu the ECUID of an connected ECU
 * @return the NetworkInterface which is able to contact the target ECU directly or indirectly
 */
NetworkInterface* MW_getNetworkInterface(ECUID ecu);

/**
 * @brief Get the Port with the given PortID
 * @details This function returns a Pointer to a Port for a given PortID, thus this Port must belong to a Component which is allocated on this ECU: serverBrick
 *          and which is contained in the struct Middleware
 * 
 * @param portID the PortID for which the corresponding Port shall be returned
 * @return A Pointer to the Port with the given PortID, if none could be found NULL
 * @note returns NULL if no Port could be found
 */
Port* MW_getPortforIdentifier(PortID portID);

/**
 * @brief Return the  PortID of a receiving port for a given sender PortID
 * @details This function returns the PortID of every Port, no matter if its allocated on this ECU: serverBrick or on any other ECU
 * 
 * @param portID the PortID of the sender Port
 * @return the PortID of the corresponding receiver Port, if no one could be found 0
 * @note returns 0 if no receiver Port could be found
 */
PortID MW_getTargetPortIDforIdentifier(PortID portID);

#endif /* MIDDLEWAREINTERNALLOGIC_H_ */
