/******************************************************************* 
 * C file generated by Protoc for Embedded C.                      *
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
 
#include "Messages.h"

int _memcmp(const void *p1, const void *p2, unsigned int size) {
    unsigned int i;
    for(i = 0; i < size; ++ i) {
        if(*((char*)p1 + i) > *((char*)p2 + i))
            return 1;
        if(*((char*)p1 + i) < *((char*)p2 + i))
            return -1;
    }
    return 0;
} 
 
void _memset(void *msg_ptr, char init_val, unsigned int size) {
    unsigned int i;
    for(i = 0; i < size; ++ i)
        *((char*)msg_ptr + i) = init_val;
}

int varint_packed_size(unsigned long value) {
    if ((value & (0xffffffff <<  7)) == 0) return 1;
    if ((value & (0xffffffff << 14)) == 0) return 2;
    if ((value & (0xffffffff << 21)) == 0) return 3;
    if ((value & (0xffffffff << 28)) == 0) return 4;
    return 5;  
}

int write_raw_byte(char value, void *_buffer, int offset) {
    *((char *)_buffer + offset) = value;
    return ++offset;
}

/** Write a little-endian 32-bit integer. */
int write_raw_little_endian32(unsigned long value, void *_buffer, int offset) {
    offset = write_raw_byte((char)((value      ) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >>  8) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 16) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 24) & 0xFF), _buffer, offset);
    
    return offset;
}

/** Write a little-endian 64-bit integer. */
int write_raw_little_endian64(unsigned long long value, void *_buffer, int offset) {
    offset = write_raw_byte((char)((value      ) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >>  8) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 16) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 24) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 32) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 40) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 48) & 0xFF), _buffer, offset);
    offset = write_raw_byte((char)((value >> 56) & 0xFF), _buffer, offset);
    
    return offset;
}

int write_raw_varint32(unsigned long value, void *_buffer, int offset) {
    while (1) {
        if ((value & ~0x7F) == 0) {
            offset = write_raw_byte((char)value, _buffer, offset);
            return offset;
        } else {
            offset = write_raw_byte((char)((value & 0x7F) | 0x80), _buffer, offset);
            value = value >> 7;
        }
    }
    return offset;
}

int write_raw_varint64(unsigned long long value, void *_buffer, int offset) {
    while (1) {
        if ((value & ~0x7FL) == 0) {
            offset = write_raw_byte((char)value, _buffer, offset);
            return offset;
        } else {
            offset = write_raw_byte((char)((value & 0x7F) | 0x80), _buffer, offset);
            value = value >> 7;
        }
    }
    return offset;
}

int write_raw_bytes(char *bytes, int bytes_size, void *_buffer, int offset) {
    int i; 
    for(i = 0; i < bytes_size; ++ i) {
        offset = write_raw_byte((char)*(bytes + i), _buffer, offset);
    }
    
    return offset;   
}

unsigned long encode_zig_zag32(signed long n) {
    /* Note:  the right-shift must be arithmetic. */
    return (n << 1) ^ (n >> 31);
}

unsigned long long encode_zig_zag64(signed long long n) {
    /* Note:  the right-shift must be arithmetic. */
    return (n << 1) ^ (n >> 63);
} 

signed long decode_zig_zag32(unsigned long n) {
    return (n >> 1) ^ -(n & 1);
}

signed long long decode_zig_zag64(unsigned long long n) {
    return (n >> 1) ^ -(n & 1);
}

int read_raw_byte(char *tag, void *_buffer, int offset) {
    *tag = *((char *) _buffer + offset);
    
    return ++offset;
}

/** Read a 32-bit little-endian integer from the stream. */
int read_raw_little_endian32(unsigned long *tag, void *_buffer, int offset) {
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b1 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b2 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b3 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b4 = (char) *tag;
    
    *tag = (((unsigned long)b1 & 0xff)      ) |
           (((unsigned long)b2 & 0xff) <<  8) |
           (((unsigned long)b3 & 0xff) << 16) |
           (((unsigned long)b4 & 0xff) << 24);
           
    return offset;
}

