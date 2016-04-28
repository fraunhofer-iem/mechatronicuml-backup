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
package org.muml.pim.realtimestatechart.diagram.providers;

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
import org.muml.mumlcore.CorePackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionPriorityEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.realtimestatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5053;
import org.muml.pim.realtimestatechart.diagram.parsers.DoEventLabelExpressionLabelParser5051;
import org.muml.pim.realtimestatechart.diagram.parsers.EntryEventLabelExpressionLabelParser5050;
import org.muml.pim.realtimestatechart.diagram.parsers.ExitEventLabelExpressionLabelParser5052;
import org.muml.pim.realtimestatechart.diagram.parsers.MessageFormatParser;
import org.muml.pim.realtimestatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5062;
import org.muml.pim.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5063;
import org.muml.pim.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5065;
import org.muml.pim.realtimestatechart.diagram.parsers.SynchronizationChannelLabelExpressionLabelParser5054;
import org.muml.pim.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6005;
import org.muml.pim.realtimestatechart.diagram.parsers.TransitionLabelExpressionLabelParser6006;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;

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
			MessageFormatParser parser = new MessageFormatParser(features);
			realtimeStatechartName_5061Parser = parser;
		}
		return realtimeStatechartName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser getRealtimeStatechartLabel_5062Parser() {
		return new RealtimeStatechartLabelExpressionLabelParser5062();
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
			MessageFormatParser parser = new MessageFormatParser(features);
			stateName_5060Parser = parser;
		}
		return stateName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser getEntryEventLabel_5050Parser() {
		return new EntryEventLabelExpressionLabelParser5050();
	}

	/**
	 * @generated
	 */
	private IParser getDoEventLabel_5051Parser() {
		return new DoEventLabelExpressionLabelParser5051();
	}

	/**
	 * @generated
	 */
	private IParser getExitEventLabel_5052Parser() {
		return new ExitEventLabelExpressionLabelParser5052();
	}

	/**
	 * @generated
	 */
	private IParser getClockConstraintLabel_5053Parser() {
		return new ClockConstraintLabelExpressionLabelParser5053();
	}

	/**
	 * @generated
	 */
	private IParser getSynchronizationChannelLabel_5054Parser() {
		return new SynchronizationChannelLabelExpressionLabelParser5054();
	}

	/**
	 * @generated
	 */
	private IParser getRegionLabel_5063Parser() {
		return new RegionLabelExpressionLabelParser5063();
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
					RealtimestatechartPackage.eINSTANCE.getPrioritizedElement_Priority() };
			MessageFormatParser parser = new MessageFormatParser(features);
			regionPriority_5064Parser = parser;
		}
		return regionPriority_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser getRegionLabel_5065Parser() {
		return new RegionLabelExpressionLabelParser5065();
	}

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6005Parser() {
		return new TransitionLabelExpressionLabelParser6005();
	}

	/**
	 * @generated
	 */
	private IParser getTransitionLabel_6006Parser() {
		return new TransitionLabelExpressionLabelParser6006();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RealtimeStatechartNameEditPart.VISUAL_ID:
			return getRealtimeStatechartName_5061Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getRealtimeStatechartLabel_5062Parser();
		case StateNameEditPart.VISUAL_ID:
			return getStateName_5060Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getEntryEventLabel_5050Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getDoEventLabel_5051Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getExitEventLabel_5052Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getClockConstraintLabel_5053Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getSynchronizationChannelLabel_5054Parser();
		case RegionNameEditPart.VISUAL_ID:
			return getRegionLabel_5063Parser();
		case RegionPriorityEditPart.VISUAL_ID:
			return getRegionPriority_5064Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getRegionLabel_5065Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getTransitionLabel_6005Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
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
			return getParser(MumlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MumlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MumlElementTypes.getElement(hint) == null) {
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
