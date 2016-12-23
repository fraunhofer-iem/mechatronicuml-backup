	within Root_cic.Sys.C1.RootRTSC;
model RootRTSC
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.IntegerOutput LED_voltagePort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Integer LED_voltage;
	Integer LED_voltage_sampled;
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_rootRTSC_init.Complex_rootRTSC_init init(
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
			connect(init.region_1_Main.LED_on.activePort,
				init.region_1_Main.changingClock.u[1]);
			connect(init.region_1_Main.LED_off.activePort,
				init.region_1_Main.changingClock.u[2]);
			// end connect clock resets
			// connect synchronization channels
			// end connect synchronization channels
			// connect hybrid ports
			LED_voltagePort = LED_voltage_sampled;
			// end connect hybrid ports
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (50) * 0.001) then
			LED_voltage_sampled := LED_voltage;
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
			// end assign parameter binding variables
			// state entry actions
			when not pre(init.region_1_Main.LED_off.active) and init.region_1_Main.LED_off.active then
				LED_voltage := 0;
				
			end when;
			when not pre(init.region_1_Main.LED_on.active) and init.region_1_Main.LED_on.active then
				LED_voltage := 1;
				
			end when;
			// end state entry actions
			// do event actions
			// end do event actions
end RootRTSC;

