within ;
package Projekt
  model Testmodell
  Integer i;
  Integer k;
    Modelica_StateGraph2.Step step1(initialStep=true, nOut=1)
      annotation (Placement(transformation(extent={{-44,82},{-36,90}})));
    Modelica_StateGraph2.Parallel step2(nIn=1, nEntry=2,
      use_outPort=true,
      use_suspend=true,
      nOut=1,
      nExit=2)
      annotation (Placement(transformation(extent={{-84,-42},{96,46}})));
    RealTimeCoordination.Transition T1(use_after=true, afterTime=0.5)
      annotation (Placement(transformation(extent={{-44,56},{-36,64}})));
    RealTimeCoordination.Step step3(nIn=1,
      nOut=1,
      use_activePort=true)
      annotation (Placement(transformation(extent={{4,-4},{-4,4}},
          rotation=270,
          origin={-68,18})));
    RealTimeCoordination.Step step4(nIn=1, nOut=1)
      annotation (Placement(transformation(extent={{62,12},{70,20}})));
    RealTimeCoordination.Step step5(nIn=1)
      annotation (Placement(transformation(extent={{-60,-92},{-52,-84}})));
    RealTimeCoordination.Transition T2
      annotation (Placement(transformation(extent={{-36,-56},{-28,-48}})));
    RealTimeCoordination.Message message(nIn=1, numberOfMessageIntegers=1)
      annotation (Placement(transformation(extent={{-32,-6},{-12,14}})));
    RealTimeCoordination.Transition T3(
      use_firePort=true,
      afterTime=0.3,
      use_conditionPort=true,
      use_after=false)
      annotation (Placement(transformation(extent={{-72,-6},{-64,2}})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression(y=i)
      annotation (Placement(transformation(extent={{-128,24},{-108,44}})));
    RealTimeCoordination.Transition T4(
      use_messageReceive=true,
      use_after=true,
      numberOfMessageIntegers=1,
      numberOfMessageReceive=1,
      afterTime=3)
      annotation (Placement(transformation(extent={{66,-18},{74,-10}})));
    RealTimeCoordination.Step step6(nIn=1, nOut=1)
      annotation (Placement(transformation(extent={{32,-28},{40,-20}})));
    Modelica_StateGraph2.Step step7(nIn=1, nOut=1)
      annotation (Placement(transformation(extent={{-64,-30},{-56,-22}})));
    RealTimeCoordination.Mailbox mailbox(
      queueSize=20,
      numberOfMessageIntegers=1,
      nIn=1,
      nOut=1) annotation (Placement(transformation(extent={{4,6},{24,26}})));
    RealTimeCoordination.TimeElements.Clock clock(nu=1) annotation (Placement(
          transformation(
          extent={{-10,-10},{10,10}},
          rotation=180,
          origin={-122,14})));
    RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
      clockConstraintGreater(bound=5)
      annotation (Placement(transformation(extent={{-132,-32},{-112,-12}})));
  algorithm
    i := 4;

    when (pre(T4.fire)) then
      k := pre(T4.transition_input_port[1].integers[1]);
    end when;

  equation

    connect(step1.outPort[1], T1.inPort) annotation (Line(
        points={{-40,81.4},{-40,64}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(T1.outPort, step2.inPort[1]) annotation (Line(
        points={{-40,55},{-40,46},{6,46}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step2.entry[2], step4.inPort[1]) annotation (Line(
        points={{10.5,41.6},{66,41.6},{66,20}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step2.entry[1], step3.inPort[1]) annotation (Line(
        points={{1.5,41.6},{-53.5,41.6},{-53.5,18},{-64,18}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step2.outPort[1], T2.inPort) annotation (Line(
        points={{6,-43.1},{-34,-43.1},{-34,-48},{-32,-48}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(T2.outPort, step5.inPort[1]) annotation (Line(
        points={{-32,-57},{-34,-57},{-34,-84},{-56,-84}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step3.outPort[1], T3.inPort) annotation (Line(
        points={{-72.6,18},{-72.6,2},{-68,2}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(T3.firePort, message.conditionPort[1]) annotation (Line(
        points={{-63.8,-2},{-48,-2},{-48,-5.6},{-34,-5.6}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(integerExpression.y, message.u_integers[1]) annotation (Line(
        points={{-107,34},{-94,34},{-94,13.2},{-33,13.2}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(step4.outPort[1], T4.inPort) annotation (Line(
        points={{66,11.4},{70,11.4},{70,-10}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(T3.outPort, step7.inPort[1]) annotation (Line(
        points={{-68,-7},{-68,-22},{-60,-22}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step7.outPort[1], step2.exit[1]) annotation (Line(
        points={{-60,-30.6},{-60,-38.15},{1.5,-38.15}},
        color={0,0,0},
        smooth=Smooth.None));

    connect(T4.outPort, step6.inPort[1]) annotation (Line(
        points={{70,-19},{58,-19},{58,-20},{36,-20}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step6.outPort[1], step2.exit[2]) annotation (Line(
        points={{36,-28.6},{22,-28.6},{22,-38.15},{10.5,-38.15}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(message.message_output_port, mailbox.mailbox_input_port[1])
      annotation (Line(
        points={{-13,3},{-6.5,3},{-6.5,15},{5,15}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(mailbox.mailbox_output_port[1], T4.transition_input_port[1])
      annotation (Line(
        points={{23,15},{42.5,15},{42.5,-11.88},{65.1,-11.88}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(step3.activePort, clock.u[1]) annotation (Line(
        points={{-68,22.72},{-90,22.72},{-90,14},{-111.9,14}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(clock.y, clockConstraintGreater.clockValue) annotation (Line(
        points={{-133,14},{-133.5,14},{-133.5,-20.8}},
        color={0,0,127},
        smooth=Smooth.None));
    connect(clockConstraintGreater.firePort, T3.conditionPort) annotation (Line(
        points={{-110.5,-21},{-92.25,-21},{-92.25,-2},{-73,-2}},
        color={255,0,255},
        smooth=Smooth.None));
    annotation (Diagram(graphics));
  end Testmodell;

  package AsynchronousMessagesTest
    model Component1
    Integer speed;
      RealTimeCoordination.Step step1(initialStep=true, nOut=1)
        annotation (Placement(transformation(extent={{-26,76},{-18,84}})));
      RealTimeCoordination.Step step2(nIn=1)
        annotation (Placement(transformation(extent={{-28,-18},{-20,-10}})));
      RealTimeCoordination.Transition T1(use_firePort=true,
        use_after=true,
        afterTime=3)
        annotation (Placement(transformation(extent={{-26,36},{-18,44}})));
      RealTimeCoordination.Message message(nIn=1, numberOfMessageIntegers=1)
        annotation (Placement(transformation(extent={{20,38},{40,58}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        outputDelegationPort(
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]",
        redeclare Integer integers[1] "integers[1]")
        annotation (Placement(transformation(extent={{68,20},{88,40}})));
      Modelica.Blocks.Sources.IntegerExpression Speed(y=speed)
        annotation (Placement(transformation(extent={{-132,34},{-112,54}})));
    algorithm
      speed :=5;

    equation
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{-22,75.4},{-22,44}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, step2.inPort[1]) annotation (Line(
          points={{-22,35},{-22,-10},{-24,-10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.firePort, message.conditionPort[1]) annotation (Line(
          points={{-17.8,40},{6,40},{6,38.4},{18,38.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(message.message_output_port, outputDelegationPort) annotation (Line(
          points={{39,47},{55.5,47},{55.5,30},{78,30}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Speed.y, message.u_integers[1])             annotation (Line(
          points={{-111,44},{-52,44},{-52,57.2},{19,57.2}},
          color={255,127,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Component1;

    model Component2
    Integer velocity;
      RealTimeCoordination.Step step1(initialStep=true, nOut=1)
        annotation (Placement(transformation(extent={{-22,62},{-14,70}})));
      RealTimeCoordination.Step step2(nIn=1)
        annotation (Placement(transformation(extent={{-22,-10},{-14,-2}})));
      RealTimeCoordination.Mailbox mailbox(
        nIn=1,
        nOut=1,
        numberOfMessageIntegers=1,
        queueSize=20)
        annotation (Placement(transformation(extent={{-82,22},{-62,42}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort inputDelegationPort(
        redeclare Integer integers[1] "integers[1]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-92,66},{-72,86}})));
      RealTimeCoordination.Transition T1(
        use_messageReceive=true,
        numberOfMessageReceive=1,
        numberOfMessageIntegers=1,
        use_after=true,
        use_firePort=false,
        afterTime=3)
        annotation (Placement(transformation(extent={{-20,26},{-12,34}})));
    algorithm

      when T1.fire then
        velocity := T1.transition_input_port[1].integers[1];
      end when;

    equation
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{-18,61.4},{-16,61.4},{-16,34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, step2.inPort[1]) annotation (Line(
          points={{-16,25},{-16,-2},{-18,-2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(inputDelegationPort, mailbox.mailbox_input_port[1]) annotation (Line(
          points={{-82,76},{-82,48},{-81,31}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(mailbox.mailbox_output_port[1], T1.transition_input_port[1])
        annotation (Line(
          points={{-63,31},{-41.5,31},{-41.5,32.12},{-20.9,32.12}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Component2;

    model Communication
      Component1 component1_1
        annotation (Placement(transformation(extent={{-78,38},{-58,58}})));
      Component2 component2_1
        annotation (Placement(transformation(extent={{-14,44},{6,64}})));
    equation
      connect(component1_1.outputDelegationPort, component2_1.inputDelegationPort)
        annotation (Line(
          points={{-60.2,51},{-34.1,51},{-34.1,61.6},{-12.2,61.6}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Communication;
  end AsynchronousMessagesTest;

  package SynchronousMessageTest
    model SynchComponent
      RealTimeCoordination.Step step1(nOut=1, nIn=1)
        annotation (Placement(transformation(extent={{-56,18},{-48,26}})));
      RealTimeCoordination.Step step2(nIn=1)
        annotation (Placement(transformation(extent={{-60,-46},{-52,-38}})));
      RealTimeCoordination.Transition T1(
        use_syncSend=true,
        numberOfSyncSend=1,
        use_after=true,
        afterTime=0.1)
        annotation (Placement(transformation(extent={{-58,-16},{-50,-8}})));
      Modelica_StateGraph2.Parallel step3(
        nEntry=2,
        initialStep=true,
        use_outPort=false)
        annotation (Placement(transformation(extent={{-88,-66},{34,54}})));
      RealTimeCoordination.Step step4(nOut=1, nIn=1)
        annotation (Placement(transformation(extent={{4,22},{12,30}})));
      RealTimeCoordination.Step step5(nIn=1)
        annotation (Placement(transformation(extent={{2,-48},{10,-40}})));
      RealTimeCoordination.Transition T2(
        use_syncReceive=true,
        numberOfSyncReceive=1,
        use_after=true,
        afterTime=2)
        annotation (Placement(transformation(extent={{2,-16},{10,-8}})));
    equation
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{-52,17.4},{-52,-8},{-54,-8}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, step2.inPort[1]) annotation (Line(
          points={{-54,-17},{-54,-38},{-56,-38}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step4.outPort[1], T2.inPort) annotation (Line(
          points={{8,21.4},{8,-8},{6,-8}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, step5.inPort[1]) annotation (Line(
          points={{6,-17},{6,-40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.sender[1], T2.receiver[1]) annotation (Line(
          points={{-51.4,-7.94},{-32.7,-7.94},{-32.7,-7.98},{3.18,-7.98}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(step3.entry[1], step1.inPort[1]) annotation (Line(
          points={{-30.05,48},{-40,48},{-40,26},{-52,26}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step3.entry[2], step4.inPort[1]) annotation (Line(
          points={{-23.95,48},{-10,48},{-10,30},{8,30}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end SynchComponent;
  end SynchronousMessageTest;

  package Synchronized_Collaboration
    model Collaboration_Slave
    parameter Real evaluationTime;
      Modelica_StateGraph2.Parallel step1(initialStep=true, nEntry=1)
        annotation (Placement(transformation(extent={{-98,-84},{98,78}})));
      RealTimeCoordination.Step Default(nIn=3, nOut=1)
        annotation (Placement(transformation(extent={{-40,42},{-32,50}})));
      RealTimeCoordination.Step EvaluatueProposal(
        nIn=1,
        nOut=2,
        use_activePort=true) annotation (Placement(transformation(
            extent={{4,-4},{-4,4}},
            rotation=90,
            origin={58,36})));
      RealTimeCoordination.Step CollaborationActive(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={0,-16})));
      RealTimeCoordination.Transition T1(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1,
        numberOfMessageIntegers=3)  annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={4,20})));
      RealTimeCoordination.Transition T2(use_firePort=true,
        use_after=true,
        afterTime=0.1)
        annotation (Placement(transformation(extent={{78,6},{70,14}})));
      RealTimeCoordination.Transition T3(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1)              annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={-60,8})));
      RealTimeCoordination.Transition T4(use_firePort=true,
        use_after=true,
        afterTime=0.1)                                      annotation (Placement(
            transformation(
            extent={{4,-4},{-4,4}},
            rotation=270,
            origin={14,50})));
      RealTimeCoordination.Mailbox activationProposal(nIn=1, nOut=1,
        numberOfMessageIntegers=3)
        annotation (Placement(transformation(extent={{-80,26},{-60,46}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        activationProposalInputPort(
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]",
        redeclare Integer integers[3] "integers[3]")
        annotation (Placement(transformation(extent={{-108,24},{-88,44}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        deactivationInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-110,-28},{-90,-8}})));
      RealTimeCoordination.Mailbox deactivation(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{-86,-30},{-66,-10}})));
      RealTimeCoordination.Message actiavtionAccepted(nIn=1)
        annotation (Placement(transformation(extent={{62,-58},{82,-38}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        activationAcceptedOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{90,-26},{110,-6}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        activationRejectedOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{84,54},{104,74}})));
      RealTimeCoordination.Message activationRejected(nIn=1)
        annotation (Placement(transformation(extent={{48,54},{68,74}})));
      RealTimeCoordination.TimeElements.Clock evalTime(nu=1)
        annotation (Placement(transformation(extent={{38,-8},{18,12}})));
      RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
        timeInvariantLessOrEqual(bound=evaluationTime)
        annotation (Placement(transformation(extent={{16,22},{36,42}})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_Weight annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={-48,-104})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_Friction annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={-30,-104})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_Height annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={-10,-104})));
    equation
      Out_Weight = T1.transition_input_port[1].integers[1];
      Out_Friction = T1.transition_input_port[1].integers[2];
      Out_Height = T1.transition_input_port[1].integers[3];

      connect(step1.entry[1], Default.inPort[1]) annotation (Line(
          points={{0,69.9},{-26,69.9},{-26,50},{-37.3333,50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Default.outPort[1], T1.inPort) annotation (Line(
          points={{-36,41.4},{-36,20},{0,20}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, EvaluatueProposal.inPort[1]) annotation (Line(
          points={{9,20},{54,20},{54,36}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(EvaluatueProposal.outPort[1], T2.inPort) annotation (Line(
          points={{62.6,37},{74,37},{74,14}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, CollaborationActive.inPort[1]) annotation (Line(
          points={{74,5},{74,-16},{4,-16}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CollaborationActive.outPort[1], T3.inPort) annotation (Line(
          points={{-4.6,-16},{-60,-16},{-60,4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, Default.inPort[2]) annotation (Line(
          points={{-60,13},{-60,60},{-42,60},{-42,50},{-36,50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(EvaluatueProposal.outPort[2], T4.inPort) annotation (Line(
          points={{62.6,35},{64,35},{64,50},{18,50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, Default.inPort[3]) annotation (Line(
          points={{9,50},{-34.6667,50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(activationProposalInputPort, activationProposal.mailbox_input_port[1])
        annotation (Line(
          points={{-98,34},{-88.5,34},{-88.5,35},{-79,35}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(activationProposal.mailbox_output_port[1], T1.transition_input_port[1])
        annotation (Line(
          points={{-61,35},{-40,14},{1.88,15.1}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(deactivationInputPort, deactivation.mailbox_input_port[1])
        annotation (Line(
          points={{-100,-18},{-94,-18},{-94,-21},{-85,-21}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(deactivation.mailbox_output_port[1], T3.transition_input_port[1])
        annotation (Line(
          points={{-67,-21},{-67,-20.5},{-55.1,-20.5},{-55.1,5.88}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.firePort, actiavtionAccepted.conditionPort[1]) annotation (Line(
          points={{69.8,10},{60,10},{60,-57.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(actiavtionAccepted.message_output_port, activationAcceptedOutputPort)
        annotation (Line(
          points={{81,-49},{87.5,-49},{87.5,-16},{100,-16}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.firePort, activationRejected.conditionPort[1]) annotation (Line(
          points={{14,54.2},{32,54.2},{32,54.4},{46,54.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(activationRejected.message_output_port, activationRejectedOutputPort)
        annotation (Line(
          points={{67,63},{80.5,63},{80.5,64},{94,64}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(EvaluatueProposal.activePort, evalTime.u[1]) annotation (Line(
          points={{58,31.28},{58,4},{38.1,4},{38.1,2}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(evalTime.y, timeInvariantLessOrEqual.clockValue) annotation (Line(
          points={{17,2},{14.5,2},{14.5,35.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(timeInvariantLessOrEqual.conditionPort, EvaluatueProposal.activePort)
        annotation (Line(
          points={{14.8,28.4},{40,30},{58,31.28}},
          color={255,0,255},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Collaboration_Slave;

    model Collaboration_Master
     parameter Real timeout;
      Modelica_StateGraph2.Parallel step1(
        use_outPort=false,
        use_suspend=false,
        initialStep=true,
        nEntry=1)
        annotation (Placement(transformation(extent={{-94,-70},{92,88}})));
      Modelica_StateGraph2.Step Default(nIn=4, nOut=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={-60,20})));
      Modelica_StateGraph2.Step Waiting(
        nOut=3,
        use_activePort=true,
        nIn=1)               annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={50,4})));
      RealTimeCoordination.Transition T2(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1)                   annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-6,24})));
      Modelica_StateGraph2.Step CollaborationActive(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-10,-40})));
      RealTimeCoordination.Transition T3(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1)
        annotation (Placement(transformation(extent={{58,-34},{66,-26}})));
      RealTimeCoordination.Transition T4(use_firePort=true,
        use_after=true,
        afterTime=0.1)                   annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={-78,-36})));
      RealTimeCoordination.Transition T5(use_conditionPort=true,
        use_after=true,
        afterTime=0.1)                                           annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={0,44})));
      RealTimeCoordination.TimeElements.Clock clock(nu=1) annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={0,4})));
      RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual
        clockConstraintGreaterOrEqual(bound=timeout)
        annotation (Placement(transformation(extent={{-140,52},{-120,72}})));
      RealTimeCoordination.Message activationProposal(nIn=1,
          numberOfMessageIntegers=3)                         annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=0,
            origin={54,66})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        activationProposalOutputPort(
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]",
        redeclare Integer integers[3] "integers[3]")
        annotation (Placement(transformation(extent={{82,56},{102,76}})));
      RealTimeCoordination.Mailbox activationRejected(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={64,36})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        activationRejectedInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{84,24},{104,44}})));
      RealTimeCoordination.Transition T1(use_firePort=true,
        use_after=true,
        afterTime=0.1)                                      annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-10,-16})));
      RealTimeCoordination.Mailbox activationAccepted(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={76,2})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        actiavtionAcceptedInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{84,-26},{104,-6}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        deactivationOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-92,-76},{-72,-56}})));
      RealTimeCoordination.Message deactivation(nIn=1) annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={-120,-38})));
      Modelica.Blocks.Interfaces.IntegerInput In_Weight annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={42,130})));
      Modelica.Blocks.Interfaces.IntegerInput In_Friction annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={82,130})));
      Modelica.Blocks.Interfaces.IntegerInput In_Height annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={122,130})));
    equation
      connect(Waiting.outPort[1], T2.inPort) annotation (Line(
          points={{51.3333,8.6},{51.3333,24},{-2,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, Default.inPort[1]) annotation (Line(
          points={{-11,24},{-61.5,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.entry[1], Default.inPort[2]) annotation (Line(
          points={{-1,80.1},{-60.5,80.1},{-60.5,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[2], T3.inPort) annotation (Line(
          points={{50,8.6},{62,8.6},{62,-26}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, CollaborationActive.inPort[1]) annotation (Line(
          points={{62,-35},{62,-40},{-6,-40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CollaborationActive.outPort[1], T4.inPort) annotation (Line(
          points={{-14.6,-40},{-78,-40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, Default.inPort[3]) annotation (Line(
          points={{-78,-31},{-78,24},{-59.5,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[3], T5.inPort) annotation (Line(
          points={{48.6667,8.6},{50,8.6},{50,44},{4,44}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, Default.inPort[4]) annotation (Line(
          points={{-5,44},{-58,44},{-58,24},{-58.5,24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.activePort, clock.u[1]) annotation (Line(
          points={{45.28,4},{36,4},{36,3.9},{26.1,3.9},{26.1,4},{10.1,4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(clock.y, clockConstraintGreaterOrEqual.clockValue) annotation (Line(
          points={{-11,4},{-26,4},{-26,-24},{-42,-24},{-42,-24},{-166,-24},{
              -166,63.2},{-141.5,63.2}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(clockConstraintGreaterOrEqual.firePort, T5.conditionPort) annotation (
         Line(
          points={{-118.5,63},{0,64},{9.18485e-016,49}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(activationProposal.message_output_port, activationProposalOutputPort)
        annotation (Line(
          points={{63,65},{77.5,65},{77.5,66},{92,66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(activationRejected.mailbox_input_port[1], activationRejectedInputPort)
        annotation (Line(
          points={{73,37},{72.5,37},{72.5,34},{94,34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Default.outPort[1], T1.inPort) annotation (Line(
          points={{-60,15.4},{-60,-18},{-14,-18},{-14,-16}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, Waiting.inPort[1]) annotation (Line(
          points={{-5,-16},{50,-16},{50,-4.44089e-016}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.firePort, activationProposal.conditionPort[1]) annotation (Line(
          points={{-10,-11.8},{16,-11.8},{16,56.4},{42,56.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(activationRejected.mailbox_output_port[1], T2.transition_input_port[1])
        annotation (Line(
          points={{55,37},{25.5,37},{25.5,28.9},{-3.88,28.9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(actiavtionAcceptedInputPort, activationAccepted.mailbox_input_port[1])
        annotation (Line(
          points={{94,-16},{90,-16},{90,0},{86,0},{86,3},{85,3}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(activationAccepted.mailbox_output_port[1], T3.transition_input_port[1])
        annotation (Line(
          points={{67,3},{64.5,3},{64.5,-27.88},{57.1,-27.88}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.firePort, deactivation.conditionPort[1]) annotation (Line(
          points={{-82.2,-36},{-94,-36},{-94,-28.4},{-108,-28.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(deactivation.message_output_port, deactivationOutputPort) annotation (
         Line(
          points={{-129,-37},{-138,-37},{-138,-66},{-82,-66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(In_Weight, activationProposal.u_integers[1]) annotation (Line(
          points={{42,130},{43,130},{43,76.5333}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_Friction, activationProposal.u_integers[2]) annotation (Line(
          points={{82,130},{64,130},{64,75.2},{43,75.2}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_Height, activationProposal.u_integers[3]) annotation (Line(
          points={{122,130},{84,130},{84,73.8667},{43,73.8667}},
          color={255,127,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Collaboration_Master;

    model MasterAndSlave
      Collaboration_Master collaboration_Master(timeout=4)
        annotation (Placement(transformation(extent={{-42,50},{42,80}})));
      Collaboration_Slave collaboration_Slave(evaluationTime=2)
        annotation (Placement(transformation(extent={{-2,-16},{72,16}})));
    equation
      connect(collaboration_Master.activationProposalOutputPort,
        collaboration_Slave.activationProposalInputPort) annotation (Line(
          points={{38.64,74.9},{58,76},{58,76},{64,36},{-10,36},{-12,6},{-6,6},
              {-6,5.44},{-1.26,5.44}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(collaboration_Master.deactivationOutputPort, collaboration_Slave.deactivationInputPort)
        annotation (Line(
          points={{-34.44,55.1},{-21.1,55.1},{-21.1,-2.88},{-2,-2.88}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(collaboration_Master.activationRejectedInputPort,
        collaboration_Slave.activationRejectedOutputPort) annotation (Line(
          points={{39.48,70.1},{97.7,70.1},{97.7,10.24},{69.78,10.24}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(collaboration_Master.actiavtionAcceptedInputPort,
        collaboration_Slave.activationAcceptedOutputPort) annotation (Line(
          points={{39.48,62.6},{85.7,62.6},{85.7,-2.56},{72,-2.56}},
          color={0,0,255},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end MasterAndSlave;

    model UseMaster
      Collaboration_Master collaboration_Master(timeout=2)
        annotation (Placement(transformation(extent={{-26,2},{-6,22}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        activationRejectedInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{30,34},{50,54}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        activationAcceptedInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{66,4},{86,24}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        activationProposalOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-70,40},{-50,60}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        deactivationOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-80,0},{-60,20}})));
    equation
      connect(collaboration_Master.actiavtionAcceptedInputPort,
        activationAcceptedInputPort) annotation (Line(
          points={{-6.6,10.4},{-6.6,11.2},{76,11.2},{76,14}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(collaboration_Master.activationRejectedInputPort,
        activationRejectedInputPort) annotation (Line(
          points={{-6.6,15.4},{-6,16},{40,16},{40,44}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(collaboration_Master.deactivationOutputPort,
        deactivationOutputPort) annotation (Line(
          points={{-24.2,5.4},{-46.1,5.4},{-46.1,10},{-70,10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(collaboration_Master.activationProposalOutputPort,
        activationProposalOutputPort) annotation (Line(
          points={{-6.8,18.6},{-32.4,18.6},{-32.4,50},{-60,50}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end UseMaster;

    model UseMasterAndSlave
      UseMaster useMaster
        annotation (Placement(transformation(extent={{-64,4},{-44,24}})));
      Collaboration_Slave collaboration_Slave(evaluationTime=2)
        annotation (Placement(transformation(extent={{-68,56},{-48,76}})));
    equation
      connect(collaboration_Slave.activationAcceptedOutputPort, useMaster.activationAcceptedInputPort)
        annotation (Line(
          points={{-48,64.4},{-22,64.4},{-22,15.4},{-46.4,15.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(useMaster.activationRejectedInputPort, collaboration_Slave.activationRejectedOutputPort)
        annotation (Line(
          points={{-50,18.4},{-50,34},{-30,34},{-30,72.4},{-48.6,72.4}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(useMaster.deactivationOutputPort, collaboration_Slave.deactivationInputPort)
        annotation (Line(
          points={{-61,15},{-68,14},{-90,14},{-90,60},{-68,60},{-68,64.2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(collaboration_Slave.activationProposalInputPort, useMaster.activationProposalOutputPort)
        annotation (Line(
          points={{-67.8,69.4},{-68,70},{-98,70},{-98,26},{-60,26},{-60,19}},
          color={0,0,255},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end UseMasterAndSlave;
  end Synchronized_Collaboration;

  package Turn_Transmission
    model Turn_Transmission_Partner

    parameter Real timeout;

      RealTimeCoordination.Step Inactive(nIn=3,
        initialStep=true,
        nOut=2)
        annotation (Placement(transformation(extent={{-20,50},{-12,58}})));
      RealTimeCoordination.Step TimedOut(nOut=1, nIn=2) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={18,-2})));
      RealTimeCoordination.Step MyTurn(nIn=2, nOut=3,
        use_activePort=true)                          annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={-24,-36})));
      RealTimeCoordination.Step YourTurn(nIn=2, nOut=3,
        use_activePort=true)
        annotation (Placement(transformation(extent={{44,-56},{52,-48}})));
      RealTimeCoordination.TimeElements.Clock clock(nu=4)
        annotation (Placement(transformation(extent={{36,66},{56,86}})));
      RealTimeCoordination.Mailbox mailbox(nIn=1, nOut=2,
        numberOfMessageIntegers=6,
        numberOfMessageBooleans=0,
        numberOfMessageReals=0)
        annotation (Placement(transformation(extent={{-70,2},{-50,22}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort InTurn(
        redeclare Integer integers[6] "integers[6]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-198,2},{-178,22}})));
      RealTimeCoordination.Message message(nIn=2, numberOfMessageIntegers=6)
        annotation (Placement(transformation(extent={{114,-30},{134,-10}})));
      RealTimeCoordination.Transition T1(
        use_messageReceive=true,
        numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1,
        numberOfMessageIntegers=6,
        use_firePort=true)
        annotation (Placement(transformation(extent={{-32,4},{-24,12}})));
      RealTimeCoordination.Transition T2(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        use_conditionPort=false,
        condition=true)
        annotation (Placement(transformation(extent={{74,-8},{82,0}})));
      RealTimeCoordination.Transition T3(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        condition=not In_Cancel)                               annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={18,-32})));
      RealTimeCoordination.Transition T4(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1,
        numberOfMessageIntegers=6,
        use_firePort=true,
        condition=not In_Cancel)    annotation (Placement(transformation(
            extent={{4,-4},{-4,4}},
            rotation=270,
            origin={16,-78})));
      RealTimeCoordination.Transition T5(use_after=true, afterTime=0.1)
                                         annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={28,16})));
      RealTimeCoordination.Transition T6(
        use_after=true,
        afterTime=0.1,
        use_firePort=false,
        use_conditionPort=true)          annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={-6,-24})));
      RealTimeCoordination.Transition T7(
        use_after=true,
        afterTime=0.1,
        use_conditionPort=true)          annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={62,-20})));

      RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreater
        clockConstraintGreater(bound=timeout) annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={50,18})));
      RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
        timeInvariantLessOrEqual(bound=timeout + 1)
        annotation (Placement(transformation(extent={{-12,-72},{8,-52}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort OutTurn(
        redeclare Integer integers[6] "integers[6]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{188,-32},{208,-12}})));
      RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual
        timeInvariantLessOrEqual1(bound=timeout + 1)
        annotation (Placement(transformation(extent={{64,-88},{84,-68}})));
      RealTimeCoordination.Step InactiveReceive(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{-38,20},{-30,28}})));
      RealTimeCoordination.Step InactiveSend(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{72,18},{80,26}})));
      RealTimeCoordination.Transition T8(condition=In_Beginner and not In_Cancel)
        annotation (Placement(transformation(extent={{68,38},{76,46}})));
      RealTimeCoordination.Transition T9(condition=not In_Beginner and not
            In_Cancel)
        annotation (Placement(transformation(extent={{-42,36},{-34,44}})));
      RealTimeCoordination.Transition T10(condition=In_Cancel,
        use_after=true,
        afterTime=0.1)                                      annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={-62,-14})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_Y    annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={120,-112})));
      Modelica.Blocks.Interfaces.IntegerInput In_TurnTime
                                                        annotation (Placement(
            transformation(
            extent={{-13,-13},{13,13}},
            rotation=270,
            origin={71,107})));
      Modelica.Blocks.Interfaces.IntegerInput In_Speed  annotation (Placement(
            transformation(
            extent={{-13,-13},{13,13}},
            rotation=270,
            origin={151,107})));
      Modelica.Blocks.Interfaces.IntegerInput In_X      annotation (Placement(
            transformation(
            extent={{-13,-13},{13,13}},
            rotation=270,
            origin={95,107})));
      Modelica.Blocks.Interfaces.IntegerInput In_Y      annotation (Placement(
            transformation(
            extent={{-13,-13},{13,13}},
            rotation=270,
            origin={113,107})));
      Modelica.Blocks.Interfaces.IntegerInput In_Z      annotation (Placement(
            transformation(
            extent={{-13,-13},{13,13}},
            rotation=270,
            origin={133,107})));
      Modelica.Blocks.Interfaces.IntegerInput In_BatError
                                                        annotation (Placement(
            transformation(
            extent={{-13,-13},{13,13}},
            rotation=270,
            origin={173,107})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_X    annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={98,-112})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_TurnTime
                                                        annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={74,-112})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_Z    annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={140,-112})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_Speed
                                                        annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={158,-112})));
      Modelica.Blocks.Interfaces.IntegerOutput Out_BatError
                                                        annotation (Placement(
            transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={180,-112})));
      Modelica.Blocks.Interfaces.BooleanInput In_Beginner    annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-60,120})));
      Modelica.Blocks.Interfaces.BooleanInput In_Cancel    annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-112,122})));
      RealTimeCoordination.Transition T11(condition=In_Cancel) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={88,-52})));
    algorithm

    equation
      Out_TurnTime = T1.transition_input_port[1].integers[1];
      Out_X = T1.transition_input_port[1].integers[2];
      Out_Y = T1.transition_input_port[1].integers[3];
      Out_Z = T1.transition_input_port[1].integers[4];
      Out_Speed = T1.transition_input_port[1].integers[5];
      Out_BatError = T1.transition_input_port[1].integers[6];
      connect(InTurn, mailbox.mailbox_input_port[1]) annotation (Line(
          points={{-188,12},{-79.5,12},{-79.5,11},{-69,11}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(TimedOut.outPort[1], T5.inPort) annotation (Line(
          points={{18,2.6},{18,12},{28,12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, Inactive.inPort[1]) annotation (Line(
          points={{28,21},{28,58},{-17.3333,58}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, MyTurn.inPort[1]) annotation (Line(
          points={{-28,3},{-34,3},{-34,-37},{-28,-37}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(MyTurn.outPort[3], T3.inPort) annotation (Line(
          points={{-19.4,-34.6667},{-2.7,-34.6667},{-2.7,-32},{14,-32}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, YourTurn.inPort[1]) annotation (Line(
          points={{23,-32},{47,-32},{47,-48}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(YourTurn.outPort[1], T4.inPort) annotation (Line(
          points={{46.6667,-56.6},{46.6667,-78},{20,-78}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, MyTurn.inPort[2]) annotation (Line(
          points={{11,-78},{-28,-78},{-28,-35}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(MyTurn.outPort[2], T6.inPort) annotation (Line(
          points={{-19.4,-36},{-12,-36},{-12,-28},{-6,-28}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, TimedOut.inPort[1]) annotation (Line(
          points={{-6,-19},{-6,-6},{19,-6}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(YourTurn.outPort[2], T7.inPort) annotation (Line(
          points={{48,-56.6},{62,-56.6},{62,-24}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T7.outPort, TimedOut.inPort[2]) annotation (Line(
          points={{62,-15},{62,-6},{17,-6}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, YourTurn.inPort[2]) annotation (Line(
          points={{78,-9},{78,-42},{49,-42},{49,-48}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.firePort, message.conditionPort[1]) annotation (Line(
          points={{82.2,-4},{96,-4},{96,-30.6},{112,-30.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(mailbox.mailbox_output_port[1], T1.transition_input_port[1])
        annotation (Line(
          points={{-51,10.5},{-39.5,10.5},{-39.5,10.12},{-32.9,10.12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(mailbox.mailbox_output_port[2], T4.transition_input_port[1])
        annotation (Line(
          points={{-51,11.5},{-51,-95.5},{18.12,-95.5},{18.12,-82.9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.firePort, message.conditionPort[2]) annotation (Line(
          points={{18,-27.8},{90,-27.8},{90,-22},{112,-22},{112,-28.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(clockConstraintGreater.firePort, T6.conditionPort) annotation (
          Line(
          points={{51,6.5},{-1,6.5},{-1,-24}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(clockConstraintGreater.firePort, T7.conditionPort) annotation (
          Line(
          points={{51,6.5},{71.75,6.5},{71.75,-20},{67,-20}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(clock.y, clockConstraintGreater.clockValue) annotation (Line(
          points={{57,76},{62,76},{62,29.5},{51.2,29.5}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(clock.y, timeInvariantLessOrEqual.clockValue) annotation (Line(
          points={{57,76},{-106,76},{-106,-58.4},{-13.5,-58.4}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(timeInvariantLessOrEqual.conditionPort, MyTurn.activePort)
        annotation (Line(
          points={{-13.2,-65.6},{-13.2,-47.8},{-24,-47.8},{-24,-31.28}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(message.message_output_port, OutTurn) annotation (Line(
          points={{133,-21},{140.5,-21},{140.5,-22},{198,-22}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(clock.y, timeInvariantLessOrEqual1.clockValue) annotation (Line(
          points={{57,76},{-116,76},{-116,-74.4},{62.5,-74.4}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(YourTurn.activePort, timeInvariantLessOrEqual1.conditionPort)
        annotation (Line(
          points={{52.72,-52},{60,-52},{60,-81.6},{62.8,-81.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(Inactive.outPort[1], T8.inPort) annotation (Line(
          points={{-17,49.4},{-12,49.4},{-12,46},{72,46}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Inactive.outPort[2], T9.inPort) annotation (Line(
          points={{-15,49.4},{-18,46},{-38,46},{-38,44}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T9.outPort, InactiveReceive.inPort[1]) annotation (Line(
          points={{-38,35},{-38,28},{-34,28}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InactiveReceive.outPort[1], T1.inPort) annotation (Line(
          points={{-34,19.4},{-34,12},{-28,12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T8.outPort, InactiveSend.inPort[1]) annotation (Line(
          points={{72,37},{74,37},{74,26},{76,26}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InactiveSend.outPort[1], T2.inPort) annotation (Line(
          points={{76,17.4},{78,17.4},{78,0}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(MyTurn.outPort[1], T10.inPort) annotation (Line(
          points={{-19.4,-37.3333},{-40,-37.3333},{-40,-18},{-62,-18}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T10.outPort, Inactive.inPort[2]) annotation (Line(
          points={{-62,-9},{-62,58},{-16,58}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.firePort, clock.u[1]) annotation (Line(
          points={{18,-27.8},{-150,-27.8},{-150,78.55},{35.9,78.55}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T4.firePort, clock.u[2]) annotation (Line(
          points={{16,-73.8},{34,-73.8},{34,76.85},{35.9,76.85}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T1.firePort, clock.u[3]) annotation (Line(
          points={{-23.8,8},{-150,8},{-150,75.15},{35.9,75.15}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T2.firePort, clock.u[4]) annotation (Line(
          points={{82.2,-4},{176,-4},{176,73.45},{35.9,73.45}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(In_TurnTime, message.u_integers[1]) annotation (Line(
          points={{71,107},{71,54.5},{113,54.5},{113,-9.13333}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_X, message.u_integers[2]) annotation (Line(
          points={{95,107},{95,55.5},{113,55.5},{113,-9.8}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_Y, message.u_integers[3]) annotation (Line(
          points={{113,107},{113,-10.4667}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_Z, message.u_integers[4]) annotation (Line(
          points={{133,107},{133,-11.1333},{113,-11.1333}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_Speed, message.u_integers[5]) annotation (Line(
          points={{151,107},{151,55.5},{113,55.5},{113,-11.8}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(In_BatError, message.u_integers[6]) annotation (Line(
          points={{173,107},{173,55.5},{113,55.5},{113,-12.4667}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(YourTurn.outPort[3], T11.inPort) annotation (Line(
          points={{49.3333,-56.6},{66,-56.6},{66,-56},{88,-56}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T11.outPort, Inactive.inPort[3]) annotation (Line(
          points={{88,-47},{158,-47},{158,48},{-14.6667,48},{-14.6667,58}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Turn_Transmission_Partner;

    model TurnTransmissionTest

      Turn_Transmission_Partner turn_Transmission_Partner(             timeout=1)
        annotation (Placement(transformation(extent={{-78,32},{-58,52}})));
      Turn_Transmission_Partner turn_Transmission_Partner1(            timeout=1)
        annotation (Placement(transformation(extent={{20,32},{40,52}})));
      Modelica.Blocks.Sources.IntegerExpression TurnTime(y=7)      annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={9,86})));
      Modelica.Blocks.Sources.IntegerExpression Speed(y=7)
        annotation (Placement(transformation(extent={{-8,-5},{8,5}},
            rotation=270,
            origin={15,86})));
      Modelica.Blocks.Sources.IntegerExpression BatError(y=7)     annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={21,86})));
      Modelica.Blocks.Sources.IntegerExpression X(y=7)            annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={27,86})));
      Modelica.Blocks.Sources.IntegerExpression Y(y=7)            annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={35,86})));
      Modelica.Blocks.Sources.IntegerExpression Z(y=7)            annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={45,86})));
      Modelica.Blocks.Sources.IntegerExpression TurnTime1(y=3)     annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={-87,84})));
      Modelica.Blocks.Sources.IntegerExpression Speed1(y=3)
        annotation (Placement(transformation(extent={{-8,-5},{8,5}},
            rotation=270,
            origin={-81,84})));
      Modelica.Blocks.Sources.IntegerExpression BatError1(y=3)    annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={-75,84})));
      Modelica.Blocks.Sources.IntegerExpression X1(y=3)           annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={-69,84})));
      Modelica.Blocks.Sources.IntegerExpression Y1(y=3)           annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={-61,84})));
      Modelica.Blocks.Sources.IntegerExpression Z1(y=3)           annotation (
          Placement(transformation(
            extent={{-8,-5},{8,5}},
            rotation=270,
            origin={-51,84})));
      Modelica.Blocks.Sources.BooleanExpression booleanExpression(y=true)
        annotation (Placement(transformation(extent={{-122,62},{-102,82}})));
      Modelica.Blocks.Sources.BooleanExpression booleanExpression1
        annotation (Placement(transformation(extent={{-126,30},{-106,50}})));
      Modelica.Blocks.Sources.BooleanExpression booleanExpression2
        annotation (Placement(transformation(extent={{-24,74},{-4,94}})));
      Modelica.Blocks.Sources.BooleanExpression booleanExpression3
        annotation (Placement(transformation(extent={{-24,58},{-4,78}})));
    equation
      connect(turn_Transmission_Partner.OutTurn, turn_Transmission_Partner1.InTurn)
        annotation (Line(
          points={{-48.2,39.8},{-25.3,39.8},{-25.3,43.2},{11.2,43.2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(turn_Transmission_Partner1.OutTurn, turn_Transmission_Partner.InTurn)
        annotation (Line(
          points={{49.8,39.8},{-33.3,39.8},{-33.3,43.2},{-86.8,43.2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(TurnTime.y, turn_Transmission_Partner1.In_TurnTime) annotation (Line(
          points={{9,77.2},{23.5,77.2},{23.5,52.7},{37.1,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(BatError.y, turn_Transmission_Partner1.In_Y) annotation (Line(
          points={{21,77.2},{21,64.6},{41.3,64.6},{41.3,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(X.y, turn_Transmission_Partner1.In_Z) annotation (Line(
          points={{27,77.2},{27,64.6},{43.3,64.6},{43.3,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(Y.y, turn_Transmission_Partner1.In_Speed) annotation (Line(
          points={{35,77.2},{35,64.6},{45.1,64.6},{45.1,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(Z.y, turn_Transmission_Partner1.In_BatError) annotation (Line(
          points={{45,77.2},{45,64.6},{47.3,64.6},{47.3,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(TurnTime1.y, turn_Transmission_Partner.In_TurnTime) annotation (Line(
          points={{-87,75.2},{-73.5,75.2},{-73.5,52.7},{-60.9,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(Speed1.y, turn_Transmission_Partner.In_X) annotation (Line(
          points={{-81,75.2},{-81,63.6},{-58.5,63.6},{-58.5,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(Y1.y, turn_Transmission_Partner.In_Speed) annotation (Line(
          points={{-61,75.2},{-61,63.6},{-52.9,63.6},{-52.9,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(Z1.y, turn_Transmission_Partner.In_BatError) annotation (Line(
          points={{-51,75.2},{-51,63.6},{-50.7,63.6},{-50.7,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(BatError1.y, turn_Transmission_Partner.In_Y) annotation (Line(
          points={{-75,75.2},{-75,63.6},{-56.7,63.6},{-56.7,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(X1.y, turn_Transmission_Partner.In_Z) annotation (Line(
          points={{-69,75.2},{-69,63.6},{-54.7,63.6},{-54.7,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(Speed.y, turn_Transmission_Partner1.In_X) annotation (Line(
          points={{15,77.2},{15,64.6},{39.5,64.6},{39.5,52.7}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(booleanExpression3.y, turn_Transmission_Partner1.In_Cancel)
        annotation (Line(
          points={{-3,68},{8,68},{8,54.2},{18.8,54.2}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(booleanExpression2.y, turn_Transmission_Partner1.In_Beginner)
        annotation (Line(
          points={{-3,84},{10,84},{10,54},{24,54}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(booleanExpression.y, turn_Transmission_Partner.In_Beginner)
        annotation (Line(
          points={{-101,72},{-90,72},{-90,54},{-74,54}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(booleanExpression1.y, turn_Transmission_Partner.In_Cancel)
        annotation (Line(
          points={{-105,40},{-90,40},{-90,54.2},{-79.2,54.2}},
          color={255,0,255},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end TurnTransmissionTest;

    model TurnTransmission2
    parameter Boolean beginner;
      RealTimeCoordination.Step Inactive(       nOut=2, initialStep=true)
        annotation (Placement(transformation(extent={{-4,66},{4,74}})));
      RealTimeCoordination.Step YourTurn(nIn=1)
        annotation (Placement(transformation(extent={{56,-8},{64,0}})));
      RealTimeCoordination.Step MyTurn(nIn=1)
        annotation (Placement(transformation(extent={{-78,-10},{-70,-2}})));
      RealTimeCoordination.Transition T1(
        use_messageReceive=true,
        numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.3)
        annotation (Placement(transformation(extent={{-76,24},{-68,32}})));
      RealTimeCoordination.Transition T2(
        use_firePort=true,
        use_after=true,
        afterTime=0.1)
        annotation (Placement(transformation(extent={{56,10},{64,18}})));
      RealTimeCoordination.Message message(nIn=1)
        annotation (Placement(transformation(extent={{90,0},{110,20}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        outputDelegationPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{124,0},{144,20}})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        inputDelegationPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{-146,2},{-126,22}})));
      RealTimeCoordination.Mailbox mailbox(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{-114,2},{-94,22}})));
      Modelica_StateGraph2.Step InactiveReceive(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{-62,52},{-54,60}})));
      Modelica_StateGraph2.Transition T3(condition=not beginner) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-32,64})));
      Modelica_StateGraph2.Step InactiveSend(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{44,46},{52,54}})));
      Modelica_StateGraph2.Transition T4(condition=beginner) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={30,66})));
    equation
      connect(T1.outPort, MyTurn.inPort[1]) annotation (Line(
          points={{-72,23},{-72,-2},{-74,-2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, YourTurn.inPort[1]) annotation (Line(
          points={{60,9},{60,2.22045e-016}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.firePort, message.conditionPort[1]) annotation (Line(
          points={{64.2,14},{78,14},{78,0.4},{88,0.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(inputDelegationPort, mailbox.mailbox_input_port[1]) annotation (
          Line(
          points={{-136,12},{-124,12},{-124,11},{-113,11}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(mailbox.mailbox_output_port[1], T1.transition_input_port[1])
        annotation (Line(
          points={{-95,11},{-86.5,11},{-86.5,30.12},{-76.9,30.12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(message.message_output_port, outputDelegationPort) annotation (
          Line(
          points={{109,9},{120.5,9},{120.5,10},{134,10}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InactiveReceive.inPort[1], T3.outPort) annotation (Line(
          points={{-58,60},{-48,60},{-48,64},{-37,64}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.inPort, Inactive.outPort[1]) annotation (Line(
          points={{-28,64},{-14,64},{-14,65.4},{-1,65.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InactiveReceive.outPort[1], T1.inPort) annotation (Line(
          points={{-58,51.4},{-58,41.7},{-72,41.7},{-72,32}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Inactive.outPort[2], T4.inPort) annotation (Line(
          points={{1,65.4},{14,65.4},{14,66},{26,66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, InactiveSend.inPort[1]) annotation (Line(
          points={{35,66},{42,66},{42,54},{48,54}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InactiveSend.outPort[1], T2.inPort) annotation (Line(
          points={{48,45.4},{54,45.4},{54,18},{60,18}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end TurnTransmission2;

    model TT2Test
      TurnTransmission2 turnTransmission2_1(beginner=true)
        annotation (Placement(transformation(extent={{-86,32},{-66,52}})));
      TurnTransmission2 turnTransmission2_2(beginner=false)
        annotation (Placement(transformation(extent={{0,32},{20,52}})));
    equation
      connect(turnTransmission2_1.outputDelegationPort, turnTransmission2_2.inputDelegationPort)
        annotation (Line(
          points={{-62.6,43},{-38.3,43},{-38.3,43.2},{-3.6,43.2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(turnTransmission2_1.inputDelegationPort, turnTransmission2_2.outputDelegationPort)
        annotation (Line(
          points={{-89.6,43.2},{-94,43.2},{-94,2},{-38,4},{38,10},{23.4,43}},
          color={0,0,255},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end TT2Test;
  end Turn_Transmission;
  annotation (uses(
      Modelica_StateGraph2(version="2.0.1"),
      RealTimeCoordination(version="1.0.0"),
      Modelica(version="3.2")));
  model Robot
  parameter Boolean beginner;
    Synchronized_Collaboration.Collaboration_Slave collaboration_Slave(
        evaluationTime=1)
      annotation (Placement(transformation(extent={{-62,-56},{-24,-34}})));
    Synchronized_Collaboration.Collaboration_Master collaboration_Master(timeout=1)
      annotation (Placement(transformation(extent={{-78,40},{-36,60}})));
    Turn_Transmission.Turn_Transmission_Partner turn_Transmission_Partner(timeout=
         1) annotation (Placement(transformation(extent={{82,16},{102,36}})));
    RealTimeCoordination.MessageInterface.OutputDelegationPort OutTurn(
      redeclare Integer integers[6] "integers[6]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{160,8},{180,28}})));
    RealTimeCoordination.MessageInterface.OutputDelegationPort
      Out_ActivationRejected(
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{-168,-116},{-148,-96}})));
    RealTimeCoordination.MessageInterface.OutputDelegationPort
      OutActivationAccepted(
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{-168,-88},{-148,-68}})));
    RealTimeCoordination.MessageInterface.InputDelegationPort InTurn(
      redeclare Integer integers[6] "integers[6]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{158,98},{178,118}})));
    RealTimeCoordination.MessageInterface.InputDelegationPort
      InActivationProposal(
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]",
      redeclare Integer integers[3] "integers[3]")
      annotation (Placement(transformation(extent={{-168,-28},{-148,-8}})));
    RealTimeCoordination.MessageInterface.InputDelegationPort InDeactivation(
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{-168,-56},{-148,-36}})));
    RealTimeCoordination.MessageInterface.OutputDelegationPort Out_Deactivation(
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{-176,126},{-156,146}})));
    RealTimeCoordination.MessageInterface.OutputDelegationPort
      Out_ActivationProposal(
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]",
      redeclare Integer integers[3] "integers[3]")
      annotation (Placement(transformation(extent={{-122,124},{-102,144}})));
    RealTimeCoordination.MessageInterface.InputDelegationPort
      In_ActivationAccepted(
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{-10,124},{10,144}})));
    RealTimeCoordination.MessageInterface.InputDelegationPort
      In_ActivationRejected(
      redeclare Integer integers[0] "integers[0]",
      redeclare Boolean booleans[0] "booelans[0]",
      redeclare Real reals[0] "reals[0]")
      annotation (Placement(transformation(extent={{-62,124},{-42,144}})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-60,90})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression1 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-44,92})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression2 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-20,94})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression3 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={66,92})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression4 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={84,92})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression5 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={84,92})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression6 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={148,90})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression7 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={126,90})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression8 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={106,90})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression9 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={178,86})));
    Modelica.Blocks.Sources.BooleanExpression booleanExpression
      annotation (Placement(transformation(extent={{8,26},{28,46}})));
    Modelica.Blocks.Sources.BooleanExpression booleanExpression1(y=beginner)
      annotation (Placement(transformation(extent={{8,50},{28,70}})));
  equation
    connect(turn_Transmission_Partner.InTurn, InTurn) annotation (Line(
        points={{73.2,27.2},{73.2,51.6},{168,51.6},{168,108}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(turn_Transmission_Partner.OutTurn, OutTurn) annotation (Line(
        points={{111.8,23.8},{139.9,23.8},{139.9,18},{170,18}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Slave.activationAcceptedOutputPort,
      OutActivationAccepted) annotation (Line(
        points={{-24,-46.76},{-54,-46.76},{-54,-78},{-158,-78}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Slave.activationRejectedOutputPort,
      Out_ActivationRejected) annotation (Line(
        points={{-25.14,-37.96},{-25.14,-106.98},{-158,-106.98},{-158,-106}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Slave.deactivationInputPort, InDeactivation)
      annotation (Line(
        points={{-62,-46.98},{-108,-46.98},{-108,-46},{-158,-46}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(collaboration_Slave.activationProposalInputPort, InActivationProposal)
      annotation (Line(
        points={{-61.62,-41.26},{-111.81,-41.26},{-111.81,-18},{-158,-18}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(collaboration_Master.deactivationOutputPort, Out_Deactivation)
      annotation (Line(
        points={{-74.22,43.4},{-127.11,43.4},{-127.11,136},{-166,136}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Master.activationProposalOutputPort,
      Out_ActivationProposal) annotation (Line(
        points={{-37.68,56.6},{-70.84,56.6},{-70.84,134},{-112,134}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Master.activationRejectedInputPort,
      In_ActivationRejected) annotation (Line(
        points={{-37.26,53.4},{-37.26,110.7},{-52,110.7},{-52,134}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(collaboration_Master.actiavtionAcceptedInputPort,
      In_ActivationAccepted) annotation (Line(
        points={{-37.26,48.4},{-37.26,105.2},{0,105.2},{0,134}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(integerExpression.y, collaboration_Master.In_Weight) annotation (Line(
        points={{-60,79},{-54,79},{-54,63},{-48.18,63}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression1.y, collaboration_Master.In_Friction) annotation (
        Line(
        points={{-44,81},{-42,81},{-42,63},{-39.78,63}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression2.y, collaboration_Master.In_Height) annotation (
        Line(
        points={{-20,83},{-24,83},{-24,63},{-31.38,63}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression3.y, turn_Transmission_Partner.In_TurnTime)
      annotation (Line(
        points={{66,81},{82,81},{82,36.7},{99.1,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression4.y, turn_Transmission_Partner.In_X) annotation (
        Line(
        points={{84,81},{94,81},{94,36.7},{101.5,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression8.y, turn_Transmission_Partner.In_Y) annotation (
        Line(
        points={{106,79},{106,36.7},{103.3,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression6.y, turn_Transmission_Partner.In_Speed) annotation (
       Line(
        points={{148,79},{128,79},{128,36.7},{107.1,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression9.y, turn_Transmission_Partner.In_BatError)
      annotation (Line(
        points={{178,75},{144,75},{144,36.7},{109.3,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression7.y, turn_Transmission_Partner.In_Z) annotation (
        Line(
        points={{126,79},{116,79},{116,36.7},{105.3,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(booleanExpression.y, turn_Transmission_Partner.In_Cancel) annotation (
       Line(
        points={{29,36},{54,36},{54,38.2},{80.8,38.2}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(booleanExpression1.y, turn_Transmission_Partner.In_Beginner)
      annotation (Line(
        points={{29,60},{86,60},{86,38}},
        color={255,0,255},
        smooth=Smooth.None));
    annotation (Diagram(coordinateSystem(extent={{-260,-120},{180,140}},
            preserveAspectRatio=true), graphics), Icon(coordinateSystem(extent={{-260,
              -120},{180,140}})));
  end Robot;
end Projekt;
