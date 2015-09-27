package de.uni_paderborn.fujaba.muml.pattern.diagram.providers;

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
public class CoordinationPatternParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser coordinationPatternName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCoordinationPatternName_5003Parser() {
		if (coordinationPatternName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageFormatParser(
					features);
			coordinationPatternName_5003Parser = parser;
		}
		return coordinationPatternName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5002Parser() {
		if (roleName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageFormatParser(
					features);
			roleName_5002Parser = parser;
		}
		return roleName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5006Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageBufferLabelExpressionLabelParser5006();
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5007Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageBufferLabelExpressionLabelParser5007();
	}

	/**
	 * @generated
	 */
	private IParser getMessageBufferLabel_5011Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageBufferLabelExpressionLabelParser5011();
	}

	/**
	 * @generated
	 */
	private IParser messageTypeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getMessageTypeName_5005Parser() {
		if (messageTypeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.MessageFormatParser(
					features);
			messageTypeName_5005Parser = parser;
		}
		return messageTypeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getParameterLabel_5004Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.ParameterLabelExpressionLabelParser5004();
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5008Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008();
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5009Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009();
	}

	/**
	 * @generated
	 */
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5010Parser() {
		return new de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5010();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternNameEditPart.VISUAL_ID:
			return getCoordinationPatternName_5003Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_5002Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart.VISUAL_ID:
			return getMessageBufferLabel_5006Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getMessageBufferLabel_5007Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getMessageBufferLabel_5011Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
			return getMessageTypeName_5005Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getParameterLabel_5004Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5008Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5009Parser();
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5010Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.getElement(hint) == null) {
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
