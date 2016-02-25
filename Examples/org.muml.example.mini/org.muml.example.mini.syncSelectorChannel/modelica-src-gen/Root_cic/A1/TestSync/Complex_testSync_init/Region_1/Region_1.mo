	within Root_cic.A1.TestSync.Complex_testSync_init.Region_1;
model Region_1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -63.5}, {25.4, 63.5}})));
		// attribute declarations
		outer  Integer var1;
		outer  Integer var2;
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step S1(
			nIn=1,
			nOut=1)
			annotation (Placement(transformation(extent={{0.0, 50.8},{25.4, 63.5}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step Sent(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{0.0, 0.0},{25.4, 12.7}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_S1_1_Sent(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(var1) == 1
				,
				use_syncSend=true,
				numberOfSyncSend=1,
				syncChannelName="myChannel"
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
			connect(entry[1], S1.inPort[1])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect S1 -> Sent
			connect(S1.outPort[1],
					transition_S1_1_Sent.inPort)
				annotation (Line(points={ {12.7,50.8}, {12.7,50.8}, {12.7,38.099999999999994}, {12.7,38.099999999999994}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_S1_1_Sent.outPort,
					Sent.inPort[1])
				annotation (Line(points={ {12.7,25.4}, {12.7,25.4}, {12.7,12.7}, {12.7,12.7}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Region_1;

