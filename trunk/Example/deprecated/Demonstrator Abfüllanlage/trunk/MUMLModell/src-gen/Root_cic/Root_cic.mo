model Root_cic
		// part declarations
		Bc.Bc bc
		annotation (Placement(transformation(extent={{, },{, }})));
		Tank.Tank tank
		annotation (Placement(transformation(extent={{, },{, }})));
		Temp.Temp temp
		annotation (Placement(transformation(extent={{, },{, }})));
		Rc.Rc rc
		annotation (Placement(transformation(extent={{, },{, }})));
		Radiator.Radiator radiator
		annotation (Placement(transformation(extent={{, },{, }})));
		Robot1HW.Robot1HW robot1HW
		annotation (Placement(transformation(extent={{, },{, }})));
		Robot1.Robot1 robot1
		annotation (Placement(transformation(extent={{, },{, }})));
		Robot2.Robot2 robot2
		annotation (Placement(transformation(extent={{, },{, }})));
		Robot2HW.Robot2HW robot2HW
		annotation (Placement(transformation(extent={{, },{, }})));
		Central.Central central
		annotation (Placement(transformation(extent={{, },{, }})));
		//Start of user code CONTINUOUS_Part_Declarations
	
	
	
	   //End of user code
		// end part declarations
	equation
			// connect assemblies
			connect(bc.slave1_done_outputDelegationPort,
				central.masterToBottling1_done_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(bc.slave1_fail_outputDelegationPort,
				central.masterToBottling1_fail_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
			connect(central.masterToBottling1_continue_outputDelegationPort,
				bc.slave1_continue_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(central.masterToBottling1_order_outputDelegationPort,
				bc.slave1_order_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(rc.masterToRobot21_continue_outputDelegationPort,
				robot2.slave1_continue_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(rc.masterToRobot21_order_outputDelegationPort,
				robot2.slave1_order_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
			connect(robot2.slave1_done_outputDelegationPort,
				rc.masterToRobot21_done_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(robot2.slave1_fail_outputDelegationPort,
				rc.masterToRobot21_fail_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(robot2HW.anglePort,
				robot2.anglePort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(central.masterToRobot1_continue_outputDelegationPort,
				rc.slaveToMainControl1_continue_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(central.masterToRobot1_order_outputDelegationPort,
				rc.slaveToMainControl1_order_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
			connect(rc.slaveToMainControl1_done_outputDelegationPort,
				central.masterToRobot1_done_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(rc.slaveToMainControl1_fail_outputDelegationPort,
				central.masterToRobot1_fail_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(robot1.slave1_done_outputDelegationPort,
				rc.masterToRobots1_done_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(robot1.slave1_fail_outputDelegationPort,
				rc.masterToRobots1_fail_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
			connect(rc.masterToRobots1_continue_outputDelegationPort,
				robot1.slave1_continue_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(rc.masterToRobots1_order_outputDelegationPort,
				robot1.slave1_order_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(tank.fluidSensorPort,
				bc.fluidSensorPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(robot1.anglePort,
				robot1HW.anglePort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(temp.providerTank1_limitViolated_outputDelegationPort,
				central.observerTank1_limitViolated_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(temp.providerTank1_limitRedeemed_outputDelegationPort,
				central.observerTank1_limitRedeemed_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(temp.provider1_limitViolated_outputDelegationPort,
				central.observerRobot1_limitViolated_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(temp.provider1_limitRedeemed_outputDelegationPort,
				central.observerRobot1_limitRedeemed_inputDelegationPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			
		
			connect(robot2HW.velocityRightPort,
				robot2.velRPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(tank.outFlowPort,
				bc.outFlowTankPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(central.radiatorOnPort,
				radiator.switchOnPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(robot1.velRPort,
				robot1HW.velocityRightPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(robot1.velLPort,
				robot1HW.velocityLeftPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			connect(robot2HW.velocityLeftPort,
				robot2.velLPort)
				annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
			//generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
		//end user defined areaEnd of user code
			// end connect assemblies
	annotation (Diagram(coordinateSystem(extent = {{-, -}, {, }})));
end Root_cic;
