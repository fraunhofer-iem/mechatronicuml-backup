within Root_cic.Overtakee.OvertakeeCommunicator.OvertakeeCommunicatorComponentBehavior;
model OvertakeeCommunicatorComponentBehavior
  // attribute declarations
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_OvertakeeCommunicatorComponentBehavior_OvertakeeCommunicatorMain.Complex_OvertakeeCommunicatorComponentBehavior_OvertakeeCommunicatorMain
                                                                                                        OvertakeeCommunicatorMain(
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
  // trigger message event delegation port declarations for region overtakeeCommunicator_pOvertakee
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakeeCommunicator_pOvertakee_requestOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        overtakeeCommunicator_pOvertakee_finishedOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end trigger message event delegation port declarations for region overtakeeCommunicator_pOvertakee
  // raise message event delegation port declarations for region overtakeeCommunicator_pOvertakee
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakeeCommunicator_pOvertakee_acceptOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region overtakeeCommunicator_pOvertakee
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
   // end connect synchronization channels
   // connect hybrid ports
   // end connect hybrid ports
   // trigger message event port delegations for region overtakeeCommunicator_pOvertakee
   connect(OvertakeeCommunicatorMain.region_1_overtakeeCommunicator_pOvertakee.requestOvertaking_inputDelegationPort,
    overtakeeCommunicator_pOvertakee_requestOvertaking_inputDelegationPort);
   connect(OvertakeeCommunicatorMain.region_1_overtakeeCommunicator_pOvertakee.finishedOvertaking_inputDelegationPort,
    overtakeeCommunicator_pOvertakee_finishedOvertaking_inputDelegationPort);
   // end trigger message event port delegations for region overtakeeCommunicator_pOvertakee
   // raise message event port delegations for region overtakeeCommunicator_pOvertakee
   connect(overtakeeCommunicator_pOvertakee_acceptOvertaking_outputDelegationPort,
    OvertakeeCommunicatorMain.region_1_overtakeeCommunicator_pOvertakee.acceptOvertaking_outputDelegationPort);
   // end raise message event port delegations for region overtakeeCommunicator_pOvertakee

  // hybrid port sample value variable equations
  // end hybrid port sample value variable equations
algorithm
   // state exit actions
   // end state exit actions
   // assign trigger message parameter bindings to the corresponding parameter binding variables
   when OvertakeeCommunicatorMain.region_1_overtakeeCommunicator_pOvertakee.transition_Init_1_Requested.fire then
   end when;
   when OvertakeeCommunicatorMain.region_1_overtakeeCommunicator_pOvertakee.transition_Overtaking_1_Init.fire then
   end when;
   // end trigger message parameter bindings to the corresponding parameter binding variables
   // transition actions
   // end transition actions
   // assign parameter binding variables
   when OvertakeeCommunicatorMain.region_1_overtakeeCommunicator_pOvertakee.transition_Requested_1_Overtaking.fire then
   end when;
   // end assign parameter binding variables
   // state entry actions
   // end state entry actions
   // do event actions
   // end do event actions
 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end OvertakeeCommunicatorComponentBehavior;

