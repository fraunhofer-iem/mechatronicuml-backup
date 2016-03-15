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
 * Message: Messages.proto, line 9
 *******************************************************************/

void MessagesOrderForPSMessagesMessage_clear(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage) {
	_memset(_MessagesOrderForPSMessagesMessage, 0, sizeof(struct MessagesOrderForPSMessagesMessage));
}

void MessagesOrderForPSMessagesMessage_init_optional_attributes(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage) {
	_MessagesOrderForPSMessagesMessage->_receiverPsID = 0;
	
	_MessagesOrderForPSMessagesMessage->_orderID = 0;
	
	_MessagesOrderForPSMessagesMessage->_incredientID = 0;
	
	_MessagesOrderForPSMessagesMessage->_amount = 0;
	
}

int MessagesOrderForPSMessagesMessage_is_default_message(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage) {
    return _MessagesOrderForPSMessagesMessage->_receiverPsID == 0
    
     && _MessagesOrderForPSMessagesMessage->_orderID == 0
    
     && _MessagesOrderForPSMessagesMessage->_incredientID == 0
    
     && _MessagesOrderForPSMessagesMessage->_amount == 0
    ;
}

int MessagesOrderForPSMessagesMessage_write(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesOrderForPSMessagesMessage->_receiverPsID != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_MessagesOrderForPSMessagesMessage->_receiverPsID >= 0)
	        offset = write_raw_varint32(_MessagesOrderForPSMessagesMessage->_receiverPsID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesOrderForPSMessagesMessage->_receiverPsID, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesOrderForPSMessagesMessage->_orderID != 0) {
		offset = write_raw_varint32((2<<3)+0, _buffer, offset);
	    if (_MessagesOrderForPSMessagesMessage->_orderID >= 0)
	        offset = write_raw_varint32(_MessagesOrderForPSMessagesMessage->_orderID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesOrderForPSMessagesMessage->_orderID, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesOrderForPSMessagesMessage->_incredientID != 0) {
		offset = write_raw_varint32((3<<3)+0, _buffer, offset);
	    if (_MessagesOrderForPSMessagesMessage->_incredientID >= 0)
	        offset = write_raw_varint32(_MessagesOrderForPSMessagesMessage->_incredientID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesOrderForPSMessagesMessage->_incredientID, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesOrderForPSMessagesMessage->_amount != 0) {
		offset = write_raw_varint32((4<<3)+0, _buffer, offset);
	    if (_MessagesOrderForPSMessagesMessage->_amount >= 0)
	        offset = write_raw_varint32(_MessagesOrderForPSMessagesMessage->_amount, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesOrderForPSMessagesMessage->_amount, _buffer, offset);	    
	}
	
	return offset;
}

int MessagesOrderForPSMessagesMessage_write_with_tag(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = MessagesOrderForPSMessagesMessage_write_delimited_to(_MessagesOrderForPSMessagesMessage, _buffer, offset);
	
	return offset;
}

int MessagesOrderForPSMessagesMessage_write_delimited_to(struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = MessagesOrderForPSMessagesMessage_write(_MessagesOrderForPSMessagesMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int MessagesOrderForPSMessagesMessage_read(void *_buffer, struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	MessagesOrderForPSMessagesMessage_clear(_MessagesOrderForPSMessagesMessage);
	/* Assign the optional attributes. */
	MessagesOrderForPSMessagesMessage_init_optional_attributes(_MessagesOrderForPSMessagesMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _MessagesOrderForPSMessagesMessage._receiverPsID */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesOrderForPSMessagesMessage->_receiverPsID = (signed long)tag;
	        	break;
	        /* tag of: _MessagesOrderForPSMessagesMessage._orderID */
	        case 2 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesOrderForPSMessagesMessage->_orderID = (signed long)tag;
	        	break;
	        /* tag of: _MessagesOrderForPSMessagesMessage._incredientID */
	        case 3 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesOrderForPSMessagesMessage->_incredientID = (signed long)tag;
	        	break;
	        /* tag of: _MessagesOrderForPSMessagesMessage._amount */
	        case 4 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesOrderForPSMessagesMessage->_amount = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int MessagesOrderForPSMessagesMessage_read_delimited_from(void *_buffer, struct MessagesOrderForPSMessagesMessage *_MessagesOrderForPSMessagesMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	MessagesOrderForPSMessagesMessage_read(_buffer, _MessagesOrderForPSMessagesMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 16
 *******************************************************************/

void MessagesGetOrderMessagesMessage_clear(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage) {
	_memset(_MessagesGetOrderMessagesMessage, 0, sizeof(struct MessagesGetOrderMessagesMessage));
}

void MessagesGetOrderMessagesMessage_init_optional_attributes(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage) {
	_MessagesGetOrderMessagesMessage->_psID = 0;
	
}

int MessagesGetOrderMessagesMessage_is_default_message(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage) {
    return _MessagesGetOrderMessagesMessage->_psID == 0
    ;
}

int MessagesGetOrderMessagesMessage_write(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesGetOrderMessagesMessage->_psID != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_MessagesGetOrderMessagesMessage->_psID >= 0)
	        offset = write_raw_varint32(_MessagesGetOrderMessagesMessage->_psID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesGetOrderMessagesMessage->_psID, _buffer, offset);	    
	}
	
	return offset;
}

int MessagesGetOrderMessagesMessage_write_with_tag(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = MessagesGetOrderMessagesMessage_write_delimited_to(_MessagesGetOrderMessagesMessage, _buffer, offset);
	
	return offset;
}

int MessagesGetOrderMessagesMessage_write_delimited_to(struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = MessagesGetOrderMessagesMessage_write(_MessagesGetOrderMessagesMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int MessagesGetOrderMessagesMessage_read(void *_buffer, struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	MessagesGetOrderMessagesMessage_clear(_MessagesGetOrderMessagesMessage);
	/* Assign the optional attributes. */
	MessagesGetOrderMessagesMessage_init_optional_attributes(_MessagesGetOrderMessagesMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _MessagesGetOrderMessagesMessage._psID */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesGetOrderMessagesMessage->_psID = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int MessagesGetOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesGetOrderMessagesMessage *_MessagesGetOrderMessagesMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	MessagesGetOrderMessagesMessage_read(_buffer, _MessagesGetOrderMessagesMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 20
 *******************************************************************/

void MessagesNoOrderMessagesMessage_clear(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage) {
	_memset(_MessagesNoOrderMessagesMessage, 0, sizeof(struct MessagesNoOrderMessagesMessage));
}

void MessagesNoOrderMessagesMessage_init_optional_attributes(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage) {
	_MessagesNoOrderMessagesMessage->_receiverPsID = 0;
	
}

int MessagesNoOrderMessagesMessage_is_default_message(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage) {
    return _MessagesNoOrderMessagesMessage->_receiverPsID == 0
    ;
}

int MessagesNoOrderMessagesMessage_write(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesNoOrderMessagesMessage->_receiverPsID != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_MessagesNoOrderMessagesMessage->_receiverPsID >= 0)
	        offset = write_raw_varint32(_MessagesNoOrderMessagesMessage->_receiverPsID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesNoOrderMessagesMessage->_receiverPsID, _buffer, offset);	    
	}
	
	return offset;
}

int MessagesNoOrderMessagesMessage_write_with_tag(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = MessagesNoOrderMessagesMessage_write_delimited_to(_MessagesNoOrderMessagesMessage, _buffer, offset);
	
	return offset;
}

int MessagesNoOrderMessagesMessage_write_delimited_to(struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = MessagesNoOrderMessagesMessage_write(_MessagesNoOrderMessagesMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int MessagesNoOrderMessagesMessage_read(void *_buffer, struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	MessagesNoOrderMessagesMessage_clear(_MessagesNoOrderMessagesMessage);
	/* Assign the optional attributes. */
	MessagesNoOrderMessagesMessage_init_optional_attributes(_MessagesNoOrderMessagesMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _MessagesNoOrderMessagesMessage._receiverPsID */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesNoOrderMessagesMessage->_receiverPsID = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int MessagesNoOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesNoOrderMessagesMessage *_MessagesNoOrderMessagesMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	MessagesNoOrderMessagesMessage_read(_buffer, _MessagesNoOrderMessagesMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 24
 *******************************************************************/

void MessagesSimpleOrderMessagesMessage_clear(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage) {
	_memset(_MessagesSimpleOrderMessagesMessage, 0, sizeof(struct MessagesSimpleOrderMessagesMessage));
}

void MessagesSimpleOrderMessagesMessage_init_optional_attributes(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage) {
	_MessagesSimpleOrderMessagesMessage->_orderID = 0;
	
	_MessagesSimpleOrderMessagesMessage->_ingredientID = 0;
	
	_MessagesSimpleOrderMessagesMessage->_amount = 0;
	
}

int MessagesSimpleOrderMessagesMessage_is_default_message(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage) {
    return _MessagesSimpleOrderMessagesMessage->_orderID == 0
    
     && _MessagesSimpleOrderMessagesMessage->_ingredientID == 0
    
     && _MessagesSimpleOrderMessagesMessage->_amount == 0
    ;
}

int MessagesSimpleOrderMessagesMessage_write(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesSimpleOrderMessagesMessage->_orderID != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_MessagesSimpleOrderMessagesMessage->_orderID >= 0)
	        offset = write_raw_varint32(_MessagesSimpleOrderMessagesMessage->_orderID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesSimpleOrderMessagesMessage->_orderID, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesSimpleOrderMessagesMessage->_ingredientID != 0) {
		offset = write_raw_varint32((2<<3)+0, _buffer, offset);
	    if (_MessagesSimpleOrderMessagesMessage->_ingredientID >= 0)
	        offset = write_raw_varint32(_MessagesSimpleOrderMessagesMessage->_ingredientID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesSimpleOrderMessagesMessage->_ingredientID, _buffer, offset);	    
	}
	
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesSimpleOrderMessagesMessage->_amount != 0) {
		offset = write_raw_varint32((3<<3)+0, _buffer, offset);
	    if (_MessagesSimpleOrderMessagesMessage->_amount >= 0)
	        offset = write_raw_varint32(_MessagesSimpleOrderMessagesMessage->_amount, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesSimpleOrderMessagesMessage->_amount, _buffer, offset);	    
	}
	
	return offset;
}

int MessagesSimpleOrderMessagesMessage_write_with_tag(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = MessagesSimpleOrderMessagesMessage_write_delimited_to(_MessagesSimpleOrderMessagesMessage, _buffer, offset);
	
	return offset;
}

int MessagesSimpleOrderMessagesMessage_write_delimited_to(struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = MessagesSimpleOrderMessagesMessage_write(_MessagesSimpleOrderMessagesMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int MessagesSimpleOrderMessagesMessage_read(void *_buffer, struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	MessagesSimpleOrderMessagesMessage_clear(_MessagesSimpleOrderMessagesMessage);
	/* Assign the optional attributes. */
	MessagesSimpleOrderMessagesMessage_init_optional_attributes(_MessagesSimpleOrderMessagesMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _MessagesSimpleOrderMessagesMessage._orderID */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesSimpleOrderMessagesMessage->_orderID = (signed long)tag;
	        	break;
	        /* tag of: _MessagesSimpleOrderMessagesMessage._ingredientID */
	        case 2 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesSimpleOrderMessagesMessage->_ingredientID = (signed long)tag;
	        	break;
	        /* tag of: _MessagesSimpleOrderMessagesMessage._amount */
	        case 3 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesSimpleOrderMessagesMessage->_amount = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int MessagesSimpleOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesSimpleOrderMessagesMessage *_MessagesSimpleOrderMessagesMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	MessagesSimpleOrderMessagesMessage_read(_buffer, _MessagesSimpleOrderMessagesMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 30
 *******************************************************************/

void MessagesDoneOrderMessagesMessage_clear(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage) {
	_memset(_MessagesDoneOrderMessagesMessage, 0, sizeof(struct MessagesDoneOrderMessagesMessage));
}

void MessagesDoneOrderMessagesMessage_init_optional_attributes(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage) {
	_MessagesDoneOrderMessagesMessage->_orderID = 0;
	
}

int MessagesDoneOrderMessagesMessage_is_default_message(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage) {
    return _MessagesDoneOrderMessagesMessage->_orderID == 0
    ;
}

int MessagesDoneOrderMessagesMessage_write(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, void *_buffer, int offset) {
	/* Write content of each message element.*/
	/* Write the optional attribute only if it is different than the default value. */
	if(_MessagesDoneOrderMessagesMessage->_orderID != 0) {
		offset = write_raw_varint32((1<<3)+0, _buffer, offset);
	    if (_MessagesDoneOrderMessagesMessage->_orderID >= 0)
	        offset = write_raw_varint32(_MessagesDoneOrderMessagesMessage->_orderID, _buffer, offset);
	    else
	        offset = write_raw_varint64(_MessagesDoneOrderMessagesMessage->_orderID, _buffer, offset);	    
	}
	
	return offset;
}

int MessagesDoneOrderMessagesMessage_write_with_tag(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, void *_buffer, int offset, int tag) {
	/* Write tag.*/
	offset = write_raw_varint32((tag<<3)+2, _buffer, offset);
	/* Write content.*/
	offset = MessagesDoneOrderMessagesMessage_write_delimited_to(_MessagesDoneOrderMessagesMessage, _buffer, offset);
	
	return offset;
}

int MessagesDoneOrderMessagesMessage_write_delimited_to(struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, void *_buffer, int offset) {
	int i, shift, new_offset, size;
	
	new_offset = MessagesDoneOrderMessagesMessage_write(_MessagesDoneOrderMessagesMessage, _buffer, offset);
	size = new_offset - offset;
	shift = (size > 127) ? 2 : 1;
	for (i = new_offset - 1; i >= offset; -- i)
	    *((char *)_buffer + i + shift) = *((char *)_buffer + i);
	
	write_raw_varint32((unsigned long) size, _buffer, offset);         
	    
	return new_offset + shift;
}

int MessagesDoneOrderMessagesMessage_read(void *_buffer, struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, int offset, int limit) {
	unsigned int i = 0;
	unsigned long long value = i;
	unsigned long tag = value;
	
	/* Reset all attributes to 0 in advance. */
	MessagesDoneOrderMessagesMessage_clear(_MessagesDoneOrderMessagesMessage);
	/* Assign the optional attributes. */
	MessagesDoneOrderMessagesMessage_init_optional_attributes(_MessagesDoneOrderMessagesMessage);
	
	/* Read/interpret all attributes from buffer offset until upper limit is reached. */
	while(offset < limit) {
	    offset = read_raw_varint32(&tag, _buffer, offset);
		tag = tag>>3;
	    switch(tag){
	        /* tag of: _MessagesDoneOrderMessagesMessage._orderID */
	        case 1 :
	        	offset = read_raw_varint32(&tag, _buffer, offset);
	        	_MessagesDoneOrderMessagesMessage->_orderID = (signed long)tag;
	        	break;
	    }
	}
	
	return offset;
}

int MessagesDoneOrderMessagesMessage_read_delimited_from(void *_buffer, struct MessagesDoneOrderMessagesMessage *_MessagesDoneOrderMessagesMessage, int offset) {
	unsigned long size;
	
	offset = read_raw_varint32(&size, _buffer, offset);
	MessagesDoneOrderMessagesMessage_read(_buffer, _MessagesDoneOrderMessagesMessage, offset, size + offset);
	
	return offset + size;
}
/*******************************************************************
 * Message: Messages.proto, line 42
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
