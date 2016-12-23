within Root_cic.Overtakee.OvertakeeCommunicator;
model OvertakeeCommunicator
  // port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakeeCommunicator_pOvertakee_requestOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{19.049999999999997, -6.349999999999998},{44.45, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakeeCommunicator_pOvertakee_finishedOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-12.699999999999992, -6.349999999999998},{12.700000000000003, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakeeCommunicator_pOvertakee_acceptOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-44.44999999999999, -6.349999999999998},{-19.04999999999999, 6.350000000000001}})));

  // end port declarations
  // the behavior of the atomic component
  OvertakeeCommunicatorComponentBehavior.OvertakeeCommunicatorComponentBehavior
                                                                                behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    connect(behavior.overtakeeCommunicator_pOvertakee_requestOvertaking_inputDelegationPort,
     overtakeeCommunicator_pOvertakee_requestOvertaking_inputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakeeCommunicator_pOvertakee_finishedOvertaking_inputDelegationPort,
     overtakeeCommunicator_pOvertakee_finishedOvertaking_inputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakeeCommunicator_pOvertakee_acceptOvertaking_outputDelegationPort,
     overtakeeCommunicator_pOvertakee_acceptOvertaking_outputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-44.44999999999999, -6.349999999999998},{44.44999999999999, 6.349999999999998}})));
end OvertakeeCommunicator;
