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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers;

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
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableName2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableName2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabelEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.ComponentPartVariableLabelExpressionLabelParser5026;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.ComponentPartVariableLabelExpressionLabelParser5040;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.ComponentStoryPatternNodeLabelExpressionLabelParser5037;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.ComponentStoryPatternNodeLabelExpressionLabelParser5038;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.FadingComponentPartVariableLabelExpressionLabelParser5044;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.FadingComponentPartVariableLabelExpressionLabelParser5046;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.InitialNodeLabelExpressionLabelParser5042;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.InitialNodeLabelExpressionLabelParser5043;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.MessageFormatParser;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.MultiPortOrderConstraintLabelExpressionLabelParser6003;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.MultiPortVariableLabelExpressionLabelParser5021;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.MultiPortVariableLabelExpressionLabelParser5029;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.SinglePortVariableLabelExpressionLabelParser5024;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.parsers.SinglePortVariableLabelExpressionLabelParser5032;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;

/**
 * @generated
 */
public class ComponentSDDParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser getComponentStoryPatternNodeLabel_5037Parser() {
		return new ComponentStoryPatternNodeLabelExpressionLabelParser5037();
	}

	/**
	 * @generated
	 */
	private IParser getComponentStoryPatternNodeLabel_5038Parser() {
		return new ComponentStoryPatternNodeLabelExpressionLabelParser5038();
	}

	/**
	 * @generated
	 */
	private IParser getInitialNodeLabel_5042Parser() {
		return new InitialNodeLabelExpressionLabelParser5042();
	}

	/**
	 * @generated
	 */
	private IParser getInitialNodeLabel_5043Parser() {
		return new InitialNodeLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser getComponentPartVariableLabel_5026Parser() {
		return new ComponentPartVariableLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	private IParser getComponentPartVariableLabel_5040Parser() {
		return new ComponentPartVariableLabelExpressionLabelParser5040();
	}

	/**
	 * @generated
	 */
	private IParser multiPortVariableName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableName_5020Parser() {
		if (multiPortVariableName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			multiPortVariableName_5020Parser = parser;
		}
		return multiPortVariableName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableLabel_5021Parser() {
		return new MultiPortVariableLabelExpressionLabelParser5021();
	}

	/**
	 * @generated
	 */
	private IParser singlePortVariableName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableName_5023Parser() {
		if (singlePortVariableName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			singlePortVariableName_5023Parser = parser;
		}
		return singlePortVariableName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableLabel_5024Parser() {
		return new SinglePortVariableLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser multiPortVariableName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableName_5028Parser() {
		if (multiPortVariableName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			multiPortVariableName_5028Parser = parser;
		}
		return multiPortVariableName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableLabel_5029Parser() {
		return new MultiPortVariableLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser singlePortVariableName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableName_5031Parser() {
		if (singlePortVariableName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			singlePortVariableName_5031Parser = parser;
		}
		return singlePortVariableName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableLabel_5032Parser() {
		return new SinglePortVariableLabelExpressionLabelParser5032();
	}

	/**
	 * @generated
	 */
	private IParser getFadingComponentPartVariableLabel_5044Parser() {
		return new FadingComponentPartVariableLabelExpressionLabelParser5044();
	}

	/**
	 * @generated
	 */
	private IParser getFadingComponentPartVariableLabel_5046Parser() {
		return new FadingComponentPartVariableLabelExpressionLabelParser5046();
	}

	/**
	 * @generated
	 */
	private IParser assemblyVariableName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getAssemblyVariableName_6001Parser() {
		if (assemblyVariableName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			assemblyVariableName_6001Parser = parser;
		}
		return assemblyVariableName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser delegationVariableName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getDelegationVariableName_6002Parser() {
		if (delegationVariableName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			delegationVariableName_6002Parser = parser;
		}
		return delegationVariableName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMultiPortOrderConstraintLabel_6003Parser() {
		return new MultiPortOrderConstraintLabelExpressionLabelParser6003();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentStoryPatternNodeNameEditPart.VISUAL_ID:
			return getComponentStoryPatternNodeLabel_5037Parser();
		case ComponentStoryPatternNodeTypeEditPart.VISUAL_ID:
			return getComponentStoryPatternNodeLabel_5038Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getInitialNodeLabel_5042Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getInitialNodeLabel_5043Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getComponentPartVariableLabel_5026Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getComponentPartVariableLabel_5040Parser();
		case MultiPortVariableNameEditPart.VISUAL_ID:
			return getMultiPortVariableName_5020Parser();
		case UnderlinedLabelEditPart.VISUAL_ID:
			return getMultiPortVariableLabel_5021Parser();
		case SinglePortVariableNameEditPart.VISUAL_ID:
			return getSinglePortVariableName_5023Parser();
		case UnderlinedLabel2EditPart.VISUAL_ID:
			return getSinglePortVariableLabel_5024Parser();
		case MultiPortVariableName2EditPart.VISUAL_ID:
			return getMultiPortVariableName_5028Parser();
		case UnderlinedLabel3EditPart.VISUAL_ID:
			return getMultiPortVariableLabel_5029Parser();
		case SinglePortVariableName2EditPart.VISUAL_ID:
			return getSinglePortVariableName_5031Parser();
		case UnderlinedLabel4EditPart.VISUAL_ID:
			return getSinglePortVariableLabel_5032Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getFadingComponentPartVariableLabel_5044Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getFadingComponentPartVariableLabel_5046Parser();
		case AssemblyVariableNameEditPart.VISUAL_ID:
			return getAssemblyVariableName_6001Parser();
		case DelegationVariableNameEditPart.VISUAL_ID:
			return getDelegationVariableName_6002Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getMultiPortOrderConstraintLabel_6003Parser();
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
			return getParser(ComponentSDDVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComponentSDDVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComponentSDDElementTypes.getElement(hint) == null) {
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
