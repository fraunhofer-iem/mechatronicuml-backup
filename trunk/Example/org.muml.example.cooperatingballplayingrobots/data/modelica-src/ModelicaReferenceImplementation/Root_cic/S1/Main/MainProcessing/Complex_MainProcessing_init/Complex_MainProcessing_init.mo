within Root_cic.S1.Main.MainProcessing.Complex_MainProcessing_init;
model Complex_MainProcessing_init
                                  extends Modelica_StateGraph2.PartialParallel(nEntry=3);
 // no annotations will be generated for complex states
 // region declarations
 BAT_Info_From_SensorProcessing1.BAT_Info_From_SensorProcessing1 region_3_BAT_Info_From_SensorProcessing1(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 BAT_Info_To_OtherRobot1.BAT_Info_To_OtherRobot1 region_1_BAT_Info_To_OtherRobot1(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 BAT_Info_ToStrikeProcessing1.BAT_Info_ToStrikeProcessing1 region_2_BAT_Info_ToStrikeProcessing1(nIn=1, use_outPort=false)
  annotation(Placement(transformation(extent={{0,0},{30,30}})));
 // end region declarations
 // entry point input declarations
 // end entry point input declarations
equation
  // connect to the initial states of the region statecharts
  connect(entry[3],
    region_1_BAT_Info_To_OtherRobot1.inPort[1])
   annotation(Line(points={{40,100},{15,30}},
                                         color={0,0,0},smooth=Smooth.None));
  connect(entry[2],
    region_2_BAT_Info_ToStrikeProcessing1.inPort[1])
   annotation(Line(points={{0,100},{15,30}},
                                         color={0,0,0},smooth=Smooth.None));
  connect(entry[1],
    region_3_BAT_Info_From_SensorProcessing1.inPort[1])
   annotation(Line(points={{-40,100},{15,30}},
                                         color={0,0,0},smooth=Smooth.None));
  // end connect to the initial states of the region statecharts
  // connect entry point ports with the corresponding entry point ports of the regions
  // end connect entry point ports with the corresponding entry point ports of the regions
end Complex_MainProcessing_init;
