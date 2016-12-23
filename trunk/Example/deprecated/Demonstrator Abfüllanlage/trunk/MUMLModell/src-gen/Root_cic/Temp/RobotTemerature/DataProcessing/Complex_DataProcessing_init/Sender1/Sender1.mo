	within Root_cic.Temp.RobotTemerature.DataProcessing.Complex_DataProcessing_init.Sender1;
model Sender1
	annotation (Diagram(coordinateSystem(extent = {{-25.4, -12.7}, {25.4, 12.7}})));
		// attribute declarations
		inner  Integer period;
		// end attribute declarations
		// hybrid port declarations
	Modelica.Blocks.Interfaces.RealInput sensorDataPort
		annotation(Placement(transformation(extent={{0, 0},{35, 20}})));
	inner Real sensorData;
	Real sensorData_sampled;
		// end hybrid port declarations
		// local variable declarations
		// end local variable declarations
		// step declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Step PeriodicSending(
			nIn=1,
			initialStep=true,
			use_activePort=true,
			nOut=1)
			annotation (Placement(transformation(extent={{0.0, 0.0},{25.4, 12.7}})));
	
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.TimeInvariant.TimeInvariantLessOrEqual PeriodicSendingInvariantc0(bound=(period) * 0.0010);
	
		// end step declarations
	
		// variable declarations for do events
		// end variable declarations for do events
	
	
		// transition declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.SelfTransition transition_PeriodicSending_1_PeriodicSending(
				use_after=true,
		    	afterTime=10^(-6),
				loopCheck=false,
				use_conditionPort=true,
				use_firePort=true
			)
			annotation (Placement(transformation(extent={{, },{, }})));
		// end transition declarations
	
		// clock declarations
		inner RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.Clock c0(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock declarations
		// clock constraint declarations
		Modelica_StateGraph2.Blocks.MathBoolean.And transition_PeriodicSending_1_PeriodicSending_AND(nu=1)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.TimeElements.ClockConstraint.ClockConstraintGreaterOrEqual clock_constraint_transition_PeriodicSending_1_PeriodicSending_1(
			bound=(period) * 0.0010)
			annotation (Placement(transformation(extent={{-80,62},{-72,70}})));
		// end clock constraint declarations
		// raise message event declarations
		RealTimeCoordinationLibrary.RealTimeCoordination.Message message_data(
			nIn=1,
			numberOfMessageIntegers=0,
			numberOfMessageReals=1,
			numberOfMessageBooleans=0)
			annotation (Placement(transformation(extent={{0, 0},{30, 30}})));
		RealTimeCoordinationLibrary.RealTimeCoordination.MessageInterface.OutputDelegationPort data_outputDelegationPort(
			redeclare Integer integers[0],
			redeclare Boolean booleans[0],
			redeclare Real reals[1])
			annotation (Placement(transformation(extent={{0, 0},{30, 30}})));
		Real message_data_sensorData;
		Modelica.Blocks.Sources.RealExpression message_data_sensorDatarealExpression(y=message_data_sensorData);
		// end raise message event declarations
		// trigger message event declarations
		// end trigger message event declarations
	equation
		
			// connect transition
			// connect PeriodicSending -> PeriodicSending
			connect(PeriodicSending.outPort[1],
					transition_PeriodicSending_1_PeriodicSending.inPort)
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_PeriodicSending_1_PeriodicSending.outPort,
					PeriodicSending.inPort[1])
				annotation (Line(points={}, color={0,0,0}, smooth=Smooth.None));
			// end connect transition
		
			// connect entry point inputs
			// end connect entry point inputs
			// connect clock constraints
			connect(c0.y, clock_constraint_transition_PeriodicSending_1_PeriodicSending_1.clockValue);
			connect(clock_constraint_transition_PeriodicSending_1_PeriodicSending_1.firePort,
				transition_PeriodicSending_1_PeriodicSending_AND.u[1]);
			connect(transition_PeriodicSending_1_PeriodicSending_AND.y, transition_PeriodicSending_1_PeriodicSending.conditionPort);
			// end connect clock constraints
			// connect state invariants
			connect(PeriodicSending.activePort,
				PeriodicSendingInvariantc0.conditionPort);
			connect(c0.y,
				PeriodicSendingInvariantc0.clockValue);
			// end connect state invariants
			// connect raise message events
			connect(message_data_sensorDatarealExpression.y,
				message_data.u_reals[1]);
			connect(message_data.message_output_port,
				data_outputDelegationPort)
				annotation (Line(points={{30,30}, {50,50}}, color={0,0,0}, smooth=Smooth.None));
			connect(transition_PeriodicSending_1_PeriodicSending.firePort,
				message_data.conditionPort[1]);
			// end connect raise message events
			// connect trigger message events
			// end connect trigger message events
		
		// hybrid port sample value variable equations
	algorithm
		when sample(0, (100) * 0.0010) then
			sensorData := sensorData_sampled;
		end when;
		// end hybrid port sample value variable equations
	algorithm
			// state exit actions
			// end state exit actions
			// assign trigger message parameter bindings to the corresponding parameter binding variables
			// end trigger message parameter bindings to the corresponding parameter binding variables
			// transition actions
			// end transition actions
			// assign parameter binding variables
			when init.region_1_sender1.transition_PeriodicSending_1_PeriodicSending.fire then
				init.region_1_sender1.message_data_sensorData := sensorData;
			end when;
			// end assign parameter binding variables
			// state entry actions
			// end state entry actions
			// do event actions
			// end do event actions
end Sender1;

