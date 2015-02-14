RTSC = rootovertakeeDriverRTSCStateChart.o rootDistanceStateChart.o rootLineStateChart.o rootMotorStateChart.o 
COMP = overtakeeDriverComponent.o distanceComponent.o lineComponent.o motorComponent.o  
MW = MiddlewareCore.o MiddlewareInternalLogic.o NetworkInterfaceImplementation.o
LIB = syncChannel.o  Messages.o MessageBuffer.o NetworkMessageBuffer.o port.o NetworkInterface.o
COMMON = Configuration.o implementations.o operations.o

CC = gcc
CFLAGS = -c -g -std=c99 -Wall  -Wstrict-prototypes
all: app

app : main.o $(RTSC) $(COMP) $(LIB) $(MW) $(COMMON)  
	$(CC) main.o $(RTSC) $(COMP) $(LIB) $(MW) $(COMMON)   -o app
rootLineStateChart.o: RTSCs/rootLineStateChart.c
	$(CC) $(CFLAGS) RTSCs/rootLineStateChart.c
rootDistanceStateChart.o: RTSCs/rootDistanceStateChart.c
	$(CC) $(CFLAGS) RTSCs/rootDistanceStateChart.c
rootMotorStateChart.o: RTSCs/rootMotorStateChart.c
	$(CC) $(CFLAGS) RTSCs/rootMotorStateChart.c
rootovertakeeDriverRTSCStateChart.o: RTSCs/rootovertakeeDriverRTSCStateChart.c
	$(CC) $(CFLAGS) RTSCs/rootovertakeeDriverRTSCStateChart.c

overtakeeDriverComponent.o: components/overtakeeDriverComponent.c
	$(CC) $(CFLAGS) components/overtakeeDriverComponent.c
distanceComponent.o: components/distanceComponent.c
	$(CC) $(CFLAGS) components/distanceComponent.c
lineComponent.o: components/lineComponent.c
	$(CC) $(CFLAGS) components/lineComponent.c
motorComponent.o: components/motorComponent.c
	$(CC) $(CFLAGS) components/motorComponent.c

syncChannel.o: lib/syncChannel.c
	$(CC) $(CFLAGS) lib/syncChannel.c
MessageBuffer.o: lib/MessageBuffer.c
	$(CC) $(CFLAGS) lib/MessageBuffer.c
NetworkMessageBuffer.o: lib/NetworkMessageBuffer.c
	$(CC) $(CFLAGS) lib/NetworkMessageBuffer.c
port.o: lib/port.c
	$(CC) $(CFLAGS) lib/port.c
Messages.o: messages/Messages.c
	$(CC) $(CFLAGS) messages/Messages.c
MiddlewareCore.o: Middleware/MiddlewareCore.c
	$(CC) $(CFLAGS) Middleware/MiddlewareCore.c
MiddlewareInternalLogic.o: Middleware/MiddlewareInternalLogic.c
	$(CC) $(CFLAGS) Middleware/MiddlewareInternalLogic.c
NetworkInterfaceImplementation.o: Middleware/NetworkInterfaceImplementation.c
	$(CC) $(CFLAGS) Middleware/NetworkInterfaceImplementation.c
NetworkInterface.o: lib/NetworkInterface.c
	$(CC) $(CFLAGS) lib/NetworkInterface.c
operations.o: operations/operations.c
	$(CC) $(CFLAGS) operations/operations.c
Configuration.o: Configuration.c
	$(CC) $(CFLAGS) Configuration.c
implementations.o: apiCallCode/implementations.c
	$(CC) $(CFLAGS) apiCallCode/implementations.c

clean:
	rm -rf *o app
