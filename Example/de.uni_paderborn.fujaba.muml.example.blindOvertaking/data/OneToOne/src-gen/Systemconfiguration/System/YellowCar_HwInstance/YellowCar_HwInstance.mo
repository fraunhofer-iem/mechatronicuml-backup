	within Systemconfiguration.System.YellowCar_HwInstance;
model YellowCar_HwInstance
	//ComponentKind::CONTINUOUS_COMPONENT 
	//Start of user code CONTINUOUS_Declarations
 //END Protected AreaEnd of user code
		// port declarations
		Modelica.Blocks.Interfaces.RealInput omegaL_desPort
			annotation(Placement(transformation(extent={{0, 0},{35, 20}})));;
		Modelica.Blocks.Interfaces.RealInput omegaR_desPort
			annotation(Placement(transformation(extent={{0, 0},{35, 20}})));;
		// end port declarations
	//Start of user code CONTINUOUS_Behavior
   /* PID(s) = k + (k/Ti)/s + k*Td*s/(Td/Nd*s+1)  = kp + ki/s + kd*s/(Ts+1)
     ki = k/Ti,
     kd = k*Td
     T  = Td/Nd */

  parameter Modelica.SIunits.Radius r_wheel=0.0155 "radius of wheel";
  parameter Modelica.SIunits.Mass m_wheel=0.02 "mass of one wheel";
  parameter Modelica.SIunits.Inertia I_axis_wheel=2.6e-6
    "inertia along axis of wheel";
  parameter Modelica.SIunits.Inertia I_long_wheel=8e-7
    "inertia along longitudinal direction of wheel";
  parameter Modelica.SIunits.Distance d_wheel=0.09
    "distance between the centre of two wheels";
  parameter Modelica.SIunits.Mass m_chassis=0.20 "mass of chassis";
  parameter Modelica.SIunits.Inertia Ix_chassis=7.5e-5
    "inertia of chassis in x-axis, based on CAD model";
  parameter Modelica.SIunits.Inertia Iy_chassis=7.5e-5
    "inertia of chassis in y-axis, based on CAD model";
  parameter Modelica.SIunits.Inertia Iz_chassis=1e-4
    "inertia of chassis in z-axis, the vertical axis";
    parameter Modelica.SIunits.Position xstart_wmr=0
    "start position of x-coordinate of robot";
    parameter Modelica.SIunits.Position ystart_wmr=0
    "start position of y-coordinate of robot";
  Modelica.Mechanics.MultiBody.Parts.RollingWheelSet wheelSet(
    wheelRadius=r_wheel,
    wheelMass=m_wheel,
    wheel_I_axis=I_axis_wheel,
    wheel_I_long=I_long_wheel,
    wheelDistance=d_wheel,
    wheelSetJoint(rolling1(lateralSlidingConstraint=false), rolling2(
          lateralSlidingConstraint=true)),
    hollowFraction=0.0,
    x(start=xstart_wmr, fixed=true),
    y(start=ystart_wmr, fixed=true))
    annotation (Placement(transformation(extent={{-8,-20},{12,0}})));
  Modelica.Mechanics.MultiBody.Interfaces.Frame_a Frame annotation (
      Placement(transformation(
        extent={{-16,-16},{16,16}},
        rotation=90,
        origin={0,60})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Examples.Application.Parts.DCMotorCtrl_V4
                 dCMotorCtrl_V4L
    annotation (Placement(transformation(extent={{-40,-10},{-20,10}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.Examples.Application.Parts.DCMotorCtrl_V4
                                                                                             dCMotorCtrl_V4R annotation (Placement(transformation(
        extent={{-10,10},{10,-10}},
        rotation=180,
        origin={30,0})));
  Modelica.Mechanics.MultiBody.Parts.Body body(        r_CM={0,0,0}, m=
        m_chassis,
    I_11=Ix_chassis,
    I_22=Iy_chassis,
    I_33=Iz_chassis,
    animation=false)
    annotation (Placement(transformation(extent={{20,-50},{40,-30}})));
  Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape(
    shapeType="box",
    length=0.09,
    width=d_wheel,
    r_shape={-0.045,0,0.02},
    lengthDirection={1,0,0},
    widthDirection={0,1,0},
    height=0.05)
    annotation (Placement(transformation(extent={{20,-80},{40,-60}})));
equation

  connect(wheelSet.frameMiddle, Frame) annotation (Line(
      points={{2,-10},{4,-10},{4,40},{0,40},{0,60}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  connect(dCMotorCtrl_V4R.Flange, wheelSet.axis2) annotation (Line(
      points={{20,1.22465e-015},{16,1.22465e-015},{16,0},{12,0}},
      color={0,0,0},
      smooth=Smooth.None));
  connect(dCMotorCtrl_V4L.Flange, wheelSet.axis1) annotation (Line(
      points={{-20,0},{-8,0}},
      color={0,0,0},
      smooth=Smooth.None));
  connect(omegaL_desPort, dCMotorCtrl_V4L.DesSp)
                                             annotation (Line(
      points={{-140,0},{-38,0}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(dCMotorCtrl_V4R.DesSp, omegaR_desPort)
                                             annotation (Line(
      points={{38,-9.79717e-016},{82,-9.79717e-016},{82,0},{140,0}},
      color={0,0,127},
      smooth=Smooth.None));
  connect(body.frame_a, wheelSet.frameMiddle) annotation (Line(
      points={{20,-40},{2,-40},{2,-10}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
  connect(fixedShape.frame_a, wheelSet.frameMiddle) annotation (Line(
      points={{20,-70},{2,-70},{2,-10}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.None));
 //END Protected AreaEnd of user code
	/* TODO Uncomment if initialization is required
	equation
		// initial continuous output port equations
	*/	
	// end initial continuous output port equations
end YellowCar_HwInstance;
