	within Systemconfiguration.System.RedSWInstance;
model RedSWInstance
		// port declarations
		Modelica.Blocks.Interfaces.RealOutput velocityPort
			annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort frontMessagePort1_request_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,100},{30,120}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort frontMessagePort1_finish_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,60},{30,80}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort frontMessagePort1_laneChanged_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,80},{30,100}})));
		
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort frontMessagePort1_decline_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation(Placement(transformation(extent={{0,20},{30,40}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort frontMessagePort1_accept_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation(Placement(transformation(extent={{0,40},{30,60}})));
		
		// end port declarations
		// the behavior of the atomic component
		FrontStateMachine.FrontStateMachine behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports 
				connect(behavior.frontMessagePort1_request_inputDelegationPort,
					frontMessagePort1_request_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.frontMessagePort1_finish_inputDelegationPort,
					frontMessagePort1_finish_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.frontMessagePort1_laneChanged_inputDelegationPort,
					frontMessagePort1_laneChanged_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.frontMessagePort1_decline_outputDelegationPort,
					frontMessagePort1_decline_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.frontMessagePort1_accept_outputDelegationPort,
					frontMessagePort1_accept_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// connect discrete component ports with the corresponding rtsc ports
				// connect hybrid component ports with the corresponding rtsc ports
				connect(velocityPort,
					behavior.velocityPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// end connect hybrid component ports with the corresponding rtsc ports
end RedSWInstance;
