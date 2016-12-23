	within Systemconfiguration.System;
model System
		// part declarations
		RedSWInstance.RedSWInstance redSWInstance
	annotation(Placement(transformation(extent={{0,0},{30,30}})));
		YellowSWInstance.YellowSWInstance yellowSWInstance
	annotation(Placement(transformation(extent={{0,0},{30,30}})));
		RedCarHWInstance.RedCarHWInstance redCarHWInstance
	annotation(Placement(transformation(extent={{0,0},{30,30}})));
		YellowCar_HwInstance.YellowCar_HwInstance yellowCar_HwInstance
	annotation(Placement(transformation(extent={{0,0},{30,30}})));
		DistanceInstance.DistanceInstance distanceInstance
	annotation(Placement(transformation(extent={{0,0},{30,30}})));
		//Start of user code CONTINUOUS_Part_Declarations
 //end user defined areaEnd of user code
		// end part declarations
		// port declarations
		// end port declarations
	equation
			// connect assemblies
			connect(redCarHWInstance.omegaR_desPort,
				redSWInstance.velocityPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(yellowCar_HwInstance.omegaL_desPort,
				yellowSWInstance.velocityPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(yellowCar_HwInstance.omegaR_desPort,
				yellowSWInstance.velocityPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(yellowSWInstance.rearMessagePort1_request_outputDelegationPort,
				redSWInstance.frontMessagePort1_request_inputDelegationPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(yellowSWInstance.rearMessagePort1_finish_outputDelegationPort,
				redSWInstance.frontMessagePort1_finish_inputDelegationPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(yellowSWInstance.rearMessagePort1_laneChanged_outputDelegationPort,
				redSWInstance.frontMessagePort1_laneChanged_inputDelegationPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			
			connect(redSWInstance.frontMessagePort1_decline_outputDelegationPort,
				yellowSWInstance.rearMessagePort1_decline_inputDelegationPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(redSWInstance.frontMessagePort1_accept_outputDelegationPort,
				yellowSWInstance.rearMessagePort1_accept_inputDelegationPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			
		
			connect(redCarHWInstance.omegaL_desPort,
				redSWInstance.velocityPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(distanceInstance.yPort,
				yellowSWInstance.distancePort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			//generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
    connect(distanceInstance.xpos1, yellowCar_HwInstance.Frame) annotation (Line(
      points={{-66,-8.3},{-26,-8.3},{-26,-32},{49,-32}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  connect(redCarHWInstance.Frame, distanceInstance.xpos2) annotation (Line(
      points={{-59,54},{2,54},{2,-23},{-66,-23}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  //end user defined areaEnd of user code
			// end connect assemblies
			// connect delegations
			// end connect delegations
end System;
