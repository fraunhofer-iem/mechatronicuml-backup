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
package org.muml.pim.component.diagram.providers;

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
import org.muml.mumlcore.CorePackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortNameEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortNameEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartNameEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentNameEditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.component.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.component.diagram.parsers.ComponentPartLabelExpressionLabelParser5017;
import org.muml.pim.component.diagram.parsers.CoordinationProtocolPartLabelExpressionLabelParser5026;
import org.muml.pim.component.diagram.parsers.DiscretePortLabelExpressionLabelParser5025;
import org.muml.pim.component.diagram.parsers.HybridPortLabelExpressionLabelParser5024;
import org.muml.pim.component.diagram.parsers.MessageFormatParser;
import org.muml.pim.component.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser staticAtomicComponentName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getStaticAtomicComponentName_5028Parser() {
		if (staticAtomicComponentName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticAtomicComponentName_5028Parser = parser;
		}
		return staticAtomicComponentName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser staticStructuredComponentName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getStaticStructuredComponentName_5021Parser() {
		if (staticStructuredComponentName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticStructuredComponentName_5021Parser = parser;
		}
		return staticStructuredComponentName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser discretePortName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDiscretePortName_5012Parser() {
		if (discretePortName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			discretePortName_5012Parser = parser;
		}
		return discretePortName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser getDiscretePortLabel_5025Parser() {
		return new DiscretePortLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser continuousPortName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getContinuousPortName_5013Parser() {
		if (continuousPortName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			continuousPortName_5013Parser = parser;
		}
		return continuousPortName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser getHybridPortLabel_5024Parser() {
		return new HybridPortLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser getComponentPartLabel_5017Parser() {
		return new ComponentPartLabelExpressionLabelParser5017();
	}

	/**
	 * @generated
	 */
	private IParser portPartName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getPortPartName_5034Parser() {
		if (portPartName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentPackage.eINSTANCE.getPortPart_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portPartName_5034Parser = parser;
		}
		return portPartName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCoordinationProtocolPartLabel_5026Parser() {
		return new CoordinationProtocolPartLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StaticAtomicComponentNameEditPart.VISUAL_ID:
			return getStaticAtomicComponentName_5028Parser();
		case StaticStructuredComponentNameEditPart.VISUAL_ID:
			return getStaticStructuredComponentName_5021Parser();
		case DiscretePortNameEditPart.VISUAL_ID:
			return getDiscretePortName_5012Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getDiscretePortLabel_5025Parser();
		case ContinuousPortNameEditPart.VISUAL_ID:
			return getContinuousPortName_5013Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getHybridPortLabel_5024Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getComponentPartLabel_5017Parser();
		case PortPartNameEditPart.VISUAL_ID:
			return getPortPartName_5034Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getCoordinationProtocolPartLabel_5026Parser();
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
