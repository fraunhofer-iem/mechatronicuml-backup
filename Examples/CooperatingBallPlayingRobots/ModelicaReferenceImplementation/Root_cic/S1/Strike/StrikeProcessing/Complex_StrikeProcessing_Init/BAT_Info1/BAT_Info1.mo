within Root_cic.S1.Strike.StrikeProcessing.Complex_StrikeProcessing_Init.BAT_Info1;
model BAT_Info1
                extends Modelica_StateGraph2.PartialParallel(nEntry=1);

  // attribute declarations
  outer Real  posZ;
  outer Real  posY;
  outer Real  posX;
  outer Real  velocity;
  outer Real  timeOfArrival;
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Receiving(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{24,34},{32,42}})));

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
   annotation (Placement(transformation(extent={{24,14},{32,22}})));
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
   annotation (Placement(transformation(extent={{-104,-12},{-96,-4}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                        transferBATInfo_inputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation (Placement(transformation(extent={{-114,44},{-78,60}})));
  Real mailbox_transferBATInfo_posX;
  Real mailbox_transferBATInfo_posY;
  Real mailbox_transferBATInfo_posZ;
  Real mailbox_transferBATInfo_timeOfArrival;
  Real mailbox_transferBATInfo_velocity;
  // end trigger message event declarations
  Modelica_StateGraph2.Step step1(nIn=1, nOut=1)
    annotation (Placement(transformation(extent={{24,-2},{32,6}})));
  Modelica_StateGraph2.LoopBreakingTransition T1 annotation (Placement(
        transformation(
        extent={{-4,-4},{4,4}},
        rotation=180,
        origin={-16,22})));
equation
   // connect initial step
   connect(entry[1], Receiving.inPort[1])
    annotation(Line(points={{0,100},{27,42}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect Receiving -> Receiving
   connect(Receiving.outPort[1],
     transition_Receiving_1_Receiving.inPort)
    annotation (Line(points={{28,33.4},{28,22.4}},
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
    annotation (Line(points={{-103.6,-8.4},{-103.6,38},{-96,38},{-96,52}},
                                              color={0,0,0}, smooth=Smooth.None));
   connect(mailbox_transferBATInfo.mailbox_output_port[1],
    transition_Receiving_1_Receiving.transition_input_port[1]);
   // end connect trigger message events
  connect(transition_Receiving_1_Receiving.outPort, step1.inPort[1])
    annotation (Line(
      points={{28,13.4},{28,6}},
      color={0,0,0},
      smooth=Smooth.None));
  connect(step1.outPort[1], T1.inPort) annotation (Line(
      points={{28,-2.6},{6,-2.6},{6,18},{-16,18}},
      color={0,0,0},
      smooth=Smooth.None));
  connect(T1.outPort, Receiving.inPort[2]) annotation (Line(
      points={{-16,27.8},{6,27.8},{6,42},{29,42}},
      color={0,0,0},
      smooth=Smooth.None));
  annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
            -100},{100,100}}), graphics));
end BAT_Info1;

