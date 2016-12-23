/**
 * @file 
 * @author generated
 * @brief Implementations of the Interface NetworkInterface
 * @details In this file Method-Stubs for the #NetworkInterface%s of the ECU overtakerR1 are genereated,
 *          These Method-Stubs have to be manually implemented, since they are called in the Middleware and in the Methods MW_NIreceiveMessages(void) and MW_NIsendMessages(void)
 * 
 * @warning the Implementation of the #NetworkInterface%s has to be done manually
 */
#ifndef NETWORKINTERFACEIMPLEMENTATION_H_
#define NETWORKINTERFACEIMPLEMENTATION_H_

#include "../GlobalIdentifier.h"
#include "MiddlewareCore.h"

//Intern networkinterface
 /**
  * @brief Does Nothing, just to be consisten to the Interface
  * @return True
  */
bool_t NetworkInterface_intern_init(void);

/**
 * @brief Send a MiddlewareMessage via the internal NetworkInterface
 * @details The MiddlewareMessage is directly enqued in the NetworkMessageBuffer Middleware::incoming
 * 
 * @param msg The MiddlewareMessage to be send
 * @return True, if sending was succesful, otherwise False
 */
bool_t NetworkInterface_intern_send(MiddlewareMessage* msg);

/**
 * @brief This Method is empty and its purpose is to be conistend to the Interface NetworkInterface
 * @return NULL
 * @warning This method should never be used!
 */
MiddlewareMessage* NetworkInterface_intern_receive(void);

/**
 * @brief INIT method for NetworkInterface: virtualBluetoothPort of ECU:overtakerR1
 * @details Implement this method, to do additional initialization for NetworkInterface: Middleware::virtualBluetoothPort. Usually this is called before the main application is started.
 * @return What you have implemented
 */
bool_t networkInterface_VirtualBluetoothPort_init(void);

/**
 * @brief SEND method for the NetworkInterface: virtualBluetoothPort of ECU:overtakerR1
 * @details Implement this method, to send a message via the  NetworkInterface: Middleware::virtualBluetoothPort.
 * This method ist called by the middleware, if a message has to be sent via this NetworkInterface
 * @param msg the MiddlewareMessage to be sent
 * @return What you have implemented
 * @note use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualBluetoothPort_send(MiddlewareMessage* msg);

/**
 * @brief RECEIVE method for the NetworkInterface: virtualBluetoothPort of ECU:overtakerR1
 * @details implement this method, to receive a message via the  NetworkInterface: Middleware::virtualBluetoothPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualBluetoothPort_receive(void);
/**
 * @brief INIT method for NetworkInterface: VirtualWifiPort of ECU:overtakerR1
 * @details Implement this method, to do additional initialization for NetworkInterface: Middleware::VirtualWifiPort. Usually this is called before the main application is started.
 * @return What you have implemented
 */
bool_t networkInterface_VirtualWifiPort_init(void);

/**
 * @brief SEND method for the NetworkInterface: VirtualWifiPort of ECU:overtakerR1
 * @details Implement this method, to send a message via the  NetworkInterface: Middleware::VirtualWifiPort.
 * This method ist called by the middleware, if a message has to be sent via this NetworkInterface
 * @param msg the MiddlewareMessage to be sent
 * @return What you have implemented
 * @note use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_VirtualWifiPort_send(MiddlewareMessage* msg);

/**
 * @brief RECEIVE method for the NetworkInterface: VirtualWifiPort of ECU:overtakerR1
 * @details implement this method, to receive a message via the  NetworkInterface: Middleware::VirtualWifiPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_VirtualWifiPort_receive(void);
/**
 * @brief INIT method for NetworkInterface: inputPort4 of ECU:overtakerR1
 * @details Implement this method, to do additional initialization for NetworkInterface: Middleware::inputPort4. Usually this is called before the main application is started.
 * @return What you have implemented
 */
bool_t networkInterface_InputPort4_init(void);

/**
 * @brief SEND method for the NetworkInterface: inputPort4 of ECU:overtakerR1
 * @details Implement this method, to send a message via the  NetworkInterface: Middleware::inputPort4.
 * This method ist called by the middleware, if a message has to be sent via this NetworkInterface
 * @param msg the MiddlewareMessage to be sent
 * @return What you have implemented
 * @note use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_InputPort4_send(MiddlewareMessage* msg);

/**
 * @brief RECEIVE method for the NetworkInterface: inputPort4 of ECU:overtakerR1
 * @details implement this method, to receive a message via the  NetworkInterface: Middleware::inputPort4.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_InputPort4_receive(void);
/**
 * @brief INIT method for NetworkInterface: usbPort of ECU:overtakerR1
 * @details Implement this method, to do additional initialization for NetworkInterface: Middleware::usbPort. Usually this is called before the main application is started.
 * @return What you have implemented
 */
bool_t networkInterface_UsbPort_init(void);

/**
 * @brief SEND method for the NetworkInterface: usbPort of ECU:overtakerR1
 * @details Implement this method, to send a message via the  NetworkInterface: Middleware::usbPort.
 * This method ist called by the middleware, if a message has to be sent via this NetworkInterface
 * @param msg the MiddlewareMessage to be sent
 * @return What you have implemented
 * @note use the protobuf method MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag)
 * to write the message content into a byte array, if needed
 */
bool_t networkInterface_UsbPort_send(MiddlewareMessage* msg);

/**
 * @brief RECEIVE method for the NetworkInterface: usbPort of ECU:overtakerR1
 * @details implement this method, to receive a message via the  NetworkInterface: Middleware::usbPort.
 * This method ist called by the middleware periodically to receive new messages
 * @return the received MiddlewareMessage
 */
MiddlewareMessage * networkInterface_UsbPort_receive(void);

#endif /* NETWORKINTERFACEIMPLEMENTATION_H_ */
