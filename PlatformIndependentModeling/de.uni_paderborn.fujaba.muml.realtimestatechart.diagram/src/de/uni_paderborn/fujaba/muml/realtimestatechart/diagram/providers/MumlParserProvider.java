/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
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
public class MumlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser realtimeStatechartName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getRealtimeStatechartName_5061Parser() {
		if (realtimeStatechartName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			realtimeStatechartName_5061Parser = parser;
		}
		return realtimeStatechartName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser getRealtimeStatechartLabel_5062Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser stateName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5060Parser() {
		if (stateName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			stateName_5060Parser = parser;
		}
		return stateName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser getEntryEventLabel_5050Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.EntryEventLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getDoEventLabel_5051Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.DoEventLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getExitEventLabel_5052Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ExitEventLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getClockConstraintLabel_5053Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelLabel_5054Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getRegionLabel_5063Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser regionPriority_5064Parser;

	/**
	 * @generated
	 */
	private IParser getRegionPriority_5064Parser() {
		if (regionPriority_5064Parser == null) {
			EAttribute[] features = new EAttribute[] {
					de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
							.getPrioritizedElement_Priority() };
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.MessageFormatParser(
					features);
			regionPriority_5064Parser = parser;
		}
		return regionPriority_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser getRegionLabel_5065Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6005Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6006Parser() {
		return new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser();
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
			return getRegionLabel_5063Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart.VISUAL_ID:
			return getRegionPriority_5064Parser();
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getRegionLabel_5065Parser();
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
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(vid));
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
