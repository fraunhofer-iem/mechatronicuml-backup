	within Root_cic.A1.RootStatechart.Complex_rootStatechart_init.Region1;
model Region1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-57.15, -115.00612}, {57.15, 115.00612}})));
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
			annotation (Placement(transformation(extent={{29.281119999999998, 25.753059999999998},{54.68112, 38.45306}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step State_B(
			nIn=2,
			nOut=2)
			annotation (Placement(transformation(extent={{13.40612, 76.55306},{38.80612, 89.25305999999999}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_State_A_1_State_A(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{31.75, 0.35280600000000034},{57.15, 13.052805999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_State_A_2_State_B(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(myVariable) == 42
				
			)
			annotation (Placement(transformation(extent={{0.0, 0.35280600000000034},{25.4, 13.052805999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_State_B_2_State_A(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(myVariable) == 0
				
			)
			annotation (Placement(transformation(extent={{24.693879999999996, 51.153059999999996},{50.09388, 63.85306}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_State_B_1_State_B(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{13.40612, 101.95305999999998},{38.80612, 114.65305999999998}})));
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
				annotation (Line(points={ {41.98112,25.753059999999998}, {41.98112,25.753059999999998}, {12.7,13.052805999999999}, {12.7,13.052805999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_A_2_State_B.outPort,
					State_B.inPort[1])
				annotation (Line(points={ {12.7,0.0}, {12.7,0.0}, {25.4,0.3527806}, {25.4,0.3527806}, {25.4,0.3527806}, {25.4,13.052805999999999}, {25.4,13.052805999999999}, {25.4,13.052805999999999}, {21.519388,51.153059999999996}, {21.519388,51.153059999999996}, {21.519388,51.153059999999996}, {21.519388,63.85306}, {21.519388,63.85306}, {21.519388,63.85306}, {38.80612,76.55306}, {38.80612,76.55306}, {38.80612,76.55306}, {38.80612,89.25305999999999}, {38.80612,89.25305999999999}, {38.80612,89.25305999999999}, {26.10612,89.60611999999999}, {26.10612,89.60611999999999}}, color={0,0,0}, smooth=Smooth.None));
			// connect State_A -> State_A
			connect(State_A.outPort[2],
					transition_State_A_1_State_A.inPort)
				annotation (Line(points={ {41.98112,25.753059999999998}, {41.98112,25.753059999999998}, {44.449999999999996,13.052805999999999}, {44.449999999999996,13.052805999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_A_1_State_A.outPort,
					State_A.inPort[2])
				annotation (Line(points={ {44.449999999999996,0.0}, {44.449999999999996,0.0}, {57.15,0.3527806}, {57.15,0.3527806}, {57.15,0.3527806}, {57.15,13.052805999999999}, {57.15,13.052805999999999}, {57.15,13.052805999999999}, {54.68112,38.45306}, {54.68112,38.45306}, {54.68112,38.45306}, {41.98112,38.80612}, {41.98112,38.80612}}, color={0,0,0}, smooth=Smooth.None));
			// connect State_B -> State_A
			connect(State_B.outPort[1],
					transition_State_B_2_State_A.inPort)
				annotation (Line(points={ {26.10612,76.55306}, {26.10612,76.55306}, {37.393879999999996,63.85306}, {37.393879999999996,63.85306}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_B_2_State_A.outPort,
					State_A.inPort[1])
				annotation (Line(points={ {37.393879999999996,51.153059999999996}, {37.393879999999996,51.153059999999996}, {41.98112,38.45306}, {41.98112,38.45306}}, color={0,0,0}, smooth=Smooth.None));
			// connect State_B -> State_B
			connect(State_B.outPort[2],
					transition_State_B_1_State_B.inPort)
				annotation (Line(points={ {26.10612,76.19999999999999}, {26.10612,76.19999999999999}, {38.80612,76.55306}, {38.80612,76.55306}, {38.80612,76.55306}, {38.80612,114.65305999999998}, {38.80612,114.65305999999998}, {38.80612,114.65305999999998}, {26.10612,115.00612}, {26.10612,115.00612}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_State_B_1_State_B.outPort,
					State_B.inPort[2])
				annotation (Line(points={ {26.10612,101.95305999999998}, {26.10612,101.95305999999998}, {26.10612,89.25305999999999}, {26.10612,89.25305999999999}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Region1;

