	within Root_cic.S1.C2.Receiver;
model Receiver
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.IntegerOutput LEDPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Integer LED;
	Integer LED_sampled(start=0);
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_Receiver_Receiver_main.Complex_Receiver_Receiver_main Receiver_main(
			nIn=0,
			use_outPort=false,
			nSuspend=0,
			initialStep=true
	)
			annotation (Placement(transformation(extent={{0.0, 0.0},{25.4, 12.7}})));
		
		
		// end step declarations
	
		// variable declarations for do events
		// end variable declarations for do events
	
	
		// transition declarations
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// trigger message event delegation port declarations for region in1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort in1_myMessage_inputDelegationPort(
			redeclare Integer integers[1],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end trigger message event delegation port declarations for region in1
	
		// trigger message event declarations (non port rtsc)
		// end trigger message event declarations (non port rtsc)
	equation
		
			// connect transition
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
			// connect clock resets
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			LEDPort = LED_sampled;
			// end connect hybrid ports
			// trigger message event port delegations for region in1
			connect(Receiver_main.region_1_in1.myMessage_inputDelegationPort,
				in1_myMessage_inputDelegationPort);
			// end trigger message event port delegations for region in1
			// raise message event port delegations for region in1
			// end raise message event port delegations for region in1
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (1) * 0.001) then
			LED_sampled := LED;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			when Receiver_main.region_1_in1.transition_init_1_init.fire then
				Receiver_main.region_1_in1.mailbox_myMessage_lightValue := Receiver_main.region_1_in1.transition_init_1_init.transition_input_port[1].integers[1];
			end when;
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			when pre(Receiver_main.region_1_in1.transition_init_1_init.fire) then
				LED := Receiver_main.region_1_in1.mailbox_myMessage_lightValue;
				
			end when;
			// end transition actions
			// assign parameter binding variables
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end Receiver;