/** Read a 64-bit little-endian integer from the stream. */
int read_raw_little_endian64(unsigned long long *tag, void *_buffer, int offset) {
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b1 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b2 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b3 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b4 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b5 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b6 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b7 = (char) *tag;
    offset = read_raw_byte((char *)tag, _buffer, offset);
    char b8 = (char) *tag;
    
    *tag = (((unsigned long long)b1 & 0xff)      ) |
           (((unsigned long long)b2 & 0xff) <<  8) |
           (((unsigned long long)b3 & 0xff) << 16) |
           (((unsigned long long)b4 & 0xff) << 24) |
           (((unsigned long long)b5 & 0xff) << 32) |
           (((unsigned long long)b6 & 0xff) << 40) |
           (((unsigned long long)b7 & 0xff) << 48) |
           (((unsigned long long)b8 & 0xff) << 56);
           
    return offset;
}

int read_raw_varint32(unsigned long *tag, void *_buffer, int offset) {
    signed char result;
    
    offset = read_raw_byte((char *)&result, _buffer, offset);
    if (result >= 0) {
        *tag = result;
        return offset;
    }
    *tag = result & 0x7f;
    offset = read_raw_byte((char *)&result, _buffer, offset);
    if (result >= 0) {
        *tag |= result << 7;
    } else {
        *tag |= (result & 0x7f) << 7;
        offset = read_raw_byte((char *)&result, _buffer, offset);
        if (result >= 0) {
            *tag |= result << 14;
        } else {
            *tag |= (result & 0x7f) << 14;
            offset = read_raw_byte((char *)&result, _buffer, offset);
            if (result >= 0) {
                *tag |= ((unsigned long)result) << 21;
            } else {
                *tag |= (((unsigned long)result) & 0x7f) << 21;
                offset = read_raw_byte((char *)&result, _buffer, offset);
                *tag |= ((unsigned long)result) << 28;
                if (result < 0) {
                    /* Discard upper 32 bits. */
                    int i;
                    for (i = 0; i < 5; ++ i) {
                        offset = read_raw_byte((char *)&result, _buffer, offset);
                        if (result >= 0) {
                            return offset;
                        }
                    }
                    /* Invalid state. */
                }
            }
        }
    }
    return offset;
}

int read_raw_varint64(unsigned long long *tag, void *_buffer, int offset) {
    short shift = 0;
    signed char b;
    *tag = 0;
    while (shift < 64) {
        offset = read_raw_byte((char *)&b, _buffer, offset);
        *tag |= (unsigned long long)(b & 0x7F) << shift;
        if ((b & 0x80) == 0) {
            return offset;
        }
        shift += 7;
    }
    /* return error code. */
    return -1;
}

int can_read_raw_varint32(void *_buffer, int offset, int length) {
    signed char c;
    
    /* Bound length to valid range [0..5]. */
    if (length < 0) length = 0; else
    if (length > 5) length = 5;
    
    while (length > 0) {
        offset = read_raw_byte((char *)&c, _buffer, offset);
        if (c >= 0) {
            return 1; /* Can read (1 == true). */
        }
        length--;
    }
    
    return 0; /* Cannot read (0 == false). */
}

int can_read_raw_varint64(void *_buffer, int offset, int length) {
    signed char c;
    
    /* Bound length to valid range [0..5]. */
    if (length < 0) length = 0; else
    if (length > 10) length = 10;
    
    while (length > 0) {
        offset = read_raw_byte((char *)&c, _buffer, offset);
        if (c >= 0) {
            return 1; /* Can read (1 == true). */
        }
        length--;
    }
    
    return 0; /* Cannot read (0 == false). */
}

int Message_can_read_delimited_from(void *_buffer, int offset, unsigned int length) {
    unsigned long size;
    int payload_offset;

    if (length <= 0) return 0; /* Cannot read from empty or invalid message. */

    if (!can_read_raw_varint32(_buffer, offset, length)) {
        return 0; /* Could not even read the preceding size as varint32. */
    }

    payload_offset = read_raw_varint32(&size, _buffer, offset);
    length = length - (payload_offset - offset);

    return (length >= size) ? 1 : 0;
}

