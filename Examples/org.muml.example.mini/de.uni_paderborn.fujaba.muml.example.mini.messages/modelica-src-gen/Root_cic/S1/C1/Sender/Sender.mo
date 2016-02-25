	within Root_cic.S1.C1.Sender;
model Sender
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_Sender_Sender_main.Complex_Sender_Sender_main Sender_main(
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
	
		// raise message event delegation port declarations for region out1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort out1_myMessage_outputDelegationPort(
			redeclare Integer integers[1],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end raise message event delegation port declarations for region out1
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
			connect(Sender_main.region_1_out1.MessageSent.activePort,
				Sender_main.region_1_out1.clock.u[1]);
			connect(Sender_main.region_1_out1.init.activePort,
				Sender_main.region_1_out1.clock.u[2]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			// end connect hybrid ports
			// trigger message event port delegations for region out1
			// end trigger message event port delegations for region out1
			// raise message event port delegations for region out1
			connect(out1_myMessage_outputDelegationPort,
				Sender_main.region_1_out1.myMessage_outputDelegationPort);
			// end raise message event port delegations for region out1
		
		// hybrid port sample value variable equations
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			// end transition actions
			// assign parameter binding variables
			when Sender_main.region_1_out1.transition_init_1_MessageSent.fire then
				Sender_main.region_1_out1.message_myMessage_lightValue := 1;
			end when;
			when Sender_main.region_1_out1.transition_MessageSent_1_init.fire then
				Sender_main.region_1_out1.message_myMessage_lightValue := 0;
			end when;
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end Sender;

