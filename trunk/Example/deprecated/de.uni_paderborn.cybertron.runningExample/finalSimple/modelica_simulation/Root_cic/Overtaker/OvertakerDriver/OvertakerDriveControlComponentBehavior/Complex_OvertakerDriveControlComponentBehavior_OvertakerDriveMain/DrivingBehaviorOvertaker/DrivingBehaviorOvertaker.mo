within Root_cic.Overtaker.OvertakerDriver.OvertakerDriveControlComponentBehavior.Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain.DrivingBehaviorOvertaker;
model DrivingBehaviorOvertaker
                               extends Modelica_StateGraph2.PartialParallel(nEntry=1);
  // attribute declarations
  outer constant Integer ConstMinVelocity;
  inner constant Integer ConstTurningVelocity = 10;
  outer constant Integer ConstOffset;
  inner constant Integer turningTime = 380;
  inner Real  integral(start=0);
  inner Real  lightValue(start=0);
  inner constant Integer overtakingTime = 1300;
  outer constant Integer ConstKP;
  outer constant Integer ConstKD;
  outer constant Integer ConstHelper;
  outer constant Integer ConstKI;
  outer constant Integer ConstBlack;
  inner Real  lastError(start=0);
  inner Real  derivative(start=0);
  outer constant Integer ConstMaxVelocity;
  outer Integer  velocity;
  inner Real  error(start=0);
  inner Real  turn(start=0);
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
  RealTimeCoordinationLibrary.RealTimeCoordination.Step FollowHelperLine(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{31.75, 51.153059999999996},{57.15, 63.85306}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       FollowHelperLineInvariantcHelper(bound=(ConstHelper) * 1.0);

  RealTimeCoordinationLibrary.RealTimeCoordination.Step FollowMainLine(
   nIn=3,
   nOut=2)
   annotation (Placement(transformation(extent={{2.116582, 254.35559999999998},{27.516582000000003, 267.05559999999997}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step ToHelperLine(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{31.75, 152.75305999999998},{57.15, 165.45306}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step ToMainLine(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{15.875, 355.95559999999995},{41.275, 368.65559999999994}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnLeft1(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{31.75, 203.55306},{57.15, 216.25305999999998}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       TurnLeft1InvariantcTurningL(bound=(turningTime) * 0.001);

  RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnLeft2(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{13.75918, 305.1556},{39.15918, 317.8556}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       TurnLeft2InvariantcTurningL(bound=(turningTime - 60) * 0.001);

  RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnRight1(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{31.75, 101.95305999999998},{57.15, 114.65305999999998}})));
 Modelica.Blocks.Logical.Not TurnRight1ExitMarker;
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       TurnRight1InvariantcTurningR(bound=(turningTime - 75) * 0.001);

  RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnRight2(
   nIn=1,
   use_activePort=true,
   nOut=1)
   annotation (Placement(transformation(extent={{43.03776, 0.35280600000000034},{68.43776, 13.052805999999999}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
                                                                                                       TurnRight2InvariantcTurningR(bound=(turningTime) * 1.0);

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_ToHelperLine_1_TurnRight1(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{31.75, 127.35305999999999},{57.15, 140.05306}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_FollowMainLine_2_TurnLeft1(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_syncReceive=true,
    numberOfSyncReceive=1,
    syncChannelName="execute")
   annotation (Placement(transformation(extent={{31.75, 228.95305999999997},{57.15, 241.65305999999998}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_TurnRight2_1_ToMainLine(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{27.162759999999995, 381.3556},{52.56276, 394.05559999999997}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_FollowMainLine_1_FollowMainLine(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true,
    use_firePort=true)
   annotation (Placement(transformation(extent={{0.0, 228.95305999999997},{25.4, 241.65305999999998}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_TurnRight1_1_FollowHelperLine(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{31.75, 76.55306},{57.15, 89.25305999999999}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_TurnLeft1_1_ToHelperLine(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{31.75, 178.15305999999998},{57.15, 190.85305999999997}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_FollowHelperLine_1_TurnRight2(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true)
   annotation (Placement(transformation(extent={{31.75, 25.753059999999998},{57.15, 38.45306}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_TurnLeft2_1_FollowMainLine(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true,
    use_syncSend=true,
    numberOfSyncSend=1,
    syncChannelName="executed")
   annotation (Placement(transformation(extent={{5.997194, 279.75559999999996},{31.397194, 292.45559999999995}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_ToMainLine_1_TurnLeft2(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    condition = pre(color) > pre(ConstBlack))
   annotation (Placement(transformation(extent={{15.875, 330.55559999999997},{41.275, 343.25559999999996}})));

  // end transition declarations

  // clock declarations
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock cTurningR(nu=2)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock cHelper(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock cTurningL(nu=2)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock cOvertake(nu=2)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c1(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  // end clock declarations
  // clock constraint declarations
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_ToHelperLine_1_TurnRight1_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual
                                                                                                        clock_constraint_transition_ToHelperLine_1_TurnRight1_1(
   bound=(overtakingTime) * 0.001)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_TurnRight2_1_ToMainLine_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
                                                                                                       clock_constraint_transition_TurnRight2_1_ToMainLine_1(
   bound=(turningTime) * 0.001)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_FollowMainLine_1_FollowMainLine_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual
                                                                                                        clock_constraint_transition_FollowMainLine_1_FollowMainLine_1(
   bound=(3) * 0.001)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_TurnRight1_1_FollowHelperLine_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
                                                                                                       clock_constraint_transition_TurnRight1_1_FollowHelperLine_1(
   bound=(turningTime) * 0.001 - 0.3)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_TurnLeft1_1_ToHelperLine_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
                                                                                                       clock_constraint_transition_TurnLeft1_1_ToHelperLine_1(
   bound=(turningTime) * 0.001 - 0.3)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_FollowHelperLine_1_TurnRight2_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
                                                                                                       clock_constraint_transition_FollowHelperLine_1_TurnRight2_1(
   bound=(ConstHelper - 1) * 1.0)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_TurnLeft2_1_FollowMainLine_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
                                                                                                       clock_constraint_transition_TurnLeft2_1_FollowMainLine_1(
   bound=(turningTime - 60) * 0.001 - 0.05)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
   //bound=(turningTime - 60) * 0.001 - 0.3)
  // end clock constraint declarations
equation
   // connect initial step
   connect(entry[1], FollowMainLine.inPort[3])
    annotation(Line(points={{0,100},{19.0499,267.056}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect FollowHelperLine -> TurnRight2
   connect(FollowHelperLine.outPort[1],
     transition_FollowHelperLine_1_TurnRight2.inPort)
    annotation (Line(points={{44.45,50.2006},{44.45,50.2006},{44.45,38.4531},{
          44.45,38.4531}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_FollowHelperLine_1_TurnRight2.outPort,
     TurnRight2.inPort[1])
    annotation (Line(points={{44.45,24.1656},{44.45,24.1656},{44.45,13.0528},{
          55.7378,13.0528}},                                                                                            color={0,0,0}, smooth=Smooth.None));
   // connect FollowMainLine -> FollowMainLine
   connect(FollowMainLine.outPort[2],
     transition_FollowMainLine_1_FollowMainLine.inPort)
    annotation (Line(points={{17.9916,253.403},{14.8166,253.403},{14.8166,
          242.288},{12.7,242.288}},                                                                                           color={0,0,0}, smooth=Smooth.None));
   connect(transition_FollowMainLine_1_FollowMainLine.outPort,
     FollowMainLine.inPort[1])
    annotation (Line(points={{12.7,228.001},{12.7,228.6},{25.4,228.6},{25.4,
          228.953},{25.4,228.953},{25.4,254.356},{27.5158,254.356},{27.5158,
          254.356},{27.5158,267.056},{27.5158,267.056},{27.5158,267.056},{
          10.5832,267.056},{10.5832,267.056}},                                                                          color={0,0,0}, smooth=Smooth.None));
   // connect FollowMainLine -> TurnLeft1
   connect(FollowMainLine.outPort[1],
     transition_FollowMainLine_2_TurnLeft1.inPort)
    annotation (Line(points={{11.6416,253.403},{14.8166,253.403},{44.45,253.403},
          {44.45,241.653}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   connect(transition_FollowMainLine_2_TurnLeft1.outPort,
     TurnLeft1.inPort[1])
    annotation (Line(points={{44.45,227.366},{44.45,227.366},{44.45,216.253},{
          44.45,216.253}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   // connect ToHelperLine -> TurnRight1
   connect(ToHelperLine.outPort[1],
     transition_ToHelperLine_1_TurnRight1.inPort)
    annotation (Line(points={{44.45,151.801},{44.45,151.801},{44.45,140.053},{
          44.45,140.053}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_ToHelperLine_1_TurnRight1.outPort,
     TurnRight1.inPort[1])
    annotation (Line(points={{44.45,125.766},{44.45,125.766},{44.45,114.653},{
          44.45,114.653}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   // connect ToMainLine -> TurnLeft2
   connect(ToMainLine.outPort[1],
     transition_ToMainLine_1_TurnLeft2.inPort)
    annotation (Line(points={{28.575,355.003},{28.575,355.003},{28.575,343.256},
          {28.575,343.256}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   connect(transition_ToMainLine_1_TurnLeft2.outPort,
     TurnLeft2.inPort[1])
    annotation (Line(points={{28.575,328.968},{28.575,328.968},{28.575,317.856},
          {26.4592,317.856}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   // connect TurnLeft1 -> ToHelperLine
   connect(TurnLeft1.outPort[1],
     transition_TurnLeft1_1_ToHelperLine.inPort)
    annotation (Line(points={{44.45,202.601},{44.45,202.601},{44.45,190.853},{
          44.45,190.853}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_TurnLeft1_1_ToHelperLine.outPort,
     ToHelperLine.inPort[1])
    annotation (Line(points={{44.45,176.566},{44.45,176.566},{44.45,165.453},{
          44.45,165.453}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   // connect TurnLeft2 -> FollowMainLine
   connect(TurnLeft2.outPort[1],
     transition_TurnLeft2_1_FollowMainLine.inPort)
    annotation (Line(points={{26.4592,304.203},{26.4592,305.156},{26.4592,
          292.456},{18.6972,292.456}},                                                                                           color={0,0,0}, smooth=Smooth.None));
   connect(transition_TurnLeft2_1_FollowMainLine.outPort,
     FollowMainLine.inPort[2])
    annotation (Line(points={{18.6972,278.168},{18.6972,279.756},{18.6972,
          267.056},{14.8166,267.056}},                                                                                           color={0,0,0}, smooth=Smooth.None));
   // connect TurnRight1 -> FollowHelperLine
   connect(TurnRight1.outPort[1],
     transition_TurnRight1_1_FollowHelperLine.inPort)
    annotation (Line(points={{44.45,101.001},{44.45,101.001},{44.45,89.2531},{
          44.45,89.2531}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   connect(transition_TurnRight1_1_FollowHelperLine.outPort,
     FollowHelperLine.inPort[1])
    annotation (Line(points={{44.45,74.9656},{44.45,74.9656},{44.45,63.8531},{
          44.45,63.8531}},                                                                                              color={0,0,0}, smooth=Smooth.None));
   // connect TurnRight2 -> ToMainLine
   connect(TurnRight2.outPort[1],
     transition_TurnRight2_1_ToMainLine.inPort)
    annotation (Line(points={{55.7378,-0.599694},{55.7378,0},{68.4378,0},{
          68.4378,0.352781},{68.4378,0.352781},{68.4378,13.0528},{68.4378,
          13.0528},{68.4378,13.0528},{68.4378,57.15},{67.0281,57.15},{67.0281,
          337.261},{67.0281,337.261},{67.0281,337.261},{67.0281,337.261},{
          67.0281,394.056},{52.5628,394.056},{52.5628,394.056},{39.8628,394.056},
          {39.8628,394.056}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   connect(transition_TurnRight2_1_ToMainLine.outPort,
     ToMainLine.inPort[1])
    annotation (Line(points={{39.8628,379.768},{39.8628,381.356},{39.8628,
          368.656},{28.575,368.656}},                                                                                           color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   connect(c1.y, clock_constraint_transition_FollowMainLine_1_FollowMainLine_1.clockValue);
   connect(clock_constraint_transition_FollowMainLine_1_FollowMainLine_1.firePort,
    transition_FollowMainLine_1_FollowMainLine_AND.u[1]);
   connect(transition_FollowMainLine_1_FollowMainLine_AND.y, transition_FollowMainLine_1_FollowMainLine.conditionPort);
   connect(cOvertake.y, clock_constraint_transition_ToHelperLine_1_TurnRight1_1.clockValue);
   connect(clock_constraint_transition_ToHelperLine_1_TurnRight1_1.firePort,
    transition_ToHelperLine_1_TurnRight1_AND.u[1]);
   connect(transition_ToHelperLine_1_TurnRight1_AND.y, transition_ToHelperLine_1_TurnRight1.conditionPort);
   connect(cTurningL.y, clock_constraint_transition_TurnLeft1_1_ToHelperLine_1.clockValue);
   connect(clock_constraint_transition_TurnLeft1_1_ToHelperLine_1.firePort,
    transition_TurnLeft1_1_ToHelperLine_AND.u[1]);
   connect(transition_TurnLeft1_1_ToHelperLine_AND.y, transition_TurnLeft1_1_ToHelperLine.conditionPort);
   connect(cHelper.y, clock_constraint_transition_FollowHelperLine_1_TurnRight2_1.clockValue);
   connect(clock_constraint_transition_FollowHelperLine_1_TurnRight2_1.firePort,
    transition_FollowHelperLine_1_TurnRight2_AND.u[1]);
   connect(transition_FollowHelperLine_1_TurnRight2_AND.y, transition_FollowHelperLine_1_TurnRight2.conditionPort);
   connect(cTurningR.y, clock_constraint_transition_TurnRight2_1_ToMainLine_1.clockValue);
   connect(clock_constraint_transition_TurnRight2_1_ToMainLine_1.firePort,
    transition_TurnRight2_1_ToMainLine_AND.u[1]);
   connect(transition_TurnRight2_1_ToMainLine_AND.y, transition_TurnRight2_1_ToMainLine.conditionPort);
   connect(cTurningL.y, clock_constraint_transition_TurnLeft2_1_FollowMainLine_1.clockValue);
   connect(clock_constraint_transition_TurnLeft2_1_FollowMainLine_1.firePort,
    transition_TurnLeft2_1_FollowMainLine_AND.u[1]);
   connect(transition_TurnLeft2_1_FollowMainLine_AND.y, transition_TurnLeft2_1_FollowMainLine.conditionPort);
   connect(cTurningR.y, clock_constraint_transition_TurnRight1_1_FollowHelperLine_1.clockValue);
   connect(clock_constraint_transition_TurnRight1_1_FollowHelperLine_1.firePort,
    transition_TurnRight1_1_FollowHelperLine_AND.u[1]);
   connect(transition_TurnRight1_1_FollowHelperLine_AND.y, transition_TurnRight1_1_FollowHelperLine.conditionPort);
   // end connect clock constraints
   // connect state invariants
   connect(TurnRight1.activePort,
    TurnRight1InvariantcTurningR.conditionPort);
   connect(cTurningR.y,
    TurnRight1InvariantcTurningR.clockValue);
   connect(TurnLeft1.activePort,
    TurnLeft1InvariantcTurningL.conditionPort);
   connect(cTurningL.y,
    TurnLeft1InvariantcTurningL.clockValue);
   connect(TurnLeft2.activePort,
    TurnLeft2InvariantcTurningL.conditionPort);
   connect(cTurningL.y,
    TurnLeft2InvariantcTurningL.clockValue);
   connect(FollowHelperLine.activePort,
    FollowHelperLineInvariantcHelper.conditionPort);
   connect(cHelper.y,
    FollowHelperLineInvariantcHelper.clockValue);
   connect(TurnRight2.activePort,
    TurnRight2InvariantcTurningR.conditionPort);
   connect(cTurningR.y,
    TurnRight2InvariantcTurningR.clockValue);
   // end connect state invariants
 annotation (Diagram(coordinateSystem(extent = {{-68.43776, -394.4112}, {68.43776, 394.4112}})));
end DrivingBehaviorOvertaker;

