within Root_cic.Overtakee.OvertakeeDriver.OvertakeeDriveControlComponentBehavior.Complex_OvertakeeDriveControlComponentBehavior_OvertakeeDriveMain.DrivingBehaviorOvertakee;
model DrivingBehaviorOvertakee
                               extends Modelica_StateGraph2.PartialParallel(nEntry=1);
  // attribute declarations
  outer constant Integer ConstMaxVelocity;
  inner Real  turn(start=0);
  outer constant Integer ConstMinVelocity;
  outer constant Integer ConstKP;
  outer constant Integer velocity;
  inner Real  integral(start=0);
  inner Real  lightValue(start=100);
  outer constant Integer ConstOffset;
  inner Real  error(start=0);
  outer constant Integer ConstKD;
  inner Real  lastError(start=0);
  outer constant Integer ConstKI;
  inner Real  derivative(start=0);
  // end attribute declarations
  // hybrid port declarations

 outer Integer color;

 outer Real rightVelocity;

 outer Real leftVelocity;

  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step LineFollowing(
   nIn=2,
   nOut=1)
   annotation (Placement(transformation(extent={{0.0, 0.35280600000000034},{25.4, 13.052805999999999}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_LineFollowing_1_LineFollowing(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    use_conditionPort=true,
    use_firePort=true)
   annotation (Placement(transformation(extent={{0.0, 25.753059999999998},{25.4, 38.45306}})));
  // end transition declarations

  // clock declarations
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c1(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  // end clock declarations
  // clock constraint declarations
  Modelica_StateGraph2.Blocks.MathBoolean.And transition_LineFollowing_1_LineFollowing_AND(nu=1)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual
                                                                                                        clock_constraint_transition_LineFollowing_1_LineFollowing_1(
   bound=(3) * 0.001)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  // end clock constraint declarations
equation
   // connect initial step
   connect(entry[1], LineFollowing.inPort[2])
    annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect LineFollowing -> LineFollowing
   connect(LineFollowing.outPort[1],
     transition_LineFollowing_1_LineFollowing.inPort)
    annotation (Line(points={ {12.7,0.0}, {12.7,0.0}, {25.4,0.3527806}, {25.4,0.3527806}, {25.4,0.3527806}, {25.4,38.45306}, {25.4,38.45306}, {25.4,38.45306}, {12.7,38.80612}, {12.7,38.80612}}, color={0,0,0}, smooth=Smooth.None));
   connect(transition_LineFollowing_1_LineFollowing.outPort,
     LineFollowing.inPort[1])
    annotation (Line(points={ {12.7,25.753059999999998}, {12.7,25.753059999999998}, {12.7,13.052805999999999}, {12.7,13.052805999999999}}, color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   connect(c1.y, clock_constraint_transition_LineFollowing_1_LineFollowing_1.clockValue);
   connect(clock_constraint_transition_LineFollowing_1_LineFollowing_1.firePort,
    transition_LineFollowing_1_LineFollowing_AND.u[1]);
   connect(transition_LineFollowing_1_LineFollowing_AND.y, transition_LineFollowing_1_LineFollowing.conditionPort);
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
 annotation (Diagram(coordinateSystem(extent = {{-25.4, -38.80612}, {25.4, 38.80612}})));
end DrivingBehaviorOvertakee;

