
#include <stdlib.h>
#include <stdio.h>

#include "event.h"
#include "eventQueue.h"
#include "types.h"

#include "discreteConnection.h"
#include "discreteConnectionList.h"





DiscreteConnectionList* DiscreteConnectionList_create(){
	DiscreteConnectionList* list = (struct DiscreteConnectionList *) malloc(sizeof(*list));
	list->head = NULL;
	list->size = 0;
	return list;
}

DiscreteConnectionListNode* DiscreteConnectionListNode_create(DiscreteConnection* connector){
	DiscreteConnectionListNode* node = (struct DiscreteConnectionListNode *) malloc(sizeof(*node));
	node->connector = connector;
	node->next = NULL;
	return node;
}


void DiscreteConnectionList_add(DiscreteConnectionList* list, DiscreteConnection * connector){
	DiscreteConnectionListNode* newNode = DiscreteConnectionListNode_create(connector);
	DiscreteConnectionListNode* iterator = NULL;

	if (list->head == NULL)
		list->head = newNode;
	else{
		iterator = list->head;
		while(iterator->next != NULL){
			iterator=iterator->next;
		}
		iterator->next = newNode;
	}
	list->size++;
}
/*
void DiscreteConnectionList_add(DiscreteConnectionList* list, DiscreteConnectionListNode * newNode){

	DiscreteConnectionNode* iterator = NULL;

	if (list->head == NULL)
		list->head = connector;
	else{
		iterator = list->head;
		while(iterator->next != NULL){
			iterator=iterator->next;
		}
		iterator->next = newNode;
	}
	list.size++;
}
*/

DiscreteConnectionListNode* DiscreteConnectionList_getHead(DiscreteConnectionList* list){
	return list->head;
}


