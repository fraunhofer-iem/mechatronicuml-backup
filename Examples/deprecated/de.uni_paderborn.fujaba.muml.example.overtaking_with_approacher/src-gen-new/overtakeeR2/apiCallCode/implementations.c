#include "implementations.h"
/** Start of user code user includes **/ 

void initAll(){
	ecrobot_init_nxtcolorsensor(NXT_PORT_S1, NXT_COLORSENSOR);
}

/**End of user code**/



		void overtakeeColor_color_InitApi(){
/** Start of user code overtakeeColor_color_InitApi **/
		
/**End of user code**/
}	
		int overtakeeColor_color_ExecApi(){
/** Start of user code overtakeeColor_color_ExecApi **/
						//	ecrobot_sound_tone(440,200,5);
							ecrobot_process_bg_nxtcolorsensor();
							return ecrobot_get_nxtcolorsensor_id(NXT_PORT_S1);

/**End of user code**/
}	
