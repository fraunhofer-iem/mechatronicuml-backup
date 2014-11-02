within Root_cic.Overtaker.Overtaker_lineFollower;
model Overtaker_lineFollower
 //ComponentKind::CONTINUOUS_COMPONENT
 //Start of user code CONTINUOUS_Declarations

   //End of user code
  // port declarations
  Modelica.Blocks.Interfaces.IntegerOutput lightPort(start=100)
   annotation (Placement(transformation(extent={{-12.699999999999964, -6.350000000000001},{12.700000000000035, 6.349999999999998}})));
  // end port declarations
 //Start of user code CONTINUOUS_Behavior
equation
  // a value of 690 indicates that the overtaker follows
  // the line (without any errors)
  if time > 6.4 and time < 7.3 then
    // for a certain amount of time, we have to provide
    // a value less than 590 (= ConstBlack).
    // For the details, see DrivingBehaviorOvertaker rtsc
    lightPort = 100;
  else
    lightPort = 690;
  end if;
   //End of user code
 // end initial continuous output port equations
 annotation (Icon(coordinateSystem(extent = {{-12.700000000000003, -6.350000000000001},{12.700000000000003, 6.350000000000001}})));
end Overtaker_lineFollower;
