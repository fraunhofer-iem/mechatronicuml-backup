
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from MUML_DDS.idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

#include "MUML_DDSSupport.h"
#include "MUML_DDSPlugin.h"

/* ========================================================================= */
/**
<<IMPLEMENTATION>>

Defines:   TData,
TDataWriter,
TDataReader,
TTypeSupport

Configure and implement 'DDS_MAIN_LED_VOLTAGE' support classes.

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
#define TTYPENAME   DDS_MAIN_LED_VOLTAGETYPENAME

/* Defines */
#define TDataWriter DDS_MAIN_LED_VOLTAGEDataWriter
#define TData       DDS_MAIN_LED_VOLTAGE

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
#define TTYPENAME   DDS_MAIN_LED_VOLTAGETYPENAME

/* Defines */
#define TDataReader DDS_MAIN_LED_VOLTAGEDataReader
#define TDataSeq    DDS_MAIN_LED_VOLTAGESeq
#define TData       DDS_MAIN_LED_VOLTAGE

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
#define TTYPENAME    DDS_MAIN_LED_VOLTAGETYPENAME
#define TPlugin_new  DDS_MAIN_LED_VOLTAGEPlugin_new
#define TPlugin_delete  DDS_MAIN_LED_VOLTAGEPlugin_delete

/* Defines */
#define TTypeSupport DDS_MAIN_LED_VOLTAGETypeSupport
#define TData        DDS_MAIN_LED_VOLTAGE
#define TDataReader  DDS_MAIN_LED_VOLTAGEDataReader
#define TDataWriter  DDS_MAIN_LED_VOLTAGEDataWriter
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

