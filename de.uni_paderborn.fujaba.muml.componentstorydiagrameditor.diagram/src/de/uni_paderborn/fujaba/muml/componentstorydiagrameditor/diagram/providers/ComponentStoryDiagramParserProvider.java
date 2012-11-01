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
	protected IParser componentVariableName_5002Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentVariableName_5002Parser() {
		if (componentVariableName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.MessageFormatParser(
					features);
			componentVariableName_5002Parser = parser;
		}
		return componentVariableName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.ComponentVariableLabelExpressionLabelParser5003 componentVariableLabel_5003Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentVariableLabel_5003Parser() {
		if (componentVariableLabel_5003Parser == null) {
			componentVariableLabel_5003Parser = new de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.parsers.ComponentVariableLabelExpressionLabelParser5003();
		}
		return componentVariableLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeNameEditPart.VISUAL_ID:
			return getComponentStoryNodeName_5001Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableNameEditPart.VISUAL_ID:
			return getComponentVariableName_5002Parser();
		case de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableOperatorEditPart.VISUAL_ID:
			return getComponentVariableLabel_5003Parser();
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
