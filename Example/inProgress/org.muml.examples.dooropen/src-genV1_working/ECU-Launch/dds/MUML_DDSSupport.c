
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#include "../../../src-genV1_working/ECU-Launch/dds/MUML_DDSSupport.h"

#include "../../../src-genV1_working/ECU-Launch/dds/MUML_DDSPlugin.h"

/* ========================================================================= */
/**
<<IMPLEMENTATION>>

Defines:   TData,
TDataWriter,
TDataReader,
TTypeSupport

Configure and implement 'DDS_M1launchCode_M1' support classes.

Note: Only the #defined classes get defined
*/

/* ----------------------------------------------------------------- */
/* DDSDataWriter
*/

/**
<<IMPLEMENTATION >>

Defines:   TDataWriter, TData
*/

/* Requires */
#define TTYPENAME   DDS_M1launchCode_M1TYPENAME

/* Defines */
#define TDataWriter DDS_M1launchCode_M1DataWriter
#define TData       DDS_M1launchCode_M1

#include "dds_c/generic/dds_c_data_TDataWriter.gen"

#undef TDataWriter
#undef TData

#undef TTYPENAME

/* ----------------------------------------------------------------- */
/* DDSDataReader
*/

/**
<<IMPLEMENTATION >>

Defines:   TDataReader, TDataSeq, TData
*/

/* Requires */
#define TTYPENAME   DDS_M1launchCode_M1TYPENAME

/* Defines */
#define TDataReader DDS_M1launchCode_M1DataReader
#define TDataSeq    DDS_M1launchCode_M1Seq
#define TData       DDS_M1launchCode_M1

#include "dds_c/generic/dds_c_data_TDataReader.gen"

#undef TDataReader
#undef TDataSeq
#undef TData

#undef TTYPENAME

/* ----------------------------------------------------------------- */
/* TypeSupport

<<IMPLEMENTATION >>

Requires:  TTYPENAME,
TPlugin_new
TPlugin_delete
Defines:   TTypeSupport, TData, TDataReader, TDataWriter
*/

/* Requires */
#define TTYPENAME    DDS_M1launchCode_M1TYPENAME
#define TPlugin_new  DDS_M1launchCode_M1Plugin_new
#define TPlugin_delete  DDS_M1launchCode_M1Plugin_delete

/* Defines */
#define TTypeSupport DDS_M1launchCode_M1TypeSupport
#define TData        DDS_M1launchCode_M1
#define TDataReader  DDS_M1launchCode_M1DataReader
#define TDataWriter  DDS_M1launchCode_M1DataWriter
#define TGENERATE_SER_CODE
#define TGENERATE_TYPECODE

#include "dds_c/generic/dds_c_data_TTypeSupport.gen"

#undef TTypeSupport
#undef TData
#undef TDataReader
#undef TDataWriter
#undef TGENERATE_TYPECODE
#undef TGENERATE_SER_CODE
#undef TTYPENAME
#undef TPlugin_new
#undef TPlugin_delete

