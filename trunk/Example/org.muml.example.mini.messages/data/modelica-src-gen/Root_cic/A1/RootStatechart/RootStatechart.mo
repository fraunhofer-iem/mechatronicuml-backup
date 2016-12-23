	within Root_cic.A1.RootStatechart;
model RootStatechart
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		inner  Integer myVariable(start=21);
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_rootStatechart_init.Complex_rootStatechart_init init(
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
			when pre(init.region_1_Region1.transition_State_B_1_State_B.fire) then
				rootStatechart_operations.decreaseInt(myVariable)
				
			end when;
			// end transition actions
			// assign parameter binding variables
			// end assign parameter binding variables
			// state entry actions
			when not pre(init.region_1_Region1.State_A.active) and init.region_1_Region1.State_A.active then
				rootStatechart_operations.increaseInt(myVariable)
				
			end when;
			// end state entry actions
			// do event actions
			// end do event actions
end RootStatechart;

