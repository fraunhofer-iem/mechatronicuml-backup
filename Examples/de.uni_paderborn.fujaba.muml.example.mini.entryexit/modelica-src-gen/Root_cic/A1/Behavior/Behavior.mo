	within Root_cic.A1.Behavior;
model Behavior
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		inner  Integer i;
		// end attribute declarations
		// hybrid port declarations
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		Complex_Behavior_init.Complex_Behavior_init init(
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
			when not init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.someState.active and pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.someState.active) then
				i := 5;
				
			end when;
			when not init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.generatedInitState.active and pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.generatedInitState.active) then
				init.region_1_Region1.Composite.region_1_innerRegion.inner1ExitVar := init.region_1_Region1.Composite.region_1_innerRegion.inner1ExitVar + 1;
				
			end when;
			when not init.region_1_Region1.Composite.region_1_innerRegion.inner1.active and pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.active) then
				i := 6;
				init.region_1_Region1.Composite.region_1_innerRegion.inner1E1 := false;
				
			end when;
			when not init.region_1_Region1.Composite.region_1_innerRegion.generatedInitState.active and pre(init.region_1_Region1.Composite.region_1_innerRegion.generatedInitState.active) then
				init.region_1_Region1.CompositeExitVar := init.region_1_Region1.CompositeExitVar + 1;
				
			end when;
			when not init.region_1_Region1.Start.active and pre(init.region_1_Region1.Start.active) then
				i := 1;
				
			end when;
			when not init.region_1_Region1.Composite.active and pre(init.region_1_Region1.Composite.active) then
				i := 7;
				init.region_1_Region1.CompositeE1 := false;
				
			end when;
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			when pre(init.region_1_Region1.Composite.region_1_innerRegion.transition_generatedInitState_2_inner1.fire) then
				init.region_1_Region1.Composite.region_1_innerRegion.inner1E1 := true;
				
			end when;
			when pre(init.region_1_Region1.transition_Start_1_Composite.fire) then
				init.region_1_Region1.CompositeE1 := true;
				
			end when;
			// end transition actions
			// assign parameter binding variables
			// end assign parameter binding variables
			// state entry actions
			when not pre(init.region_1_Region1.Composite.active) and init.region_1_Region1.Composite.active then
				i := 2;
				init.region_1_Region1.CompositeE2 := 0;
				
			end when;
			when not pre(init.region_1_Region1.End.active) and init.region_1_Region1.End.active then
				i := 8;
				
			end when;
			when not pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.active) and init.region_1_Region1.Composite.region_1_innerRegion.inner1.active then
				i := 3;
				init.region_1_Region1.Composite.region_1_innerRegion.inner1E2 := 0;
				
			end when;
			when not pre(init.region_1_Region1.Composite.region_1_innerRegion.E2.active) and init.region_1_Region1.Composite.region_1_innerRegion.E2.active then
				init.region_1_Region1.CompositeE2 := init.region_1_Region1.CompositeE2 + 1;
				
			end when;
			when not pre(init.region_1_Region1.Composite.region_1_innerRegion.generatedInitState.active) and init.region_1_Region1.Composite.region_1_innerRegion.generatedInitState.active then
				init.region_1_Region1.CompositeExitVar := 0;
				
			end when;
			when not pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.someState.active) and init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.someState.active then
				i := 4;
				
			end when;
			when not pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.E2.active) and init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.E2.active then
				init.region_1_Region1.Composite.region_1_innerRegion.inner1E2 := init.region_1_Region1.Composite.region_1_innerRegion.inner1E2 + 1;
				
			end when;
			when not pre(init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.generatedInitState.active) and init.region_1_Region1.Composite.region_1_innerRegion.inner1.region_1_composite2.generatedInitState.active then
				init.region_1_Region1.Composite.region_1_innerRegion.inner1ExitVar := 0;
				
			end when;
			// end state entry actions
			// do event actions
			// end do event actions
end Behavior;

