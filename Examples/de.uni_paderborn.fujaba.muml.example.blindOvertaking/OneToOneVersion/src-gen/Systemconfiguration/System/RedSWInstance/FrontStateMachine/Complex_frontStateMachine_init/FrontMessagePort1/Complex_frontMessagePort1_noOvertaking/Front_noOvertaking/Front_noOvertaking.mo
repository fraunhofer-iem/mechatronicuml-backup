	within Systemconfiguration.System.RedSWInstance.FrontStateMachine.Complex_frontStateMachine_init.FrontMessagePort1.Complex_frontMessagePort1_noOvertaking.Front_noOvertaking;
model Front_noOvertaking extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	annotation (Diagram(coordinateSystem(extent = {{-38.62959, -70.02653}, {38.62959, 70.02653}})));
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
		RealTimeCoordinationLibrary.RealTimeCoordination.Step exexit(
			nIn=1,
			nOut=0)
			annotation (Placement(transformation(extent={{-35.454589999999996, -44.27346999999999},{-10.054590000000001, -31.573469999999993}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step generatedInitState(
			nIn=1,
			nOut=2)
			annotation (Placement(transformation(extent={{-5.820409999999999, 57.32652999999999},{19.57959, 70.02653}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step init(
			nIn=2,
			nOut=1)
			annotation (Placement(transformation(extent={{-3.7045900000000005, -44.27346999999999},{21.69541, -31.573469999999993}})));
	
	
		RealTimeCoordinationLibrary.RealTimeCoordination.Step received(
			nIn=2,
			use_activePort=true,
			nOut=2)
			annotation (Placement(transformation(extent={{-29.810202000000004, 6.5265300000000055},{-4.410201999999998, 19.226530000000004}})));
	
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual receivedInvariantc2(bound=(3) * 1.0);
	
		// end step declarations
		// exit point declarations
		// end exit point declarations
	
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_generatedInitState_1_init(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{13.22959, 6.5265300000000055},{38.62959, 19.226530000000004}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_init_1_received(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_messageReceive=true,
				numberOfMessageReceive=1,
				numberOfMessageIntegers=0,
				numberOfMessageReals=0,
				numberOfMessageBooleans=0
			)
			annotation (Placement(transformation(extent={{-30.868365999999998, -69.67372399999999},{-5.468366, -56.97372399999999}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_received_2_exexit(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false
			)
			annotation (Placement(transformation(extent={{-35.454589999999996, -18.873469999999994},{-10.054590000000001, -6.173469999999994}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_received_1_init(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{-3.7045900000000005, -18.873469999999994},{21.69541, -6.173469999999994}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.Transition transition_generatedInitState_2_received(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				condition = pre(noOvertakingenentry) == true
				
			)
			annotation (Placement(transformation(extent={{-19.57959, 31.926529999999993},{5.820409999999999, 44.626529999999995}})));
		// end transition declarations
	
		// clock declarations
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c2(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		// end clock constraint declarations
	equation
			// connect initial step
			connect(entry[1], generatedInitState.inPort[1])
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			// end connect initial step
			// connect transition
			// connect generatedInitState -> received
			connect(generatedInitState.outPort[1],
					transition_generatedInitState_2_received.inPort)
				annotation (Line(points={ {6.87959,57.32652999999999}, {6.87959,57.32652999999999}, {-6.87959,44.626529999999995}, {-6.87959,44.626529999999995}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_generatedInitState_2_received.outPort,
					received.inPort[2])
				annotation (Line(points={ {-6.87959,31.926529999999993}, {-6.87959,31.926529999999993}, {-17.110202,19.226530000000004}, {-17.110202,19.226530000000004}}, color={0,0,0}, smooth=Smooth.None));
			// connect generatedInitState -> init
			connect(generatedInitState.outPort[2],
					transition_generatedInitState_1_init.inPort)
				annotation (Line(points={ {6.87959,57.32652999999999}, {6.87959,57.32652999999999}, {25.92959,19.226530000000004}, {25.92959,19.226530000000004}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_generatedInitState_1_init.outPort,
					init.inPort[2])
				annotation (Line(points={ {25.92959,6.5265300000000055}, {25.92959,6.5265300000000055}, {24.870409999999996,-18.873469999999994}, {24.870409999999996,-18.873469999999994}, {24.870409999999996,-18.873469999999994}, {8.995409999999998,-31.573469999999993}, {8.995409999999998,-31.573469999999993}}, color={0,0,0}, smooth=Smooth.None));
			// connect init -> received
			connect(init.outPort[1],
					transition_init_1_received.inPort)
				annotation (Line(points={ {8.995409999999998,-44.27346999999999}, {8.995409999999998,-44.27346999999999}, {-18.168366,-56.97372399999999}, {-18.168366,-56.97372399999999}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_init_1_received.outPort,
					received.inPort[1])
				annotation (Line(points={ {-18.168366,-70.02653}, {-18.168366,-70.02653}, {-5.467349999999998,-69.67374939999999}, {-5.467349999999998,-69.67374939999999}, {-5.467349999999998,-69.67374939999999}, {-5.467349999999998,-56.97372399999999}, {-5.467349999999998,-56.97372399999999}, {-5.467349999999998,-56.97372399999999}, {-38.62959,-44.27346999999999}, {-38.62959,-44.27346999999999}, {-38.62959,-44.27346999999999}, {-38.62959,-6.173469999999994}, {-38.62959,-6.173469999999994}, {-38.62959,-6.173469999999994}, {-4.410710000000002,6.5265300000000055}, {-4.410710000000002,6.5265300000000055}, {-4.410710000000002,6.5265300000000055}, {-4.410710000000002,19.226530000000004}, {-4.410710000000002,19.226530000000004}, {-4.410710000000002,19.226530000000004}, {-17.110202,19.579590000000007}, {-17.110202,19.579590000000007}}, color={0,0,0}, smooth=Smooth.None));
			// connect received -> exexit
			connect(received.outPort[1],
					transition_received_2_exexit.inPort)
				annotation (Line(points={ {-17.110202,6.5265300000000055}, {-17.110202,6.5265300000000055}, {-22.75459,-6.173469999999994}, {-22.75459,-6.173469999999994}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_received_2_exexit.outPort,
					exexit.inPort[1])
				annotation (Line(points={ {-22.75459,-18.873469999999994}, {-22.75459,-18.873469999999994}, {-22.75459,-31.573469999999993}, {-22.75459,-31.573469999999993}}, color={0,0,0}, smooth=Smooth.None));
			// connect received -> init
			connect(received.outPort[2],
					transition_received_1_init.inPort)
				annotation (Line(points={ {-17.110202,6.5265300000000055}, {-17.110202,6.5265300000000055}, {8.995409999999998,-6.173469999999994}, {8.995409999999998,-6.173469999999994}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_received_1_init.outPort,
					init.inPort[1])
				annotation (Line(points={ {8.995409999999998,-18.873469999999994}, {8.995409999999998,-18.873469999999994}, {8.995409999999998,-31.573469999999993}, {8.995409999999998,-31.573469999999993}}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			// end connect clock constraints
			// connect state invariants
			connect(received.activePort,
				receivedInvariantc2.conditionPort);
			connect(c2.y,
				receivedInvariantc2.clockValue);
			// end connect state invariants
end Front_noOvertaking;

