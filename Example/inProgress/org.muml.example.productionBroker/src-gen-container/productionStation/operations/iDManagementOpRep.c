
#include "iDManagementOpRep.h"
/** Start of user code User includes **/ 
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include "cJSON.h"
/**End of user code**/

int32_T IDManagement_iDManagementGetID(){

/** Start of user code IDManagement_iDManagementGetID **/ 
	int32_T ID;
	char *buffer = 0;
	long length;

	//If there's a config.json, read it into the buffer
	FILE *fp = fopen("config.json", "r");
	if (fp)
	{
		fseek(fp, 0, SEEK_END);
		length = ftell(fp);
		fseek(fp, 0, SEEK_SET);
		buffer = malloc(length);
		if (buffer)
		{
			fread(buffer, 1, length, fp);
		}
		fclose(fp);
	}
	//If config.json was successfully read, parse the ID from it
	if (buffer)
	{
		cJSON *root = cJSON_Parse(buffer);
		if (root)
		{
			cJSON *ID_item = cJSON_GetObjectItem(root, "ID");
			if (cJSON_IsNumber(ID_item))
			{
			  ID = ID_item->valueint;
			  printf("Found the following ID in config.json: %ld\n", ID);
			  return ID;
			}
		}
	}
	//If we did not read an ID from a config.json, generate a random one
	srand(clock());
	ID = rand();
	printf("Generated random id: %ld\n",ID);
	//TODO store as config.json
	return ID;
/**End of user code**/

}




