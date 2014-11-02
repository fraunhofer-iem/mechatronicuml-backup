within Root_cic.Overtakee.OvertakeeDriver.OvertakeeDriveControlComponentBehavior;
model OvertakeeDriveControlComponentBehavior
  // attribute declarations
  inner constant Integer ConstMaxVelocity = 22;
  inner constant Integer ConstMinVelocity = 8;
  inner constant Integer ConstOffset = 71;
  inner constant Integer ConstKD = 700;
  inner constant Integer ConstKP = 70;
  inner constant Integer velocity = 14;
  inner constant Integer ConstKI = 0;
  // end attribute declarations
  // hybrid port declarations
 Modelica.Blocks.Interfaces.IntegerInput colorPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Integer color;
 Integer color_sampled;
 Modelica.Blocks.Interfaces.RealOutput rightVelocityPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real rightVelocity;
 Real rightVelocity_sampled(start=14);
 Modelica.Blocks.Interfaces.RealOutput leftVelocityPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real leftVelocity;
 Real leftVelocity_sampled(start=14);
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_OvertakeeDriveControlComponentBehavior_OvertakeeDriveMain.Complex_OvertakeeDriveControlComponentBehavior_OvertakeeDriveMain
                                                                                                        OvertakeeDriveMain(
   nIn=0,
   use_outPort=false,
   nSuspend=0,
   initialStep=true)
   annotation (Placement(transformation(extent={{0.0, 0.0},{25.4, 12.7}})));

  // end step declarations

  // variable declarations for do events
  // end variable declarations for do events

  // transition declarations
  // end transition declarations

  // clock declarations
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations

equation
   // connect transition
   // end connect transition

   // connect entry point inputs
   // end connect entry point inputs
   // connect clock constraints
   // end connect clock constraints
   // connect state invariants
   // end connect state invariants
   // connect clock resets
   connect(OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.transition_LineFollowing_1_LineFollowing.firePort,
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.c1.u[1]);
   // end connect clock resets
   // connect synchronization channels
   // end connect synchronization channels
   // connect hybrid ports
   colorPort = color_sampled;
   rightVelocityPort = rightVelocity_sampled;
   leftVelocityPort = leftVelocity_sampled;
   // end connect hybrid ports

  // hybrid port sample value variable equations
algorithm
  when sample(0, (3) * 0.001) then
   color := color_sampled;
  end when;
algorithm
  when sample(0, (3) * 0.001) then
   rightVelocity_sampled := rightVelocity;
  end when;
algorithm
  when sample(0, (3) * 0.001) then
   leftVelocity_sampled := leftVelocity;
  end when;
  // end hybrid port sample value variable equations
equation
   // state exit actions
   // end state exit actions
   // assign trigger message parameter bindings to the corresponding parameter binding variables
   // end trigger message parameter bindings to the corresponding parameter binding variables
   // transition actions
   // end transition actions
   // assign parameter binding variables
   // end assign parameter binding variables
   // state entry actions
algorithm
   when not pre(OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.LineFollowing.active) and OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.LineFollowing.active then
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.lightValue := color / 10;
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.error := OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.lightValue - ConstOffset;
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.integral := OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.integral + OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.error;
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.derivative := OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.error - OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.lastError;
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.turn := (ConstKP * OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.error + ConstKI * OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.integral + ConstKD * OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.derivative) / 100;
    OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.lastError := OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.error;
    leftVelocity := velocity + OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.turn;
    rightVelocity := velocity - OvertakeeDriveMain.region_1_DrivingBehaviorOvertakee.turn;
    if leftVelocity < ConstMinVelocity then
     leftVelocity := ConstMinVelocity;

    end if;
    if leftVelocity > ConstMaxVelocity then
     leftVelocity := ConstMaxVelocity;

    end if;
    if rightVelocity < ConstMinVelocity then
     rightVelocity := ConstMinVelocity;

    end if;
    if rightVelocity > ConstMaxVelocity then
     rightVelocity := ConstMaxVelocity;

    end if;

   end when;
   // end state entry actions
   // do event actions
   // end do event actions
 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end OvertakeeDriveControlComponentBehavior;

