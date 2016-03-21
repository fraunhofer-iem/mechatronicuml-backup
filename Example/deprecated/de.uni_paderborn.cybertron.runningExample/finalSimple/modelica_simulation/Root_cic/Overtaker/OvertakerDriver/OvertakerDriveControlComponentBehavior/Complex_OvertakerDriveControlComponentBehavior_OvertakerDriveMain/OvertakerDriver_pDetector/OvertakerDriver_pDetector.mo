within Root_cic.Overtaker.OvertakerDriver.OvertakerDriveControlComponentBehavior.Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain.OvertakerDriver_pDetector;
model OvertakerDriver_pDetector
                                extends Modelica_StateGraph2.PartialParallel(nEntry=1);
  // attribute declarations
  inner constant Real distanceLimit = 0.2;
  outer constant Integer ConstMinVelocity;
  outer constant Integer ConstOffset;
  outer constant Integer ConstMaxVelocity;
  outer Integer  velocity;
  outer constant Integer ConstKP;
  outer constant Integer ConstKD;
  outer constant Integer ConstHelper;
  outer constant Integer ConstKI;
  outer constant Integer ConstBlack;
  // end attribute declarations
  // hybrid port declarations

 outer Real distance;

 outer Real leftVelocity;

 outer Real rightVelocity;

 outer Integer color;

  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Executing(
   nIn=1,
   nOut=1)
   annotation (Placement(transformation(extent={{63.5, 79.02194},{88.89999999999999, 91.72193999999999}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step Init(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{63.5, 28.221939999999996},{88.89999999999999, 40.92194}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step Initiated(
   nIn=1,
   nOut=1)
   annotation (Placement(transformation(extent={{67.02806, 129.82194},{92.42806, 142.52194}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Init_1_Initiated(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    condition = pre(distance) < pre(distanceLimit))
   annotation (Placement(transformation(extent={{67.02806, 2.8221939999999996},{92.42806, 15.522194}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Initiated_1_Executing(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_syncSend=true,
    numberOfSyncSend=1,
    syncChannelName="execute")
   annotation (Placement(transformation(extent={{63.5, 104.42194},{88.89999999999999, 117.12194000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Executing_1_Init(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_firePort=true,
    use_syncReceive=true,
    numberOfSyncReceive=1,
    syncChannelName="executed")
   annotation (Placement(transformation(extent={{63.5, 53.621939999999995},{88.89999999999999, 66.32194}})));
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
  // raise message event declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Message message_initiateOvertaking(
   nIn=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{0.0, 104.42194},{25.4, 117.12194000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         initiateOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{0.0, 129.82194},{25.4, 142.52194}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Message message_executedOvertaking(
   nIn=1,
   numberOfMessageIntegers=0,
   numberOfMessageReals=0,
   numberOfMessageBooleans=0)
   annotation (Placement(transformation(extent={{31.75, 104.42194},{57.15, 117.12194000000001}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         executedOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation (Placement(transformation(extent={{31.75, 129.82194},{57.15, 142.52194}})));
  // end raise message event declarations
  // trigger message event declarations
  // end trigger message event declarations
equation
   // connect initial step
   connect(entry[1], Init.inPort[2])
    annotation(Line(points={{0,100},{79.375,40.9219}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect Executing -> Init
   connect(Executing.outPort[1],
     transition_Executing_1_Init.inPort)
    annotation (Line(points={{76.2,78.0694},{76.2,78.0694},{76.2,66.3219},{76.2,
          66.3219}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   connect(transition_Executing_1_Init.outPort,
     Init.inPort[1])
    annotation (Line(points={{76.2,52.0344},{76.2,52.0344},{76.2,40.9219},{
          73.025,40.9219}},                                                                                             color={0,0,0}, smooth=Smooth.None));
   // connect Init -> Initiated
   connect(Init.outPort[1],
     transition_Init_1_Initiated.inPort)
    annotation (Line(points={{76.2,27.2694},{76.2,27.2694},{76.2,15.5222},{
          79.7281,15.5222}},                                                                                            color={0,0,0}, smooth=Smooth.None));
   connect(transition_Init_1_Initiated.outPort,
     Initiated.inPort[1])
    annotation (Line(points={{79.7281,1.23469},{79.7281,2.46944},{92.4281,
          2.46944},{92.4281,2.82219},{92.4281,2.82219},{92.4281,59.6189},{
          95.6031,59.6189},{95.6031,85.725},{95.6031,85.725},{95.6031,85.725},{
          95.6031,85.725},{95.6031,142.522},{92.4281,142.522},{92.4281,142.522},
          {79.7281,142.522},{79.7281,142.522}},                                                                         color={0,0,0}, smooth=Smooth.None));
   // connect Initiated -> Executing
   connect(Initiated.outPort[1],
     transition_Initiated_1_Executing.inPort)
    annotation (Line(points={{79.7281,128.869},{79.7281,129.822},{79.7281,
          117.122},{76.2,117.122}},                                                                                           color={0,0,0}, smooth=Smooth.None));
   connect(transition_Initiated_1_Executing.outPort,
     Executing.inPort[1])
    annotation (Line(points={{76.2,102.834},{76.2,102.834},{76.2,91.7219},{76.2,
          91.7219}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
   // connect raise message events
   connect(message_initiateOvertaking.message_output_port,
    initiateOvertaking_outputDelegationPort)
    annotation (Line(points={{24.13,110.137},{24.13,110.137},{12.7,110.137},{
          12.7,136.172}},                                                                                               color={0,0,0}, smooth=Smooth.None));
   connect(transition_Init_1_Initiated.firePort,
    message_initiateOvertaking.conditionPort[1]);
   connect(message_executedOvertaking.message_output_port,
    executedOvertaking_outputDelegationPort)
    annotation (Line(points={{55.88,110.137},{55.88,110.137},{44.45,110.137},{
          44.45,136.172}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_Executing_1_Init.firePort,
    message_executedOvertaking.conditionPort[1]);
   // end connect raise message events
   // connect trigger message events
   // end connect trigger message events
 annotation (Diagram(coordinateSystem(extent = {{-98.77806, -145.34387999999998}, {98.77806, 145.34387999999998}})));
end OvertakerDriver_pDetector;

