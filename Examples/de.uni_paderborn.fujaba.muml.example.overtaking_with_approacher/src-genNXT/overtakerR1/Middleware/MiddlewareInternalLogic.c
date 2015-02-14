#include "MiddlewareInternalLogic.h"


/*
 * determines the targetECU
 * uses ECU-table, based on the allocation-model
 * For now, only a switch-case statement. Later this should be implemented
 * in some hash-table to allow changes during runtime.
 */
ECUID MW_getTargetECU(PortID targetPort) {
	switch(targetPort){

		case PORT_SECTIONSECTIONCONTROLSECTIONAPPROACHERP1:
		return ECU_SERVERBRICK;
		break;
		case PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKERP1:
		return ECU_SERVERBRICK;
		break;
		case PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKEEP1:
		return ECU_SERVERBRICK;
		break;
		case PORT_SECTIONSECTIONCONTROLCONTROLLERP1:
		return ECU_SERVERBRICK;
		break;
		case PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERDISTANCEDISTANCEDISTANCE:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOREXECUTORP1:
		return ECU_OVERTAKERR2;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORVEHICLEOVERTAKERP1:
		return ECU_OVERTAKERR2;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOROVERTAKERP1:
		return ECU_OVERTAKERR2;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORREQUESTORP1:
		return ECU_OVERTAKERR2;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORCOLOR:
		return ECU_OVERTAKERR2;
		break;
		case PORT_OVERTAKERLINELINELINELIGHT:
		return ECU_OVERTAKERR1;
		break;
		case PORT_OVERTAKERCOLORCOLORCOLOR:
		return ECU_OVERTAKERR2;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYGETTERP1:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYR:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERLINEOVERTAKEE:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYL:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERDISTANCEOVERTAKEE:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATOROVERTAKEEP1:
		return ECU_OVERTAKEER2;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVELOCITYSETTERP1:
		return ECU_OVERTAKEER2;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVEHICLEOVERTAKEEP1:
		return ECU_OVERTAKEER2;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORINFORMOVERTAKEE1:
		return ECU_OVERTAKEER2;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORCOLOROVERTAKEE:
		return ECU_OVERTAKEER2;
		break;
		case PORT_OVERTAKEEMOTORLMOTORVELOCITYCONTR:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEEMOTORRMOTORVELOCITYCONTL:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEELINELINELINELIGHT:
		return ECU_OVERTAKEER1;
		break;
		case PORT_OVERTAKEECOLORCOLORCOLOR:
		return ECU_OVERTAKEER2;
		break;
		case PORT_OVERTAKEEDISTANCEDISTANCEDISTANCEOVERTAKEE:
		return ECU_OVERTAKEER1;
		break;
		case PORT_APPROACHERMOTORRMOTORVELOCITYCONTR:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERMOTORLMOTORVELOCITYCONTL:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERLIMITERP1:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYL:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERLINEAPPROACHER:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYR:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERDISTANCEAPROACHER:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORVEHICLEAPPROACHERP1:
		return ECU_APPROACHERR2;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORLIMITDRIVINGP1:
		return ECU_APPROACHERR2;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORINFORMAPPROACHERP1:
		return ECU_APPROACHERR2;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORCOLORAPPROACHER:
		return ECU_APPROACHERR2;
		break;
		case PORT_APPROACHERCOLORCOLORCOLOR:
		return ECU_APPROACHERR2;
		break;
		case PORT_APPROACHERLINELINELINELIGHT:
		return ECU_APPROACHERR1;
		break;
		case PORT_APPROACHERDISTANCEDISTANCEDISTANCE:
		return ECU_APPROACHERR1;
		break;
		default:
			return -1;
		}
}

/*
 * determines the targetECU for network communication
 * uses ECU-table, based on the PDM
 */
