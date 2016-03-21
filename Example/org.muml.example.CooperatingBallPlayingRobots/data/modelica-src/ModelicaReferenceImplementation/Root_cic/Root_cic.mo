within Root_cic;
model Root_cic
  // part declarations
  S1.S1 s1
  annotation (Placement(transformation(extent={{-187.325, 6.350000000000001},{187.32499999999996, 19.049999999999997}})));
  S2.S2 s2
  annotation (Placement(transformation(extent={{-187.325, -19.049999999999997},{187.32499999999996, -6.35}})));
  //Start of user code CONTINUOUS_Part_Declarations

    //End of user code
  // end part declarations
  Modelica.Blocks.Sources.RealExpression realExpression
    annotation (Placement(transformation(extent={{-168,46},{-148,66}})));
  Modelica.Blocks.Sources.BooleanConstant stopPlaying(k=false)
    annotation (Placement(transformation(extent={{-124,-60},{-104,-40}})));
  Modelica.Blocks.Sources.BooleanConstant Master(k=true)
    annotation (Placement(transformation(extent={{-64,-80},{-44,-60}})));
  Modelica.Blocks.MathBoolean.Not nor1
    annotation (Placement(transformation(extent={{-22,-80},{-14,-72}})));
  Modelica.Blocks.Sources.SampleTrigger sampleTrigger(period=0.5, startTime=0)
    annotation (Placement(transformation(extent={{-52,70},{-32,90}})));
  Modelica.Blocks.Sources.SampleTrigger sampleTrigger1(period=0.5, startTime=
        0.25) annotation (Placement(transformation(extent={{12,-70},{32,-50}})));
equation
   // connect assemblies
   connect(s2.BAT_Information_To_OtherRobot1_turn_outputDelegationPort,
    s1.BAT_Information_To_OtherRobot1_turn_inputDelegationPort)
    annotation (Line(points={{111.125,-12.7},{111.125,-12.7},{111.125,12.7},{
          111.125,12.7}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   connect(s2.BAT_Information_To_OtherRobot1_stopPlaying_outputDelegationPort,
    s1.BAT_Information_To_OtherRobot1_stopPlaying_inputDelegationPort)
    annotation (Line(points={{79.375,-12.7},{79.375,-12.7},{79.375,12.7},{
          79.375,12.7}},                                                                                                    color={0,0,0}, smooth=Smooth.None));

   connect(s1.BAT_Information_To_OtherRobot1_turn_outputDelegationPort,
    s2.BAT_Information_To_OtherRobot1_turn_inputDelegationPort)
    annotation (Line(points={{174.625,12.7},{174.625,12.7},{174.625,-12.7},{
          174.625,-12.7}},                                                                                                    color={0,0,0}, smooth=Smooth.None));
   connect(s1.BAT_Information_To_OtherRobot1_stopPlaying_outputDelegationPort,
    s2.BAT_Information_To_OtherRobot1_stopPlaying_inputDelegationPort)
    annotation (Line(points={{142.875,12.7},{142.875,12.7},{142.875,-12.7},{
          142.875,-12.7}},                                                                                                    color={0,0,0}, smooth=Smooth.None));

   //generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
  //end user defined areaEnd of user code
   // end connect assemblies
  connect(realExpression.y, s1.posXPort) annotation (Line(
      points={{-147,56},{-162,56},{-162,12.7},{-174.625,12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s1.velocityPort) annotation (Line(
      points={{-147,56},{-148,56},{-148,12.7},{-142.875,12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s1.timeOfArrivalPort) annotation (Line(
      points={{-147,56},{-100,56},{-100,12.7},{-47.625,12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s1.posYPort) annotation (Line(
      points={{-147,56},{-52,56},{-52,12.7},{47.625,12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s1.posZPort) annotation (Line(
      points={{-147,56},{-84,56},{-84,12.7},{-15.875,12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s2.posZPort) annotation (Line(
      points={{-147,56},{-162,56},{-162,-12.7},{-174.625,-12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s2.posXPort) annotation (Line(
      points={{-147,56},{-138,56},{-138,24},{-130,24},{-130,-12.7},{-142.875,
          -12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s2.velocityPort) annotation (Line(
      points={{-147,56},{-114,56},{-114,-12.7},{-79.375,-12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(realExpression.y, s2.timeOfArrivalPort) annotation (Line(
      points={{-147,56},{-70,56},{-70,-12.7},{15.875,-12.7}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(s2.posYPort, realExpression.y) annotation (Line(
      points={{47.625,-12.7},{-50.1875,-12.7},{-50.1875,56},{-147,56}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(stopPlaying.y, s2.stopPlayingPort) annotation (Line(
      points={{-103,-50},{-78,-50},{-78,-12.7},{-47.625,-12.7}},
      color={255,0,255},
      smooth=Smooth.None));
  connect(stopPlaying.y, s1.stopPlayingPort) annotation (Line(
      points={{-103,-50},{-110,-50},{-110,12.7},{-111.125,12.7}},
      color={255,0,255},
      smooth=Smooth.None));
  connect(Master.y, s1.isMasterPort) annotation (Line(
      points={{-43,-70},{-62,-70},{-62,12.7},{-79.375,12.7}},
      color={255,0,255},
      smooth=Smooth.None));
  connect(Master.y, nor1.u) annotation (Line(
      points={{-43,-70},{-34,-70},{-34,-76},{-23.6,-76}},
      color={255,0,255},
      smooth=Smooth.None));
  connect(nor1.y, s2.isMasterPort) annotation (Line(
      points={{-13.2,-76},{-64,-76},{-64,-12.7},{-111.125,-12.7}},
      color={255,0,255},
      smooth=Smooth.None));
  connect(s1.ballRecognizedPort, sampleTrigger.y) annotation (Line(
      points={{15.875,12.7},{15.875,46.35},{-31,46.35},{-31,80}},
      color={255,0,255},
      smooth=Smooth.None));
  connect(sampleTrigger1.y, s2.ballRecognizedPort) annotation (Line(
      points={{33,-60},{10,-60},{10,-12.7},{-15.875,-12.7}},
      color={255,0,255},
      smooth=Smooth.None));
 annotation (Diagram(coordinateSystem(extent={{-190.147,-21.8722},{190.147,
            21.8722}}, preserveAspectRatio=false), graphics));
end Root_cic;
