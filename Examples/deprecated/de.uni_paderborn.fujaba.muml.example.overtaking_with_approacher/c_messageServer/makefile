CC = gcc
CFLAGS  = -pthread -g -Wall

default: threaded-server

threaded-server:  threaded-server.o Messages.o  
	$(CC) $(CFLAGS) -o threaded-server threaded-server.o Messages.o

threaded-server.o:  threaded-server.c Messages.h
	$(CC) $(CFLAGS) -c threaded-server.c

Messages.o:  Messages.c Messages.h 
	$(CC) $(CFLAGS) -c Messages.c

clean: 
	$(RM) threaded-server *.o *~