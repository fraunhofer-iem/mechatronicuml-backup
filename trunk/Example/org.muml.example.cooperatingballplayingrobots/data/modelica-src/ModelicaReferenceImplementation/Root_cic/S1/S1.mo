within Root_cic.S1;
model S1
  // part declarations
  Strike.Strike strike
  annotation (Placement(transformation(extent={{11.112499999999983, -43.03888888888888},{36.51249999999999, -30.33888888888888}})));
  Sensor.Sensor sensor
  annotation (Placement(transformation(extent={{-4.762500000000017, 7.76111111111112},{211.13749999999996, 20.461111111111123}})));
  Main.Main main
  annotation (Placement(transformation(extent={{-211.1375, -17.63888888888888},{36.51249999999999, -4.938888888888883}})));
  //Start of user code CONTINUOUS_Part_Declarations

    //End of user code
  // end part declarations
  // port declarations
  Modelica.Blocks.Interfaces.BooleanInput ballRecognizedPort
   annotation (Placement(transformation(extent={{3.1750000000000114, -6.349999999999998},{28.57499999999999, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.RealInput velocityPort
   annotation (Placement(transformation(extent={{-155.575, -6.349999999999998},{-130.175, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.RealInput posXPort
   annotation (Placement(transformation(extent={{-187.325, -6.349999999999998},{-161.92499999999998, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.RealInput posZPort
   annotation (Placement(transformation(extent={{-28.57499999999999, -6.349999999999998},{-3.1750000000000114, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Information_To_OtherRobot1_turn_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{98.42500000000001, -6.349999999999998},{123.82499999999999, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Information_To_OtherRobot1_stopPlaying_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{66.67500000000001, -6.349999999999998},{92.07499999999999, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Information_To_OtherRobot1_turn_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{161.925, -6.349999999999998},{187.325, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Information_To_OtherRobot1_stopPlaying_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{130.175, -6.349999999999998},{155.575, 6.350000000000001}})));

  Modelica.Blocks.Interfaces.RealInput posYPort
   annotation (Placement(transformation(extent={{34.92500000000001, -6.349999999999998},{60.32499999999999, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.RealInput timeOfArrivalPort
   annotation (Placement(transformation(extent={{-60.325, -6.349999999999998},{-34.92500000000001, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.BooleanInput isMasterPort
   annotation (Placement(transformation(extent={{-92.075, -6.349999999999998},{-66.675, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.BooleanInput stopPlayingPort
   annotation (Placement(transformation(extent={{-123.825, -6.349999999999998},{-98.425, 6.350000000000001}})));
  // end port declarations
equation
   // connect assemblies
   connect(main.BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort,
    strike.BAT_Info1_transferBATInfo_inputDelegationPort)
    annotation (Line(points={{23.8125,-11.2889},{23.8125,-11.2889},{23.8125,
          -36.6889},{23.8125,-36.6889}},                                                                                          color={0,0,0}, smooth=Smooth.None));

   connect(sensor.BAT_Info1_transferBATInfo_outputDelegationPort,
    main.BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort)
    annotation (Line(points={{7.9375,14.1111},{7.9375,3.82764},{-7.9375,3.82764},
          {-7.9375,-11.2889}},                                                                                                    color={0,0,0}, smooth=Smooth.None));

   //generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
  //end user defined areaEnd of user code
   // end connect assemblies
   // connect delegations
   connect(isMasterPort,
    main.isMasterPort)
    annotation(Line(points={{-79.375,0},{-134.938,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(sensor.timeOfArrivalPort,
    timeOfArrivalPort)
    annotation(Line(points={{198.438,14.1111},{-47.625,1.77636e-015}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(BAT_Information_To_OtherRobot1_turn_inputDelegationPort,
    main.BAT_Info_To_OtherRobot1_turn_inputDelegationPort)
    annotation(Line(points={{111.125,0},{-71.4375,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(BAT_Information_To_OtherRobot1_stopPlaying_inputDelegationPort,
    main.BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort)
    annotation(Line(points={{79.375,0},{-198.438,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));

   connect(BAT_Information_To_OtherRobot1_turn_outputDelegationPort,
    main.BAT_Info_To_OtherRobot1_turn_outputDelegationPort)
    annotation(Line(points={{174.625,0},{-103.188,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(BAT_Information_To_OtherRobot1_stopPlaying_outputDelegationPort,
    main.BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort)
    annotation(Line(points={{142.875,0},{-166.688,-11.2889}},
                                          color={0,0,0},smooth=Smooth.None));

   connect(sensor.posZPort,
    posZPort)
    annotation(Line(points={{39.6875,14.1111},{-15.875,1.77636e-015}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(main.stopPlayingPort,
    stopPlayingPort)
    annotation(Line(points={{-39.6875,-11.2889},{-111.125,1.77636e-015}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(posYPort,
    sensor.posYPort)
    annotation(Line(points={{47.625,0},{103.188,14.1111}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(posXPort,
    sensor.posXPort)
    annotation(Line(points={{-174.625,0},{134.938,14.1111}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(sensor.velocityPort,
    velocityPort)
    annotation(Line(points={{166.688,14.1111},{-142.875,1.77636e-015}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(ballRecognizedPort,
    sensor.ballRecognizedPort)
    annotation(Line(points={{15.875,0},{71.4375,14.1111}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect delegations
 annotation (Icon(coordinateSystem(extent = {{-187.325, -6.349999999999998},{187.325, 6.349999999999998}})),
             Diagram(coordinateSystem(extent = {{-213.9597222222222, -45.8611111111111}, {213.9597222222222, 45.8611111111111}})));
end S1;
