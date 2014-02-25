
#ifndef CONNECTIONLIST_H_
#define CONNECTIONLIST_H_

#include "types.h"
#include "discreteConnection.h"


typedef struct DiscreteConnectionListNode DiscreteConnectionListNode;
typedef struct DiscreteConnectionList DiscreteConnectionList;

struct DiscreteConnectionListNode
{
	DiscreteConnection* connector;
	DiscreteConnectionListNode* next;
};

struct DiscreteConnectionList {
	DiscreteConnectionListNode* head;
	int size;
};




DiscreteConnectionList* DiscreteConnectionList_create();
DiscreteConnectionListNode* DiscreteConnectionListNode_create(DiscreteConnection* connector);

void DiscreteConnectionList_add(DiscreteConnectionList* list, DiscreteConnection * connector);

DiscreteConnectionListNode* DiscreteConnectionList_getHead(DiscreteConnectionList* list);



#endif /* CONNECTIONLIST_H_ */
