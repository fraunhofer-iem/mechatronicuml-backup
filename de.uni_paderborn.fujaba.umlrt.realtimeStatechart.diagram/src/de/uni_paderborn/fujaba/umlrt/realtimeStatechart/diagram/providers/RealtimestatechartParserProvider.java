package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers;

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
public class RealtimestatechartParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5025Parser() {
		if (stateName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5025Parser = parser;
		}
		return stateName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser clockName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getClockName_5026Parser() {
		if (clockName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			clockName_5026Parser = parser;
		}
		return clockName_5026Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser clockConstraintLabel_5023Parser;

	/**
	 * @generated
	 */
	private IParser getClockConstraintLabel_5023Parser() {
		if (clockConstraintLabel_5023Parser == null) {
			clockConstraintLabel_5023Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser();
		}
		return clockConstraintLabel_5023Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser synchronizationChannelLabel_5024Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelLabel_5024Parser() {
		if (synchronizationChannelLabel_5024Parser == null) {
			synchronizationChannelLabel_5024Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser();
		}
		return synchronizationChannelLabel_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionPriority_6011Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionPriority_6011Parser() {
		if (transitionPriority_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizable_Priority() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionPriority_6011Parser = parser;
		}
		return transitionPriority_6011Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6012Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6012Parser() {
		if (transitionLabel_6012Parser == null) {
			transitionLabel_6012Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6012Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6013Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6013Parser() {
		if (transitionLabel_6013Parser == null) {
			transitionLabel_6013Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6013Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6014Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6014Parser() {
		if (transitionLabel_6014Parser == null) {
			transitionLabel_6014Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6014Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6015Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6015Parser() {
		if (transitionLabel_6015Parser == null) {
			transitionLabel_6015Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6015Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6016Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6016Parser() {
		if (transitionLabel_6016Parser == null) {
			transitionLabel_6016Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6016Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6017Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6017Parser() {
		if (transitionLabel_6017Parser == null) {
			transitionLabel_6017Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6017Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6018Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6018Parser() {
		if (transitionLabel_6018Parser == null) {
			transitionLabel_6018Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6018Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser transitionLabel_6019Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6019Parser() {
		if (transitionLabel_6019Parser == null) {
			transitionLabel_6019Parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
		}
		return transitionLabel_6019Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSafetyTransition_6020Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSafetyTransition_6020Parser() {
		if (transitionSafetyTransition_6020Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_SafetyTransition() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionSafetyTransition_6020Parser = parser;
		}
		return transitionSafetyTransition_6020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5025Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockNameEditPart.VISUAL_ID:
			return getClockName_5026Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintClockConstraintExprEditPart.VISUAL_ID:
			return getClockConstraintLabel_5023Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelSynchroChannelExprEditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5024Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID:
			return getTransitionPriority_6011Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetsExprEditPart.VISUAL_ID:
			return getTransitionLabel_6012Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionAbsoluteDeadlineExprEditPart.VISUAL_ID:
			return getTransitionLabel_6013Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionRelativeDeadlineExprEditPart.VISUAL_ID:
			return getTransitionLabel_6014Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventsExprEditPart.VISUAL_ID:
			return getTransitionLabel_6015Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart.VISUAL_ID:
			return getTransitionLabel_6016Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTransitionActionExprEditPart.VISUAL_ID:
			return getTransitionLabel_6017Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockConstraintExprEditPart.VISUAL_ID:
			return getTransitionLabel_6018Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionExprEditPart.VISUAL_ID:
			return getTransitionLabel_6019Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart.VISUAL_ID:
			return getTransitionSafetyTransition_6020Parser();
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
			return getParser(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.UmlrtElementTypes
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
