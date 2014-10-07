package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers;

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
import org.storydriven.core.CorePackage;

/**
 * @generated
 */
public class BasicSDDParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser storyPatternNodeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getStoryPatternNodeName_5014Parser() {
		if (storyPatternNodeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			storyPatternNodeName_5014Parser = parser;
		}
		return storyPatternNodeName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser storyPatternNodeType_5015Parser;

	/**
	 * @generated
	 */
	private IParser getStoryPatternNodeType_5015Parser() {
		if (storyPatternNodeType_5015Parser == null) {
			EAttribute editableFeature = de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getPatternNode_Type();
			EnumParser parser = new EnumParser(editableFeature);
			storyPatternNodeType_5015Parser = parser;
		}
		return storyPatternNodeType_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionVariableName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionVariableName_5009Parser() {
		if (collectionVariableName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			collectionVariableName_5009Parser = parser;
		}
		return collectionVariableName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectVariableName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getObjectVariableName_5012Parser() {
		if (objectVariableName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			objectVariableName_5012Parser = parser;
		}
		return objectVariableName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeNameEditPart.VISUAL_ID:
			return getStoryPatternNodeName_5014Parser();

		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeTypeEditPart.VISUAL_ID:
			return getStoryPatternNodeType_5015Parser();
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableNameEditPart.VISUAL_ID:
			return getCollectionVariableName_5009Parser();
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableNameEditPart.VISUAL_ID:
			return getObjectVariableName_5012Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
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
