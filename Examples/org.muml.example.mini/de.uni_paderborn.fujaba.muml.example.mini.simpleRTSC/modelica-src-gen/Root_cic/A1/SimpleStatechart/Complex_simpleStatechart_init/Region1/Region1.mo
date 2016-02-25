	within Root_cic.A1.SimpleStatechart.Complex_simpleStatechart_init.Region1;
model Region1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-68.43776, -115.00612}, {68.43776, 115.00612}})));
		// attribute declarations
		outer  Integer myVariable;
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step State_A(
			nIn=3,
			nOut=2)
			annotation (Placement(transformation(extent={{13.40612, 76.55306},{38.80612, 89.25305999999999}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step State_B(
			nIn=2,
			nOut=2)
			annotation (Placement(transformation(extent={{43.03776, 25.753059999999998},{68.43776, 38.45306}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_State_A_1_State_A(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{0.0, 51.153059999999996},{25.4, 63.85306}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_State_B_1_State_A(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(myVariable) == 0
				
			)
			annotation (Placement(transformation(extent={{40.56888, 101.95305999999998},{65.96888, 114.65305999999998}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_State_B_2_State_B(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{43.03776, 0.35280600000000034},{68.43776, 13.052805999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_State_A_2_State_B(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(myVariable) == 42
				
			)
			annotation (Placement(transformation(extent={{31.75, 51.153059999999996},{57.15, 63.85306}})));
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// trigger message event declarations (non port rtsc)
		// end trigger message event declarations (non port rtsc)
	equation
			// connect initial step
			connect(entry[1], State_A.inPort[3])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect State_A -> State_B
			connect(State_A.outPort[1],
					transition_State_A_2_State_B.inPort)
				annotation (Line(points={ {26.10612,76.55306}, {26.10612,76.55306}, {44.449999999999996,63.85306}, {44.449999999999996,63.85306}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_A_2_State_B.outPort,
					State_B.inPort[1])
				annotation (Line(points={ {44.449999999999996,51.153059999999996}, {44.449999999999996,51.153059999999996}, {55.737759999999994,38.45306}, {55.737759999999994,38.45306}}, color={0,0,0}, smooth=Smooth.None));
			// connect State_A -> State_A
			connect(State_A.outPort[2],
					transition_State_A_1_State_A.inPort)
				annotation (Line(points={ {26.10612,76.55306}, {26.10612,76.55306}, {12.7,63.85306}, {12.7,63.85306}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_A_1_State_A.outPort,
					State_A.inPort[2])
				annotation (Line(points={ {12.7,50.8}, {12.7,50.8}, {25.4,51.153059999999996}, {25.4,51.153059999999996}, {25.4,51.153059999999996}, {28.92806,63.85306}, {28.92806,63.85306}, {28.92806,63.85306}, {38.80612,76.55306}, {38.80612,76.55306}, {38.80612,76.55306}, {38.80612,89.25305999999999}, {38.80612,89.25305999999999}, {38.80612,89.25305999999999}, {26.10612,89.60611999999999}, {26.10612,89.60611999999999}}, color={0,0,0}, smooth=Smooth.None));
			// connect State_B -> State_A
			connect(State_B.outPort[2],
					transition_State_B_1_State_A.inPort)
				annotation (Line(points={ {55.737759999999994,25.4}, {55.737759999999994,25.4}, {68.43776,25.753059999999998}, {68.43776,25.753059999999998}, {68.43776,25.753059999999998}, {68.43776,38.45306}, {68.43776,38.45306}, {68.43776,38.45306}, {65.96888,114.65305999999998}, {65.96888,114.65305999999998}, {65.96888,114.65305999999998}, {53.268879999999996,115.00612}, {53.268879999999996,115.00612}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_B_1_State_A.outPort,
					State_A.inPort[1])
				annotation (Line(points={ {53.268879999999996,101.95305999999998}, {53.268879999999996,101.95305999999998}, {26.10612,89.25305999999999}, {26.10612,89.25305999999999}}, color={0,0,0}, smooth=Smooth.None));
			// connect State_B -> State_B
			connect(State_B.outPort[1],
					transition_State_B_2_State_B.inPort)
				annotation (Line(points={ {55.737759999999994,25.753059999999998}, {55.737759999999994,25.753059999999998}, {55.737759999999994,13.052805999999999}, {55.737759999999994,13.052805999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_B_2_State_B.outPort,
					State_B.inPort[2])
				annotation (Line(points={ {55.737759999999994,0.0}, {55.737759999999994,0.0}, {68.43776,0.3527806}, {68.43776,0.3527806}, {68.43776,0.3527806}, {68.43776,38.45306}, {68.43776,38.45306}, {68.43776,38.45306}, {55.737759999999994,38.80612}, {55.737759999999994,38.80612}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Region1;

