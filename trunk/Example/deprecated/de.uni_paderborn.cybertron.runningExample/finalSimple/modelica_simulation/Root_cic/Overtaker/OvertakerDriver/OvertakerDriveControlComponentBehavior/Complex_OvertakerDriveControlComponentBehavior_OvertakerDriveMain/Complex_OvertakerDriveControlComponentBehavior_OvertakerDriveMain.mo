within Root_cic.Overtaker.OvertakerDriver.OvertakerDriveControlComponentBehavior.Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain;
model Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain
                                                                        extends
    Modelica_StateGraph2.PartialParallel(                                                                            nEntry=2);
 // no annotations will be generated for complex states
 // region declarations
 OvertakerDriver_pDetector.OvertakerDriver_pDetector region_1_overtakerDriver_pDetector(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 DrivingBehaviorOvertaker.DrivingBehaviorOvertaker region_2_DrivingBehaviorOvertaker(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 // end region declarations
 // entry point input declarations
 // end entry point input declarations
equation
  // connect to the initial states of the region statecharts
  connect(entry[2],
    region_1_overtakerDriver_pDetector.inPort[1])
   annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
  connect(entry[1],
    region_2_DrivingBehaviorOvertaker.inPort[1])
   annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
  // end connect to the initial states of the region statecharts
  // connect entry point ports with the corresponding entry point ports of the regions
  // end connect entry point ports with the corresponding entry point ports of the regions
end Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain;
