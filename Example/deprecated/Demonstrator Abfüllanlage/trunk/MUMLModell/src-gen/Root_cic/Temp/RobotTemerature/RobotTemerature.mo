	within Root_cic.Temp.RobotTemerature;
model RobotTemerature
		// port declarations
		Modelica.Blocks.Interfaces.RealInput sensorDataPort
			annotation (Placement(transformation(extent={{, },{, }})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort sender1_data_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{, },{, }})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort sender1_data_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation (Placement(transformation(extent={{, },{, }})));
		
		// end port declarations
		// the behavior of the atomic component
		DataProcessing.DataProcessing behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports 
				connect(behavior.sender1_data_outputDelegationPort,
					sender1_data_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				connect(behavior.sender1_data_outputDelegationPort,
					sender1_data_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// connect discrete component ports with the corresponding rtsc ports
				// connect hybrid component ports with the corresponding rtsc ports
				connect(sensorDataPort,
					behavior.sensorDataPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// end connect hybrid component ports with the corresponding rtsc ports
	annotation (Icon(coordinateSystem(extent = {{, },{, }})));
end RobotTemerature;
