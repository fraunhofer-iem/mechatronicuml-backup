within Root_cic.S1.Sensor;
model Sensor
  // port declarations
  Modelica.Blocks.Interfaces.RealInput posXPort
   annotation (Placement(transformation(extent={{19.050000000000026, -6.350000000000001},{44.45000000000002, 6.349999999999998}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info1_transferBATInfo_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{-107.94999999999995, -6.350000000000001},{-82.54999999999995, 6.349999999999998}})));

  Modelica.Blocks.Interfaces.BooleanInput ballRecognizedPort
   annotation (Placement(transformation(extent={{-44.44999999999996, -6.350000000000001},{-19.049999999999955, 6.349999999999998}})));
  Modelica.Blocks.Interfaces.RealInput velocityPort
   annotation (Placement(transformation(extent={{50.80000000000004, -6.350000000000001},{76.20000000000002, 6.349999999999998}})));
  Modelica.Blocks.Interfaces.RealInput timeOfArrivalPort
   annotation (Placement(transformation(extent={{82.55000000000007, -6.350000000000001},{107.95000000000005, 6.349999999999998}})));
  Modelica.Blocks.Interfaces.RealInput posZPort
   annotation (Placement(transformation(extent={{-76.19999999999995, -6.350000000000001},{-50.799999999999955, 6.349999999999998}})));
  Modelica.Blocks.Interfaces.RealInput posYPort
   annotation (Placement(transformation(extent={{-12.699999999999946, -6.350000000000001},{12.70000000000006, 6.349999999999998}})));
  // end port declarations
  // the behavior of the atomic component
  SensorProcessing.SensorProcessing behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    connect(behavior.BAT_Info1_transferBATInfo_outputDelegationPort,
     BAT_Info1_transferBATInfo_outputDelegationPort)
     annotation(Line(points={{18.2,15.45},{-95.25,-1.77636e-015}},
                                           color={0,0,0},smooth=Smooth.None));
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    connect(posXPort,
     behavior.posXPort)
     annotation(Line(points={{31.75,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(ballRecognizedPort,
     behavior.ballRecognizedPort)
     annotation(Line(points={{-31.75,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(velocityPort,
     behavior.velocityPort)
     annotation(Line(points={{63.5,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(timeOfArrivalPort,
     behavior.timeOfArrivalPort)
     annotation(Line(points={{95.25,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(posZPort,
     behavior.posZPort)
     annotation(Line(points={{-63.5,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(posYPort,
     behavior.posYPort)
     annotation(Line(points={{0,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-107.94999999999999, -6.350000000000001},{107.94999999999999, 6.350000000000001}})));
end Sensor;
