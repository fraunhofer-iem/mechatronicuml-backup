	within Root_cic.A1.TestSync.Complex_testSync_init;
model Complex_testSync_init extends Modelica_StateGraph2.PartialParallel(nEntry=2);
	// no annotations will be generated for complex states
	// region declarations
	Region_2.Region_2 region_2_Region_2(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	Region_1.Region_1 region_1_Region_1(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	// end region declarations
	// entry point input declarations
	// end entry point input declarations
	equation
		// connect to the initial states of the region statecharts
		connect(entry[2],
				region_1_Region_1.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		connect(entry[1],
				region_2_Region_2.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		// end connect to the initial states of the region statecharts
		// connect entry point ports with the corresponding entry point ports of the regions
		// end connect entry point ports with the corresponding entry point ports of the regions
end Complex_testSync_init;
