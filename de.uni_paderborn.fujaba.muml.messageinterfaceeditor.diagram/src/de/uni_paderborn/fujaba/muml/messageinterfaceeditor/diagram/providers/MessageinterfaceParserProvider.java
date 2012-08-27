package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers;

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
public class MessageinterfaceParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected IParser messageInterfaceName_5012Parser;

	/**
	 * @generated
	 */
	protected IParser getMessageInterfaceName_5012Parser() {
		if (messageInterfaceName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.MessageFormatParser(
					features);
			messageInterfaceName_5012Parser = parser;
		}
		return messageInterfaceName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser messageTypeName_5008Parser;

	/**
	 * @generated
	 */
	protected IParser getMessageTypeName_5008Parser() {
		if (messageTypeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.MessageFormatParser(
					features);
			messageTypeName_5008Parser = parser;
		}
		return messageTypeName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.ParameterLabelExpressionLabelParser5011 parameterLabel_5011Parser;

	/**
	 * @generated
	 */
	protected IParser getParameterLabel_5011Parser() {
		if (parameterLabel_5011Parser == null) {
			parameterLabel_5011Parser = new de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.ParameterLabelExpressionLabelParser5011();
		}
		return parameterLabel_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceNameEditPart.VISUAL_ID:
			return getMessageInterfaceName_5012Parser();
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getMessageTypeName_5008Parser();
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getParameterLabel_5011Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes
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
