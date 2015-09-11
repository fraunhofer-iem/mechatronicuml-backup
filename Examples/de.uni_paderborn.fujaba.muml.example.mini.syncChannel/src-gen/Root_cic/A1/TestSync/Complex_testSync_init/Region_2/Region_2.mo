within Root_cic.A1.TestSync.Complex_testSync_init.Region_2;
model Region_2
               extends Modelica_StateGraph2.PartialParallel(nEntry=1);
  // attribute declarations
  outer Integer  var2;
  outer Integer  var1;
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step Received(
   nIn=1,
   nOut=0)
   annotation (Placement(transformation(extent={{0,0},{0,0}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step S2(
   nIn=1,
   nOut=1)
   annotation (Placement(transformation(extent={{0,0},{0,0}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_S2_1_Received(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    condition = pre(var2) == 2,
    use_syncReceive=true,
    numberOfSyncReceive=1,
    syncChannelName="myChannel")
   annotation (Placement(transformation(extent={{0,0},{0,0}})));
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
equation
   // connect initial step
   connect(entry[1], S2.inPort[1])
    annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect S2 -> Received
   connect(S2.outPort[1],
     transition_S2_1_Received.inPort)
    annotation (Line( color={0,0,0}, smooth=Smooth.None));
   connect(transition_S2_1_Received.outPort,
     Received.inPort[1])
    annotation (Line( color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
 annotation (Diagram(coordinateSystem(extent = {{0, 0}, {0,0}})));
end Region_2;

