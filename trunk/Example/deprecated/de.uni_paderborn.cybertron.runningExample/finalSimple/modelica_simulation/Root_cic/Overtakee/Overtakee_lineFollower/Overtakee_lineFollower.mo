within Root_cic.Overtakee.Overtakee_lineFollower;
model Overtakee_lineFollower
 //ComponentKind::CONTINUOUS_COMPONENT
 //Start of user code CONTINUOUS_Declarations

   //End of user code
  // port declarations
  Modelica.Blocks.Interfaces.IntegerOutput lightPort(start=100)
   annotation (Placement(transformation(extent={{-12.699999999999996, -6.35},{12.700000000000003, 6.35}})));
  // end port declarations
 //Start of user code CONTINUOUS_Behavior
equation
                // initial continuous output port equations
                lightPort = 710;
   //End of user code
 /* TODO Uncomment if initialization is required
        equation
                // initial continuous output port equations
                lightPort = 100;
        */
 // end initial continuous output port equations
 annotation (Icon(coordinateSystem(extent = {{-12.699999999999996, -6.35},{12.699999999999996, 6.35}})));
end Overtakee_lineFollower;
