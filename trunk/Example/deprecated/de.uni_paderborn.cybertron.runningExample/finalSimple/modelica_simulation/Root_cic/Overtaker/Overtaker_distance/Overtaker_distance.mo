within Root_cic.Overtaker.Overtaker_distance;
model Overtaker_distance
 //ComponentKind::CONTINUOUS_COMPONENT
 //Start of user code CONTINUOUS_Declarations

   //End of user code
  // port declarations
  Modelica.Blocks.Interfaces.IntegerOutput distancePort(start=255)
   annotation (Placement(transformation(extent={{-12.699999999999964, -6.349999999999998},{12.700000000000035, 6.350000000000001}})));
  // end port declarations
 //Start of user code CONTINUOUS_Behavior
equation
                // initial continuous output port equations
                distancePort = 255;
   //End of user code
 /* TODO Uncomment if initialization is required
        equation
                // initial continuous output port equations
                distancePort = 255;
        */
 // end initial continuous output port equations
 annotation (Icon(coordinateSystem(extent = {{-12.700000000000003, -6.349999999999998},{12.700000000000003, 6.349999999999998}})));
end Overtaker_distance;
