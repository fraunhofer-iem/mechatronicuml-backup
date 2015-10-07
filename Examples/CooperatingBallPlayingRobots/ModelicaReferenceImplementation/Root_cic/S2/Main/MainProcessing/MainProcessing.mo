within Root_cic.S2.Main.MainProcessing;
model MainProcessing
  // attribute declarations
  inner Real  posZReceivedBySP;
  inner Boolean  BAT_Info_ReceivedBySP;
  inner Real  posYReceivedBySP;
  inner Real  velocityReceivedByRobot;
  inner Real  timeOfArrivalReceivedByRobot;
  inner Real  timeOfArrivalReceivedBySP;
  inner Boolean  BAT_Info_ReceivedByRobot;
  inner Real  posXReceivedByRobot;
  inner Real  posYReceivedByRobot;
  inner Real  posXReceivedBySP;
  inner Real  posZReceivedByRobot;
  inner Real  velocityReceivedBySP;
  // end attribute declarations
  // hybrid port declarations
 Modelica.Blocks.Interfaces.BooleanInput isMasterPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Boolean isMaster;
 Boolean isMaster_sampled;
 Modelica.Blocks.Interfaces.BooleanInput stopPlayingPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Boolean stopPlaying;
 Boolean stopPlaying_sampled;
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_MainProcessing_init.Complex_MainProcessing_init init(
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
  // trigger message event delegation port declarations for region BAT_Info_To_OtherRobot1
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        BAT_Info_To_OtherRobot1_turn_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end trigger message event delegation port declarations for region BAT_Info_To_OtherRobot1
  // raise message event delegation port declarations for region BAT_Info_To_OtherRobot1
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info_To_OtherRobot1_turn_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region BAT_Info_To_OtherRobot1        // trigger message event delegation port declarations for region BAT_Info_From_SensorProcessing1
   RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                         BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort(
    redeclare Integer integers[0],
    redeclare Boolean booleans[0],
    redeclare Real reals[5])
    annotation(Placement(transformation(extent={{0,0},{18,18}})));
   // end trigger message event delegation port declarations for region BAT_Info_From_SensorProcessing1

  // raise message event delegation port declarations for region BAT_Info_ToStrikeProcessing1
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region BAT_Info_ToStrikeProcessing1
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
   connect(init.region_1_BAT_Info_To_OtherRobot1.YourTurn.activePort,
    init.region_1_BAT_Info_To_OtherRobot1.c0.u[1]);
   connect(init.region_1_BAT_Info_To_OtherRobot1.MyTurn.activePort,
    init.region_1_BAT_Info_To_OtherRobot1.c0.u[2]);
   // end connect clock resets
   // connect synchronization channels
   // end connect synchronization channels
   // connect hybrid ports
   isMasterPort = isMaster_sampled;
   stopPlayingPort = stopPlaying_sampled;
   // end connect hybrid ports
   // trigger message event port delegations for region BAT_Info_To_OtherRobot1
   connect(init.region_1_BAT_Info_To_OtherRobot1.stopPlaying_inputDelegationPort,
    BAT_Info_To_OtherRobot1_stopPlaying_inputDelegationPort);
   connect(init.region_1_BAT_Info_To_OtherRobot1.turn_inputDelegationPort,
    BAT_Info_To_OtherRobot1_turn_inputDelegationPort);
   // end trigger message event port delegations for region BAT_Info_To_OtherRobot1
   // raise message event port delegations for region BAT_Info_To_OtherRobot1
   connect(BAT_Info_To_OtherRobot1_stopPlaying_outputDelegationPort,
    init.region_1_BAT_Info_To_OtherRobot1.stopPlaying_outputDelegationPort);
   connect(BAT_Info_To_OtherRobot1_turn_outputDelegationPort,
    init.region_1_BAT_Info_To_OtherRobot1.turn_outputDelegationPort);
   // end raise message event port delegations for region BAT_Info_To_OtherRobot1
   // trigger message event port delegations for region BAT_Info_From_SensorProcessing1
   connect(init.region_3_BAT_Info_From_SensorProcessing1.transferBATInfo_inputDelegationPort,
    BAT_Info_From_SensorProcessing1_transferBATInfo_inputDelegationPort);
   // end trigger message event port delegations for region BAT_Info_From_SensorProcessing1
   // raise message event port delegations for region BAT_Info_From_SensorProcessing1
   // end raise message event port delegations for region BAT_Info_From_SensorProcessing1
   // trigger message event port delegations for region BAT_Info_ToStrikeProcessing1
   // end trigger message event port delegations for region BAT_Info_ToStrikeProcessing1
   // raise message event port delegations for region BAT_Info_ToStrikeProcessing1
   connect(BAT_Info_ToStrikeProcessing1_transferBATInfo_outputDelegationPort,
    init.region_2_BAT_Info_ToStrikeProcessing1.transferBATInfo_outputDelegationPort);
   // end raise message event port delegations for region BAT_Info_ToStrikeProcessing1

  // hybrid port sample value variable equations
algorithm
  when sample(0, (10) * 0.001) then
   isMaster := isMaster_sampled;
  end when;
algorithm
  when sample(0, (10) * 0.001) then
   stopPlaying := stopPlaying_sampled;
  end when;
  // end hybrid port sample value variable equations
equation
   // state exit actions
   // end state exit actions
   // assign trigger message parameter bindings to the corresponding parameter binding variables
algorithm
   when init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_3_Init.fire then
   end when;
   when pre(init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.fire) then
    init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_posX := init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.transition_input_port[1].reals[1];
    init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_posY := init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.transition_input_port[1].reals[2];
    init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_posZ := init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.transition_input_port[1].reals[3];
    init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_timeOfArrival := init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.transition_input_port[1].reals[4];
    init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_velocity := init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.transition_input_port[1].reals[5];
   end when;
   when init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.fire then
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posX := init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.transition_input_port[1].reals[1];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posY := init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.transition_input_port[1].reals[2];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posZ := init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.transition_input_port[1].reals[3];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_timeOfArrival := init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.transition_input_port[1].reals[4];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_velocity := init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.transition_input_port[1].reals[5];
   end when;
   when init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.fire then
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posX := init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.transition_input_port[1].reals[1];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posY := init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.transition_input_port[1].reals[2];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posZ := init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.transition_input_port[1].reals[3];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_timeOfArrival := init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.transition_input_port[1].reals[4];
    init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_velocity := init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.transition_input_port[1].reals[5];
   end when;
   // end trigger message parameter bindings to the corresponding parameter binding variables
   // transition actions
   when pre(init.region_3_BAT_Info_From_SensorProcessing1.transition_Receiving_1_Receiving.fire) then
    posXReceivedBySP := init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_posX;
    posYReceivedBySP := init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_posY;
    posZReceivedBySP := init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_posZ;
    timeOfArrivalReceivedBySP := init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_timeOfArrival;
    velocityReceivedBySP := init.region_3_BAT_Info_From_SensorProcessing1.mailbox_transferBATInfo_velocity;
    BAT_Info_ReceivedBySP := true;

   end when;
   when pre(init.region_2_BAT_Info_ToStrikeProcessing1.transition_Sending_1_Sending.fire) then
    BAT_Info_ReceivedByRobot := false;

   end when;
   when pre(init.region_1_BAT_Info_To_OtherRobot1.transition_Init_1_YourTurn.fire) then
    BAT_Info_ReceivedBySP := false;

   end when;
   when pre(init.region_1_BAT_Info_To_OtherRobot1.transition_MyTurn_1_YourTurn.fire) then
    BAT_Info_ReceivedBySP := false;

   end when;
   when pre(init.region_1_BAT_Info_To_OtherRobot1.transition_YourTurn_1_MyTurn.fire) then
    posXReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posX;
    posYReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posY;
    posZReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posZ;
    timeOfArrivalReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_timeOfArrival;
    velocityReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_velocity;
    BAT_Info_ReceivedByRobot := true;

   end when;
   when pre(init.region_1_BAT_Info_To_OtherRobot1.transition_Init_2_MyTurn.fire) then
    posXReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posX;
    posYReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posY;
    posZReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_posZ;
    timeOfArrivalReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_timeOfArrival;
    velocityReceivedByRobot := init.region_1_BAT_Info_To_OtherRobot1.mailbox_turn_velocity;
    BAT_Info_ReceivedByRobot := true;

   end when;
   // end transition actions
   // assign parameter binding variables
   when init.region_1_BAT_Info_To_OtherRobot1.transition_MyTurn_3_Init.fire then
   end when;
   when init.region_2_BAT_Info_ToStrikeProcessing1.transition_Sending_1_Sending.fire then
    init.region_2_BAT_Info_ToStrikeProcessing1.message_transferBATInfo_posX := posXReceivedByRobot;
    init.region_2_BAT_Info_ToStrikeProcessing1.message_transferBATInfo_posY := posYReceivedByRobot;
    init.region_2_BAT_Info_ToStrikeProcessing1.message_transferBATInfo_posZ := posZReceivedByRobot;
    init.region_2_BAT_Info_ToStrikeProcessing1.message_transferBATInfo_timeOfArrival := timeOfArrivalReceivedByRobot;
    init.region_2_BAT_Info_ToStrikeProcessing1.message_transferBATInfo_velocity := velocityReceivedByRobot;
   end when;
   when init.region_1_BAT_Info_To_OtherRobot1.transition_Init_1_YourTurn.fire then
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_posX := posXReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_posY := posYReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_posZ := posZReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_timeOfArrival := timeOfArrivalReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_velocity := velocityReceivedBySP;
   end when;
   when init.region_1_BAT_Info_To_OtherRobot1.transition_MyTurn_1_YourTurn.fire then
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_posX := posXReceivedByRobot;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_posY := posYReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_posZ := posZReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_timeOfArrival := timeOfArrivalReceivedBySP;
    init.region_1_BAT_Info_To_OtherRobot1.message_turn_velocity := velocityReceivedBySP;
   end when;
   // end assign parameter binding variables
   // state entry actions
   // end state entry actions
   // do event actions
   // end do event actions

 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end MainProcessing;

