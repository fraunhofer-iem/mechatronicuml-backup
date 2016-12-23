	within Systemconfiguration.System.YellowSWInstance;
model YellowSWInstance
		// port declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort rearMessagePort1_decline_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation(Placement(transformation(extent={{70,20},{100,40}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort rearMessagePort1_accept_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{70,40},{100,60}})));
		
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort rearMessagePort1_request_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{70,100},{100,120}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort rearMessagePort1_finish_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{70,60},{100,80}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort rearMessagePort1_laneChanged_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{70,80},{100,100}})));
		
		Modelica.Blocks.Interfaces.RealOutput velocityPort
			annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
		Modelica.Blocks.Interfaces.RealInput distancePort
			annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
		// end port declarations
		// the behavior of the atomic component
		RearBehavior.RearBehavior behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports 
				connect(behavior.rearMessagePort1_decline_inputDelegationPort,
					rearMessagePort1_decline_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.rearMessagePort1_accept_inputDelegationPort,
					rearMessagePort1_accept_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.rearMessagePort1_request_outputDelegationPort,
					rearMessagePort1_request_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.rearMessagePort1_finish_outputDelegationPort,
					rearMessagePort1_finish_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.rearMessagePort1_laneChanged_outputDelegationPort,
					rearMessagePort1_laneChanged_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// connect discrete component ports with the corresponding rtsc ports
				// connect hybrid component ports with the corresponding rtsc ports
				connect(velocityPort,
					behavior.velocityPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(distancePort,
					behavior.distancePort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// end connect hybrid component ports with the corresponding rtsc ports
end YellowSWInstance;
