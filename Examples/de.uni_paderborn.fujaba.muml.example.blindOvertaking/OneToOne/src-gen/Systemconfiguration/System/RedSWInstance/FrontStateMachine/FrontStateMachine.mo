	within Systemconfiguration.System.RedSWInstance.FrontStateMachine;
model FrontStateMachine
	annotation (Diagram(coordinateSystem(extent = {{-12.7, -6.35}, {12.7, 6.35}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.RealOutput velocityPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real velocity;
	Real velocity_sampled(start=0);
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_frontStateMachine_init.Complex_frontStateMachine_init init(
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
		// trigger message event delegation port declarations for region frontMessagePort1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort frontMessagePort1_finish_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort frontMessagePort1_request_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort frontMessagePort1_laneChanged_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end trigger message event delegation port declarations for region frontMessagePort1
		// raise message event delegation port declarations for region frontMessagePort1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort frontMessagePort1_accept_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort frontMessagePort1_decline_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end raise message event delegation port declarations for region frontMessagePort1
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
			connect(init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.received.activePort,
				init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.c2.u[1]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			velocityPort = velocity_sampled;
			// end connect hybrid ports
			// trigger message event port delegations for region frontMessagePort1
			connect(init.region_1_frontMessagePort1.finish_inputDelegationPort,
				frontMessagePort1_finish_inputDelegationPort);
			connect(init.region_1_frontMessagePort1.request_inputDelegationPort,
				frontMessagePort1_request_inputDelegationPort);
			connect(init.region_1_frontMessagePort1.laneChanged_inputDelegationPort,
				frontMessagePort1_laneChanged_inputDelegationPort);
			// end trigger message event port delegations for region frontMessagePort1
			// raise message event port delegations for region frontMessagePort1
			connect(frontMessagePort1_accept_outputDelegationPort,
				init.region_1_frontMessagePort1.accept_outputDelegationPort);
			connect(frontMessagePort1_decline_outputDelegationPort,
				init.region_1_frontMessagePort1.decline_outputDelegationPort);
			// end raise message event port delegations for region frontMessagePort1
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (30) * 0.001) then
			velocity_sampled := velocity;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state entry actions
			when init.region_1_frontMessagePort1.noOvertaking.active then
				init.region_1_frontMessagePort1.localVelocity := 2;
				init.region_1_frontMessagePort1.velocity := init.region_1_frontMessagePort1.localVelocity;
				init.region_1_frontMessagePort1.noOvertakingexexit := 0;
				
			end when;
			when init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.exexit.active then
				init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.noOvertakingexexit := init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.noOvertakingexexit + 1;
				
			end when;
			when init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.generatedInitState.active then
				init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.noOvertakingExitVar := 0;
				
			end when;
			// end state entry actions
			// do event actions
			// end do event actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			when init.region_1_frontMessagePort1.transition_noAcceleration_1_noOvertaking.fire then
			end when;
			when init.region_1_frontMessagePort1.transition_noAcceleration_2_noOvertaking.fire then
			end when;
			when init.region_1_frontMessagePort1.noAcceleration.region_1_front_noAcceleration.transition_noBraking_1_brakingAllowed.fire then
			end when;
			when init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.transition_init_1_received.fire then
			end when;
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			when init.region_1_frontMessagePort1.transition_noAcceleration_2_noOvertaking.fire then
				init.region_1_frontMessagePort1.noOvertakingenentry := true;
				
			end when;
			// end transition actions
			// assign parameter binding variables
			when init.region_1_frontMessagePort1.transition_noOvertaking_1_noAcceleration.fire then
			end when;
			when init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.transition_received_1_init.fire then
				init.region_1_frontMessagePort1.message_decline_frontVelocity := init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.localVelocity;
			end when;
			// end assign parameter binding variables
			// state exit actions
			when not init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.generatedInitState.active and pre(init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.generatedInitState.active) then
				init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.noOvertakingExitVar := init.region_1_frontMessagePort1.noOvertaking.region_1_front_noOvertaking.noOvertakingExitVar + 1;
				
			end when;
			when not init.region_1_frontMessagePort1.noOvertaking.active and pre(init.region_1_frontMessagePort1.noOvertaking.active) then
				init.region_1_frontMessagePort1.noOvertakingenentry := false;
				
			end when;
			// end state exit actions
end FrontStateMachine;

