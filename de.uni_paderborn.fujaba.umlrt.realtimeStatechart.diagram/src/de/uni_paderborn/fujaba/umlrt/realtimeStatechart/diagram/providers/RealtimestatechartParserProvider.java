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
	private IParser entryActionActionExpr_5020Parser;

	/**
	 * @generated
	 */
	private IParser getEntryActionActionExpr_5020Parser() {
		if (entryActionActionExpr_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEntryOrExitAction_ActionExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			entryActionActionExpr_5020Parser = parser;
		}
		return entryActionActionExpr_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser doActionActionExpr_5021Parser;

	/**
	 * @generated
	 */
	private IParser getDoActionActionExpr_5021Parser() {
		if (doActionActionExpr_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getDoAction_ActionExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			doActionActionExpr_5021Parser = parser;
		}
		return doActionActionExpr_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser exitActionActionExpr_5022Parser;

	/**
	 * @generated
	 */
	private IParser getExitActionActionExpr_5022Parser() {
		if (exitActionActionExpr_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEntryOrExitAction_ActionExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			exitActionActionExpr_5022Parser = parser;
		}
		return exitActionActionExpr_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser clockConstraintClockConstraintExpr_5023Parser;

	/**
	 * @generated
	 */
	private IParser getClockConstraintClockConstraintExpr_5023Parser() {
		if (clockConstraintClockConstraintExpr_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_ClockConstraintExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			clockConstraintClockConstraintExpr_5023Parser = parser;
		}
		return clockConstraintClockConstraintExpr_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser synchronizationChannelSynchroChannelExpr_5024Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelSynchroChannelExpr_5024Parser() {
		if (synchronizationChannelSynchroChannelExpr_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getSynchronizationChannel_SynchroChannelExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			synchronizationChannelSynchroChannelExpr_5024Parser = parser;
		}
		return synchronizationChannelSynchroChannelExpr_5024Parser;
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
	private IParser transitionClockResetsExpr_6012Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionClockResetsExpr_6012Parser() {
		if (transitionClockResetsExpr_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockResetsExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionClockResetsExpr_6012Parser = parser;
		}
		return transitionClockResetsExpr_6012Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionAbsoluteDeadlineExpr_6013Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionAbsoluteDeadlineExpr_6013Parser() {
		if (transitionAbsoluteDeadlineExpr_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_AbsoluteDeadlineExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionAbsoluteDeadlineExpr_6013Parser = parser;
		}
		return transitionAbsoluteDeadlineExpr_6013Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionRelativeDeadlineExpr_6014Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionRelativeDeadlineExpr_6014Parser() {
		if (transitionRelativeDeadlineExpr_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_RelativeDeadlineExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionRelativeDeadlineExpr_6014Parser = parser;
		}
		return transitionRelativeDeadlineExpr_6014Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionEventsExpr_6015Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionEventsExpr_6015Parser() {
		if (transitionEventsExpr_6015Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_EventsExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionEventsExpr_6015Parser = parser;
		}
		return transitionEventsExpr_6015Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionGuardExpr_6016Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionGuardExpr_6016Parser() {
		if (transitionGuardExpr_6016Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_GuardExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionGuardExpr_6016Parser = parser;
		}
		return transitionGuardExpr_6016Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTransitionActionExpr_6017Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTransitionActionExpr_6017Parser() {
		if (transitionTransitionActionExpr_6017Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_TransitionActionExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionTransitionActionExpr_6017Parser = parser;
		}
		return transitionTransitionActionExpr_6017Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionClockConstraintExpr_6018Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionClockConstraintExpr_6018Parser() {
		if (transitionClockConstraintExpr_6018Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockConstraintExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionClockConstraintExpr_6018Parser = parser;
		}
		return transitionClockConstraintExpr_6018Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSafetyTransitionExpr_6019Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSafetyTransitionExpr_6019Parser() {
		if (transitionSafetyTransitionExpr_6019Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_SafetyTransitionExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionSafetyTransitionExpr_6019Parser = parser;
		}
		return transitionSafetyTransitionExpr_6019Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionSynchroExpr_6020Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionSynchroExpr_6020Parser() {
		if (transitionSynchroExpr_6020Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_SynchroExpr() };
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			transitionSynchroExpr_6020Parser = parser;
		}
		return transitionSynchroExpr_6020Parser;
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
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryActionActionExprEditPart.VISUAL_ID:
			return getEntryActionActionExpr_5020Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoActionActionExprEditPart.VISUAL_ID:
			return getDoActionActionExpr_5021Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitActionActionExprEditPart.VISUAL_ID:
			return getExitActionActionExpr_5022Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ClockConstraintClockConstraintExprEditPart.VISUAL_ID:
			return getClockConstraintClockConstraintExpr_5023Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.SynchronizationChannelSynchroChannelExprEditPart.VISUAL_ID:
			return getSynchronizationChannelSynchroChannelExpr_5024Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID:
			return getTransitionPriority_6011Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockResetsExprEditPart.VISUAL_ID:
			return getTransitionClockResetsExpr_6012Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionAbsoluteDeadlineExprEditPart.VISUAL_ID:
			return getTransitionAbsoluteDeadlineExpr_6013Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionRelativeDeadlineExprEditPart.VISUAL_ID:
			return getTransitionRelativeDeadlineExpr_6014Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEventsExprEditPart.VISUAL_ID:
			return getTransitionEventsExpr_6015Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionGuardExprEditPart.VISUAL_ID:
			return getTransitionGuardExpr_6016Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionTransitionActionExprEditPart.VISUAL_ID:
			return getTransitionTransitionActionExpr_6017Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionClockConstraintExprEditPart.VISUAL_ID:
			return getTransitionClockConstraintExpr_6018Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSafetyTransitionExprEditPart.VISUAL_ID:
			return getTransitionSafetyTransitionExpr_6019Parser();
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionSynchroExprEditPart.VISUAL_ID:
			return getTransitionSynchroExpr_6020Parser();
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
