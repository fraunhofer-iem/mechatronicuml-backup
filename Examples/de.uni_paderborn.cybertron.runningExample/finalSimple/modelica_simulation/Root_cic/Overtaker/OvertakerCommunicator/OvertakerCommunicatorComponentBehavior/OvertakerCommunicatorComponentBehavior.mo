within Root_cic.Overtaker.OvertakerCommunicator.OvertakerCommunicatorComponentBehavior;
model OvertakerCommunicatorComponentBehavior
  // attribute declarations
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_OvertakerCommunicatorComponentBehavior_OvertakerCommunicatorMain.Complex_OvertakerCommunicatorComponentBehavior_OvertakerCommunicatorMain
                                                                                                        OvertakerCommunicatorMain(
   nIn=0,
   use_outPort=false,
   nSuspend=0,
   initialStep=true)
   annotation (Placement(transformation(extent={{0.0, 0.0},{25.4, 12.7}})));

  // end step declarations

  // variable declarations for do events
  // end variable declarations for do events

  // transition declarations
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
  // trigger message event delegation port declarations for region overtakerCommunicator_pOvertaker
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakerCommunicator_pOvertaker_acceptOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end trigger message event delegation port declarations for region overtakerCommunicator_pOvertaker
  // raise message event delegation port declarations for region overtakerCommunicator_pOvertaker
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerCommunicator_pOvertaker_finishedOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerCommunicator_pOvertaker_requestOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region overtakerCommunicator_pOvertaker	// trigger message event delegation port declarations for region overtakerCommunicator_pDelegator
   RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                         overtakerCommunicator_pDelegator_initiateOvertaking_inputDelegationPort(
    redeclare Integer integers[0],
    redeclare Boolean booleans[0],
    redeclare Real reals[0])
    annotation(Placement(transformation(extent={{0,0},{18,18}})));
   RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                         overtakerCommunicator_pDelegator_executedOvertaking_inputDelegationPort(
    redeclare Integer integers[0],
    redeclare Boolean booleans[0],
    redeclare Real reals[0])
    annotation(Placement(transformation(extent={{0,0},{18,18}})));
   // end trigger message event delegation port declarations for region overtakerCommunicator_pDelegator
  // raise message event delegation port declarations for region overtakerCommunicator_pDelegator
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerCommunicator_pDelegator_executeOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region overtakerCommunicator_pDelegator
equation

   // connect transition
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
   // connect clock resets
   // end connect clock resets
   // connect synchronization channels
   connect(OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.transition_Init_1_InitiationReceived.sender[1],
    OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.transition_Init_1_Requested.receiver[1]);
   connect(OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.transition_Requested_1_Overtaking.sender[1],
    OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.transition_InitiationReceived_1_Executing.receiver[1]);
   connect(OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.transition_Executing_1_Init.sender[1],
    OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.transition_Overtaking_1_Init.receiver[1]);
   // end connect synchronization channels
   // connect hybrid ports
   // end connect hybrid ports
   // trigger message event port delegations for region overtakerCommunicator_pOvertaker
   connect(OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.acceptOvertaking_inputDelegationPort,
    overtakerCommunicator_pOvertaker_acceptOvertaking_inputDelegationPort);
   // end trigger message event port delegations for region overtakerCommunicator_pOvertaker
   // raise message event port delegations for region overtakerCommunicator_pOvertaker
   connect(overtakerCommunicator_pOvertaker_finishedOvertaking_outputDelegationPort,
    OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.finishedOvertaking_outputDelegationPort);
   connect(overtakerCommunicator_pOvertaker_requestOvertaking_outputDelegationPort,
    OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.requestOvertaking_outputDelegationPort);
   // end raise message event port delegations for region overtakerCommunicator_pOvertaker
   // trigger message event port delegations for region overtakerCommunicator_pDelegator
   connect(OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.initiateOvertaking_inputDelegationPort,
    overtakerCommunicator_pDelegator_initiateOvertaking_inputDelegationPort);
   connect(OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.executedOvertaking_inputDelegationPort,
    overtakerCommunicator_pDelegator_executedOvertaking_inputDelegationPort);
   // end trigger message event port delegations for region overtakerCommunicator_pDelegator
   // raise message event port delegations for region overtakerCommunicator_pDelegator
   connect(overtakerCommunicator_pDelegator_executeOvertaking_outputDelegationPort,
    OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.executeOvertaking_outputDelegationPort);
   // end raise message event port delegations for region overtakerCommunicator_pDelegator

  // hybrid port sample value variable equations
  // end hybrid port sample value variable equations
algorithm
   // state exit actions
   // end state exit actions
   // assign trigger message parameter bindings to the corresponding parameter binding variables
   when OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.transition_Init_1_InitiationReceived.fire then
   end when;
   when OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.transition_Requested_1_Overtaking.fire then
   end when;
   when OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.transition_Executing_1_Init.fire then
   end when;
   // end trigger message parameter bindings to the corresponding parameter binding variables
   // transition actions
   // end transition actions
   // assign parameter binding variables
   when OvertakerCommunicatorMain.region_2_overtakerCommunicator_pDelegator.transition_InitiationReceived_1_Executing.fire then
   end when;
   when OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.transition_Overtaking_1_Init.fire then
   end when;
   when OvertakerCommunicatorMain.region_1_overtakerCommunicator_pOvertaker.transition_Init_1_Requested.fire then
   end when;
   // end assign parameter binding variables
   // state entry actions
   // end state entry actions
   // do event actions
   // end do event actions
 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end OvertakerCommunicatorComponentBehavior;

