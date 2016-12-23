#include "implementations.h"
/** Start of user code user includes **/ 

/**End of user code**/

void initAll(){
	ecrobot_init_nxtcolorsensor(NXT_PORT_S1, NXT_COLORSENSOR);
}


		void approacherColor_color_InitApi(){
/** Start of user code approacherColor_color_InitApi **/ 
		
/**End of user code**/
}	
		int approacherColor_color_ExecApi(){
/** Start of user code approacherColor_color_ExecApi **/ 
					ecrobot_process_bg_nxtcolorsensor();
					return ecrobot_get_nxtcolorsensor_id(NXT_PORT_S1);

/**End of user code**/
}	
