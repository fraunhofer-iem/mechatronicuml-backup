	within Root_cic.Bc;
model Bc
		// port declarations
		Modelica.Blocks.Interfaces.RealInput fluidSensorPort
			annotation (Placement(transformation(extent={{, },{, }})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort slave1_order_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{, },{, }})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort slave1_continue_inputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{, },{, }})));
		
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort slave1_done_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{, },{, }})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort slave1_fail_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{, },{, }})));
		
		Modelica.Blocks.Interfaces.RealOutput outFlowTankPort
			annotation (Placement(transformation(extent={{, },{, }})));
		// end port declarations
		// the behavior of the atomic component
		BottlingControl.BottlingControl behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports 
				connect(behavior.slave1_order_inputDelegationPort,
					slave1_order_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.slave1_continue_inputDelegationPort,
					slave1_continue_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.slave1_done_outputDelegationPort,
					slave1_done_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.slave1_fail_outputDelegationPort,
					slave1_fail_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// connect discrete component ports with the corresponding rtsc ports
				// connect hybrid component ports with the corresponding rtsc ports
				connect(fluidSensorPort,
					behavior.fluidSensorPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(outFlowTankPort,
					behavior.outFlowTankPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// end connect hybrid component ports with the corresponding rtsc ports
	annotation (Icon(coordinateSystem(extent = {{, },{, }})));
end Bc;
