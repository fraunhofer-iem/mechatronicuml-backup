package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
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

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5039 hybridPortInstanceLabel_5039Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceLabel_5039Parser() {
		if (hybridPortInstanceLabel_5039Parser == null) {
			hybridPortInstanceLabel_5039Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5039();
		}
		return hybridPortInstanceLabel_5039Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5040 discreteSinglePortInstanceLabel_5040Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceLabel_5040Parser() {
		if (discreteSinglePortInstanceLabel_5040Parser == null) {
			discreteSinglePortInstanceLabel_5040Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5040();
		}
		return discreteSinglePortInstanceLabel_5040Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5041 discreteMultiPortInstanceLabel_5041Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceLabel_5041Parser() {
		if (discreteMultiPortInstanceLabel_5041Parser == null) {
			discreteMultiPortInstanceLabel_5041Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5041();
		}
		return discreteMultiPortInstanceLabel_5041Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5042 continuousPortInstanceLabel_5042Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceLabel_5042Parser() {
		if (continuousPortInstanceLabel_5042Parser == null) {
			continuousPortInstanceLabel_5042Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5042();
		}
		return continuousPortInstanceLabel_5042Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5027 atomicComponentInstanceLabel_5027Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentInstanceLabel_5027Parser() {
		if (atomicComponentInstanceLabel_5027Parser == null) {
			atomicComponentInstanceLabel_5027Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5027();
		}
		return atomicComponentInstanceLabel_5027Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5026 structuredComponentInstanceLabel_5026Parser;

	/**
	 * @generated
	 */
	protected IParser getStructuredComponentInstanceLabel_5026Parser() {
		if (structuredComponentInstanceLabel_5026Parser == null) {
			structuredComponentInstanceLabel_5026Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5026();
		}
		return structuredComponentInstanceLabel_5026Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5043 hybridPortInstanceLabel_5043Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortInstanceLabel_5043Parser() {
		if (hybridPortInstanceLabel_5043Parser == null) {
			hybridPortInstanceLabel_5043Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5043();
		}
		return hybridPortInstanceLabel_5043Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5044 discreteSinglePortInstanceLabel_5044Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteSinglePortInstanceLabel_5044Parser() {
		if (discreteSinglePortInstanceLabel_5044Parser == null) {
			discreteSinglePortInstanceLabel_5044Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5044();
		}
		return discreteSinglePortInstanceLabel_5044Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5045 discreteMultiPortInstanceLabel_5045Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscreteMultiPortInstanceLabel_5045Parser() {
		if (discreteMultiPortInstanceLabel_5045Parser == null) {
			discreteMultiPortInstanceLabel_5045Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5045();
		}
		return discreteMultiPortInstanceLabel_5045Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5046 continuousPortInstanceLabel_5046Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortInstanceLabel_5046Parser() {
		if (continuousPortInstanceLabel_5046Parser == null) {
			continuousPortInstanceLabel_5046Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5046();
		}
		return continuousPortInstanceLabel_5046Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5028 atomicComponentInstanceLabel_5028Parser;

	/**
	 * @generated
	 */
	protected IParser getAtomicComponentInstanceLabel_5028Parser() {
		if (atomicComponentInstanceLabel_5028Parser == null) {
			atomicComponentInstanceLabel_5028Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5028();
		}
		return atomicComponentInstanceLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5029 structuredComponentInstanceLabel_5029Parser;

	/**
	 * @generated
	 */
	protected IParser getStructuredComponentInstanceLabel_5029Parser() {
		if (structuredComponentInstanceLabel_5029Parser == null) {
			structuredComponentInstanceLabel_5029Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5029();
		}
		return structuredComponentInstanceLabel_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5039Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5040Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5041Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5042Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5026Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5045Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5046Parser();
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
