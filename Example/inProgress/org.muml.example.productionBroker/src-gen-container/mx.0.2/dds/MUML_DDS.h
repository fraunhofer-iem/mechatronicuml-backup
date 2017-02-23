

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#ifndef MUML_DDS_1362043625_h
#define MUML_DDS_1362043625_h

#ifndef NDDS_STANDALONE_TYPE
#ifndef ndds_c_h
#include "ndds/ndds_c.h"
#endif
#else
#include "ndds_standalone_type.h"
#endif

struct DDS_MessagessimpleOrder_Messages;
struct DDS_MessagesnoOrder_Messages;
struct DDS_MessagesgetOrder_Messages;
struct DDS_MessagesdoneOrder_Messages;
struct DDS_MessagesorderForPS_Messages;

extern const char *DDS_MessagessimpleOrder_MessagesTYPENAME;

typedef struct DDS_MessagessimpleOrder_Messages {

    DDS_Long   orderID ;
    DDS_Long   ingredientID ;
    DDS_Long   amount ;

} DDS_MessagessimpleOrder_Messages ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_MessagessimpleOrder_Messages_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_MessagessimpleOrder_MessagesSeq, DDS_MessagessimpleOrder_Messages);                                        

NDDSUSERDllExport
RTIBool DDS_MessagessimpleOrder_Messages_initialize(
    DDS_MessagessimpleOrder_Messages* self);

