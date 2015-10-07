within Root_cic.S2.Strike.StrikeProcessing;
model StrikeProcessing
  // attribute declarations
  inner Real  velocity;
  inner Real  posX;
  inner Real  posY;
  inner Real  posZ;
  inner Real  timeOfArrival;
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_StrikeProcessing_Init.Complex_StrikeProcessing_Init Init(
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
  // trigger message event delegation port declarations for region BAT_Info1
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info1_transferBATInfo_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end trigger message event delegation port declarations for region BAT_Info1

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
   // trigger message event port delegations for region BAT_Info1
   connect(Init.region_1_BAT_Info1.transferBATInfo_inputDelegationPort,
    BAT_Info1_transferBATInfo_inputDelegationPort);
   // end trigger message event port delegations for region BAT_Info1
   // raise message event port delegations for region BAT_Info1
   // end raise message event port delegations for region BAT_Info1

  // hybrid port sample value variable equations
  // end hybrid port sample value variable equations
algorithm
   // state exit actions
   // end state exit actions
   // assign trigger message parameter bindings to the corresponding parameter binding variables
   when Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.fire then
    Init.region_1_BAT_Info1.mailbox_transferBATInfo_posX := Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.transition_input_port[1].reals[1];
    Init.region_1_BAT_Info1.mailbox_transferBATInfo_posY := Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.transition_input_port[1].reals[2];
    Init.region_1_BAT_Info1.mailbox_transferBATInfo_posZ := Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.transition_input_port[1].reals[3];
    Init.region_1_BAT_Info1.mailbox_transferBATInfo_timeOfArrival := Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.transition_input_port[1].reals[4];
    Init.region_1_BAT_Info1.mailbox_transferBATInfo_velocity := Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.transition_input_port[1].reals[5];
   end when;
   // end trigger message parameter bindings to the corresponding parameter binding variables
   // transition actions
   when pre(Init.region_1_BAT_Info1.transition_Receiving_1_Receiving.fire) then
    posX := Init.region_1_BAT_Info1.mailbox_transferBATInfo_posX;
    posY := Init.region_1_BAT_Info1.mailbox_transferBATInfo_posY;
    posZ := Init.region_1_BAT_Info1.mailbox_transferBATInfo_posZ;
    timeOfArrival := Init.region_1_BAT_Info1.mailbox_transferBATInfo_timeOfArrival;
    velocity := Init.region_1_BAT_Info1.mailbox_transferBATInfo_velocity;

   end when;
   // end transition actions
   // assign parameter binding variables
   // end assign parameter binding variables
   // state entry actions
   // end state entry actions
   // do event actions
   // end do event actions

 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end StrikeProcessing;

