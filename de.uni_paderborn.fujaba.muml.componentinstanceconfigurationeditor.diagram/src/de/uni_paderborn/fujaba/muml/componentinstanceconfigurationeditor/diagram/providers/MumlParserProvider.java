package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers;

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
import org.storydriven.modeling.SDMPackage;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5002 componentInstanceLabel_5002Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentInstanceLabel_5002Parser() {
		if (componentInstanceLabel_5002Parser == null) {
			componentInstanceLabel_5002Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5002();
		}
		return componentInstanceLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5003Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5003Parser() {
		if (hybridPortInstanceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5003Parser = parser;
		}
		return hybridPortInstanceName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5004Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5004Parser() {
		if (discreteSinglePortInstanceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5004Parser = parser;
		}
		return discreteSinglePortInstanceName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5005Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5005Parser() {
		if (continuousPortInstanceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5005Parser = parser;
		}
		return continuousPortInstanceName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5006Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5006Parser() {
		if (hybridPortInstanceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5006Parser = parser;
		}
		return hybridPortInstanceName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5007Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5007Parser() {
		if (discreteSinglePortInstanceName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5007Parser = parser;
		}
		return discreteSinglePortInstanceName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5008Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5008Parser() {
		if (continuousPortInstanceName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5008Parser = parser;
		}
		return continuousPortInstanceName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getComponentInstanceLabel_5002Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceName_5003Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5004Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5005Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceName_5006Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5007Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5008Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes
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
