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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.CorePackage;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.CoordinationProtocolNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageTypeNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleNameEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5020;
import org.muml.pim.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5021;
import org.muml.pim.coordinationprotocol.diagram.parsers.MessageBufferLabelExpressionLabelParser5018;
import org.muml.pim.coordinationprotocol.diagram.parsers.MessageBufferLabelExpressionLabelParser5019;
import org.muml.pim.coordinationprotocol.diagram.parsers.MessageBufferLabelExpressionLabelParser5025;
import org.muml.pim.coordinationprotocol.diagram.parsers.MessageFormatParser;
import org.muml.pim.coordinationprotocol.diagram.parsers.ParameterLabelExpressionLabelParser5024;
import org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser coordinationProtocolName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getCoordinationProtocolName_5023Parser() {
		if (coordinationProtocolName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			coordinationProtocolName_5023Parser = parser;
		}
		return coordinationProtocolName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5006Parser() {
		if (roleName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5006Parser = parser;
		}
		return roleName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5018Parser() {
		return new MessageBufferLabelExpressionLabelParser5018();
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5019Parser() {
		return new MessageBufferLabelExpressionLabelParser5019();
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5025Parser() {
		return new MessageBufferLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser messageTypeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getMessageTypeName_5010Parser() {
		if (messageTypeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageTypeName_5010Parser = parser;
		}
		return messageTypeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser getParameterLabel_5024Parser() {
		return new ParameterLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5020Parser() {
		return new ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5020();
	}

	/**
	* @generated
	*/
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5021Parser() {
		return new ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5021();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CoordinationProtocolNameEditPart.VISUAL_ID:
			return getCoordinationProtocolName_5023Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5006Parser();
		case MessageBufferNameEditPart.VISUAL_ID:
			return getMessageBufferLabel_5018Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getMessageBufferLabel_5019Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getMessageBufferLabel_5025Parser();
		case MessageTypeNameEditPart.VISUAL_ID:
			return getMessageTypeName_5010Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getParameterLabel_5024Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5020Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5021Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MumlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MumlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MumlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
