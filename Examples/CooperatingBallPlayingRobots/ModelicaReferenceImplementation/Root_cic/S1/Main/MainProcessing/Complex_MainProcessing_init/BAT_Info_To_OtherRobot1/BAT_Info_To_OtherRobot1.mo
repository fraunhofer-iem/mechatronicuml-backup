within Root_cic.S1.Main.MainProcessing.Complex_MainProcessing_init.BAT_Info_To_OtherRobot1;
model BAT_Info_To_OtherRobot1
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
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Init(
   nIn=4,
   nOut=2)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step MyTurn(
   nIn=2,
   use_activePort=true,
   nOut=3)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       MyTurnInvariantc0(bound=(10000) * 0.001);

  RealTimeCoordinationLibrary.RealTimeCoordination.Step Timeout(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step YourTurn(
   nIn=2,
   use_activePort=true,
   nOut=3)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       YourTurnInvariantc0(bound=(10000) * 0.001);

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_MyTurn_1_YourTurn(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    condition = pre(BAT_Info_ReceivedBySP) == true)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_YourTurn_3_Init(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_messageReceive=true,
    numberOfMessageReceive=1,
    numberOfMessageIntegers=0,
    numberOfMessageReals=0,
    numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_MyTurn_2_Timeout(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_YourTurn_1_MyTurn(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_messageReceive=true,
    numberOfMessageReceive=1,
    numberOfMessageIntegers=0,
    numberOfMessageReals=5,
    numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_YourTurn_2_Timeout(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Init_1_YourTurn(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    condition = pre(isMaster) == true and pre(BAT_Info_ReceivedBySP) == true)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Timeout_1_Init(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_MyTurn_3_Init(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    condition = pre(stopPlaying) == true)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Init_2_MyTurn(
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
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c0(nu=2)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  // end clock declarations
  // clock constraint declarations
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_MyTurn_2_Timeout_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual
                                                                                                        clock_constraint_transition_MyTurn_2_Timeout_1(
   bound=(1000) * 0.001)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_YourTurn_2_Timeout_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual
                                                                                                        clock_constraint_transition_YourTurn_2_Timeout_1(
   bound=(1000) * 0.001)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  // end clock constraint declarations
  // raise message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Message message_turn(
   nIn=2,
   numberOfMessageIntegers=0,
   numberOfMessageReals=5,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         turn_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  Real message_turn_posX;
  Modelica.Blocks.Sources.RealExpression message_turn_posXrealExpression(y=pre(message_turn_posX));
  Real message_turn_posY;
  Modelica.Blocks.Sources.RealExpression message_turn_posYrealExpression(y=pre(message_turn_posY));
  Real message_turn_posZ;
  Modelica.Blocks.Sources.RealExpression message_turn_posZrealExpression(y=pre(message_turn_posZ));
  Real message_turn_timeOfArrival;
  Modelica.Blocks.Sources.RealExpression message_turn_timeOfArrivalrealExpression(y=pre(message_turn_timeOfArrival));
  Real message_turn_velocity;
  Modelica.Blocks.Sources.RealExpression message_turn_velocityrealExpression(y=pre(message_turn_velocity));
  RealTimeCoordinationLibrary.RealTimeCoordination.Message message_stopPlaying(
   nIn=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         stopPlaying_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  // end raise message event declarations
  // trigger message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_stopPlaying(
   nIn=1,
   nOut=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        stopPlaying_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_turn(
   nIn=1,
   nOut=2,
   numberOfMessageIntegers=0,
   numberOfMessageReals=5,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        turn_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{4,26},{12,34}})));
  Real mailbox_turn_posX;
  Real mailbox_turn_posY;
  Real mailbox_turn_posZ;
  Real mailbox_turn_timeOfArrival;
  Real mailbox_turn_velocity;
  // end trigger message event declarations
equation
   // connect initial step
   connect(entry[1], Init.inPort[4])
    annotation(Line(points={{0,100},{9.5,34}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect Init -> YourTurn
   connect(Init.outPort[2],
     transition_Init_1_YourTurn.inPort)
    annotation (Line(points={{9,25.4},{9,40},{8,40},{8,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_Init_1_YourTurn.outPort,
     YourTurn.inPort[1])
    annotation (Line(points={{8,25},{8,30},{8,34},{7,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect Init -> MyTurn
   connect(Init.outPort[1],
     transition_Init_2_MyTurn.inPort)
    annotation (Line(points={{7,25.4},{7,40},{8,40},{8,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_Init_2_MyTurn.outPort,
     MyTurn.inPort[1])
    annotation (Line(points={{8,25},{8,30},{8,34},{7,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect MyTurn -> YourTurn
   connect(MyTurn.outPort[3],
     transition_MyTurn_1_YourTurn.inPort)
    annotation (Line(points={{9.33333,25.4},{9.33333,40},{8,40},{8,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_MyTurn_1_YourTurn.outPort,
     YourTurn.inPort[2])
    annotation (Line(points={{8,25},{8,30},{8,34},{9,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect MyTurn -> Timeout
   connect(MyTurn.outPort[2],
     transition_MyTurn_2_Timeout.inPort)
    annotation (Line(points={{8,25.4},{8,34}},color={0,0,0}, smooth=Smooth.None));
   connect(transition_MyTurn_2_Timeout.outPort,
     Timeout.inPort[2])
    annotation (Line(points={{8,25},{8,30},{8,34},{9,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect MyTurn -> Init
   connect(MyTurn.outPort[1],
     transition_MyTurn_3_Init.inPort)
    annotation (Line(points={{6.66667,25.4},{6.66667,40},{8,40},{8,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_MyTurn_3_Init.outPort,
     Init.inPort[3])
    annotation (Line(points={{8,25},{8,30},{8,34},{8.5,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect Timeout -> Init
   connect(Timeout.outPort[1],
     transition_Timeout_1_Init.inPort)
    annotation (Line(points={{8,25.4},{8,34}},color={0,0,0}, smooth=Smooth.None));
   connect(transition_Timeout_1_Init.outPort,
     Init.inPort[1])
    annotation (Line(points={{8,25},{8,30},{8,34},{6.5,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect YourTurn -> MyTurn
   connect(YourTurn.outPort[3],
     transition_YourTurn_1_MyTurn.inPort)
    annotation (Line(points={{9.33333,25.4},{9.33333,40},{8,40},{8,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_YourTurn_1_MyTurn.outPort,
     MyTurn.inPort[2])
    annotation (Line(points={{8,25},{8,30},{8,34},{9,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect YourTurn -> Timeout
   connect(YourTurn.outPort[2],
     transition_YourTurn_2_Timeout.inPort)
    annotation (Line(points={{8,25.4},{8,34}},color={0,0,0}, smooth=Smooth.None));
   connect(transition_YourTurn_2_Timeout.outPort,
     Timeout.inPort[1])
    annotation (Line(points={{8,25},{8,30},{8,34},{7,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // connect YourTurn -> Init
   connect(YourTurn.outPort[1],
     transition_YourTurn_3_Init.inPort)
    annotation (Line(points={{6.66667,25.4},{6.66667,40},{8,40},{8,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_YourTurn_3_Init.outPort,
     Init.inPort[2])
    annotation (Line(points={{8,25},{8,30},{8,34},{7.5,34}},
                                              color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   connect(c0.y, clock_constraint_transition_YourTurn_2_Timeout_1.clockValue);
   connect(clock_constraint_transition_YourTurn_2_Timeout_1.firePort,
    transition_YourTurn_2_Timeout_AND.u[1]);
   connect(transition_YourTurn_2_Timeout_AND.y, transition_YourTurn_2_Timeout.conditionPort);
   connect(c0.y, clock_constraint_transition_MyTurn_2_Timeout_1.clockValue);
   connect(clock_constraint_transition_MyTurn_2_Timeout_1.firePort,
    transition_MyTurn_2_Timeout_AND.u[1]);
   connect(transition_MyTurn_2_Timeout_AND.y, transition_MyTurn_2_Timeout.conditionPort);
   // end connect clock constraints
   // connect state invariants
   connect(YourTurn.activePort,
    YourTurnInvariantc0.conditionPort);
   connect(c0.y,
    YourTurnInvariantc0.clockValue);
   connect(MyTurn.activePort,
    MyTurnInvariantc0.conditionPort);
   connect(c0.y,
    MyTurnInvariantc0.clockValue);
   // end connect state invariants
   // connect raise message events
   connect(message_turn_posXrealExpression.y,
    message_turn.u_reals[1]);
   connect(message_turn_posYrealExpression.y,
    message_turn.u_reals[2]);
   connect(message_turn_posZrealExpression.y,
    message_turn.u_reals[3]);
   connect(message_turn_timeOfArrivalrealExpression.y,
    message_turn.u_reals[4]);
   connect(message_turn_velocityrealExpression.y,
    message_turn.u_reals[5]);
   connect(message_turn.message_output_port,
    turn_outputDelegationPort)
    annotation (Line(points={{11.6,29.6},{11.6,38},{8,38},{8,30}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_MyTurn_1_YourTurn.firePort,
    message_turn.conditionPort[1]);
   connect(transition_Init_1_YourTurn.firePort,
    message_turn.conditionPort[2]);
   connect(message_stopPlaying.message_output_port,
    stopPlaying_outputDelegationPort)
    annotation (Line(points={{11.6,29.6},{11.6,38},{8,38},{8,30}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_MyTurn_3_Init.firePort,
    message_stopPlaying.conditionPort[1]);
   // end connect raise message events
   // connect trigger message events
   connect(mailbox_stopPlaying.mailbox_input_port[1],
    stopPlaying_inputDelegationPort)
    annotation (Line(points={{4.4,29.6},{4.4,38},{8,38},{8,30}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(mailbox_stopPlaying.mailbox_output_port[1],
    transition_YourTurn_3_Init.transition_input_port[1]);
   connect(mailbox_turn.mailbox_input_port[1],
    turn_inputDelegationPort)
    annotation (Line(points={{4.4,29.6},{4.4,38},{8,38},{8,30}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(mailbox_turn.mailbox_output_port[1],
    transition_YourTurn_1_MyTurn.transition_input_port[1]);
   connect(mailbox_turn.mailbox_output_port[2],
    transition_Init_2_MyTurn.transition_input_port[1]);
   // end connect trigger message events
end BAT_Info_To_OtherRobot1;

