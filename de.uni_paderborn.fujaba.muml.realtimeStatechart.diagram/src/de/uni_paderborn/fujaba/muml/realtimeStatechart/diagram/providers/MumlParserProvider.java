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
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5008 entryEventLabel_5008Parser;

	/**
	 * @generated
	 */
	private IParser getEntryEventLabel_5008Parser() {
		if (entryEventLabel_5008Parser == null) {
			entryEventLabel_5008Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5008();
		}
		return entryEventLabel_5008Parser;
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
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5009 exitEventLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getExitEventLabel_5009Parser() {
		if (exitEventLabel_5009Parser == null) {
			exitEventLabel_5009Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5009();
		}
		return exitEventLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5001 clockConstraintLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClockConstraintLabel_5001Parser() {
		if (clockConstraintLabel_5001Parser == null) {
			clockConstraintLabel_5001Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5001();
		}
		return clockConstraintLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5002 synchronizationChannelLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelLabel_5002Parser() {
		if (synchronizationChannelLabel_5002Parser == null) {
			synchronizationChannelLabel_5002Parser = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5002();
		}
		return synchronizationChannelLabel_5002Parser;
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
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID:
			return getStateName_5003Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockNameEditPart.VISUAL_ID:
			return getClockName_5004Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getEntryEventLabel_5008Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getDoEventLabel_5005Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getExitEventLabel_5009Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getClockConstraintLabel_5001Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5002Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getTransitionLabel_6001Parser();
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
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
