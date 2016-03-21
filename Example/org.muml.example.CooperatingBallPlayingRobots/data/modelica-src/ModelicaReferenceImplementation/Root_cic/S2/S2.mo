within Root_cic.S2;
model S2
  // part declarations
  Strike.Strike strike
  annotation (Placement(transformation(extent={{-76.20000000000002, -43.03888888888888},{-50.80000000000001, -30.33888888888888}})));
  Sensor.Sensor sensor
  annotation (Placement(transformation(extent={{-12.700000000000017, 7.76111111111112},{203.19999999999996, 20.461111111111123}})));
  Main.Main main
  annotation (Placement(transformation(extent={{-203.2, -17.63888888888888},{44.44999999999999, -4.938888888888883}})));
  //Start of user code CONTINUOUS_Part_Declarations

    //End of user code
  // end part declarations
  // port declarations
  Modelica.Blocks.Interfaces.BooleanInput ballRecognizedPort
   annotation (Placement(transformation(extent={{-28.57499999999999, -6.35},{-3.1750000000000114, 6.35}})));
  Modelica.Blocks.Interfaces.BooleanInput isMasterPort
   annotation (Placement(transformation(extent={{-123.825, -6.35},{-98.425, 6.35}})));
  Modelica.Blocks.Interfaces.RealInput posXPort
   annotation (Placement(transformation(extent={{-155.575, -6.35},{-130.175, 6.35}})));
  Modelica.Blocks.Interfaces.RealInput posYPort
   annotation (Placement(transformation(extent={{34.92500000000001, -6.35},{60.32499999999999, 6.35}})));
  Modelica.Blocks.Interfaces.BooleanInput stopPlayingPort
   annotation (Placement(transformation(extent={{-60.325, -6.35},{-34.92500000000001, 6.35}})));
  Modelica.Blocks.Interfaces.RealInput velocityPort
   annotation (Placement(transformation(extent={{-92.075, -6.35},{-66.675, 6.35}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Information_To_OtherRobot1_turn_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{161.925, -6.35},{187.325, 6.35}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Information_To_OtherRobot1_stopPlaying_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{130.175, -6.35},{155.575, 6.35}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Information_To_OtherRobot1_turn_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{98.42500000000001, -6.35},{123.82499999999999, 6.35}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Information_To_OtherRobot1_stopPlaying_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{66.67500000000001, -6.35},{92.07499999999999, 6.35}})));

  Modelica.Blocks.Interfaces.RealInput posZPort
   annotation (Placement(transformation(extent={{-187.325, -6.35},{-161.92499999999998, 6.35}})));
  Modelica.Blocks.Interfaces.RealInput timeOfArrivalPort
   annotation (Placement(transformation(extent={{3.1750000000000114, -6.35},{28.57499999999999, 6.35}})));
  // end port declarations
equation
   // connect assemblies
   connect(main.BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort,
    strike.BAT_Info1_transferBATInfo_inputDelegationPort)
    annotation (Line(points={{-63.5,-11.2889},{-63.5,-11.2889},{-63.5,-36.6889},
          {-63.5,-36.6889}},                                                                                                    color={0,0,0}, smooth=Smooth.None));

   connect(sensor.BAT_Info1_transferBATInfo_outputDelegationPort,
    main.BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort)
    annotation (Line(points={{31.75,14.1111},{31.75,14.1111},{31.75,-11.2889},{
          31.75,-11.2889}},                                                                                              color={0,0,0}, smooth=Smooth.None));

   //generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
  //end user defined areaEnd of user code
   // end connect assemblies
   // connect delegations
   connect(ballRecognizedPort,
    sensor.ballRecognizedPort)
    annotation(Line(points={{-15.875,0},{1.42109e-014,14.1111}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(isMasterPort,
    main.isMasterPort)
    annotation(Line(points={{-111.125,0},{-158.75,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(main.stopPlayingPort,
    stopPlayingPort)
    annotation(Line(points={{-31.75,-11.2889},{-47.625,0}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(posXPort,
    sensor.posXPort)
    annotation(Line(points={{-142.875,0},{127,14.1111}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(sensor.velocityPort,
    velocityPort)
    annotation(Line(points={{95.25,14.1111},{-79.375,0}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(posYPort,
    sensor.posYPort)
    annotation(Line(points={{47.625,0},{63.5,14.1111}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(sensor.timeOfArrivalPort,
    timeOfArrivalPort)
    annotation(Line(points={{158.75,14.1111},{15.875,0}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(sensor.posZPort,
    posZPort)
    annotation(Line(points={{190.5,14.1111},{-174.625,0}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(BAT_Information_To_OtherRobot1_turn_inputDelegationPort,
    main.BAT_Info_To_OtherRobot1_turn_inputDelegationPort)
    annotation(Line(points={{174.625,0},{-190.5,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(BAT_Information_To_OtherRobot1_stopPlaying_inputDelegationPort,
    main.BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort)
    annotation(Line(points={{142.875,0},{0,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));

   connect(BAT_Information_To_OtherRobot1_turn_outputDelegationPort,
    main.BAT_Info_To_OtherRobot1_turn_outputDelegationPort)
    annotation(Line(points={{111.125,0},{-95.25,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(BAT_Information_To_OtherRobot1_stopPlaying_outputDelegationPort,
    main.BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort)
    annotation(Line(points={{79.375,0},{-127,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));

   // end connect delegations
 annotation (Icon(coordinateSystem(extent = {{-187.325, -6.35},{187.325, 6.35}})),
             Diagram(coordinateSystem(extent = {{-206.0222222222222, -45.8611111111111}, {206.0222222222222, 45.8611111111111}})));
end S2;
