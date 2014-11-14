within ;
package demonstrator
  model System

    BottlingControl.BottlingControl bc_BottlingControl annotation (Placement(
          transformation(
          extent={{44,24},{-44,-24}},
          rotation=0,
          origin={-2,52})));
    Modelica.Blocks.Sources.RealExpression productionRate(y=2)   annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-112,264})));
    TemperatureControl.TC tc_TemperaturControl(
      limitBebot=60,
      limitTank=80,
      periodRobotTemperature=0.01,
      periodTankTemperature=0.1)
      annotation (Placement(transformation(extent={{-114,-84},{-52,-30}})));
    CentralControl.Central central_MainControl
      annotation (Placement(transformation(extent={{-2,-78},{156,6}})));

    RobotControl.RobotControl rc_RobotControl(
    redeclare RealTimeCoordinationLibrary.RealTimeCoordination.Transition
    T10(use_syncReceive=true, numberOfSyncReceive= 4),
    redeclare
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        Robot_Order[4](
      redeclare Integer integers[1] "integers[1]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]"),
    redeclare
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
      Robot_Success[4](
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]"),
    redeclare
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
      Robot_Failed[4](
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]"),
      redeclare RobotControl.Master masterOfRobots[4](timeout=5),
      redeclare Modelica.Blocks.Interfaces.RealOutput  robots[ 4,3](start= {{1,0,20},{1,0,20},{1,0,20},{1,0,20}}))
      annotation (Placement(transformation(extent={{62,-208},{208,-110}})));                              //,{1,0,20},{1,0,20},{1,0,20}

    Robot.Robot physicalRobots[4](                             each ystart=0, ID = {1,2,3,4},
      xstart={0,-0.12,-0.24,-0.36})
                               annotation (Placement(transformation(extent={{166,
              -348},{92,-310}})));

    inner Modelica.Mechanics.MultiBody.World world(label2="z", n={0,0,-1})
      annotation (Placement(transformation(extent={{-308,180},{-274,214}})));

    Robot.distance distancesBetweenRobots[4,4] annotation (Placement(transformation(
          extent={{-21,-26},{21,26}},
          rotation=270,
          origin={-87,-296})));
    Sink.Sink sink(
      maxLevel=300,
      height=0.5,
      radius=0.2,
      position={0,0.8,-0.5})
      annotation (Placement(transformation(extent={{322,-344},{250,-282}})));
    Modelica.Blocks.Sources.RealExpression realExpression(y=50) annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={376,-246})));
    Tank.Tank tank1(
      startLevel=100,
      maxLevel=120,
      height=0.6,
      radius=0.2,
      position={0.95,0,0})
      annotation (Placement(transformation(extent={{-212,112},{-144,160}})));
    Radiator.Radiator radiator1(position={0.8,0.8,0.2})
      annotation (Placement(transformation(extent={{348,-92},{438,-36}})));
  equation
      /*for i in 1:4 loop
     connect(rc_RobotControl.masterOfRobots[i].Out_Order_Delegation, physicalRobots[i].in_Order);
     connect(rc_RobotControl.masterOfRobots[i].In_DelegationFailed, physicalRobots[i].fail);
     connect(rc_RobotControl.masterOfRobots[i].In_Delegation_Succeded, physicalRobots[i].success);
   end for;*/
     // connect robot color to filling level of Robot
     for i in 1:4 loop
       for j in 1:4 loop
         connect(physicalRobots[i].x,distancesBetweenRobots[i,j].xCoordinate1);
         connect(physicalRobots[i].y,distancesBetweenRobots[i,j].yCoordinate1);
         connect(physicalRobots[j].x,distancesBetweenRobots[i,j].xCoordinate2);
         connect(physicalRobots[j].y,distancesBetweenRobots[i,j].yCoordinate2);

          connect(physicalRobots[i].distancesToRobot[j],distancesBetweenRobots[i,j].distance);

       end for;
     end for;

     for i in 1:4 loop

       connect(physicalRobots[i].red, rc_RobotControl.robots[i,2]);
       connect(physicalRobots[i].green, rc_RobotControl.robots[i,2]);
       connect(physicalRobots[i].blue, rc_RobotControl.robots[i,2]);
       connect(physicalRobots[i].warmth, rc_RobotControl.robots[i,3]);
     end for;

    connect(tc_TemperaturControl.BebotRedeemed, central_MainControl.BebotRedeemed)
      annotation (Line(
        points={{-51.6353,-33.15},{-16.9,-33.15},{-16.9,-13.2},{-2,-13.2}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.BebotViolated, central_MainControl.BebotViolated)
      annotation (Line(
        points={{-51.0882,-46.65},{-16.75,-46.65},{-16.75,-24},{-2,-24}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.TankRedeemed, central_MainControl.TankRedeemed)
      annotation (Line(
        points={{-52,-65.775},{-14,-65.775},{-14,-42.6},{-2,-42.6}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.TankViolated, central_MainControl.TankViolated)
      annotation (Line(
        points={{-51.6353,-80.85},{-16.9,-80.85},{-16.9,-55.2},{-2,-55.2}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(rc_RobotControl.OutFail, central_MainControl.InFail1) annotation (
        Line(
        points={{207.027,-131.438},{207.027,-132},{246,-132},{246,-86},{8.77273,
            -86},{8.77273,-78}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(rc_RobotControl.temperatureOfObservedBebotAtStop3,
      tc_TemperaturControl.bebotSensor) annotation (Line(
        points={{187.073,-210.756},{192,-210.756},{192,-210},{198,-210},{198,
            -392},{-230,-392},{-230,-214},{-214,-214},{-214,-46.425},{-116.371,
            -46.425}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(physicalRobots.fail, rc_RobotControl.Robot_Failed) annotation (Line(
        points={{107.938,-310},{107.938,-276.3},{112.613,-276.3},{112.613,
            -211.063}},
        color={0,0,0},
        smooth=Smooth.None));

    connect(physicalRobots.in_Order, rc_RobotControl.Robot_Order) annotation (
        Line(
        points={{91.7154,-318.718},{32,-318.718},{32,-242},{52,-242},{52,
            -190.85},{62,-190.85}},
        color={0,0,0},
        smooth=Smooth.None));

    connect(physicalRobots.success, rc_RobotControl.Robot_Success) annotation (
        Line(
        points={{122.454,-310.224},{122.454,-245.1},{74.6533,-245.1},{74.6533,
            -207.387}},
        color={0,0,0},
        smooth=Smooth.None));

    connect(central_MainControl.InDone1, rc_RobotControl.OutDone) annotation (
        Line(
        points={{30.3182,-78},{8,-78},{8,-100},{222,-100},{222,-115.513},{
            208.973,-115.513}},
        color={0,0,0},
        smooth=Smooth.None));

    connect(rc_RobotControl.InOrder, central_MainControl.OutOrder1) annotation (
        Line(
        points={{62,-121.638},{20,-121.638},{20,-77.4},{64.0727,-77.4}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(bc_BottlingControl.OutDone, central_MainControl.InDone) annotation (
        Line(
        points={{-46.88,35.2},{-46.88,22.83},{25.2909,22.83},{25.2909,5.4}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(central_MainControl.InFail, bc_BottlingControl.outFail) annotation (
        Line(
        points={{46.8364,5.4},{50,5.4},{50,96},{-64,96},{-64,58.72},{-46,58.72}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(bc_BottlingControl.inOrder, central_MainControl.OutOrder) annotation (
       Line(
        points={{43.76,35.2},{43.76,52.34},{66.9455,52.34},{66.9455,5.4}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(sink.frame_a, world.frame_b) annotation (Line(
        points={{322.72,-312.38},{486.64,-312.38},{486.64,197},{-274,197}},
        color={95,95,95},
        thickness=0.5,
        smooth=Smooth.None));
    connect(rc_RobotControl.outFlowRobot, sink.inFlow) annotation (Line(
        points={{219.68,-164.512},{262.6,-164.512},{262.6,-282},{270.88,-282}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(realExpression.y, sink.warmth) annotation (Line(
        points={{376,-257},{374,-257},{374,-279.52},{293.2,-279.52}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tank1.currentFillingLevelOfTank, bc_BottlingControl.fluidSensorOfTank)
      annotation (Line(
        points={{-155.56,109.6},{-155.56,86},{-32.36,86},{-32.36,78.16}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tank1.currentTemperatureOfTank, tc_TemperaturControl.tankSensor)
      annotation (Line(
        points={{-175.28,110.08},{-175.28,-68.4},{-115.824,-68.4},{-115.824,
            -69.15}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tank1.exactOutFlow, rc_RobotControl.inFlow) annotation (Line(
        points={{-216.76,149.44},{-233.7,149.44},{-233.7,-159.613},{58.1067,
            -159.613}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tank1.frame_a, world.frame_b) annotation (Line(
        points={{-212,124.96},{-212,128},{-246,128},{-246,197},{-274,197}},
        color={95,95,95},
        thickness=0.5,
        smooth=Smooth.None));
    connect(productionRate.y, tank1.inFlow) annotation (Line(
        points={{-112,253},{-180,253},{-180,161.44},{-175.28,161.44}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(radiator1.y, rc_RobotControl.coolingRate) annotation (Line(
        points={{393.45,-94.52},{393.45,-147.45},{209.947,-147.45},{209.947,
            -146.137}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(radiator1.frame_a, world.frame_b) annotation (Line(
        points={{348,-59.52},{324,-59.52},{324,197},{-274,197}},
        color={95,95,95},
        thickness=0.5,
        smooth=Smooth.None));
    connect(central_MainControl.coolerOn, radiator1.on) annotation (Line(
        points={{156.718,-46.8},{156.718,-2},{395.7,-2},{395.7,-34.88}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(tank1.outwardFlow, bc_BottlingControl.outFlowTank) annotation (Line(
        points={{-155.56,161.44},{14.22,161.44},{14.22,80.32},{12.08,80.32}},
        color={0,0,127},
        smooth=Smooth.None));
    annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-200,
              -400},{460,100}}),                                                                     graphics), Icon(
          coordinateSystem(extent={{-200,-400},{460,100}})),
      experiment(StopTime=30),
      __Dymola_experimentSetupOutput);
  end System;

  model IntegratorBlock

    Real y;
    Real z(start=0);

     Boolean first(start=true);
    Modelica.Blocks.Interfaces.RealInput x annotation (Placement(transformation(
          extent={{-20,-20},{20,20}},
          rotation=270,
          origin={-4,106})));
    Modelica.Blocks.Interfaces.RealOutput out annotation (Placement(
          transformation(
          extent={{-23,-23},{23,23}},
          rotation=270,
          origin={1,-101})));

  algorithm
     der(y) := x;
    when x > 0 then
      if (not first) then
        z:= y;
      end if;
      first:=false;
    end when;
    if x>0 then
      out:= y-z;
    else
      out := 0;
    end if;
     annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
              -100},{100,100}}), graphics),
      experiment(StopTime=8),
      __Dymola_experimentSetupOutput);
  end IntegratorBlock;

  package CentralControl
    model TemperatureObserver
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Limit_Observation.Observer(      In_LimitViolated(
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]",
          redeclare Integer integers[0] "integers[0]"),
                                               In_LimitRedeemed(
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]",
          redeclare Integer integers[0] "integers[0]"));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-140,
                -100},{120,100}}),                                                                     graphics));
    end TemperatureObserver;

    model MasterBottlingControl
    parameter Real timeout;
      RealTimeCoordinationLibrary.RealTimeCoordination.Step
                                       Inactive(
        initialStep=true,
        nIn=3,
        nOut=1)
               annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-76,64})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step
                                       Waiting(nIn=1, nOut=3,
        use_activePort=true)
        annotation (Placement(transformation(extent={{50,60},{42,68}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T1(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        use_syncReceive=false)                                     annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-8,80})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T2(use_after=true, afterTime=
            timeout,
        condition=false)                        annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-14,50})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T3(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_syncSend=true,
        numberOfSyncSend=1)         annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-14,28})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T4(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_syncSend=true,
        numberOfSyncSend=1)         annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-14,10})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Message
                                          message(nIn=1, numberOfMessageReals=1)
        annotation (Placement(transformation(extent={{58,84},{78,104}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        Out_Order_Delegation(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]")
        annotation (Placement(transformation(extent={{88,82},{108,102}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox
                                          mailbox(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{-80,-28},{-60,-8}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox
                                          mailbox1(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{-78,-66},{-58,-46}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        In_DelegationFailed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-112,-30},{-92,-10}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        In_Delegation_Succeded(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-112,-66},{-92,-46}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock
                                                     clock(nu=1) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={-20,108})));
      RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
        timeInvariantLessOrEqual(bound=timeout)
        annotation (Placement(transformation(extent={{-82,86},{-62,106}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.receiver
        startBottling
        annotation (Placement(transformation(extent={{90,24},{110,44}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.sender
        Done annotation (Placement(transformation(extent={{-14,-112},{6,-92}})));
      Modelica.Blocks.Interfaces.RealInput amountOfJuice annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=90,
            origin={44,-98})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(
          use_syncReceive=true, numberOfSyncReceive=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-56,70})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step step1(nIn=1, nOut=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-34,68})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.sender
        sender annotation (Placement(transformation(extent={{86,-42},{106,-22}})));
    equation
      connect(T1.outPort, Waiting.inPort[1]) annotation (Line(
          points={{-3,80},{32,80},{32,68},{46,68}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[1], T2.inPort) annotation (Line(
          points={{47.3333,59.4},{40,59.4},{40,50},{-10,50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[2], T3.inPort) annotation (Line(
          points={{46,59.4},{46,28},{-10,28}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[3], T4.inPort) annotation (Line(
          points={{44.6667,59.4},{50,59.4},{50,10},{-10,10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, Inactive.inPort[1]) annotation (Line(
          points={{-19,50},{-92,50},{-92,62.6667},{-80,62.6667}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, Inactive.inPort[2]) annotation (Line(
          points={{-19,28},{-94,28},{-94,64},{-80,64}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, Inactive.inPort[3]) annotation (Line(
          points={{-19,10},{-96,10},{-96,65.3333},{-80,65.3333}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(message.message_output_port, Out_Order_Delegation) annotation (Line(
          points={{77,93},{95.5,93},{95.5,92},{98,92}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.firePort, message.conditionPort[1]) annotation (Line(
          points={{-8,84.2},{24,84.2},{24,84.4},{56,84.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(In_DelegationFailed, mailbox.mailbox_input_port[1]) annotation (Line(
          points={{-102,-20},{-90.5,-20},{-90.5,-19},{-79,-19}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(In_Delegation_Succeded, mailbox1.mailbox_input_port[1]) annotation (
          Line(
          points={{-102,-56},{-89,-56},{-89,-57},{-77,-57}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(mailbox.mailbox_output_port[1], T3.transition_input_port[1])
        annotation (Line(
          points={{-61,-19},{-61,36.5},{-11.88,36.5},{-11.88,32.9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(mailbox1.mailbox_output_port[1], T4.transition_input_port[1])
        annotation (Line(
          points={{-59,-57},{20,-58},{20,14.9},{-11.88,14.9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.firePort, clock.u[1]) annotation (Line(
          points={{-8,84.2},{0,84.2},{0,108},{-9.9,108}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(clock.y, timeInvariantLessOrEqual.clockValue) annotation (Line(
          points={{-31,108},{-98,108},{-98,99.6},{-83.5,99.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(Waiting.activePort, timeInvariantLessOrEqual.conditionPort)
        annotation (Line(
          points={{41.28,64},{36,64},{36,114},{-100,114},{-100,92},{-83.2,
              92.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T4.sender[1], Done) annotation (Line(
          points={{-9.94,7.4},{-5.97,7.4},{-5.97,-102},{-4,-102}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(amountOfJuice, message.u_reals[1]) annotation (Line(
          points={{44,-98},{56,-98},{56,94},{57,94}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(T5.outPort, step1.inPort[1]) annotation (Line(
          points={{-51,70},{-50,70},{-50,68},{-38,68}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.inPort, Inactive.outPort[1]) annotation (Line(
          points={{-60,70},{-64,70},{-64,64},{-71.4,64}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{-29.4,68},{-27.7,68},{-27.7,80},{-12,80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.receiver[1], startBottling) annotation (Line(
          points={{-60.02,67.18},{19.99,67.18},{19.99,34},{100,34}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T3.sender[1], sender) annotation (Line(
          points={{-9.94,25.4},{12,25.4},{12,26},{34,26},{34,-32},{96,-32}},
          color={255,128,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),
                          graphics), Documentation(info="<!DOCTYPE html>
<html>
<head><title>RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation.Delegation_Master</title></head>
<body>
<h3> Delegation_Master </h3>
<p>This class implements the behavior of the role Delegation_Master in the &quot;Fail-Operational Delegation&quot; pattern. The master component wants to delegate a task to the slave component, being responsible for executing the task. The slave component can report the task execuition with either &quot;done&quot; or &quot;fail&quot;, informing the master wether the delegation was successful or not. More information concerning the pattern can be found &quot;<a href=\"modelica://RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation\">here</a>&quot; The corresponding Realtime Statechart is shown in the following figure: </p>
<p><img src=\"images/Fail_Operational_Delegation/RTS_Fail-OperationalDelegation_Master.jpg\" alt =\"\"/> </p>
<p><small>Figure 1: Realtimestatechart, showing the behavior of the master role </small></p>
<p>The master has a parameter &quot;timeout&quot;, specifying the time that the master waits for a reply of the slave (which can be either &quot;fail&quot; or &quot;done&quot; in case of a failure or a success resp.). </p>
<p><img src=\"images/Fail_Operational_Delegation/Parameters_Master.jpg\" alt = \"\"/> </p>
<p><small>Figure 2: Realtimestatechart, showing the parameters of the master role </small></p>
</body>
</html>
"));
    end MasterBottlingControl;

    model Central

      TemperatureObserver temperatureObserverBebot annotation (Placement(transformation(
            extent={{-29,-18},{29,18}},
            rotation=90,
            origin={-51,58})));
      TemperatureObserver temperatureObserverTank annotation (Placement(transformation(
            extent={{29,-21},{-29,21}},
            rotation=270,
            origin={-31,-51})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            BebotViolated(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-110,30},{-90,50}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            TankViolated(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-110,-74},{-90,-54}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            BebotRedeemed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-110,66},{-90,86}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            TankRedeemed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-110,-32},{-90,-12}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InFail(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{26,128},
                {46,148}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InDone(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-34,128},
                {-14,148}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             OutOrder(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]") annotation (Placement(transformation(extent={{82,128},
                {102,148}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InFail1(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-80,-150},{-60,-130}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InDone1(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-20,-150},{0,-130}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             OutOrder1(
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]",
        redeclare Integer integers[3] "integers[3]")
                                            annotation (Placement(transformation(extent={{74,-148},{94,-128}})));

     //Real robots[ 4,2] = {{1,0},{1,0},{1,0},{1,0}};

     Integer stepcounter(start=0);

      Integer from(start=0);
      Integer to(start=0);
      Integer order(start=0);
      Modelica.Blocks.Sources.IntegerExpression fromexpr(y=from) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=90,
            origin={74,-108})));
      Modelica.Blocks.Sources.IntegerExpression toexpr(y=to) annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=90,
            origin={88,-108})));
      Modelica.Blocks.Sources.IntegerExpression orderexpr(y=order) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=90,
            origin={102,-108})));
      Modelica.Blocks.Interfaces.RealOutput amountOfJuice annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={132,8})));

      MasterRobots masterRobots(timeout=10) annotation (Placement(
            transformation(
            extent={{-45,-30},{45,30}},
            rotation=0,
            origin={61,-48})));
      MasterBottlingControl masterBottlingControl(timeout=10)
        annotation (Placement(transformation(extent={{28,18},{92,68}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(
        condition=not temperatureObserverBebot.LimitViolated.active,
        use_after=true,
        afterTime=0.001)
        annotation (Placement(transformation(extent={{204,0},{212,8}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T2(use_syncSend=true, numberOfSyncSend=1,
        condition=not (from == 2 and to == 2))
        annotation (Placement(transformation(extent={{226,-58},{234,-50}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step ChooseNewTarget(nIn=1,
          nOut=2)
        annotation (Placement(transformation(extent={{232,-20},{240,-12}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Initial(
        initialStep=true,
        nOut=3,
        nIn=6) annotation (Placement(transformation(extent={{194,60},{214,80}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step MoveRobot(nIn=1, nOut=2)
        annotation (Placement(transformation(extent={{234,-88},{242,-80}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Success(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{216,-148},{224,-140}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Blocked(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{290,-140},{298,-132}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T3(
          use_syncReceive=true, numberOfSyncReceive=1)
        annotation (Placement(transformation(extent={{218,-118},{226,-110}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T4(
          use_syncReceive=true, numberOfSyncReceive=1)
        annotation (Placement(transformation(extent={{282,-114},{290,-106}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(
          use_syncReceive=true, numberOfSyncReceive=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={288,88})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(use_syncSend=true,
          numberOfSyncSend=1)                                        annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={308,26})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step startBottling(nIn=1,
          nOut=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={262,46})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Bottling(       nOut=2, nIn=2)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={350,66})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(use_syncSend=true,
          numberOfSyncSend=1,
        condition=from == 2 and to == 2)
                              annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={242,24})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(
          use_syncReceive=true, numberOfSyncReceive=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={270,106})));
      Modelica.Blocks.Interfaces.BooleanOutput coolerOn
        annotation (Placement(transformation(extent={{318,-60},{366,-12}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step CoolDownRobot(
        nIn=1,
        use_activePort=true,
        nOut=1) annotation (Placement(transformation(extent={{132,74},{140,82}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T9(condition=
            temperatureObserverBebot.LimitViolated.active,
        use_after=true,
        afterTime=0.001,
        use_syncReceive=false,
        use_syncSend=false)                                annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={160,72})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T10(condition=
            not temperatureObserverBebot.LimitViolated.active) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={114,90})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step step1(nOut=1, nIn=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={172,132})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T11(condition=
            temperatureObserverTank.LimitViolated.active,
        use_after=true,
        afterTime=0.001)                                  annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={142,118})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T12(condition=
            not temperatureObserverTank.LimitViolated.active)
        annotation (Placement(transformation(extent={{194,118},{202,126}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T13(use_after=true,
          afterTime=0.01)                                             annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={282,-8})));

       Integer stepNotSolved;
       Boolean wasBlocked(start= false);
       Integer result[3];
       Boolean wasSuccessful(start = false);
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T14 annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={372,-56})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step InformRobot(nOut=2, nIn=
           1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={342,16})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T15(
          use_syncReceive=true, numberOfSyncReceive=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={352,40})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T17(
          use_syncReceive=true, numberOfSyncReceive=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={364,18})));
    algorithm

        when ChooseNewTarget.active then

        stepcounter:= stepcounter +1; // every turn increase the counter
        // try to unsolve blocking of robot!
        if  wasBlocked and wasSuccessful then
          result:= deriveNewTarget(stepNotSolved);
          stepcounter := stepcounter -1;
          wasBlocked := false;
        else
          result :=deriveNewTarget(stepcounter);
        end if;

        from :=result[1];
        to :=result[2];
        order :=result[3];

      end when;

      when Success.active then
        wasSuccessful := true;
      end when;

      when Blocked.active then
        stepNotSolved := stepcounter;
        wasBlocked := true;
        wasSuccessful := false;
      end when;

      amountOfJuice := 50;

    equation

      //connect(T3.);
      connect(TankViolated, temperatureObserverTank.In_LimitViolated) annotation (Line(
          points={{-100,-64},{-66,-64},{-66,-88},{-26,-88},{-26,-82.6769},{
              -26.0908,-82.6769}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(temperatureObserverTank.In_LimitRedeemed, TankRedeemed) annotation (Line(
          points={{-26.5108,-24.2308},{-25,-24.2308},{-25,-22},{-100,-22}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(temperatureObserverBebot.In_LimitRedeemed, BebotRedeemed) annotation (Line(
          points={{-54.5292,84.7692},{-58,84.7692},{-58,76},{-100,76}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(temperatureObserverBebot.In_LimitViolated, BebotViolated) annotation (Line(
          points={{-54.8892,26.3231},{-54.2231,26.3231},{-54.2231,40},{-100,40}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(masterRobots.Out_Order_Delegation, OutOrder1) annotation (Line(
          points={{105.182,-30},{105.182,-119.24},{84,-119.24},{84,-138}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InFail1, masterRobots.In_DelegationFailed) annotation (Line(
          points={{-70,-140},{-68,-140},{-68,-58},{23.3636,-58}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(masterRobots.In_Delegation_Succeded, InDone1) annotation (Line(
          points={{23.3636,-67},{29.96,-67},{29.96,-140},{-10,-140}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(orderexpr.y, masterRobots.order) annotation (Line(
          points={{102,-97},{102,-81.75},{112.955,-81.75}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(toexpr.y, masterRobots.to) annotation (Line(
          points={{88,-97},{87.5909,-97},{87.5909,-82.25}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(fromexpr.y, masterRobots.from) annotation (Line(
          points={{74,-97},{74,-75.5},{63.8636,-75.5},{63.8636,-82.75}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(amountOfJuice, masterBottlingControl.amountOfJuice) annotation (Line(
          points={{132,8},{132,1},{74.08,1},{74.08,18.5}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(OutOrder, masterBottlingControl.Out_Order_Delegation) annotation (
          Line(
          points={{92,138},{92,82},{91.36,82},{91.36,66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(masterBottlingControl.In_DelegationFailed, InFail) annotation (Line(
          points={{27.36,38},{20,38},{20,138},{36,138}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(masterBottlingControl.In_Delegation_Succeded, InDone) annotation (
          Line(
          points={{27.36,29},{27.36,28.5},{-24,28.5},{-24,138}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Initial.outPort[1], T1.inPort) annotation (Line(
          points={{200.667,58.5},{204,58.5},{204,8},{208,8}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, ChooseNewTarget.inPort[1]) annotation (Line(
          points={{208,-1},{228,-1},{228,-12},{236,-12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(ChooseNewTarget.outPort[1], T2.inPort) annotation (Line(
          points={{235,-20.6},{246,-20.6},{246,-50},{230,-50}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(T2.outPort, MoveRobot.inPort[1]) annotation (Line(
          points={{230,-59},{230,-80},{238,-80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, Success.inPort[1]) annotation (Line(
          points={{222,-119},{220,-119},{220,-140}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(MoveRobot.outPort[1], T4.inPort) annotation (Line(
          points={{237,-88.6},{266,-88.6},{266,-100},{286,-100},{286,-106}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, Blocked.inPort[1]) annotation (Line(
          points={{286,-115},{286,-122},{294,-122},{294,-132}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Bottling.outPort[1], T5.inPort) annotation (Line(
          points={{351,70.6},{351,88},{292,88}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, Initial.inPort[1]) annotation (Line(
          points={{283,88},{238,88},{238,80},{199.833,80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.sender[1], masterBottlingControl.startBottling) annotation (Line(
          points={{237.94,26.6},{188.97,26.6},{188.97,51.5},{92,51.5}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T5.receiver[1], masterBottlingControl.sender) annotation (Line(
          points={{292.02,90.82},{316.01,90.82},{316.01,35},{90.72,35}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(Bottling.outPort[2], T8.inPort) annotation (Line(
          points={{349,70.6},{349,134.3},{274,134.3},{274,106}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T8.outPort, Initial.inPort[2]) annotation (Line(
          points={{265,106},{228.5,106},{228.5,80},{201.5,80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T8.receiver[1], masterBottlingControl.Done) annotation (Line(
          points={{274.02,108.82},{166.01,108.82},{166.01,17.5},{58.72,17.5}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(Initial.outPort[2], T9.inPort) annotation (Line(
          points={{204,58.5},{202,58.5},{202,58},{200,58},{200,56},{180,56},{180,72},
              {164,72}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T9.outPort, CoolDownRobot.inPort[1]) annotation (Line(
          points={{155,72},{144,72},{144,82},{136,82}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CoolDownRobot.activePort, coolerOn) annotation (Line(
          points={{140.72,78},{152,78},{152,-36},{342,-36}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T10.outPort, Initial.inPort[3]) annotation (Line(
          points={{114,95},{210,95},{210,80},{203.167,80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T10.inPort, CoolDownRobot.outPort[1]) annotation (Line(
          points={{114,86},{114,73.4},{136,73.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T12.outPort, Initial.inPort[4]) annotation (Line(
          points={{198,117},{198,80},{204.833,80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T12.inPort) annotation (Line(
          points={{176.6,132},{188,132},{188,126},{198,126}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T11.outPort, step1.inPort[1]) annotation (Line(
          points={{142,123},{156,123},{156,132},{168,132}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T11.inPort, Initial.outPort[3]) annotation (Line(
          points={{142,114},{102,114},{102,44},{208,44},{208,56.5},{207.333,
              56.5},{207.333,58.5}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Success.outPort[1], T13.inPort) annotation (Line(
          points={{220,-148.6},{252,-148.6},{252,-12},{282,-12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T13.outPort, Initial.inPort[5]) annotation (Line(
          points={{282,-3},{282,100.5},{206.5,100.5},{206.5,80}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(masterRobots.T4.sender[1], T3.receiver[1]) annotation (Line(
          points={{106.818,-51},{162.409,-51},{162.409,-109.98},{219.18,-109.98}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(masterRobots.T3.sender[1], T4.receiver[1]) annotation (Line(
          points={{68.3636,-18},{176,-18},{176,-105.98},{283.18,-105.98}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(masterRobots.T1.receiver[1], T2.sender[1]) annotation (Line(
          points={{16,-33.5},{126,-33.5},{126,-49.94},{232.6,-49.94}},
          color={255,128,0},
          smooth=Smooth.None));
       connect(T6.sender[1], masterRobots.T1.receiver[2]) annotation (Line(
          points={{303.94,28.6},{156.97,28.6},{156.97,-33.5},{16,-33.5}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T15.receiver[1], masterRobots.T3.sender[2]) annotation (Line(
          points={{354.82,35.98},{211.41,35.98},{211.41,-18},{68.3636,-18}},
          color={255,128,0},
          smooth=Smooth.None));
         connect(T17.receiver[1], masterRobots.T4.sender[2]) annotation (Line(
          points={{366.82,13.98},{365.41,13.98},{365.41,-51},{106.818,-51}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(MoveRobot.outPort[2], T3.inPort) annotation (Line(
          points={{239,-88.6},{230,-88.6},{230,-110},{222,-110}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Blocked.outPort[1], T14.inPort) annotation (Line(
          points={{294,-140.6},{316,-140.6},{316,-60},{372,-60}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T14.outPort, Initial.inPort[6]) annotation (Line(
          points={{372,-51},{372,159.5},{208.167,159.5},{208.167,80}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InformRobot.outPort[1], T15.inPort) annotation (Line(
          points={{346.6,15},{350,15},{350,36},{352,36}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T15.outPort, Bottling.inPort[1]) annotation (Line(
          points={{352,45},{352,62},{351,62}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(ChooseNewTarget.outPort[2], T7.inPort) annotation (Line(
          points={{237,-20.6},{237,-10},{238,-10},{238,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.outPort, startBottling.inPort[1]) annotation (Line(
          points={{247,24},{252,24},{252,46},{258,46}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(startBottling.outPort[1], T6.inPort) annotation (Line(
          points={{266.6,46},{286,46},{286,26},{304,26}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, InformRobot.inPort[1]) annotation (Line(
          points={{313,26},{325.5,26},{325.5,16},{338,16}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(InformRobot.outPort[2], T17.inPort) annotation (Line(
          points={{346.6,17},{356,17},{356,14},{364,14}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T17.outPort, Bottling.inPort[2]) annotation (Line(
          points={{364,23},{358,23},{358,62},{349,62}},
          color={0,0,0},
          smooth=Smooth.None));

      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -140},{340,140}}),                                                                     graphics), Icon(
            coordinateSystem(extent={{-100,-140},{340,140}})));
    end Central;

    function deriveNewTarget
      extends Modelica.Icons.Function;
      input Integer step "First scalar";

      output Integer result[3];

      Integer orders[12,3] = {{1,2,0},{1,2,0},{2,2,50},{2,3,0},{2,2,50},{3,4,0},{2,3,0},{4,4,0},{4,1,0},{3,4,0},{4,4,0},
     {4,1,0}};

    algorithm
      result[1] :=orders[step,1];
      result[2] :=orders[step,2];
      result[3] :=orders[step,3];
      /*
   if stepcounter == 1 then // send a robot from stop 1 to 2
     from := 1;
     to := 2;
    elseif stepcounter == 2 then // send a second robot from stop 1 to 2
     from := 1;
     to := 2;
    elseif stepcounter == 3 then // fill first robot
     from := 2;
     to := 2;
     order:= 50;
     //startBottling:= true;
    //elseif fSMasterBottlingControl.Idle.active then

      elseif stepcounter == 4 then // go from 2 to 3
       from := 2;
       to := 3;
      // startBottling:= false;
      elseif stepcounter == 5 then // go from 3 to 4
        from := 3;
       to := 4;
     elseif stepcounter == 6 then  // unload robot 1
       from := 4;
       to := 4;
      elseif stepcounter == 7 then // go back to stop 4
       from := 4;
       to := 1;
      elseif stepcounter == 8 then // fill second robot
       from := 2;
       to := 2;
       order:= 60;
       //startBottling:= true;
      elseif stepcounter == 9 then // 2. robot from 2 to 3
       from := 2;
       to := 3;
       //startBottling:= false;
       elseif stepcounter == 10 then // 2. robot from 3 to 4
       from := 3;
       to := 4;
     elseif stepcounter == 11 then // unload robot 2
       from := 4;
       to := 4;
      elseif stepcounter == 12 then // 2. robot from 4 to 1
       from := 4;
       to := 1;
       else
       //start:=false; // stop robots after 7 steps
       end if;*/
           /* when temperatureObserverBebot.LimitViolated.active then
      coolerOn := true;
     // start:= false;
  end when;
   when temperatureObserverBebot.LimitRedeemed.active then
      coolerOn := false;
     // start:= true;
   end when;*/

       /*
  when fSMasterRobots.Idle.active and not temperatureObserverBebot.LimitViolated.active then
    stepcounter:= stepcounter +1; // every turn increase the counter
    if stepcounter == 1 then // send a robot from stop 1 to 2
     from := 1;
     to := 2;
    elseif stepcounter == 2 then // send a second robot from stop 1 to 2
     from := 1;
     to := 2;
    elseif stepcounter == 3 then // fill first robot
     from := 2;
     to := 2;
     order:= 50;
     startBottling:= true;
    //elseif fSMasterBottlingControl.Idle.active then

      if stepcounter == 4 then // go from 2 to 3
       from := 2;
       to := 3;
       startBottling:= false;
      elseif stepcounter == 5 then // cool robot
       from := 3;
       to := 3;
        elseif stepcounter == 6 then // go from 3 to 4
        from := 3;
       to := 4;
        elseif stepcounter == 7 then  // unload robot
       from := 4;
       to := 4;
      elseif stepcounter == 8 then // go back to stop 4
       from := 4;
       to := 1;
      elseif stepcounter == 9 then // fill second robot
       from := 2;
       to := 2;
       order:= 60;
       startBottling:= true;
      elseif stepcounter == 10 then // 2. robot from 2 to 3
       from := 2;
       to := 3;
       startBottling:= false;
       elseif stepcounter == 12 then // 2. robot from 3 to 4
       from := 3;
       to := 4;
        elseif stepcounter == 13 then // 2. robot from 2 to 3
       from := 4;
       to := 1;
       else
       start:=false; // stop robots after 7 steps
       end if;
    end if;

  end when;
   */
    end deriveNewTarget;

    model MasterRobots
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation.Delegation_Master(
        message(numberOfMessageIntegers=3),
        In_Delegation_Succeded(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        In_DelegationFailed(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Order_Delegation(
          redeclare Integer integers[3] "integers[3]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        T3(use_syncSend=true, numberOfSyncSend=2),
        T4(use_syncSend=true,numberOfSyncSend=2),
        T1(use_syncReceive=true,numberOfSyncReceive=2),
        T2(condition=false));
      Modelica.Blocks.Interfaces.IntegerInput from annotation (Placement(
            transformation(
            extent={{-39,-39},{39,39}},
            rotation=90,
            origin={-3,-119})));
      Modelica.Blocks.Interfaces.IntegerInput to annotation (Placement(
            transformation(
            extent={{-39,-39},{39,39}},
            rotation=90,
            origin={55,-117})));
      Modelica.Blocks.Interfaces.IntegerInput order annotation (Placement(
            transformation(
            extent={{-39,-39},{39,39}},
            rotation=90,
            origin={117,-115})));
    equation
      connect(from, message.u_integers[1]) annotation (Line(
          points={{-3,-119},{-3,-54.5},{57,-54.5},{57,103.2}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(to, message.u_integers[2]) annotation (Line(
          points={{55,-117},{55,-6.5},{57,-6.5},{57,103.2}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(order, message.u_integers[3]) annotation (Line(
          points={{117,-115},{117,-46.5},{57,-46.5},{57,103.2}},
          color={255,127,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-120,
                -100},{100,140}}),      graphics), Icon(coordinateSystem(extent=
               {{-120,-100},{100,140}})));
    end MasterRobots;

  end CentralControl;

  package TemperatureControl
    model TC
      parameter Real limitBebot;
      parameter Real limitTank;
      parameter Real periodRobotTemperature;
      parameter Real periodTankTemperature;
      DataProcessing dataProcessing_Robot(p_period=periodRobotTemperature)
        annotation (Placement(transformation(extent={{-54,42},{2,76}})));
      DataProcessing dataProcessing_Tank(p_period=periodTankTemperature)
        annotation (Placement(transformation(extent={{-48,-40},{10,0}})));
      Modelica.Blocks.Interfaces.RealInput bebotSensor annotation (Placement(transformation(extent={{-150,30},{-76,104}})));
      Modelica.Blocks.Interfaces.RealInput tankSensor annotation (Placement(transformation(extent={{-146,-70},{-74,2}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             BebotRedeemed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{216,106},{268,146}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             BebotViolated(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{222,48},{268,84}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             TankRedeemed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{218,-36},{262,-2}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             TankViolated(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{218,-102},{266,-70}})));
      LimitControl limitControl_Tank(limit=limitTank)
        annotation (Placement(transformation(extent={{66,-42},{116,-8}})));
      LimitControl limitControl_Robot(limit=limitBebot)
        annotation (Placement(transformation(extent={{62,46},{118,84}})));
    equation
      connect(dataProcessing_Tank.sensorData, tankSensor) annotation (Line(
          points={{-47.42,-4.4},{-76.77,-4.4},{-76.77,-34},{-110,-34}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(bebotSensor, dataProcessing_Robot.sensorData) annotation (Line(
          points={{-113,67},{-77,67},{-77,72.26},{-53.44,72.26}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(dataProcessing_Robot.outputDelegationPort, limitControl_Robot.sensorData)
        annotation (Line(
          points={{1.44,65.46},{25.83,65.46},{25.83,65.38},{62.56,65.38}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(dataProcessing_Tank.outputDelegationPort, limitControl_Tank.sensorData)
        annotation (Line(
          points={{9.42,-12.4},{27.77,-12.4},{27.77,-24.66},{66.5,-24.66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(limitControl_Tank.limit_Redeemed, TankRedeemed) annotation (Line(
          points={{115.5,-13.44},{168.77,-13.44},{168.77,-19},{240,-19}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(limitControl_Tank.limit_Violated, TankViolated) annotation (Line(
          points={{116,-28.06},{180,-28.06},{180,-86},{242,-86}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(limitControl_Robot.limit_Violated, BebotViolated) annotation (
          Line(
          points={{118,61.58},{171,61.58},{171,66},{245,66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(limitControl_Robot.limit_Redeemed, BebotRedeemed) annotation (
          Line(
          points={{117.44,77.92},{170.81,77.92},{170.81,126},{242,126}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (
        Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,-100},
                {240,140}}), graphics),
        experiment(StopTime=4),
        __Dymola_experimentSetupOutput,
        Icon(coordinateSystem(extent={{-100,-100},{240,140}})));
    end TC;

    model DataProcessing
      parameter Real p_period;
      PTSender pTSender(period=p_period)
        annotation (Placement(transformation(extent={{24,32},{44,52}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        outputDelegationPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]")
        annotation (Placement(transformation(extent={{88,28},{108,48}})));
      Modelica.Blocks.Interfaces.RealInput sensorData
        annotation (Placement(transformation(extent={{-118,58},{-78,98}})));
    equation
      connect(pTSender.Out_Data, outputDelegationPort) annotation (Line(
          points={{44.4,44},{72,44},{72,38},{98,38}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(sensorData, pTSender.u) annotation (Line(
          points={{-98,78},{-32,78},{-32,53.2},{33.2,53.2}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),      graphics));
    end DataProcessing;

    model LimitControl3
      PTReceiver pTReceiver(timeout=0.5)
        annotation (Placement(transformation(extent={{20,28},{40,48}})));
      Modelica.Blocks.Interfaces.RealOutput received annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={28,-102})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        inputDelegationPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]")
        annotation (Placement(transformation(extent={{92,32},{112,52}})));
    equation
      connect(received, pTReceiver.y) annotation (Line(
          points={{28,-102},{28,27.8},{23,27.8}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(pTReceiver.In_Data, inputDelegationPort) annotation (Line(
          points={{40.4,38.8},{72.2,38.8},{72.2,42},{102,42}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),      graphics));
    end LimitControl3;

    model PTSender
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Periodic_Transmission.Sender(
          Out_Data(
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Integer integers[0] "integers[0]",
          redeclare Real reals[1] "reals[1]"), Data_Message(
            numberOfMessageReals=1));
      Modelica.Blocks.Interfaces.RealInput u annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-8,112})));
    equation
      connect(u, Data_Message.u_reals[1]) annotation (Line(
          points={{-8,112},{2,112},{2,22},{21,22}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{
                -100,-100},{100,100}}), graphics));
    end PTSender;

    model PTReceiver
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Periodic_Transmission.Receicer(
        In_Data(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[1] "reals[1]"),
        Mailbox_Data(numberOfMessageIntegers=0, numberOfMessageReals=1),
        T3( numberOfMessageIntegers=0, numberOfMessageReals=1),
        T2( numberOfMessageIntegers=0, numberOfMessageReals=1));
      Modelica.Blocks.Interfaces.RealOutput y annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={-70,-102})));

    equation
         when T2.fire then
           y = T2.transition_input_port[1].reals[1];
         elsewhen T3.fire then
           y = T3.transition_input_port[1].reals[1];
         end when;
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end PTReceiver;

    model TemperatureProvider
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Limit_Observation.Provider(
        Out_LimitRedeemed(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Limit_Violated(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        T3(condition=sensorData <= limit),
        T2(condition=sensorData <= limit),
        T1(condition=sensorData > limit),
        T4(condition=sensorData > limit));
      Modelica.Blocks.Interfaces.RealInput sensorData annotation (Placement(transformation(
            extent={{-37,-37},{37,37}},
            rotation=270,
            origin={-119,173})));
      Modelica.Blocks.Interfaces.RealInput limit annotation (Placement(transformation(
            extent={{-37,-37},{37,37}},
            rotation=270,
            origin={93,169})));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-160,
                -20},{120,160}}),                                                                     graphics));
    end TemperatureProvider;

    model LimitControl
      parameter Real limit;
      LimitControl3 limitControl annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={-46,2})));
      TemperatureProvider temperatureProvider(worktime=3)
                                              annotation (Placement(transformation(
            extent={{-14,-9},{14,9}},
            rotation=90,
            origin={38,31})));
      Modelica.Blocks.Sources.RealExpression temperatureLimit(y=limit)
        annotation (Placement(transformation(extent={{-92,48},{-24,90}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        sensorData(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]")
        annotation (Placement(transformation(extent={{-108,-8},{-88,12}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        limit_Redeemed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{88,58},{108,78}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        limit_Violated(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{90,-28},{110,-8}})));
    equation
      connect(limitControl.received, temperatureProvider.sensorData)
        annotation (Line(
          points={{-48.8,12.2},{-50,12.2},{-50,20},{-14,20},{-14,12.1},{22.7,
              12.1}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(temperatureLimit.y, temperatureProvider.limit) annotation (Line(
          points={{-20.6,69},{-0.3,69},{-0.3,33.3},{23.1,33.3}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(temperatureProvider.Out_Limit_Violated, limit_Violated)
        annotation (Line(
          points={{32.6,7.8},{66.3,7.8},{66.3,-18},{100,-18}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(temperatureProvider.Out_LimitRedeemed, limit_Redeemed)
        annotation (Line(
          points={{33,36},{64,36},{64,68},{98,68}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(limitControl.inputDelegationPort, sensorData) annotation (Line(
          points={{-56.2,-2.2},{-76.1,-2.2},{-76.1,2},{-98,2}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{
                -100,-100},{100,100}}), graphics));
    end LimitControl;
  end TemperatureControl;

  package BottlingControl
    model BottlingControl

      Modelica.Blocks.Interfaces.RealInput fluidSensorOfTank annotation (Placement(transformation(
            extent={{-29,-29},{29,29}},
            rotation=90,
            origin={69,-109})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        inOrder(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]")
        annotation (Placement(transformation(extent={{-114,60},{-94,80}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        OutDone(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{92,60},{112,80}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        outFail(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{90,-38},{110,-18}})));
      Modelica.Blocks.Sources.RealExpression outFlowOfTank(y=if fSDelegation.Working.active
             then 20 else 0)
        annotation (Placement(transformation(
            extent={{-41,19},{41,-19}},
            rotation=0,
            origin={-87,-65})));
      Modelica.Blocks.Interfaces.RealOutput outFlowTank annotation (Placement(transformation(
            extent={{-30,-30},{30,30}},
            rotation=270,
            origin={-32,-118})));

      IntegratorBlock integratorBlock
        annotation (Placement(transformation(extent={{-10,-10},{10,10}},
            rotation=90,
            origin={-18,14})));

      Delegation_Slave fSDelegation(worktime=5)
        annotation (Placement(transformation(extent={{-38,52},{24,82}})));
    equation
      connect(outFlowOfTank.y, outFlowTank) annotation (Line(
          points={{-41.9,-65},{-41.9,-40.5},{-32,-40.5},{-32,-118}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(outFlowOfTank.y, integratorBlock.x) annotation (Line(
          points={{-41.9,-65},{-41.9,14.5},{-28.6,14.5},{-28.6,13.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(integratorBlock.out, fSDelegation.amountGiven) annotation (Line(
          points={{-7.9,14.1},{-7.9,37.05},{-29.32,37.05},{-29.32,50.5}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(fluidSensorOfTank, fSDelegation.fluidSensor) annotation (Line(
          points={{69,-109},{69,-25.5},{7.26,-25.5},{7.26,50.5}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(fSDelegation.Out_Delegation_Succeded, OutDone) annotation (Line(
          points={{24,55.3},{66,55.3},{66,70},{102,70}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSDelegation.Out_Delegation_Failed, outFail) annotation (Line(
          points={{24,66.1},{62,66.1},{62,-28},{100,-28}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSDelegation.In_Order_Delegation, inOrder) annotation (Line(
          points={{-38.62,81.1},{-52.1,81.1},{-52.1,70},{-104,70}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),      graphics));
    end BottlingControl;

    model Delegation_Slave
      parameter Real worktime;
       Real amountOfJuice;
        Real accessableAmountOfJuice;
      RealTimeCoordinationLibrary.RealTimeCoordination.Step
                                       Inactive(
        initialStep=true,
        nOut=1,
        nIn=2) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-66,54})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step
                                       Working(
        nIn=1,
        nOut=2,
        use_activePort=true)
        annotation (Placement(transformation(extent={{28,46},{36,54}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T1(
        use_messageReceive=true,
        numberOfMessageReceive=1,
        use_firePort=true,
        use_after=true,
        afterTime=0.1,
        numberOfMessageReals=1)
                           annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-20,68})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T2(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        condition=accessableAmountOfJuice < amountOfJuice)         annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-18,22})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition
                                             T3(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        condition=amountGiven >= amountOfJuice)                    annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-14,-50})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                        Out_Delegation_Failed(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{90,-16},{110,4}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                        Out_Delegation_Succeded(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{90,-88},{110,-68}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        In_Order_Delegation(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]")
        annotation (Placement(transformation(extent={{-112,84},{-92,104}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Mailbox
                                          mailbox(nIn=1, nOut=1,
        numberOfMessageReals=1)
        annotation (Placement(transformation(extent={{-74,86},{-54,106}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Message
                                          message(nIn=1)
        annotation (Placement(transformation(extent={{-6,-86},{14,-66}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Message
                                          message1(nIn=1)
        annotation (Placement(transformation(extent={{-6,-16},{14,4}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock
                                                     clock(nu=1)
        annotation (Placement(transformation(extent={{14,82},{34,102}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
        timeInvariantLessOrEqual(bound=worktime)
        annotation (Placement(transformation(extent={{62,76},{82,96}})));
      Modelica.Blocks.Interfaces.RealInput amountGiven annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=90,
            origin={-72,-110})));
      Modelica.Blocks.Interfaces.RealInput fluidSensor annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=90,
            origin={46,-110})));
    equation
         when T1.fire then
          amountOfJuice = T1.transition_input_port[1].reals[1];
          accessableAmountOfJuice= fluidSensor;

         end when;

      connect(Inactive.outPort[1], T1.inPort) annotation (Line(
          points={{-61.4,54},{-42,54},{-42,68},{-24,68}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, Working.inPort[1]) annotation (Line(
          points={{-15,68},{10,68},{10,54},{32,54}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Working.outPort[1], T2.inPort) annotation (Line(
          points={{31,45.4},{10,45.4},{10,22},{-14,22}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Working.outPort[2], T3.inPort) annotation (Line(
          points={{33,45.4},{34,45.4},{34,-50},{-10,-50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, Inactive.inPort[1]) annotation (Line(
          points={{-23,22},{-76,22},{-76,53},{-70,53}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, Inactive.inPort[2]) annotation (Line(
          points={{-19,-50},{-82,-50},{-82,55},{-70,55}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(In_Order_Delegation, mailbox.mailbox_input_port[1]) annotation (Line(
          points={{-102,94},{-87.5,94},{-87.5,95},{-73,95}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(mailbox.mailbox_output_port[1], T1.transition_input_port[1])
        annotation (Line(
          points={{-55,95},{-38.5,95},{-38.5,63.1},{-22.12,63.1}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(message.conditionPort[1], T3.firePort) annotation (Line(
          points={{-8,-85.6},{-12,-85.6},{-12,-54.2},{-14,-54.2}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T2.firePort, message1.conditionPort[1]) annotation (Line(
          points={{-18,17.8},{-14,17.8},{-14,-15.6},{-8,-15.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(message1.message_output_port, Out_Delegation_Failed)
                                                                  annotation (Line(
          points={{13,-7},{56.5,-7},{56.5,-6},{100,-6}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(message.message_output_port, Out_Delegation_Succeded)
                                                                  annotation (Line(
          points={{13,-77},{54.5,-77},{54.5,-78},{100,-78}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.firePort, clock.u[1]) annotation (Line(
          points={{-20,72.2},{-4,72.2},{-4,92},{13.9,92}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(clock.y, timeInvariantLessOrEqual.clockValue) annotation (Line(
          points={{35,92},{48,92},{48,89.6},{60.5,89.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(Working.activePort, timeInvariantLessOrEqual.conditionPort)
        annotation (Line(
          points={{36.72,50},{48,50},{48,82.4},{60.8,82.4}},
          color={255,0,255},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),
                          graphics), Documentation(info="<!DOCTYPE html>
<html>
<head><title>RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation.Delegation_Slave</title></head>
<body>
<h3> Delegation_Slave </h3>
<p>This class implements the behavior of the role Delegation_Slave in the &quot;Fail-Operational Delegation&quot; pattern. The master component wants to delegate a task to the slave component, being responsible for executing the task. The slave component can report the task execuition with either &quot;done&quot; or &quot;fail&quot;, informing the master wether the delegation was successful or not. More information concerning the pattern can be found &quot;<a href=\"modelica://RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation\">here</a>&quot; The corresponding Realtime Statechart is shown in the following figure: </p>
<p><img src=\"images/Fail_Operational_Delegation/RTS_Fail-OperationalDelegation_Slave.jpg\" alt =\"\"/> </p>
<p><small>Figure 1: Realtimestatechart, showing the behavior of the slave role </small></p>
<p>The slave has a parameter &quot;worktime&quot;, specifying the maximum amount of time that the slave may use to execute the task. </p>
<p><img src=\"images/Fail_Operational_Delegation/Parameters_Slave.jpg\" alt =\"\"/> </p>
<p><small>Figure 2: Realtimestatechart, showing the parameters of the slave role </small></p>
</body>
</html>"));
    end Delegation_Slave;

  end BottlingControl;

  package RobotControl

    model RobotControl

      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InOrder(
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]",
        redeclare Integer integers[3] "integers[3]")
                                            annotation (Placement(transformation(extent={{-110,52},{-90,72}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             OutDone(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{192,72},
                {212,92}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             OutFail(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{188,20},
                {208,40}})));

        Boolean set;
        Boolean watched;
        Integer to;
        Real temp(start=20);
      Modelica.Blocks.Interfaces.RealOutput temperatureOfObservedBebotAtStop3
        annotation (Placement(transformation(
            extent={{-15,-15},{15,15}},
            rotation=270,
            origin={157,-229})));
      Modelica.Blocks.Sources.RealExpression tempRobot(y=temp) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={156,-168})));
      Modelica.Blocks.Interfaces.RealInput inFlow
        annotation (Placement(transformation(extent={{-128,-82},{-88,-42}})));
      Modelica.Blocks.Interfaces.RealInput coolingRate annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=180,
            origin={204,-18})));
      IntegratorBlock coolDownBlock annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={158,-18})));
      IntegratorBlock amountOfFlowBlock annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=90,
            origin={-50,-62})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Initial(
        initialStep=true,
        nIn=4,
        nOut=1)
               annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={44,-14})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step CheckOrder(       nOut=3, nIn=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={78,-42})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(
        use_after=true,
        afterTime=0.00001,
        use_syncReceive=true,
        numberOfSyncReceive=1)                         annotation (Placement(
            transformation(
            extent={{4,-4},{-4,4}},
            rotation=0,
            origin={46,-26})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step FillRobot(nIn=1, nOut=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={54,-76})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T3(condition=fSD.from
             == 2 and fSD.to == 2)
        annotation (Placement(transformation(extent={{42,-66},{50,-58}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step SendRobotToNextStop(nIn=
           1, nOut=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={4,-76})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T4(condition=not (
            fSD.from == fSD.to))
        annotation (Placement(transformation(extent={{20,-60},{28,-52}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(use_syncSend=true,numberOfSyncSend=1,
        condition=amountOfFlowBlock.out >= fSD.order)                annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={46,-94})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(use_syncSend=true,
          numberOfSyncSend=1)                                        annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={-36,-134})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(condition=fSD.from
             == 4 and fSD.to == 4)
        annotation (Placement(transformation(extent={{106,-58},{114,-50}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step UnloadRobot(nIn=1, nOut=
           1) annotation (Placement(transformation(extent={{108,-78},{116,-70}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T9(use_syncSend=true,numberOfSyncSend=1,
        condition=robots[currentRobot, 2] <= 0)
        annotation (Placement(transformation(extent={{110,-98},{118,-90}})));

      Modelica.Blocks.Sources.IntegerExpression goal(y=to)
        annotation (Placement(transformation(extent={{-92,-132},{-72,-112}})));
       // Boolean moveRobot[4];

      RealTimeCoordinationLibrary.RealTimeCoordination.Step targetReached(nIn=1,
          nOut=1)
        annotation (Placement(transformation(extent={{8,-156},{16,-148}})));

     // replaceable Modelica.Blocks.Interfaces.BooleanOutput  startMoving[4](each start=false);
      replaceable RealTimeCoordinationLibrary.RealTimeCoordination.Transition T10(
          use_syncReceive=true, numberOfSyncReceive= 4)
        annotation (Placement(transformation(extent={{12,-134},{20,-126}})));

      replaceable
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        Robot_Order[4](
        redeclare Integer integers[1] "integers[1]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-110,-174},{-90,-154}})));
      replaceable
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        Robot_Success[4](
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-84,-228},{-64,-208}})));
      replaceable
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        Robot_Failed[4](
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-6,-240},{14,-220}})));
      replaceable Master masterOfRobots[4](each timeout=6)
                               annotation (Placement(transformation(extent={{56,-206},
                {102,-160}})));
     //Station 1: Bahnhof der Robots, 2: Tank, 3: Kühlstraße, 4: Abladestation; 0.5 Schritte um Position zwischen den
        // einzelnen Stationen zu bestimmen
       replaceable Modelica.Blocks.Interfaces.RealOutput  robots[ 4,3](start= {{1,0,20},{1,0,20},{1,0,20},{1,0,20}});//first entry of the array robots determines the stop, the second entry the amount of juice transported by the robot,
         //the third entry determines the temperature of the robot's juice (20 degree as starting value)

         Integer currentRobot(start= 1);
      RealTimeCoordinationLibrary.RealTimeCoordination.Step RobotDetermined(nIn=1,
          nOut=2)
        annotation (Placement(transformation(extent={{8,-114},{16,-106}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T11(
          afterTime=0.0001,
        use_after=false,
        use_syncSend=true,numberOfSyncSend=4,selectorExpression=currentRobot)
        annotation (Placement(transformation(extent={{0,-98},{8,-90}})));

        //size(robots,1)
      Integer ids[4] = {1,2,3,4};
      /*Modelica.Blocks.Sources.IntegerExpression id[4]
    annotation (Placement(transformation(extent={{-10,-10},{10,10}},
        rotation=180,
        origin={140,-130})));*/
    //

      RealTimeCoordinationLibrary.RealTimeCoordination.Step TargetBlocked(nIn=1,
          nOut=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={74,-134})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T12(
          use_syncReceive=true, numberOfSyncReceive=4)
        annotation (Placement(transformation(extent={{40,-130},{48,-122}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T13(
          use_syncSend=true, numberOfSyncSend=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={102,-130})));
      FODelegation_Slave fSD(worktime=10)
        annotation (Placement(transformation(extent={{0,18},{86,70}})));
      Modelica.Blocks.Interfaces.RealOutput outFlowRobot
        annotation (Placement(transformation(extent={{202,-100},{246,-56}})));
    algorithm
        when SendRobotToNextStop.active then
          for from in 1:size(robots,1) loop
            //startMoving[from] :=false;
           to := if fSD.from ==4 then 1 else fSD.from +1;
            if fSD.from == from then
             set := false;
               for i in 1:size(robots,1) loop
                 if robots[i,1] == from and not set then // choose the first robot at stop 'from'
                   set:= true;
                   currentRobot :=i;
                   //robots[currentRobot,1]:= -1; // Robot is at no station
                   //moveRobot[i]:=true;
                  // startMoving[i] := true;
                 end if;
               end for;
            end if;
          end for;
        end when;

        when targetReached.active then
           robots[currentRobot,1]:=to;
        end when;
        /*for i in 1:size(robots,1) loop
      when masterOfRobots[i].T4.fire then
        robots[i,1] :=to;
      end when;
    end for;*/
       /* when not SendRobotToNextStop.active and not RobotDetermined.active then
      for i in 1:size(robots,1) loop
        startMoving[i] := false;
      end for;
    end when;*/
       // if FillRobot.active then
           //for from in 1:size(robots,1) loop
          // to := if fSD.from ==4 then 1 else fSD.from +1;
           // if fSD.from == from then
          if FillRobot.active then
             set := false;
               for i in 1:size(robots,1) loop
                 if robots[i,1] == 2 and not set then // choose the first robot at stop 'from'
                   set:= true;
                   if amountOfFlowBlock.out >0 then
                     robots[i,3]:=80;
                   end if;

                   when sample(0,0.01) then
                     robots[i,2]:=amountOfFlowBlock.out;
                   end when;
                 end if;
               end for;
           end if;
          //end for;
      //  end if;

           if UnloadRobot.active then

             set := false;
               for i in 1:size(robots,1) loop
                 if robots[i,1] == 4 and not set then // choose the first robot at stop 'from'
                   set:= true;
                   currentRobot := i;

                 end if;
               end for;

               outFlowRobot := robots[currentRobot, 2];
               when sample(0,0.1) and robots[currentRobot,2] > 0 then
                   robots[currentRobot,2] :=robots[currentRobot, 2] - 2;
               end when;
            else
              outFlowRobot := 0;
            end if;

          for i in 1:size(robots,1) loop
            if  robots[i,2] <=0 then
               robots[i,3] :=20;
            end if;
          end for;
       // compute the temperature that is observed
       watched := false;
       for i in 1:size(robots,1) loop
         if not watched and robots[i,1] == 3 then // look for the first robot at stop 3
           watched := true;
           temp := robots[i,3]; // set the oberverd temperature to the temperature of the robot
          when sample(0,0.01) then
            robots[i,3] := robots[i,3]-coolDownBlock.out;
          end when;
         end if;
       end for;
       if not watched then // if there is no robot at step 3, set the temperature to default value
         temp:= 20;
       end if;
     //Robot.Robot physicalRobots[4];
       //  Master masterOfRobots[4];

    equation

      //connect robots with masterComponents!

        for i in 1:size(robots,1) loop
          masterOfRobots[i].id = ids[i];
        end for;

        for i in 1:1:size(robots,1) loop
          connect(T11.sender[i], masterOfRobots[i].T1.receiver[1]);
          connect(T10.receiver[i], masterOfRobots[i].T4.sender[1]);
        end for;

       for i in 1:1:size(robots,1) loop
          connect(goal.y, masterOfRobots[i].goal);
       end for;

       connect(T6.sender[1], fSD.T3.receiver[2]);
       connect(T9.sender[1], fSD.T3.receiver[3]);
      connect(tempRobot.y, temperatureOfObservedBebotAtStop3) annotation (Line(
          points={{156,-179},{156,-229},{157,-229}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(coolDownBlock.x, coolingRate) annotation (Line(
          points={{168.6,-17.6},{167.3,-17.6},{167.3,-18},{204,-18}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(inFlow, amountOfFlowBlock.x) annotation (Line(
          points={{-108,-62},{-66,-62},{-66,-62.4},{-60.6,-62.4}},
          color={0,0,127},
          smooth=Smooth.None));

      connect(CheckOrder.outPort[1], T3.inPort) annotation (Line(
          points={{76.6667,-46.6},{76.6667,-54},{46,-54},{46,-58}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CheckOrder.outPort[2], T4.inPort) annotation (Line(
          points={{78,-46.6},{24,-46.6},{24,-52}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, SendRobotToNextStop.inPort[1]) annotation (Line(
          points={{24,-61},{24,-72},{4,-72}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(FillRobot.outPort[1], T6.inPort) annotation (Line(
          points={{54,-80.6},{54,-86},{46,-86},{46,-90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, Initial.inPort[1]) annotation (Line(
          points={{46,-99},{-16,-99},{-16,-10},{42.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.outPort, Initial.inPort[2]) annotation (Line(
          points={{-36,-129},{-30,-129},{-30,-10},{43.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, FillRobot.inPort[1]) annotation (Line(
          points={{46,-67},{46,-66},{54,-66},{54,-72}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(CheckOrder.outPort[3], T8.inPort) annotation (Line(
          points={{79.3333,-46.6},{78,-46.6},{78,-50},{110,-50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T8.outPort, UnloadRobot.inPort[1]) annotation (Line(
          points={{110,-59},{112,-59},{112,-70}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(UnloadRobot.outPort[1], T9.inPort) annotation (Line(
          points={{112,-78.6},{114,-78.6},{114,-90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T9.outPort, Initial.inPort[3]) annotation (Line(
          points={{114,-99},{132,-99},{132,-10},{44.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Initial.outPort[1], T1.inPort) annotation (Line(
          points={{44,-18.6},{46,-18.6},{46,-22}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, CheckOrder.inPort[1]) annotation (Line(
          points={{46,-31},{64,-31},{64,-38},{78,-38}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(T10.outPort, targetReached.inPort[1]) annotation (Line(
          points={{16,-135},{16,-140},{14,-140},{14,-148},{12,-148}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(targetReached.outPort[1], T7.inPort) annotation (Line(
          points={{12,-156.6},{12,-156},{-36,-156},{-36,-138}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(masterOfRobots.Out_Order_Delegation, Robot_Order) annotation (Line(
          points={{101.54,-169.2},{-46,-169.2},{-46,-148},{-74,-148},{-74,-164},
              {-100,-164}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(masterOfRobots.In_DelegationFailed, Robot_Failed) annotation (Line(
          points={{55.54,-190.667},{-26.23,-190.667},{-26.23,-230},{4,-230}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(masterOfRobots.In_Delegation_Succeded, Robot_Success) annotation (
          Line(
          points={{55.54,-197.567},{55.54,-197.784},{-74,-197.784},{-74,-218}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(SendRobotToNextStop.outPort[1], T11.inPort) annotation (Line(
          points={{4,-80.6},{4,-86},{4,-86},{4,-90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T11.outPort, RobotDetermined.inPort[1]) annotation (Line(
          points={{4,-99},{4,-106},{12,-106}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(T12.outPort, TargetBlocked.inPort[1]) annotation (Line(
          points={{44,-131},{60,-131},{60,-134},{70,-134}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(RobotDetermined.outPort[1], T12.inPort) annotation (Line(
          points={{11,-114.6},{30,-114.6},{30,-122},{44,-122}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TargetBlocked.outPort[1], T13.inPort) annotation (Line(
          points={{78.6,-134},{88,-134},{88,-130},{98,-130}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T13.outPort, Initial.inPort[4]) annotation (Line(
          points={{107,-130},{142,-130},{142,0},{44,0},{44,-10},{45.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T12.receiver[1:4], masterOfRobots.failed) annotation (Line(
          points={{41.18,-121.455},{41.18,-210.99},{80.84,-210.99},{80.84,-206}},
          color={255,128,0},
          smooth=Smooth.None));

      connect(T7.sender[1], fSD.Done) annotation (Line(
          points={{-38.6,-138.06},{-38.6,-57.03},{0,-57.03},{0,25.28}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T13.sender[1], fSD.Fail) annotation (Line(
          points={{97.94,-127.4},{97.94,51.8},{-2.58,51.8}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(fSD.sender, T1.receiver[1]) annotation (Line(
          points={{86,58.56},{86,4.28},{48.82,4.28},{48.82,-21.98}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(fSD.In_Order_Delegation, InOrder) annotation (Line(
          points={{-0.86,68.44},{-49.43,68.44},{-49.43,62},{-100,62}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSD.Out_Delegation_Failed, OutFail) annotation (Line(
          points={{86,42.44},{145,42.44},{145,30},{198,30}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSD.Out_Delegation_Succeded, OutDone) annotation (Line(
          points={{86,23.72},{149,23.72},{149,82},{202,82}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(RobotDetermined.outPort[2], T10.inPort) annotation (Line(
          points={{13,-114.6},{14,-114.6},{14,-126},{16,-126}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -220},{200,100}}),                                                                     graphics), Icon(
            coordinateSystem(extent={{-100,-220},{200,100}}, preserveAspectRatio=false),
            graphics));
    end RobotControl;

    model Master
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation.Delegation_Master(
        In_DelegationFailed(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        In_Delegation_Succeded(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Order_Delegation(
          redeclare Integer integers[1] "integers[1]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        message(numberOfMessageIntegers=1),
        T1(
          use_conditionPort=false,
          afterTime=0.01,
          use_syncReceive=true,
          selectorExpression=id,numberOfSyncReceive=1),
        T4(use_syncSend=true,numberOfSyncSend=1),
        T2(condition=false),
        T3(use_syncSend=true, numberOfSyncSend=1));
      Modelica.Blocks.Interfaces.IntegerInput goal annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={58,148})));
      Modelica.Blocks.Interfaces.IntegerInput id annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=180,
            origin={104,40})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.sender
        failed
        annotation (Placement(transformation(extent={{-2,-110},{18,-90}})));
    equation
      connect(message.u_integers[1], goal) annotation (Line(
          points={{57,103.2},{57,112.6},{58,112.6},{58,148}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T3.sender[1], failed) annotation (Line(
          points={{-9.94,25.4},{-9.94,26},{72,26},{72,-92},{48,-92},{48,-96},{8,
              -96},{8,-100}},
          color={255,128,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,140}}),      graphics), Icon(coordinateSystem(extent=
               {{-100,-100},{100,140}})));
    end Master;

    model FODelegation_Slave
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation.Delegation_Slave(
        T2(use_syncReceive=true, numberOfSyncReceive=1),
        T3(use_syncReceive=true, numberOfSyncReceive=3),
        Out_Delegation_Failed(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Delegation_Succeded(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        T1(use_syncSend=true, numberOfSyncSend=1,
          numberOfMessageIntegers=3),
        In_Order_Delegation(
          redeclare Integer integers[3] "integers[2]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        mailbox(numberOfMessageIntegers=3));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.receiver
        Fail annotation (Placement(transformation(extent={{-116,20},{-96,40}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.receiver
        Done annotation (Placement(transformation(extent={{-110,-82},{-90,-62}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.sender
        sender annotation (Placement(transformation(extent={{90,46},{110,66}})));

    Integer from;
    Integer to;
    Integer order;

    equation
       when T1.fire then
          from = T1.transition_input_port[1].integers[1];
          to = T1.transition_input_port[1].integers[2];
          order = T1.transition_input_port[1].integers[3];
         end when;

      connect(T2.receiver[1], Fail) annotation (Line(
          points={{-13.98,24.82},{-56.99,24.82},{-56.99,30},{-106,30}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T3.receiver[1], Done) annotation (Line(
          points={{-9.98,-47.18},{-54.99,-47.18},{-54.99,-72},{-100,-72}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T1.sender[1], sender) annotation (Line(
          points={{-24.06,70.6},{-65.03,70.6},{-65.03,56},{100,56}},
          color={255,128,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end FODelegation_Slave;
  end RobotControl;

  package Robot

    model Robot_V3 "V3"
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
      Modelica.Blocks.Interfaces.RealInput omegaL_des
        "Desired angular speed of left motor"
        annotation (Placement(transformation(extent={{-160,-20},{-120,20}})));
      Modelica.Blocks.Interfaces.RealInput omegaR_des
        "Desired angular speed of right motor"
        annotation (Placement(transformation(extent={{160,-20},{120,20}})));
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
        annotation (Placement(transformation(extent={{42,-88},{62,-68}})));
      Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape(
        shapeType="box",
        length=0.09,
        width=d_wheel,
        color={red,green,blue},
        r_shape={-0.045,0,0.02},
        lengthDirection={1,0,0},
        widthDirection={0,1,0},
        height=0.05)
        annotation (Placement(transformation(extent={{-82,-84},{-62,-64}})));
      Modelica.Blocks.Interfaces.IntegerInput red annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-98,104})));
      Modelica.Blocks.Interfaces.IntegerInput blue annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={116,104})));
      Modelica.Blocks.Interfaces.IntegerInput green annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={0,104})));
      Modelica.Blocks.Interfaces.RealOutput y
        annotation (Placement(transformation(extent={{142,24},{190,72}})));
      Modelica.Blocks.Interfaces.RealOutput x
        annotation (Placement(transformation(extent={{140,-100},{194,-46}})));
    equation
      x= wheelSet.x;
      y= wheelSet.y;
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
      connect(omegaL_des, dCMotorCtrl_V4L.DesSp) annotation (Line(
          points={{-140,0},{-38,0}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(dCMotorCtrl_V4R.DesSp, omegaR_des) annotation (Line(
          points={{38,-9.79717e-016},{82,-9.79717e-016},{82,0},{140,0}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(body.frame_a, wheelSet.frameMiddle) annotation (Line(
          points={{42,-78},{2,-78},{2,-10}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      connect(fixedShape.frame_a, wheelSet.frameMiddle) annotation (Line(
          points={{-82,-74},{2,-74},{2,-10}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      annotation (
      Documentation(info="<html>
<p>
<i>Version 3.1 <br> Created 14.12.2010 <br> Last modified 11.04.2011 </i> <br><br>

Model of robot with two wheels, actuated independantly by two DC motors. <br>
The model is made up of following parts: <br>
- DC Motor based on Faulhaber 1724 motor with a gear having a ratio of 14.4 <br>
- Motor is attached to an inertia block which includes a friction model <br>
- Frictional torque is made up of Coulomb and stribeck friction, viscous friction is neglected <br>
- PI-Controller with limiter <br>
</p>
Version History
3.1 - added body to a wheel set, set inertia values based on CAD model of the chassis

</html>
"), Diagram(coordinateSystem(preserveAspectRatio=false,extent={{-150,-100},{150,
                100}}),      graphics), Icon(coordinateSystem(preserveAspectRatio=true,
              extent={{-150,-100},{150,100}}), graphics={
            Rectangle(
              extent={{-80,60},{80,-60}},
              lineColor={0,0,255},
              fillPattern=FillPattern.Sphere,
              fillColor={0,0,255},
              lineThickness=1),
            Rectangle(
              extent={{-110,30},{-80,-30}},
              lineColor={0,127,0},
              lineThickness=1),
            Rectangle(
              extent={{80,30},{110,-30}},
              lineColor={0,127,0},
              lineThickness=1),
            Text(
              extent={{-80,-60},{80,-100}},
              lineColor={0,0,255},
              lineThickness=1,
              fillPattern=FillPattern.Sphere,
              textString="%name"),
            Text(
              extent={{-80,34},{80,-24}},
              lineColor={255,255,0},
              textString="BeBot")}));
    end Robot_V3;

    model Delegation_Slave
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Operational_Delegation.Delegation_Slave(
        In_Order_Delegation(
          redeclare Integer integers[1] "integers[1]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Delegation_Failed(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Delegation_Succeded(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        mailbox(numberOfMessageIntegers=1),
        T1(numberOfMessageIntegers=1, use_syncSend=true,numberOfSyncSend=1),
        T2(use_syncReceive=true, numberOfSyncReceive=1),
        T3(use_syncReceive=true,numberOfSyncReceive=1));

        Modelica.Blocks.Interfaces.IntegerOutput goal(start=2);
      RealTimeCoordinationLibrary.RealTimeCoordination.Internal.Interfaces.Synchron.receiver
        fail
        annotation (Placement(transformation(extent={{-112,-36},{-92,-16}})));
    equation
     when T1.fire then
          goal = T1.transition_input_port[1].integers[1];
     end when;
      connect(T2.receiver[1], fail) annotation (Line(
          points={{-13.98,24.82},{-41.99,24.82},{-41.99,-26},{-102,-26}},
          color={255,128,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end Delegation_Slave;

    model Visualizer
     Modelica.Mechanics.MultiBody.Interfaces.Frame_a Frame annotation (
          Placement(transformation(
            extent={{-16,-16},{16,16}},
            rotation=180,
            origin={-100,12})));
      Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape(
        length=0.1,
        width=0.1,
        height=0.2,
        shapeType="1",
        r_shape={0,0,0.08},
        color={red,green,blue})
        annotation (Placement(transformation(extent={{-20,-70},{0,-50}})));
      Modelica.Blocks.Interfaces.IntegerInput red annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-70,104})));
      Modelica.Blocks.Interfaces.IntegerInput green annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={2,106})));
      Modelica.Blocks.Interfaces.IntegerInput blue annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={62,106})));
    equation
      connect(fixedShape.frame_a, Frame) annotation (Line(
          points={{-20,-60},{-12,-60},{-12,12},{-100,12}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent=
                {{-100,-100},{100,100}}), graphics));
    end Visualizer;

    model Robot
      Real speedLeft(start=0);
      Real speedRight(start=0);
      parameter Real xstart = 0;
      parameter Real ystart= 0;
      parameter Integer ID = 1;
      Modelica.SIunits.Position posX;
      Modelica.SIunits.Position posY;
      Robot_V3 robot_V3_1(xstart_wmr=xstart, ystart_wmr=ystart)
        annotation (Placement(transformation(extent={{-22,-32},{8,-12}})));
      Modelica.Blocks.Sources.RealExpression left(y=speedLeft)
        annotation (Placement(transformation(extent={{-90,-36},{-70,-16}})));
      Modelica.Blocks.Sources.RealExpression right(y=speedRight)
                                                   annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={34,-24})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step stop(
        initialStep=true,
        nOut=1,
        nIn=2) annotation (Placement(transformation(extent={{148,-4},{156,4}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step move(nIn=1, nOut=4)
        annotation (Placement(transformation(extent={{124,-50},{132,-42}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T10(
        use_after=true,
        afterTime=0.001,
        use_syncReceive=true,
        numberOfSyncReceive=1)
        annotation (Placement(transformation(extent={{124,-28},{132,-20}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T12(
        use_syncSend=true,
        numberOfSyncSend=1,
        use_firePort=false,
        use_conditionPort=false,
        use_after=false) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={212,-30})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        success(
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]",
        redeclare Integer integers[0] "integers[0]")
        annotation (Placement(transformation(extent={{156,88},{176,108}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
        fail(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{258,90},{278,110}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        in_Order(
        redeclare Integer integers[1] "integers[1]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{372,12},{392,32}})));
      Delegation_Slave delegation_Slave(worktime=3.5)
                                        annotation (Placement(transformation(
            extent={{10,-10},{-10,10}},
            rotation=270,
            origin={260,38})));
      Modelica.Blocks.Interfaces.RealInput red annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-124,106})));
      Modelica.Blocks.Interfaces.RealInput green annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-58,108})));
      Modelica.Blocks.Interfaces.RealInput blue annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={2,106})));
    //Integer position(start=1);
    //Integer direction;
    Real phi;
    Integer k(start=0);
      RealTimeCoordinationLibrary.RealTimeCoordination.Step ArrivedAtStop(nIn=4,
          nOut=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={216,-56})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T13(
        afterTime=3,
        condition=delegation_Slave.goal == 2,
        use_after=false)
        annotation (Placement(transformation(extent={{56,-82},{64,-74}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T14(
        afterTime=1,
        condition=delegation_Slave.goal == 3,
        use_after=false) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={106,-82})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Station1(
        initialStep=false,
        nIn=1,
        nOut=1)
               annotation (Placement(transformation(extent={{34,-124},{42,-116}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Station2(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{98,-126},{106,-118}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo90(nIn=1, nOut=2)
        annotation (Placement(transformation(extent={{98,-176},{106,-168}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T2(condition=phi >=
            Modelica.Constants.pi/2 + k*2*Modelica.Constants.pi)
        annotation (Placement(transformation(extent={{98,-154},{106,-146}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo180(nIn=1, nOut=2)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={150,-170})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T3(
          afterTime=2,
        use_after=false,
        condition=posY >= 0.7)
                       annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={102,-196})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Station3(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{144,-128},{152,-120}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T4(condition=phi >=
            Modelica.Constants.pi + k*2*Modelica.Constants.pi) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={150,-146})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Station4(nIn=1, nOut=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={192,-124})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(
          afterTime=2,
        use_after=false,
        condition=posX <= 0)
                       annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={154,-196})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(condition=phi >=
            1.5*Modelica.Constants.pi + k*2*Modelica.Constants.pi)
                                                               annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={192,-156})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo0(nIn=1, nOut=2)
        annotation (Placement(transformation(extent={{34,-172},{42,-164}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(condition=phi >=
            k*2*Modelica.Constants.pi)
        annotation (Placement(transformation(extent={{34,-152},{42,-144}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(
          afterTime=2,
        use_after=false,
        condition=posX >= 0.7)
        annotation (Placement(transformation(extent={{32,-204},{40,-196}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo270(nIn=1, nOut=2)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={192,-178})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(
          afterTime=2,
        use_after=false,
        condition=posY <= 0)
                       annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={192,-198})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T9(condition=
            delegation_Slave.goal == 4)
        annotation (Placement(transformation(extent={{140,-84},{148,-76}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T11(condition=
            delegation_Slave.goal == 1)
        annotation (Placement(transformation(extent={{174,-86},{182,-78}})));
      Modelica.Blocks.Interfaces.RealInput warmth annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={88,110})));
      Modelica.Blocks.Sources.IntegerExpression integerExpression1(y=0)
                     annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={40,32})));
      Modelica.Blocks.Sources.IntegerExpression integerExpression2
        annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={64,34})));
      Modelica.Blocks.Sources.IntegerExpression integerExpression3(y=128)
                       annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={94,32})));
      Tank.Tankmodel tankmodel(
        maxLevel=50,
        height=0.16,
        radius=0.08,
        position={0,0,0.05}) annotation (Placement(transformation(extent={{-102,
                -122},{-122,-102}})));
      Modelica.Blocks.Interfaces.RealOutput y annotation (Placement(transformation(
            extent={{-34,-34},{34,34}},
            rotation=270,
            origin={-120,-262})));
      Modelica.Blocks.Interfaces.RealOutput x annotation (Placement(transformation(
            extent={{-39,-39},{39,39}},
            rotation=270,
            origin={-37,-269})));
      Modelica.Blocks.Interfaces.RealInput distancesToRobot[4]
        annotation (Placement(transformation(extent={{-162,18},{-122,58}})));

        Integer robotTooCloseID(start=1); // id of the robot that is too close
        Integer stationNotReached(start=1);
        Boolean stopBlocked(start=false); // true <->the current stop ist blocked by another robot

        Real robotDistanceDer[4](each start = 0);
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T18(condition=
            stopBlocked)
        annotation (Placement(transformation(extent={{80,-232},{88,-224}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T19(condition=
            stopBlocked)
        annotation (Placement(transformation(extent={{62,-260},{70,-252}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T20(condition=
            stopBlocked)
        annotation (Placement(transformation(extent={{106,-256},{114,-248}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T21(condition=
            stopBlocked)
        annotation (Placement(transformation(extent={{148,-256},{156,-248}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step StopBlocked(nIn=4, nOut=
           1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={232,-266})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T22(use_syncSend=true,
          numberOfSyncSend=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={284,-224})));
    algorithm
      /*direction :=sign((delegation_Slave.goal - position));

  when stop.active then
    speedLeft:=0;
    speedRight:=0;
  end when;

  when move.active then
    speedLeft:=direction*20;
    speedRight:=direction*20;
  end when;*/

      /*when T12.fire then
    position :=delegation_Slave.goal;
  end when;*/
    k:=0;
        when sample(0, 0.01) then
        phi:= robot_V3_1.wheelSet.phi;
      end when;
      when phi== k*2*Modelica.Constants.pi or phi==Modelica.Constants.pi/2+ k*2*Modelica.Constants.pi or phi==Modelica.Constants.pi+ k*2*Modelica.Constants.pi or phi==Modelica.Constants.pi*1.5+ k*2*Modelica.Constants.pi then

        speedLeft:=0;
        speedRight:=0;
      end when;

      when StopBlocked.active then
        speedLeft:= 0;
        speedRight:=0;
        stopBlocked := false;
      end when;
       when stop.active then
        speedLeft:=0;
        speedRight:=0;
       end when;

      when Station1.active or Station2.active or Station3.active or Station4.active then
        speedLeft:=-5;
        speedRight:=5;

      end when;
       /*when TurnTo270.active then
     k:=k+1;
   end when;*/
      if TurnTo0.active or TurnTo90.active or TurnTo180.active or TurnTo270.active then
        speedLeft:= 20;
        speedRight:=20;
        // save the robot that is too close and the station that was not reached due to it was blocked by the robot

        for i in 1:4 loop
        if  ID <> i and distancesToRobot[i] < 0.11 and robotDistanceDer[i] < -0.1 then
            stopBlocked := true;
            robotTooCloseID :=i;
            if TurnTo0.active then
              stationNotReached := 2;
            elseif TurnTo90.active then
              stationNotReached := 3;
            elseif TurnTo180.active then
              stationNotReached := 4;
            else
              stationNotReached := 1;
            end if;
        end if;
        end for;

      end if;

    /*   when T16.fire then
      stopBlocked := false;
   end when;
*/
    equation
      for i in 1:4 loop
        if not i == ID then
          robotDistanceDer[i] =  der(distancesToRobot[i]);
        else
          robotDistanceDer[i] = 0;
        end if;
      end for;
      posX = robot_V3_1.x;
      posY = robot_V3_1.y;

      connect(delegation_Slave.T1.sender[1], T10.receiver[1]);
      connect(T12.sender[1], delegation_Slave.T3.receiver[1]);
      connect(robot_V3_1.omegaR_des, right.y) annotation (Line(
          points={{7,-22},{14,-22},{14,-24},{23,-24}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(left.y, robot_V3_1.omegaL_des) annotation (Line(
          points={{-69,-26},{-44,-26},{-44,-22},{-21,-22}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(delegation_Slave.In_Order_Delegation, in_Order) annotation (Line(
          points={{269.4,27.8},{277.9,27.8},{277.9,22},{382,22}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(delegation_Slave.Out_Delegation_Succeded, success) annotation (Line(
          points={{252.2,48},{252.2,98},{166,98}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(delegation_Slave.Out_Delegation_Failed, fail) annotation (Line(
          points={{259.4,48},{268,48},{268,100}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(stop.outPort[1], T10.inPort) annotation (Line(
          points={{152,-4.6},{130,-4.6},{130,-20},{128,-20}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T10.outPort, move.inPort[1]) annotation (Line(
          points={{128,-29},{128,-42}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(move.outPort[1], T13.inPort) annotation (Line(
          points={{126.5,-50.6},{94,-50.6},{94,-74},{60,-74}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T13.outPort, Station1.inPort[1]) annotation (Line(
          points={{60,-83},{50,-83},{50,-116},{38,-116}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(move.outPort[2], T14.inPort) annotation (Line(
          points={{127.5,-50.6},{118,-50.6},{118,-78},{106,-78}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T14.outPort, Station2.inPort[1]) annotation (Line(
          points={{106,-87},{104,-87},{104,-118},{102,-118}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(move.outPort[3], T9.inPort) annotation (Line(
          points={{128.5,-50.6},{136,-50.6},{136,-76},{144,-76}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T9.outPort, Station3.inPort[1]) annotation (Line(
          points={{144,-85},{146,-85},{146,-120},{148,-120}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(move.outPort[4], T11.inPort) annotation (Line(
          points={{129.5,-50.6},{154,-50.6},{154,-78},{178,-78}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T11.outPort, Station4.inPort[1]) annotation (Line(
          points={{178,-87},{186,-87},{186,-120},{192,-120}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Station1.outPort[1], T1.inPort) annotation (Line(
          points={{38,-124.6},{38,-124.6},{38,-144}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, TurnTo0.inPort[1]) annotation (Line(
          points={{38,-153},{38,-164}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo0.outPort[1], T7.inPort) annotation (Line(
          points={{37,-172.6},{37,-184},{36,-184},{36,-196}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Station2.outPort[1], T2.inPort) annotation (Line(
          points={{102,-126.6},{102,-146}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, TurnTo90.inPort[1]) annotation (Line(
          points={{102,-155},{102,-168}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo90.outPort[1], T3.inPort) annotation (Line(
          points={{101,-176.6},{101,-184},{102,-184},{102,-192}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Station3.outPort[1], T4.inPort) annotation (Line(
          points={{148,-128.6},{150,-128.6},{150,-142}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, TurnTo180.inPort[1]) annotation (Line(
          points={{150,-151},{150,-166}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo180.outPort[1], T5.inPort) annotation (Line(
          points={{149,-174.6},{152,-174.6},{152,-192},{154,-192}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Station4.outPort[1], T6.inPort) annotation (Line(
          points={{192,-128.6},{192,-152}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, TurnTo270.inPort[1]) annotation (Line(
          points={{192,-161},{192,-161},{192,-174}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo270.outPort[1], T8.inPort) annotation (Line(
          points={{191,-182.6},{191,-188},{192,-188},{192,-194}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T8.outPort, ArrivedAtStop.inPort[1]) annotation (Line(
          points={{192,-203},{217.5,-203},{217.5,-60}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, ArrivedAtStop.inPort[2]) annotation (Line(
          points={{154,-201},{154,-222},{224,-222},{224,-60},{216.5,-60}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, ArrivedAtStop.inPort[3]) annotation (Line(
          points={{102,-201},{102,-230},{216,-230},{216,-60},{215.5,-60}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.outPort, ArrivedAtStop.inPort[4]) annotation (Line(
          points={{36,-205},{120,-205},{120,-214},{234,-214},{234,-60},{214.5,-60}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(ArrivedAtStop.outPort[1], T12.inPort) annotation (Line(
          points={{216,-51.4},{212,-51.4},{212,-34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T12.outPort, stop.inPort[1]) annotation (Line(
          points={{212,-25},{212,14},{138,14},{138,4},{151,4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(integerExpression1.y, robot_V3_1.red) annotation (Line(
          points={{40,21},{-12,21},{-12,-11.6},{-16.8,-11.6}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(integerExpression2.y, robot_V3_1.green) annotation (Line(
          points={{64,23},{64,2},{-2,2},{-2,-11.6},{-7,-11.6}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(integerExpression3.y, robot_V3_1.blue) annotation (Line(
          points={{94,21},{98,21},{98,-11.6},{4.6,-11.6}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(red, tankmodel.fillingLevel) annotation (Line(
          points={{-124,106},{-118,106},{-118,-101.8},{-106.4,-101.8}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankmodel.frame_a, robot_V3_1.Frame) annotation (Line(
          points={{-102,-109},{-8,-109},{-8,-16},{-7,-16}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));

      connect(tankmodel.warmth, warmth) annotation (Line(
          points={{-117,-101.4},{-107.5,-101.4},{-107.5,110},{88,110}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(robot_V3_1.x, x) annotation (Line(
          points={{9.7,-29.3},{9.7,-269},{-37,-269}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(robot_V3_1.y, y) annotation (Line(
          points={{9.6,-17.2},{9.6,-99.6},{-120,-99.6},{-120,-262}},
          color={0,0,127},
          smooth=Smooth.None));

      connect(TurnTo0.outPort[2], T19.inPort) annotation (Line(
          points={{39,-172.6},{58,-172.6},{58,-252},{66,-252}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo90.outPort[2], T18.inPort) annotation (Line(
          points={{103,-176.6},{90,-176.6},{90,-224},{84,-224}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo180.outPort[2], T20.inPort) annotation (Line(
          points={{151,-174.6},{130,-174.6},{130,-248},{110,-248}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTo270.outPort[2], T21.inPort) annotation (Line(
          points={{193,-182.6},{174,-182.6},{174,-248},{152,-248}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T21.outPort, StopBlocked.inPort[1]) annotation (Line(
          points={{152,-257},{202,-257},{202,-267.5},{228,-267.5}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T20.outPort, StopBlocked.inPort[2]) annotation (Line(
          points={{110,-257},{180,-257},{180,-266.5},{228,-266.5}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T18.outPort, StopBlocked.inPort[3]) annotation (Line(
          points={{84,-233},{168,-233},{168,-265.5},{228,-265.5}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T19.outPort, StopBlocked.inPort[4]) annotation (Line(
          points={{66,-261},{160,-261},{160,-264.5},{228,-264.5}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(StopBlocked.outPort[1], T22.inPort) annotation (Line(
          points={{236.6,-266},{260,-266},{260,-228},{284,-228}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T22.outPort, stop.inPort[2]) annotation (Line(
          points={{284,-219},{286,-219},{286,4},{153,4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T22.sender[1], delegation_Slave.fail) annotation (Line(
          points={{281.4,-228.06},{281.4,16.97},{257.4,16.97},{257.4,27.8}},
          color={255,128,0},
          smooth=Smooth.None));
     annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-140,
                -240},{380,100}}), graphics), Icon(coordinateSystem(extent={{-140,-240},
                {380,100}})));
    end Robot;

    model distance

      Modelica.Blocks.Interfaces.RealOutput distance
        annotation (Placement(transformation(extent={{90,-34},{144,20}})));
      Modelica.Blocks.Interfaces.RealInput yCoordinate1
        annotation (Placement(transformation(extent={{-122,26},{-82,66}})));
      Modelica.Blocks.Interfaces.RealInput xCoordinate1
        annotation (Placement(transformation(extent={{-122,66},{-82,106}})));
      Modelica.Blocks.Interfaces.RealInput yCoordinate2
        annotation (Placement(transformation(extent={{-122,-100},{-82,-60}})));
      Modelica.Blocks.Interfaces.RealInput xCoordinate2
        annotation (Placement(transformation(extent={{-122,-58},{-82,-18}})));
      Modelica.Blocks.Math.Sqrt sqrt1
        annotation (Placement(transformation(extent={{58,-14},{78,6}})));
      Modelica.Blocks.Math.Add add
        annotation (Placement(transformation(extent={{-20,-12},{0,8}})));
      Modelica.Blocks.Math.Product product1
        annotation (Placement(transformation(extent={{-64,-22},{-44,-2}})));
      Modelica.Blocks.Sources.RealExpression realExpression(y=-1)
        annotation (Placement(transformation(extent={{-88,18},{-68,38}})));
      Modelica.Blocks.Math.Product product2
        annotation (Placement(transformation(extent={{28,32},{48,52}})));
      Modelica.Blocks.Math.Product product3
        annotation (Placement(transformation(extent={{50,-68},{70,-48}})));
      Modelica.Blocks.Math.Product product4
        annotation (Placement(transformation(extent={{-22,-84},{-2,-64}})));
      Modelica.Blocks.Math.Add add1
        annotation (Placement(transformation(extent={{6,-50},{26,-30}})));
      Modelica.Blocks.Math.Add add2
        annotation (Placement(transformation(extent={{80,18},{100,38}})));
    equation

      connect(sqrt1.y, distance) annotation (Line(
          points={{79,-4},{96,-4},{96,-7},{117,-7}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(realExpression.y, product1.u1) annotation (Line(
          points={{-67,28},{-58,28},{-58,-6},{-66,-6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(xCoordinate1, product1.u2) annotation (Line(
          points={{-102,86},{-86,86},{-86,-18},{-66,-18}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(xCoordinate2, add.u2) annotation (Line(
          points={{-102,-38},{-28,-38},{-28,-8},{-22,-8}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(product1.y, add.u1) annotation (Line(
          points={{-43,-12},{-32,-12},{-32,4},{-22,4}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(add.y, product2.u2) annotation (Line(
          points={{1,-2},{18,-2},{18,36},{26,36}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(add.y, product2.u1) annotation (Line(
          points={{1,-2},{4,-2},{4,48},{26,48}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(realExpression.y, product4.u1) annotation (Line(
          points={{-67,28},{-46,28},{-46,-68},{-24,-68}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(yCoordinate2, product4.u2) annotation (Line(
          points={{-102,-80},{-24,-80}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(product4.y, add1.u2) annotation (Line(
          points={{-1,-74},{2,-74},{2,-46},{4,-46}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(yCoordinate1, add1.u1) annotation (Line(
          points={{-102,46},{-38,46},{-38,-34},{4,-34}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(add1.y, product3.u1) annotation (Line(
          points={{27,-40},{30,-40},{30,-52},{48,-52}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(add1.y, product3.u2) annotation (Line(
          points={{27,-40},{30,-40},{30,-64},{48,-64}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(product2.y, add2.u1) annotation (Line(
          points={{49,42},{62,42},{62,34},{78,34}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(product3.y, add2.u2) annotation (Line(
          points={{71,-58},{74,-58},{74,22},{78,22}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(add2.y, sqrt1.u) annotation (Line(
          points={{101,28},{78,28},{78,-4},{56,-4}},
          color={0,0,127},
          smooth=Smooth.None));
           annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),
                          graphics));
    end distance;

  end Robot;

  package Sink
    model Sink
      parameter Real maxLevel;
      parameter Real height;
      parameter Real radius;
      parameter Modelica.SIunits.Position position[3] = {0,0,0};
      Modelica.Blocks.Interfaces.RealInput inFlow annotation (Placement(
            transformation(extent={{-20,-20},{20,20}},
            rotation=270,
            origin={60,106}),                          iconTransformation(
            extent={{-14,-14},{14,14}},
            rotation=270,
            origin={42,100})));
      Tank.Tankmodel tankmodel(
        maxLevel=maxLevel,
        height=height,
        radius=radius,
        position=position)
        annotation (Placement(transformation(extent={{-28,-44},{-8,-24}})));
      IntegratorBlock2 integratorBlock
        annotation (Placement(transformation(extent={{20,26},{40,46}})));
      Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a
        annotation (Placement(transformation(extent={{-118,-14},{-86,18}})));
      Modelica.Blocks.Interfaces.RealInput warmth annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-20,108})));
    equation
      connect(inFlow, integratorBlock.x) annotation (Line(
          points={{60,106},{46,106},{46,46.6},{29.6,46.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankmodel.frame_a, frame_a) annotation (Line(
          points={{-28,-31},{-64,-31},{-64,2},{-102,2}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      connect(tankmodel.warmth, warmth) annotation (Line(
          points={{-13,-23.4},{-13,35.3},{-20,35.3},{-20,108}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankmodel.fillingLevel, integratorBlock.out) annotation (Line(
          points={{-23.6,-23.8},{5.2,-23.8},{5.2,25.9},{30.1,25.9}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Icon(coordinateSystem(preserveAspectRatio=false, extent={{
                -100,-100},{100,100}}), graphics), Diagram(coordinateSystem(
              preserveAspectRatio=false, extent={{-100,-100},{100,100}}),
            graphics));
    end Sink;

    model IntegratorBlock2

      Modelica.Blocks.Interfaces.RealInput x annotation (Placement(transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-4,106})));
      Modelica.Blocks.Interfaces.RealOutput out annotation (Placement(
            transformation(
            extent={{-23,-23},{23,23}},
            rotation=270,
            origin={1,-101})));

    algorithm
      der(out) :=x;
       annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics),
        experiment(StopTime=8),
        __Dymola_experimentSetupOutput);
    end IntegratorBlock2;
  end Sink;

  package Radiator
    model Timer
      parameter Real factor;
      Real startTime;
      Real c(start= 0);
      Modelica.Blocks.Interfaces.RealOutput y annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={-102,0})));
      Modelica.Blocks.Interfaces.BooleanInput on annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-38,98})));

    equation
      when on then
        startTime =  factor*time;
      end when;

      when not on then
        c=  pre(y);
      end when;

      if on then
        y = c + factor*time -startTime;
      else
        y = c;
      end if;

           annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end Timer;

    model RadiatorLogic
      Modelica.Blocks.Interfaces.BooleanInput on annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={0,108})));
      Modelica.Blocks.Interfaces.RealOutput y annotation (Placement(
            transformation(
            extent={{-25,-25},{25,25}},
            rotation=270,
            origin={11,-107})));
      Modelica.Blocks.Sources.RealExpression realExpression(y=if on then 0.4
             else 0) annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={12,14})));
    equation
      connect(realExpression.y, y) annotation (Line(
          points={{12,3},{14,3},{14,-107},{11,-107}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),      graphics));
    end RadiatorLogic;

    model RadiatorModel
      parameter Modelica.SIunits.Position position[3] = {0,0,0};
      Real pi = Modelica.Constants.pi;
      .demonstrator.Radiator.Timer timer(factor=5) annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=0,
            origin={56,32})));
      Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape1(
        color={0,0,0},
        length=0.2,
        lengthDirection={0,sin(timer.y),cos(timer.y)},
        width=0.05,
        height=0.05,
        r_shape=position,
        shapeType="4")
        annotation (Placement(transformation(extent={{-52,-20},{-32,0}})));
      Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a
        annotation (Placement(transformation(extent={{-106,6},{-74,38}})));
      Modelica.Blocks.Interfaces.BooleanInput on annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={24,104})));
    equation
      connect(fixedShape1.frame_a, frame_a) annotation (Line(
          points={{-52,-10},{-68,-10},{-68,22},{-90,22}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      connect(on, timer.on) annotation (Line(
          points={{24,104},{32,104},{32,41.8},{52.2,41.8}},
          color={255,0,255},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end RadiatorModel;

    model radiatorTest
      .demonstrator.Radiator.RadiatorModel radiatorModel
        annotation (Placement(transformation(extent={{6,-32},{26,-12}})));
      inner Modelica.Mechanics.MultiBody.World world
        annotation (Placement(transformation(extent={{-64,34},{-44,54}})));
      Modelica.Blocks.Sources.BooleanPulse booleanPulse(width=50, period=0.25)
        annotation (Placement(transformation(extent={{18,30},{38,50}})));
    equation
      connect(booleanPulse.y, radiatorModel.on) annotation (Line(
          points={{39,40},{28,40},{28,-11.6},{18.4,-11.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(radiatorModel.frame_a, world.frame_b) annotation (Line(
          points={{7,-19.8},{7,44},{-44,44}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{
                -100,-100},{100,100}}), graphics));
    end radiatorTest;

    model Radiator
     parameter Modelica.SIunits.Position position[3] = {0,0,0};
      RadiatorModel radiatorModel(position=position)
        annotation (Placement(transformation(extent={{-66,10},{-46,30}})));
      RadiatorLogic radiatorLogic
        annotation (Placement(transformation(extent={{44,40},{64,60}})));
      Modelica.Blocks.Interfaces.BooleanInput on annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={6,104})));
      Modelica.Blocks.Interfaces.RealOutput y annotation (Placement(transformation(
            extent={{-17,-17},{17,17}},
            rotation=270,
            origin={1,-109})));
      Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a
        annotation (Placement(transformation(extent={{-116,0},{-84,32}})));
    equation
      connect(on, radiatorModel.on) annotation (Line(
          points={{6,104},{-21,104},{-21,30.4},{-53.6,30.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(on, radiatorLogic.on) annotation (Line(
          points={{6,104},{31,104},{31,60.8},{54,60.8}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(frame_a, radiatorModel.frame_a) annotation (Line(
          points={{-100,16},{-86,16},{-86,22.2},{-65,22.2}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      connect(radiatorLogic.y, y) annotation (Line(
          points={{55.1,39.3},{55.1,-28.35},{1,-28.35},{1,-109}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end Radiator;
  end Radiator;

  package Tank
    model TankLogic

      parameter Real startLevel;

     Modelica.Blocks.Interfaces.RealInput outwardFlow annotation (Placement(
            transformation(
            extent={{-34,-34},{34,34}},
            rotation=270,
            origin={48,108})));
      Modelica.Blocks.Interfaces.RealOutput currentFillingLevelOfTank annotation (Placement(transformation(
            extent={{-27,-27},{27,27}},
            rotation=270,
            origin={71,-115})));

      Modelica.Blocks.Interfaces.RealInput inFlow annotation (Placement(transformation(
            extent={{-34,-34},{34,34}},
            rotation=270,
            origin={-72,110})));
      Real temp;
      Real v1;
      Real v2;
      Modelica.Blocks.Interfaces.RealOutput currentTemperatureOfTank annotation (
          Placement(transformation(
            extent={{-27,-27},{27,27}},
            rotation=270,
            origin={-65,-111})));
      Modelica.Blocks.Sources.RealExpression temperature(y=temp) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={-70,0})));
      Modelica.Blocks.Interfaces.RealOutput exactOutFlow annotation (Placement(
            transformation(
            extent={{-25,-25},{25,25}},
            rotation=180,
            origin={-115,31})));
    equation
      currentFillingLevelOfTank =startLevel + v1 - v2;
      der(v1) =inFlow;
      der(v2)= outwardFlow;
      temp = 80;

      connect(temperature.y, currentTemperatureOfTank) annotation (Line(
          points={{-70,-11},{-64,-11},{-64,-111},{-65,-111}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(outwardFlow, exactOutFlow) annotation (Line(
          points={{48,108},{48,31},{-115,31}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end TankLogic;

    model TankTest
      import demonstrator;

      demonstrator.Tank.TankLogic tank(startLevel=100)
        annotation (Placement(transformation(extent={{-26,-10},{-6,10}})));
      Modelica.Blocks.Sources.RealExpression realExpression(y=10) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={-32,64})));
      Modelica.Blocks.Sources.Pulse pulse(
        amplitude=-3,
        period=4,
        nperiod=-1) annotation (Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={14,54})));
    equation
      connect(realExpression.y, tank.inFlow) annotation (Line(
          points={{-32,53},{-40,53},{-40,11},{-23.2,11}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(pulse.y, tank.outwardFlow) annotation (Line(
          points={{3,54},{-4,54},{-4,10.8},{-11.2,10.8}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,-100},{100,100}}),
                                   graphics));
    end TankTest;

    model Tankmodel
      parameter Real maxLevel;
      parameter Real height;
      parameter Real radius;
      parameter Modelica.SIunits.Position position[3] = {0,0,0};
      Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape(shapeType="pipe",
        lengthDirection={0,0,1},
        width=radius,
        height=radius,
        length=height*fillingLevel/maxLevel,
        r_shape=position,
        color={red.y,green.y,blue.y})
        annotation (Placement(transformation(extent={{-34,-20},{-14,0}})));
      Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape1(shapeType="pipe",
        lengthDirection={0,0,1},
        width=radius,
        height=radius,
        length=height*(1 - fillingLevel/maxLevel),
        r_shape={position[1],position[2],position[3] + height*(fillingLevel/
            maxLevel)},
        color={0,0,0} "black")
        annotation (Placement(transformation(extent={{-32,36},{-12,56}})));

      Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a
        annotation (Placement(transformation(extent={{-116,14},{-84,46}})));
      Modelica.Blocks.Interfaces.RealInput fillingLevel annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-56,102})));
      Modelica.Blocks.Interfaces.RealInput warmth annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={50,106})));
      Modelica.Blocks.Sources.IntegerExpression red(y=if warmth > 20 and warmth
             < 80 then 125 elseif warmth >= 80 then 255 else 0) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={30,56})));
      Modelica.Blocks.Sources.IntegerExpression green annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={54,58})));
      Modelica.Blocks.Sources.IntegerExpression blue(y=if warmth > 20 and warmth
             < 80 then 125 elseif warmth >= 80 then 0 else 255) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={84,56})));
    equation
      connect(frame_a, fixedShape1.frame_a) annotation (Line(
          points={{-100,30},{-66,30},{-66,46},{-32,46}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      connect(fixedShape.frame_a, frame_a) annotation (Line(
          points={{-34,-10},{-62,-10},{-62,30},{-100,30}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end Tankmodel;

    model Tank
      parameter Integer startLevel;
        parameter Real maxLevel;
      parameter Real height;
      parameter Real radius;
      parameter Modelica.SIunits.Position position[3] = {0,0,0};

      TankLogic tankLogic(startLevel=startLevel)
        annotation (Placement(transformation(extent={{38,28},{58,48}})));
      Tankmodel tankmodel(
        maxLevel=maxLevel,
        height=height,
        radius=radius,
        position=position)
        annotation (Placement(transformation(extent={{-66,-30},{-46,-10}})));
      Modelica.Blocks.Interfaces.RealOutput currentTemperatureOfTank annotation (
          Placement(transformation(
            extent={{-18,-18},{18,18}},
            rotation=270,
            origin={8,-108})));
      Modelica.Blocks.Interfaces.RealOutput currentFillingLevelOfTank annotation (
          Placement(transformation(
            extent={{-18,-18},{18,18}},
            rotation=270,
            origin={66,-110})));
      Modelica.Blocks.Interfaces.RealOutput exactOutFlow annotation (Placement(
            transformation(
            extent={{-18,-18},{18,18}},
            rotation=180,
            origin={-114,56})));
      Modelica.Blocks.Interfaces.RealInput inFlow annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={8,106})));
      Modelica.Blocks.Interfaces.RealInput outwardFlow annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={66,106})));
      Modelica.Mechanics.MultiBody.Interfaces.Frame_a frame_a
        annotation (Placement(transformation(extent={{-116,-62},{-84,-30}})));
    equation
      connect(tankLogic.currentTemperatureOfTank, tankmodel.warmth) annotation (
          Line(
          points={{41.5,26.9},{-8.25,26.9},{-8.25,-9.4},{-51,-9.4}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankLogic.currentFillingLevelOfTank, tankmodel.fillingLevel)
        annotation (Line(
          points={{55.1,26.5},{-78.45,26.5},{-78.45,-9.8},{-61.6,-9.8}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankLogic.currentTemperatureOfTank, currentTemperatureOfTank)
        annotation (Line(
          points={{41.5,26.9},{41.5,-36.55},{8,-36.55},{8,-108}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankLogic.currentFillingLevelOfTank, currentFillingLevelOfTank)
        annotation (Line(
          points={{55.1,26.5},{55.1,-37.75},{66,-37.75},{66,-110}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankLogic.exactOutFlow, exactOutFlow) annotation (Line(
          points={{36.5,41.1},{-30.75,41.1},{-30.75,56},{-114,56}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(inFlow, tankLogic.inFlow) annotation (Line(
          points={{8,106},{28,106},{28,49},{40.8,49}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(outwardFlow, tankLogic.outwardFlow) annotation (Line(
          points={{66,106},{66,77},{52.8,77},{52.8,48.8}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(exactOutFlow, exactOutFlow) annotation (Line(
          points={{-114,56},{-114,56}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(tankmodel.frame_a, frame_a) annotation (Line(
          points={{-66,-17},{-78,-17},{-78,-46},{-100,-46}},
          color={95,95,95},
          thickness=0.5,
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}), graphics));
    end Tank;
  end Tank;
  annotation (uses(Modelica(version="3.2"), RealTimeCoordinationLibrary(version=
           "1.0.2"),
      Modelica_StateGraph2(version="2.0.2")));
end demonstrator;
