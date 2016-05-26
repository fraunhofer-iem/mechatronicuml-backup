

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#ifndef NDDS_STANDALONE_TYPE
#ifndef ndds_c_h
#include "ndds/ndds_c.h"
#endif

#ifndef cdr_type_h
#include "cdr/cdr_type.h"
#endif    

#ifndef osapi_heap_h
#include "osapi/osapi_heap.h" 
#endif
#else
#include "ndds_standalone_type.h"
#endif

#include "../../../src-genV1_working/ECU-Launch/dds/MUML_DDS.h"

/* ========================================================================= */
const char *DDS_M1launchCode_M1TYPENAME = "DDS_M1launchCode_M1";

DDS_TypeCode* DDS_M1launchCode_M1_get_typecode()
{
    static RTIBool is_initialized = RTI_FALSE;

    static DDS_TypeCode_Member DDS_M1launchCode_M1_g_tc_members[1]=
    {

        {
            (char *)"id",/* Member name */
            {
                0,/* Representation ID */          
                DDS_BOOLEAN_FALSE,/* Is a pointer? */
                -1, /* Bitfield bits */
                NULL/* Member type code is assigned later */
            },
            0, /* Ignored */
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            RTI_CDR_REQUIRED_MEMBER, /* Is a key? */
            DDS_PUBLIC_MEMBER,/* Member visibility */
            1,
            NULL/* Ignored */
        }
    };

    static DDS_TypeCode DDS_M1launchCode_M1_g_tc =
    {{
            DDS_TK_STRUCT,/* Kind */
            DDS_BOOLEAN_FALSE, /* Ignored */
            -1, /*Ignored*/
            (char *)"DDS_M1launchCode_M1", /* Name */
            NULL, /* Ignored */      
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            1, /* Number of members */
            DDS_M1launchCode_M1_g_tc_members, /* Members */
            DDS_VM_NONE  /* Ignored */         
        }}; /* Type code for DDS_M1launchCode_M1*/

    if (is_initialized) {
        return &DDS_M1launchCode_M1_g_tc;
    }

    DDS_M1launchCode_M1_g_tc_members[0]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    is_initialized = RTI_TRUE;

    return &DDS_M1launchCode_M1_g_tc;
}

RTIBool DDS_M1launchCode_M1_initialize(
    DDS_M1launchCode_M1* sample) {
    return DDS_M1launchCode_M1_initialize_ex(sample,RTI_TRUE,RTI_TRUE);
}

RTIBool DDS_M1launchCode_M1_initialize_ex(
    DDS_M1launchCode_M1* sample,RTIBool allocatePointers, RTIBool allocateMemory)
{

    struct DDS_TypeAllocationParams_t allocParams =
    DDS_TYPE_ALLOCATION_PARAMS_DEFAULT;

    allocParams.allocate_pointers =  (DDS_Boolean)allocatePointers;
    allocParams.allocate_memory = (DDS_Boolean)allocateMemory;

    return DDS_M1launchCode_M1_initialize_w_params(
        sample,&allocParams);

}

RTIBool DDS_M1launchCode_M1_initialize_w_params(
    DDS_M1launchCode_M1* sample, const struct DDS_TypeAllocationParams_t * allocParams)
{

    if (allocParams) {} /* To avoid warnings */

    if (!RTICdrType_initLong(&sample->id)) {
        return RTI_FALSE;
    }     

    return RTI_TRUE;
}

void DDS_M1launchCode_M1_finalize(
    DDS_M1launchCode_M1* sample)
{

    DDS_M1launchCode_M1_finalize_ex(sample,RTI_TRUE);
}

void DDS_M1launchCode_M1_finalize_ex(
    DDS_M1launchCode_M1* sample,RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParams =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;

    if (sample==NULL) {
        return;
    } 

    deallocParams.delete_pointers = (DDS_Boolean)deletePointers;

    DDS_M1launchCode_M1_finalize_w_params(
        sample,&deallocParams);
}

void DDS_M1launchCode_M1_finalize_w_params(
    DDS_M1launchCode_M1* sample,const struct DDS_TypeDeallocationParams_t * deallocParams)
{

    if (sample==NULL) {
        return;
    }
    if (deallocParams) {} /* To avoid warnings */

}

void DDS_M1launchCode_M1_finalize_optional_members(
    DDS_M1launchCode_M1* sample, RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParamsTmp =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;
    struct DDS_TypeDeallocationParams_t * deallocParams =
    &deallocParamsTmp;

    if (sample==NULL) {
        return;
    } 
    if (deallocParams) {} /* To avoid warnings */

    deallocParamsTmp.delete_pointers = (DDS_Boolean)deletePointers;
    deallocParamsTmp.delete_optional_members = DDS_BOOLEAN_TRUE;

}

RTIBool DDS_M1launchCode_M1_copy(
    DDS_M1launchCode_M1* dst,
    const DDS_M1launchCode_M1* src)
{

    if (!RTICdrType_copyLong (
        &dst->id, &src->id)) { 
        return RTI_FALSE;
    }

    return RTI_TRUE;
}

/**
* <<IMPLEMENTATION>>
*
* Defines:  TSeq, T
*
* Configure and implement 'DDS_M1launchCode_M1' sequence class.
*/
#define T DDS_M1launchCode_M1
#define TSeq DDS_M1launchCode_M1Seq
#define T_initialize_w_params DDS_M1launchCode_M1_initialize_w_params
#define T_finalize_w_params   DDS_M1launchCode_M1_finalize_w_params
#define T_copy       DDS_M1launchCode_M1_copy

#ifndef NDDS_STANDALONE_TYPE
#include "dds_c/generic/dds_c_sequence_TSeq.gen"
#else
#include "dds_c_sequence_TSeq.gen"
#endif

#undef T_copy
#undef T_finalize_w_params
#undef T_initialize_w_params
#undef TSeq
#undef T

