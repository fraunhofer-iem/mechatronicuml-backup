	within Root_cic.Temp.LimitControlRobot.LimitControl;
model LimitControl
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		inner  Real limit;
		inner  Real sensorData;
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_LimitControl_init.Complex_LimitControl_init init(
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
		// trigger message event delegation port declarations for region receiver1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort receiver1_data_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end trigger message event delegation port declarations for region receiver1
	
		// raise message event delegation port declarations for region provider1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort provider1_limitViolated_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort provider1_limitRedeemed_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end raise message event delegation port declarations for region provider1
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
			connect(init.region_2_receiver1.PeriodicReceiving.activePort,
				init.region_2_receiver1.c0.u[1]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			// end connect hybrid ports
			// trigger message event port delegations for region receiver1
			connect(init.region_2_receiver1.data_inputDelegationPort,
				receiver1_data_inputDelegationPort);
			// end trigger message event port delegations for region receiver1
			// raise message event port delegations for region receiver1
			// end raise message event port delegations for region receiver1
			// trigger message event port delegations for region provider1
			// end trigger message event port delegations for region provider1
			// raise message event port delegations for region provider1
			connect(provider1_limitViolated_outputDelegationPort,
				init.region_1_provider1.limitViolated_outputDelegationPort);
			connect(provider1_limitRedeemed_outputDelegationPort,
				init.region_1_provider1.limitRedeemed_outputDelegationPort);
			// end raise message event port delegations for region provider1
		
		// hybrid port sample value variable equations
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			when init.region_2_receiver1.transition_Timeout_1_PeriodicReceiving.fire then
				init.region_2_receiver1.mailbox_data_sensorData := init.region_2_receiver1.transition_Timeout_1_PeriodicReceiving.transition_input_port[1].reals[1];
			end when;
			when init.region_2_receiver1.transition_PeriodicReceiving_2_PeriodicReceiving.fire then
				init.region_2_receiver1.mailbox_data_sensorData := init.region_2_receiver1.transition_PeriodicReceiving_2_PeriodicReceiving.transition_input_port[1].reals[1];
			end when;
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			when pre(init.region_2_receiver1.transition_Timeout_1_PeriodicReceiving.fire) then
				sensorData := init.region_2_receiver1.mailbox_data_sensorData;
				
			end when;
			when pre(init.region_2_receiver1.transition_PeriodicReceiving_2_PeriodicReceiving.fire) then
				sensorData := init.region_2_receiver1.mailbox_data_sensorData;
				
			end when;
			// end transition actions
			// assign parameter binding variables
			when init.region_1_provider1.transition_LimitRedeemed_1_LimitViolated.fire then
			end when;
			when init.region_1_provider1.transition_LimitViolated_1_LimitRedeemed.fire then
			end when;
			when init.region_1_provider1.transition_MeasuringLimit_2_LimitRedeemed.fire then
			end when;
			when init.region_1_provider1.transition_MeasuringLimit_1_LimitViolated.fire then
			end when;
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end LimitControl;

