	within Systemconfiguration.System.YellowSWInstance.RearBehavior.Complex_rearBehavior_init.RearMessagePort1.Complex_rearMessagePort1_noOvertaking.Rear_noOvertaking;
model Rear_noOvertaking extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-40.21709, -70.20306}, {40.21709, 70.20306}})));
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
		RealTimeCoordinationLibrary.RealTimeCoordination.Step Wait(
			nIn=1,
			nOut=1)
			annotation (Placement(transformation(extent={{14.81709, 6.35},{40.21709, 19.049999999999997}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step exexit(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{-30.339284, 6.35},{-4.939284000000002, 19.049999999999997}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step init(
			nIn=3,
			nOut=1)
			annotation (Placement(transformation(extent={{-16.93291, -44.449999999999996},{8.46709, -31.75}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step requested(
			nIn=1,
			use_activePort=true,
			nOut=3)
			annotation (Placement(transformation(extent={{-19.051270000000002, 57.149999999999984},{6.348729999999997, 69.84999999999998}})));
	
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual requestedInvariantc1(bound=(7) * 1.0);
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_requested_2_init(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true
			)
			annotation (Placement(transformation(extent={{-16.93291, -19.049999999999997},{8.46709, -6.35}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_requested_3_exexit(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{-30.339284, 31.749999999999986},{-4.939284000000002, 44.44999999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Wait_1_init(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true
			)
			annotation (Placement(transformation(extent={{14.81709, -19.049999999999997},{40.21709, -6.35}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_requested_1_Wait(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=1,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{14.81709, 31.749999999999986},{40.21709, 44.44999999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_init_1_requested(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true,
				condition = pre(distance) < 0.1
				
			)
			annotation (Placement(transformation(extent={{-34.925508, -69.85025399999999},{-9.525507999999997, -57.150254}})));
		// end transition declarations
	
		// clock declarations
		outer RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c1(nu=2)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		outer RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c2(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_requested_2_init_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual clock_constraint_transition_requested_2_init_1(
			bound=(6) * 1.0)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_Wait_1_init_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater clock_constraint_transition_Wait_1_init_1(
			bound=(2) * 1.0)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock constraint declarations
	equation
			// connect initial step
			connect(entry[1], init.inPort[3])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect Wait -> init
			connect(Wait.outPort[1],
					transition_Wait_1_init.inPort)
				annotation (Line(points={ {27.51709,6.35}, {27.51709,6.35}, {27.51709,-6.35}, {27.51709,-6.35}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_Wait_1_init.outPort,
					init.inPort[2])
				annotation (Line(points={ {27.51709,-19.049999999999997}, {27.51709,-19.049999999999997}, {-4.232909999999999,-31.75}, {-4.232909999999999,-31.75}}, color={0,0,0}, smooth=Smooth.None));
			// connect init -> requested
			connect(init.outPort[1],
					transition_init_1_requested.inPort)
				annotation (Line(points={ {-4.232909999999999,-44.449999999999996}, {-4.232909999999999,-44.449999999999996}, {-22.225507999999998,-57.150254}, {-22.225507999999998,-57.150254}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_init_1_requested.outPort,
					requested.inPort[1])
				annotation (Line(points={ {-22.225507999999998,-70.20306}, {-22.225507999999998,-70.20306}, {-9.526270000000002,-69.8502794}, {-9.526270000000002,-69.8502794}, {-9.526270000000002,-69.8502794}, {-9.526270000000002,-57.150254}, {-9.526270000000002,-57.150254}, {-9.526270000000002,-57.150254}, {-20.108672,-44.449999999999996}, {-20.108672,-44.449999999999996}, {-20.108672,-44.449999999999996}, {-40.21709,-13.05306}, {-40.21709,-13.05306}, {-40.21709,13.05306}, {-40.21709,13.05306}, {-40.21709,13.05306}, {-40.21709,13.05306}, {-33.514284,44.44999999999999}, {-33.514284,44.44999999999999}, {-33.514284,44.44999999999999}, {6.348729999999997,57.149999999999984}, {6.348729999999997,57.149999999999984}, {6.348729999999997,57.149999999999984}, {6.348729999999997,69.84999999999998}, {6.348729999999997,69.84999999999998}, {6.348729999999997,69.84999999999998}, {-6.351270000000002,70.20306}, {-6.351270000000002,70.20306}}, color={0,0,0}, smooth=Smooth.None));
			// connect requested -> exexit
			connect(requested.outPort[1],
					transition_requested_3_exexit.inPort)
				annotation (Line(points={ {-6.351270000000002,57.149999999999984}, {-6.351270000000002,57.149999999999984}, {-17.639284,44.44999999999999}, {-17.639284,44.44999999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_requested_3_exexit.outPort,
					exexit.inPort[1])
				annotation (Line(points={ {-17.639284,31.749999999999986}, {-17.639284,31.749999999999986}, {-17.639284,19.049999999999997}, {-17.639284,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			// connect requested -> init
			connect(requested.outPort[2],
					transition_requested_2_init.inPort)
				annotation (Line(points={ {-6.351270000000002,57.149999999999984}, {-6.351270000000002,57.149999999999984}, {-1.7640300000000002,44.44999999999999}, {-1.7640300000000002,44.44999999999999}, {-1.7640300000000002,44.44999999999999}, {-1.7640300000000002,6.35}, {-1.7640300000000002,6.35}, {-1.7640300000000002,6.35}, {-4.232909999999999,-6.35}, {-4.232909999999999,-6.35}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_requested_2_init.outPort,
					init.inPort[1])
				annotation (Line(points={ {-4.232909999999999,-19.049999999999997}, {-4.232909999999999,-19.049999999999997}, {-4.232909999999999,-31.75}, {-4.232909999999999,-31.75}}, color={0,0,0}, smooth=Smooth.None));
			// connect requested -> Wait
			connect(requested.outPort[3],
					transition_requested_1_Wait.inPort)
				annotation (Line(points={ {-6.351270000000002,57.149999999999984}, {-6.351270000000002,57.149999999999984}, {27.51709,44.44999999999999}, {27.51709,44.44999999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_requested_1_Wait.outPort,
					Wait.inPort[1])
				annotation (Line(points={ {27.51709,31.749999999999986}, {27.51709,31.749999999999986}, {27.51709,19.049999999999997}, {27.51709,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			connect(c1.y, clock_constraint_transition_requested_2_init_1.clockValue);
			connect(clock_constraint_transition_requested_2_init_1.firePort,
				transition_requested_2_init_AND.u[1]);
			connect(transition_requested_2_init_AND.y, transition_requested_2_init.conditionPort);
			connect(c2.y, clock_constraint_transition_Wait_1_init_1.clockValue);
			connect(clock_constraint_transition_Wait_1_init_1.firePort,
				transition_Wait_1_init_AND.u[1]);
			connect(transition_Wait_1_init_AND.y, transition_Wait_1_init.conditionPort);
			// end connect clock constraints
			// connect state invariants
			connect(requested.activePort,
				requestedInvariantc1.conditionPort);
			connect(c1.y,
				requestedInvariantc1.clockValue);
			// end connect state invariants
end Rear_noOvertaking;

