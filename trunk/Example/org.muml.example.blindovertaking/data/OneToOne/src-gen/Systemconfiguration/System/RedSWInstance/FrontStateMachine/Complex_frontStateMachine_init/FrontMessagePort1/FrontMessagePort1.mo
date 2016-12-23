	within Systemconfiguration.System.RedSWInstance.FrontStateMachine.Complex_frontStateMachine_init.FrontMessagePort1;
model FrontMessagePort1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-112.88902999999999, -47.271939999999994}, {112.88902999999999, 47.271939999999994}})));
		// attribute declarations
		inner Boolean noOvertakingenentry;
		inner Integer noOvertakingexexit;
		inner Integer noOvertakingExitVar;
		inner Real localVelocity(start=0);
		// end attribute declarations
		// hybrid port declarations
	
	outer Real velocity;
	
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_frontMessagePort1_noAcceleration.Complex_frontMessagePort1_noAcceleration noAcceleration(
			nIn=1,
			use_outPort=false,
			nSuspend=2)
			annotation (Placement(transformation(extent={{77.61097, 31.75},{103.01097, 44.449999999999996}})));
		
		
		Complex_frontMessagePort1_noOvertaking.Complex_frontMessagePort1_noOvertaking noOvertaking(
			nIn=3,
			use_outPort=false,
			nSuspend=1)
			annotation (Placement(transformation(extent={{77.61097, -19.049999999999997},{103.01097, -6.35}})));
		
		
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_noOvertaking_1_noAcceleration(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true,
				condition = pre(noOvertakingExitVar) == 1 and pre(noOvertakingexexit) == 1
				
			)
			annotation (Placement(transformation(extent={{81.13902999999999, -44.449746},{106.53902999999998, -31.749746}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_noAcceleration_2_noOvertaking(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{77.61097, 6.35},{103.01097, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_noAcceleration_1_noOvertaking(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{45.86097, 6.35},{71.26097, 19.049999999999997}})));
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// raise message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_accept(
			nIn=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-17.639029999999995, 6.35},{7.760970000000005, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort accept_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-17.639029999999995, 31.75},{7.760970000000005, 44.449999999999996}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_decline(
			nIn=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=1,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{14.110970000000005, 6.35},{39.51097, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort decline_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation (Placement(transformation(extent={{14.110970000000005, 31.75},{39.51097, 44.449999999999996}})));
		Real message_decline_frontVelocity;
		Modelica.Blocks.Sources.RealExpression message_decline_frontVelocityrealExpression(y=message_decline_frontVelocity);
		// end raise message event declarations
		// trigger message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_finish(
			nIn=1,
			nOut=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-112.88902999999999, 6.35},{-87.48902999999999, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort finish_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-112.88902999999999, 31.75},{-87.48902999999999, 44.449999999999996}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_request(
			nIn=1,
			nOut=2,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-81.13902999999999, 6.35},{-55.73902999999999, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort request_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-81.13902999999999, 31.75},{-55.73902999999999, 44.449999999999996}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_laneChanged(
			nIn=1,
			nOut=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{-49.38902999999999, 6.35},{-23.989029999999993, 19.049999999999997}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort laneChanged_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-49.38902999999999, 31.75},{-23.989029999999993, 44.449999999999996}})));
		// end trigger message event declarations
	equation
			// connect initial step
			connect(entry[1], noOvertaking.inPort[3])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect noAcceleration -> noOvertaking
			connect(noAcceleration.suspend[2],
					transition_noAcceleration_1_noOvertaking.inPort)
				annotation (Line(points={ {90.31097,31.75}, {90.31097,31.75}, {58.560970000000005,19.049999999999997}, {58.560970000000005,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_noAcceleration_1_noOvertaking.outPort,
					noOvertaking.inPort[1])
				annotation (Line(points={ {58.560970000000005,6.35}, {58.560970000000005,6.35}, {90.31097,-6.35}, {90.31097,-6.35}}, color={0,0,0}, smooth=Smooth.None));
			// connect noAcceleration -> noOvertaking
			connect(noAcceleration.suspend[1],
					transition_noAcceleration_2_noOvertaking.inPort)
				annotation (Line(points={ {90.31097,31.75}, {90.31097,31.75}, {90.31097,19.049999999999997}, {90.31097,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_noAcceleration_2_noOvertaking.outPort,
					noOvertaking.inPort[2])
				annotation (Line(points={ {90.31097,6.35}, {90.31097,6.35}, {90.31097,-6.35}, {90.31097,-6.35}}, color={0,0,0}, smooth=Smooth.None));
			// connect noOvertaking -> noAcceleration
			connect(noOvertaking.suspend[1],
					transition_noOvertaking_1_noAcceleration.inPort)
				annotation (Line(points={ {90.31097,-19.049999999999997}, {90.31097,-19.049999999999997}, {93.83903,-31.749746}, {93.83903,-31.749746}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_noOvertaking_1_noAcceleration.outPort,
					noAcceleration.inPort[1])
				annotation (Line(points={ {93.83903,-44.8025012}, {93.83903,-44.8025012}, {106.53902999999998,-44.449746}, {106.53902999999998,-44.449746}, {106.53902999999998,-44.449746}, {106.53902999999998,-31.749746}, {106.53902999999998,-31.749746}, {106.53902999999998,-31.749746}, {106.18597,19.049999999999997}, {106.18597,19.049999999999997}, {106.18597,19.049999999999997}, {103.01097,44.449999999999996}, {103.01097,44.449999999999996}, {103.01097,44.449999999999996}, {90.31097,44.803059999999995}, {90.31097,44.803059999999995}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
			// connect raise message events
			connect(message_accept.message_output_port,
				accept_outputDelegationPort)
				annotation (Line(points={ {-4.9390299999999945,31.75}, {-4.9390299999999945,31.75}, {-4.9390299999999945,19.049999999999997}, {-4.9390299999999945,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_noOvertaking_1_noAcceleration.firePort,
				message_accept.conditionPort[1]);
			connect(message_decline_frontVelocityrealExpression.y,
				message_decline.u_reals[1]);
			connect(message_decline.message_output_port,
				decline_outputDelegationPort)
				annotation (Line(points={ {26.810970000000005,31.75}, {26.810970000000005,31.75}, {26.810970000000005,19.049999999999997}, {26.810970000000005,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(noOvertaking.region_1_front_noOvertaking.transition_received_1_init.firePort,
				message_decline.conditionPort[1]);
			// end connect raise message events
			// connect trigger message events
			connect(mailbox_finish.mailbox_input_port[1],
				finish_inputDelegationPort)
				annotation (Line(points={ {-100.18902999999999,31.75}, {-100.18902999999999,31.75}, {-100.18902999999999,19.049999999999997}, {-100.18902999999999,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(mailbox_finish.mailbox_output_port[1],
				transition_noAcceleration_1_noOvertaking.transition_input_port[1]);
			connect(mailbox_request.mailbox_input_port[1],
				request_inputDelegationPort)
				annotation (Line(points={ {-68.43902999999999,31.75}, {-68.43902999999999,31.75}, {-68.43902999999999,19.049999999999997}, {-68.43902999999999,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(mailbox_request.mailbox_output_port[1],
				transition_noAcceleration_2_noOvertaking.transition_input_port[1]);
			connect(mailbox_request.mailbox_output_port[2],
				noOvertaking.region_1_front_noOvertaking.transition_init_1_received.transition_input_port[1]);
			connect(mailbox_laneChanged.mailbox_input_port[1],
				laneChanged_inputDelegationPort)
				annotation (Line(points={ {-36.689029999999995,31.75}, {-36.689029999999995,31.75}, {-36.689029999999995,19.049999999999997}, {-36.689029999999995,19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			connect(mailbox_laneChanged.mailbox_output_port[1],
				noAcceleration.region_1_front_noAcceleration.transition_noBraking_1_brakingAllowed.transition_input_port[1]);
			// end connect trigger message events
end FrontMessagePort1;