ECUID MW_getNextStepECU(ECUID ecu)
{
   switch (ecu) {
case ECU_OVERTAKEER2:
	return -1;
	break;
case ECU_OVERTAKEER1:
	return -1;
	break;
case ECU_OVERTAKERR1:
	return ECU_OVERTAKERR1;
	break;
case ECU_OVERTAKERR2:
	return ECU_OVERTAKERR2;
	break;
case ECU_APPROACHERR1:
	return -1;
	break;
case ECU_APPROACHERR2:
	return -1;
	break;
case ECU_SERVERBRICK:
	return -1;
	break;
        default:
            return -1;
    }
}

/*
 * returns a network interface which is able to contact the NextStep-ECU
 * uses NI-table, based on PDM
 */
NetworkInterface* MW_getNetworkInterface(ECUID ecu)
{
	switch (ecu)
	{
case ECU_OVERTAKEER2:
	return NULL;
	break;
case ECU_OVERTAKEER1:
	return NULL;
	break;
case ECU_OVERTAKERR1:
	return mw->intern;
	break;
case ECU_OVERTAKERR2:
	return mw->inputPort4;
	break;
case ECU_APPROACHERR1:
	return NULL;
	break;
case ECU_APPROACHERR2:
	return NULL;
	break;
case ECU_SERVERBRICK:
	return NULL;
	break;
        default: return NULL; 
	}
}

Port* MW_getPortforIdentifier(PortID portID){
    switch (portID) {
case PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR:
	return mw->overtakerMotorRComponent->velocityPort;
	break;
case PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL:
	return mw->overtakerMotorLComponent->velocityPort;
	break;
case PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1:
	return mw->overtakerDriverComponent->initiatorPPort;
	break;
case PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE:
	return mw->overtakerDriverComponent->distancePort;
	break;
case PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE:
	return mw->overtakerDriverComponent->linePort;
	break;
case PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR:
	return mw->overtakerDriverComponent->velocityRPort;
	break;
case PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL:
	return mw->overtakerDriverComponent->velocityLPort;
	break;
case PORT_OVERTAKERDISTANCEDISTANCEDISTANCE:
	return mw->overtakerDistanceComponent->distancePort;
	break;
case PORT_OVERTAKERLINELINELINELIGHT:
	return mw->overtakerLineComponent->lineLightPort;
	break;
        default:
            return NULL;
    }
    
}


