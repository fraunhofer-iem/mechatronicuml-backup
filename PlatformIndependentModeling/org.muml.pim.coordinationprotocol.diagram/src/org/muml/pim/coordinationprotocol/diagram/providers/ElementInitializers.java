/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.coordinationprotocol.diagram.providers;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EcorePackage;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsPackage;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.coordinationprotocol.diagram.expressions.MumlAbstractExpression;
import org.muml.pim.coordinationprotocol.diagram.expressions.MumlOCLFactory;
import org.muml.pim.coordinationprotocol.diagram.part.MumlDiagramEditorPlugin;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.ProtocolFactory;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public void init_CoordinationProtocol_2005(CoordinationProtocol instance) {
		try {
			RoleConnector newInstance_0_0 = ProtocolFactory.eINSTANCE.createRoleConnector();
			instance.setRoleConnector(newInstance_0_0);
			ConnectorQualityOfServiceAssumptions newInstance_0_0_0_0 = ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_0_0.setConnectorQualityOfServiceAssumptions(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = MumlOCLFactory
					.getExpression(0, ProtocolPackage.eINSTANCE.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_0_0_0_0);
			newInstance_0_0_0_0.setComment((String) value_0_0_0_0_0);
			TimeValue newInstance_0_0_0_0_1_0 = ValuetypeFactory.eINSTANCE.createTimeValue();
			newInstance_0_0_0_0.setMaxMessageDelay(newInstance_0_0_0_0_1_0);
			LiteralExpression newInstance_0_0_0_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_0_0_0_0_1_0.setValue(newInstance_0_0_0_0_1_0_0_0);
			Object value_0_0_0_0_1_0_0_0_0 = MumlOCLFactory
					.getExpression(1, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_0_0_0_0_1_0_0_0);
			newInstance_0_0_0_0_1_0_0_0.setValue((String) value_0_0_0_0_1_0_0_0_0);

			newInstance_0_0_0_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			Role newInstance_1_0 = ProtocolFactory.eINSTANCE.createRole();
			instance.getRoles().add(newInstance_1_0);
			Object value_1_0_0 = MumlOCLFactory.getExpression(2, ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);
			Cardinality newInstance_1_0_1_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			newInstance_1_0.setCardinality(newInstance_1_0_1_0);
			NaturalNumber newInstance_1_0_1_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_1_0_1_0.setLowerBound(newInstance_1_0_1_0_0_0);
			Object value_1_0_1_0_0_0_0 = MumlOCLFactory
					.getExpression(3, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_0_1_0_0_0);

			value_1_0_1_0_0_0_0 = MumlAbstractExpression.performCast(value_1_0_1_0_0_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0_0_0.setValue(((Long) value_1_0_1_0_0_0_0).longValue());

			NaturalNumber newInstance_1_0_1_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_1_0_1_0.setUpperBound(newInstance_1_0_1_0_1_0);
			Object value_1_0_1_0_1_0_0 = MumlOCLFactory
					.getExpression(4, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_0_1_0_1_0);

			value_1_0_1_0_1_0_0 = MumlAbstractExpression.performCast(value_1_0_1_0_1_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_1_0_1_0_1_0.setValue(((Long) value_1_0_1_0_1_0_0).longValue());

			Object value_1_0_2 = MumlOCLFactory.getExpression(5, ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_1_0);
			if (value_1_0_2 instanceof Collection) {
				newInstance_1_0.getConnectors().clear();
				newInstance_1_0.getConnectors().addAll(((Collection) value_1_0_2));
			} else {
				newInstance_1_0.getConnectors().add((Connector) value_1_0_2);
			}

			Role newInstance_1_1 = ProtocolFactory.eINSTANCE.createRole();
			instance.getRoles().add(newInstance_1_1);
			Object value_1_1_0 = MumlOCLFactory.getExpression(6, ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_1_1);
			newInstance_1_1.setName((String) value_1_1_0);
			Cardinality newInstance_1_1_1_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			newInstance_1_1.setCardinality(newInstance_1_1_1_0);
			NaturalNumber newInstance_1_1_1_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_1_1_1_0.setLowerBound(newInstance_1_1_1_0_0_0);
			Object value_1_1_1_0_0_0_0 = MumlOCLFactory
					.getExpression(7, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_1_1_0_0_0);

			value_1_1_1_0_0_0_0 = MumlAbstractExpression.performCast(value_1_1_1_0_0_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_1_1_1_0_0_0.setValue(((Long) value_1_1_1_0_0_0_0).longValue());

			NaturalNumber newInstance_1_1_1_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_1_1_1_0.setUpperBound(newInstance_1_1_1_0_1_0);
			Object value_1_1_1_0_1_0_0 = MumlOCLFactory
					.getExpression(8, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_1_1_1_0_1_0);

			value_1_1_1_0_1_0_0 = MumlAbstractExpression.performCast(value_1_1_1_0_1_0_0,
					EcorePackage.eINSTANCE.getELong());
			newInstance_1_1_1_0_1_0.setValue(((Long) value_1_1_1_0_1_0_0).longValue());

			Object value_1_1_2 = MumlOCLFactory.getExpression(9, ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_1_1);
			if (value_1_1_2 instanceof Collection) {
				newInstance_1_1.getConnectors().clear();
				newInstance_1_1.getConnectors().addAll(((Collection) value_1_1_2));
			} else {
				newInstance_1_1.getConnectors().add((Connector) value_1_1_2);
			}

			Object value_2 = MumlOCLFactory.getExpression(22, ProtocolPackage.eINSTANCE.getCoordinationProtocol(), null)
					.evaluate(instance);
			instance.setName((String) value_2);
		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationProtocol_3015(CoordinationProtocol instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(23, ProtocolPackage.eINSTANCE.getCoordinationProtocol(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Role_3006(Role instance) {
		try {
			Cardinality newInstance_0_0 = ValuetypeFactory.eINSTANCE.createCardinality();
			instance.setCardinality(newInstance_0_0);
			NaturalNumber newInstance_0_0_0_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = MumlOCLFactory
					.getExpression(10, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = MumlAbstractExpression.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			NaturalNumber newInstance_0_0_1_0 = ValuetypeFactory.eINSTANCE.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = MumlOCLFactory
					.getExpression(11, ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = MumlAbstractExpression.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = MumlOCLFactory.getExpression(24, ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_MessageBuffer_3013(MessageBuffer instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(25, ConnectorPackage.eINSTANCE.getMessageBuffer(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_MessageType_3009(MessageType instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(26, MsgtypePackage.eINSTANCE.getMessageType(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Parameter_3016(Parameter instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(27, BehaviorPackage.eINSTANCE.getParameter(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_RoleConnector_4006(RoleConnector instance) {
		try {
			ConnectorQualityOfServiceAssumptions newInstance_0_0 = ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = MumlOCLFactory
					.getExpression(19, ProtocolPackage.eINSTANCE.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setComment((String) value_0_0_0);
			TimeValue newInstance_0_0_1_0 = ValuetypeFactory.eINSTANCE.createTimeValue();
			newInstance_0_0.setMaxMessageDelay(newInstance_0_0_1_0);
			LiteralExpression newInstance_0_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			newInstance_0_0_1_0.setValue(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = MumlOCLFactory
					.getExpression(20, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_0_0_1_0_0_0);
			newInstance_0_0_1_0_0_0.setValue((String) value_0_0_1_0_0_0_0);

			newInstance_0_0_1_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			MumlDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MumlDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MumlDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
