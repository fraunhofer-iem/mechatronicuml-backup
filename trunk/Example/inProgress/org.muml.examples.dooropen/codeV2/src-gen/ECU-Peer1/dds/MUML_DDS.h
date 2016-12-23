

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#ifndef MUML_DDS_1362043476_h
#define MUML_DDS_1362043476_h

#ifndef NDDS_STANDALONE_TYPE
#ifndef ndds_c_h
#include "ndds/ndds_c.h"
#endif
#else
#include "ndds_standalone_type.h"
#endif

struct DDS_M1completeDeny_M1;
struct DDS_M1accessGranted_M1;
struct DDS_M1launchCode_M1;
struct DDS_M1ready_M1;
struct DDS_M1accessDenied_M1;
struct DDS_M1otherReady_M1;

extern const char *DDS_M1completeDeny_M1TYPENAME;

typedef struct DDS_M1completeDeny_M1 {

    DDS_Char   dummy ;

} DDS_M1completeDeny_M1 ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_M1completeDeny_M1_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_M1completeDeny_M1Seq, DDS_M1completeDeny_M1);                                        

NDDSUSERDllExport
RTIBool DDS_M1completeDeny_M1_initialize(
    DDS_M1completeDeny_M1* self);

NDDSUSERDllExport
RTIBool DDS_M1completeDeny_M1_initialize_ex(
    DDS_M1completeDeny_M1* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_M1completeDeny_M1_initialize_w_params(
    DDS_M1completeDeny_M1* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_M1completeDeny_M1_finalize(
    DDS_M1completeDeny_M1* self);

NDDSUSERDllExport
void DDS_M1completeDeny_M1_finalize_ex(
    DDS_M1completeDeny_M1* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_M1completeDeny_M1_finalize_w_params(
    DDS_M1completeDeny_M1* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_M1completeDeny_M1_finalize_optional_members(
    DDS_M1completeDeny_M1* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_M1completeDeny_M1_copy(
    DDS_M1completeDeny_M1* dst,
    const DDS_M1completeDeny_M1* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_M1accessGranted_M1TYPENAME;

typedef struct DDS_M1accessGranted_M1 {

    DDS_Char   dummy ;

} DDS_M1accessGranted_M1 ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_M1accessGranted_M1_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_M1accessGranted_M1Seq, DDS_M1accessGranted_M1);                                        

NDDSUSERDllExport
RTIBool DDS_M1accessGranted_M1_initialize(
    DDS_M1accessGranted_M1* self);

NDDSUSERDllExport
RTIBool DDS_M1accessGranted_M1_initialize_ex(
    DDS_M1accessGranted_M1* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_M1accessGranted_M1_initialize_w_params(
    DDS_M1accessGranted_M1* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_M1accessGranted_M1_finalize(
    DDS_M1accessGranted_M1* self);

NDDSUSERDllExport
void DDS_M1accessGranted_M1_finalize_ex(
    DDS_M1accessGranted_M1* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_M1accessGranted_M1_finalize_w_params(
    DDS_M1accessGranted_M1* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_M1accessGranted_M1_finalize_optional_members(
    DDS_M1accessGranted_M1* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_M1accessGranted_M1_copy(
    DDS_M1accessGranted_M1* dst,
    const DDS_M1accessGranted_M1* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_M1launchCode_M1TYPENAME;

typedef struct DDS_M1launchCode_M1 {

    DDS_Long   id ;

} DDS_M1launchCode_M1 ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_M1launchCode_M1_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_M1launchCode_M1Seq, DDS_M1launchCode_M1);                                        

NDDSUSERDllExport
RTIBool DDS_M1launchCode_M1_initialize(
    DDS_M1launchCode_M1* self);

NDDSUSERDllExport
RTIBool DDS_M1launchCode_M1_initialize_ex(
    DDS_M1launchCode_M1* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_M1launchCode_M1_initialize_w_params(
    DDS_M1launchCode_M1* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_M1launchCode_M1_finalize(
    DDS_M1launchCode_M1* self);

NDDSUSERDllExport
void DDS_M1launchCode_M1_finalize_ex(
    DDS_M1launchCode_M1* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_M1launchCode_M1_finalize_w_params(
    DDS_M1launchCode_M1* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_M1launchCode_M1_finalize_optional_members(
    DDS_M1launchCode_M1* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_M1launchCode_M1_copy(
    DDS_M1launchCode_M1* dst,
    const DDS_M1launchCode_M1* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_M1ready_M1TYPENAME;

typedef struct DDS_M1ready_M1 {

    DDS_Char   dummy ;

} DDS_M1ready_M1 ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_M1ready_M1_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_M1ready_M1Seq, DDS_M1ready_M1);                                        

NDDSUSERDllExport
RTIBool DDS_M1ready_M1_initialize(
    DDS_M1ready_M1* self);

NDDSUSERDllExport
RTIBool DDS_M1ready_M1_initialize_ex(
    DDS_M1ready_M1* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_M1ready_M1_initialize_w_params(
    DDS_M1ready_M1* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_M1ready_M1_finalize(
    DDS_M1ready_M1* self);

NDDSUSERDllExport
void DDS_M1ready_M1_finalize_ex(
    DDS_M1ready_M1* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_M1ready_M1_finalize_w_params(
    DDS_M1ready_M1* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_M1ready_M1_finalize_optional_members(
    DDS_M1ready_M1* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_M1ready_M1_copy(
    DDS_M1ready_M1* dst,
    const DDS_M1ready_M1* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_M1accessDenied_M1TYPENAME;

typedef struct DDS_M1accessDenied_M1 {

    DDS_Char   dummy ;

} DDS_M1accessDenied_M1 ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_M1accessDenied_M1_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_M1accessDenied_M1Seq, DDS_M1accessDenied_M1);                                        

NDDSUSERDllExport
RTIBool DDS_M1accessDenied_M1_initialize(
    DDS_M1accessDenied_M1* self);

NDDSUSERDllExport
RTIBool DDS_M1accessDenied_M1_initialize_ex(
    DDS_M1accessDenied_M1* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_M1accessDenied_M1_initialize_w_params(
    DDS_M1accessDenied_M1* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_M1accessDenied_M1_finalize(
    DDS_M1accessDenied_M1* self);

NDDSUSERDllExport
void DDS_M1accessDenied_M1_finalize_ex(
    DDS_M1accessDenied_M1* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_M1accessDenied_M1_finalize_w_params(
    DDS_M1accessDenied_M1* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_M1accessDenied_M1_finalize_optional_members(
    DDS_M1accessDenied_M1* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_M1accessDenied_M1_copy(
    DDS_M1accessDenied_M1* dst,
    const DDS_M1accessDenied_M1* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

extern const char *DDS_M1otherReady_M1TYPENAME;

typedef struct DDS_M1otherReady_M1 {

    DDS_Char   dummy ;

} DDS_M1otherReady_M1 ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_M1otherReady_M1_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_M1otherReady_M1Seq, DDS_M1otherReady_M1);                                        

NDDSUSERDllExport
RTIBool DDS_M1otherReady_M1_initialize(
    DDS_M1otherReady_M1* self);

NDDSUSERDllExport
RTIBool DDS_M1otherReady_M1_initialize_ex(
    DDS_M1otherReady_M1* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_M1otherReady_M1_initialize_w_params(
    DDS_M1otherReady_M1* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_M1otherReady_M1_finalize(
    DDS_M1otherReady_M1* self);

NDDSUSERDllExport
void DDS_M1otherReady_M1_finalize_ex(
    DDS_M1otherReady_M1* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_M1otherReady_M1_finalize_w_params(
    DDS_M1otherReady_M1* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_M1otherReady_M1_finalize_optional_members(
    DDS_M1otherReady_M1* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_M1otherReady_M1_copy(
    DDS_M1otherReady_M1* dst,
    const DDS_M1otherReady_M1* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

#endif /* MUML_DDS */

