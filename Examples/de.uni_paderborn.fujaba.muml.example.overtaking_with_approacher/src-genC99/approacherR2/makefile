RTSC = rootColorStateChart.o rootapproacherCommunicatorRTSCStateChart.o 
COMP = colorComponent.o approacherCommunicatorComponent.o  
MW = MiddlewareCore.o MiddlewareInternalLogic.o NetworkInterfaceImplementation.o
LIB = syncChannel.o  Messages.o MessageBuffer.o NetworkMessageBuffer.o port.o NetworkInterface.o
COMMON = Configuration.o implementations.o operations.o

CC = gcc
CFLAGS = -c -g -std=c99 -Wall  -Wstrict-prototypes
all: app

app : main.o $(RTSC) $(COMP) $(LIB) $(MW) $(COMMON)  
	$(CC) main.o $(RTSC) $(COMP) $(LIB) $(MW) $(COMMON)   -o app
rootColorStateChart.o: RTSCs/rootColorStateChart.c
	$(CC) $(CFLAGS) RTSCs/rootColorStateChart.c
rootapproacherCommunicatorRTSCStateChart.o: RTSCs/rootapproacherCommunicatorRTSCStateChart.c
	$(CC) $(CFLAGS) RTSCs/rootapproacherCommunicatorRTSCStateChart.c

colorComponent.o: components/colorComponent.c
	$(CC) $(CFLAGS) components/colorComponent.c
approacherCommunicatorComponent.o: components/approacherCommunicatorComponent.c
	$(CC) $(CFLAGS) components/approacherCommunicatorComponent.c

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
