package de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.providers;

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
	protected IParser atomicComponentName_5011Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentName_5011Parser() {
		if (atomicComponentName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser(
					features);
			atomicComponentName_5011Parser = parser;
		}
		return atomicComponentName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortName_5006Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortName_5006Parser() {
		if (hybridPortName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser(
					features);
			hybridPortName_5006Parser = parser;
		}
		return hybridPortName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discretePortName_5007Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortName_5007Parser() {
		if (discretePortName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser(
					features);
			discretePortName_5007Parser = parser;
		}
		return discretePortName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.DiscretePortLabelExpressionLabelParser5013 discretePortLabel_5013Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortLabel_5013Parser() {
		if (discretePortLabel_5013Parser == null) {
			discretePortLabel_5013Parser = new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.DiscretePortLabelExpressionLabelParser5013();
		}
		return discretePortLabel_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortName_5008Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortName_5008Parser() {
		if (continuousPortName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.parsers.MessageFormatParser(
					features);
			continuousPortName_5008Parser = parser;
		}
		return continuousPortName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID:
			return getAtomicComponentName_5011Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID:
			return getHybridPortName_5006Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
			return getDiscretePortName_5007Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getDiscretePortLabel_5013Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
			return getContinuousPortName_5008Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.atomiccomponent.diagram.providers.MumlElementTypes
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
