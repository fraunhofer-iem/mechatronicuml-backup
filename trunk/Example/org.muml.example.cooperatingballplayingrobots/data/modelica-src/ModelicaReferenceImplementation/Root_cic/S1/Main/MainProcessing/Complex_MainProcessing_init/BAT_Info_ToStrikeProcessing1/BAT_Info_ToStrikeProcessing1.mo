within Root_cic.S1.Main.MainProcessing.Complex_MainProcessing_init.BAT_Info_ToStrikeProcessing1;
model BAT_Info_ToStrikeProcessing1
                                   extends Modelica_StateGraph2.PartialParallel(nEntry=1);

  // attribute declarations
  outer Real  timeOfArrivalReceivedBySP;
  outer Real  timeOfArrivalReceivedByRobot;
  outer Real  posXReceivedBySP;
  outer Real  posZReceivedBySP;
  outer Real  posYReceivedBySP;
  outer Real  posYReceivedByRobot;
  outer Real  posZReceivedByRobot;
  outer Boolean  BAT_Info_ReceivedByRobot;
  outer Real  posXReceivedByRobot;
  outer Real  velocityReceivedByRobot;
  outer Real  velocityReceivedBySP;
  outer Boolean  BAT_Info_ReceivedBySP;
  // end attribute declarations
  // hybrid port declarations

 outer Boolean stopPlaying;

 outer Boolean isMaster;

  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Sending(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_Sending_1_Sending(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    condition = pre(BAT_Info_ReceivedByRobot) == true)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
  // raise message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Message message_transferBATInfo(
   nIn=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=5,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         transferBATInfo_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  Real message_transferBATInfo_posX;
  Modelica.Blocks.Sources.RealExpression message_transferBATInfo_posXrealExpression(y=message_transferBATInfo_posX);
  Real message_transferBATInfo_posY;
  Modelica.Blocks.Sources.RealExpression message_transferBATInfo_posYrealExpression(y=message_transferBATInfo_posY);
  Real message_transferBATInfo_posZ;
  Modelica.Blocks.Sources.RealExpression message_transferBATInfo_posZrealExpression(y=message_transferBATInfo_posZ);
  Real message_transferBATInfo_timeOfArrival;
  Modelica.Blocks.Sources.RealExpression message_transferBATInfo_timeOfArrivalrealExpression(y=message_transferBATInfo_timeOfArrival);
  Real message_transferBATInfo_velocity;
  Modelica.Blocks.Sources.RealExpression message_transferBATInfo_velocityrealExpression(y=message_transferBATInfo_velocity);
  // end raise message event declarations
  // trigger message event declarations
  // end trigger message event declarations
equation
   // connect initial step
   connect(entry[1], Sending.inPort[2])
    annotation(Line(points={{0,100},{9,34}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect Sending -> Sending
   connect(Sending.outPort[1],
     transition_Sending_1_Sending.inPort)
    annotation (Line(points={{8,25.4},{8,34.4}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_Sending_1_Sending.outPort,
     Sending.inPort[1])
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
   connect(message_transferBATInfo_posXrealExpression.y,
    message_transferBATInfo.u_reals[1]);
   connect(message_transferBATInfo_posYrealExpression.y,
    message_transferBATInfo.u_reals[2]);
   connect(message_transferBATInfo_posZrealExpression.y,
    message_transferBATInfo.u_reals[3]);
   connect(message_transferBATInfo_timeOfArrivalrealExpression.y,
    message_transferBATInfo.u_reals[4]);
   connect(message_transferBATInfo_velocityrealExpression.y,
    message_transferBATInfo.u_reals[5]);
   connect(message_transferBATInfo.message_output_port,
    transferBATInfo_outputDelegationPort)
    annotation (Line(points={{11.6,29.6},{11.6,38},{8,38},{8,30}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_Sending_1_Sending.firePort,
    message_transferBATInfo.conditionPort[1]);
   // end connect raise message events
   // connect trigger message events
   // end connect trigger message events
end BAT_Info_ToStrikeProcessing1;

