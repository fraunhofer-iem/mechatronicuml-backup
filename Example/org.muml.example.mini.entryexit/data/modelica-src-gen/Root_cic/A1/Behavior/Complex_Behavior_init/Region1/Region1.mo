	within Root_cic.A1.Behavior.Complex_Behavior_init.Region1;
model Region1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -114.3}, {25.4, 114.3}})));
		// attribute declarations
		inner  Boolean CompositeE1;
		outer  Integer i;
		inner  Integer CompositeExitVar;
		inner  Integer CompositeE2;
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_Region1_Composite.Complex_Region1_Composite Composite(
			nIn=1,
			use_outPort=false,
			nSuspend=1)
			annotation (Placement(transformation(extent={{0.0, 50.8},{25.4, 63.5}})));
		
		
		RealTimeCoordinationLibrary.RealTimeCoordination.Step End(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{0.0, 0.0},{25.4, 12.7}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step Start(
			nIn=1,
			nOut=1)
			annotation (Placement(transformation(extent={{0.0, 101.6},{25.4, 114.3}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Start_1_Composite(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{0.0, 76.19999999999999},{25.4, 88.89999999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Composite_1_End(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(CompositeExitVar) == 1 and pre(CompositeE2) == 1
				
			)
			annotation (Placement(transformation(extent={{0.0, 25.4},{25.4, 38.099999999999994}})));
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// trigger message event declarations (non port rtsc)
		// end trigger message event declarations (non port rtsc)
	equation
			// connect initial step
			connect(entry[1], Start.inPort[1])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect Composite -> End
			connect(Composite.suspend[1],
					transition_Composite_1_End.inPort)
				annotation (Line(points={ {12.7,50.8}, {12.7,50.8}, {12.7,38.099999999999994}, {12.7,38.099999999999994}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_Composite_1_End.outPort,
					End.inPort[1])
				annotation (Line(points={ {12.7,25.4}, {12.7,25.4}, {12.7,12.7}, {12.7,12.7}}, color={0,0,0}, smooth=Smooth.None));
			// connect Start -> Composite
			connect(Start.outPort[1],
					transition_Start_1_Composite.inPort)
				annotation (Line(points={ {12.7,101.6}, {12.7,101.6}, {12.7,88.89999999999999}, {12.7,88.89999999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_Start_1_Composite.outPort,
					Composite.inPort[1])
				annotation (Line(points={ {12.7,76.19999999999999}, {12.7,76.19999999999999}, {12.7,63.5}, {12.7,63.5}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Region1;

