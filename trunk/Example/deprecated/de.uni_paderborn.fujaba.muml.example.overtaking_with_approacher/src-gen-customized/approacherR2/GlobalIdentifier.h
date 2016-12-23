/**
 * @file 
 * @author generated
 * @brief The GlobalIdentifiers
 * @details In this file the GlobalIdentifiers are specified via preprocessor macros
 * 			 These GlobalIdentifiers are equal for all ECUs
 */
		//Define MessageType IDs
			#define MESSAGE_MOTOR_VELOCITY_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE 1 /**< Global Identifier: For the Message-Type: Motor_velocity_message */
			#define MESSAGE_FIXVELOCITYOVERTAKINGMESSAGESMESSAGE 2 /**< Global Identifier: For the Message-Type: fixVelocity */
			#define MESSAGE_INITIATEOVERTAKINGMESSAGESMESSAGE 3 /**< Global Identifier: For the Message-Type: initiate */
			#define MESSAGE_SETSLOWOVERTAKINGMESSAGESMESSAGE 4 /**< Global Identifier: For the Message-Type: setSlow */
			#define MESSAGE_COLOR_COLOR_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE 5 /**< Global Identifier: For the Message-Type: Color_color_message */
			#define MESSAGE_FINISHOVERTAKINGOVERTAKINGMESSAGESMESSAGE 6 /**< Global Identifier: For the Message-Type: finishOvertaking */
			#define MESSAGE_DECLINEOVERTAKINGOVERTAKINGMESSAGESMESSAGE 7 /**< Global Identifier: For the Message-Type: declineOvertaking */
			#define MESSAGE_STARTEDOOVERTAKINGMESSAGESMESSAGE 8 /**< Global Identifier: For the Message-Type: startedO */
			#define MESSAGE_DISTANCE_DISTANCE_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE 9 /**< Global Identifier: For the Message-Type: Distance_distance_message */
			#define MESSAGE_SETFASTOVERTAKINGMESSAGESMESSAGE 10 /**< Global Identifier: For the Message-Type: setFast */
			#define MESSAGE_ACCEPTOVERTAKINGOVERTAKINGMESSAGESMESSAGE 11 /**< Global Identifier: For the Message-Type: acceptOvertaking */
			#define MESSAGE_REQUESTOVERTAKINGOVERTAKINGMESSAGESMESSAGE 12 /**< Global Identifier: For the Message-Type: requestOvertaking */
			#define MESSAGE_EXECUTEDOVERTAKINGMESSAGESMESSAGE 13 /**< Global Identifier: For the Message-Type: executed */
			#define MESSAGE_OVERTAKEOVERTAKINGMESSAGESMESSAGE 14 /**< Global Identifier: For the Message-Type: overtake */
			#define MESSAGE_CHANGEOVERTAKINGMESSAGESMESSAGE 15 /**< Global Identifier: For the Message-Type: change */
			#define MESSAGE_UNSAVEOVERTAKINGMESSAGESMESSAGE 16 /**< Global Identifier: For the Message-Type: unsave */
			#define MESSAGE_EXECUTEOVERTAKINGMESSAGESMESSAGE 17 /**< Global Identifier: For the Message-Type: execute */
			#define MESSAGE_FINISHEDOOVERTAKINGMESSAGESMESSAGE 18 /**< Global Identifier: For the Message-Type: finishedO */
			#define MESSAGE_SAVEOVERTAKINGMESSAGESMESSAGE 19 /**< Global Identifier: For the Message-Type: save */
			#define MESSAGE_FREEVELOCITYOVERTAKINGMESSAGESMESSAGE 20 /**< Global Identifier: For the Message-Type: freeVelocity */
			#define MESSAGE_LINE_LINELIGHT_MESSAGEAPI_MESSAGETYPE_REPOSITORYMESSAGE 21 /**< Global Identifier: For the Message-Type: Line_lineLight_message */

		//Define Port IDs
			#define PORT_SECTIONSECTIONCONTROLSECTIONAPPROACHERP1 1 /**< Global Identifier: For the Discrete-Port-Instance: sectionApproacherP1 */
			#define PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKERP1 2 /**< Global Identifier: For the Discrete-Port-Instance: sectionOvertakerP1 */
			#define PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKEEP1 3 /**< Global Identifier: For the Discrete-Port-Instance: sectionOvertakeeP1 */
			#define PORT_SECTIONSECTIONCONTROLCONTROLLERP1 4 /**< Global Identifier: For the Discrete-Port-Instance: controllerP1 */
			#define PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR 5 /**< Global Identifier: For the Discrete-Port-Instance: velocityContR */
			#define PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL 6 /**< Global Identifier: For the Discrete-Port-Instance: velocityContL */
			#define PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1 7 /**< Global Identifier: For the Discrete-Port-Instance: initiatorP1 */
			#define PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE 8 /**< Global Identifier: For the Discrete-Port-Instance: distance */
			#define PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE 9 /**< Global Identifier: For the Discrete-Port-Instance: line */
			#define PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR 10 /**< Global Identifier: For the Discrete-Port-Instance: velocityR */
			#define PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL 11 /**< Global Identifier: For the Discrete-Port-Instance: velocityL */
			#define PORT_OVERTAKERDISTANCEDISTANCEDISTANCE 12 /**< Global Identifier: For the Discrete-Port-Instance: distance */
			#define PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOREXECUTORP1 13 /**< Global Identifier: For the Discrete-Port-Instance: executorP1 */
			#define PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORVEHICLEOVERTAKERP1 14 /**< Global Identifier: For the Discrete-Port-Instance: vehicleOvertakerP1 */
			#define PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOROVERTAKERP1 15 /**< Global Identifier: For the Discrete-Port-Instance: overtakerP1 */
			#define PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORREQUESTORP1 16 /**< Global Identifier: For the Discrete-Port-Instance: requestorP1 */
			#define PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORCOLOR 17 /**< Global Identifier: For the Discrete-Port-Instance: color */
			#define PORT_OVERTAKERLINELINELINELIGHT 18 /**< Global Identifier: For the Discrete-Port-Instance: lineLight */
			#define PORT_OVERTAKERCOLORCOLORCOLOR 19 /**< Global Identifier: For the Discrete-Port-Instance: color */
			#define PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYGETTERP1 20 /**< Global Identifier: For the Discrete-Port-Instance: velocityGetterP1 */
			#define PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYR 21 /**< Global Identifier: For the Discrete-Port-Instance: velocityR */
			#define PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERLINEOVERTAKEE 22 /**< Global Identifier: For the Discrete-Port-Instance: lineOvertakee */
			#define PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYL 23 /**< Global Identifier: For the Discrete-Port-Instance: velocityL */
			#define PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERDISTANCEOVERTAKEE 24 /**< Global Identifier: For the Discrete-Port-Instance: distanceOvertakee */
			#define PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATOROVERTAKEEP1 25 /**< Global Identifier: For the Discrete-Port-Instance: overtakeeP1 */
			#define PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVELOCITYSETTERP1 26 /**< Global Identifier: For the Discrete-Port-Instance: velocitySetterP1 */
			#define PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVEHICLEOVERTAKEEP1 27 /**< Global Identifier: For the Discrete-Port-Instance: vehicleOvertakeeP1 */
			#define PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORINFORMOVERTAKEE1 28 /**< Global Identifier: For the Discrete-Port-Instance: informOvertakee1 */
			#define PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORCOLOROVERTAKEE 29 /**< Global Identifier: For the Discrete-Port-Instance: colorOvertakee */
			#define PORT_OVERTAKEEMOTORLMOTORVELOCITYCONTR 30 /**< Global Identifier: For the Discrete-Port-Instance: velocityContR */
			#define PORT_OVERTAKEEMOTORRMOTORVELOCITYCONTL 31 /**< Global Identifier: For the Discrete-Port-Instance: velocityContL */
			#define PORT_OVERTAKEELINELINELINELIGHT 32 /**< Global Identifier: For the Discrete-Port-Instance: lineLight */
			#define PORT_OVERTAKEECOLORCOLORCOLOR 33 /**< Global Identifier: For the Discrete-Port-Instance: color */
			#define PORT_OVERTAKEEDISTANCEDISTANCEDISTANCEOVERTAKEE 34 /**< Global Identifier: For the Discrete-Port-Instance: distanceOvertakee */
			#define PORT_APPROACHERMOTORRMOTORVELOCITYCONTR 35 /**< Global Identifier: For the Discrete-Port-Instance: velocityContR */
			#define PORT_APPROACHERMOTORLMOTORVELOCITYCONTL 36 /**< Global Identifier: For the Discrete-Port-Instance: velocityContL */
			#define PORT_APPROACHERDRIVERAPPROACHERDRIVERLIMITERP1 37 /**< Global Identifier: For the Discrete-Port-Instance: limiterP1 */
			#define PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYL 38 /**< Global Identifier: For the Discrete-Port-Instance: velocityL */
			#define PORT_APPROACHERDRIVERAPPROACHERDRIVERLINEAPPROACHER 39 /**< Global Identifier: For the Discrete-Port-Instance: lineApproacher */
			#define PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYR 40 /**< Global Identifier: For the Discrete-Port-Instance: velocityR */
			#define PORT_APPROACHERDRIVERAPPROACHERDRIVERDISTANCEAPROACHER 41 /**< Global Identifier: For the Discrete-Port-Instance: distanceAproacher */
			#define PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORVEHICLEAPPROACHERP1 42 /**< Global Identifier: For the Discrete-Port-Instance: vehicleApproacherP1 */
			#define PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORLIMITDRIVINGP1 43 /**< Global Identifier: For the Discrete-Port-Instance: limitDrivingP1 */
			#define PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORINFORMAPPROACHERP1 44 /**< Global Identifier: For the Discrete-Port-Instance: informApproacherP1 */
			#define PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORCOLORAPPROACHER 45 /**< Global Identifier: For the Discrete-Port-Instance: colorApproacher */
			#define PORT_APPROACHERCOLORCOLORCOLOR 46 /**< Global Identifier: For the Discrete-Port-Instance: color */
			#define PORT_APPROACHERLINELINELINELIGHT 47 /**< Global Identifier: For the Discrete-Port-Instance: lineLight */
			#define PORT_APPROACHERDISTANCEDISTANCEDISTANCE 48 /**< Global Identifier: For the Discrete-Port-Instance: distance */

		//Define ECU IDs
			#define ECU_OVERTAKEER2 1 /**< Global Identifier: For the ECU: overtakeeR2 */
			#define ECU_OVERTAKEER1 2 /**< Global Identifier: For the ECU: overtakeeR1 */
			#define ECU_OVERTAKERR1 3 /**< Global Identifier: For the ECU: overtakerR1 */
			#define ECU_OVERTAKERR2 4 /**< Global Identifier: For the ECU: overtakerR2 */
			#define ECU_APPROACHERR1 5 /**< Global Identifier: For the ECU: approacherR1 */
			#define ECU_APPROACHERR2 6 /**< Global Identifier: For the ECU: approacherR2 */
			#define ECU_SERVERBRICK 7 /**< Global Identifier: For the ECU: serverBrick */

