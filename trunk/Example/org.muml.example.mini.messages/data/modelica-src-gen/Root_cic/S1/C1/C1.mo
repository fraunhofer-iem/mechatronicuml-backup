	within Root_cic.S1.C1;
model C1
		// port declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort out1_myMessage_outputDelegationPort(
			redeclare Integer integers[1],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{-12.699999999999998, -6.350000000000001},{12.700000000000003, 6.349999999999998}})));
		
		// end port declarations
		// the behavior of the atomic component
		Sender.Sender behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
				connect(behavior.out1_myMessage_outputDelegationPort,
					out1_myMessage_outputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
				// connect hybrid component ports with the corresponding rtsc ports
				// end connect hybrid component ports with the corresponding rtsc ports
	annotation (Icon(coordinateSystem(extent = {{-12.700000000000003, -6.350000000000001},{12.700000000000003, 6.350000000000001}})));
end C1;
