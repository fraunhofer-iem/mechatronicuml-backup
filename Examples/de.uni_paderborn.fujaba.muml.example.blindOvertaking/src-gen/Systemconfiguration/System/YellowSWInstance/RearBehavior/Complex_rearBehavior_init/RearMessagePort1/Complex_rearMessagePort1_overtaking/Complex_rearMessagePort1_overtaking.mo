	within Systemconfiguration.System.YellowSWInstance.RearBehavior.Complex_rearBehavior_init.RearMessagePort1.Complex_rearMessagePort1_overtaking;
model Complex_rearMessagePort1_overtaking extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	// no annotations will be generated for complex states
	// region declarations
	Rear_overtaking.Rear_overtaking region_1_rear_overtaking(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	// end region declarations
	// entry point input declarations
	// end entry point input declarations
	equation
		// connect to the initial states of the region statecharts
		connect(entry[1],
				region_1_rear_overtaking.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		// end connect to the initial states of the region statecharts
		// connect entry point ports with the corresponding entry point ports of the regions
		// end connect entry point ports with the corresponding entry point ports of the regions
end Complex_rearMessagePort1_overtaking;
