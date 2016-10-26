

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#ifndef MUML_DDS_1362042836_h
#define MUML_DDS_1362042836_h

#ifndef NDDS_STANDALONE_TYPE
#ifndef ndds_c_h
#include "ndds/ndds_c.h"
#endif
#else
#include "ndds_standalone_type.h"
#endif

struct DDS_MAIN_LED_VOLTAGE;

extern const char *DDS_MAIN_LED_VOLTAGETYPENAME;

typedef struct DDS_MAIN_LED_VOLTAGE {

    DDS_Char   value ;

} DDS_MAIN_LED_VOLTAGE ;
#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, start exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif

NDDSUSERDllExport DDS_TypeCode* DDS_MAIN_LED_VOLTAGE_get_typecode(void); /* Type code */

DDS_SEQUENCE(DDS_MAIN_LED_VOLTAGESeq, DDS_MAIN_LED_VOLTAGE);                                        

NDDSUSERDllExport
RTIBool DDS_MAIN_LED_VOLTAGE_initialize(
    DDS_MAIN_LED_VOLTAGE* self);

NDDSUSERDllExport
RTIBool DDS_MAIN_LED_VOLTAGE_initialize_ex(
    DDS_MAIN_LED_VOLTAGE* self,RTIBool allocatePointers,RTIBool allocateMemory);

NDDSUSERDllExport
RTIBool DDS_MAIN_LED_VOLTAGE_initialize_w_params(
    DDS_MAIN_LED_VOLTAGE* self,
    const struct DDS_TypeAllocationParams_t * allocParams);        

NDDSUSERDllExport
void DDS_MAIN_LED_VOLTAGE_finalize(
    DDS_MAIN_LED_VOLTAGE* self);

NDDSUSERDllExport
void DDS_MAIN_LED_VOLTAGE_finalize_ex(
    DDS_MAIN_LED_VOLTAGE* self,RTIBool deletePointers);

NDDSUSERDllExport
void DDS_MAIN_LED_VOLTAGE_finalize_w_params(
    DDS_MAIN_LED_VOLTAGE* self,
    const struct DDS_TypeDeallocationParams_t * deallocParams);

NDDSUSERDllExport
void DDS_MAIN_LED_VOLTAGE_finalize_optional_members(
    DDS_MAIN_LED_VOLTAGE* self, RTIBool deletePointers);  

NDDSUSERDllExport
RTIBool DDS_MAIN_LED_VOLTAGE_copy(
    DDS_MAIN_LED_VOLTAGE* dst,
    const DDS_MAIN_LED_VOLTAGE* src);

#if (defined(RTI_WIN32) || defined (RTI_WINCE)) && defined(NDDS_USER_DLL_EXPORT)
/* If the code is building on Windows, stop exporting symbols.
*/
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif

#endif /* MUML_DDS */

