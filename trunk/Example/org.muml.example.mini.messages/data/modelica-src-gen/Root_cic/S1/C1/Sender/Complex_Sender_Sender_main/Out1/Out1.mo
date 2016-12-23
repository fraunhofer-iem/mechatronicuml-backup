	within Root_cic.S1.C1.Sender.Complex_Sender_Sender_main.Out1;
model Out1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-67.02806, -94.54387999999999}, {67.02806, 94.54387999999999}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step MessageSent(
			nIn=1,
			use_activePort=true,
			nOut=1)
			annotation (Placement(transformation(extent={{35.278059999999996, 79.02194},{60.678059999999995, 91.72193999999999}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step init(
			nIn=2,
			use_activePort=true,
			nOut=1)
			annotation (Placement(transformation(extent={{31.75, 28.221939999999996},{57.15, 40.92194}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_MessageSent_1_init(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{31.75, 53.621939999999995},{57.15, 66.32194}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_init_1_MessageSent(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{35.278059999999996, 2.8221939999999996},{60.678059999999995, 15.522194}})));
		// end transition declarations
	
		// clock declarations
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock clock(nu=2)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_MessageSent_1_init_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual clock_constraint_transition_MessageSent_1_init_1(
			bound=(1) * 1.0)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_init_1_MessageSent_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual clock_constraint_transition_init_1_MessageSent_1(
			bound=(1) * 1.0)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock constraint declarations
		// raise message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_myMessage(
			nIn=2,
			numberOfMessageIntegers=1,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{0.0, 53.621939999999995},{25.4, 66.32194}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort myMessage_outputDelegationPort(
			redeclare Integer integers[1],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{0.0, 79.02194},{25.4, 91.72193999999999}})));
		Integer message_myMessage_lightValue;
		Modelica.Blocks.Sources.IntegerExpression message_myMessage_lightValueintegerExpression(y=pre(message_myMessage_lightValue));
		// end raise message event declarations
		// trigger message event declarations
		// end trigger message event declarations
	equation
			// connect initial step
			connect(entry[1], init.inPort[2])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect MessageSent -> init
			connect(MessageSent.outPort[1],
					transition_MessageSent_1_init.inPort)
				annotation (Line(points={ {47.97806,79.02194}, {47.97806,79.02194}, {44.449999999999996,66.32194}, {44.449999999999996,66.32194}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_MessageSent_1_init.outPort,
					init.inPort[1])
				annotation (Line(points={ {44.449999999999996,53.621939999999995}, {44.449999999999996,53.621939999999995}, {44.449999999999996,40.92194}, {44.449999999999996,40.92194}}, color={0,0,0}, smooth=Smooth.None));
			// connect init -> MessageSent
			connect(init.outPort[1],
					transition_init_1_MessageSent.inPort)
				annotation (Line(points={ {44.449999999999996,28.221939999999996}, {44.449999999999996,28.221939999999996}, {47.97806,15.522194}, {47.97806,15.522194}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_init_1_MessageSent.outPort,
					MessageSent.inPort[1])
				annotation (Line(points={ {47.97806,2.4694388}, {47.97806,2.4694388}, {60.678059999999995,2.8221939999999996}, {60.678059999999995,2.8221939999999996}, {60.678059999999995,2.8221939999999996}, {60.678059999999995,91.72193999999999}, {60.678059999999995,91.72193999999999}, {60.678059999999995,91.72193999999999}, {47.97806,92.07499999999999}, {47.97806,92.07499999999999}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			connect(clock.y, clock_constraint_transition_init_1_MessageSent_1.clockValue);
			connect(clock_constraint_transition_init_1_MessageSent_1.firePort,
				transition_init_1_MessageSent_AND.u[1]);
			connect(transition_init_1_MessageSent_AND.y, transition_init_1_MessageSent.conditionPort);
			connect(clock.y, clock_constraint_transition_MessageSent_1_init_1.clockValue);
			connect(clock_constraint_transition_MessageSent_1_init_1.firePort,
				transition_MessageSent_1_init_AND.u[1]);
			connect(transition_MessageSent_1_init_AND.y, transition_MessageSent_1_init.conditionPort);
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
			// connect raise message events
			connect(message_myMessage_lightValueintegerExpression.y,
				message_myMessage.u_integers[1]);
			connect(message_myMessage.message_output_port,
				myMessage_outputDelegationPort)
				annotation (Line(points={ {12.7,79.02194}, {12.7,79.02194}, {12.7,66.32194}, {12.7,66.32194}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_init_1_MessageSent.firePort,
				message_myMessage.conditionPort[1]);
			connect(transition_MessageSent_1_init.firePort,
				message_myMessage.conditionPort[2]);
			// end connect raise message events
			// connect trigger message events
			// end connect trigger message events
end Out1;

