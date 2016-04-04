/******************************************************************* 
 * Header file generated by Protoc for Embedded C.                 *
 * Version 1.0M4 (2013-03-31)                                      *
 *                                                                 *
 * Copyright (c) 2009-2013                                         *
 * Technische Universitaet Muenchen                                *
 * http://www4.in.tum.de/                                          *
 *                                                                 *
 * Source : Messages.proto
 *                                                                 *
 * Do not edit.                                                    *
 *******************************************************************/

#ifndef _Messages_H
#define _Messages_H

#ifdef __cplusplus
  extern "C" {
#endif

#define MAX_STRING_LENGTH 16
#define MAX_REPEATED_LENGTH 100
#define MAX_BYTES_LENGTH 16

/*******************************************************************
 * General functions
 *******************************************************************/

/*
 * returns the size of a length delimited message which also 
 * contains the first bytes for the length encoding.
 */
unsigned long Message_get_delimited_size(void *_buffer, int offset);

/*
 * Tests whether a message can be completely read from the given buffer at
 * the offset. The bytes [offset..offset+length-1] are interpreted.
 *
 * Returns 1 (true) if buffer[offset..offset+length-1] contains a complete
 * message or 0 (false) otherwise.
 */
int Message_can_read_delimited_from(void *_buffer, int offset, unsigned int length);



/*******************************************************************
 * Message: Messages.proto, line 9
 *******************************************************************/

/* Maximum size of a serialized MessagesGetOrderMessagesMessage-message, useful for buffer allocation. */
#define MAX_MessagesGetOrderMessagesMessage_SIZE 14

/* Structure that holds a deserialized MessagesGetOrderMessagesMessage-message. */
struct MessagesGetOrderMessagesMessage {
    signed long _psID;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int MessagesGetOrderMessagesMessage_write_delimited_to(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int MessagesGetOrderMessagesMessage_write_with_tag(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int MessagesGetOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 13
 *******************************************************************/

/* Maximum size of a serialized MessagesOrderForPSMessagesMessage-message, useful for buffer allocation. */
#define MAX_MessagesOrderForPSMessagesMessage_SIZE 50

/* Structure that holds a deserialized MessagesOrderForPSMessagesMessage-message. */
struct MessagesOrderForPSMessagesMessage {
    signed long _receiverPsID;
    signed long _orderID;
    signed long _incredientID;
    signed long _amount;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int MessagesOrderForPSMessagesMessage_write_delimited_to(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int MessagesOrderForPSMessagesMessage_write_with_tag(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int MessagesOrderForPSMessagesMessage_read_delimited_from(void *_buffer, struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 20
 *******************************************************************/

/* Maximum size of a serialized MessagesNoOrderMessagesMessage-message, useful for buffer allocation. */
#define MAX_MessagesNoOrderMessagesMessage_SIZE 14

/* Structure that holds a deserialized MessagesNoOrderMessagesMessage-message. */
struct MessagesNoOrderMessagesMessage {
    signed long _receiverPsID;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int MessagesNoOrderMessagesMessage_write_delimited_to(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int MessagesNoOrderMessagesMessage_write_with_tag(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int MessagesNoOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 24
 *******************************************************************/

/* Maximum size of a serialized MessagesSimpleOrderMessagesMessage-message, useful for buffer allocation. */
#define MAX_MessagesSimpleOrderMessagesMessage_SIZE 38

/* Structure that holds a deserialized MessagesSimpleOrderMessagesMessage-message. */
struct MessagesSimpleOrderMessagesMessage {
    signed long _orderID;
    signed long _ingredientID;
    signed long _amount;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int MessagesSimpleOrderMessagesMessage_write_delimited_to(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int MessagesSimpleOrderMessagesMessage_write_with_tag(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int MessagesSimpleOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 30
 *******************************************************************/

/* Maximum size of a serialized MessagesDoneOrderMessagesMessage-message, useful for buffer allocation. */
#define MAX_MessagesDoneOrderMessagesMessage_SIZE 14

/* Structure that holds a deserialized MessagesDoneOrderMessagesMessage-message. */
struct MessagesDoneOrderMessagesMessage {
    signed long _orderID;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int MessagesDoneOrderMessagesMessage_write_delimited_to(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int MessagesDoneOrderMessagesMessage_write_with_tag(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int MessagesDoneOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 42
 *******************************************************************/

/* Maximum size of a serialized MiddlewareMessage-message, useful for buffer allocation. */
#define MAX_MiddlewareMessage_SIZE 45

/* Structure that holds a deserialized MiddlewareMessage-message. */
struct MiddlewareMessage {
    signed long _targetPort;
    signed long _msgID;
    int _mumlMsg_len;
    char _mumlMsg[MAX_BYTES_LENGTH];
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int MiddlewareMessage_write_delimited_to(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int MiddlewareMessage_read_delimited_from(void *_buffer, struct MiddlewareMessage *_MiddlewareMessage, int offset);



#ifdef __cplusplus
  }
#endif

#endif
