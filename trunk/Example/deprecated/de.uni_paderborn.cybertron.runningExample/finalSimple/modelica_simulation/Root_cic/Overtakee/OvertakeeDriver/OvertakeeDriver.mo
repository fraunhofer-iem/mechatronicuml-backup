within Root_cic.Overtakee.OvertakeeDriver;
model OvertakeeDriver
  // port declarations
  Modelica.Blocks.Interfaces.IntegerInput colorPort
   annotation (Placement(transformation(extent={{-44.449999999999996, -6.349999999999998},{-19.049999999999997, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.RealOutput rightVelocityPort
   annotation (Placement(transformation(extent={{-12.7, -6.349999999999998},{12.699999999999996, 6.350000000000001}})));
  Modelica.Blocks.Interfaces.RealOutput leftVelocityPort
   annotation (Placement(transformation(extent={{19.04999999999999, -6.349999999999998},{44.449999999999996, 6.350000000000001}})));
  // end port declarations
  // the behavior of the atomic component
  OvertakeeDriveControlComponentBehavior.OvertakeeDriveControlComponentBehavior
                                                                                behavior
   annotation(Placement(transformation(extent={{0,0},{40,30}})));
equation
    // connect discrete component ports with the corresponding rtsc ports (only for received or sent messages)
    // connect discrete component ports with the corresponding rtsc ports  (only for received or sent messages)
    // connect hybrid component ports with the corresponding rtsc ports
    connect(colorPort,
     behavior.colorPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(rightVelocityPort,
     behavior.rightVelocityPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    connect(leftVelocityPort,
     behavior.leftVelocityPort)
     annotation(Line(points={{0,0},{2,2}}, color={0,0,0},smooth=Smooth.None));
    // end connect hybrid component ports with the corresponding rtsc ports
 annotation (Icon(coordinateSystem(extent = {{-44.449999999999996, -6.349999999999998},{44.449999999999996, 6.349999999999998}})));
end OvertakeeDriver;
