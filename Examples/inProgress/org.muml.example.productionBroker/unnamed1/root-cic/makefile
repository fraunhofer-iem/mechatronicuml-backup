RTSC = recipeGeneratorReciepeGeneratorStateChart.o brokerBrokerStateChart.o 
COMP = recipeGeneratorComponent.o brokerComponent.o  
OPR = noSQLDatabaseOpRep.o 
LIB =  port.o MessageBuffer.o NetworkMessageBuffer.o NetworkInterface.o Messages.o Debug.o
MW = MiddlewareCore.o MiddlewareInternalLogic.o NetworkInterfaceImplementation.o
CC = gcc
CFLAGS = -c
all: protobuf app
protobuf: messages/Messages.proto
	java -jar messages/protoc-1.0M4.jar -I=messages --c_out=messages Messages.proto
app : main.o $(RTSC) $(COMP) $(LIB) $(HYB) $(MW) $(OPR) 
	$(CC) main.o $(RTSC) $(COMP) $(LIB) $(HYB) $(MW) $(OPR) -o app
recipeGeneratorReciepeGeneratorStateChart.o: RTSCs/recipeGeneratorReciepeGeneratorStateChart.c
	$(CC) $(CFLAGS) RTSCs/recipeGeneratorReciepeGeneratorStateChart.c
brokerBrokerStateChart.o: RTSCs/brokerBrokerStateChart.c
	$(CC) $(CFLAGS) RTSCs/brokerBrokerStateChart.c
recipeGeneratorComponent.o: components/recipeGeneratorComponent.c
	$(CC) $(CFLAGS) components/recipeGeneratorComponent.c
brokerComponent.o: components/brokerComponent.c
	$(CC) $(CFLAGS) components/brokerComponent.c
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

clean:
	rm -rf *o app
