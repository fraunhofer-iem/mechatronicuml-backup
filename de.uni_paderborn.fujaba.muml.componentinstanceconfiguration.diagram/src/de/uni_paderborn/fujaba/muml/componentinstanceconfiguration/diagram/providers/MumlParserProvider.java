package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers;

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
	private IParser getHybridPortInstanceLabel_5039Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5039();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteSinglePortInstanceLabel_5040Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5040();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteMultiPortInstanceLabel_5041Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5041();
	}

	/**
	 * @generated
	 */
	private IParser getContinuousPortInstanceLabel_5042Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5042();
	}

	/**
	 * @generated
	 */
	private IParser getAtomicComponentInstanceLabel_5027Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredComponentInstanceLabel_5026Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	private IParser getHybridPortInstanceLabel_5043Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteSinglePortInstanceLabel_5044Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5044();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteMultiPortInstanceLabel_5045Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5045();
	}

	/**
	 * @generated
	 */
	private IParser getContinuousPortInstanceLabel_5046Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5046();
	}

	/**
	 * @generated
	 */
	private IParser getAtomicComponentInstanceLabel_5028Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredComponentInstanceLabel_5029Parser() {
		return new de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5039Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5040Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5041Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5042Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5026Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5045Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5046Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
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
			return getParser(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes
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
