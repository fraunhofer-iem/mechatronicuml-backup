/* TODO: cleanup, maybemake a thread pool */


#include <stdio.h>
#include <string.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <netdb.h>
#include <pthread.h>
#include <stdlib.h>

#include "Messages.h"

#define PORT    "9999" /* Port to listen on */
#define BACKLOG     10  /* Passed to listen() */
#define BUFLEN 32 /* Buffer Length for messages (Keep in mind: wifiblock is 32 bytes max!) */

typedef struct MiddlewareMessage MiddlewareMessage;

//counter[i] counts the messages that the buffer for messages for port i has saved (here max. 32 different portIDs possible)
static int counter[32] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

//memory for all messages
static char *memory;

//How many messages of size BUFLEN can be saved?
static int allocMemorySize = 1024;

//How many messages should one buffer (per portid) save at max?
static int maxMessagesPerPort = 32; 

//portIDs[i] saves the number that represents the portID for i. (TODO: initialize?)
static signed long portIDs[32];

//Counts the current amount of different portIDs for which messages are saved
static int amountOfPortIDs = 0;


inline void printMemory()
{
    int i;
    for(i = 0; i < amountOfPortIDs; i++)
    {
        fprintf(stdout, "Buffer %d (PortID %lu): %i messages buffered\n", i, portIDs[i], counter[i]);
    }
}


void *handle(void *pnewsock)
{
    //32 byte buffer for current thread
    char buf[BUFLEN];

    MiddlewareMessage mmsg;
    int found, i;
    int *new_fd = (int *)pnewsock;

    if (recv(*new_fd, buf, BUFLEN-1, 0) == -1)
        fprintf(stderr,"socket recv failed");   

    //Use protobuf to create MiddlewareMessage from buf (TOOD: check if message is a middlewaremessage or not)
    MiddlewareMessage_read_delimited_from(buf, &mmsg, 0);
   
    //Print mumlmessage
    //fprintf(stdout,"# %s\n", mmsg._mumlMsg);  

    //Is the received message a request?
    if(strcmp(mmsg._mumlMsg, "Req msg!(WK6Hmq)") == 0)
    {
        //Do/Did we save/d messages of that portid already?
        found = 0;

        //Look up if we already have a buffer for the PortID of the received message
        for(i = 0; i < amountOfPortIDs; i++)
        {
            if(mmsg._targetPort == portIDs[i])
            {   
                found = 1;    

                if(counter[i]>0) //Can't send messages we don't have
                {
                    //save the requested message in buf
                    memcpy(&buf, &memory[i*maxMessagesPerPort*BUFLEN + counter[i]*BUFLEN], BUFLEN-1);

                    //Make room for a new message
                    counter[i]--;
                    //fprintf(stdout,"# buffer for port %lu currently saves %i messages\n", mmsg._targetPort, counter[i]);
                }

                break;
            }
        }

        if(found == 0)
        {
            // No messages available for the requested PortID? Just send "NULL"
            buf[0] = 'N';
            buf[1] = 'U';
            buf[2] = 'L';
            buf[3] = 'L';
            buf[4] = '\0';
        }
    }
    else //The received message is no reqest, so needs to be saved
    {
        //Did we already save some messages for that PortID?
        found = 0;
        if(amountOfPortIDs > 0)
        {
            //Look up if we already have a buffer for the PortID of the received message
            for(i = 0; i < amountOfPortIDs; i++)
            {
                if(mmsg._targetPort == portIDs[i])
                {
                    found = 1;

                    if(counter[i] >= maxMessagesPerPort)
                    {
                        fprintf(stderr, "Error: Message couldn't be saved because maximum amount of messages (%d) for PortID %lu is reached", maxMessagesPerPort, mmsg._targetPort);
                        break;
                    }

                    //We found the proper buffer for this message, now copy it to the proper address
                    counter[i]++;
                    //fprintf(stdout,"# buffer for port %lu currently saves %i messages\n", mmsg._targetPort, counter[i]); 

                    //Messages for PortID portIDs[i] starts at 'i*maxMessagesPerPort*BUFLEN'
                    //To get the address for the next free memory just add 'counter[i]*BUFLEN'
                    memcpy(&memory[i*maxMessagesPerPort*BUFLEN + counter[i]*BUFLEN], &buf, BUFLEN-1);
                    break;
                }
            }
        }

        //If we save a message for that PortID for the first time:
        if(found == 0)
        {
            memcpy(&portIDs[amountOfPortIDs],&mmsg._targetPort,sizeof(signed long));
            memcpy(&memory[amountOfPortIDs*maxMessagesPerPort*BUFLEN + counter[amountOfPortIDs]*BUFLEN], &buf, BUFLEN-1);
            counter[amountOfPortIDs]++;
            //fprintf(stdout,"# buffer for port %lu currently saves %i message\n", mmsg._targetPort, counter[amountOfPortIDs]); 
            amountOfPortIDs++;
        } 
    }

    if (send(*new_fd, buf, BUFLEN-1, 0) == -1)
        fprintf(stderr,"sending error");
    
    close(*new_fd);

    printMemory();

    return NULL;
}

int main(void)
{
    int sock;
    pthread_t thread;
    struct addrinfo hints, *servinfo, *res;

    int reuseaddr = 1; /* True */

    /* Get the address info */
    memset(&hints, 0, sizeof hints);
    hints.ai_family = AF_UNSPEC;
    hints.ai_socktype = SOCK_STREAM;
    if (getaddrinfo("0.0.0.0", PORT, &hints, &servinfo) != 0) {
        perror("getaddrinfo failed");
        return 1;
    }


    // loop through all the results and bind to the first we can / create the socket
    for(res = servinfo; res != NULL; res = res->ai_next) 
    {
        if ((sock = socket(res->ai_family, res->ai_socktype,
                res->ai_protocol)) == -1) {
            perror("creating socket failed");
            return 1;
        }

        /* Enable the socket to reuse the address */
        if (setsockopt(sock, SOL_SOCKET, SO_REUSEADDR, &reuseaddr, sizeof(int)) == -1) {
            perror("setsockopt failed");
            return 1;
        }

        /* Bind to the address */
        if (bind(sock, res->ai_addr, res->ai_addrlen) == -1) {
            perror("sockt bind failed");
            return 0;
        }
    }

    freeaddrinfo(servinfo);

    /* Listen */
    if (listen(sock, BACKLOG) == -1) 
    {
        perror("socket listen failed");
        return 0;
    }

    memory = (char*)malloc(allocMemorySize*BUFLEN*sizeof(char));
    printf("Memory allocated for max. %d messages (%d bytes)\n", allocMemorySize, allocMemorySize*BUFLEN);

    /* Main loop */
    while (1) {
        size_t size = sizeof(struct sockaddr_in);
        struct sockaddr_in their_addr;

        int newsock = accept(sock, (struct sockaddr*)&their_addr, &size);
        
        if (newsock == -1) 
        {
            perror("socket accept failed");
            break;
        }
        
        printf("Got a connection from %s on port %d\n", inet_ntoa(their_addr.sin_addr), htons(their_addr.sin_port));

        if (pthread_create(&thread, NULL, handle, &newsock) != 0) 
        {
            fprintf(stderr, "Failed to create thread.\n");
            break;
        }
        else
        {
            pthread_detach(thread);
        }
    }

    close(sock);
    free(memory);

    return 0;
}
