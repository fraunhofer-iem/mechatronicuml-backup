	within Root_cic.S1.C2.Receiver.Complex_Receiver_Receiver_main.In1;
model In1 extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-59.97194, -43.74388}, {59.97194, 43.74388}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	
	outer Integer LED;
	
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step init(
			nIn=2,
			nOut=1)
			annotation (Placement(transformation(extent={{31.75, 2.8221939999999996},{57.15, 15.522194}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_init_1_init(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=1,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{31.75, 28.221939999999996},{57.15, 40.92194}})));
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// raise message event declarations
		// end raise message event declarations
		// trigger message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox mailbox_myMessage(
			nIn=1,
			nOut=1,
			numberOfMessageIntegers=1,
			numberOfMessageReals=0,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{0.0, 2.8221939999999996},{25.4, 15.522194}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort myMessage_inputDelegationPort(
			redeclare Integer integers[1],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{0.0, 28.221939999999996},{25.4, 40.92194}})));
		inner Integer mailbox_myMessage_lightValue;
		
		// end trigger message event declarations
	equation
			// connect initial step
			connect(entry[1], init.inPort[2])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect init -> init
			connect(init.outPort[1],
					transition_init_1_init.inPort)
				annotation (Line(points={ {44.449999999999996,2.4694388}, {44.449999999999996,2.4694388}, {57.15,2.8221939999999996}, {57.15,2.8221939999999996}, {57.15,2.8221939999999996}, {57.15,40.92194}, {57.15,40.92194}, {57.15,40.92194}, {44.449999999999996,41.275}, {44.449999999999996,41.275}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_init_1_init.outPort,
					init.inPort[1])
				annotation (Line(points={ {44.449999999999996,28.221939999999996}, {44.449999999999996,28.221939999999996}, {44.449999999999996,15.522194}, {44.449999999999996,15.522194}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
			// connect raise message events
			// end connect raise message events
			// connect trigger message events
			connect(mailbox_myMessage.mailbox_input_port[1],
				myMessage_inputDelegationPort)
				annotation (Line(points={ {12.7,28.221939999999996}, {12.7,28.221939999999996}, {12.7,15.522194}, {12.7,15.522194}}, color={0,0,0}, smooth=Smooth.None));
			connect(mailbox_myMessage.mailbox_output_port[1],
				transition_init_1_init.transition_input_port[1]);
			// end connect trigger message events
end In1;

