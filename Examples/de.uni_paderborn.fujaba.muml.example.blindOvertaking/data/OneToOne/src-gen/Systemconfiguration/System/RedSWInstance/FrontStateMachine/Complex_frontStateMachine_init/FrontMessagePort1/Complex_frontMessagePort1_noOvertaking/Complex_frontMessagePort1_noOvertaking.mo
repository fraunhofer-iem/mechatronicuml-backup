	within Systemconfiguration.System.RedSWInstance.FrontStateMachine.Complex_frontStateMachine_init.FrontMessagePort1.Complex_frontMessagePort1_noOvertaking;
model Complex_frontMessagePort1_noOvertaking extends Modelica_StateGraph2.PartialParallel(nEntry=1);
	// no annotations will be generated for complex states
	// region declarations
	Front_noOvertaking.Front_noOvertaking region_1_front_noOvertaking(nIn=1, use_outPort=false)
		annotation(Placement(transformation(extent={{0,0},{30,30}})));
	// end region declarations
	// entry point input declarations
	// end entry point input declarations
	equation
		// connect to the initial states of the region statecharts
		connect(entry[1],
				region_1_front_noOvertaking.inPort[1])
			annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
		// end connect to the initial states of the region statecharts
		// connect entry point ports with the corresponding entry point ports of the regions
		// end connect entry point ports with the corresponding entry point ports of the regions
end Complex_frontMessagePort1_noOvertaking;
