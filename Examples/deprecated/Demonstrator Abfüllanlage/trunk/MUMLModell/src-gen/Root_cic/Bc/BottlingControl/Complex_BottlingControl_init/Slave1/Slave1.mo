	within Root_cic.Bc.BottlingControl.Complex_BottlingControl_init.Slave1;
model Slave1
	annotation (Diagram(coordinateSystem(extent = {{-68.43776, -165.80612}, {68.43776, 165.80612}})));
		// attribute declarations
		inner  Integer timeout;
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.RealInput fluidSensorPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real fluidSensor;
	Real fluidSensor_sampled;
	Modelica.Blocks.Interfaces.RealOutput outFlowTankPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real outFlowTank;
	Real outFlowTank_sampled;
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step FailSafe(
			nIn=2,
			nOut=2)
			annotation (Placement(transformation(extent={{43.03776, 25.753059999999998},{68.43776, 38.45306}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step Idle(
			nIn=2,
			initialStep=true,
			nOut=1)
			annotation (Placement(transformation(extent={{27.162759999999995, 127.35305999999999},{52.56276, 140.05306}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step Working(
			nIn=1,
			use_activePort=true,
			nOut=2)
			annotation (Placement(transformation(extent={{27.162759999999995, 76.55306},{52.56276, 89.25305999999999}})));
	
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLess WorkingInvariantc0(bound=(timeout) * 0.0010);
	
		// end step declarations
	
		// variable declarations for do events
		// end variable declarations for do events
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_FailSafe_1_Idle(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{40.56888, 152.75305999999998},{65.96888, 165.45306}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Idle_1_Working(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{27.162759999999995, 101.95305999999998},{52.56276, 114.65305999999998}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_FailSafe_2_FailSafe(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{43.03776, 0.35280600000000034},{68.43776, 13.052805999999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Working_2_Idle(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{0.0, 51.153059999999996},{25.4, 63.85306}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_Working_1_FailSafe(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{31.75, 51.153059999999996},{57.15, 63.85306}})));
		// end transition declarations
	
		// clock declarations
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c0(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
	
	equation
		
			// connect transition
			// connect FailSafe -> Idle
			connect(FailSafe.outPort[2],
					transition_FailSafe_1_Idle.inPort)
				annotation (Line(points={ {55.737759999999994,25.4}, {55.737759999999994,25.4}, {68.43776,25.753059999999998}, {68.43776,25.753059999999998}, {68.43776,25.753059999999998}, {68.43776,38.45306}, {68.43776,38.45306}, {68.43776,38.45306}, {67.02806,82.55}, {67.02806,82.55}, {67.02806,108.65612}, {67.02806,108.65612}, {67.02806,108.65612}, {67.02806,108.65612}, {65.96888,165.45306}, {65.96888,165.45306}, {65.96888,165.45306}, {53.268879999999996,165.80612}, {53.268879999999996,165.80612}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_FailSafe_1_Idle.outPort,
					Idle.inPort[1])
				annotation (Line(points={ {53.268879999999996,152.75305999999998}, {53.268879999999996,152.75305999999998}, {39.862759999999994,140.05306}, {39.862759999999994,140.05306}}, color={0,0,0}, smooth=Smooth.None));
			// connect FailSafe -> FailSafe
			connect(FailSafe.outPort[1],
					transition_FailSafe_2_FailSafe.inPort)
				annotation (Line(points={ {55.737759999999994,25.753059999999998}, {55.737759999999994,25.753059999999998}, {55.737759999999994,13.052805999999999}, {55.737759999999994,13.052805999999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_FailSafe_2_FailSafe.outPort,
					FailSafe.inPort[2])
				annotation (Line(points={ {55.737759999999994,0.0}, {55.737759999999994,0.0}, {68.43776,0.3527806}, {68.43776,0.3527806}, {68.43776,0.3527806}, {68.43776,38.45306}, {68.43776,38.45306}, {68.43776,38.45306}, {55.737759999999994,38.80612}, {55.737759999999994,38.80612}}, color={0,0,0}, smooth=Smooth.None));
			// connect Idle -> Working
			connect(Idle.outPort[1],
					transition_Idle_1_Working.inPort)
				annotation (Line(points={ {39.862759999999994,127.35305999999999}, {39.862759999999994,127.35305999999999}, {39.862759999999994,114.65305999999998}, {39.862759999999994,114.65305999999998}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_Idle_1_Working.outPort,
					Working.inPort[1])
				annotation (Line(points={ {39.862759999999994,101.95305999999998}, {39.862759999999994,101.95305999999998}, {39.862759999999994,89.25305999999999}, {39.862759999999994,89.25305999999999}}, color={0,0,0}, smooth=Smooth.None));
			// connect Working -> FailSafe
			connect(Working.outPort[2],
					transition_Working_1_FailSafe.inPort)
				annotation (Line(points={ {39.862759999999994,76.55306}, {39.862759999999994,76.55306}, {44.449999999999996,63.85306}, {44.449999999999996,63.85306}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_Working_1_FailSafe.outPort,
					FailSafe.inPort[1])
				annotation (Line(points={ {44.449999999999996,51.153059999999996}, {44.449999999999996,51.153059999999996}, {55.737759999999994,38.45306}, {55.737759999999994,38.45306}}, color={0,0,0}, smooth=Smooth.None));
			// connect Working -> Idle
			connect(Working.outPort[1],
					transition_Working_2_Idle.inPort)
				annotation (Line(points={ {39.862759999999994,76.55306}, {39.862759999999994,76.55306}, {12.7,63.85306}, {12.7,63.85306}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_Working_2_Idle.outPort,
					Idle.inPort[2])
				annotation (Line(points={ {12.7,50.8}, {12.7,50.8}, {25.4,51.153059999999996}, {25.4,51.153059999999996}, {25.4,51.153059999999996}, {25.4,63.85306}, {25.4,63.85306}, {25.4,63.85306}, {23.988775999999998,76.55306}, {23.988775999999998,76.55306}, {23.988775999999998,76.55306}, {23.988775999999998,114.65305999999998}, {23.988775999999998,114.65305999999998}, {23.988775999999998,114.65305999999998}, {52.56276,127.35305999999999}, {52.56276,127.35305999999999}, {52.56276,127.35305999999999}, {52.56276,140.05306}, {52.56276,140.05306}, {52.56276,140.05306}, {39.862759999999994,140.40612}, {39.862759999999994,140.40612}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			connect(Working.activePort,
				WorkingInvariantc0.conditionPort);
			connect(c0.y,
				WorkingInvariantc0.clockValue);
			// end connect state invariants
			// connect clock resets
			connect(init.region_1_slave1.Working.activePort,
				init.region_1_slave1.c0.u[1]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			fluidSensorPort = fluidSensor_sampled;
			outFlowTankPort = outFlowTank_sampled;
			// end connect hybrid ports
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (100) * 0.0010) then
			fluidSensor := fluidSensor_sampled;
		end when;
	algorithm
		when sample(0, (100) * 0.0010) then
			outFlowTank_sampled := outFlowTank;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			when init.region_1_slave1.transition_FailSafe_2_FailSafe.fire then
			end when;
			when init.region_1_slave1.transition_Idle_1_Working.fire then
			end when;
			when init.region_1_slave1.transition_FailSafe_1_Idle.fire then
			end when;
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			// end transition actions
			// assign parameter binding variables
			when init.region_1_slave1.transition_Working_1_FailSafe.fire then
			end when;
			when init.region_1_slave1.transition_FailSafe_2_FailSafe.fire then
			end when;
			when init.region_1_slave1.transition_Working_2_Idle.fire then
			end when;
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end Slave1;

