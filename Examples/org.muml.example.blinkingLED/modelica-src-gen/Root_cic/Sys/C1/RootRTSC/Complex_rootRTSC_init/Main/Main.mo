	within Root_cic.Sys.C1.RootRTSC.Complex_rootRTSC_init.Main;
model Main extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-36.68776, -89.60611999999999}, {36.68776, 89.60611999999999}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	
	outer Integer LED_voltage;
	
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step LED_off(
			nIn=2,
			use_activePort=true,
			nOut=1)
			annotation (Placement(transformation(extent={{11.288775999999999, 0.35280600000000034},{36.688776, 13.052805999999999}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step LED_on(
			nIn=1,
			use_activePort=true,
			nOut=1)
			annotation (Placement(transformation(extent={{0.0, 51.153059999999996},{25.4, 63.85306}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_LED_off_1_LED_on(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true
			)
			annotation (Placement(transformation(extent={{11.288775999999999, 76.55306},{36.688776, 89.25305999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_LED_on_1_LED_off(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true
			)
			annotation (Placement(transformation(extent={{0.0, 25.753059999999998},{25.4, 38.45306}})));
		// end transition declarations
	
		// clock declarations
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock changingClock(nu=2)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_LED_off_1_LED_on_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual clock_constraint_transition_LED_off_1_LED_on_1(
			bound=(500) * 0.001)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_LED_on_1_LED_off_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual clock_constraint_transition_LED_on_1_LED_off_1(
			bound=(500) * 0.001)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock constraint declarations
		// trigger message event declarations (non port rtsc)
		// end trigger message event declarations (non port rtsc)
	equation
			// connect initial step
			connect(entry[1], LED_off.inPort[2])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect LED_off -> LED_on
			connect(LED_off.outPort[1],
					transition_LED_off_1_LED_on.inPort)
				annotation (Line(points={ {23.988775999999998,0.0}, {23.988775999999998,0.0}, {36.68776,0.3527806}, {36.68776,0.3527806}, {36.68776,0.3527806}, {36.68776,89.25305999999999}, {36.68776,89.25305999999999}, {36.68776,89.25305999999999}, {23.988775999999998,89.60611999999999}, {23.988775999999998,89.60611999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_LED_off_1_LED_on.outPort,
					LED_on.inPort[1])
				annotation (Line(points={ {23.988775999999998,76.55306}, {23.988775999999998,76.55306}, {12.7,63.85306}, {12.7,63.85306}}, color={0,0,0}, smooth=Smooth.None));
			// connect LED_on -> LED_off
			connect(LED_on.outPort[1],
					transition_LED_on_1_LED_off.inPort)
				annotation (Line(points={ {12.7,51.153059999999996}, {12.7,51.153059999999996}, {12.7,38.45306}, {12.7,38.45306}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_LED_on_1_LED_off.outPort,
					LED_off.inPort[1])
				annotation (Line(points={ {12.7,25.753059999999998}, {12.7,25.753059999999998}, {23.988775999999998,13.052805999999999}, {23.988775999999998,13.052805999999999}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			connect(changingClock.y, clock_constraint_transition_LED_off_1_LED_on_1.clockValue);
			connect(clock_constraint_transition_LED_off_1_LED_on_1.firePort,
				transition_LED_off_1_LED_on_AND.u[1]);
			connect(transition_LED_off_1_LED_on_AND.y, transition_LED_off_1_LED_on.conditionPort);
			connect(changingClock.y, clock_constraint_transition_LED_on_1_LED_off_1.clockValue);
			connect(clock_constraint_transition_LED_on_1_LED_off_1.firePort,
				transition_LED_on_1_LED_off_AND.u[1]);
			connect(transition_LED_on_1_LED_off_AND.y, transition_LED_on_1_LED_off.conditionPort);
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Main;

