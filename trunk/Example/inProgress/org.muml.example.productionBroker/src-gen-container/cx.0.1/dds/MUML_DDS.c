

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

#include "MUML_DDS.h"

/* ========================================================================= */
const char *DDS_MessagessimpleOrder_MessagesTYPENAME = "DDS_MessagessimpleOrder_Messages";

DDS_TypeCode* DDS_MessagessimpleOrder_Messages_get_typecode()
{
    static RTIBool is_initialized = RTI_FALSE;

    static DDS_TypeCode_Member DDS_MessagessimpleOrder_Messages_g_tc_members[3]=
    {

        {
            (char *)"orderID",/* Member name */
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
        }, 
        {
            (char *)"ingredientID",/* Member name */
            {
                1,/* Representation ID */          
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
        }, 
        {
            (char *)"amount",/* Member name */
            {
                2,/* Representation ID */          
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

    static DDS_TypeCode DDS_MessagessimpleOrder_Messages_g_tc =
    {{
            DDS_TK_STRUCT,/* Kind */
            DDS_BOOLEAN_FALSE, /* Ignored */
            -1, /*Ignored*/
            (char *)"DDS_MessagessimpleOrder_Messages", /* Name */
            NULL, /* Ignored */      
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            3, /* Number of members */
            DDS_MessagessimpleOrder_Messages_g_tc_members, /* Members */
            DDS_VM_NONE  /* Ignored */         
        }}; /* Type code for DDS_MessagessimpleOrder_Messages*/

    if (is_initialized) {
        return &DDS_MessagessimpleOrder_Messages_g_tc;
    }

    DDS_MessagessimpleOrder_Messages_g_tc_members[0]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    DDS_MessagessimpleOrder_Messages_g_tc_members[1]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    DDS_MessagessimpleOrder_Messages_g_tc_members[2]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    is_initialized = RTI_TRUE;

    return &DDS_MessagessimpleOrder_Messages_g_tc;
}

RTIBool DDS_MessagessimpleOrder_Messages_initialize(
    DDS_MessagessimpleOrder_Messages* sample) {
    return DDS_MessagessimpleOrder_Messages_initialize_ex(sample,RTI_TRUE,RTI_TRUE);
}

RTIBool DDS_MessagessimpleOrder_Messages_initialize_ex(
    DDS_MessagessimpleOrder_Messages* sample,RTIBool allocatePointers, RTIBool allocateMemory)
{

    struct DDS_TypeAllocationParams_t allocParams =
    DDS_TYPE_ALLOCATION_PARAMS_DEFAULT;

    allocParams.allocate_pointers =  (DDS_Boolean)allocatePointers;
    allocParams.allocate_memory = (DDS_Boolean)allocateMemory;

    return DDS_MessagessimpleOrder_Messages_initialize_w_params(
        sample,&allocParams);

}

RTIBool DDS_MessagessimpleOrder_Messages_initialize_w_params(
    DDS_MessagessimpleOrder_Messages* sample, const struct DDS_TypeAllocationParams_t * allocParams)
{

    if (allocParams) {} /* To avoid warnings */

    if (!RTICdrType_initLong(&sample->orderID)) {
        return RTI_FALSE;
    }     

    if (!RTICdrType_initLong(&sample->ingredientID)) {
        return RTI_FALSE;
    }     

    if (!RTICdrType_initLong(&sample->amount)) {
        return RTI_FALSE;
    }     

    return RTI_TRUE;
}

void DDS_MessagessimpleOrder_Messages_finalize(
    DDS_MessagessimpleOrder_Messages* sample)
{

    DDS_MessagessimpleOrder_Messages_finalize_ex(sample,RTI_TRUE);
}

void DDS_MessagessimpleOrder_Messages_finalize_ex(
    DDS_MessagessimpleOrder_Messages* sample,RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParams =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;

    if (sample==NULL) {
        return;
    } 

    deallocParams.delete_pointers = (DDS_Boolean)deletePointers;

    DDS_MessagessimpleOrder_Messages_finalize_w_params(
        sample,&deallocParams);
}

void DDS_MessagessimpleOrder_Messages_finalize_w_params(
    DDS_MessagessimpleOrder_Messages* sample,const struct DDS_TypeDeallocationParams_t * deallocParams)
{

    if (sample==NULL) {
        return;
    }
    if (deallocParams) {} /* To avoid warnings */

}

void DDS_MessagessimpleOrder_Messages_finalize_optional_members(
    DDS_MessagessimpleOrder_Messages* sample, RTIBool deletePointers)
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

RTIBool DDS_MessagessimpleOrder_Messages_copy(
    DDS_MessagessimpleOrder_Messages* dst,
    const DDS_MessagessimpleOrder_Messages* src)
{

    if (!RTICdrType_copyLong (
        &dst->orderID, &src->orderID)) { 
        return RTI_FALSE;
    }
    if (!RTICdrType_copyLong (
        &dst->ingredientID, &src->ingredientID)) { 
        return RTI_FALSE;
    }
    if (!RTICdrType_copyLong (
        &dst->amount, &src->amount)) { 
        return RTI_FALSE;
    }

    return RTI_TRUE;
}

/**
* <<IMPLEMENTATION>>
*
* Defines:  TSeq, T
*
* Configure and implement 'DDS_MessagessimpleOrder_Messages' sequence class.
*/
#define T DDS_MessagessimpleOrder_Messages
#define TSeq DDS_MessagessimpleOrder_MessagesSeq
#define T_initialize_w_params DDS_MessagessimpleOrder_Messages_initialize_w_params
#define T_finalize_w_params   DDS_MessagessimpleOrder_Messages_finalize_w_params
#define T_copy       DDS_MessagessimpleOrder_Messages_copy

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

/* ========================================================================= */
const char *DDS_MessagesgetOrder_MessagesTYPENAME = "DDS_MessagesgetOrder_Messages";

DDS_TypeCode* DDS_MessagesgetOrder_Messages_get_typecode()
{
    static RTIBool is_initialized = RTI_FALSE;

    static DDS_TypeCode_Member DDS_MessagesgetOrder_Messages_g_tc_members[1]=
    {

        {
            (char *)"psID",/* Member name */
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

    static DDS_TypeCode DDS_MessagesgetOrder_Messages_g_tc =
    {{
            DDS_TK_STRUCT,/* Kind */
            DDS_BOOLEAN_FALSE, /* Ignored */
            -1, /*Ignored*/
            (char *)"DDS_MessagesgetOrder_Messages", /* Name */
            NULL, /* Ignored */      
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            1, /* Number of members */
            DDS_MessagesgetOrder_Messages_g_tc_members, /* Members */
            DDS_VM_NONE  /* Ignored */         
        }}; /* Type code for DDS_MessagesgetOrder_Messages*/

    if (is_initialized) {
        return &DDS_MessagesgetOrder_Messages_g_tc;
    }

    DDS_MessagesgetOrder_Messages_g_tc_members[0]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    is_initialized = RTI_TRUE;

    return &DDS_MessagesgetOrder_Messages_g_tc;
}

RTIBool DDS_MessagesgetOrder_Messages_initialize(
    DDS_MessagesgetOrder_Messages* sample) {
    return DDS_MessagesgetOrder_Messages_initialize_ex(sample,RTI_TRUE,RTI_TRUE);
}

RTIBool DDS_MessagesgetOrder_Messages_initialize_ex(
    DDS_MessagesgetOrder_Messages* sample,RTIBool allocatePointers, RTIBool allocateMemory)
{

    struct DDS_TypeAllocationParams_t allocParams =
    DDS_TYPE_ALLOCATION_PARAMS_DEFAULT;

    allocParams.allocate_pointers =  (DDS_Boolean)allocatePointers;
    allocParams.allocate_memory = (DDS_Boolean)allocateMemory;

    return DDS_MessagesgetOrder_Messages_initialize_w_params(
        sample,&allocParams);

}

RTIBool DDS_MessagesgetOrder_Messages_initialize_w_params(
    DDS_MessagesgetOrder_Messages* sample, const struct DDS_TypeAllocationParams_t * allocParams)
{

    if (allocParams) {} /* To avoid warnings */

    if (!RTICdrType_initLong(&sample->psID)) {
        return RTI_FALSE;
    }     

    return RTI_TRUE;
}

void DDS_MessagesgetOrder_Messages_finalize(
    DDS_MessagesgetOrder_Messages* sample)
{

    DDS_MessagesgetOrder_Messages_finalize_ex(sample,RTI_TRUE);
}

void DDS_MessagesgetOrder_Messages_finalize_ex(
    DDS_MessagesgetOrder_Messages* sample,RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParams =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;

    if (sample==NULL) {
        return;
    } 

    deallocParams.delete_pointers = (DDS_Boolean)deletePointers;

    DDS_MessagesgetOrder_Messages_finalize_w_params(
        sample,&deallocParams);
}

void DDS_MessagesgetOrder_Messages_finalize_w_params(
    DDS_MessagesgetOrder_Messages* sample,const struct DDS_TypeDeallocationParams_t * deallocParams)
{

    if (sample==NULL) {
        return;
    }
    if (deallocParams) {} /* To avoid warnings */

}

void DDS_MessagesgetOrder_Messages_finalize_optional_members(
    DDS_MessagesgetOrder_Messages* sample, RTIBool deletePointers)
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

RTIBool DDS_MessagesgetOrder_Messages_copy(
    DDS_MessagesgetOrder_Messages* dst,
    const DDS_MessagesgetOrder_Messages* src)
{

    if (!RTICdrType_copyLong (
        &dst->psID, &src->psID)) { 
        return RTI_FALSE;
    }

    return RTI_TRUE;
}

/**
* <<IMPLEMENTATION>>
*
* Defines:  TSeq, T
*
* Configure and implement 'DDS_MessagesgetOrder_Messages' sequence class.
*/
#define T DDS_MessagesgetOrder_Messages
#define TSeq DDS_MessagesgetOrder_MessagesSeq
#define T_initialize_w_params DDS_MessagesgetOrder_Messages_initialize_w_params
#define T_finalize_w_params   DDS_MessagesgetOrder_Messages_finalize_w_params
#define T_copy       DDS_MessagesgetOrder_Messages_copy

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

/* ========================================================================= */
const char *DDS_MessagesdoneOrder_MessagesTYPENAME = "DDS_MessagesdoneOrder_Messages";

DDS_TypeCode* DDS_MessagesdoneOrder_Messages_get_typecode()
{
    static RTIBool is_initialized = RTI_FALSE;

    static DDS_TypeCode_Member DDS_MessagesdoneOrder_Messages_g_tc_members[1]=
    {

        {
            (char *)"orderID",/* Member name */
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

    static DDS_TypeCode DDS_MessagesdoneOrder_Messages_g_tc =
    {{
            DDS_TK_STRUCT,/* Kind */
            DDS_BOOLEAN_FALSE, /* Ignored */
            -1, /*Ignored*/
            (char *)"DDS_MessagesdoneOrder_Messages", /* Name */
            NULL, /* Ignored */      
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            1, /* Number of members */
            DDS_MessagesdoneOrder_Messages_g_tc_members, /* Members */
            DDS_VM_NONE  /* Ignored */         
        }}; /* Type code for DDS_MessagesdoneOrder_Messages*/

    if (is_initialized) {
        return &DDS_MessagesdoneOrder_Messages_g_tc;
    }

    DDS_MessagesdoneOrder_Messages_g_tc_members[0]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    is_initialized = RTI_TRUE;

    return &DDS_MessagesdoneOrder_Messages_g_tc;
}

RTIBool DDS_MessagesdoneOrder_Messages_initialize(
    DDS_MessagesdoneOrder_Messages* sample) {
    return DDS_MessagesdoneOrder_Messages_initialize_ex(sample,RTI_TRUE,RTI_TRUE);
}

RTIBool DDS_MessagesdoneOrder_Messages_initialize_ex(
    DDS_MessagesdoneOrder_Messages* sample,RTIBool allocatePointers, RTIBool allocateMemory)
{

    struct DDS_TypeAllocationParams_t allocParams =
    DDS_TYPE_ALLOCATION_PARAMS_DEFAULT;

    allocParams.allocate_pointers =  (DDS_Boolean)allocatePointers;
    allocParams.allocate_memory = (DDS_Boolean)allocateMemory;

    return DDS_MessagesdoneOrder_Messages_initialize_w_params(
        sample,&allocParams);

}

RTIBool DDS_MessagesdoneOrder_Messages_initialize_w_params(
    DDS_MessagesdoneOrder_Messages* sample, const struct DDS_TypeAllocationParams_t * allocParams)
{

    if (allocParams) {} /* To avoid warnings */

    if (!RTICdrType_initLong(&sample->orderID)) {
        return RTI_FALSE;
    }     

    return RTI_TRUE;
}

void DDS_MessagesdoneOrder_Messages_finalize(
    DDS_MessagesdoneOrder_Messages* sample)
{

    DDS_MessagesdoneOrder_Messages_finalize_ex(sample,RTI_TRUE);
}

void DDS_MessagesdoneOrder_Messages_finalize_ex(
    DDS_MessagesdoneOrder_Messages* sample,RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParams =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;

    if (sample==NULL) {
        return;
    } 

    deallocParams.delete_pointers = (DDS_Boolean)deletePointers;

    DDS_MessagesdoneOrder_Messages_finalize_w_params(
        sample,&deallocParams);
}

void DDS_MessagesdoneOrder_Messages_finalize_w_params(
    DDS_MessagesdoneOrder_Messages* sample,const struct DDS_TypeDeallocationParams_t * deallocParams)
{

    if (sample==NULL) {
        return;
    }
    if (deallocParams) {} /* To avoid warnings */

}

void DDS_MessagesdoneOrder_Messages_finalize_optional_members(
    DDS_MessagesdoneOrder_Messages* sample, RTIBool deletePointers)
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

RTIBool DDS_MessagesdoneOrder_Messages_copy(
    DDS_MessagesdoneOrder_Messages* dst,
    const DDS_MessagesdoneOrder_Messages* src)
{

    if (!RTICdrType_copyLong (
        &dst->orderID, &src->orderID)) { 
        return RTI_FALSE;
    }

    return RTI_TRUE;
}

/**
* <<IMPLEMENTATION>>
*
* Defines:  TSeq, T
*
* Configure and implement 'DDS_MessagesdoneOrder_Messages' sequence class.
*/
#define T DDS_MessagesdoneOrder_Messages
#define TSeq DDS_MessagesdoneOrder_MessagesSeq
#define T_initialize_w_params DDS_MessagesdoneOrder_Messages_initialize_w_params
#define T_finalize_w_params   DDS_MessagesdoneOrder_Messages_finalize_w_params
#define T_copy       DDS_MessagesdoneOrder_Messages_copy

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

/* ========================================================================= */
const char *DDS_MessagesnoOrder_MessagesTYPENAME = "DDS_MessagesnoOrder_Messages";

DDS_TypeCode* DDS_MessagesnoOrder_Messages_get_typecode()
{
    static RTIBool is_initialized = RTI_FALSE;

    static DDS_TypeCode_Member DDS_MessagesnoOrder_Messages_g_tc_members[1]=
    {

        {
            (char *)"receiverPsID",/* Member name */
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

    static DDS_TypeCode DDS_MessagesnoOrder_Messages_g_tc =
    {{
            DDS_TK_STRUCT,/* Kind */
            DDS_BOOLEAN_FALSE, /* Ignored */
            -1, /*Ignored*/
            (char *)"DDS_MessagesnoOrder_Messages", /* Name */
            NULL, /* Ignored */      
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            1, /* Number of members */
            DDS_MessagesnoOrder_Messages_g_tc_members, /* Members */
            DDS_VM_NONE  /* Ignored */         
        }}; /* Type code for DDS_MessagesnoOrder_Messages*/

    if (is_initialized) {
        return &DDS_MessagesnoOrder_Messages_g_tc;
    }

    DDS_MessagesnoOrder_Messages_g_tc_members[0]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    is_initialized = RTI_TRUE;

    return &DDS_MessagesnoOrder_Messages_g_tc;
}

RTIBool DDS_MessagesnoOrder_Messages_initialize(
    DDS_MessagesnoOrder_Messages* sample) {
    return DDS_MessagesnoOrder_Messages_initialize_ex(sample,RTI_TRUE,RTI_TRUE);
}

RTIBool DDS_MessagesnoOrder_Messages_initialize_ex(
    DDS_MessagesnoOrder_Messages* sample,RTIBool allocatePointers, RTIBool allocateMemory)
{

    struct DDS_TypeAllocationParams_t allocParams =
    DDS_TYPE_ALLOCATION_PARAMS_DEFAULT;

    allocParams.allocate_pointers =  (DDS_Boolean)allocatePointers;
    allocParams.allocate_memory = (DDS_Boolean)allocateMemory;

    return DDS_MessagesnoOrder_Messages_initialize_w_params(
        sample,&allocParams);

}

RTIBool DDS_MessagesnoOrder_Messages_initialize_w_params(
    DDS_MessagesnoOrder_Messages* sample, const struct DDS_TypeAllocationParams_t * allocParams)
{

    if (allocParams) {} /* To avoid warnings */

    if (!RTICdrType_initLong(&sample->receiverPsID)) {
        return RTI_FALSE;
    }     

    return RTI_TRUE;
}

void DDS_MessagesnoOrder_Messages_finalize(
    DDS_MessagesnoOrder_Messages* sample)
{

    DDS_MessagesnoOrder_Messages_finalize_ex(sample,RTI_TRUE);
}

void DDS_MessagesnoOrder_Messages_finalize_ex(
    DDS_MessagesnoOrder_Messages* sample,RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParams =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;

    if (sample==NULL) {
        return;
    } 

    deallocParams.delete_pointers = (DDS_Boolean)deletePointers;

    DDS_MessagesnoOrder_Messages_finalize_w_params(
        sample,&deallocParams);
}

void DDS_MessagesnoOrder_Messages_finalize_w_params(
    DDS_MessagesnoOrder_Messages* sample,const struct DDS_TypeDeallocationParams_t * deallocParams)
{

    if (sample==NULL) {
        return;
    }
    if (deallocParams) {} /* To avoid warnings */

}

void DDS_MessagesnoOrder_Messages_finalize_optional_members(
    DDS_MessagesnoOrder_Messages* sample, RTIBool deletePointers)
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

RTIBool DDS_MessagesnoOrder_Messages_copy(
    DDS_MessagesnoOrder_Messages* dst,
    const DDS_MessagesnoOrder_Messages* src)
{

    if (!RTICdrType_copyLong (
        &dst->receiverPsID, &src->receiverPsID)) { 
        return RTI_FALSE;
    }

    return RTI_TRUE;
}

/**
* <<IMPLEMENTATION>>
*
* Defines:  TSeq, T
*
* Configure and implement 'DDS_MessagesnoOrder_Messages' sequence class.
*/
#define T DDS_MessagesnoOrder_Messages
#define TSeq DDS_MessagesnoOrder_MessagesSeq
#define T_initialize_w_params DDS_MessagesnoOrder_Messages_initialize_w_params
#define T_finalize_w_params   DDS_MessagesnoOrder_Messages_finalize_w_params
#define T_copy       DDS_MessagesnoOrder_Messages_copy

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

/* ========================================================================= */
const char *DDS_MessagesorderForPS_MessagesTYPENAME = "DDS_MessagesorderForPS_Messages";

DDS_TypeCode* DDS_MessagesorderForPS_Messages_get_typecode()
{
    static RTIBool is_initialized = RTI_FALSE;

    static DDS_TypeCode_Member DDS_MessagesorderForPS_Messages_g_tc_members[4]=
    {

        {
            (char *)"receiverPsID",/* Member name */
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
        }, 
        {
            (char *)"orderID",/* Member name */
            {
                1,/* Representation ID */          
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
        }, 
        {
            (char *)"incredientID",/* Member name */
            {
                2,/* Representation ID */          
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
        }, 
        {
            (char *)"amount",/* Member name */
            {
                3,/* Representation ID */          
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

    static DDS_TypeCode DDS_MessagesorderForPS_Messages_g_tc =
    {{
            DDS_TK_STRUCT,/* Kind */
            DDS_BOOLEAN_FALSE, /* Ignored */
            -1, /*Ignored*/
            (char *)"DDS_MessagesorderForPS_Messages", /* Name */
            NULL, /* Ignored */      
            0, /* Ignored */
            0, /* Ignored */
            NULL, /* Ignored */
            4, /* Number of members */
            DDS_MessagesorderForPS_Messages_g_tc_members, /* Members */
            DDS_VM_NONE  /* Ignored */         
        }}; /* Type code for DDS_MessagesorderForPS_Messages*/

    if (is_initialized) {
        return &DDS_MessagesorderForPS_Messages_g_tc;
    }

    DDS_MessagesorderForPS_Messages_g_tc_members[0]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    DDS_MessagesorderForPS_Messages_g_tc_members[1]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    DDS_MessagesorderForPS_Messages_g_tc_members[2]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    DDS_MessagesorderForPS_Messages_g_tc_members[3]._representation._typeCode = (RTICdrTypeCode *)&DDS_g_tc_long;

    is_initialized = RTI_TRUE;

    return &DDS_MessagesorderForPS_Messages_g_tc;
}

RTIBool DDS_MessagesorderForPS_Messages_initialize(
    DDS_MessagesorderForPS_Messages* sample) {
    return DDS_MessagesorderForPS_Messages_initialize_ex(sample,RTI_TRUE,RTI_TRUE);
}

RTIBool DDS_MessagesorderForPS_Messages_initialize_ex(
    DDS_MessagesorderForPS_Messages* sample,RTIBool allocatePointers, RTIBool allocateMemory)
{

    struct DDS_TypeAllocationParams_t allocParams =
    DDS_TYPE_ALLOCATION_PARAMS_DEFAULT;

    allocParams.allocate_pointers =  (DDS_Boolean)allocatePointers;
    allocParams.allocate_memory = (DDS_Boolean)allocateMemory;

    return DDS_MessagesorderForPS_Messages_initialize_w_params(
        sample,&allocParams);

}

RTIBool DDS_MessagesorderForPS_Messages_initialize_w_params(
    DDS_MessagesorderForPS_Messages* sample, const struct DDS_TypeAllocationParams_t * allocParams)
{

    if (allocParams) {} /* To avoid warnings */

    if (!RTICdrType_initLong(&sample->receiverPsID)) {
        return RTI_FALSE;
    }     

    if (!RTICdrType_initLong(&sample->orderID)) {
        return RTI_FALSE;
    }     

    if (!RTICdrType_initLong(&sample->incredientID)) {
        return RTI_FALSE;
    }     

    if (!RTICdrType_initLong(&sample->amount)) {
        return RTI_FALSE;
    }     

    return RTI_TRUE;
}

void DDS_MessagesorderForPS_Messages_finalize(
    DDS_MessagesorderForPS_Messages* sample)
{

    DDS_MessagesorderForPS_Messages_finalize_ex(sample,RTI_TRUE);
}

void DDS_MessagesorderForPS_Messages_finalize_ex(
    DDS_MessagesorderForPS_Messages* sample,RTIBool deletePointers)
{
    struct DDS_TypeDeallocationParams_t deallocParams =
    DDS_TYPE_DEALLOCATION_PARAMS_DEFAULT;

    if (sample==NULL) {
        return;
    } 

    deallocParams.delete_pointers = (DDS_Boolean)deletePointers;

    DDS_MessagesorderForPS_Messages_finalize_w_params(
        sample,&deallocParams);
}

void DDS_MessagesorderForPS_Messages_finalize_w_params(
    DDS_MessagesorderForPS_Messages* sample,const struct DDS_TypeDeallocationParams_t * deallocParams)
{

    if (sample==NULL) {
        return;
    }
    if (deallocParams) {} /* To avoid warnings */

}

void DDS_MessagesorderForPS_Messages_finalize_optional_members(
    DDS_MessagesorderForPS_Messages* sample, RTIBool deletePointers)
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

RTIBool DDS_MessagesorderForPS_Messages_copy(
    DDS_MessagesorderForPS_Messages* dst,
    const DDS_MessagesorderForPS_Messages* src)
{

    if (!RTICdrType_copyLong (
        &dst->receiverPsID, &src->receiverPsID)) { 
        return RTI_FALSE;
    }
    if (!RTICdrType_copyLong (
        &dst->orderID, &src->orderID)) { 
        return RTI_FALSE;
    }
    if (!RTICdrType_copyLong (
        &dst->incredientID, &src->incredientID)) { 
        return RTI_FALSE;
    }
    if (!RTICdrType_copyLong (
        &dst->amount, &src->amount)) { 
        return RTI_FALSE;
    }

    return RTI_TRUE;
}

/**
* <<IMPLEMENTATION>>
*
* Defines:  TSeq, T
*
* Configure and implement 'DDS_MessagesorderForPS_Messages' sequence class.
*/
#define T DDS_MessagesorderForPS_Messages
#define TSeq DDS_MessagesorderForPS_MessagesSeq
#define T_initialize_w_params DDS_MessagesorderForPS_Messages_initialize_w_params
#define T_finalize_w_params   DDS_MessagesorderForPS_Messages_finalize_w_params
#define T_copy       DDS_MessagesorderForPS_Messages_copy

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

