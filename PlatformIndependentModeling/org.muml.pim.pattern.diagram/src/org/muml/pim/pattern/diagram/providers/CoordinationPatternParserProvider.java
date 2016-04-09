package org.muml.pim.pattern.diagram.providers;

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
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageBufferNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageTypeNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008;
import org.muml.pim.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009;
import org.muml.pim.pattern.diagram.parsers.MessageBufferLabelExpressionLabelParser5006;
import org.muml.pim.pattern.diagram.parsers.MessageBufferLabelExpressionLabelParser5007;
import org.muml.pim.pattern.diagram.parsers.MessageBufferLabelExpressionLabelParser5011;
import org.muml.pim.pattern.diagram.parsers.MessageFormatParser;
import org.muml.pim.pattern.diagram.parsers.ParameterLabelExpressionLabelParser5004;
import org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry;

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
			MessageFormatParser parser = new MessageFormatParser(features);
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
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5002Parser = parser;
		}
		return roleName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser getMessageBufferLabel_5006Parser() {
		return new MessageBufferLabelExpressionLabelParser5006();
	}

	/**
	* @generated
	*/
	private IParser getMessageBufferLabel_5007Parser() {
		return new MessageBufferLabelExpressionLabelParser5007();
	}

	/**
	* @generated
	*/
	private IParser getMessageBufferLabel_5011Parser() {
		return new MessageBufferLabelExpressionLabelParser5011();
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
			MessageFormatParser parser = new MessageFormatParser(features);
			messageTypeName_5005Parser = parser;
		}
		return messageTypeName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser getParameterLabel_5004Parser() {
		return new ParameterLabelExpressionLabelParser5004();
	}

	/**
	* @generated
	*/
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5008Parser() {
		return new ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008();
	}

	/**
	* @generated
	*/
	private IParser getConnectorQualityOfServiceAssumptionsLabel_5009Parser() {
		return new ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009();
	}

	/**
	* @generated
	*/
	private IParser coordinationPatternVariantName_5012Parser;

	/**
	* @generated
	*/
	private IParser getCoordinationPatternVariantName_5012Parser() {
		if (coordinationPatternVariantName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			coordinationPatternVariantName_5012Parser = parser;
		}
		return coordinationPatternVariantName_5012Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CoordinationPatternNameEditPart.VISUAL_ID:
			return getCoordinationPatternName_5003Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5002Parser();
		case MessageBufferNameEditPart.VISUAL_ID:
			return getMessageBufferLabel_5006Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getMessageBufferLabel_5007Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getMessageBufferLabel_5011Parser();
		case MessageTypeNameEditPart.VISUAL_ID:
			return getMessageTypeName_5005Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getParameterLabel_5004Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5008Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptionsLabel_5009Parser();
		case CoordinationPatternVariantNameEditPart.VISUAL_ID:
			return getCoordinationPatternVariantName_5012Parser();
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
