	within Root_cic.S1.C2.Receiver.Complex_Receiver_Receiver_main;
model Complex_Receiver_Receiver_main extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	// no annotations will be generated for complex states
	// region declarations
	In1.In1 region_1_in1(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	// end region declarations
	// entry point input declarations
	// end entry point input declarations
	equation
		// connect to the initial states of the region statecharts
		connect(entry[1],
				region_1_in1.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		// end connect to the initial states of the region statecharts
		// connect entry point ports with the corresponding entry point ports of the regions
		// end connect entry point ports with the corresponding entry point ports of the regions
end Complex_Receiver_Receiver_main;
