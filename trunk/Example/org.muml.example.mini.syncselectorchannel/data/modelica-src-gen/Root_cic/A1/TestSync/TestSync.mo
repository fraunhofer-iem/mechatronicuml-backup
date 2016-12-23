	within Root_cic.A1.TestSync;
model TestSync
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		inner  Integer var2(start=2);
		inner  Integer var1(start=2);
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_testSync_init.Complex_testSync_init init(
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
			// end connect clock resets
			// connect synchronization channels
			connect(init.region_1_Region_1.transition_S1_1_Sent.sender[1],
				init.region_2_Region_2.transition_S2_1_Received.receiver[1]);
			// end connect synchronization channels
			// connect hybrid ports
			// end connect hybrid ports
		
		// hybrid port sample value variable equations
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			when pre(init.region_2_Region_2.transition_S2_1_Received.fire) then
				var2 := 1;
				
			end when;
			when pre(init.region_1_Region_1.transition_S1_1_Sent.fire) then
				var1 := 2;
				
			end when;
			// end transition actions
			// assign parameter binding variables
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end TestSync;

