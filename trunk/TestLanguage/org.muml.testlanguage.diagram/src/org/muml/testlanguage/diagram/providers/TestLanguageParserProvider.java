package org.muml.testlanguage.diagram.providers;

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
import org.muml.testlanguage.TestLanguagePackage;
import org.muml.testlanguage.diagram.edit.parts.InputNameEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputNameEditPart;
import org.muml.testlanguage.diagram.parsers.MessageFormatParser;
import org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry;

/**
 * @generated
 */
public class TestLanguageParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser nodeLabel_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNodeLabel_5003Parser() {
		if (nodeLabel_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TestLanguagePackage.eINSTANCE.getNode_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { TestLanguagePackage.eINSTANCE.getNode_Label() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			nodeLabel_5003Parser = parser;
		}
		return nodeLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5001Parser() {
		if (inputName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TestLanguagePackage.eINSTANCE.getPort_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TestLanguagePackage.eINSTANCE.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			inputName_5001Parser = parser;
		}
		return inputName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5002Parser() {
		if (outputName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TestLanguagePackage.eINSTANCE.getPort_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TestLanguagePackage.eINSTANCE.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			outputName_5002Parser = parser;
		}
		return outputName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case NodeLabelEditPart.VISUAL_ID:
			return getNodeLabel_5003Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5001Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5002Parser();
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
			return getParser(TestLanguageVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TestLanguageVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TestLanguageElementTypes.getElement(hint) == null) {
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
