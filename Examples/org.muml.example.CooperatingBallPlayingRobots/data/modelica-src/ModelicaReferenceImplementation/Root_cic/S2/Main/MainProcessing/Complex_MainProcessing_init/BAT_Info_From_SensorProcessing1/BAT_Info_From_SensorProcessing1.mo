within Root_cic.S2.Main.MainProcessing.Complex_MainProcessing_init.BAT_Info_From_SensorProcessing1;
model BAT_Info_From_SensorProcessing1
                                      extends
    Modelica_StateGraph2.PartialParallel(                                          nEntry=1);

  // attribute declarations
  outer Real  posZReceivedBySP;
  outer Boolean  BAT_Info_ReceivedBySP;
  outer Real  posYReceivedBySP;
  outer Real  velocityReceivedByRobot;
  outer Real  timeOfArrivalReceivedByRobot;
  outer Real  timeOfArrivalReceivedBySP;
  outer Boolean  BAT_Info_ReceivedByRobot;
  outer Real  posXReceivedByRobot;
  outer Real  posYReceivedByRobot;
  outer Real  posXReceivedBySP;
  outer Real  posZReceivedByRobot;
  outer Real  velocityReceivedBySP;
  // end attribute declarations
  // hybrid port declarations

 outer Boolean isMaster;

 outer Boolean stopPlaying;

  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Receiving(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_Receiving_1_Receiving(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_messageReceive=true,
    numberOfMessageReceive=1,
    numberOfMessageIntegers=0,
    numberOfMessageReals=5,
    numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
  // raise message event declarations
  // end raise message event declarations
  // trigger message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_transferBATInfo(
   nIn=1,
   nOut=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=5,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        transferBATInfo_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  Real mailbox_transferBATInfo_posX;
  Real mailbox_transferBATInfo_posY;
  Real mailbox_transferBATInfo_posZ;
  Real mailbox_transferBATInfo_timeOfArrival;
  Real mailbox_transferBATInfo_velocity;
  // end trigger message event declarations
equation
   // connect initial step
   connect(entry[1], Receiving.inPort[2])
    annotation(Line(points={{0,100},{9,34}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect Receiving -> Receiving
   connect(Receiving.outPort[1],
     transition_Receiving_1_Receiving.inPort)
    annotation (Line(points={{8,25.4},{8,34.4}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_Receiving_1_Receiving.outPort,
     Receiving.inPort[1])
    annotation (Line(points={{8,25.4},{8,30},{8,34},{7,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
   // connect raise message events
   // end connect raise message events
   // connect trigger message events
   connect(mailbox_transferBATInfo.mailbox_input_port[1],
    transferBATInfo_inputDelegationPort)
    annotation (Line(points={{4.4,29.6},{4.4,38},{8,38},{8,30}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(mailbox_transferBATInfo.mailbox_output_port[1],
    transition_Receiving_1_Receiving.transition_input_port[1]);
   // end connect trigger message events
end BAT_Info_From_SensorProcessing1;

