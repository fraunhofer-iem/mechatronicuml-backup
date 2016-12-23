within Root_cic.Overtaker.OvertakerCommunicator;
model OvertakerCommunicator
  // port declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakerCommunicator_pDelegator_initiateOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-60.32499999999999, -6.349999999999998},{-34.925, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakerCommunicator_pDelegator_executedOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-28.575000000000003, -6.349999999999998},{-3.174999999999997, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerCommunicator_pDelegator_executeOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{3.174999999999997, -6.349999999999998},{28.575000000000003, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakerCommunicator_pOvertaker_acceptOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{-92.07499999999999, -6.349999999999998},{-66.67499999999998, 6.350000000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerCommunicator_pOvertaker_requestOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{34.925, -6.349999999999998},{60.32499999999999, 6.350000000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerCommunicator_pOvertaker_finishedOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{66.67500000000001, -6.349999999999998},{92.07499999999999, 6.350000000000001}})));

  // end port declarations
  // the behavior of the atomic component
  OvertakerCommunicatorComponentBehavior.OvertakerCommunicatorComponentBehavior
                                                                                behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    connect(behavior.overtakerCommunicator_pDelegator_initiateOvertaking_inputDelegationPort,
     overtakerCommunicator_pDelegator_initiateOvertaking_inputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakerCommunicator_pDelegator_executedOvertaking_inputDelegationPort,
     overtakerCommunicator_pDelegator_executedOvertaking_inputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakerCommunicator_pDelegator_executeOvertaking_outputDelegationPort,
     overtakerCommunicator_pDelegator_executeOvertaking_outputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakerCommunicator_pOvertaker_acceptOvertaking_inputDelegationPort,
     overtakerCommunicator_pOvertaker_acceptOvertaking_inputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakerCommunicator_pOvertaker_requestOvertaking_outputDelegationPort,
     overtakerCommunicator_pOvertaker_requestOvertaking_outputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(behavior.overtakerCommunicator_pOvertaker_finishedOvertaking_outputDelegationPort,
     overtakerCommunicator_pOvertaker_finishedOvertaking_outputDelegationPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-92.07499999999999, -6.349999999999998},{92.07499999999999, 6.349999999999998}})));
end OvertakerCommunicator;
