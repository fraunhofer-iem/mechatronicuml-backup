

ifndef NDDSHOME
NDDSHOME := "/home/ralle/rti_connext_dds-5.2.0"
endif
#TARGET_ARCH = x64Linux3.xgcc4.6.3

SYSLIBS = -ldl -lnsl -lm -lpthread -lrt
DEFINES = -DRTI_UNIX -DRTI_LINUX -DRTI_64BIT 
LIBS = -L$(NDDSHOME)/lib/x64Linux3.xgcc4.6.3 \
        -lnddscz -lnddscorez $(SYSLIBS)
DDSSOURCES = MUML_DDSSupport.o MUML_DDSPlugin.o MUML_DDS.o 


CONT =  MCC_productionStationComponent.o
CONT_LIB =  MessageBuffer.o LocalBufferManager.o DDS_Custom_Lib.o

RTSC = productionStationPorductionStationRTSCStateChart.o 
COMP = productionStationComponent.o  
OPERATIONREPOSITORIES = 	 iDManagementOpRep.o		
LIB =   Debug.o
CC = gcc
CFLAGS = -ggdb -Wall -c  $(DEFINES) -I types -I lib -I $(NDDSHOME)/include -I $(NDDSHOME)/include/ndds 
all: app

app : main.o $(RTSC) $(COMP) $(LIB) $(CONT_LIB) $(HYB) $(CONT) $(OPERATIONREPOSITORIES)  $(DDSSOURCES)
	$(CC) main.o $(RTSC) $(COMP) $(LIB) $(CONT_LIB) $(HYB) $(CONT) $(OPERATIONREPOSITORIES) $(DDSSOURCES) $(LIBS) -o app
productionStationPorductionStationRTSCStateChart.o: RTSCs/productionStationPorductionStationRTSCStateChart.c
	$(CC) $(CFLAGS) RTSCs/productionStationPorductionStationRTSCStateChart.c
productionStationComponent.o: components/productionStationComponent.c
	$(CC) $(CFLAGS) components/productionStationComponent.c

MUML_DDSSupport.o: dds/MUML_DDSSupport.c
	$(CC) $(CFLAGS) dds/MUML_DDSSupport.c
MUML_DDSPlugin.o: dds/MUML_DDSPlugin.c
	$(CC) $(CFLAGS) dds/MUML_DDSPlugin.c
MUML_DDS.o: dds/MUML_DDS.c
	$(CC) $(CFLAGS) dds/MUML_DDS.c


MessageBuffer.o: container_lib/MessageBuffer.c
	$(CC) $(CFLAGS) container_lib/MessageBuffer.c
LocalBufferManager.o: container_lib/LocalBufferManager.c
	$(CC) $(CFLAGS) container_lib/LocalBufferManager.c
DDS_Custom_Lib.o: container_lib/DDS_Custom_Lib.c
	$(CC) $(CFLAGS) container_lib/DDS_Custom_Lib.c


MCC_productionStationComponent.o: component_container/MCC_productionStationComponent.c
	$(CC) $(CFLAGS) component_container/MCC_productionStationComponent.c

Debug.o: lib/Debug.c
	$(CC) $(CFLAGS) lib/Debug.c


 iDManagementOpRep.o: operations/iDManagementOpRep.c
	$(CC) $(CFLAGS) operations/iDManagementOpRep.c


clean:
	rm -rf *o app
