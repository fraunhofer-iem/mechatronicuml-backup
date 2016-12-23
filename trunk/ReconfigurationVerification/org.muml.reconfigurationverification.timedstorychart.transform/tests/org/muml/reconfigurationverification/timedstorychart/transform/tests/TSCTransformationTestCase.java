package org.muml.reconfigurationverification.timedstorychart.transform.tests;

import org.junit.Before;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.pim.actionlanguage.DiscreteInteractionEndpointReference;
import org.muml.pim.actionlanguage.PositionSelector;
import org.muml.pim.actionlanguage.PositionSelectorKind;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MsgtypeFactory;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.ProtocolFactory;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.EventKind;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.RelativeDeadline;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypeFactory;

public abstract class TSCTransformationTestCase {
	
	protected CoordinationProtocol coordinationProtocol;

	protected String transformation_path;

	private RealtimeStatechart adaptationBehavior;

	private RealtimeStatechart behavior;

	private SynchronizationChannel synchronizationChannel;

	@Before
	public void setUp() throws Exception {
		setTransformationPath();
		
		coordinationProtocol = ProtocolFactory.eINSTANCE.createCoordinationProtocol();
		coordinationProtocol.setName("rtcp1");
		
		Role role1 = createRole("role1");
		Role role2 = createRole("role2");
		
		CommonExpressionsFactory expFactory = CommonExpressionsFactory.eINSTANCE;
		
		RoleConnector connector = ProtocolFactory.eINSTANCE.createRoleConnector();
		ConnectorQualityOfServiceAssumptions assumptions = ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions();
		LiteralExpression lower = expFactory.createLiteralExpression();
		lower.setValue("1");
		TimeValue lowerTimeValue = ValuetypeFactory.eINSTANCE.createTimeValue();
		lowerTimeValue.setValue(lower);
		LiteralExpression upper = expFactory.createLiteralExpression();
		upper.setValue("2");
		TimeValue upperTimeValue = ValuetypeFactory.eINSTANCE.createTimeValue();
		upperTimeValue.setValue(upper);
		assumptions.setMinMessageDelay(lowerTimeValue);
		assumptions.setMaxMessageDelay(upperTimeValue);
		assumptions.setMessageLossPossible(false);

		connector.setConnectorQualityOfServiceAssumptions(assumptions);
		connector.getConnectorEndpoints().add(role1);
		connector.getConnectorEndpoints().add(role2);
		connector.setCoordinationProtocol(coordinationProtocol);

	}

	private Role createRole(String name) {
		Role role = ProtocolFactory.eINSTANCE.createRole();
		role.setName(name);
		Cardinality cardinality = ValuetypeFactory.eINSTANCE.createCardinality();
		NaturalNumber lower = ValuetypeFactory.eINSTANCE.createNaturalNumber();
		lower.setValue(1);
		NaturalNumber upper = ValuetypeFactory.eINSTANCE.createNaturalNumber();
		upper.setValue(2);
		cardinality.setLowerBound(lower);
		cardinality.setUpperBound(upper);
		role.setCardinality(cardinality);

		role.setBehavior(createParentStatechart(name));
		role.setCoordinatorBehavior(adaptationBehavior);
		role.setSubroleBehavior(behavior);
		role.setCoordinationProtocol(coordinationProtocol);
		
		return role;
	}
	
	private RealtimeStatechart createParentStatechart(String name){
		RealtimeStatechart rtsc = RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart();
		rtsc.setName(name + "_parent");
		
		State state1 = RealtimestatechartFactory.eINSTANCE.createState();
		state1.setName("state1");
		state1.setInitial(true);
		state1.setParentStatechart(rtsc);

		synchronizationChannel = RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel();
		synchronizationChannel.setName(name+"ch1");
		synchronizationChannel.setState(state1);
		
		Region region1 = RealtimestatechartFactory.eINSTANCE.createRegion();
		adaptationBehavior = createRealtimeStatechart(name + "_adaptation_rtsc");
		region1.setEmbeddedStatechart(adaptationBehavior);
		Region region2 = RealtimestatechartFactory.eINSTANCE.createRegion();
		behavior = createRealtimeStatechart(name + "_behavior");
		region2.setEmbeddedStatechart(behavior);
		region1.setParentState(state1);
		region2.setParentState(state1);
		
		return rtsc;
	}

