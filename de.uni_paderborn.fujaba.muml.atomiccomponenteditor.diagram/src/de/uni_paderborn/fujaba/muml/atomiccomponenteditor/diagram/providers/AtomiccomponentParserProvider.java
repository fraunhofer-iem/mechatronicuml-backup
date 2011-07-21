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
import org.storydriven.modeling.SDMPackage;

/**
 * @generated
 */
public class AtomiccomponentParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser atomicComponentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicComponentName_5002Parser() {
		if (atomicComponentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			atomicComponentName_5002Parser = parser;
		}
		return atomicComponentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser hybridPortName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getHybridPortName_5003Parser() {
		if (hybridPortName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortName_5003Parser = parser;
		}
		return hybridPortName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser discretePortName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getDiscretePortName_5004Parser() {
		if (discretePortName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			discretePortName_5004Parser = parser;
		}
		return discretePortName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser continuousPortName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getContinuousPortName_5005Parser() {
		if (continuousPortName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortName_5005Parser = parser;
		}
		return continuousPortName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwarePortName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getHardwarePortName_5006Parser() {
		if (hardwarePortName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			hardwarePortName_5006Parser = parser;
		}
		return hardwarePortName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID:
			return getAtomicComponentName_5002Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID:
			return getHybridPortName_5003Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
			return getDiscretePortName_5004Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
			return getContinuousPortName_5005Parser();
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HardwarePortNameEditPart.VISUAL_ID:
			return getHardwarePortName_5006Parser();
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
