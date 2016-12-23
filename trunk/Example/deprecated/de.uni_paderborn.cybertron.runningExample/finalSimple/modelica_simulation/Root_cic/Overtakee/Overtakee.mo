within Root_cic.Overtakee;
model Overtakee
  // part declarations
  Overtakee_lineFollower.Overtakee_lineFollower overtakee_lineFollower
  annotation (Placement(transformation(extent={{3.174999999999997, -31.749999999999993},{28.57499999999999, -19.049999999999997}})));
  OvertakeeDriver.OvertakeeDriver overtakeeDriver
  annotation (Placement(transformation(extent={{3.174999999999997, -6.349999999999994},{92.07499999999999, 6.350000000000001}})));
  OvertakeeCommunicator.OvertakeeCommunicator overtakeeCommunicator
  annotation (Placement(transformation(extent={{-92.07499999999999, -6.349999999999994},{-3.1750000000000114, 6.350000000000001}})));
  //Start of user code CONTINUOUS_Part_Declarations

    //End of user code
  // end part declarations
  // port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakee1_requestOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-36.7,21.65},{-11.3,34.35}}),
        iconTransformation(extent={{-12.7,-6.35},{12.7,6.35}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakee1_finishedOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{19.55,-6.35},{44.95,6.35}}),
        iconTransformation(extent={{19.55,-6.35},{44.95,6.35}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakee1_acceptOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-38.95,-10.35},{-13.55,2.35}}),
        iconTransformation(extent={{-26,-4},{-13.55,2.35}})));

  // end port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Examples.Application.Parts.Robot_V3
    robot_V3_1(xstart_wmr=0.3)
    annotation (Placement(transformation(extent={{-76,-64},{-46,-44}})));
  Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a annotation (Placement(
        transformation(extent={{-102,-48},{-70,-16}}), iconTransformation(
          extent={{-44,-4},{-34,6}})));
equation
   // connect assemblies
   connect(overtakeeDriver.colorPort,
    overtakee_lineFollower.lightPort)
    annotation(Line(points={{15.875,0},{15.875,-25.4}},
                                          color={0,0,0},smooth=Smooth.None));
   //generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
  //end user defined areaEnd of user code
   // end connect assemblies
   // connect delegations
   connect(overtakeeCommunicator.overtakeeCommunicator_pOvertakee_requestOvertaking_inputDelegationPort,
    overtakee1_requestOvertaking_inputDelegationPort)
    annotation(Line(points={{-15.875,0},{-24,28}},
                                          color={0,0,0},smooth=Smooth.None));
   connect(overtakeeCommunicator.overtakeeCommunicator_pOvertakee_finishedOvertaking_inputDelegationPort,
    overtakee1_finishedOvertaking_inputDelegationPort)
    annotation(Line(points={{-47.625,0},{32.25,0}},
                                          color={0,0,0},smooth=Smooth.None));

   connect(overtakeeCommunicator.overtakeeCommunicator_pOvertakee_acceptOvertaking_outputDelegationPort,
    overtakee1_acceptOvertaking_outputDelegationPort)
    annotation(Line(points={{-79.375,0},{-26.25,-4}},
                                          color={0,0,0},smooth=Smooth.None));

   // end connect delegations
  connect(robot_V3_1.omegaR_des, overtakeeDriver.rightVelocityPort) annotation (
     Line(
      points={{-47,-54},{-2,-54},{-2,5.32907e-15},{47.625,5.32907e-15}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(overtakeeDriver.leftVelocityPort, robot_V3_1.omegaL_des) annotation (
      Line(
      points={{79.375,0},{2,0},{2,-54},{-75,-54}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(frame_a, robot_V3_1.Frame) annotation (Line(
      points={{-86,-32},{-74,-32},{-74,-48},{-61,-48}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
 annotation (Icon(coordinateSystem(extent={{-44.45,-6.35},{44.45,6.35}},
          preserveAspectRatio=false), graphics),
             Diagram(coordinateSystem(extent={{-94.8972,-34.5722},{94.8972,
            34.5722}}, preserveAspectRatio=false), graphics));
end Overtakee;
