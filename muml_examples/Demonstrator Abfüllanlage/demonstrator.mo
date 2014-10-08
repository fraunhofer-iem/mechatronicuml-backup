within ;
package demonstrator
  model System

    BottlingControl.control bc_BottlingControl annotation (Placement(
          transformation(
          extent={{17,13},{-17,-13}},
          rotation=90,
          origin={-7,27})));
    BottlingControl.Tank tank(startLevel=100)
                                             annotation (Placement(transformation(extent={{-96,16},{-76,36}})));
    Modelica.Blocks.Sources.RealExpression productionRate(y=2)   annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-112,54})));
    TemperatureControl.TC tc_TemperaturControl(
      limitBebot=60,
      limitTank=80,
      periodRobotTemperature=0.01,
      periodTankTemperature=0.1)
      annotation (Placement(transformation(extent={{-86,-54},{-52,-30}})));
    CentralControl.Central central_MainControl
      annotation (Placement(transformation(extent={{-2,-76},{48,-30}})));
    RobotControl.RobotControl rc_RobotControl
      annotation (Placement(transformation(extent={{30,-158},{-10,-128}})));
    CentralControl.Cooler radiator
      annotation (Placement(transformation(extent={{78,-88},{98,-68}})));
    inner Modelica.Mechanics.MultiBody.World world(label2="z", n={0,0,-1})
      annotation (Placement(transformation(extent={{-172,-220},{-162,-210}})));

       RobotControl.Robot.Robot physicalRobots[4];
  equation

      for i in 1:4 loop
       connect(rc_RobotControl.masterOfRobots[i].Out_Order_Delegation, physicalRobots[i].in_Order);
       connect(rc_RobotControl.masterOfRobots[i].In_DelegationFailed, physicalRobots[i].fail);
       connect(rc_RobotControl.masterOfRobots[i].In_Delegation_Succeded, physicalRobots[i].success);
     end for;
     // connect robot color to filling level of Robot
     for i in 1:4 loop
       connect(physicalRobots[i].red, rc_RobotControl.robots[i,2]);
       connect(physicalRobots[i].green, rc_RobotControl.robots[i,2]);
       connect(physicalRobots[i].blue, rc_RobotControl.robots[i,2]);
       connect(physicalRobots[i].warmth, rc_RobotControl.robots[i,3]);
     end for;

    connect(bc_BottlingControl.fluidSensorOfTank, tank.currentFillingLevelOfTank)
      annotation (Line(
        points={{-21.17,15.27},{-28,15.27},{-28,8},{-78,8},{-78,12},{-78.9,12},
            {-78.9,14.5}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(bc_BottlingControl.outFlowTank, tank.outwardFlow) annotation (Line(
        points={{-22.34,32.44},{-28,32.44},{-28,28},{-34,28},{-34,50},{-82,50},
            {-82,36.8},{-81.2,36.8}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(productionRate.y, tank.inFlow) annotation (Line(
        points={{-112,43},{-112,37},{-93.2,37}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.BebotRedeemed, central_MainControl.BebotRedeemed)
      annotation (Line(
        points={{-51.8,-31.4},{-16.9,-31.4},{-16.9,-34.6},{-2,-34.6}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.BebotViolated, central_MainControl.BebotViolated)
      annotation (Line(
        points={{-51.5,-37.4},{-16.75,-37.4},{-16.75,-41.5},{-2,-41.5}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.TankRedeemed, central_MainControl.TankRedeemed)
      annotation (Line(
        points={{-52,-45.9},{-14,-45.9},{-14,-53.3833},{-2,-53.3833}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(tc_TemperaturControl.TankViolated, central_MainControl.TankViolated)
      annotation (Line(
        points={{-51.8,-52.6},{-16.9,-52.6},{-16.9,-61.4333},{-2,-61.4333}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(central_MainControl.InDone, bc_BottlingControl.OutDone) annotation (
       Line(
        points={{7.77273,-29.6167},{7.77273,4.12},{2.1,4.12},{2.1,9.66}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(bc_BottlingControl.outFail, central_MainControl.InFail) annotation (
       Line(
        points={{-10.64,10},{-8,10},{-8,-10},{-4,-10},{-4,-29.6167},{2.31818,
            -29.6167}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(bc_BottlingControl.inContinue, central_MainControl.OutContinue)
      annotation (Line(
        points={{-11.42,44},{-12,44},{-12,60},{10,60},{10,-29.6167},{12.7727,
            -29.6167}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(bc_BottlingControl.inOrder, central_MainControl.OutOrder)
      annotation (Line(
        points={{2.1,44.68},{2.1,52},{17.3182,52},{17.3182,-30}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(central_MainControl.OutOrder1, rc_RobotControl.InOrder) annotation (
       Line(
        points={{18.9091,-75.6167},{26,-75.6167},{26,-86},{62,-86},{62,-132.385},
            {30,-132.385}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(central_MainControl.OutContinue1, rc_RobotControl.InContinue)
      annotation (Line(
        points={{13,-76},{13,-96},{48,-96},{48,-140},{30,-140},{30,-136.769}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(rc_RobotControl.OutDone, central_MainControl.InDone1) annotation (
        Line(
        points={{-10.2667,-130.077},{-26,-130.077},{-26,-96},{8,-96},{8,-76},{
            8.22727,-76}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(rc_RobotControl.OutFail, central_MainControl.InFail1) annotation (
        Line(
        points={{-9.73333,-136.077},{-9.73333,-142},{-44,-142},{-44,-78},{
            1.40909,-78},{1.40909,-76}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(rc_RobotControl.temperatureOfObservedBebotAtStop3,
      tc_TemperaturControl.bebotSensor) annotation (Line(
        points={{-4,-158.808},{-8,-158.808},{-8,-164},{-106,-164},{-106,-38},{
            -96,-38},{-96,-37.3},{-87.3,-37.3}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tank.currentTemperatureOfTank, tc_TemperaturControl.tankSensor)
      annotation (Line(
        points={{-92.5,14.9},{-92.5,-48.55},{-87,-48.55},{-87,-47.4}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(tank.exactOutFlow, rc_RobotControl.inFlow) annotation (Line(
        points={{-97.5,29.1},{-97.5,28},{-118,28},{-118,-176},{48,-176},{48,
            -154},{32,-154},{32,-146.692},{31.0667,-146.692}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(central_MainControl.coolerOn, radiator.on) annotation (Line(
        points={{50.0455,-40.35},{88.25,-40.35},{88.25,-67.2},{88,-67.2}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(radiator.y, rc_RobotControl.coolingRate) annotation (Line(
        points={{89.1,-88.7},{90,-88.7},{90,-180},{-64,-180},{-64,-148},{-26,
            -148},{-26,-141.615},{-10.5333,-141.615}},
        color={0,0,127},
        smooth=Smooth.None));
    annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-200,
              -240},{160,100}}),                                                                     graphics), Icon(
          coordinateSystem(extent={{-200,-240},{160,100}})),
      experiment(StopTime=20),
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

  package TemperatureControl
    model TC
      parameter Real limitBebot;
      parameter Real limitTank;
      parameter Real periodRobotTemperature;
      parameter Real periodTankTemperature;
      DataProcessing dataProcessing_Robot(p_period=periodRobotTemperature)
        annotation (Placement(transformation(extent={{-54,42},{2,76}})));
      DataProcessing dataProcessing_Tank(p_period=periodTankTemperature)
        annotation (Placement(transformation(extent={{-46,-40},{12,0}})));
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
          points={{-45.42,-4.4},{-76.77,-4.4},{-76.77,-34},{-110,-34}},
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
          points={{11.42,-12.4},{27.77,-12.4},{27.77,-24.66},{66.5,-24.66}},
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
    model control

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
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
        inContinue(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-110,-44},{-90,-24}})));
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
      FSDelegation fSDelegation(worktime=5)
        annotation (Placement(transformation(extent={{-36,50},{-4,74}})));
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

    equation
      connect(inOrder, fSDelegation.In_Order) annotation (Line(
          points={{-104,70},{-64,70},{-64,68.4},{-36.2,68.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(inContinue, fSDelegation.In_Continue) annotation (Line(
          points={{-100,-34},{-54,-34},{-54,59.9},{-35.8,59.9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSDelegation.Out_Done, OutDone) annotation (Line(
          points={{-4,69.8},{46,69.8},{46,70},{102,70}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSDelegation.Out_Fail, outFail) annotation (Line(
          points={{-3.8,57.8},{60.1,57.8},{60.1,-28},{100,-28}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(outFlowOfTank.y, outFlowTank) annotation (Line(
          points={{-41.9,-65},{-41.9,-40.5},{-32,-40.5},{-32,-118}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(outFlowOfTank.y, integratorBlock.x) annotation (Line(
          points={{-41.9,-65},{-41.9,14.5},{-28.6,14.5},{-28.6,13.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(integratorBlock.out, fSDelegation.amountGiven) annotation (Line(
          points={{-7.9,14.1},{-8,14.1},{-8,14},{8,14},{8,34},{-24.6,34},{-24.6,
              49.4}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(fluidSensorOfTank, fSDelegation.fluidSensor) annotation (Line(
          points={{69,-109},{69,-34},{70,-34},{70,42},{-9.2,42},{-9.2,49.6}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,100}}),      graphics));
    end control;

    model FSDelegation
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Safe_Delegation.Safe_Delegation_Slave(
        In_Order(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[1] "reals[1]"),
        In_Continue(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Fail(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Done(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        mailbox_Order(numberOfMessageReals=1),
        T1(numberOfMessageReals=1),
        T5(numberOfMessageReals=1),
        T3(condition=accessableAmountOfJuice < amountOfJuice),
        T2(condition=amountGiven >= amountOfJuice));
        Real amountOfJuice;
        Real accessableAmountOfJuice;
      Modelica.Blocks.Interfaces.RealInput amountGiven annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=90,
            origin={-66,-106})));
      Modelica.Blocks.Interfaces.RealInput fluidSensor annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=90,
            origin={88,-104})));
    equation
       when T1.fire then
          amountOfJuice = T1.transition_input_port[1].reals[1];
    accessableAmountOfJuice= fluidSensor;
         elsewhen T5.fire then
          amountOfJuice = T5.transition_input_port[1].reals[1];
          accessableAmountOfJuice= fluidSensor;
         end when;

           annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-180,
                -100},{140,140}}),      graphics));
    end FSDelegation;

    model Tank

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
    end Tank;

    model TankTest

      Tank tank(startLevel=100)
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
  end BottlingControl;

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

    model Central

      TemperatureObserver temperatureObserverBebot annotation (Placement(transformation(
            extent={{-29,-18},{29,18}},
            rotation=90,
            origin={-27,52})));
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
      FSMaster fSMasterBottlingControl(timeout=10)
                                                  annotation (Placement(transformation(extent={{76,28},
                {144,66}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InFail(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-72,92},{-52,112}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InDone(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-24,92},{-4,112}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             OutOrder(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[1] "reals[1]") annotation (Placement(transformation(extent={{60,90},{80,110}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort
                                                                                             OutContinue(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{20,92},{40,112}})));
      FSMasterToRobots
               fSMasterRobots(timeout=10)
                                         annotation (Placement(transformation(extent={{38,-66},
                {102,-26}})));
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
                                                                                             OutContinue1(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{22,-150},{42,-130}})));
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
      Modelica.Blocks.Interfaces.BooleanOutput coolerOn
        annotation (Placement(transformation(extent={{334,22},{382,70}})));
      Modelica.Blocks.Interfaces.RealOutput amountOfJuice annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={132,8})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step Initial(
        initialStep=true,
        nOut=2,
        nIn=3)
        annotation (Placement(transformation(extent={{200,40},{208,48}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(use_after=true,
          afterTime=0.001,
        condition=not temperatureObserverBebot.LimitViolated.active)
        annotation (Placement(transformation(extent={{200,16},{208,24}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step ChooseNewTarget(nIn=
           1, nOut=2)
        annotation (Placement(transformation(extent={{200,-14},{208,-6}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T2(condition=from ==
            2 and to == 2,
        use_firePort=false,
        use_syncReceive=true, numberOfSyncReceive=1)
        annotation (Placement(transformation(extent={{208,-42},{200,-34}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step EnableBottling(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{202,-76},{210,-68}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T3(
          use_syncReceive=true, numberOfSyncReceive = 1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={298,8})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T4(
               use_syncSend=true, numberOfSyncSend=1,
        condition=not (from == 2 and to == 2))
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={254,-10})));

      RealTimeCoordinationLibrary.RealTimeCoordination.Step step1(nIn=1, nOut=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={258,38})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(
          use_syncReceive=true,numberOfSyncReceive=1)                                      annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={246,76})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step InformRobot(nOut=1, nIn=
           1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={270,-94})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(use_syncSend=true,numberOfSyncSend=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={234,-94})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(
          use_syncReceive=true, numberOfSyncReceive= 1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={298,-66})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step step3(nOut=1, nIn=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={298,-34})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step CoolingRobot(
        nIn=1,
        nOut=1,
        use_activePort=true)
        annotation (Placement(transformation(extent={{170,-48},{178,-40}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(condition=
            temperatureObserverBebot.LimitViolated.active,
        use_after=true,
        afterTime=0.001)
        annotation (Placement(transformation(extent={{172,-8},{180,0}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T9(condition=
            temperatureObserverBebot.LimitRedeemed.active)
        annotation (Placement(transformation(extent={{160,-76},{168,-68}})));
    algorithm
      when ChooseNewTarget.active then
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

        end if;
      end when;

      order:=0;
      amountOfJuice := 50;
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

    equation
        connect(fSMasterRobots.T3.sender[2],T7.receiver[1]);
       connect(fSMasterRobots.T1.receiver[2], T6.sender[1]);
      connect(fSMasterRobots.T3.sender[1],T5.receiver[1]);
       connect(fSMasterRobots.T1.receiver[1], T4.sender[1]);
      connect(fSMasterBottlingControl.T3.sender[1],T3.receiver[1]);
       connect(fSMasterBottlingControl.T1.sender[1],T2.receiver[1]);
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
          points={{-30.5292,78.7692},{-58,78.7692},{-58,76},{-100,76}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(temperatureObserverBebot.In_LimitViolated, BebotViolated) annotation (Line(
          points={{-30.8892,20.3231},{-54.2231,20.3231},{-54.2231,40},{-100,40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterBottlingControl.Out_Order, OutOrder) annotation (Line(
          points={{144.425,43.2},{156,43.2},{156,100},{70,100}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterBottlingControl.In_Fail, InFail) annotation (Line(
          points={{107.875,28.76},{110,28.76},{110,2},{-62,2},{-62,102}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterBottlingControl.Out_Continue, OutContinue) annotation (Line(
          points={{76,48.52},{26,48.52},{26,102},{30,102}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterBottlingControl.In_Done, InDone) annotation (Line(
          points={{76,62.58},{10,62.58},{10,102},{-14,102}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterRobots.In_Fail, InFail1) annotation (Line(
          points={{68,-65.2},{66,-65.2},{66,-110},{-38,-110},{-38,-140},{-70,-140}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterRobots.In_Done, InDone1) annotation (Line(
          points={{38,-29.6},{14,-29.6},{14,-90},{2,-90},{2,-140},{-10,-140}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterRobots.Out_Continue, OutContinue1) annotation (Line(
          points={{38,-44.4},{38,-44},{28,-44},{28,-140},{32,-140}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSMasterRobots.Out_Order, OutOrder1) annotation (Line(
          points={{102.4,-50},{112,-50},{112,-138},{84,-138}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fromexpr.y, fSMasterRobots.from) annotation (Line(
          points={{74,-97},{75.8,-97},{75.8,-73}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(toexpr.y, fSMasterRobots.to) annotation (Line(
          points={{88,-97},{88,-73},{87.4,-73}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(orderexpr.y, fSMasterRobots.order) annotation (Line(
          points={{102,-97},{102,-73},{99.8,-73}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(amountOfJuice, fSMasterBottlingControl.amountOfJuice) annotation (
          Line(
          points={{132,8},{124,8},{124,26.48},{123.6,26.48}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(Initial.outPort[1], T1.inPort) annotation (Line(
          points={{203,39.4},{203,32},{204,32},{204,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, ChooseNewTarget.inPort[1]) annotation (Line(
          points={{204,15},{204,-6}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(ChooseNewTarget.outPort[1], T2.inPort) annotation (Line(
          points={{203,-14.6},{203,-30},{204,-30},{204,-34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, EnableBottling.inPort[1]) annotation (Line(
          points={{204,-43},{204,-68},{206,-68}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, Initial.inPort[1]) annotation (Line(
          points={{298,13},{298,58},{202,58},{202,48},{202.667,48}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(ChooseNewTarget.outPort[2], T4.inPort) annotation (Line(
          points={{205,-14.6},{228,-14.6},{228,-14},{254,-14}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(T4.outPort, step1.inPort[1]) annotation (Line(
          points={{254,-5},{256,-5},{256,34},{258,34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T5.inPort) annotation (Line(
          points={{258,42.6},{256,42.6},{256,76},{250,76}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, Initial.inPort[2]) annotation (Line(
          points={{241,76},{204,76},{204,48}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step3.outPort[1], T3.inPort) annotation (Line(
          points={{298,-29.4},{298,4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.outPort, step3.inPort[1]) annotation (Line(
          points={{298,-61},{298,-38}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InformRobot.outPort[1], T7.inPort) annotation (Line(
          points={{274.6,-94},{298,-94},{298,-70}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(EnableBottling.outPort[1], T6.inPort) annotation (Line(
          points={{206,-76.6},{206,-94},{230,-94}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, InformRobot.inPort[1]) annotation (Line(
          points={{239,-94},{266,-94}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CoolingRobot.inPort[1], T8.outPort) annotation (Line(
          points={{174,-40},{174,-9},{176,-9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T8.inPort, Initial.outPort[2]) annotation (Line(
          points={{176,0},{176,39.4},{205,39.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CoolingRobot.outPort[1], T9.inPort) annotation (Line(
          points={{174,-48.6},{174,-90},{164,-90},{164,-68}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T9.outPort, Initial.inPort[3]) annotation (Line(
          points={{164,-77},{164,48},{205.333,48}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CoolingRobot.activePort, coolerOn) annotation (Line(
          points={{178.72,-44},{328,-44},{328,46},{358,46}},
          color={255,0,255},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -140},{340,100}}),                                                                     graphics), Icon(
            coordinateSystem(extent={{-100,-140},{340,100}})));
    end Central;

    model FSMaster
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Safe_Delegation.Safe_Delegation_Master(
        In_Done(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        In_Fail(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Order(
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Integer integers[0] "integers[0]",
          redeclare Real reals[1] "reals[1]"),
        Out_Continue(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Order_Message(numberOfMessageReals=1),
        T1(                         use_syncSend=true,numberOfSyncSend=1),
        T3(use_syncSend=true, numberOfSyncSend=1));

      Modelica.Blocks.Interfaces.RealInput amountOfJuice annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=90,
            origin={44,-48})));
    equation
      connect(amountOfJuice, Order_Message.u_reals[1]) annotation (Line(
          points={{44,-48},{68,-48},{68,38},{91,38}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-180,
                -40},{140,160}}),                                                                     graphics));
    end FSMaster;

    model FSMasterToRobots
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Safe_Delegation.Safe_Delegation_Master(
        In_Done(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        In_Fail(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Order(
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]",
          redeclare Integer integers[3] "integers[3]"),
        Out_Continue(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Order_Message(numberOfMessageIntegers=3),
        T1(use_syncReceive=true,numberOfSyncReceive=2),
        T3(use_syncSend=true,numberOfSyncSend=2));
      Modelica.Blocks.Interfaces.IntegerInput to annotation (Placement(
            transformation(
            extent={{-39,-39},{39,39}},
            rotation=90,
            origin={67,-75})));
      Modelica.Blocks.Interfaces.IntegerInput order annotation (Placement(
            transformation(
            extent={{-39,-39},{39,39}},
            rotation=90,
            origin={129,-75})));
      Modelica.Blocks.Interfaces.IntegerInput from annotation (Placement(
            transformation(
            extent={{-39,-39},{39,39}},
            rotation=90,
            origin={9,-75})));

    equation
      connect(from, Order_Message.u_integers[1]) annotation (Line(
          points={{9,-75},{9,-15.5},{91,-15.5},{91,47.2}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(to, Order_Message.u_integers[2]) annotation (Line(
          points={{67,-75},{67,-14.5},{91,-14.5},{91,47.2}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(order, Order_Message.u_integers[3]) annotation (Line(
          points={{129,-75},{129,-14.5},{91,-14.5},{91,47.2}},
          color={255,127,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-180,
                -40},{140,160}}),                                                                     graphics));
    end FSMasterToRobots;

    model Cooler
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
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{
                -100,-100},{100,100}}), graphics));
    end Cooler;
  end CentralControl;

  package RobotControl
    model FSD
      extends
        RealTimeCoordinationLibrary.CoordinationPattern.Fail_Safe_Delegation.Safe_Delegation_Slave(
        In_Order(
          redeclare Integer integers[3] "integers[3]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        In_Continue(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Fail(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        Out_Done(
          redeclare Integer integers[0] "integers[0]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]"),
        mailbox_Order(numberOfMessageIntegers=3),
        T5(numberOfMessageIntegers=3),
        T1(numberOfMessageIntegers=3, use_syncSend=false),
        T2(afterTime=0.2, use_syncReceive=true, numberOfSyncReceive=4),
        T3(condition=false));

    Integer from;
    Integer to;
    Integer order;

    equation
        when T1.fire then
          from = T1.transition_input_port[1].integers[1];
          to = T1.transition_input_port[1].integers[2];
          order = T1.transition_input_port[1].integers[3];
         elsewhen T5.fire then
          from = T1.transition_input_port[1].integers[1];
          to = T1.transition_input_port[1].integers[2];
          order = T1.transition_input_port[1].integers[3];
         end when;

         annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-180,
                -100},{140,140}}), graphics));
    end FSD;

    model RobotControl

      FSD fSD(             T2(afterTime=0.1), worktime=20)
              annotation (Placement(transformation(extent={{-38,14},{22,66}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
                                                                                            InContinue(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]") annotation (Placement(transformation(extent={{-110,14},
                {-90,34}})));
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

        //Station 1: Bahnhof der Robots, 2: Tank, 3: Kühlstraße, 4: Abladestation; 0.5 Schritte um Position zwischen den
        // einzelnen Stationen zu bestimmen
        Modelica.Blocks.Interfaces.RealOutput  robots[ 4,3](start= {{1,0,20},{1,0,20},{1,0,20},{1,0,20}});//first entry of the array robots determines the stop, the second entry the amount of juice transported by the robot,
         //the third entry determines the temperature of the robot's juice (20 degree as starting value)

         Master masterOfRobots[4](each timeout=3);

        Boolean set;
        Boolean watched;
        Integer to;
        Real temp(start=20);
      Modelica.Blocks.Interfaces.RealOutput temperatureOfObservedBebotAtStop3
        annotation (Placement(transformation(
            extent={{-15,-15},{15,15}},
            rotation=270,
            origin={155,-167})));
      Modelica.Blocks.Sources.RealExpression tempRobot(y=temp) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={156,-116})));
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
      RealTimeCoordinationLibrary.RealTimeCoordination.Step CheckOrder(       nOut=4, nIn=1)
        annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={78,-42})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(
        use_after=true,
        afterTime=0.00001,
        condition=fSD.Working.active)                  annotation (Placement(
            transformation(
            extent={{4,-4},{-4,4}},
            rotation=0,
            origin={46,-26})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T2(condition=fSD.from
             == 3 and fSD.to == 3)                                   annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={78,-56})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step CoolDownRobot(nIn=1,
          nOut=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={84,-76})));
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
            origin={26,-76})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T4(condition=not (
            fSD.from == fSD.to))
        annotation (Placement(transformation(extent={{20,-60},{28,-52}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(use_syncSend=true,numberOfSyncSend=1)
                                                                     annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={84,-94})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(use_syncSend=true,numberOfSyncSend=1,
        condition=amountOfFlowBlock.out >= fSD.order)                annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={46,-94})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(use_syncSend=true,numberOfSyncSend=1)
                                                                     annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={16,-146})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(condition=fSD.from
             == 4 and fSD.to == 4)
        annotation (Placement(transformation(extent={{106,-58},{114,-50}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Step UnloadRobot(nIn=1, nOut=
           1) annotation (Placement(transformation(extent={{108,-78},{116,-70}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T9(use_syncSend=true,numberOfSyncSend=1)
        annotation (Placement(transformation(extent={{110,-98},{118,-90}})));

      Modelica.Blocks.Sources.IntegerExpression goal(y=to)
        annotation (Placement(transformation(extent={{-92,-132},{-72,-112}})));
       // Boolean moveRobot[4];
        Modelica.Blocks.Interfaces.BooleanOutput startMoving[4](each start=false);
      RealTimeCoordinationLibrary.RealTimeCoordination.Step targetReached(nIn=1,
          nOut=1)
        annotation (Placement(transformation(extent={{12,-130},{20,-122}})));
      RealTimeCoordinationLibrary.RealTimeCoordination.Transition T10(
          use_syncReceive=true, numberOfSyncReceive= 4)
        annotation (Placement(transformation(extent={{12,-96},{20,-88}})));

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
                   robots[i,1]:=to;
                   //moveRobot[i]:=true;
                   startMoving[i] := true;
                 end if;
               end for;
            end if;
          end for;
        end when;

        /*for i in 1:size(robots,1) loop
      when masterOfRobots[i].T4.fire then
        robots[i,1] :=to;
      end when;
    end for;*/
        when not SendRobotToNextStop.active then
          for i in 1:size(robots,1) loop
            startMoving[i] := false;
          end for;
        end when;
       // if FillRobot.active then
           //for from in 1:size(robots,1) loop
          // to := if fSD.from ==4 then 1 else fSD.from +1;
           // if fSD.from == from then
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
           // end if;
          //end for;
      //  end if;

        when UnloadRobot.active then
           /*for from in 1:size(robots,1) loop
       to := if fSD.from ==4 then 1 else fSD.from +1;
        if fSD.from == from then*/
             set := false;
               for i in 1:size(robots,1) loop
                 if robots[i,1] == 4 and not set then // choose the first robot at stop 'from'
                   set:= true;
                   robots[i,2]:=0;  // set the filling level of the robot to 0, since the juice is unloaded
                   robots[i,3] :=20; // set the temperature to default,
                 end if;
               end for;
           // end if;
          //end for;
        end when;

      /* when  CoolDownRobot.active then
       for from in 1:size(robots,1) loop
       to := if fSD.from ==4 then 1 else fSD.from +1;
        if fSD.from == from then
         set := false;
           for i in 1:size(robots,1) loop
             if robots[i,1] == from and not set then // choose the first robot at stop 'from'
               set:= true;
               robots[i,3] :=60;
             end if;
           end for;
        end if;
      end for;
  end when;*/

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

      for i in 1:4 loop

      //  startMoving[i].y=moveRobot[i];
        connect(startMoving[i],masterOfRobots[i].moveRobot);
        connect(T10.receiver[i], masterOfRobots[i].T4.sender[1]);
        end for;

       for i in 1:4 loop
          connect(goal.y, masterOfRobots[i].goal);
       end for;

      connect(fSD.Out_Done, OutDone)
        annotation (Line(
          points={{22,56.9},{59,56.9},{59,82},{202,82}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(fSD.Out_Fail, OutFail) annotation (Line(
          points={{22.375,30.9},{56.1812,30.9},{56.1812,30},{198,30}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InOrder, fSD.In_Order) annotation (Line(
          points={{-100,62},{-69,62},{-69,53.8667},{-38.375,53.8667}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InContinue, fSD.In_Continue) annotation (Line(
          points={{-100,24},{-70,24},{-70,35.45},{-37.625,35.45}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(tempRobot.y, temperatureOfObservedBebotAtStop3) annotation (Line(
          points={{156,-127},{156,-167},{155,-167}},
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

      connect(CheckOrder.outPort[1], T2.inPort) annotation (Line(
          points={{76.5,-46.6},{50,-46.6},{50,-52},{78,-52}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, CoolDownRobot.inPort[1]) annotation (Line(
          points={{78,-61},{84,-61},{84,-72}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CheckOrder.outPort[2], T3.inPort) annotation (Line(
          points={{77.5,-46.6},{77.5,-54},{46,-54},{46,-58}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CheckOrder.outPort[3], T4.inPort) annotation (Line(
          points={{78.5,-46.6},{24,-46.6},{24,-52}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, SendRobotToNextStop.inPort[1]) annotation (Line(
          points={{24,-61},{24,-72},{26,-72}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(FillRobot.outPort[1], T6.inPort) annotation (Line(
          points={{54,-80.6},{54,-86},{46,-86},{46,-90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CoolDownRobot.outPort[1], T5.inPort) annotation (Line(
          points={{84,-80.6},{84,-90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, Initial.inPort[1]) annotation (Line(
          points={{84,-99},{84,-100},{-26,-100},{-26,-4},{42.5,-4},{42.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, Initial.inPort[2]) annotation (Line(
          points={{46,-99},{-14,-99},{-14,-10},{43.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.outPort, Initial.inPort[3]) annotation (Line(
          points={{16,-151},{-6,-151},{-6,-10},{44.5,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, FillRobot.inPort[1]) annotation (Line(
          points={{46,-67},{46,-66},{54,-66},{54,-72}},
          color={0,0,0},
          smooth=Smooth.None));

      connect(fSD.T2.receiver[1],T5.sender[1]);
      connect(fSD.T2.receiver[2],T6.sender[1]);
      connect(fSD.T2.receiver[3],T7.sender[1]);
      connect(fSD.T2.receiver[4],T9.sender[1]);
      connect(CheckOrder.outPort[4], T8.inPort) annotation (Line(
          points={{79.5,-46.6},{78,-46.6},{78,-50},{110,-50}},
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
      connect(T9.outPort, Initial.inPort[4]) annotation (Line(
          points={{114,-99},{132,-99},{132,-10},{45.5,-10}},
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

      connect(SendRobotToNextStop.outPort[1], T10.inPort) annotation (Line(
          points={{26,-80.6},{18,-80.6},{18,-88},{16,-88}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T10.outPort, targetReached.inPort[1]) annotation (Line(
          points={{16,-97},{16,-104},{14,-104},{14,-110},{16,-110},{16,-122}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(targetReached.outPort[1], T7.inPort) annotation (Line(
          points={{16,-130.6},{16,-142}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -160},{200,100}}),                                                                     graphics), Icon(
            coordinateSystem(extent={{-100,-160},{200,100}})));
    end RobotControl;

    model testIntegrator
      IntegratorBlock integratorBlock
        annotation (Placement(transformation(extent={{-14,20},{6,40}})));
      Modelica.Blocks.Sources.TimeTable timeTable(table=[0,0; 1,1; 2,4; 3,0; 4,
            5; 5,0; 6,2; 7,1])
        annotation (Placement(transformation(extent={{-90,30},{-70,50}})));
    equation
      connect(timeTable.y, integratorBlock.x) annotation (Line(
          points={{-69,40},{-36,40},{-36,40.6},{-4.4,40.6}},
          color={0,0,127},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{
                -100,-100},{100,100}}), graphics));
    end testIntegrator;

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
        T1(use_conditionPort=true),
        T4(use_syncSend=true,numberOfSyncSend=1));
      Modelica.Blocks.Interfaces.IntegerInput goal annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={58,148})));
      Modelica.Blocks.Interfaces.BooleanInput moveRobot annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=180,
            origin={112,52})));
    equation
      connect(message.u_integers[1], goal) annotation (Line(
          points={{57,103.2},{57,112.6},{58,112.6},{58,148}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T1.conditionPort, moveRobot) annotation (Line(
          points={{-8,75},{-8,66},{0,66},{0,58},{56,58},{56,52},{112,52}},
          color={255,0,255},
          smooth=Smooth.None));
      annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                -100},{100,140}}),      graphics), Icon(coordinateSystem(extent=
               {{-100,-100},{100,140}})));
    end Master;

    package Robot
      model RobotTest

        Real speedLeft(start=0);
        Real speedRight(start=0);

        Modelica.Blocks.Sources.RealExpression left(y=speedLeft)
          annotation (Placement(transformation(extent={{-100,-46},{-80,-26}})));
        Modelica.Blocks.Sources.RealExpression right(y=speedRight)
                                                     annotation (Placement(
              transformation(
              extent={{-10,-10},{10,10}},
              rotation=180,
              origin={-6,-6})));
        Robot_V3 robot(xstart_wmr=0, ystart_wmr=0)
          annotation (Placement(transformation(extent={{-54,-44},{-24,-24}})));
        Modelica.Blocks.Sources.IntegerTable integerTable(table={{0,255},{1,0},{2,0}})
          annotation (Placement(transformation(extent={{-106,40},{-86,60}})));

        inner Modelica.Mechanics.MultiBody.World world(label2="z", n={0,0,-1})
          annotation (Placement(transformation(extent={{-16,36},{-6,46}})));
        Modelica.Blocks.Sources.IntegerTable integerTable1(table={{0,0},{1,255},{2,0}})
          annotation (Placement(transformation(extent={{-74,50},{-54,70}})));
        Modelica.Blocks.Sources.IntegerTable integerTable2(table={{0,0},{1,0},{2,255}})
          annotation (Placement(transformation(extent={{-38,50},{-18,70}})));
          Real posX;
          Real posY;
         // Real velocityVehicle= 5;
        RealTimeCoordinationLibrary.RealTimeCoordination.Step Station1(
          initialStep=true,
          nOut=1,
          nIn=1) annotation (Placement(transformation(extent={{26,78},{34,86}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step Station2(nOut=1, nIn=1)
          annotation (Placement(transformation(extent={{46,22},{54,30}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo90(nIn=1, nOut=1)
          annotation (Placement(transformation(extent={{46,-22},{54,-14}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T2(condition=phi >=
              Modelica.Constants.pi/2 + k*2*Modelica.Constants.pi)
          annotation (Placement(transformation(extent={{46,0},{54,8}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo180(nIn=1, nOut=1)
          annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=180,
              origin={84,-16})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T3(use_after=true,
            afterTime=2) annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=0,
              origin={50,-42})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step Station3(nIn=1, nOut=1)
          annotation (Placement(transformation(extent={{46,-70},{54,-62}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T4(condition=phi >=
              Modelica.Constants.pi + k*2*Modelica.Constants.pi) annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=180,
              origin={84,-44})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step Station4(nIn=1, nOut=1)
          annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=180,
              origin={84,32})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(use_after=true,
            afterTime=2) annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=180,
              origin={84,8})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(condition=phi >=
              1.5*Modelica.Constants.pi + k*2*Modelica.Constants.pi)
                                                                 annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=180,
              origin={84,52})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo0(nIn=1, nOut=1)
          annotation (Placement(transformation(extent={{28,46},{36,54}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(condition=phi >=
              k*2*Modelica.Constants.pi)
          annotation (Placement(transformation(extent={{24,64},{32,72}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(use_after=true,
            afterTime=2)
          annotation (Placement(transformation(extent={{30,30},{38,38}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo270(nOut=1, nIn=1)
          annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=270,
              origin={80,80})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(use_after=true,
            afterTime=2) annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=270,
              origin={60,86})));

          Real phi;
          Integer k(start=0);
        Visualizer visualizer
          annotation (Placement(transformation(extent={{-40,-82},{-20,-62}})));
      algorithm
         posX :=robot.Frame.r_0[1];
        posY:=robot.Frame.r_0[2];

        when sample(0, 0.001) then
          phi:= robot.wheelSet.phi;
        end when;
        when phi== k*2*Modelica.Constants.pi or phi==Modelica.Constants.pi/2+ k*2*Modelica.Constants.pi or phi==Modelica.Constants.pi+ k*2*Modelica.Constants.pi or phi==Modelica.Constants.pi*1.5+ k*2*Modelica.Constants.pi then

          speedLeft:=0;
          speedRight:=0;
        end when;

        when Station1.active or Station2.active or Station3.active or Station4.active then
          speedLeft:=-5;
          speedRight:=5;

        end when;
         when TurnTo270.active then
           k:=k+1;
         end when;
        when TurnTo0.active or TurnTo90.active or TurnTo180.active or TurnTo270.active then
          speedLeft:= 10;
          speedRight:=10;

        end when;

      equation

       // speedLeft=  if time <= 1 then -4.5  elseif time > 1 and time <4 then 10 else 4.5;

        //speedRight= if time <= 1 then 4.5 elseif time > 1 and time <4 then 10 else -4.5;

        connect(left.y, robot.omegaL_des) annotation (Line(
            points={{-79,-36},{-66,-36},{-66,-34},{-53,-34}},
            color={0,0,127},
            smooth=Smooth.None));
        connect(right.y, robot.omegaR_des) annotation (Line(
            points={{-17,-6},{-6,-6},{-6,-34},{-25,-34}},
            color={0,0,127},
            smooth=Smooth.None));
        connect(integerTable.y, robot.red) annotation (Line(
            points={{-85,50},{-68,50},{-68,-23.6},{-48.8,-23.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerTable1.y, robot.green) annotation (Line(
            points={{-53,60},{-40,60},{-40,-8},{-39,-8},{-39,-23.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerTable2.y, robot.blue) annotation (Line(
            points={{-17,60},{-20,60},{-20,-23.6},{-27.4,-23.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(Station2.outPort[1], T2.inPort) annotation (Line(
            points={{50,21.4},{50,8}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T2.outPort, TurnTo90.inPort[1]) annotation (Line(
            points={{50,-1},{50,-14}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(TurnTo90.outPort[1], T3.inPort) annotation (Line(
            points={{50,-22.6},{50,-38}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T3.outPort, Station3.inPort[1]) annotation (Line(
            points={{50,-47},{50,-62}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(Station3.outPort[1], T4.inPort) annotation (Line(
            points={{50,-70.6},{84,-70.6},{84,-48}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T4.outPort, TurnTo180.inPort[1]) annotation (Line(
            points={{84,-39},{84,-20}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(TurnTo180.outPort[1], T5.inPort) annotation (Line(
            points={{84,-11.4},{84,4}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T5.outPort, Station4.inPort[1]) annotation (Line(
            points={{84,13},{84,28}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(Station1.outPort[1], T1.inPort) annotation (Line(
            points={{30,77.4},{30,72},{28,72}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T1.outPort, TurnTo0.inPort[1]) annotation (Line(
            points={{28,63},{30,63},{30,54},{32,54}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(TurnTo0.outPort[1], T7.inPort) annotation (Line(
            points={{32,45.4},{34,45.4},{34,38}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T7.outPort, Station2.inPort[1]) annotation (Line(
            points={{34,29},{42,29},{42,30},{50,30}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(Station4.outPort[1], T6.inPort) annotation (Line(
            points={{84,36.6},{84,48}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T8.inPort, TurnTo270.outPort[1]) annotation (Line(
            points={{64,86},{66,86},{66,82},{70,82},{70,80},{75.4,80}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(TurnTo270.inPort[1], T6.outPort) annotation (Line(
            points={{84,80},{80,80},{80,57},{84,57}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T8.outPort, Station1.inPort[1]) annotation (Line(
            points={{55,86},{30,86}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(visualizer.Frame, robot.Frame) annotation (Line(
            points={{-40,-70.8},{-34,-70.8},{-34,-28},{-39,-28}},
            color={95,95,95},
            thickness=0.5,
            smooth=Smooth.None));
        connect(integerTable.y, visualizer.red) annotation (Line(
            points={{-85,50},{-60,50},{-60,-61.6},{-37,-61.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerTable1.y, visualizer.green) annotation (Line(
            points={{-53,60},{-42,60},{-42,-61.4},{-29.8,-61.4}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerTable2.y, visualizer.blue) annotation (Line(
            points={{-17,60},{-20,60},{-20,-61.4},{-23.8,-61.4}},
            color={255,127,0},
            smooth=Smooth.None));
        annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-100,
                  -100},{100,100}}), graphics),
          experiment(StopTime=3),
          __Dymola_experimentSetupOutput);
      end RobotTest;

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
          annotation (Placement(transformation(extent={{20,-50},{40,-30}})));
        Modelica.Mechanics.MultiBody.Visualizers.FixedShape fixedShape(
          shapeType="box",
          length=0.09,
          width=d_wheel,
          color={red,green,blue},
          r_shape={-0.045,0,0.02},
          lengthDirection={1,0,0},
          widthDirection={0,1,0},
          height=0.05)
          annotation (Placement(transformation(extent={{20,-80},{40,-60}})));
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
        connect(omegaL_des, dCMotorCtrl_V4L.DesSp) annotation (Line(
            points={{-140,0},{-38,0}},
            color={0,0,127},
            smooth=Smooth.None));
        connect(dCMotorCtrl_V4R.DesSp, omegaR_des) annotation (Line(
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
"),   Diagram(coordinateSystem(preserveAspectRatio=false,extent={{-150,-100},{
                  150,100}}),  graphics), Icon(coordinateSystem(preserveAspectRatio=true,
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
          T2(condition=false),
          T3(use_syncReceive=true,numberOfSyncReceive=1));

          Modelica.Blocks.Interfaces.IntegerOutput goal(start=2);
      equation
       when T1.fire then
            goal = T1.transition_input_port[1].integers[1];
       end when;
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
        Robot_V3 robot_V3_1(xstart_wmr=0, ystart_wmr=0)
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
          nIn=1) annotation (Placement(transformation(extent={{128,-4},{136,4}})));
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
              origin={190,-24})));
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
          annotation (Placement(transformation(extent={{212,84},{232,104}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.InputDelegationPort
          in_Order(
          redeclare Integer integers[1] "integers[1]",
          redeclare Boolean booleans[0] "booelans[0]",
          redeclare Real reals[0] "reals[0]")
          annotation (Placement(transformation(extent={{210,-18},{230,2}})));
        Delegation_Slave delegation_Slave(worktime=3.5)
                                          annotation (Placement(transformation(
              extent={{10,-10},{-10,10}},
              rotation=180,
              origin={196,40})));
        Modelica.Blocks.Math.RealToInteger realToInteger annotation (Placement(
              transformation(
              extent={{-10,-10},{10,10}},
              rotation=270,
              origin={-116,46})));
        Modelica.Blocks.Math.RealToInteger realToInteger1 annotation (Placement(
              transformation(
              extent={{-10,-10},{10,10}},
              rotation=270,
              origin={-58,44})));
        Modelica.Blocks.Math.RealToInteger realToInteger2 annotation (Placement(
              transformation(
              extent={{-9,-9},{9,9}},
              rotation=270,
              origin={1,47})));
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
        RealTimeCoordinationLibrary.RealTimeCoordination.Step step1(nIn=4, nOut=1)
          annotation (Placement(transformation(
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
        Modelica.Blocks.Sources.IntegerExpression integerExpression
          annotation (Placement(transformation(extent={{-10,-10},{10,10}},
              rotation=270,
              origin={-100,6})));
        Visualizer bottle
          annotation (Placement(transformation(extent={{-118,-76},{-98,-56}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step Station1(
          initialStep=false,
          nIn=1,
          nOut=1)
                 annotation (Placement(transformation(extent={{34,-124},{42,-116}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step Station2(nIn=1, nOut=1)
          annotation (Placement(transformation(extent={{98,-126},{106,-118}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo90(nIn=1, nOut=1)
          annotation (Placement(transformation(extent={{98,-176},{106,-168}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T2(condition=phi >=
              Modelica.Constants.pi/2 + k*2*Modelica.Constants.pi)
          annotation (Placement(transformation(extent={{98,-154},{106,-146}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo180(nIn=1, nOut=1)
          annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=0,
              origin={150,-170})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T3(use_after=true,
            afterTime=2) annotation (Placement(transformation(
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
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T5(use_after=true,
            afterTime=2) annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=0,
              origin={154,-196})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T6(condition=phi >=
              1.5*Modelica.Constants.pi + k*2*Modelica.Constants.pi)
                                                                 annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=0,
              origin={192,-156})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo0(nIn=1, nOut=1)
          annotation (Placement(transformation(extent={{32,-172},{40,-164}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T1(condition=phi >=
              k*2*Modelica.Constants.pi)
          annotation (Placement(transformation(extent={{34,-152},{42,-144}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T7(use_after=true,
            afterTime=2)
          annotation (Placement(transformation(extent={{32,-204},{40,-196}})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Step TurnTo270(nIn=1, nOut=1)
          annotation (Placement(transformation(
              extent={{-4,-4},{4,4}},
              rotation=0,
              origin={192,-178})));
        RealTimeCoordinationLibrary.RealTimeCoordination.Transition T8(use_after=true,
            afterTime=2) annotation (Placement(transformation(
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
              origin={94,106})));
        Modelica.Blocks.Sources.IntegerExpression integerExpression1(y=if
              warmth > 20 and warmth < 80 then 125 elseif warmth >= 80 then 255
               else 0) annotation (Placement(transformation(
              extent={{-10,-10},{10,10}},
              rotation=270,
              origin={40,32})));
        Modelica.Blocks.Sources.IntegerExpression integerExpression2
          annotation (Placement(transformation(
              extent={{-10,-10},{10,10}},
              rotation=270,
              origin={64,34})));
        Modelica.Blocks.Sources.IntegerExpression integerExpression3(y=if
              warmth > 20 and warmth < 80 then 125 elseif warmth >= 80 then 0
               else 255) annotation (Placement(transformation(
              extent={{-10,-10},{10,10}},
              rotation=270,
              origin={94,32})));
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
        when TurnTo0.active or TurnTo90.active or TurnTo180.active or TurnTo270.active then
          speedLeft:= 20;
          speedRight:=20;

        end when;

      equation
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
            points={{185.8,30.6},{187.9,30.6},{187.9,-8},{220,-8}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(delegation_Slave.Out_Delegation_Succeded, success) annotation (Line(
            points={{206,47.8},{206,98},{166,98}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(delegation_Slave.Out_Delegation_Failed, fail) annotation (Line(
            points={{206,40.6},{222,40.6},{222,94}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(red, realToInteger.u) annotation (Line(
            points={{-124,106},{-122,106},{-122,58},{-116,58}},
            color={0,0,127},
            smooth=Smooth.None));
        connect(green, realToInteger1.u) annotation (Line(
            points={{-58,108},{-58,56}},
            color={0,0,127},
            smooth=Smooth.None));
        connect(blue, realToInteger2.u) annotation (Line(
            points={{2,106},{2,57.8},{1,57.8}},
            color={0,0,127},
            smooth=Smooth.None));
        connect(bottle.Frame, robot_V3_1.Frame) annotation (Line(
            points={{-118,-64.8},{-118,-90},{-28,-90},{-28,-18},{-18,-18},{-18,
                -16},{-7,-16}},
            color={95,95,95},
            thickness=0.5,
            smooth=Smooth.None));
        connect(stop.outPort[1], T10.inPort) annotation (Line(
            points={{132,-4.6},{130,-4.6},{130,-20},{128,-20}},
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
            points={{38,-153},{38,-164},{36,-164}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(TurnTo0.outPort[1], T7.inPort) annotation (Line(
            points={{36,-172.6},{36,-196}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(Station2.outPort[1], T2.inPort) annotation (Line(
            points={{102,-126.6},{102,-146}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T2.outPort, TurnTo90.inPort[1]) annotation (Line(
            points={{102,-155},{102,-155},{102,-168}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(TurnTo90.outPort[1], T3.inPort) annotation (Line(
            points={{102,-176.6},{102,-192}},
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
            points={{150,-174.6},{152,-174.6},{152,-192},{154,-192}},
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
            points={{192,-182.6},{192,-194}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T8.outPort, step1.inPort[1]) annotation (Line(
            points={{192,-203},{217.5,-203},{217.5,-60}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T5.outPort, step1.inPort[2]) annotation (Line(
            points={{154,-201},{154,-216},{220,-216},{220,-60},{216.5,-60}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T3.outPort, step1.inPort[3]) annotation (Line(
            points={{102,-201},{102,-230},{216,-230},{216,-60},{215.5,-60}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T7.outPort, step1.inPort[4]) annotation (Line(
            points={{36,-205},{218,-205},{218,-60},{214.5,-60}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(step1.outPort[1], T12.inPort) annotation (Line(
            points={{216,-51.4},{204,-51.4},{204,-28},{190,-28}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(T12.outPort, stop.inPort[1]) annotation (Line(
            points={{190,-19},{162,-19},{162,4},{132,4}},
            color={0,0,0},
            smooth=Smooth.None));
        connect(integerExpression.y, bottle.blue) annotation (Line(
            points={{-100,-5},{-96,-5},{-96,-55.4},{-101.8,-55.4}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerExpression1.y, robot_V3_1.red) annotation (Line(
            points={{40,21},{-18,21},{-18,-11.6},{-16.8,-11.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerExpression2.y, robot_V3_1.green) annotation (Line(
            points={{64,23},{64,6},{-8,6},{-8,-10},{-8,-12},{-8,-11.6},{-7,
                -11.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerExpression3.y, robot_V3_1.blue) annotation (Line(
            points={{94,21},{92,21},{92,-11.6},{4.6,-11.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(integerExpression.y, bottle.red) annotation (Line(
            points={{-100,-5},{-118,-5},{-118,-55.6},{-115,-55.6}},
            color={255,127,0},
            smooth=Smooth.None));
        connect(realToInteger1.y, bottle.green) annotation (Line(
            points={{-58,33},{-106,33},{-106,-55.4},{-107.8,-55.4}},
            color={255,127,0},
            smooth=Smooth.None));
       annotation (Diagram(coordinateSystem(preserveAspectRatio=false, extent={{-140,
                  -240},{220,100}}), graphics), Icon(coordinateSystem(extent={{-140,-240},
                  {220,100}})));
      end Robot;
    end Robot;
  end RobotControl;
  annotation (uses(Modelica(version="3.2"), RealTimeCoordinationLibrary(version=
           "1.0.2"),
      Modelica_StateGraph2(version="2.0.2")));
end demonstrator;
