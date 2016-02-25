	within Root_cic.S1;
model S1
		// part declarations
		C1.C1 c1
		annotation (Placement(transformation(extent={{3.1750000000000007, 19.050000000000004},{28.575000000000006, 31.750000000000007}})));
		C2.C2 c2
		annotation (Placement(transformation(extent={{-28.574999999999992, -6.349999999999994},{28.575000000000006, 6.350000000000001}})));
		Led.Led led
		annotation (Placement(transformation(extent={{-28.574999999999992, -31.749999999999993},{-3.1749999999999936, -19.049999999999997}})));
		//Start of user code CONTINUOUS_Part_Declarations
	
	
	
	   //End of user code
		// end part declarations
		// port declarations
		// end port declarations
	equation
			// connect assemblies
			connect(c1.out1_myMessage_outputDelegationPort,
				c2.in1_myMessage_inputDelegationPort)
				annotation (Line(points={ {15.875000000000004,18.944166666666668}, {15.875000000000004,15.116527777777776}, {15.875000000000004,10.202333333333335}, {15.875000000000004,6.38527777777778}}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(c2.LEDPort,
				led.LEDPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			//generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
		//end user defined areaEnd of user code
			// end connect assemblies
			// connect delegations
			// end connect delegations
	annotation (Icon(coordinateSystem(extent = {{invalid, invalid},{invalid, invalid}})));
	annotation (Diagram(coordinateSystem(extent = {{-31.397222222222215, -34.572222222222216}, {31.397222222222215, 34.572222222222216}})));
end S1;
