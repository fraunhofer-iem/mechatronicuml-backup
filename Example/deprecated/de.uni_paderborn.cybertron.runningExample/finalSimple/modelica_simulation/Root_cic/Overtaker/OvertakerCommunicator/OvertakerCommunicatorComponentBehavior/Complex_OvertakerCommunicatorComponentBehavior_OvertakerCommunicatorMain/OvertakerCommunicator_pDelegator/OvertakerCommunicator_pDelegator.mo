within Root_cic.Overtaker.OvertakerCommunicator.OvertakerCommunicatorComponentBehavior.Complex_OvertakerCommunicatorComponentBehavior_OvertakerCommunicatorMain.OvertakerCommunicator_pDelegator;
model OvertakerCommunicator_pDelegator
                                       extends
    Modelica_StateGraph2.PartialParallel(                                           nEntry=1);
  // attribute declarations
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Executing(
   nIn=1,
   nOut=1)
   annotation (Placement(transformation(extent={{98.77805999999998, 2.8221939999999996},{124.17805999999999, 15.522194}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step Init(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{95.25, 104.42194},{120.64999999999999, 117.12194000000001}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step InitiationReceived(
   nIn=1,
   nOut=1)
   annotation (Placement(transformation(extent={{95.25, 53.621939999999995},{120.64999999999999, 66.32194}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_InitiationReceived_1_Executing(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    use_syncReceive=true,
    numberOfSyncReceive=1,
    syncChannelName="accepted")
   annotation (Placement(transformation(extent={{95.25, 28.221939999999996},{120.64999999999999, 40.92194}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Executing_1_Init(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_messageReceive=true,
    numberOfMessageReceive=1,
    numberOfMessageIntegers=0,
    numberOfMessageReals=0,
    numberOfMessageBooleans=0,
    use_syncSend=true,
    numberOfSyncSend=1,
    syncChannelName="executed")
   annotation (Placement(transformation(extent={{98.77805999999998, 129.82194},{124.17805999999999, 142.52194}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Init_1_InitiationReceived(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_messageReceive=true,
    numberOfMessageReceive=1,
    numberOfMessageIntegers=0,
    numberOfMessageReals=0,
    numberOfMessageBooleans=0,
    use_syncSend=true,
    numberOfSyncSend=1,
    syncChannelName="initiated")
   annotation (Placement(transformation(extent={{95.25, 79.02194},{120.64999999999999, 91.72193999999999}})));
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
  // raise message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Message message_executeOvertaking(
   nIn=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{31.75, 104.42194},{57.15, 117.12194000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         executeOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{31.75, 129.82194},{57.15, 142.52194}})));
  // end raise message event declarations
  // trigger message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_initiateOvertaking(
   nIn=1,
   nOut=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{0.0, 104.42194},{25.4, 117.12194000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        initiateOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{0.0, 129.82194},{25.4, 142.52194}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_executedOvertaking(
   nIn=1,
   nOut=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{63.5, 104.42194},{88.89999999999999, 117.12194000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        executedOvertaking_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{63.5, 129.82194},{88.89999999999999, 142.52194}})));
  // end trigger message event declarations
equation
   // connect initial step
   connect(entry[1], Init.inPort[2])
    annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect Executing -> Init
   connect(Executing.outPort[1],
     transition_Executing_1_Init.inPort)
    annotation (Line(points={ {111.47805999999999,2.4694388}, {111.47805999999999,2.4694388}, {124.17805999999999,2.8221939999999996}, {124.17805999999999,2.8221939999999996}, {124.17805999999999,2.8221939999999996}, {127.35305999999999,59.61888}, {127.35305999999999,59.61888}, {127.35305999999999,85.725}, {127.35305999999999,85.725}, {127.35305999999999,85.725}, {127.35305999999999,85.725}, {124.17805999999999,142.52194}, {124.17805999999999,142.52194}, {124.17805999999999,142.52194}, {111.47805999999999,142.875}, {111.47805999999999,142.875}}, color={0,0,0}, smooth=Smooth.None));
   connect(transition_Executing_1_Init.outPort,
     Init.inPort[1])
    annotation (Line(points={ {111.47805999999999,129.82194}, {111.47805999999999,129.82194}, {107.94999999999999,117.12194000000001}, {107.94999999999999,117.12194000000001}}, color={0,0,0}, smooth=Smooth.None));
   // connect Init -> InitiationReceived
   connect(Init.outPort[1],
     transition_Init_1_InitiationReceived.inPort)
    annotation (Line(points={ {107.94999999999999,104.42194}, {107.94999999999999,104.42194}, {107.94999999999999,91.72193999999999}, {107.94999999999999,91.72193999999999}}, color={0,0,0}, smooth=Smooth.None));
   connect(transition_Init_1_InitiationReceived.outPort,
     InitiationReceived.inPort[1])
    annotation (Line(points={ {107.94999999999999,79.02194}, {107.94999999999999,79.02194}, {107.94999999999999,66.32194}, {107.94999999999999,66.32194}}, color={0,0,0}, smooth=Smooth.None));
   // connect InitiationReceived -> Executing
   connect(InitiationReceived.outPort[1],
     transition_InitiationReceived_1_Executing.inPort)
    annotation (Line(points={ {107.94999999999999,53.621939999999995}, {107.94999999999999,53.621939999999995}, {107.94999999999999,40.92194}, {107.94999999999999,40.92194}}, color={0,0,0}, smooth=Smooth.None));
   connect(transition_InitiationReceived_1_Executing.outPort,
     Executing.inPort[1])
    annotation (Line(points={ {107.94999999999999,28.221939999999996}, {107.94999999999999,28.221939999999996}, {111.47805999999999,15.522194}, {111.47805999999999,15.522194}}, color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
   // connect raise message events
   connect(message_executeOvertaking.message_output_port,
    executeOvertaking_outputDelegationPort)
    annotation (Line(points={ {44.449999999999996,129.82194}, {44.449999999999996,129.82194}, {44.449999999999996,117.12194000000001}, {44.449999999999996,117.12194000000001}}, color={0,0,0}, smooth=Smooth.None));
   connect(transition_InitiationReceived_1_Executing.firePort,
    message_executeOvertaking.conditionPort[1]);
   // end connect raise message events
   // connect trigger message events
   connect(mailbox_initiateOvertaking.mailbox_input_port[1],
    initiateOvertaking_inputDelegationPort)
    annotation (Line(points={ {12.7,129.82194}, {12.7,129.82194}, {12.7,117.12194000000001}, {12.7,117.12194000000001}}, color={0,0,0}, smooth=Smooth.None));
   connect(mailbox_initiateOvertaking.mailbox_output_port[1],
    transition_Init_1_InitiationReceived.transition_input_port[1]);
   connect(mailbox_executedOvertaking.mailbox_input_port[1],
    executedOvertaking_inputDelegationPort)
    annotation (Line(points={ {76.19999999999999,129.82194}, {76.19999999999999,129.82194}, {76.19999999999999,117.12194000000001}, {76.19999999999999,117.12194000000001}}, color={0,0,0}, smooth=Smooth.None));
   connect(mailbox_executedOvertaking.mailbox_output_port[1],
    transition_Executing_1_Init.transition_input_port[1]);
   // end connect trigger message events
 annotation (Diagram(coordinateSystem(extent = {{-130.52805999999998, -145.34387999999998}, {130.52805999999998, 145.34387999999998}})));
end OvertakerCommunicator_pDelegator;

