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
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser fujabaRealtimeStatechartName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getFujabaRealtimeStatechartName_5018Parser() {
		if (fujabaRealtimeStatechartName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			fujabaRealtimeStatechartName_5018Parser = parser;
		}
		return fujabaRealtimeStatechartName_5018Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.FujabaRealtimeStatechartLabelExpressionLabelParser5019 fujabaRealtimeStatechartLabel_5019Parser;

	/**
	 * @generated
	 */
	private IParser getFujabaRealtimeStatechartLabel_5019Parser() {
		if (fujabaRealtimeStatechartLabel_5019Parser == null) {
			fujabaRealtimeStatechartLabel_5019Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.FujabaRealtimeStatechartLabelExpressionLabelParser5019();
		}
		return fujabaRealtimeStatechartLabel_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5017Parser() {
		if (stateName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5017Parser = parser;
		}
		return stateName_5017Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5004 entryEventLabel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEntryEventLabel_5004Parser() {
		if (entryEventLabel_5004Parser == null) {
			entryEventLabel_5004Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5004();
		}
		return entryEventLabel_5004Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.DoEventLabelExpressionLabelParser5005 doEventLabel_5005Parser;

	/**
	 * @generated
	 */
	private IParser getDoEventLabel_5005Parser() {
		if (doEventLabel_5005Parser == null) {
			doEventLabel_5005Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.DoEventLabelExpressionLabelParser5005();
		}
		return doEventLabel_5005Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5006 exitEventLabel_5006Parser;

	/**
	 * @generated
	 */
	private IParser getExitEventLabel_5006Parser() {
		if (exitEventLabel_5006Parser == null) {
			exitEventLabel_5006Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5006();
		}
		return exitEventLabel_5006Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5007 clockConstraintLabel_5007Parser;

	/**
	 * @generated
	 */
	private IParser getClockConstraintLabel_5007Parser() {
		if (clockConstraintLabel_5007Parser == null) {
			clockConstraintLabel_5007Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5007();
		}
		return clockConstraintLabel_5007Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5008 synchronizationChannelLabel_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelLabel_5008Parser() {
		if (synchronizationChannelLabel_5008Parser == null) {
			synchronizationChannelLabel_5008Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5008();
		}
		return synchronizationChannelLabel_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser regionName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getRegionName_5010Parser() {
		if (regionName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			regionName_5010Parser = parser;
		}
		return regionName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser regionPriority_5011Parser;

	/**
	 * @generated
	 */
	private IParser getRegionPriority_5011Parser() {
		if (regionPriority_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizable_Priority() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			regionPriority_5011Parser = parser;
		}
		return regionPriority_5011Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.RegionLabelExpressionLabelParser5012 regionLabel_5012Parser;

	/**
	 * @generated
	 */
	private IParser getRegionLabel_5012Parser() {
		if (regionLabel_5012Parser == null) {
			regionLabel_5012Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.RegionLabelExpressionLabelParser5012();
		}
		return regionLabel_5012Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6001 transitionLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6001Parser() {
		if (transitionLabel_6001Parser == null) {
			transitionLabel_6001Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6001();
		}
		return transitionLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6002 transitionLabel_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6002Parser() {
		if (transitionLabel_6002Parser == null) {
			transitionLabel_6002Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6002();
		}
		return transitionLabel_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartNameEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechartName_5018Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechartLabel_5019Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5017Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getEntryEventLabel_5004Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getDoEventLabel_5005Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getExitEventLabel_5006Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getClockConstraintLabel_5007Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5008Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
			return getRegionName_5010Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart.VISUAL_ID:
			return getRegionPriority_5011Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getRegionLabel_5012Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getTransitionLabel_6001Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getTransitionLabel_6002Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes
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
