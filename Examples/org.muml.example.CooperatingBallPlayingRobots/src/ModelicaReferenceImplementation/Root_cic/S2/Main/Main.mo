within Root_cic.S2.Main;
model Main
  // port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{98.42500000000001, -6.349999999999998},{123.82499999999999, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info_To_OtherRobot1_turn_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{-123.82499999999999, -6.349999999999998},{-98.42499999999998, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{66.67500000000001, -6.349999999999998},{92.07499999999999, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info_To_OtherRobot1_turn_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{-28.575000000000003, -6.349999999999998},{-3.174999999999997, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-60.325, -6.349999999999998},{-34.925, 6.350000000000001}})));

  Modelica.Blocks.Interfaces.BooleanInput isMasterPort
   annotation (Placement(transformation(extent={{-92.07499999999999, -6.349999999999998},{-66.675, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.BooleanInput stopPlayingPort
   annotation (Placement(transformation(extent={{34.92500000000001, -6.349999999999998},{60.32499999999999, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{3.174999999999997, -6.349999999999998},{28.57499999999999, 6.350000000000001}})));

  // end port declarations
  // the behavior of the atomic component
  MainProcessing.MainProcessing behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    connect(behavior.BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort,
     BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort)
     annotation(Line(points={{21.8,16.35},{111.125,1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(behavior.BAT_Info_To_OtherRobot1_turn_inputDelegationPort,
     BAT_Info_To_OtherRobot1_turn_inputDelegationPort)
     annotation(Line(points={{21.8,16.35},{-111.125,1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(behavior.BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort,
     BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort)
     annotation(Line(points={{21.8,16.35},{79.375,1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(behavior.BAT_Info_To_OtherRobot1_turn_outputDelegationPort,
     BAT_Info_To_OtherRobot1_turn_outputDelegationPort)
     annotation(Line(points={{21.8,16.35},{-15.875,1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(behavior.BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort,
     BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort)
     annotation(Line(points={{21.8,16.35},{-47.625,1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(behavior.BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort,
     BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort)
     annotation(Line(points={{21.8,16.35},{15.875,1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    connect(isMasterPort,
     behavior.isMasterPort)
     annotation(Line(points={{-79.375,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(stopPlayingPort,
     behavior.stopPlayingPort)
     annotation(Line(points={{47.625,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-123.82499999999999, -6.349999999999998},{123.82499999999999, 6.349999999999998}})));
end Main;
