within Root_cic.Overtaker.OvertakerDriver;
model OvertakerDriver
  // port declarations
  Modelica.Blocks.Interfaces.RealInput distancePort
   annotation (Placement(transformation(extent={{19.049999999999997, -6.350000000000001},{44.44999999999999, 6.349999999999998}})));
  Modelica.Blocks.Interfaces.RealOutput leftVelocityPort
   annotation (Placement(transformation(extent={{-12.700000000000003, -6.350000000000001},{12.700000000000003, 6.349999999999998}})));
  Modelica.Blocks.Interfaces.RealOutput rightVelocityPort
   annotation (Placement(transformation(extent={{82.55000000000001, -6.350000000000001},{107.94999999999999, 6.349999999999998}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakerDriver_pDetector_executeOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-44.45, -6.350000000000001},{-19.049999999999997, 6.349999999999998}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerDriver_pDetector_initiateOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-107.94999999999999, -6.350000000000001},{-82.54999999999998, 6.349999999999998}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerDriver_pDetector_executedOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-76.19999999999999, -6.350000000000001},{-50.8, 6.349999999999998}})));

  Modelica.Blocks.Interfaces.IntegerInput colorPort
   annotation (Placement(transformation(extent={{50.80000000000001, -6.350000000000001},{76.19999999999999, 6.349999999999998}})));
  // end port declarations
  // the behavior of the atomic component
  OvertakerDriveControlComponentBehavior.OvertakerDriveControlComponentBehavior
                                                                                behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    connect(behavior.overtakerDriver_pDetector_initiateOvertaking_outputDelegationPort,
     overtakerDriver_pDetector_initiateOvertaking_outputDelegationPort)
     annotation(Line(points={{21.8,16.35},{-95.25,-1.33227e-15}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakerDriver_pDetector_executedOvertaking_outputDelegationPort,
     overtakerDriver_pDetector_executedOvertaking_outputDelegationPort)
     annotation(Line(points={{21.8,16.35},{-63.5,-1.33227e-15}},
                                           color={0,0,0},smooth=Smooth.None));
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    connect(distancePort,
     behavior.distancePort)
     annotation(Line(points={{31.75,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(leftVelocityPort,
     behavior.leftVelocityPort)
     annotation(Line(points={{0,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(rightVelocityPort,
     behavior.rightVelocityPort)
     annotation(Line(points={{95.25,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    connect(colorPort,
     behavior.colorPort)
     annotation(Line(points={{63.5,0},{23.5,16.5}},
                                           color={0,0,0},smooth=Smooth.None));
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-107.94999999999999, -6.350000000000001},{107.94999999999999, 6.350000000000001}})));
end OvertakerDriver;
