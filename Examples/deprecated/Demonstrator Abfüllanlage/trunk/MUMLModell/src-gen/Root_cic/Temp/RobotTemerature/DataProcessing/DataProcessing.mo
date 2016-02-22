	within Root_cic.Temp.RobotTemerature.DataProcessing;
model DataProcessing
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.RealInput sensorDataPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real sensorData;
	Real sensorData_sampled;
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_DataProcessing_init.Complex_DataProcessing_init init(
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
	
		// raise message event delegation port declarations for region sender1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort sender1_data_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end raise message event delegation port declarations for region sender1
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
			connect(init.region_1_sender1.PeriodicSending.activePort,
				init.region_1_sender1.c0.u[1]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			sensorDataPort = sensorData_sampled;
			// end connect hybrid ports
			// trigger message event port delegations for region sender1
			// end trigger message event port delegations for region sender1
			// raise message event port delegations for region sender1
			connect(sender1_data_outputDelegationPort,
				init.region_1_sender1.data_outputDelegationPort);
			// end raise message event port delegations for region sender1
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (100) * 0.0010) then
			sensorData := sensorData_sampled;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			// end transition actions
			// assign parameter binding variables
			when init.region_1_sender1.transition_PeriodicSending_1_PeriodicSending.fire then
				init.region_1_sender1.message_data_sensorData := sensorData;
			end when;
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end DataProcessing;

