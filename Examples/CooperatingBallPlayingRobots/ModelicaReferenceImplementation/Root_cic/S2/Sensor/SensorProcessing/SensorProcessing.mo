within Root_cic.S2.Sensor.SensorProcessing;
model SensorProcessing
  // attribute declarations
  // end attribute declarations
  // hybrid port declarations
 Modelica.Blocks.Interfaces.RealInput posZPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real posZ;
 Real posZ_sampled;
 Modelica.Blocks.Interfaces.RealInput posXPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real posX;
 Real posX_sampled;
 Modelica.Blocks.Interfaces.RealInput timeOfArrivalPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real timeOfArrival;
 Real timeOfArrival_sampled;
 Modelica.Blocks.Interfaces.RealInput velocityPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real velocity;
 Real velocity_sampled;
 Modelica.Blocks.Interfaces.RealInput posYPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Real posY;
 Real posY_sampled;
 Modelica.Blocks.Interfaces.BooleanInput ballRecognizedPort
  annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
 inner Boolean ballRecognized;
 Boolean ballRecognized_sampled;
  // end hybrid port declarations
  // local variable declarations
  // end local variable declarations
  // step declarations
  Complex_SensorProcessing_Initial.Complex_SensorProcessing_Initial Initial(
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
  inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c0(nu=2)
   annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
  // end clock declarations
  // clock constraint declarations
  // end clock constraint declarations

  // raise message event delegation port declarations for region BAT_Info1
  RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                         BAT_Info1_transferBATInfo_outputDelegationPort(
   redeclare Integer integers[0],
   redeclare Boolean booleans[0],
   redeclare Real reals[5])
   annotation(Placement(transformation(extent={{0,0},{18,18}})));
  // end raise message event delegation port declarations for region BAT_Info1
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
   connect(Initial.region_1_BAT_Info1.Reading.activePort,
    c0.u[1]);
   connect(Initial.region_1_BAT_Info1.Sending.activePort,
    c0.u[2]);
   // end connect clock resets
   // connect synchronization channels
   // end connect synchronization channels
   // connect hybrid ports
   posZPort = posZ_sampled;
   posXPort = posX_sampled;
   timeOfArrivalPort = timeOfArrival_sampled;
   velocityPort = velocity_sampled;
   posYPort = posY_sampled;
   ballRecognizedPort = ballRecognized_sampled;
   // end connect hybrid ports
   // trigger message event port delegations for region BAT_Info1
   // end trigger message event port delegations for region BAT_Info1
   // raise message event port delegations for region BAT_Info1
   connect(BAT_Info1_transferBATInfo_outputDelegationPort,
    Initial.region_1_BAT_Info1.transferBATInfo_outputDelegationPort);
   // end raise message event port delegations for region BAT_Info1

  // hybrid port sample value variable equations
algorithm
  when sample(0, (10) * 0.001) then
   posZ := posZ_sampled;
  end when;
algorithm
  when sample(0, (10) * 0.001) then
   posX := posX_sampled;
  end when;
algorithm
  when sample(0, (10) * 0.001) then
   timeOfArrival := timeOfArrival_sampled;
  end when;
algorithm
  when sample(0, (10) * 0.001) then
   velocity := velocity_sampled;
  end when;
algorithm
  when sample(0, (10) * 0.001) then
   posY := posY_sampled;
  end when;
algorithm
  when sample(0, (10) * 0.001) then
   ballRecognized := ballRecognized_sampled;
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
algorithm
   when Initial.region_1_BAT_Info1.transition_Reading_1_Sending.fire then
    Initial.region_1_BAT_Info1.message_transferBATInfo_posX := posX;
    Initial.region_1_BAT_Info1.message_transferBATInfo_posY := posY;
    Initial.region_1_BAT_Info1.message_transferBATInfo_posZ := posZ;
    Initial.region_1_BAT_Info1.message_transferBATInfo_timeOfArrival := timeOfArrival;
    Initial.region_1_BAT_Info1.message_transferBATInfo_velocity := velocity;
   end when;
   // end assign parameter binding variables
   // state entry actions
   // end state entry actions
   // do event actions
   // end do event actions

 annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
end SensorProcessing;

