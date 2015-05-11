package de.uni_paderborn.fujaba.muml.messagetype.diagram.providers;

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
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser messageTypeRepositoryName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getMessageTypeRepositoryName_5017Parser() {
		if (messageTypeRepositoryName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.messagetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.messagetype.diagram.parsers.MessageFormatParser(
					features);
			messageTypeRepositoryName_5017Parser = parser;
		}
		return messageTypeRepositoryName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageTypeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getMessageTypeName_5014Parser() {
		if (messageTypeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.messagetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.messagetype.diagram.parsers.MessageFormatParser(
					features);
			messageTypeName_5014Parser = parser;
		}
		return messageTypeName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser getParameterLabel_5016Parser() {
		return new de.uni_paderborn.fujaba.muml.messagetype.diagram.parsers.ParameterLabelExpressionLabelParser5016();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID:
			return getMessageTypeRepositoryName_5017Parser();
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
			return getMessageTypeName_5014Parser();
		case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getParameterLabel_5016Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes
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
