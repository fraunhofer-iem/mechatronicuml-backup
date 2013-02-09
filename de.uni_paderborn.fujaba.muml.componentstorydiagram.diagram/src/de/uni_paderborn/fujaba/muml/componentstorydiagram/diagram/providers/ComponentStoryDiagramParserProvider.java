package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers;

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
import org.storydriven.core.CorePackage;

/**
 * @generated
 */
public class ComponentStoryDiagramParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	protected IParser componentStoryNodeName_5001Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentStoryNodeName_5001Parser() {
		if (componentStoryNodeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features);
			componentStoryNodeName_5001Parser = parser;
		}
		return componentStoryNodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.PartVariableLabelExpressionLabelParser5018 partVariableLabel_5018Parser;

	/**
	 * @generated
	 */
	protected IParser getPartVariableLabel_5018Parser() {
		if (partVariableLabel_5018Parser == null) {
			partVariableLabel_5018Parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.PartVariableLabelExpressionLabelParser5018();
		}
		return partVariableLabel_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser multiPortVariableName_5022Parser;

	/**
	 * @generated
	 */
	protected IParser getMultiPortVariableName_5022Parser() {
		if (multiPortVariableName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			multiPortVariableName_5022Parser = parser;
		}
		return multiPortVariableName_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser singlePortVariableName_5024Parser;

	/**
	 * @generated
	 */
	protected IParser getSinglePortVariableName_5024Parser() {
		if (singlePortVariableName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			singlePortVariableName_5024Parser = parser;
		}
		return singlePortVariableName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser multiPortVariableName_5026Parser;

	/**
	 * @generated
	 */
	protected IParser getMultiPortVariableName_5026Parser() {
		if (multiPortVariableName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			multiPortVariableName_5026Parser = parser;
		}
		return multiPortVariableName_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser singlePortVariableName_5028Parser;

	/**
	 * @generated
	 */
	protected IParser getSinglePortVariableName_5028Parser() {
		if (singlePortVariableName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			singlePortVariableName_5028Parser = parser;
		}
		return singlePortVariableName_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser controllerExchangeNodeName_5041Parser;

	/**
	 * @generated
	 */
	protected IParser getControllerExchangeNodeName_5041Parser() {
		if (controllerExchangeNodeName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features);
			controllerExchangeNodeName_5041Parser = parser;
		}
		return controllerExchangeNodeName_5041Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.ControllerExchangeNodeLabelExpressionLabelParser5043 controllerExchangeNodeLabel_5043Parser;

	/**
	 * @generated
	 */
	protected IParser getControllerExchangeNodeLabel_5043Parser() {
		if (controllerExchangeNodeLabel_5043Parser == null) {
			controllerExchangeNodeLabel_5043Parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.ControllerExchangeNodeLabelExpressionLabelParser5043();
		}
		return controllerExchangeNodeLabel_5043Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.ControllerExchangeNodeLabelExpressionLabelParser5044 controllerExchangeNodeLabel_5044Parser;

	/**
	 * @generated
	 */
	protected IParser getControllerExchangeNodeLabel_5044Parser() {
		if (controllerExchangeNodeLabel_5044Parser == null) {
			controllerExchangeNodeLabel_5044Parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.ControllerExchangeNodeLabelExpressionLabelParser5044();
		}
		return controllerExchangeNodeLabel_5044Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.FadingFunctionLabelExpressionLabelParser5042 fadingFunctionLabel_5042Parser;

	/**
	 * @generated
	 */
	protected IParser getFadingFunctionLabel_5042Parser() {
		if (fadingFunctionLabel_5042Parser == null) {
			fadingFunctionLabel_5042Parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.FadingFunctionLabelExpressionLabelParser5042();
		}
		return fadingFunctionLabel_5042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser assemblyVariableName_6004Parser;

	/**
	 * @generated
	 */
	protected IParser getAssemblyVariableName_6004Parser() {
		if (assemblyVariableName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			assemblyVariableName_6004Parser = parser;
		}
		return assemblyVariableName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser delegationVariableName_6005Parser;

	/**
	 * @generated
	 */
	protected IParser getDelegationVariableName_6005Parser() {
		if (delegationVariableName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			delegationVariableName_6005Parser = parser;
		}
		return delegationVariableName_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID:
			return getComponentStoryNodeName_5001Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getPartVariableLabel_5018Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableNameEditPart.VISUAL_ID:
			return getMultiPortVariableName_5022Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID:
			return getSinglePortVariableName_5024Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableName2EditPart.VISUAL_ID:
			return getMultiPortVariableName_5026Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.SinglePortVariableName2EditPart.VISUAL_ID:
			return getSinglePortVariableName_5028Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeNameEditPart.VISUAL_ID:
			return getControllerExchangeNodeName_5041Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getControllerExchangeNodeLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getControllerExchangeNodeLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getFadingFunctionLabel_5042Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID:
			return getAssemblyVariableName_6004Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID:
			return getDelegationVariableName_6005Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
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
