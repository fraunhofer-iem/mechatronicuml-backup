	within Root_cic.Temp.LimitControlRobot.LimitControl.Complex_LimitControl_init;
model Complex_LimitControl_init extends Modelica_StateGraph2.PartialParallel(nEntry=2);
	// no annotations will be generated for complex states
	// region declarations
	Provider1.Provider1 region_1_provider1(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	Receiver1.Receiver1 region_2_receiver1(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	// end region declarations
	// entry point input declarations
	// end entry point input declarations
	equation
		// connect to the initial states of the region statecharts
		connect(entry[2],
				region_1_provider1.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		connect(entry[1],
				region_2_receiver1.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		// end connect to the initial states of the region statecharts
		// connect entry point ports with the corresponding entry point ports of the regions
		// end connect entry point ports with the corresponding entry point ports of the regions
end Complex_LimitControl_init;
