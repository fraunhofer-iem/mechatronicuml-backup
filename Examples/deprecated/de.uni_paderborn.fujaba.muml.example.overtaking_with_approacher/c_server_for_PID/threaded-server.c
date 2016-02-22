
#include <stdio.h>
#include <string.h> /* memset() */
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <netdb.h>
#include <pthread.h>
#include <stdlib.h>
#include <ncurses.h> 
typedef struct MiddlewareMessage MiddlewareMessage;

#define PORT    "9999" /* Port to listen on */
#define BACKLOG     10  /* Passed to listen() */
#define BUFLEN 8 /* Buffer Length for messages (Keep in mind: wifiblock is 32 bytes max!) */

//thread-pool?

//counter[i] counts the messages that the buffer for messages for port i has saved
static int counter[32] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };

//memory for all messages
static char *memory;

//How many messages of size BUFLEN can be saved?
static int allocMemorySize = 1024;

//How many messages should one buffer (per portid) save at max?
static int maxMessagesPerPort = 32; 

//portIDs[i] saves the int that represents the portID for i.
static signed long portIDs[32];

//Counts the current amount of different portIDs for which messages are saved
static int amountOfPortIDs = 0;

void printmemory();


void *handle(void *pnewsock)
{
    char buf[BUFLEN] = {0,0,0,0};
    int found = 0;

    int *new_fd = (int *)pnewsock;

    if (recv(*new_fd, buf, BUFLEN-1, 0) == -1)
        fprintf(stderr,"recv");   

    fprintf(stdout,"\033[H\033[J"); 

    fprintf(stdout, "PK/PKD:%d/%d, IK/IKD:%d/%d, , DK/DKD:%d/%d", buf[0], buf[1], buf[2], buf[3], buf[4], buf[5], buf[6]);

     int str = 'i';
 initscr();   
 noecho(); 
 cbreak();
 timeout(200);
 str = getch();

if(str == 49) // 1 PK+
{
    buf[0] = 'P';
    buf[1] = 'U';
}
if(str == 113) // q PK-
{
    buf[0] = 'P';
    buf[1] = 'D';
}
if(str == 97) // a PKD+
{
    buf[0] = 'P';
    buf[1] = 'J';
}
if(str == 121) // y PKD-
{
    buf[0] = 'P';
    buf[1] = 'K';
}


if(str == 50) // 2 IK+
{
    buf[0] = 'I';
    buf[1] = 'U';
}
if(str == 119) // w IK-
{
    buf[0] = 'I';
    buf[1] = 'D';
}

if(str == 115) // s IKD+
{
    buf[0] = 'I';
    buf[1] = 'J';
}
if(str == 120) // x IKD-
{
    buf[0] = 'I';
    buf[1] = 'K';
}


if(str == 51) // 3 DK+
{
    buf[0] = 'D';
    buf[1] = 'U';
}
if(str == 101) // e DK-
{
    buf[0] = 'D';
    buf[1] = 'D';
}

if(str == 100) // d DKD+
{
    buf[0] = 'D';
    buf[1] = 'J';
}
if(str == 99) // c DKD-
{
    buf[0] = 'D';
    buf[1] = 'K';
}

fprintf(stdout,"You Entered: %d \n", str);

    if (send(*new_fd, buf, BUFLEN-1, 0) == -1)
        fprintf(stderr,"send");

    endwin();
    
    close(*new_fd);

    return NULL;
}

void printmemory()
{
    int i, j;

    for(i = 0; i < amountOfPortIDs; i++)
    {
        fprintf(stdout, "## %d (%lu): ", i+1, portIDs[i]);

        for(j = 0; j < BUFLEN; j++)
        {
            fprintf(stdout, "%c", memory[j+i*BUFLEN]);
        }

        fprintf(stdout, "\n");
    }
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
        perror("getaddrinfo");
        return 1;
    }


    // loop through all the results and bind to the first we can / create the socket
    for(res = servinfo; res != NULL; res = res->ai_next) 
    {
        if ((sock = socket(res->ai_family, res->ai_socktype,
                res->ai_protocol)) == -1) {
            perror("server: socket");
            return 1;
        }

        /* Enable the socket to reuse the address */
        if (setsockopt(sock, SOL_SOCKET, SO_REUSEADDR, &reuseaddr, sizeof(int)) == -1) {
            perror("setsockopt");
            return 1;
        }

        /* Bind to the address */
        if (bind(sock, res->ai_addr, res->ai_addrlen) == -1) {
            perror("bind");
            return 0;
        }
    }

    freeaddrinfo(servinfo);

    /* Listen */
    if (listen(sock, BACKLOG) == -1) 
    {
        perror("listen");
        return 0;
    }

    memory = (char*)malloc(allocMemorySize*BUFLEN*sizeof(char));
    printf("Memory allocated for max. %d messages\n", allocMemorySize);

    /* Main loop */
    while (1) {
        size_t size = sizeof(struct sockaddr_in);
        struct sockaddr_in their_addr;

        int newsock = accept(sock, (struct sockaddr*)&their_addr, &size);
        
        if (newsock == -1) 
        {
            perror("accept");
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
