	within Root_cic.Bc.BottlingControl;
model BottlingControl
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.RealInput fluidSensorPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real fluidSensor;
	Real fluidSensor_sampled;
	Modelica.Blocks.Interfaces.RealOutput outFlowTankPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real outFlowTank;
	Real outFlowTank_sampled;
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_BottlingControl_init.Complex_BottlingControl_init init(
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
		// trigger message event delegation port declarations for region slave1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort slave1_order_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort slave1_continue_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end trigger message event delegation port declarations for region slave1
		// raise message event delegation port declarations for region slave1
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort slave1_fail_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort slave1_done_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,0},{18,18}})));
		// end raise message event delegation port declarations for region slave1
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
			connect(init.region_1_slave1.Working.activePort,
				init.region_1_slave1.c0.u[1]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			fluidSensorPort = fluidSensor_sampled;
			outFlowTankPort = outFlowTank_sampled;
			// end connect hybrid ports
			// trigger message event port delegations for region slave1
			connect(init.region_1_slave1.order_inputDelegationPort,
				slave1_order_inputDelegationPort);
			connect(init.region_1_slave1.continue_inputDelegationPort,
				slave1_continue_inputDelegationPort);
			// end trigger message event port delegations for region slave1
			// raise message event port delegations for region slave1
			connect(slave1_fail_outputDelegationPort,
				init.region_1_slave1.fail_outputDelegationPort);
			connect(slave1_done_outputDelegationPort,
				init.region_1_slave1.done_outputDelegationPort);
			// end raise message event port delegations for region slave1
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (100) * 0.0010) then
			fluidSensor := fluidSensor_sampled;
		end when;
	algorithm
		when sample(0, (100) * 0.0010) then
			outFlowTank_sampled := outFlowTank;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			when init.region_1_slave1.transition_FailSafe_2_FailSafe.fire then
			end when;
			when init.region_1_slave1.transition_Idle_1_Working.fire then
			end when;
			when init.region_1_slave1.transition_FailSafe_1_Idle.fire then
			end when;
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			// end transition actions
			// assign parameter binding variables
			when init.region_1_slave1.transition_Working_1_FailSafe.fire then
			end when;
			when init.region_1_slave1.transition_FailSafe_2_FailSafe.fire then
			end when;
			when init.region_1_slave1.transition_Working_2_Idle.fire then
			end when;
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end BottlingControl;

