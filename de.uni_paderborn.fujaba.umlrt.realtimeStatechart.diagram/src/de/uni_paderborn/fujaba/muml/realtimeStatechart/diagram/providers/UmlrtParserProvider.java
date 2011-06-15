package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers;

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
public class UmlrtParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5003Parser() {
		if (stateName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5003Parser = parser;
		}
		return stateName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser clockName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClockName_5004Parser() {
		if (clockName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			clockName_5004Parser = parser;
		}
		return clockName_5004Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser clockConstraintLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClockConstraintLabel_5001Parser() {
		if (clockConstraintLabel_5001Parser == null) {
			clockConstraintLabel_5001Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser();
		}
		return clockConstraintLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser synchronizationChannelLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelLabel_5002Parser() {
		if (synchronizationChannelLabel_5002Parser == null) {
			synchronizationChannelLabel_5002Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser();
		}
		return synchronizationChannelLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionPriority_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionPriority_6001Parser() {
		if (transitionPriority_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizable_Priority() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionPriority_6001Parser = parser;
		}
		return transitionPriority_6001Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6002Parser() {
		if (transitionLabel_6002Parser == null) {
			transitionLabel_6002Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6002Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6003Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6003Parser() {
		if (transitionLabel_6003Parser == null) {
			transitionLabel_6003Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6003Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6004Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6004Parser() {
		if (transitionLabel_6004Parser == null) {
			transitionLabel_6004Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6004Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6005Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6005Parser() {
		if (transitionLabel_6005Parser == null) {
			transitionLabel_6005Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6005Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6006Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6006Parser() {
		if (transitionLabel_6006Parser == null) {
			transitionLabel_6006Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6006Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6007Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6007Parser() {
		if (transitionLabel_6007Parser == null) {
			transitionLabel_6007Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6007Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6008Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6008Parser() {
		if (transitionLabel_6008Parser == null) {
			transitionLabel_6008Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6008Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6009Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6009Parser() {
		if (transitionLabel_6009Parser == null) {
			transitionLabel_6009Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6009Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6010Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6010Parser() {
		if (transitionLabel_6010Parser == null) {
			transitionLabel_6010Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5003Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockNameEditPart.VISUAL_ID:
			return getClockName_5004Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getClockConstraintLabel_5001Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5002Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID:
			return getTransitionPriority_6001Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getTransitionLabel_6002Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getTransitionLabel_6003Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getTransitionLabel_6004Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getTransitionLabel_6005Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getTransitionLabel_6006Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getTransitionLabel_6007Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getTransitionLabel_6008Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getTransitionLabel_6009Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getTransitionLabel_6010Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes
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
