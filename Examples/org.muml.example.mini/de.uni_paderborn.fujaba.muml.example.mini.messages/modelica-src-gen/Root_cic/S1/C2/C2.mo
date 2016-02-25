	within Root_cic.S1.C2;
model C2
		// port declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort in1_myMessage_inputDelegationPort(
			redeclare Integer integers[1],
			redeclare Boolean booleans[0],
			redeclare Real reals[0])
			annotation (Placement(transformation(extent={{3.174999999999997, -6.349999999999998},{28.574999999999992, 6.350000000000001}})));
		
		Modelica.Blocks.Interfaces.IntegerOutput LEDPort
			annotation (Placement(transformation(extent={{-28.575, -6.349999999999998},{-3.1750000000000007, 6.350000000000001}})));
		// end port declarations
		// the behavior of the atomic component
		Receiver.Receiver behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
				connect(behavior.in1_myMessage_inputDelegationPort,
					in1_myMessage_inputDelegationPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
				// connect hybrid component ports with the corresponding rtsc ports
				connect(LEDPort,
					behavior.LEDPort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// end connect hybrid component ports with the corresponding rtsc ports
	annotation (Icon(coordinateSystem(extent = {{-28.575, -6.349999999999998},{28.575, 6.349999999999998}})));
end C2;
