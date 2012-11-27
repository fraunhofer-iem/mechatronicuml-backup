package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers;

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
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser(
					features);
			componentStoryNodeName_5001Parser = parser;
		}
		return componentStoryNodeName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser portVariableName_5007Parser;

	/**
	 * @generated
	 */
	protected IParser getPortVariableName_5007Parser() {
		if (portVariableName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			portVariableName_5007Parser = parser;
		}
		return portVariableName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.PartVariableLabelExpressionLabelParser5009 partVariableLabel_5009Parser;

	/**
	 * @generated
	 */
	protected IParser getPartVariableLabel_5009Parser() {
		if (partVariableLabel_5009Parser == null) {
			partVariableLabel_5009Parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.PartVariableLabelExpressionLabelParser5009();
		}
		return partVariableLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser portVariableName_5008Parser;

	/**
	 * @generated
	 */
	protected IParser getPortVariableName_5008Parser() {
		if (portVariableName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			portVariableName_5008Parser = parser;
		}
		return portVariableName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser assemblyVariableName_6002Parser;

	/**
	 * @generated
	 */
	protected IParser getAssemblyVariableName_6002Parser() {
		if (assemblyVariableName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			assemblyVariableName_6002Parser = parser;
		}
		return assemblyVariableName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser delegationVariableName_6003Parser;

	/**
	 * @generated
	 */
	protected IParser getDelegationVariableName_6003Parser() {
		if (delegationVariableName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			delegationVariableName_6003Parser = parser;
		}
		return delegationVariableName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID:
			return getComponentStoryNodeName_5001Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableNameEditPart.VISUAL_ID:
			return getPortVariableName_5007Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getPartVariableLabel_5009Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableName2EditPart.VISUAL_ID:
			return getPortVariableName_5008Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID:
			return getAssemblyVariableName_6002Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID:
			return getDelegationVariableName_6003Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
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