	private RealtimeStatechart createRealtimeStatechart(String name) {
		RealtimeStatechart rtsc = RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart();
		rtsc.setName(name);
		
		State state1 = RealtimestatechartFactory.eINSTANCE.createState();
		state1.setName("state1");
		state1.setInitial(true);
		state1.setParentStatechart(rtsc);
		
		State state2 = RealtimestatechartFactory.eINSTANCE.createState();
		state2.setName("state2");
		state2.setInitial(false);
		state2.setParentStatechart(rtsc);
		
		CommonExpressionsFactory expFactory = CommonExpressionsFactory.eINSTANCE;
		
		Transition state1_state2 = RealtimestatechartFactory.eINSTANCE.createTransition();
		RelativeDeadline deadline = RealtimestatechartFactory.eINSTANCE.createRelativeDeadline();
		LiteralExpression lower = expFactory.createLiteralExpression();
		lower.setValue("3");
		TimeValue lowerTimeValue = ValuetypeFactory.eINSTANCE.createTimeValue();
		lowerTimeValue.setValue(lower);
		LiteralExpression upper = expFactory.createLiteralExpression();
		upper.setValue("5");
		TimeValue upperTimeValue = ValuetypeFactory.eINSTANCE.createTimeValue();
		upperTimeValue.setValue(upper);
		deadline.setLowerBound(lowerTimeValue);
		deadline.setUpperBound(upperTimeValue);
		state1_state2.setRelativeDeadline(deadline);
		state1_state2.setSource(state1);
		state1_state2.setTarget(state2);
		rtsc.getTransitions().add(state1_state2);
		
		Synchronization synchronization = RealtimestatechartFactory.eINSTANCE.createSynchronization();
		synchronization.setSyncChannel(synchronizationChannel);
		DiscreteInteractionEndpointReference selectorExpression = ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference();
		PositionSelector positionSelector = ActionlanguageFactory.eINSTANCE.createPositionSelector();
		if(name.contains("behavior")){
			positionSelector.setKind(PositionSelectorKind.SELF);
			PositionSelector succSelectorExpression = ActionlanguageFactory.eINSTANCE.createPositionSelector();
			succSelectorExpression.setKind(PositionSelectorKind.NEXT);
			positionSelector.setSuccessor(succSelectorExpression);
			synchronization.setKind(SynchronizationKind.RECEIVE);
		}
		else{
			positionSelector.setKind(PositionSelectorKind.FIRST);
			synchronization.setKind(SynchronizationKind.SEND);
		}
		selectorExpression.setPosition(positionSelector);
		synchronization.setSelectorExpression(selectorExpression);

		state1_state2.setSynchronization(synchronization);
		

		PrimitiveDataType dataType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		dataType.setName("INT");
		dataType.setPrimitiveType(PrimitiveTypes.INT32);
		Parameter parameter1 = BehaviorFactory.eINSTANCE.createParameter();
		parameter1.setName("param1");
		parameter1.setDataType(dataType);
		Parameter parameter2 = BehaviorFactory.eINSTANCE.createParameter();
		parameter2.setName("param2");
		parameter2.setDataType(dataType);
		Parameter parameter3 = BehaviorFactory.eINSTANCE.createParameter();
		parameter3.setName("param3");
		parameter3.setDataType(dataType);
		Parameter parameter4 = BehaviorFactory.eINSTANCE.createParameter();
		parameter4.setName("param4");
		parameter4.setDataType(dataType);
		
		ParameterBinding parameterBinding1 = BehaviorFactory.eINSTANCE.createParameterBinding();
		parameterBinding1.setParameter(parameter1);
		LiteralExpression expression = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		expression.setValue("11");
		parameterBinding1.setValue(expression);
		ParameterBinding parameterBinding2 = BehaviorFactory.eINSTANCE.createParameterBinding();
		parameterBinding2.setParameter(parameter2);
		LiteralExpression expression2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		expression2.setValue("12");
		parameterBinding2.setValue(expression2);
		ParameterBinding parameterBinding3 = BehaviorFactory.eINSTANCE.createParameterBinding();
		parameterBinding3.setParameter(parameter3);
		LiteralExpression expression3 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		expression3.setValue("13");
		parameterBinding3.setValue(expression3);
		ParameterBinding parameterBinding4 = BehaviorFactory.eINSTANCE.createParameterBinding();
		parameterBinding4.setParameter(parameter4);
		LiteralExpression expression4 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		expression4.setValue("14");
		parameterBinding4.setValue(expression4);
			
		AsynchronousMessageEvent raiseEvent = RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent();
		raiseEvent.setKind(EventKind.RAISE);
		MessageType messageType = MsgtypeFactory.eINSTANCE.createMessageType();
		messageType.setName("m1");
		Message message = RealtimestatechartFactory.eINSTANCE.createMessage();
		message.getParameterBinding().add(parameterBinding1);
		message.getParameterBinding().add(parameterBinding2);
		message.setInstanceOf(messageType);
		raiseEvent.setMessage(message);
		state1_state2.getEvents().add(raiseEvent);

		AsynchronousMessageEvent triggerEvent = RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent();
		triggerEvent.setKind(EventKind.TRIGGER);
		Message message2 = RealtimestatechartFactory.eINSTANCE.createMessage();
		message2.getParameterBinding().add(parameterBinding3);
		message2.getParameterBinding().add(parameterBinding4);
		message2.setInstanceOf(messageType);
		triggerEvent.setMessage(message2);
		state1_state2.getEvents().add(triggerEvent);
		
		return rtsc;
	}
	


	protected abstract void setTransformationPath();



}
