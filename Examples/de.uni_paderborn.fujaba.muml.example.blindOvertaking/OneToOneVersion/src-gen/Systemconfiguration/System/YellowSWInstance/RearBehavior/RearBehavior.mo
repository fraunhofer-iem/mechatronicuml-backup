	within Systemconfiguration.System.YellowSWInstance.RearBehavior;
model RearBehavior
	annotation (Diagram(coordinateSystem(extent = {{-12.7, -6.35}, {12.7, 6.35}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.RealOutput velocityPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real velocity;
	Real velocity_sampled;
	Modelica.Blocks.Interfaces.RealInput distancePort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real distance;
	Real distance_sampled;
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_rearBehavior_init.Complex_rearBehavior_init init(
			nIn=0,
			use_outPort=false,
			nSuspend=0,
			initialStep=true
	)
			annotation (Placement(transformation(extent={{-12.7, -6.35},{12.7, 6.35}})));
		
		
		// end step declarations
	
		// variable declarations for do events
		// end variable declarations for do events
	
	
		// transition declarations
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
		// trigger message event delegation port declarations for region rearMessagePort1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort rearMessagePort1_decline_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort rearMessagePort1_accept_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end trigger message event delegation port declarations for region rearMessagePort1
		// raise message event delegation port declarations for region rearMessagePort1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort rearMessagePort1_laneChanged_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort rearMessagePort1_request_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort rearMessagePort1_finish_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end raise message event delegation port declarations for region rearMessagePort1
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
			connect(init.region_1_rearMessagePort1.overtaking.activePort,
				init.region_1_rearMessagePort1.c1.u[1]);
			connect(init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.requested.activePort,
				init.region_1_rearMessagePort1.c1.u[2]);
			connect(init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.transition_requested_1_Wait.firePort,
				init.region_1_rearMessagePort1.c2.u[1]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			velocityPort = velocity_sampled;
			distancePort = distance_sampled;
			// end connect hybrid ports
			// trigger message event port delegations for region rearMessagePort1
			connect(init.region_1_rearMessagePort1.decline_inputDelegationPort,
				rearMessagePort1_decline_inputDelegationPort);
			connect(init.region_1_rearMessagePort1.accept_inputDelegationPort,
				rearMessagePort1_accept_inputDelegationPort);
			// end trigger message event port delegations for region rearMessagePort1
			// raise message event port delegations for region rearMessagePort1
			connect(rearMessagePort1_laneChanged_outputDelegationPort,
				init.region_1_rearMessagePort1.laneChanged_outputDelegationPort);
			connect(rearMessagePort1_request_outputDelegationPort,
				init.region_1_rearMessagePort1.request_outputDelegationPort);
			connect(rearMessagePort1_finish_outputDelegationPort,
				init.region_1_rearMessagePort1.finish_outputDelegationPort);
			// end raise message event port delegations for region rearMessagePort1
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (30) * 0.001) then
			velocity_sampled := velocity;
		end when;
	algorithm
		when sample(0, (30) * 0.001) then
			distance := distance_sampled;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state entry actions
			when init.region_1_rearMessagePort1.overtaking.active then
				init.region_1_rearMessagePort1.velocity := 12;
				init.region_1_rearMessagePort1.overtakingexexit := 0;
				
			end when;
			when init.region_1_rearMessagePort1.noOvertaking.active then
				init.region_1_rearMessagePort1.velocity := 8;
				init.region_1_rearMessagePort1.noOvertakingexexit := 0;
				
			end when;
			when init.region_1_rearMessagePort1.overtaking.region_1_rear_overtaking.exexit.active then
				init.region_1_rearMessagePort1.overtaking.region_1_rear_overtaking.overtakingexexit := init.region_1_rearMessagePort1.overtaking.region_1_rear_overtaking.overtakingexexit + 1;
				
			end when;
			when init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.exexit.active then
				init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.noOvertakingexexit := init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.noOvertakingexexit + 1;
				
			end when;
			// end state entry actions
			// do event actions
			// end do event actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			when init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.transition_requested_1_Wait.fire then
				init.region_1_rearMessagePort1.mailbox_decline_frontVelocity := init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.transition_requested_1_Wait.transition_input_port[1].reals[1];
			end when;
			when init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.transition_requested_3_exexit.fire then
			end when;
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			when init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.transition_requested_1_Wait.fire then
				init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.velocity := init.region_1_rearMessagePort1.mailbox_decline_frontVelocity;
				
			end when;
			// end transition actions
			// assign parameter binding variables
			when init.region_1_rearMessagePort1.overtaking.region_1_rear_overtaking.transition_init_1_changed.fire then
			end when;
			when init.region_1_rearMessagePort1.noOvertaking.region_1_rear_noOvertaking.transition_init_1_requested.fire then
			end when;
			when init.region_1_rearMessagePort1.transition_overtaking_1_noOvertaking.fire then
			end when;
			// end assign parameter binding variables
			// state exit actions
			// end state exit actions
end RearBehavior;

