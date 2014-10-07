	within Systemconfiguration.System.YellowSWInstance.RearBehavior.Complex_rearBehavior_init.RearMessagePort1.Complex_rearMessagePort1_overtaking.Rear_overtaking;
model Rear_overtaking extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-12.7, -57.15}, {12.7, 57.15}})));
		// attribute declarations
		outer Integer overtakingexexit;
		outer Integer noOvertakingexexit;
		// end attribute declarations
		// hybrid port declarations
	
	outer Real velocity;
	
	
	outer Real distance;
	
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step changed(
			nIn=1,
			nOut=1)
			annotation (Placement(transformation(extent={{-12.7, -6.35},{12.7, 6.35}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step exexit(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{-12.7, -57.15},{12.7, -44.449999999999996}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step init(
			nIn=1,
			nOut=1)
			annotation (Placement(transformation(extent={{-12.7, 44.449999999999996},{12.7, 57.15}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_init_1_changed(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{-12.7, 19.049999999999997},{12.7, 31.75}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_changed_1_exexit(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(distance) > 0.1
				
			)
			annotation (Placement(transformation(extent={{-12.7, -31.75},{12.7, -19.049999999999997}})));
		// end transition declarations
	
		// clock declarations
		outer RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c1(nu=2)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		outer RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c2(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
	equation
			// connect initial step
			connect(entry[1], init.inPort[1])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect changed -> exexit
			connect(changed.outPort[1],
					transition_changed_1_exexit.inPort)
				annotation (Line(points={ {0.0,-6.35}, {0.0,-6.35}, {0.0,-19.049999999999997}, {0.0,-19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_changed_1_exexit.outPort,
					exexit.inPort[1])
				annotation (Line(points={ {0.0,-31.75}, {0.0,-31.75}, {0.0,-44.449999999999996}, {0.0,-44.449999999999996}}, color={0,0,0}, smooth=Smooth.None));
			// connect init -> changed
			connect(init.outPort[1],
					transition_init_1_changed.inPort)
				annotation (Line(points={ {0.0,44.449999999999996}, {0.0,44.449999999999996}, {0.0,31.75}, {0.0,31.75}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_init_1_changed.outPort,
					changed.inPort[1])
				annotation (Line(points={ {0.0,19.049999999999997}, {0.0,19.049999999999997}, {0.0,6.35}, {0.0,6.35}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Rear_overtaking;

