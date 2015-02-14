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

#define MAX_STRING_LENGTH 32
#define MAX_REPEATED_LENGTH 100
#define MAX_BYTES_LENGTH 32

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
 * Message: Messages.proto, line 19
 *******************************************************************/

/* Maximum size of a serialized Color_color_messageapi_messageType_RepositoryMessage-message, useful for buffer allocation. */
#define MAX_Color_color_messageapi_messageType_RepositoryMessage_SIZE 14

/* Structure that holds a deserialized Color_color_messageapi_messageType_RepositoryMessage-message. */
struct Color_color_messageapi_messageType_RepositoryMessage {
    signed long _color_value;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int Color_color_messageapi_messageType_RepositoryMessage_write_delimited_to(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int Color_color_messageapi_messageType_RepositoryMessage_write_with_tag(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int Color_color_messageapi_messageType_RepositoryMessage_read_delimited_from(void *_buffer, struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 23
 *******************************************************************/

/* Maximum size of a serialized changeOvertakingMessagesMessage-message, useful for buffer allocation. */
#define MAX_changeOvertakingMessagesMessage_SIZE 14

/* Structure that holds a deserialized changeOvertakingMessagesMessage-message. */
struct changeOvertakingMessagesMessage {
    signed long _secID;
};

/*
 * Serialize a Person-message into the given buffer at offset and return
 * new offset for optional next message.
 */
int changeOvertakingMessagesMessage_write_delimited_to(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, void *_buffer, int offset);

/*
 * Serialize a Person-message together with its tag into the given buffer 
 * at offset and return new offset for optional next message.
 * Is useful if a Person-message is embedded in another message.
 */
int changeOvertakingMessagesMessage_write_with_tag(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, void *_buffer, int offset, int tag);

/*
 * Deserialize a Person-message from the given buffer at offset and return
 * new offset for optional next message.
 *
 * Note: All fields in _Person will be reset to 0 before _buffer is interpreted.
 */
int changeOvertakingMessagesMessage_read_delimited_from(void *_buffer, struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, int offset);


/*******************************************************************
 * Message: Messages.proto, line 35
 *******************************************************************/

/* Maximum size of a serialized MiddlewareMessage-message, useful for buffer allocation. */
#define MAX_MiddlewareMessage_SIZE 61

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

