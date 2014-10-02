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

    model Comp1
      RealTimeCoordination.Internal.Interfaces.Synchron.receiver receiver
        annotation (Placement(transformation(extent={{-86,8},{-66,28}})));
      RealTimeCoordination.Step step1(nOut=2, initialStep=true)
        annotation (Placement(transformation(extent={{-42,78},{-34,86}})));
      RealTimeCoordination.Transition T1(use_syncReceive=true,
          numberOfSyncReceive=1)
        annotation (Placement(transformation(extent={{-34,12},{-26,20}})));
      RealTimeCoordination.Step step2(nIn=1)
        annotation (Placement(transformation(extent={{-32,-42},{-24,-34}})));
      RealTimeCoordination.Step step3(nIn=1)
        annotation (Placement(transformation(extent={{14,8},{22,16}})));
      RealTimeCoordination.Transition T2(condition=false)
        annotation (Placement(transformation(extent={{0,46},{8,54}})));
    equation
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{-39,77.4},{-39,67.4},{-34,20},{-30,20}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, step2.inPort[1]) annotation (Line(
          points={{-30,11},{-30,-34},{-28,-34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.receiver[1], receiver) annotation (Line(
          points={{-32.82,20.02},{-45.41,20.02},{-45.41,18},{-76,18}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(step1.outPort[2], T2.inPort) annotation (Line(
          points={{-37,77.4},{-16,77.4},{-16,54},{4,54}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, step3.inPort[1]) annotation (Line(
          points={{4,45},{8,45},{8,16},{18,16}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Comp1;

    model Comp2
      RealTimeCoordination.Internal.Interfaces.Synchron.sender sender
        annotation (Placement(transformation(extent={{-100,36},{-80,56}})));
      RealTimeCoordination.Step step1(
        nOut=1,
        initialStep=false,
        nIn=1)
        annotation (Placement(transformation(extent={{-36,76},{-28,84}})));
      RealTimeCoordination.Step step2(nIn=1)
        annotation (Placement(transformation(extent={{-40,-14},{-32,-6}})));
      RealTimeCoordination.Transition T1(
        use_syncSend=true,
        numberOfSyncSend=1,
        use_after=true,
        afterTime=0.1)
        annotation (Placement(transformation(extent={{-18,36},{-10,44}})));
      Modelica_StateGraph2.Parallel step3(nEntry=1, initialStep=true)
        annotation (Placement(transformation(extent={{-110,-50},{10,110}})));
    equation
      connect(T1.sender[1], sender) annotation (Line(
          points={{-11.4,44.06},{-52.7,44.06},{-52.7,46},{-90,46}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{-32,75.4},{-24,75.4},{-24,44},{-14,44}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, step2.inPort[1]) annotation (Line(
          points={{-14,35},{-24,35},{-24,-10},{-34,-10},{-34,-6},{-36,-6}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step3.entry[1], step1.inPort[1]) annotation (Line(
          points={{-50,102},{-42,102},{-42,84},{-32,84}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Comp2;

    model LevelUP
      Comp1 comp1_1
        annotation (Placement(transformation(extent={{-36,62},{-16,82}})));
      Comp2 comp2_1
        annotation (Placement(transformation(extent={{-48,0},{-28,20}})));
      SynchComponent synchComponent
        annotation (Placement(transformation(extent={{0,34},{20,54}})));
    equation
      connect(comp1_1.receiver, comp2_1.sender) annotation (Line(
          points={{-33.6,73.8},{-34,66},{-88,58},{-47,58},{-47,14.6}},
          color={255,128,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end LevelUP;
  end SynchronousMessageTest;

  package Synchronized_Collaboration
    model Collaboration_Slave
    parameter Real evaluationTime;
      RealTimeCoordination.Step Default(nIn=2, nOut=1,
        initialStep=true)
        annotation (Placement(transformation(extent={{-32,76},{-24,84}})));
      RealTimeCoordination.Step EvaluatueProposal(
        nIn=1,
        nOut=2,
        use_activePort=true) annotation (Placement(transformation(
            extent={{4,-4},{-4,4}},
            rotation=90,
            origin={58,40})));
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
        afterTime=0.1,
        condition=ready,
        use_syncSend=true,
        numberOfSyncSend=1)
        annotation (Placement(transformation(extent={{100,6},{92,14}})));
      RealTimeCoordination.Transition T3(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1,
        use_syncSend=false)         annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={-60,8})));
      RealTimeCoordination.Transition T4(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        condition=not ready)                                annotation (Placement(
            transformation(
            extent={{4,-4},{-4,4}},
            rotation=270,
            origin={28,76})));
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
        annotation (Placement(transformation(extent={{84,-58},{104,-38}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        activationAcceptedOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{188,-60},{208,-40}})));
      RealTimeCoordination.MessageInterface.OutputDelegationPort
        activationRejectedOutputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{70,112},{90,132}})));
      RealTimeCoordination.Message activationRejected(nIn=1)
        annotation (Placement(transformation(extent={{24,96},{44,116}})));
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
      Modelica.Blocks.Interfaces.BooleanInput ready annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-66,124})));
      RealTimeCoordination.Internal.Interfaces.Synchron.sender Slave
        annotation (Placement(transformation(extent={{210,4},{230,24}})));
      Modelica_StateGraph2.Step step1(nIn=1, nOut=1) annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={104,76})));
      RealTimeCoordination.Transition T5(condition=not ready) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={144,54})));
    equation
      Out_Weight = T1.transition_input_port[1].integers[1];
      Out_Friction = T1.transition_input_port[1].integers[2];
      Out_Height = T1.transition_input_port[1].integers[3];

      connect(Default.outPort[1], T1.inPort) annotation (Line(
          points={{-28,75.4},{-28,20},{0,20}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, EvaluatueProposal.inPort[1]) annotation (Line(
          points={{9,20},{54,20},{54,40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(EvaluatueProposal.outPort[1], T2.inPort) annotation (Line(
          points={{62.6,41},{96,41},{96,14}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, CollaborationActive.inPort[1]) annotation (Line(
          points={{96,5},{96,-16},{4,-16}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CollaborationActive.outPort[1], T3.inPort) annotation (Line(
          points={{-4.6,-16},{-60,-16},{-60,4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, Default.inPort[1]) annotation (Line(
          points={{-60,13},{-60,60},{-42,60},{-42,84},{-29,84}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, Default.inPort[2]) annotation (Line(
          points={{23,76},{-8,76},{-8,84},{-27,84}},
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
          points={{91.8,10},{82,10},{82,8},{74,8},{74,-57.6},{82,-57.6}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(actiavtionAccepted.message_output_port, activationAcceptedOutputPort)
        annotation (Line(
          points={{103,-49},{170,-49},{170,-50},{198,-50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.firePort, activationRejected.conditionPort[1]) annotation (Line(
          points={{28,80.2},{32,80.2},{32,96.4},{22,96.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(activationRejected.message_output_port, activationRejectedOutputPort)
        annotation (Line(
          points={{43,105},{80.5,105},{80.5,122},{80,122}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(EvaluatueProposal.activePort, evalTime.u[1]) annotation (Line(
          points={{58,35.28},{58,4},{38.1,4},{38.1,2}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(evalTime.y, timeInvariantLessOrEqual.clockValue) annotation (Line(
          points={{17,2},{14.5,2},{14.5,35.6}},
          color={0,0,127},
          smooth=Smooth.None));
      connect(timeInvariantLessOrEqual.conditionPort, EvaluatueProposal.activePort)
        annotation (Line(
          points={{14.8,28.4},{40,30},{58,35.28}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(T2.sender[1], Slave) annotation (Line(
          points={{93.4,14.06},{97.7,14.06},{97.7,14},{220,14}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(EvaluatueProposal.outPort[2], T5.inPort) annotation (Line(
          points={{62.6,39},{144,39},{144,50}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, step1.inPort[1]) annotation (Line(
          points={{144,59},{144,76},{108,76}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T4.inPort) annotation (Line(
          points={{99.4,76},{60,76},{60,76},{32,76}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Collaboration_Slave;

    model Collaboration_Master
     parameter Real timeout;
      Modelica_StateGraph2.Step Default(nIn=3, nOut=1,
        initialStep=true)                              annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=0,
            origin={-62,86})));
      Modelica_StateGraph2.Step Waiting(
        nOut=3,
        use_activePort=true,
        nIn=1)               annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={60,-4})));
      RealTimeCoordination.Transition T2(use_messageReceive=true,
          numberOfMessageReceive=1,
        use_after=true,
        afterTime=0.1)                   annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-4,20})));
      Modelica_StateGraph2.Step CollaborationActive(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=270,
            origin={-10,-40})));
      RealTimeCoordination.Transition T3(
        use_after=true,
        afterTime=0.1,
        use_messageReceive=true,
        numberOfMessageReceive=1,
        use_syncSend=false)
        annotation (Placement(transformation(extent={{76,-42},{84,-34}})));
      RealTimeCoordination.Transition T4(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        condition=In_Stop)               annotation (Placement(transformation(
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
        annotation (Placement(transformation(extent={{186,56},{206,76}})));
      RealTimeCoordination.Mailbox activationRejected(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={72,36})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        activationRejectedInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{188,24},{208,44}})));
      RealTimeCoordination.Transition T1(use_firePort=true,
        afterTime=0.1,
        use_after=false,
        use_syncSend=false,
        condition=In_Begin)                                 annotation (Placement(
            transformation(
            extent={{-4,-4},{4,4}},
            rotation=90,
            origin={0,-20})));
      RealTimeCoordination.Mailbox activationAccepted(nIn=1, nOut=1) annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=180,
            origin={122,10})));
      RealTimeCoordination.MessageInterface.InputDelegationPort
        actiavtionAcceptedInputPort(
        redeclare Integer integers[0] "integers[0]",
        redeclare Boolean booleans[0] "booelans[0]",
        redeclare Real reals[0] "reals[0]")
        annotation (Placement(transformation(extent={{186,-22},{206,-2}})));
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
      Modelica.Blocks.Interfaces.BooleanInput In_Begin annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-152,132})));
      RealTimeCoordination.Internal.Interfaces.Synchron.sender Out_Begin
        annotation (Placement(transformation(extent={{154,-104},{174,-84}})));
      Modelica.Blocks.Interfaces.BooleanInput In_Stop annotation (Placement(
            transformation(
            extent={{-20,-20},{20,20}},
            rotation=270,
            origin={-110,132})));
      RealTimeCoordination.Transition T6(use_syncSend=true, numberOfSyncSend=1)
        annotation (Placement(transformation(extent={{40,-80},{48,-72}})));
      RealTimeCoordination.Step step1(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{76,-20},{84,-12}})));
    equation
      connect(Waiting.outPort[1], T2.inPort) annotation (Line(
          points={{61.3333,0.6},{70,0.6},{70,22},{42,22},{42,20},{0,20}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, Default.inPort[1]) annotation (Line(
          points={{-9,20},{-36,20},{-36,90},{-63.3333,90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T3.outPort, CollaborationActive.inPort[1]) annotation (Line(
          points={{80,-43},{80,-40},{-6,-40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(CollaborationActive.outPort[1], T4.inPort) annotation (Line(
          points={{-14.6,-40},{-78,-40}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T4.outPort, Default.inPort[2]) annotation (Line(
          points={{-78,-31},{-78,90},{-62,90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[2], T5.inPort) annotation (Line(
          points={{60,0.6},{50,0.6},{50,44},{4,44}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T5.outPort, Default.inPort[3]) annotation (Line(
          points={{-5,44},{-58,44},{-58,90},{-60.6667,90}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Waiting.activePort, clock.u[1]) annotation (Line(
          points={{55.28,-4},{36,-4},{36,3.9},{26.1,3.9},{26.1,4},{10.1,4}},
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
          points={{63,65},{77.5,65},{77.5,66},{196,66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(activationRejected.mailbox_input_port[1], activationRejectedInputPort)
        annotation (Line(
          points={{81,37},{72.5,37},{72.5,34},{198,34}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Default.outPort[1], T1.inPort) annotation (Line(
          points={{-62,81.4},{-62,-18},{-4,-18},{-4,-20}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.outPort, Waiting.inPort[1]) annotation (Line(
          points={{5,-20},{60,-20},{60,-8}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T1.firePort, activationProposal.conditionPort[1]) annotation (Line(
          points={{2.57176e-016,-15.8},{30,-15.8},{30,56.4},{42,56.4}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(activationRejected.mailbox_output_port[1], T2.transition_input_port[1])
        annotation (Line(
          points={{63,37},{25.5,37},{25.5,24.9},{-1.88,24.9}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(actiavtionAcceptedInputPort, activationAccepted.mailbox_input_port[1])
        annotation (Line(
          points={{196,-12},{162,-12},{162,10},{158,10},{158,11},{131,11}},
          color={0,0,255},
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
      connect(T3.transition_input_port[1], activationAccepted.mailbox_output_port[
        1]) annotation (Line(
          points={{75.1,-35.88},{92.55,-35.88},{92.55,11},{113,11}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Out_Begin, T6.sender[1]) annotation (Line(
          points={{164,-94},{108,-94},{108,-71.94},{46.6,-71.94}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(Waiting.outPort[3], T6.inPort) annotation (Line(
          points={{58.6667,0.6},{52,0.6},{52,-72},{44,-72}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T6.outPort, step1.inPort[1]) annotation (Line(
          points={{44,-81},{54,-81},{54,-12},{80,-12}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T3.inPort) annotation (Line(
          points={{80,-20.6},{80,-34}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end Collaboration_Master;

    model MasterAndSlave
      Collaboration_Master collaboration_Master(timeout=4)
        annotation (Placement(transformation(extent={{-74,72},{10,102}})));
      Collaboration_Slave collaboration_Slave(evaluationTime=2)
        annotation (Placement(transformation(extent={{-62,-48},{12,-16}})));
      Modelica.Blocks.Sources.BooleanExpression booleanExpression(y=true)
        annotation (Placement(transformation(extent={{-182,80},{-162,100}})));
      Modelica.Blocks.Sources.IntegerExpression integerExpression annotation (
          Placement(transformation(
            extent={{-10,-10},{10,10}},
            rotation=270,
            origin={0,146})));
      RealTimeCoordination.Step step1(
        nIn=1,
        initialStep=true,
        nOut=1)
        annotation (Placement(transformation(extent={{136,90},{144,98}})));
      RealTimeCoordination.Step step2(nIn=1, nOut=1)
        annotation (Placement(transformation(extent={{134,20},{142,28}})));
      RealTimeCoordination.Transition T1(
        use_syncReceive=true,
        numberOfSyncReceive=1,
        use_after=true,
        afterTime=0.1)
        annotation (Placement(transformation(extent={{130,58},{138,66}})));
      RealTimeCoordination.Transition T2(
        use_syncSend=false,
        use_syncReceive=true,
        numberOfSyncReceive=1) annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={182,62})));
      Modelica.Blocks.Sources.BooleanExpression booleanExpression1
        annotation (Placement(transformation(extent={{-190,108},{-170,128}})));
    equation
      connect(collaboration_Master.activationProposalOutputPort,
        collaboration_Slave.activationProposalInputPort) annotation (Line(
          points={{50.32,96.9},{58,76},{64,36},{-10,36},{-12,6},{-6,6},{-6,
              -26.56},{-61.26,-26.56}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(collaboration_Master.deactivationOutputPort, collaboration_Slave.deactivationInputPort)
        annotation (Line(
          points={{-66.44,77.1},{-21.1,77.1},{-21.1,-34.88},{-62,-34.88}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(collaboration_Master.activationRejectedInputPort,
        collaboration_Slave.activationRejectedOutputPort) annotation (Line(
          points={{51.16,92.1},{97.7,92.1},{97.7,-12.48},{4.6,-12.48}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(collaboration_Master.actiavtionAcceptedInputPort,
        collaboration_Slave.activationAcceptedOutputPort) annotation (Line(
          points={{50.32,85.2},{85.7,85.2},{85.7,-40},{48.26,-40}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(booleanExpression.y, collaboration_Master.In_Begin) annotation (
          Line(
          points={{-161,90},{-132,90},{-132,106.8},{-95.84,106.8}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(booleanExpression.y, collaboration_Slave.ready) annotation (Line(
          points={{-161,90},{-104,90},{-104,-12.16},{-49.42,-12.16}},
          color={255,0,255},
          smooth=Smooth.None));
      connect(integerExpression.y, collaboration_Master.In_Weight) annotation (
          Line(
          points={{-2.02067e-015,135},{-2.02067e-015,120.5},{-14.36,120.5},{
              -14.36,106.5}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(integerExpression.y, collaboration_Master.In_Friction)
        annotation (Line(
          points={{-2.02067e-015,135},{-2.02067e-015,121.5},{2.44,121.5},{2.44,
              106.5}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(integerExpression.y, collaboration_Master.In_Height) annotation (
          Line(
          points={{-2.02067e-015,135},{-2.02067e-015,120.5},{19.24,120.5},{
              19.24,106.5}},
          color={255,127,0},
          smooth=Smooth.None));
      connect(collaboration_Slave.Slave, T2.receiver[1]) annotation (Line(
          points={{56.4,-29.76},{186,-29.76},{186,57.98},{184.82,57.98}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(collaboration_Master.Out_Begin, T1.receiver[1]) annotation (Line(
          points={{36.88,72.9},{84.44,72.9},{84.44,66.02},{131.18,66.02}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(T1.outPort, step2.inPort[1]) annotation (Line(
          points={{134,57},{140,57},{140,28},{138,28}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step2.outPort[1], T2.inPort) annotation (Line(
          points={{138,19.4},{182,19.4},{182,58}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.outPort, step1.inPort[1]) annotation (Line(
          points={{182,67},{152,67},{152,98},{140,98}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(step1.outPort[1], T1.inPort) annotation (Line(
          points={{140,89.4},{138,89.4},{138,66},{134,66}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(booleanExpression1.y, collaboration_Master.In_Stop) annotation (
          Line(
          points={{-169,118},{-70,118},{-70,106.8},{-78.2,106.8}},
          color={255,0,255},
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
    Boolean cancelled( start = false);
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
        annotation (Placement(transformation(extent={{74,-10},{82,-2}})));
      RealTimeCoordination.Transition T3(use_firePort=true,
        use_after=true,
        afterTime=0.1,
        condition=not cancelled)                               annotation (Placement(
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
        condition=not cancelled)    annotation (Placement(transformation(
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
      RealTimeCoordination.Transition T8(
        use_syncSend=false,
        use_syncReceive=true,
        numberOfSyncReceive=1)
        annotation (Placement(transformation(extent={{72,30},{80,38}})));
      RealTimeCoordination.Transition T9(
        use_syncReceive=true,
        numberOfSyncReceive=1,
        condition=not cancelled)
        annotation (Placement(transformation(extent={{-42,36},{-34,44}})));
      RealTimeCoordination.Transition T10(
        use_after=true,
        afterTime=0.1,
        condition=cancelled)                                annotation (Placement(
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
      RealTimeCoordination.Transition T11(condition=cancelled)
              annotation (Placement(transformation(
            extent={{-4,-4},{4,4}},
            rotation=180,
            origin={88,-52})));
      RealTimeCoordination.Internal.Interfaces.Synchron.receiver Master
        annotation (Placement(transformation(extent={{-210,120},{-190,140}})));
      RealTimeCoordination.Internal.Interfaces.Synchron.receiver Slave
        annotation (Placement(transformation(extent={{-214,48},{-194,68}})));
    algorithm
      cancelled :=false;
     /* when T10.fire or T11.fire then
   cancelled := true;
   beginner := false;
 end when;
 when T8.fire then
   cancelled := false;
   beginner := true;
 end when; */
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
          points={{78,-11},{78,-42},{49,-42},{49,-48}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(T2.firePort, message.conditionPort[1]) annotation (Line(
          points={{82.2,-6},{96,-6},{96,-30.6},{112,-30.6}},
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
          points={{-17,49.4},{-12,49.4},{-12,38},{76,38}},
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
          points={{76,29},{76,26}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(InactiveSend.outPort[1], T2.inPort) annotation (Line(
          points={{76,17.4},{78,17.4},{78,-2}},
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
          points={{82.2,-6},{176,-6},{176,73.45},{35.9,73.45}},
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
      connect(Slave, T9.receiver[1]) annotation (Line(
          points={{-204,58},{-88,58},{-88,44.02},{-40.82,44.02}},
          color={255,128,0},
          smooth=Smooth.None));
      connect(Master, T8.receiver[1]) annotation (Line(
          points={{-200,130},{-64,130},{-64,38.02},{73.18,38.02}},
          color={255,128,0},
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
  parameter Boolean begin;
    Synchronized_Collaboration.Collaboration_Slave collaboration_Slave(
        evaluationTime=1)
      annotation (Placement(transformation(extent={{-62,-56},{-24,-34}})));
    Synchronized_Collaboration.Collaboration_Master collaboration_Master(timeout=1, T1(
          use_after=false))
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
      annotation (Placement(transformation(extent={{156,128},{176,148}})));
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
          origin={-54,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression1 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-34,192})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression2 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={-10,192})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression3 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={58,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression4 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={94,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression5 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={80,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression6 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={144,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression7 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={126,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression8 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={106,190})));
    Modelica.Blocks.Sources.IntegerExpression integerExpression9 annotation (
        Placement(transformation(
          extent={{-10,-10},{10,10}},
          rotation=270,
          origin={160,190})));
    Modelica.Blocks.Sources.BooleanExpression Beginner(y=begin)
      annotation (Placement(transformation(extent={{-260,70},{-240,90}})));
    Modelica.Blocks.Sources.BooleanExpression Stop
      annotation (Placement(transformation(extent={{-260,98},{-240,118}})));
    Modelica.Blocks.Sources.BooleanExpression Ready(y=true)
      annotation (Placement(transformation(extent={{-260,30},{-240,50}})));
  equation
    connect(turn_Transmission_Partner.InTurn, InTurn) annotation (Line(
        points={{73.2,27.2},{73.2,51.6},{166,51.6},{166,138}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(turn_Transmission_Partner.OutTurn, OutTurn) annotation (Line(
        points={{111.8,23.8},{139.9,23.8},{139.9,18},{170,18}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Slave.activationAcceptedOutputPort,
      OutActivationAccepted) annotation (Line(
        points={{-5.38,-50.5},{-54,-50.5},{-54,-78},{-158,-78}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Slave.activationRejectedOutputPort,
      Out_ActivationRejected) annotation (Line(
        points={{-27.8,-31.58},{-27.8,-106.98},{-158,-106.98},{-158,-106}},
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
        points={{-15.84,56.6},{-70.84,56.6},{-70.84,134},{-112,134}},
        color={0,0,0},
        smooth=Smooth.None));
    connect(collaboration_Master.activationRejectedInputPort,
      In_ActivationRejected) annotation (Line(
        points={{-15.42,53.4},{-15.42,110.7},{-52,110.7},{-52,134}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(collaboration_Master.actiavtionAcceptedInputPort,
      In_ActivationAccepted) annotation (Line(
        points={{-15.84,48.8},{-15.84,105.2},{0,105.2},{0,134}},
        color={0,0,255},
        smooth=Smooth.None));
    connect(integerExpression.y, collaboration_Master.In_Weight) annotation (Line(
        points={{-54,179},{-54,63},{-48.18,63}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression1.y, collaboration_Master.In_Friction) annotation (
        Line(
        points={{-34,181},{-34,99},{-42,63},{-39.78,63}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression2.y, collaboration_Master.In_Height) annotation (
        Line(
        points={{-10,181},{-24,181},{-24,63},{-31.38,63}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression3.y, turn_Transmission_Partner.In_TurnTime)
      annotation (Line(
        points={{58,179},{82,179},{82,36.7},{99.1,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression4.y, turn_Transmission_Partner.In_X) annotation (
        Line(
        points={{94,179},{94,36.7},{101.5,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression8.y, turn_Transmission_Partner.In_Y) annotation (
        Line(
        points={{106,179},{106,36.7},{103.3,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression6.y, turn_Transmission_Partner.In_Speed) annotation (
       Line(
        points={{144,179},{128,179},{128,36.7},{107.1,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression9.y, turn_Transmission_Partner.In_BatError)
      annotation (Line(
        points={{160,179},{144,179},{144,36.7},{109.3,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(integerExpression7.y, turn_Transmission_Partner.In_Z) annotation (
        Line(
        points={{126,179},{116,179},{116,36.7},{105.3,36.7}},
        color={255,127,0},
        smooth=Smooth.None));
    connect(Beginner.y, collaboration_Master.In_Begin) annotation (Line(
        points={{-239,80},{-106,80},{-106,63.2},{-88.92,63.2}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(Stop.y, collaboration_Master.In_Stop) annotation (Line(
        points={{-239,108},{-80,108},{-80,64},{-80.1,63.2}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(Ready.y, collaboration_Slave.ready) annotation (Line(
        points={{-239,40},{-56,40},{-56,-32},{-55.54,-31.36}},
        color={255,0,255},
        smooth=Smooth.None));
    connect(collaboration_Slave.Slave, turn_Transmission_Partner.Slave)
      annotation (Line(
        points={{-1.2,-43.46},{27.18,-43.46},{27.18,31.8},{71.6,31.8}},
        color={255,128,0},
        smooth=Smooth.None));
    connect(collaboration_Master.Out_Begin, turn_Transmission_Partner.Master)
      annotation (Line(
        points={{-22.56,40.6},{25.72,40.6},{25.72,39},{72,39}},
        color={255,128,0},
        smooth=Smooth.None));
    annotation (Diagram(coordinateSystem(extent={{-260,-120},{180,140}},
            preserveAspectRatio=true), graphics), Icon(coordinateSystem(extent={{-260,
              -120},{180,140}})));
  end Robot;

  package RobotTest
    model RobotTest
      Robot Master(begin=true, integerExpression5(y=0))
        annotation (Placement(transformation(extent={{-88,14},{-44,40}})));
      Robot Slave(begin=false) annotation (Placement(transformation(
            extent={{-22,-13},{22,13}},
            rotation=180,
            origin={40,81})));
    equation
      connect(Slave.OutActivationAccepted, Master.In_ActivationAccepted)
        annotation (Line(
          points={{59.8,87.8},{-60.9,87.8},{-60.9,39.4},{-62,39.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Slave.Out_ActivationRejected, Master.In_ActivationRejected)
        annotation (Line(
          points={{59.8,90.6},{-65.9,90.6},{-65.9,39.4},{-67.2,39.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Master.Out_ActivationProposal, Slave.InActivationProposal)
        annotation (Line(
          points={{-73.2,39.4},{-74,82},{59.8,81.8}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Slave.InDeactivation, Master.Out_Deactivation) annotation (Line(
          points={{59.8,84.6},{-79.1,84.6},{-79.1,39.6},{-78.6,39.6}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(Slave.OutTurn, Master.InTurn) annotation (Line(
          points={{27,78.2},{-8.5,78.2},{-8.5,39.8},{-45.4,39.8}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Master.OutTurn, Slave.InTurn) annotation (Line(
          points={{-45,27.8},{3.5,27.8},{3.5,66.2},{27.4,66.2}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Slave.In_ActivationRejected, Master.Out_ActivationRejected)
        annotation (Line(
          points={{49.2,66.6},{48.6,66.6},{48.6,15.4},{-77.8,15.4}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(Slave.In_ActivationAccepted, Master.OutActivationAccepted)
        annotation (Line(
          points={{44,66.6},{44,18.2},{-77.8,18.2}},
          color={0,0,255},
          smooth=Smooth.None));
      connect(Slave.Out_Deactivation, Master.InDeactivation) annotation (Line(
          points={{60.6,66.4},{61.3,66.4},{61.3,21.4},{-77.8,21.4}},
          color={0,0,0},
          smooth=Smooth.None));
      connect(Slave.Out_ActivationProposal, Master.InActivationProposal)
        annotation (Line(
          points={{55.2,66.6},{54.6,66.6},{54.6,24.2},{-77.8,24.2}},
          color={0,0,0},
          smooth=Smooth.None));
      annotation (Diagram(graphics));
    end RobotTest;
  end RobotTest;
end Projekt;
