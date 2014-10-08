	within Systemconfiguration.System.RedSWInstance.FrontStateMachine.Complex_frontStateMachine_init.FrontMessagePort1.Complex_frontMessagePort1_noAcceleration.Front_noAcceleration;
model Front_noAcceleration extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-12.7, -31.75}, {12.7, 31.75}})));
		// attribute declarations
		outer Boolean noOvertakingenentry;
		outer Integer noOvertakingexexit;
		outer Integer noOvertakingExitVar;
		outer Real localVelocity;
		// end attribute declarations
		// hybrid port declarations
	
	outer Real velocity;
	
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step brakingAllowed(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{-12.7, -31.75},{12.7, -19.049999999999997}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step noBraking(
			nIn=1,
			nOut=1)
			annotation (Placement(transformation(extent={{-12.7, 19.049999999999997},{12.7, 31.75}})));
	
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_noBraking_1_brakingAllowed(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{-12.7, -6.35},{12.7, 6.35}})));
		// end transition declarations
	
		// clock declarations
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
	equation
			// connect initial step
			connect(entry[1], noBraking.inPort[1])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect noBraking -> brakingAllowed
			connect(noBraking.outPort[1],
					transition_noBraking_1_brakingAllowed.inPort)
				annotation (Line(points={ {0.0,19.049999999999997}, {0.0,19.049999999999997}, {0.0,6.35}, {0.0,6.35}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_noBraking_1_brakingAllowed.outPort,
					brakingAllowed.inPort[1])
				annotation (Line(points={ {0.0,-6.35}, {0.0,-6.35}, {0.0,-19.049999999999997}, {0.0,-19.049999999999997}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			// end connect state invariants
end Front_noAcceleration;

