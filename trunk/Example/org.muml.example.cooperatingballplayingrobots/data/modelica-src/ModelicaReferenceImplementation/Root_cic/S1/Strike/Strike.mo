within Root_cic.S1.Strike;
model Strike
  // port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info1_transferBATInfo_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{-12.699999999999964, -6.35},{12.700000000000035, 6.35}})));

  // end port declarations
  // the behavior of the atomic component
  StrikeProcessing.StrikeProcessing behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    connect(behavior.BAT_Info1_transferBATInfo_inputDelegationPort,
     BAT_Info1_transferBATInfo_inputDelegationPort)
     annotation(Line(points={{21.8,16.35},{3.55271e-014,0}},
                                           color={0,0,0},smooth=Smooth.None));
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-12.700000000000003, -6.35},{12.700000000000003, 6.35}})));
end Strike;