unsigned long Message_get_delimited_size(void *_buffer, int offset) {
    unsigned long size = 0;
    int old_offset = offset;
    
    offset = read_raw_varint32(&size, _buffer, offset);
    
    return size + offset - old_offset;
}


/*******************************************************************
 * Message: Messages.proto, line 19
 *******************************************************************/

void Color_color_messageapi_messageType_RepositoryMessage_clear(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage) {
	_memset(_Color_color_messageapi_messageType_RepositoryMessage, 0, sizeof(struct Color_color_messageapi_messageType_RepositoryMessage));
}

void Color_color_messageapi_messageType_RepositoryMessage_init_optional_attributes(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage) {
	_Color_color_messageapi_messageType_RepositoryMessage->_color_value = 0;
	
}

int Color_color_messageapi_messageType_RepositoryMessage_is_default_message(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage) {
    return _Color_color_messageapi_messageType_RepositoryMessage->_color_value == 0
    ;
}

int Color_color_messageapi_messageType_RepositoryMessage_write(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_Color_color_messageapi_messageType_RepositoryMessage->_color_value != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_Color_color_messageapi_messageType_RepositoryMessage->_color_value >= 0)
	        offset = write_raw_varint32(_Color_color_messageapi_messageType_RepositoryMessage->_color_value, _buffer, offset);
	    else
	        offset = write_raw_varint64(_Color_color_messageapi_messageType_RepositoryMessage->_color_value, _buffer, offset);	    
	}
	
	return offset;
}

int Color_color_messageapi_messageType_RepositoryMessage_write_with_tag(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = Color_color_messageapi_messageType_RepositoryMessage_write_delimited_to(_Color_color_messageapi_messageType_RepositoryMessage, _buffer, offset);
	
	return offset;
}

