	within Root_cic.Sys.C1;
model C1
		// port declarations
		Modelica.Blocks.Interfaces.IntegerOutput LED_voltagePort
			annotation (Placement(transformation(extent={{-12.7, -6.35},{12.7, 6.35}})));
		// end port declarations
		// the behavior of the atomic component
		RootRTSC.RootRTSC behavior
			annotation(Placement(transformation(extent={{0,0},{40,30}})));
		equation
				// connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
				// connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
				// connect hybrid component ports with the corresponding rtsc ports
				connect(LED_voltagePort,
					behavior.LED_voltagePort)
					annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
				// end connect hybrid component ports with the corresponding rtsc ports
	annotation (Icon(coordinateSystem(extent = {{-12.7, -6.35},{12.7, 6.35}})));
end C1;
