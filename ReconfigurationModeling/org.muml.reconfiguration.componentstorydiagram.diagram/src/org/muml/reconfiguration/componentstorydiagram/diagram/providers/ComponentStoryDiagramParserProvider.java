package org.muml.reconfiguration.componentstorydiagram.diagram.providers;

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
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import org.muml.core.CorePackage;

/**
 * @generated
 */
public class ComponentStoryDiagramParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentStoryNodeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getComponentStoryNodeName_5001Parser() {
		if (componentStoryNodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features);
			componentStoryNodeName_5001Parser = parser;
		}
		return componentStoryNodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getComponentPartVariableLabel_5018Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.ComponentPartVariableLabelExpressionLabelParser5018();
	}

	/**
	 * @generated
	 */
	private IParser getComponentPartVariableLabel_5063Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.ComponentPartVariableLabelExpressionLabelParser5063();
	}

	/**
	 * @generated
	 */
	private IParser multiPortVariableName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableName_5022Parser() {
		if (multiPortVariableName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			multiPortVariableName_5022Parser = parser;
		}
		return multiPortVariableName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableLabel_5056Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MultiPortVariableLabelExpressionLabelParser5056();
	}

	/**
	 * @generated
	 */
	private IParser singlePortVariableName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableName_5024Parser() {
		if (singlePortVariableName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			singlePortVariableName_5024Parser = parser;
		}
		return singlePortVariableName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableLabel_5057Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.SinglePortVariableLabelExpressionLabelParser5057();
	}

	/**
	 * @generated
	 */
	private IParser multiPortVariableName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableName_5026Parser() {
		if (multiPortVariableName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			multiPortVariableName_5026Parser = parser;
		}
		return multiPortVariableName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMultiPortVariableLabel_5058Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MultiPortVariableLabelExpressionLabelParser5058();
	}

	/**
	 * @generated
	 */
	private IParser singlePortVariableName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableName_5028Parser() {
		if (singlePortVariableName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			singlePortVariableName_5028Parser = parser;
		}
		return singlePortVariableName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSinglePortVariableLabel_5059Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.SinglePortVariableLabelExpressionLabelParser5059();
	}

	/**
	 * @generated
	 */
	private IParser controllerExchangeNodeName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getControllerExchangeNodeName_5041Parser() {
		if (controllerExchangeNodeName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features);
			controllerExchangeNodeName_5041Parser = parser;
		}
		return controllerExchangeNodeName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser getControllerExchangeNodeLabel_5064Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.ControllerExchangeNodeLabelExpressionLabelParser5064();
	}

	/**
	 * @generated
	 */
	private IParser getFadingComponentPartVariableLabel_5054Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.FadingComponentPartVariableLabelExpressionLabelParser5054();
	}

	/**
	 * @generated
	 */
	private IParser getFadingComponentPartVariableLabel_5065Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.FadingComponentPartVariableLabelExpressionLabelParser5065();
	}

	/**
	 * @generated
	 */
	private IParser assemblyVariableName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAssemblyVariableName_6004Parser() {
		if (assemblyVariableName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			assemblyVariableName_6004Parser = parser;
		}
		return assemblyVariableName_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser delegationVariableName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getDelegationVariableName_6005Parser() {
		if (delegationVariableName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			delegationVariableName_6005Parser = parser;
		}
		return delegationVariableName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMultiPortOrderConstraintLabel_6006Parser() {
		return new org.muml.reconfiguration.componentstorydiagram.diagram.parsers.MultiPortOrderConstraintLabelExpressionLabelParser6006();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID:
			return getComponentStoryNodeName_5001Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getComponentPartVariableLabel_5018Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getComponentPartVariableLabel_5063Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart.VISUAL_ID:
			return getMultiPortVariableName_5022Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabelEditPart.VISUAL_ID:
			return getMultiPortVariableLabel_5056Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID:
			return getSinglePortVariableName_5024Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel2EditPart.VISUAL_ID:
			return getSinglePortVariableLabel_5057Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableName2EditPart.VISUAL_ID:
			return getMultiPortVariableName_5026Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel3EditPart.VISUAL_ID:
			return getMultiPortVariableLabel_5058Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableName2EditPart.VISUAL_ID:
			return getSinglePortVariableName_5028Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.UnderlinedLabel4EditPart.VISUAL_ID:
			return getSinglePortVariableLabel_5059Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart.VISUAL_ID:
			return getControllerExchangeNodeName_5041Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getControllerExchangeNodeLabel_5064Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getFadingComponentPartVariableLabel_5054Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getFadingComponentPartVariableLabel_5065Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID:
			return getAssemblyVariableName_6004Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID:
			return getDelegationVariableName_6005Parser();
		case org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortOrderConstraintOrderConstraintTypeEditPart.VISUAL_ID:
			return getMultiPortOrderConstraintLabel_6006Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
					.getElement(hint) == null) {
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
