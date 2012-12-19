package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers;

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
	protected IParser atomicComponentName_5015Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentName_5015Parser() {
		if (atomicComponentName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			atomicComponentName_5015Parser = parser;
		}
		return atomicComponentName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortName_5012Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortName_5012Parser() {
		if (hybridPortName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortName_5012Parser = parser;
		}
		return hybridPortName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discretePortName_5013Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortName_5013Parser() {
		if (discretePortName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			discretePortName_5013Parser = parser;
		}
		return discretePortName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortName_5014Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortName_5014Parser() {
		if (continuousPortName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortName_5014Parser = parser;
		}
		return continuousPortName_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID:
			return getAtomicComponentName_5015Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID:
			return getHybridPortName_5012Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
			return getDiscretePortName_5013Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
			return getContinuousPortName_5014Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes
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
