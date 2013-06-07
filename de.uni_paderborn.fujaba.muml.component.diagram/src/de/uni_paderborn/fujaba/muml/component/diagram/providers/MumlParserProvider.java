package de.uni_paderborn.fujaba.muml.component.diagram.providers;

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
	private IParser atomicComponentName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicComponentName_5028Parser() {
		if (atomicComponentName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser(
					features);
			atomicComponentName_5028Parser = parser;
		}
		return atomicComponentName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser staticStructuredComponentName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getStaticStructuredComponentName_5021Parser() {
		if (staticStructuredComponentName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser(
					features);
			staticStructuredComponentName_5021Parser = parser;
		}
		return staticStructuredComponentName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser discretePortName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDiscretePortName_5012Parser() {
		if (discretePortName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser(
					features);
			discretePortName_5012Parser = parser;
		}
		return discretePortName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser getDiscretePortLabel_5025Parser() {
		return new de.uni_paderborn.fujaba.muml.component.diagram.parsers.DiscretePortLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser continuousPortName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getContinuousPortName_5013Parser() {
		if (continuousPortName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser(
					features);
			continuousPortName_5013Parser = parser;
		}
		return continuousPortName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser hybridPortName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getHybridPortName_5024Parser() {
		if (hybridPortName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser(
					features);
			hybridPortName_5024Parser = parser;
		}
		return hybridPortName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser getComponentPartLabel_5017Parser() {
		return new de.uni_paderborn.fujaba.muml.component.diagram.parsers.ComponentPartLabelExpressionLabelParser5017();
	}

	/**
	 * @generated
	 */
	private IParser portPartName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getPortPartName_5034Parser() {
		if (portPartName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.component.diagram.parsers.MessageFormatParser(
					features);
			portPartName_5034Parser = parser;
		}
		return portPartName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCoordinationProtocolOccurrenceLabel_5026Parser() {
		return new de.uni_paderborn.fujaba.muml.component.diagram.parsers.CoordinationProtocolOccurrenceLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID:
			return getAtomicComponentName_5028Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID:
			return getStaticStructuredComponentName_5021Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
			return getDiscretePortName_5012Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getDiscretePortLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
			return getContinuousPortName_5013Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID:
			return getHybridPortName_5024Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getComponentPartLabel_5017Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartNameEditPart.VISUAL_ID:
			return getPortPartName_5034Parser();
		case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getCoordinationProtocolOccurrenceLabel_5026Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes
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
