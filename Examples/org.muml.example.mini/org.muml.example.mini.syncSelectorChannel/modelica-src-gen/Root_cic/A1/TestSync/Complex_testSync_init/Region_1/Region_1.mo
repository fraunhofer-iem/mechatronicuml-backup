within Root_cic.A1.TestSync.Complex_testSync_init.Region_1;
model Region_1
               extends Modelica_StateGraph2.PartialParallel(nEntry=1);
  // attribute declarations
  outer Integer  var1;
  outer Integer  var2;
  // end attribute declarations
  // hybrid port declarations
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Step S1(
   nIn=1,
   nOut=1)
   annotation (Placement(transformation(extent={{0,0}, {0,0}})));

  RealTimeCoordinationLibrary.RealTimeCoordination.Step Sent(
   nIn=1,
   nOut=0)
   annotation (Placement(transformation(extent={{0,0}, {0,0}})));

  // end step declarations
  // exit point declarations
  // end exit point declarations

  // transition declarations
  RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_S1_1_Sent(
    use_after=true,
       afterTime=10^(-6),
    loopCheck=false,
    selectorExpression=pre(var1),
    use_syncSend=true,
    numberOfSyncSend=1,
    syncChannelName="myChannel")
   annotation (Placement(transformation(extent={{0,0}, {0,0}})));
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations
equation
   // connect initial step
   connect(entry[1], S1.inPort[1])
    annotation(Line(points={{0,100},{0.5,1}},
                                          color={0,0,0},smooth=Smooth.None));
   // end connect initial step
   // connect transition
   // connect S1 -> Sent
   connect(S1.outPort[1],
     transition_S1_1_Sent.inPort)
    annotation (Line( color={0,0,0}, smooth=Smooth.None));
   connect(transition_S1_1_Sent.outPort,
     Sent.inPort[1])
    annotation (Line( color={0,0,0}, smooth=Smooth.None));
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
 annotation (Diagram(coordinateSystem(extent={{0,0}, {0,0}})));
end Region_1;

