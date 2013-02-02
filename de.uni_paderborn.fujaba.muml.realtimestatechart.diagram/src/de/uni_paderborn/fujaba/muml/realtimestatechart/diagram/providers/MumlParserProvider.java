package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers;

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
	protected IParser realtimeStatechartName_5061Parser;

	/**
	 * @generated
	 */
	protected IParser getRealtimeStatechartName_5061Parser() {
		if (realtimeStatechartName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			realtimeStatechartName_5061Parser = parser;
		}
		return realtimeStatechartName_5061Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5062 realtimeStatechartLabel_5062Parser;

	/**
	 * @generated
	 */
	protected IParser getRealtimeStatechartLabel_5062Parser() {
		if (realtimeStatechartLabel_5062Parser == null) {
			realtimeStatechartLabel_5062Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5062();
		}
		return realtimeStatechartLabel_5062Parser;
	}

	/**
	 * @generated
	 */
	protected IParser stateName_5060Parser;

	/**
	 * @generated
	 */
	protected IParser getStateName_5060Parser() {
		if (stateName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5060Parser = parser;
		}
		return stateName_5060Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5050 entryEventLabel_5050Parser;

	/**
	 * @generated
	 */
	protected IParser getEntryEventLabel_5050Parser() {
		if (entryEventLabel_5050Parser == null) {
			entryEventLabel_5050Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5050();
		}
		return entryEventLabel_5050Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.DoEventLabelExpressionLabelParser5051 doEventLabel_5051Parser;

	/**
	 * @generated
	 */
	protected IParser getDoEventLabel_5051Parser() {
		if (doEventLabel_5051Parser == null) {
			doEventLabel_5051Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.DoEventLabelExpressionLabelParser5051();
		}
		return doEventLabel_5051Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5052 exitEventLabel_5052Parser;

	/**
	 * @generated
	 */
	protected IParser getExitEventLabel_5052Parser() {
		if (exitEventLabel_5052Parser == null) {
			exitEventLabel_5052Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5052();
		}
		return exitEventLabel_5052Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5053 clockConstraintLabel_5053Parser;

	/**
	 * @generated
	 */
	protected IParser getClockConstraintLabel_5053Parser() {
		if (clockConstraintLabel_5053Parser == null) {
			clockConstraintLabel_5053Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5053();
		}
		return clockConstraintLabel_5053Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5054 synchronizationChannelLabel_5054Parser;

	/**
	 * @generated
	 */
	protected IParser getSynchronizationChannelLabel_5054Parser() {
		if (synchronizationChannelLabel_5054Parser == null) {
			synchronizationChannelLabel_5054Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5054();
		}
		return synchronizationChannelLabel_5054Parser;
	}

	/**
	 * @generated
	 */
	protected IParser regionName_5055Parser;

	/**
	 * @generated
	 */
	protected IParser getRegionName_5055Parser() {
		if (regionName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			regionName_5055Parser = parser;
		}
		return regionName_5055Parser;
	}

	/**
	 * @generated
	 */
	protected IParser regionPriority_5056Parser;

	/**
	 * @generated
	 */
	protected IParser getRegionPriority_5056Parser() {
		if (regionPriority_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizedElement_Priority() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			regionPriority_5056Parser = parser;
		}
		return regionPriority_5056Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5057 regionLabel_5057Parser;

	/**
	 * @generated
	 */
	protected IParser getRegionLabel_5057Parser() {
		if (regionLabel_5057Parser == null) {
			regionLabel_5057Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5057();
		}
		return regionLabel_5057Parser;
	}

	/**
	 * @generated
	 */
	protected IParser entryPointName_5058Parser;

	/**
	 * @generated
	 */
	protected IParser getEntryPointName_5058Parser() {
		if (entryPointName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			entryPointName_5058Parser = parser;
		}
		return entryPointName_5058Parser;
	}

	/**
	 * @generated
	 */
	protected IParser exitPointName_5059Parser;

	/**
	 * @generated
	 */
	protected IParser getExitPointName_5059Parser() {
		if (exitPointName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			exitPointName_5059Parser = parser;
		}
		return exitPointName_5059Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6005 transitionLabel_6005Parser;

	/**
	 * @generated
	 */
	protected IParser getTransitionLabel_6005Parser() {
		if (transitionLabel_6005Parser == null) {
			transitionLabel_6005Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6005();
		}
		return transitionLabel_6005Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6006 transitionLabel_6006Parser;

	/**
	 * @generated
	 */
	protected IParser getTransitionLabel_6006Parser() {
		if (transitionLabel_6006Parser == null) {
			transitionLabel_6006Parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6006();
		}
		return transitionLabel_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart.VISUAL_ID:
			return getRealtimeStatechartName_5061Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getRealtimeStatechartLabel_5062Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5060Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getEntryEventLabel_5050Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getDoEventLabel_5051Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getExitEventLabel_5052Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getClockConstraintLabel_5053Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5054Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
			return getRegionName_5055Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart.VISUAL_ID:
			return getRegionPriority_5056Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getRegionLabel_5057Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointNameEditPart.VISUAL_ID:
			return getEntryPointName_5058Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointNameEditPart.VISUAL_ID:
			return getExitPointName_5059Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getTransitionLabel_6005Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getTransitionLabel_6006Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes
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
