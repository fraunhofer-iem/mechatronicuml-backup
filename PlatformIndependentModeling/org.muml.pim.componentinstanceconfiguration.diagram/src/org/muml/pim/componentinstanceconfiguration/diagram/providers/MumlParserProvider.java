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
package org.muml.pim.componentinstanceconfiguration.diagram.providers;

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
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5027;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5028;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5042;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.ContinuousPortInstanceLabelExpressionLabelParser5046;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.CoordinationProtocolInstanceLabelExpressionLabelParser5047;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.CoordinationProtocolInstanceLabelExpressionLabelParser5048;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5041;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5045;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5051;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteMultiPortInstanceLabelExpressionLabelParser5052;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5040;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5044;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5049;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.DiscreteSinglePortInstanceLabelExpressionLabelParser5050;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5039;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.HybridPortInstanceLabelExpressionLabelParser5043;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5026;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5029;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser getHybridPortInstanceLabel_5039Parser() {
		return new HybridPortInstanceLabelExpressionLabelParser5039();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteSinglePortInstanceLabel_5040Parser() {
		return new DiscreteSinglePortInstanceLabelExpressionLabelParser5040();
	}

	/**
	* @generated
	*/
	private IParser getDiscreteSinglePortInstanceLabel_5049Parser() {
		return new DiscreteSinglePortInstanceLabelExpressionLabelParser5049();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteMultiPortInstanceLabel_5041Parser() {
		return new DiscreteMultiPortInstanceLabelExpressionLabelParser5041();
	}

	/**
	* @generated
	*/
	private IParser getDiscreteMultiPortInstanceLabel_5051Parser() {
		return new DiscreteMultiPortInstanceLabelExpressionLabelParser5051();
	}

	/**
	 * @generated
	 */
	private IParser getContinuousPortInstanceLabel_5042Parser() {
		return new ContinuousPortInstanceLabelExpressionLabelParser5042();
	}

	/**
	 * @generated
	 */
	private IParser getAtomicComponentInstanceLabel_5027Parser() {
		return new AtomicComponentInstanceLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredComponentInstanceLabel_5026Parser() {
		return new StructuredComponentInstanceLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	private IParser getCoordinationProtocolInstanceLabel_5048Parser() {
		return new CoordinationProtocolInstanceLabelExpressionLabelParser5048();
	}

	/**
	 * @generated
	 */
	private IParser getHybridPortInstanceLabel_5043Parser() {
		return new HybridPortInstanceLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteSinglePortInstanceLabel_5044Parser() {
		return new DiscreteSinglePortInstanceLabelExpressionLabelParser5044();
	}

	/**
	* @generated
	*/
	private IParser getDiscreteSinglePortInstanceLabel_5050Parser() {
		return new DiscreteSinglePortInstanceLabelExpressionLabelParser5050();
	}

	/**
	 * @generated
	 */
	private IParser getDiscreteMultiPortInstanceLabel_5045Parser() {
		return new DiscreteMultiPortInstanceLabelExpressionLabelParser5045();
	}

	/**
	* @generated
	*/
	private IParser getDiscreteMultiPortInstanceLabel_5052Parser() {
		return new DiscreteMultiPortInstanceLabelExpressionLabelParser5052();
	}

	/**
	 * @generated
	 */
	private IParser getContinuousPortInstanceLabel_5046Parser() {
		return new ContinuousPortInstanceLabelExpressionLabelParser5046();
	}

	/**
	 * @generated
	 */
	private IParser getAtomicComponentInstanceLabel_5028Parser() {
		return new AtomicComponentInstanceLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredComponentInstanceLabel_5029Parser() {
		return new StructuredComponentInstanceLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser getCoordinationProtocolInstanceLabel_5047Parser() {
		return new CoordinationProtocolInstanceLabelExpressionLabelParser5047();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case HybridPortInstanceNameEditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5039Parser();
		case DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5040Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5049Parser();
		case DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5041Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5051Parser();
		case ContinuousPortInstanceNameEditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5042Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5027Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5026Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getCoordinationProtocolInstanceLabel_5048Parser();
		case HybridPortInstanceName2EditPart.VISUAL_ID:
			return getHybridPortInstanceLabel_5043Parser();
		case DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5044Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstanceLabel_5050Parser();
		case DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5045Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstanceLabel_5052Parser();
		case ContinuousPortInstanceName2EditPart.VISUAL_ID:
			return getContinuousPortInstanceLabel_5046Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getAtomicComponentInstanceLabel_5028Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getStructuredComponentInstanceLabel_5029Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getCoordinationProtocolInstanceLabel_5047Parser();
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