int Color_color_messageapi_messageType_RepositoryMessage_write_delimited_to(struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = Color_color_messageapi_messageType_RepositoryMessage_write(_Color_color_messageapi_messageType_RepositoryMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int Color_color_messageapi_messageType_RepositoryMessage_read(void *_buffer, struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	Color_color_messageapi_messageType_RepositoryMessage_clear(_Color_color_messageapi_messageType_RepositoryMessage);
	/* Assign the optional attributes. */
	Color_color_messageapi_messageType_RepositoryMessage_init_optional_attributes(_Color_color_messageapi_messageType_RepositoryMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _Color_color_messageapi_messageType_RepositoryMessage._color_value */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_Color_color_messageapi_messageType_RepositoryMessage->_color_value = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int Color_color_messageapi_messageType_RepositoryMessage_read_delimited_from(void *_buffer, struct Color_color_messageapi_messageType_RepositoryMessage *_Color_color_messageapi_messageType_RepositoryMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	Color_color_messageapi_messageType_RepositoryMessage_read(_buffer, _Color_color_messageapi_messageType_RepositoryMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 23
 *******************************************************************/

void changeOvertakingMessagesMessage_clear(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage) {
	_memset(_changeOvertakingMessagesMessage, 0, sizeof(struct changeOvertakingMessagesMessage));
}

void changeOvertakingMessagesMessage_init_optional_attributes(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage) {
	_changeOvertakingMessagesMessage->_secID = 0;
	
}

int changeOvertakingMessagesMessage_is_default_message(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage) {
    return _changeOvertakingMessagesMessage->_secID == 0
    ;
}

int changeOvertakingMessagesMessage_write(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_changeOvertakingMessagesMessage->_secID != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_changeOvertakingMessagesMessage->_secID >= 0)
	        offset = write_raw_varint32(_changeOvertakingMessagesMessage->_secID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_changeOvertakingMessagesMessage->_secID, _buffer, offset);	    
	}
	
	return offset;
}

int changeOvertakingMessagesMessage_write_with_tag(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = changeOvertakingMessagesMessage_write_delimited_to(_changeOvertakingMessagesMessage, _buffer, offset);
	
	return offset;
}

int changeOvertakingMessagesMessage_write_delimited_to(struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = changeOvertakingMessagesMessage_write(_changeOvertakingMessagesMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int changeOvertakingMessagesMessage_read(void *_buffer, struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	changeOvertakingMessagesMessage_clear(_changeOvertakingMessagesMessage);
	/* Assign the optional attributes. */
	changeOvertakingMessagesMessage_init_optional_attributes(_changeOvertakingMessagesMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _changeOvertakingMessagesMessage._secID */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_changeOvertakingMessagesMessage->_secID = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int changeOvertakingMessagesMessage_read_delimited_from(void *_buffer, struct changeOvertakingMessagesMessage *_changeOvertakingMessagesMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	changeOvertakingMessagesMessage_read(_buffer, _changeOvertakingMessagesMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 35
 *******************************************************************/

void MiddlewareMessage_clear(struct MiddlewareMessage *_MiddlewareMessage) {
	_memset(_MiddlewareMessage, 0, sizeof(struct MiddlewareMessage));
}

void MiddlewareMessage_init_optional_attributes(struct MiddlewareMessage *_MiddlewareMessage) {
	_MiddlewareMessage->_targetPort = 0;
	
	_MiddlewareMessage->_msgID = 0;
	
	_MiddlewareMessage->_mumlMsg_len = 0;
	
	
}

int MiddlewareMessage_is_default_message(struct MiddlewareMessage *_MiddlewareMessage) {
    return _MiddlewareMessage->_targetPort == 0
    
     && _MiddlewareMessage->_msgID == 0
    
     && _MiddlewareMessage->_mumlMsg_len == 0
    ;
}

int MiddlewareMessage_write(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_MiddlewareMessage->_targetPort != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_MiddlewareMessage->_targetPort >= 0)
	        offset = write_raw_varint32(_MiddlewareMessage->_targetPort, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MiddlewareMessage->_targetPort, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MiddlewareMessage->_msgID != 0) {
		offset = write_raw_varint32((2<<3)+0, _buffer, offset);
	    if (_MiddlewareMessage->_msgID >= 0)
	        offset = write_raw_varint32(_MiddlewareMessage->_msgID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MiddlewareMessage->_msgID, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MiddlewareMessage->_mumlMsg_len != 1
	    || _MiddlewareMessage->_mumlMsg[0] != '0') {
		offset = write_raw_varint32((3<<3)+2, _buffer, offset);
	    offset = write_raw_varint32(_MiddlewareMessage->_mumlMsg_len, _buffer, offset);
	    offset = write_raw_bytes(_MiddlewareMessage->_mumlMsg, _MiddlewareMessage->_mumlMsg_len, _buffer, offset);
	}
	
	return offset;
}

int MiddlewareMessage_write_with_tag(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = MiddlewareMessage_write_delimited_to(_MiddlewareMessage, _buffer, offset);
	
	return offset;
}

int MiddlewareMessage_write_delimited_to(struct MiddlewareMessage *_MiddlewareMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = MiddlewareMessage_write(_MiddlewareMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int MiddlewareMessage_read(void *_buffer, struct MiddlewareMessage *_MiddlewareMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	MiddlewareMessage_clear(_MiddlewareMessage);
	/* Assign the optional attributes. */
	MiddlewareMessage_init_optional_attributes(_MiddlewareMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _MiddlewareMessage._targetPort */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MiddlewareMessage->_targetPort = (signed long)tag;
	        	break;
	        /* tag of: _MiddlewareMessage._msgID */
	        case 2 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MiddlewareMessage->_msgID = (signed long)tag;
	        	break;
	        /* tag of: _MiddlewareMessage._mumlMsg */
	        case 3 :
	        	/* Re-use 'tag' to store string length. */
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MiddlewareMessage->_mumlMsg_len = tag;
	        	for(i = 0; i < tag; ++ i) 
	        	    offset = read_raw_byte((_MiddlewareMessage->_mumlMsg + i), _buffer, offset);
	        	break;
	    }
	}
	
	return offset;
}

int MiddlewareMessage_read_delimited_from(void *_buffer, struct MiddlewareMessage *_MiddlewareMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	MiddlewareMessage_read(_buffer, _MiddlewareMessage, offset, size + offset);
	
	return offset + size;
}
