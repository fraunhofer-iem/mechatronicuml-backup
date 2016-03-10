RTSC = brokerBrokerStateChart.o productionStationPorductionStationRTSCStateChart.o recipeGeneratorReciepeGeneratorStateChart.o 
COMP = brokerComponent.o productionStationComponent.o recipeGeneratorComponent.o  
OPR = noSQLDatabaseOpRep.o iDManagementOpRep.o 
LIB =  port.o MessageBuffer.o NetworkMessageBuffer.o NetworkInterface.o Messages.o Debug.o database.o unqlite.o
MW = MiddlewareCore.o MiddlewareInternalLogic.o NetworkInterfaceImplementation.o
CC = gcc
CFLAGS = -c
all: protobuf app
protobuf: messages/Messages.proto
	java -jar messages/protoc-1.0M4.jar -I=messages --c_out=messages Messages.proto
app : main.o $(RTSC) $(COMP) $(LIB) $(HYB) $(MW) $(OPR) 
	$(CC) main.o $(RTSC) $(COMP) $(LIB) $(HYB) $(MW) $(OPR) -o app
brokerBrokerStateChart.o: RTSCs/brokerBrokerStateChart.c
	$(CC) $(CFLAGS) RTSCs/brokerBrokerStateChart.c
productionStationPorductionStationRTSCStateChart.o: RTSCs/productionStationPorductionStationRTSCStateChart.c
	$(CC) $(CFLAGS) RTSCs/productionStationPorductionStationRTSCStateChart.c
recipeGeneratorReciepeGeneratorStateChart.o: RTSCs/recipeGeneratorReciepeGeneratorStateChart.c
	$(CC) $(CFLAGS) RTSCs/recipeGeneratorReciepeGeneratorStateChart.c
brokerComponent.o: components/brokerComponent.c
	$(CC) $(CFLAGS) components/brokerComponent.c
productionStationComponent.o: components/productionStationComponent.c
	$(CC) $(CFLAGS) components/productionStationComponent.c
recipeGeneratorComponent.o: components/recipeGeneratorComponent.c
	$(CC) $(CFLAGS) components/recipeGeneratorComponent.c
port.o: lib/port.c
	$(CC) $(CFLAGS) lib/port.c
Debug.o: lib/Debug.c
	$(CC) $(CFLAGS) lib/Debug.c
MessageBuffer.o: lib/MessageBuffer.c
	$(CC) $(CFLAGS) lib/MessageBuffer.c
NetworkMessageBuffer.o: lib/NetworkMessageBuffer.c
	$(CC) $(CFLAGS) lib/NetworkMessageBuffer.c
NetworkInterface.o: lib/NetworkInterface.c
	$(CC) $(CFLAGS) lib/NetworkInterface.c
Messages.o: messages/Messages.c
	$(CC) $(CFLAGS) messages/Messages.c
MiddlewareCore.o: Middleware/MiddlewareCore.c
	$(CC) $(CFLAGS) Middleware/MiddlewareCore.c
MiddlewareInternalLogic.o: Middleware/MiddlewareInternalLogic.c
	$(CC) $(CFLAGS) Middleware/MiddlewareInternalLogic.c
NetworkInterfaceImplementation.o: Middleware/NetworkInterfaceImplementation.c
	$(CC) $(CFLAGS) Middleware/NetworkInterfaceImplementation.c
noSQLDatabaseOpRep.o: operations/noSQLDatabaseOpRep.c
	$(CC) $(CFLAGS) operations/noSQLDatabaseOpRep.c
iDManagementOpRep.o: operations/iDManagementOpRep.c
	$(CC) $(CFLAGS) operations/iDManagementOpRep.c
unqlite.o: database/unqlite.c
	$(CC) $(CFLAGS) database/unqlite.c
database.o: database/database.c
	$(CC) $(CFLAGS) database/database.c
clean:
	rm -rf *o app
