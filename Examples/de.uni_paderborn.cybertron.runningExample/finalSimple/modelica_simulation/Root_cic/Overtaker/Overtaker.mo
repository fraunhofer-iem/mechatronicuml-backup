within Root_cic.Overtaker;
model Overtaker
  // part declarations
  Overtaker_lineFollower.Overtaker_lineFollower overtaker_lineFollower
  annotation (Placement(transformation(extent={{66.67499999999998, 30.33888888888889},{92.07499999999999, 43.03888888888889}})));
  OvertakerDriver.OvertakerDriver overtakerDriver
  annotation (Placement(transformation(extent={{-92.07499999999999, 4.938888888888897},{123.82499999999999, 17.6388888888889}})));
  OvertakerCommunicator.OvertakerCommunicator overtakerCommunicator
  annotation (Placement(transformation(extent={{-123.82499999999999, -20.4611111111111},{60.32499999999999, -7.761111111111106}})));
  //Start of user code CONTINUOUS_Part_Declarations

    //End of user code
  // end part declarations
  // port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtaker1_acceptOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{19.049999999999997, -6.349999999999998},{44.45, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtaker1_requestOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-12.699999999999992, -6.349999999999998},{12.700000000000003, 6.350000000000001}}),
        iconTransformation(extent={{-16.7,-6.35},{8.7,6.35}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtaker1_finishedOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-44.44999999999999, -6.349999999999998},{-19.04999999999999, 6.350000000000001}}),
        iconTransformation(extent={{-34.45,-4.35},{-18,4}})));

  // end port declarations
  Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a annotation (Placement(
        transformation(extent={{-70,-12},{-38,20}}), iconTransformation(extent=
            {{-46,-4},{-36,6}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Examples.Application.Parts.Robot_V3
    robot_V3_1
    annotation (Placement(transformation(extent={{-58,-62},{-28,-42}})));
protected
  Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a1 annotation (
      Placement(transformation(extent={{-69.6,-15.6},{-66.4,-12.4}})));
public
  Modelica.Blocks.Interfaces.RealInput u annotation (Placement(
        transformation(extent={{-22,-46},{18,-6}}), iconTransformation(extent={
            {12,-4},{18,2}})));
equation
   // connect assemblies
   connect(overtakerDriver.overtakerDriver_pDetector_initiateOvertaking_outputDelegationPort,
    overtakerCommunicator.overtakerCommunicator_pDelegator_initiateOvertaking_inputDelegationPort)
    annotation (Line(points={{-79.375,11.2889},{-79.375,11.2889},{-79.375,
          -14.1111},{-79.375,-14.1111}},                                                                                          color={0,0,0}, smooth=Smooth.None));
   connect(overtakerDriver.overtakerDriver_pDetector_executedOvertaking_outputDelegationPort,
    overtakerCommunicator.overtakerCommunicator_pDelegator_executedOvertaking_inputDelegationPort)
    annotation (Line(points={{-47.625,11.2889},{-47.625,11.2889},{-47.625,
          -14.1111},{-47.625,-14.1111}},                                                                                          color={0,0,0}, smooth=Smooth.None));

   connect(overtakerCommunicator.overtakerCommunicator_pDelegator_executeOvertaking_outputDelegationPort,
    overtakerDriver.overtakerDriver_pDetector_executeOvertaking_inputDelegationPort)
    annotation (Line(points={{-15.875,-14.1111},{-15.875,-14.1111},{-15.875,
          11.2889},{-15.875,11.2889}},                                                                                           color={0,0,0}, smooth=Smooth.None));

   connect(overtaker_lineFollower.lightPort,
    overtakerDriver.colorPort)
    annotation(Line(points={{79.375,36.6889},{79.375,11.2889}},
                                          color={0,0,0},smooth=Smooth.None));
   //generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
  //end user defined areaEnd of user code
   // end connect assemblies
   // connect delegations
   connect(overtakerCommunicator.overtakerCommunicator_pOvertaker_acceptOvertaking_inputDelegationPort,
    overtaker1_acceptOvertaking_inputDelegationPort)
    annotation(Line(points={{-111.125,-14.1111},{31.75,2.22045e-15}},
                                          color={0,0,0},smooth=Smooth.None));

   connect(overtakerCommunicator.overtakerCommunicator_pOvertaker_requestOvertaking_outputDelegationPort,
    overtaker1_requestOvertaking_outputDelegationPort)
    annotation(Line(points={{15.875,-14.1111},{5.32907e-15,2.22045e-15}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(overtakerCommunicator.overtakerCommunicator_pOvertaker_finishedOvertaking_outputDelegationPort,
    overtaker1_finishedOvertaking_outputDelegationPort)
    annotation(Line(points={{47.625,-14.1111},{-31.75,2.22045e-15}},
                                          color={0,0,0},smooth=Smooth.None));

   // end connect delegations
  connect(overtakerDriver.rightVelocityPort, robot_V3_1.omegaR_des) annotation (
     Line(
      points={{111.125,11.2889},{31.5625,11.2889},{31.5625,-52},{-29,-52}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(overtakerDriver.leftVelocityPort, robot_V3_1.omegaL_des) annotation (
      Line(
      points={{15.875,11.2889},{-99.0625,11.2889},{-99.0625,-52},{-57,-52}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(frame_a, robot_V3_1.Frame) annotation (Line(
      points={{-54,4},{-70,4},{-70,-46},{-43,-46}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  connect(frame_a, frame_a1) annotation (Line(
      points={{-54,4},{-78,4},{-78,-14},{-68,-14}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  connect(overtakerDriver.distancePort, u) annotation (Line(
      points={{47.625,11.2889},{47.625,-16.3556},{-2,-16.3556},{-2,-26}},
      color={255,127,0},
      smooth=Smooth.None));
 annotation (Icon(coordinateSystem(extent={{-44.45,-6.35},{44.45,6.35}},
          preserveAspectRatio=false), graphics),
             Diagram(coordinateSystem(extent={{-126.647,-45.8611},{126.647,45.8611}},
                       preserveAspectRatio=false), graphics));
end Overtaker;
