	within Root_cic.Tank;
model Tank
	//ComponentKind::CONTINUOUS_COMPONENT 
	//Start of user code CONTINUOUS_Declarations
	


   //End of user code
		// port declarations
		Modelica.Blocks.Interfaces.RealInput outFlowPort
			annotation (Placement(transformation(extent={{, },{, }})));
		Modelica.Blocks.Interfaces.RealOutput fluidSensorPort
			annotation (Placement(transformation(extent={{, },{, }})));
		// end port declarations
	//Start of user code CONTINUOUS_Behavior
	
 
   //End of user code
	/* TODO Uncomment if initialization is required
	equation
		// initial continuous output port equations
	*/	
	// end initial continuous output port equations
	annotation (Icon(coordinateSystem(extent = {{, },{, }})));
end Tank;
