within Root_cic.Overtaker.OvertakerDriver.OvertakerDriveControlComponentBehavior;
model OvertakerDriveControlComponentBehavior
  // attribute declarations
  inner constant Integer ConstMinVelocity = 12;
  inner constant Integer ConstOffset = 69;
  inner constant Integer ConstMaxVelocity = 30;
  inner Integer  velocity(start=18);
  inner constant Integer ConstKP = 75;
  inner constant Integer ConstKD = 750;
  inner constant Integer ConstHelper = 4;
  inner constant Integer ConstKI = 0;
  inner constant Integer ConstBlack = 590;
  // end attribute declarations
  // hybrid port declarations
 Modelica.Blocks.Interfaces.RealInput distancePort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real distance;
 Real distance_sampled;
 Modelica.Blocks.Interfaces.RealOutput leftVelocityPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real leftVelocity;
 Real leftVelocity_sampled(start=14);
 Modelica.Blocks.Interfaces.RealOutput rightVelocityPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real rightVelocity;
 Real rightVelocity_sampled(start=14);
 Modelica.Blocks.Interfaces.IntegerInput colorPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Integer color;
 Integer color_sampled;
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain.Complex_OvertakerDriveControlComponentBehavior_OvertakerDriveMain
                                                                                                        OvertakerDriveMain(
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

  // raise message event delegation port declarations for region overtakerDriver_pDetector
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerDriver_pDetector_initiateOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         overtakerDriver_pDetector_executedOvertaking_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[0])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region overtakerDriver_pDetector
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
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight2.activePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cTurningR.u[1]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.activePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cTurningR.u[2]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1ExitMarker.y,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cHelper.u[1]);
   OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1ExitMarker.u = not (pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.active) and not OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.active);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft2.activePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cTurningL.u[1]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft1.activePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cTurningL.u[2]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ToHelperLine.activePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cOvertake.u[1]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ToMainLine.activePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.cOvertake.u[2]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.transition_FollowMainLine_1_FollowMainLine.firePort,
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.c1.u[1]);
   // end connect clock resets
   // connect synchronization channels
   connect(OvertakerDriveMain.region_1_overtakerDriver_pDetector.transition_Initiated_1_Executing.sender[1],
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.transition_FollowMainLine_2_TurnLeft1.receiver[1]);
   connect(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.transition_TurnLeft2_1_FollowMainLine.sender[1],
    OvertakerDriveMain.region_1_overtakerDriver_pDetector.transition_Executing_1_Init.receiver[1]);
   // end connect synchronization channels
   // connect hybrid ports
   distancePort = distance_sampled;
   leftVelocityPort = leftVelocity_sampled;
   rightVelocityPort = rightVelocity_sampled;
   colorPort = color_sampled;
   // end connect hybrid ports
   // trigger message event port delegations for region overtakerDriver_pDetector
   // end trigger message event port delegations for region overtakerDriver_pDetector
   // raise message event port delegations for region overtakerDriver_pDetector
   connect(overtakerDriver_pDetector_initiateOvertaking_outputDelegationPort,
    OvertakerDriveMain.region_1_overtakerDriver_pDetector.initiateOvertaking_outputDelegationPort);
   connect(overtakerDriver_pDetector_executedOvertaking_outputDelegationPort,
    OvertakerDriveMain.region_1_overtakerDriver_pDetector.executedOvertaking_outputDelegationPort);
   // end raise message event port delegations for region overtakerDriver_pDetector

  // hybrid port sample value variable equations
algorithm
  when sample(0, (3) * 0.001) then
   distance := distance_sampled;
  end when;
algorithm
  when sample(0, (3) * 0.001) then
   leftVelocity_sampled := leftVelocity;
  end when;
algorithm
  when sample(0, (3) * 0.001) then
   rightVelocity_sampled := rightVelocity;
  end when;
algorithm
  when sample(0, (3) * 0.001) then
   color := color_sampled;
  end when;
  // end hybrid port sample value variable equations
equation
   // state exit actions
algorithm
   when not OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft1.active and pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft1.active) then
    leftVelocity := velocity;
    rightVelocity := velocity;

   end when;
   when not OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight2.active and pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight2.active) then
    leftVelocity := velocity;
    rightVelocity := velocity;

   end when;
   when not OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft2.active and pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft2.active) then
    leftVelocity := velocity;
    rightVelocity := velocity;

   end when;
   when not OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.active and pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.active) then
    leftVelocity := velocity + 10;
    rightVelocity := velocity + 10;

   end when;
   when not OvertakerDriveMain.region_1_overtakerDriver_pDetector.Initiated.active and pre(OvertakerDriveMain.region_1_overtakerDriver_pDetector.Initiated.active) then
    velocity := 18;

   end when;
   // end state exit actions
   // assign trigger message parameter bindings to the corresponding parameter binding variables
   // end trigger message parameter bindings to the corresponding parameter binding variables
   // transition actions
   // end transition actions
   // assign parameter binding variables
   when OvertakerDriveMain.region_1_overtakerDriver_pDetector.transition_Init_1_Initiated.fire then
   end when;
   when OvertakerDriveMain.region_1_overtakerDriver_pDetector.transition_Executing_1_Init.fire then
   end when;
   // end assign parameter binding variables
   // state entry actions
   when not pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.FollowMainLine.active) and OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.FollowMainLine.active then
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.lightValue := color / 10;
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.error := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.lightValue - ConstOffset;
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.integral := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.integral + OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.error;
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.derivative := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.error - OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.lastError;
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.turn := (ConstKP * OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.error + ConstKI * OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.integral + ConstKD * OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.derivative) / 100;
    OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.lastError := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.error;
    leftVelocity := velocity + OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.turn;
    rightVelocity := velocity - OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.turn;
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
   when not pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft1.active) and OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft1.active then
    leftVelocity := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity;
    rightVelocity := -OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity;

   end when;
   when not pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight2.active) and OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight2.active then
    leftVelocity := -OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity + 2;
    rightVelocity := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity - 2;

   end when;
   when not pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft2.active) and OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnLeft2.active then
    leftVelocity := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity + 1;
    rightVelocity := -OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity - 4;

   end when;
   when not pre(OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.active) and OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.TurnRight1.active then
    leftVelocity := -OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity + 2;
    rightVelocity := OvertakerDriveMain.region_2_DrivingBehaviorOvertaker.ConstTurningVelocity - 2;
   end when;
   when not pre(OvertakerDriveMain.region_1_overtakerDriver_pDetector.Initiated.active) and OvertakerDriveMain.region_1_overtakerDriver_pDetector.Initiated.active then
    velocity := 14;

   end when;
   // end state entry actions
   // do event actions
   // end do event actions
 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end OvertakerDriveControlComponentBehavior;

