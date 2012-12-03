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
import org.storydriven.core.CorePackage;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected IParser realtimeStatechartName_5045Parser;

	/**
	 * @generated
	 */
	protected IParser getRealtimeStatechartName_5045Parser() {
		if (realtimeStatechartName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			realtimeStatechartName_5045Parser = parser;
		}
		return realtimeStatechartName_5045Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5046 realtimeStatechartLabel_5046Parser;

	/**
	 * @generated
	 */
	protected IParser getRealtimeStatechartLabel_5046Parser() {
		if (realtimeStatechartLabel_5046Parser == null) {
			realtimeStatechartLabel_5046Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5046();
		}
		return realtimeStatechartLabel_5046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser stateName_5049Parser;

	/**
	 * @generated
	 */
	protected IParser getStateName_5049Parser() {
		if (stateName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5049Parser = parser;
		}
		return stateName_5049Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5030 entryEventLabel_5030Parser;

	/**
	 * @generated
	 */
	protected IParser getEntryEventLabel_5030Parser() {
		if (entryEventLabel_5030Parser == null) {
			entryEventLabel_5030Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5030();
		}
		return entryEventLabel_5030Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.DoEventLabelExpressionLabelParser5031 doEventLabel_5031Parser;

	/**
	 * @generated
	 */
	protected IParser getDoEventLabel_5031Parser() {
		if (doEventLabel_5031Parser == null) {
			doEventLabel_5031Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.DoEventLabelExpressionLabelParser5031();
		}
		return doEventLabel_5031Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5032 exitEventLabel_5032Parser;

	/**
	 * @generated
	 */
	protected IParser getExitEventLabel_5032Parser() {
		if (exitEventLabel_5032Parser == null) {
			exitEventLabel_5032Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5032();
		}
		return exitEventLabel_5032Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5033 clockConstraintLabel_5033Parser;

	/**
	 * @generated
	 */
	protected IParser getClockConstraintLabel_5033Parser() {
		if (clockConstraintLabel_5033Parser == null) {
			clockConstraintLabel_5033Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5033();
		}
		return clockConstraintLabel_5033Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5034 synchronizationChannelLabel_5034Parser;

	/**
	 * @generated
	 */
	protected IParser getSynchronizationChannelLabel_5034Parser() {
		if (synchronizationChannelLabel_5034Parser == null) {
			synchronizationChannelLabel_5034Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5034();
		}
		return synchronizationChannelLabel_5034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser regionName_5039Parser;

	/**
	 * @generated
	 */
	protected IParser getRegionName_5039Parser() {
		if (regionName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			regionName_5039Parser = parser;
		}
		return regionName_5039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser regionPriority_5040Parser;

	/**
	 * @generated
	 */
	protected IParser getRegionPriority_5040Parser() {
		if (regionPriority_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizable_Priority() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			regionPriority_5040Parser = parser;
		}
		return regionPriority_5040Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.RegionLabelExpressionLabelParser5041 regionLabel_5041Parser;

	/**
	 * @generated
	 */
	protected IParser getRegionLabel_5041Parser() {
		if (regionLabel_5041Parser == null) {
			regionLabel_5041Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.RegionLabelExpressionLabelParser5041();
		}
		return regionLabel_5041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser entryPointName_5047Parser;

	/**
	 * @generated
	 */
	protected IParser getEntryPointName_5047Parser() {
		if (entryPointName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			entryPointName_5047Parser = parser;
		}
		return entryPointName_5047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser exitPointName_5048Parser;

	/**
	 * @generated
	 */
	protected IParser getExitPointName_5048Parser() {
		if (exitPointName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.MessageFormatParser(
					features);
			exitPointName_5048Parser = parser;
		}
		return exitPointName_5048Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6003 transitionLabel_6003Parser;

	/**
	 * @generated
	 */
	protected IParser getTransitionLabel_6003Parser() {
		if (transitionLabel_6003Parser == null) {
			transitionLabel_6003Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6003();
		}
		return transitionLabel_6003Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6004 transitionLabel_6004Parser;

	/**
	 * @generated
	 */
	protected IParser getTransitionLabel_6004Parser() {
		if (transitionLabel_6004Parser == null) {
			transitionLabel_6004Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.TransitionLabelExpressionLabelParser6004();
		}
		return transitionLabel_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartNameEditPart.VISUAL_ID:
			return getRealtimeStatechartName_5045Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getRealtimeStatechartLabel_5046Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5049Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getEntryEventLabel_5030Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getDoEventLabel_5031Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getExitEventLabel_5032Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getClockConstraintLabel_5033Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5034Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID:
			return getRegionName_5039Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionPriorityEditPart.VISUAL_ID:
			return getRegionPriority_5040Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getRegionLabel_5041Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointNameEditPart.VISUAL_ID:
			return getEntryPointName_5047Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointNameEditPart.VISUAL_ID:
			return getExitPointName_5048Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getTransitionLabel_6003Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getTransitionLabel_6004Parser();
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
