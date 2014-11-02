within Root_cic;
model Root_cic
  // part declarations
  Overtaker.Overtaker overtaker
  annotation (Placement(transformation(extent={{-44.449999999999996, 6.350000000000001},{44.44999999999998, 19.049999999999997}})));
  Overtakee.Overtakee overtakee
  annotation (Placement(transformation(extent={{-44.449999999999996, -19.049999999999997},{44.44999999999998, -6.35}})));
  //Start of user code CONTINUOUS_Part_Declarations

    //End of user code
  // end part declarations
  distance distance1
    annotation (Placement(transformation(extent={{-40,-4},{-30,4}})));
equation
   // connect assemblies
   connect(overtaker.overtaker1_requestOvertaking_outputDelegationPort,
    overtakee.overtakee1_requestOvertaking_inputDelegationPort)
    annotation (Line(points={{-4,12.7},{-4,0},{0,0},{0,-12.7}},                                                                       color={0,0,0}, smooth=Smooth.None));
   connect(overtaker.overtaker1_finishedOvertaking_outputDelegationPort,
    overtakee.overtakee1_finishedOvertaking_inputDelegationPort)
    annotation (Line(points={{-26.225,12.525},{-26.225,-12.7},{32.25,-12.7}},                                                                     color={0,0,0}, smooth=Smooth.None));

   connect(overtakee.overtakee1_acceptOvertaking_outputDelegationPort,
    overtaker.overtaker1_acceptOvertaking_inputDelegationPort)
    annotation (Line(points={{-19.775,-13.525},{31.75,-13.525},{31.75,12.7}},                                                                                                    color={0,0,0}, smooth=Smooth.None));

   //generated not: beginn user defined area for  manually needed connect statementsStart of user code CONTINUOUS_Connect
  //end user defined areaEnd of user code
   // end connect assemblies
  connect(distance1.y, overtaker.u) annotation (Line(
      points={{-29.6,0.4},{-7.85,0.4},{-7.85,11.7},{15,11.7}},
      color={255,127,0},
      smooth=Smooth.None));
  connect(distance1.xpos2, overtakee.frame_a) annotation (Line(
      points={{-40,-1.6},{-40,-6},{-40,-11.7},{-39,-11.7}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  connect(distance1.xpos1, overtaker.frame_a) annotation (Line(
      points={{-40,2.32},{-40,8},{-40,13.7},{-41,13.7}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
 annotation (Diagram(coordinateSystem(extent={{-47.2722,-21.8722},{47.2722,
            21.8722}}, preserveAspectRatio=false), graphics));
end Root_cic;
