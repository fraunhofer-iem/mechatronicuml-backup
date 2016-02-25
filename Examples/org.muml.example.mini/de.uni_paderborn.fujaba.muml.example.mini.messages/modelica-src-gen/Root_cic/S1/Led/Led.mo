	within Root_cic.S1.Led;
model Led
	//ComponentKind::CONTINUOUS_COMPONENT 
	//Start of user code CONTINUOUS_Declarations
	


   //End of user code
		// port declarations
		Modelica.Blocks.Interfaces.IntegerInput LEDPort
			annotation (Placement(transformation(extent={{-12.7, -6.35},{12.7, 6.35}})));
		// end port declarations
	//Start of user code CONTINUOUS_Behavior
	
 
   //End of user code
	/* TODO Uncomment if initialization is required
	equation
		// initial continuous output port equations
	*/	
	// end initial continuous output port equations
	annotation (Icon(coordinateSystem(extent = {{-12.7, -6.35},{12.7, 6.35}})));
end Led;
