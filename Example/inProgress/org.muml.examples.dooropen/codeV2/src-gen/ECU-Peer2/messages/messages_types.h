/**
 * @file 
 * @author generated
 * @brief The typedefs for the  Messages are definied here
 * @details To guarantee unique Names for Messages, the Name of the corresponding MessageTypeReposity is appended
 */
#ifndef MESSAGE_TYPES_H
#define MESSAGE_TYPES_H
#include "../lib/standardTypes.h"


//the following message types are not generated, because they have no parameters
typedef struct M1OtherReady_M1_Message{
	int8_T dummy;
}M1OtherReady_M1_Message;
typedef struct M1Ready_M1_Message{
	int8_T dummy;
}M1Ready_M1_Message;
typedef struct M1AccessGranted_M1_Message{
	int8_T dummy;
}M1AccessGranted_M1_Message;
typedef struct M1AccessDenied_M1_Message{
	int8_T dummy;
}M1AccessDenied_M1_Message;
typedef struct M1CompleteDeny_M1_Message{
	int8_T dummy;
}M1CompleteDeny_M1_Message;

//definition for message type M1LaunchCode
typedef struct M1LaunchCode_M1_Message{
	 int32_T id;
}M1LaunchCode_M1_Message;
#endif /* MESSAGE_TYPES_H */
