	within Systemconfiguration.System.YellowSWInstance.RearBehavior.Complex_rearBehavior_init.RearMessagePort1;
model RearMessagePort1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-97.01402999999999, -47.271939999999994}, {97.01402999999999, 47.271939999999994}})));
		// attribute declarations
		inner Integer overtakingexexit;
		inner Integer noOvertakingexexit;
		// end attribute declarations
		// hybrid port declarations
	
	outer Real velocity;
	
	
	outer Real distance;
	
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_rearMessagePort1_noOvertaking.Complex_rearMessagePort1_noOvertaking noOvertaking(
			nIn=2,
			use_outPort=false,
			nSuspend=1)
			annotation (Placement(transformation(extent={{61.73597, -19.049999999999997},{87.13597, -6.35}})));
		
		
		Complex_rearMessagePort1_overtaking.Complex_rearMessagePort1_overtaking overtaking(
			nIn=1,
			use_outPort=false,
			nSuspend=1,
			use_activePort=true
	)
			annotation (Placement(transformation(extent={{65.26402999999999, 31.75},{90.66402999999998, 44.449999999999996}})));
		
			RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual overtakingInvariantc1(bound=(10) * 1.0);
		
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_noOvertaking_1_overtaking(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(noOvertakingexexit) == 1
				
			)
			annotation (Placement(transformation(extent={{65.26402999999999, -44.449746},{90.66402999999998, -31.749746}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_overtaking_1_noOvertaking(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true,
				condition = pre(overtakingexexit) == 1
				
			)
			annotation (Placement(transformation(extent={{61.73597, 6.35},{87.13597, 19.049999999999997}})));
		// end transition declarations
	
		// clock declarations
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c1(nu=2)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c2(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// raise message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_laneChanged(
			nIn=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-33.51402999999999, 6.35},{-8.114029999999994, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort laneChanged_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-33.51402999999999, 31.75},{-8.114029999999994, 44.449999999999996}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_request(
			nIn=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-1.7640299999999947, 6.35},{23.635970000000004, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort request_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-1.7640299999999947, 31.75},{23.635970000000004, 44.449999999999996}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_finish(
			nIn=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{29.985970000000005, 6.35},{55.38597, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort finish_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{29.985970000000005, 31.75},{55.38597, 44.449999999999996}})));
		// end raise message event declarations
		// trigger message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_decline(
			nIn=1,
			nOut=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=1,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-97.01402999999999, 6.35},{-71.61402999999999, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort decline_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation (Placement(transformation(extent={{-97.01402999999999, 31.75},{-71.61402999999999, 44.449999999999996}})));
		Real mailbox_decline_frontVelocity;
		RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_accept(
			nIn=1,
			nOut=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-65.26402999999999, 6.35},{-39.86402999999999, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort accept_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-65.26402999999999, 31.75},{-39.86402999999999, 44.449999999999996}})));
		// end trigger message event declarations
	equation
			// connect initial step
			connect(entry[1], noOvertaking.inPort[2])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect noOvertaking -> overtaking
			connect(noOvertaking.suspend[1],
					transition_noOvertaking_1_overtaking.inPort)
				annotation (Line(points={ {74.43597,-19.049999999999997}, {74.43597,-19.049999999999997}, {77.96403,-31.749746}, {77.96403,-31.749746}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_noOvertaking_1_overtaking.outPort,
					overtaking.inPort[1])
				annotation (Line(points={ {77.96403,-44.8025012}, {77.96403,-44.8025012}, {90.66402999999998,-44.449746}, {90.66402999999998,-44.449746}, {90.66402999999998,-44.449746}, {90.66402999999998,44.449999999999996}, {90.66402999999998,44.449999999999996}, {90.66402999999998,44.449999999999996}, {77.96403,44.803059999999995}, {77.96403,44.803059999999995}}, color={0,0,0}, smooth=Smooth.None));
			// connect overtaking -> noOvertaking
			connect(overtaking.suspend[1],
					transition_overtaking_1_noOvertaking.inPort)
				annotation (Line(points={ {77.96403,31.75}, {77.96403,31.75}, {74.43597,19.049999999999997}, {74.43597,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_overtaking_1_noOvertaking.outPort,
					noOvertaking.inPort[1])
				annotation (Line(points={ {74.43597,6.35}, {74.43597,6.35}, {74.43597,-6.35}, {74.43597,-6.35}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			connect(overtaking.activePort,
				overtakingInvariantc1.conditionPort);
			connect(c1.y,
				overtakingInvariantc1.clockValue);
			// end connect state invariants
			// connect raise message events
			connect(message_laneChanged.message_output_port,
				laneChanged_outputDelegationPort)
				annotation (Line(points={ {-20.814029999999992,31.75}, {-20.814029999999992,31.75}, {-20.814029999999992,19.049999999999997}, {-20.814029999999992,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(overtaking.region_1_rear_overtaking.transition_init_1_changed.firePort,
				message_laneChanged.conditionPort[1]);
			connect(message_request.message_output_port,
				request_outputDelegationPort)
				annotation (Line(points={ {10.935970000000005,31.75}, {10.935970000000005,31.75}, {10.935970000000005,19.049999999999997}, {10.935970000000005,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(noOvertaking.region_1_rear_noOvertaking.transition_init_1_requested.firePort,
				message_request.conditionPort[1]);
			connect(message_finish.message_output_port,
				finish_outputDelegationPort)
				annotation (Line(points={ {42.685970000000005,31.75}, {42.685970000000005,31.75}, {42.685970000000005,19.049999999999997}, {42.685970000000005,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_overtaking_1_noOvertaking.firePort,
				message_finish.conditionPort[1]);
			// end connect raise message events
			// connect trigger message events
			connect(mailbox_decline.mailbox_input_port[1],
				decline_inputDelegationPort)
				annotation (Line(points={ {-84.31402999999999,31.75}, {-84.31402999999999,31.75}, {-84.31402999999999,19.049999999999997}, {-84.31402999999999,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(mailbox_decline.mailbox_output_port[1],
				noOvertaking.region_1_rear_noOvertaking.transition_requested_1_Wait.transition_input_port[1]);
			connect(mailbox_accept.mailbox_input_port[1],
				accept_inputDelegationPort)
				annotation (Line(points={ {-52.56402999999999,31.75}, {-52.56402999999999,31.75}, {-52.56402999999999,19.049999999999997}, {-52.56402999999999,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(mailbox_accept.mailbox_output_port[1],
				noOvertaking.region_1_rear_noOvertaking.transition_requested_3_exexit.transition_input_port[1]);
			// end connect trigger message events
end RearMessagePort1;

