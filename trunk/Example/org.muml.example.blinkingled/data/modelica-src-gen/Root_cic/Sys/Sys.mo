	within Root_cic.Sys;
model Sys
		// part declarations
		C1.C1 c1
		annotation (Placement(transformation(extent={{-12.7, -19.049999999999997},{12.700000000000001, -6.35}})));
		C2.C2 c2
		annotation (Placement(transformation(extent={{-12.7, 6.350000000000001},{12.700000000000001, 19.049999999999997}})));
		//Start of user code CONTINUOUS_Part_Declarations
	
	
	
	   //End of user code
		// end part declarations
		// port declarations
		// end port declarations
	equation
			// connect assemblies
			connect(c2.voltagePort,
				c1.LED_voltagePort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			//generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
		//end user defined areaEnd of user code
			// end connect assemblies
			// connect delegations
			// end connect delegations
	annotation (Icon(coordinateSystem(extent = {{invalid, invalid},{invalid, invalid}})));
	annotation (Diagram(coordinateSystem(extent = {{-15.52222222222222, -21.87222222222222}, {15.52222222222222, 21.87222222222222}})));
end Sys;
