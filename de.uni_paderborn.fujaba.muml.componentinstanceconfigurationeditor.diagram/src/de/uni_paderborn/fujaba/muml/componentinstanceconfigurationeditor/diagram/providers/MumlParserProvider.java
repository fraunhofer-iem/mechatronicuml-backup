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
import org.storydriven.core.CorePackage;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5030Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5030Parser() {
		if (hybridPortInstanceName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5030Parser = parser;
		}
		return hybridPortInstanceName_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5031Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5031Parser() {
		if (discreteSinglePortInstanceName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5031Parser = parser;
		}
		return discreteSinglePortInstanceName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteMultiPortInstanceName_5033Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceName_5033Parser() {
		if (discreteMultiPortInstanceName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteMultiPortInstanceName_5033Parser = parser;
		}
		return discreteMultiPortInstanceName_5033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5034Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5034Parser() {
		if (continuousPortInstanceName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5034Parser = parser;
		}
		return continuousPortInstanceName_5034Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser atomicComponentInstanceLabel_5027Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentInstanceLabel_5027Parser() {
		if (atomicComponentInstanceLabel_5027Parser == null) {
			atomicComponentInstanceLabel_5027Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser();
		}
		return atomicComponentInstanceLabel_5027Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser structuredComponentInstanceLabel_5026Parser;

	/**
	 * @generated
	 */
	protected IParser getStructuredComponentInstanceLabel_5026Parser() {
		if (structuredComponentInstanceLabel_5026Parser == null) {
			structuredComponentInstanceLabel_5026Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser();
		}
		return structuredComponentInstanceLabel_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5032Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5032Parser() {
		if (discreteSinglePortInstanceName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5032Parser = parser;
		}
		return discreteSinglePortInstanceName_5032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortInstanceName_5035Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceName_5035Parser() {
		if (hybridPortInstanceName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortInstanceName_5035Parser = parser;
		}
		return hybridPortInstanceName_5035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteSinglePortInstanceName_5036Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceName_5036Parser() {
		if (discreteSinglePortInstanceName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteSinglePortInstanceName_5036Parser = parser;
		}
		return discreteSinglePortInstanceName_5036Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discreteMultiPortInstanceName_5037Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceName_5037Parser() {
		if (discreteMultiPortInstanceName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			discreteMultiPortInstanceName_5037Parser = parser;
		}
		return discreteMultiPortInstanceName_5037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortInstanceName_5038Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceName_5038Parser() {
		if (continuousPortInstanceName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortInstanceName_5038Parser = parser;
		}
		return continuousPortInstanceName_5038Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser atomicComponentInstanceLabel_5028Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentInstanceLabel_5028Parser() {
		if (atomicComponentInstanceLabel_5028Parser == null) {
			atomicComponentInstanceLabel_5028Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser();
		}
		return atomicComponentInstanceLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser structuredComponentInstanceLabel_5029Parser;

	/**
	 * @generated
	 */
	protected IParser getStructuredComponentInstanceLabel_5029Parser() {
		if (structuredComponentInstanceLabel_5029Parser == null) {
			structuredComponentInstanceLabel_5029Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser();
		}
		return structuredComponentInstanceLabel_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceName_5030Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5031Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceName_5033Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5034Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5026Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5032Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceName_5035Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceName_5036Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceName_5037Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceName_5038Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5029Parser();
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
