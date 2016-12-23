within Root_cic.Overtaker.OvertakerCommunicator.OvertakerCommunicatorComponentBehavior.Complex_OvertakerCommunicatorComponentBehavior_OvertakerCommunicatorMain;
model Complex_OvertakerCommunicatorComponentBehavior_OvertakerCommunicatorMain
                                                                               extends
    Modelica_StateGraph2.PartialParallel(                                                                                   nEntry=2);
 // no annotations will be generated for complex states
 // region declarations
 OvertakerCommunicator_pOvertaker.OvertakerCommunicator_pOvertaker region_1_overtakerCommunicator_pOvertaker(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 OvertakerCommunicator_pDelegator.OvertakerCommunicator_pDelegator region_2_overtakerCommunicator_pDelegator(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 // end region declarations
 // entry point input declarations
 // end entry point input declarations
equation
  // connect to the initial states of the region statecharts
  connect(entry[2],
    region_1_overtakerCommunicator_pOvertaker.inPort[1])
   annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
  connect(entry[1],
    region_2_overtakerCommunicator_pDelegator.inPort[1])
   annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
  // end connect to the initial states of the region statecharts
  // connect entry point ports with the corresponding entry point ports of the regions
  // end connect entry point ports with the corresponding entry point ports of the regions
end Complex_OvertakerCommunicatorComponentBehavior_OvertakerCommunicatorMain;