NDDSUSERDllExport
RTIBool DDS_MessagessimpleOrder_Messages_initialize_ex(
    DDS_MessagessimpleOrder_Messages* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_MessagessimpleOrder_Messages_initialize_w_params(
    DDS_MessagessimpleOrder_Messages* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_MessagessimpleOrder_Messages_finalize(
    DDS_MessagessimpleOrder_Messages* self);

NDDSUSERDllExport
void DDS_MessagessimpleOrder_Messages_finalize_ex(
    DDS_MessagessimpleOrder_Messages* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_MessagessimpleOrder_Messages_finalize_w_params(
    DDS_MessagessimpleOrder_Messages* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_MessagessimpleOrder_Messages_finalize_optional_members(
    DDS_MessagessimpleOrder_Messages* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_MessagessimpleOrder_Messages_copy(
    DDS_MessagessimpleOrder_Messages* dst,
    const DDS_MessagessimpleOrder_Messages* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_MessagesnoOrder_MessagesTYPENAME;

typedef struct DDS_MessagesnoOrder_Messages {

    DDS_Long   receiverPsID ;

} DDS_MessagesnoOrder_Messages ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_MessagesnoOrder_Messages_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_MessagesnoOrder_MessagesSeq, DDS_MessagesnoOrder_Messages);                                        

NDDSUSERDllExport
RTIBool DDS_MessagesnoOrder_Messages_initialize(
    DDS_MessagesnoOrder_Messages* self);

NDDSUSERDllExport
RTIBool DDS_MessagesnoOrder_Messages_initialize_ex(
    DDS_MessagesnoOrder_Messages* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_MessagesnoOrder_Messages_initialize_w_params(
    DDS_MessagesnoOrder_Messages* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_MessagesnoOrder_Messages_finalize(
    DDS_MessagesnoOrder_Messages* self);

NDDSUSERDllExport
void DDS_MessagesnoOrder_Messages_finalize_ex(
    DDS_MessagesnoOrder_Messages* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_MessagesnoOrder_Messages_finalize_w_params(
    DDS_MessagesnoOrder_Messages* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_MessagesnoOrder_Messages_finalize_optional_members(
    DDS_MessagesnoOrder_Messages* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_MessagesnoOrder_Messages_copy(
    DDS_MessagesnoOrder_Messages* dst,
    const DDS_MessagesnoOrder_Messages* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_MessagesgetOrder_MessagesTYPENAME;

typedef struct DDS_MessagesgetOrder_Messages {

    DDS_Long   psID ;

} DDS_MessagesgetOrder_Messages ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_MessagesgetOrder_Messages_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_MessagesgetOrder_MessagesSeq, DDS_MessagesgetOrder_Messages);                                        

NDDSUSERDllExport
RTIBool DDS_MessagesgetOrder_Messages_initialize(
    DDS_MessagesgetOrder_Messages* self);

NDDSUSERDllExport
RTIBool DDS_MessagesgetOrder_Messages_initialize_ex(
    DDS_MessagesgetOrder_Messages* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_MessagesgetOrder_Messages_initialize_w_params(
    DDS_MessagesgetOrder_Messages* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_MessagesgetOrder_Messages_finalize(
    DDS_MessagesgetOrder_Messages* self);

NDDSUSERDllExport
void DDS_MessagesgetOrder_Messages_finalize_ex(
    DDS_MessagesgetOrder_Messages* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_MessagesgetOrder_Messages_finalize_w_params(
    DDS_MessagesgetOrder_Messages* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_MessagesgetOrder_Messages_finalize_optional_members(
    DDS_MessagesgetOrder_Messages* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_MessagesgetOrder_Messages_copy(
    DDS_MessagesgetOrder_Messages* dst,
    const DDS_MessagesgetOrder_Messages* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_MessagesdoneOrder_MessagesTYPENAME;

typedef struct DDS_MessagesdoneOrder_Messages {

    DDS_Long   orderID ;

} DDS_MessagesdoneOrder_Messages ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_MessagesdoneOrder_Messages_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_MessagesdoneOrder_MessagesSeq, DDS_MessagesdoneOrder_Messages);                                        

NDDSUSERDllExport
RTIBool DDS_MessagesdoneOrder_Messages_initialize(
    DDS_MessagesdoneOrder_Messages* self);

NDDSUSERDllExport
RTIBool DDS_MessagesdoneOrder_Messages_initialize_ex(
    DDS_MessagesdoneOrder_Messages* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_MessagesdoneOrder_Messages_initialize_w_params(
    DDS_MessagesdoneOrder_Messages* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_MessagesdoneOrder_Messages_finalize(
    DDS_MessagesdoneOrder_Messages* self);

NDDSUSERDllExport
void DDS_MessagesdoneOrder_Messages_finalize_ex(
    DDS_MessagesdoneOrder_Messages* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_MessagesdoneOrder_Messages_finalize_w_params(
    DDS_MessagesdoneOrder_Messages* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_MessagesdoneOrder_Messages_finalize_optional_members(
    DDS_MessagesdoneOrder_Messages* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_MessagesdoneOrder_Messages_copy(
    DDS_MessagesdoneOrder_Messages* dst,
    const DDS_MessagesdoneOrder_Messages* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_MessagesorderForPS_MessagesTYPENAME;

typedef struct DDS_MessagesorderForPS_Messages {

    DDS_Long   receiverPsID ;
    DDS_Long   orderID ;
    DDS_Long   ingredientID ;
    DDS_Long   amount ;

} DDS_MessagesorderForPS_Messages ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_MessagesorderForPS_Messages_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_MessagesorderForPS_MessagesSeq, DDS_MessagesorderForPS_Messages);                                        

NDDSUSERDllExport
RTIBool DDS_MessagesorderForPS_Messages_initialize(
    DDS_MessagesorderForPS_Messages* self);

NDDSUSERDllExport
RTIBool DDS_MessagesorderForPS_Messages_initialize_ex(
    DDS_MessagesorderForPS_Messages* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_MessagesorderForPS_Messages_initialize_w_params(
    DDS_MessagesorderForPS_Messages* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_MessagesorderForPS_Messages_finalize(
    DDS_MessagesorderForPS_Messages* self);

NDDSUSERDllExport
void DDS_MessagesorderForPS_Messages_finalize_ex(
    DDS_MessagesorderForPS_Messages* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_MessagesorderForPS_Messages_finalize_w_params(
    DDS_MessagesorderForPS_Messages* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_MessagesorderForPS_Messages_finalize_optional_members(
    DDS_MessagesorderForPS_Messages* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_MessagesorderForPS_Messages_copy(
    DDS_MessagesorderForPS_Messages* dst,
    const DDS_MessagesorderForPS_Messages* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

#endif /* MUML_DDS */