/*
* Return the  PortID of a receiving port for a given sender PortID
*
*/
PortID MW_getTargetPortIDforIdentifier(PortID portID){ 
switch (portID) {
		case PORT_SECTIONSECTIONCONTROLSECTIONAPPROACHERP1:
		return PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORVEHICLEAPPROACHERP1;
		break;
		case PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKERP1:
		return PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORVEHICLEOVERTAKERP1;
		break;
		case PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKEEP1:
		return PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVEHICLEOVERTAKEEP1;
		break;
		case PORT_SECTIONSECTIONCONTROLCONTROLLERP1:
		return PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORREQUESTORP1;
		break;
		case PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR:
		return PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR;
		break;
		case PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL:
		return PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1:
		return PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOREXECUTORP1;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE:
		return PORT_OVERTAKERDISTANCEDISTANCEDISTANCE;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE:
		return PORT_OVERTAKERLINELINELINELIGHT;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYR:
		return PORT_OVERTAKERMOTORRMOTORVELOCITYCONTR;
		break;
		case PORT_OVERTAKERDRIVEROVERTAKERDRIVERVELOCITYL:
		return PORT_OVERTAKERMOTORLMOTORVELOCITYCONTL;
		break;
		case PORT_OVERTAKERDISTANCEDISTANCEDISTANCE:
		return PORT_OVERTAKERDRIVEROVERTAKERDRIVERDISTANCE;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOREXECUTORP1:
		return PORT_OVERTAKERDRIVEROVERTAKERDRIVERINITIATORP1;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORVEHICLEOVERTAKERP1:
		return PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKERP1;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOROVERTAKERP1:
		return PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATOROVERTAKEEP1;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORREQUESTORP1:
		return PORT_SECTIONSECTIONCONTROLCONTROLLERP1;
		break;
		case PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORCOLOR:
		return PORT_OVERTAKERCOLORCOLORCOLOR;
		break;
		case PORT_OVERTAKERLINELINELINELIGHT:
		return PORT_OVERTAKERDRIVEROVERTAKERDRIVERLINE;
		break;
		case PORT_OVERTAKERCOLORCOLORCOLOR:
		return PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATORCOLOR;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYGETTERP1:
		return PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVELOCITYSETTERP1;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYR:
		return PORT_OVERTAKEEMOTORLMOTORVELOCITYCONTR;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERLINEOVERTAKEE:
		return PORT_OVERTAKEELINELINELINELIGHT;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYL:
		return PORT_OVERTAKEEMOTORRMOTORVELOCITYCONTL;
		break;
		case PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERDISTANCEOVERTAKEE:
		return PORT_OVERTAKEEDISTANCEDISTANCEDISTANCEOVERTAKEE;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATOROVERTAKEEP1:
		return PORT_OVERTAKERCOMMUNICATOROVERTAKERCOMMUNICATOROVERTAKERP1;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVELOCITYSETTERP1:
		return PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYGETTERP1;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORVEHICLEOVERTAKEEP1:
		return PORT_SECTIONSECTIONCONTROLSECTIONOVERTAKEEP1;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORINFORMOVERTAKEE1:
		return PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORINFORMAPPROACHERP1;
		break;
		case PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORCOLOROVERTAKEE:
		return PORT_OVERTAKEECOLORCOLORCOLOR;
		break;
		case PORT_OVERTAKEEMOTORLMOTORVELOCITYCONTR:
		return PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYR;
		break;
		case PORT_OVERTAKEEMOTORRMOTORVELOCITYCONTL:
		return PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERVELOCITYL;
		break;
		case PORT_OVERTAKEELINELINELINELIGHT:
		return PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERLINEOVERTAKEE;
		break;
		case PORT_OVERTAKEECOLORCOLORCOLOR:
		return PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORCOLOROVERTAKEE;
		break;
		case PORT_OVERTAKEEDISTANCEDISTANCEDISTANCEOVERTAKEE:
		return PORT_OVERTAKEEDRIVEROVERTAKEEDRIVERDISTANCEOVERTAKEE;
		break;
		case PORT_APPROACHERMOTORRMOTORVELOCITYCONTR:
		return PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYR;
		break;
		case PORT_APPROACHERMOTORLMOTORVELOCITYCONTL:
		return PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYL;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERLIMITERP1:
		return PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORLIMITDRIVINGP1;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYL:
		return PORT_APPROACHERMOTORLMOTORVELOCITYCONTL;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERLINEAPPROACHER:
		return PORT_APPROACHERLINELINELINELIGHT;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERVELOCITYR:
		return PORT_APPROACHERMOTORRMOTORVELOCITYCONTR;
		break;
		case PORT_APPROACHERDRIVERAPPROACHERDRIVERDISTANCEAPROACHER:
		return PORT_APPROACHERDISTANCEDISTANCEDISTANCE;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORVEHICLEAPPROACHERP1:
		return PORT_SECTIONSECTIONCONTROLSECTIONAPPROACHERP1;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORLIMITDRIVINGP1:
		return PORT_APPROACHERDRIVERAPPROACHERDRIVERLIMITERP1;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORINFORMAPPROACHERP1:
		return PORT_OVERTAKEECOMMUNICATOROVERTAKEECOMMUNICATORINFORMOVERTAKEE1;
		break;
		case PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORCOLORAPPROACHER:
		return PORT_APPROACHERCOLORCOLORCOLOR;
		break;
		case PORT_APPROACHERCOLORCOLORCOLOR:
		return PORT_APPROACHERCOMMUNICATORAPPROACHERCOMMUNICATORCOLORAPPROACHER;
		break;
		case PORT_APPROACHERLINELINELINELIGHT:
		return PORT_APPROACHERDRIVERAPPROACHERDRIVERLINEAPPROACHER;
		break;
		case PORT_APPROACHERDISTANCEDISTANCEDISTANCE:
		return PORT_APPROACHERDRIVERAPPROACHERDRIVERDISTANCEAPROACHER;
		break;
        default:
            return -1;
    }
}
