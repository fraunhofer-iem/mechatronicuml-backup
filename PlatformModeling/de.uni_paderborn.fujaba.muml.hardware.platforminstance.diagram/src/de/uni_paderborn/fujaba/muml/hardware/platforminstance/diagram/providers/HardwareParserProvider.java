package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers;

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
public class HardwareParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser getHWPlatformInstanceLabel_5117Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPlatformInstanceLabelExpressionLabelParser5117();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformInstanceLabel_5101Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPlatformInstanceLabelExpressionLabelParser5101();
	}

	/**
	 * @generated
	 */
	private IParser getDelegationHWPortInstanceLabel_5100Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.DelegationHWPortInstanceLabelExpressionLabelParser5100();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceInstanceName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceName_5103Parser() {
		if (structuredResourceInstanceName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			structuredResourceInstanceName_5103Parser = parser;
		}
		return structuredResourceInstanceName_5103Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5104Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5104();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5105Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5105();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5106Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5106();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5107Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5107();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortInstanceLabel_5102Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPortInstanceLabelExpressionLabelParser5102();
	}

	/**
	 * @generated
	 */
	private IParser actuatorInstanceName_5108Parser;

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceName_5108Parser() {
		if (actuatorInstanceName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			actuatorInstanceName_5108Parser = parser;
		}
		return actuatorInstanceName_5108Parser;
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5109Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5109();
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5110Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5110();
	}

	/**
	 * @generated
	 */
	private IParser sensorInstanceName_5111Parser;

	/**
	 * @generated
	 */
	private IParser getSensorInstanceName_5111Parser() {
		if (sensorInstanceName_5111Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sensorInstanceName_5111Parser = parser;
		}
		return sensorInstanceName_5111Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5112Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5112();
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5113Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5113();
	}

	/**
	 * @generated
	 */
	private IParser getBusInstanceLabel_5114Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusInstanceLabelExpressionLabelParser5114();
	}

	/**
	 * @generated
	 */
	private IParser getBusInstanceLabel_5115Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusInstanceLabelExpressionLabelParser5115();
	}

	/**
	 * @generated
	 */
	private IParser getNetworkBridgeInstanceLabel_5116Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.NetworkBridgeInstanceLabelExpressionLabelParser5116();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getHWPlatformInstanceLabel_5117Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getHWPlatformInstanceLabel_5101Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getDelegationHWPortInstanceLabel_5100Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
			return getStructuredResourceInstanceName_5103Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5104Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5105Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5106Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5107Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
			return getHWPortInstanceLabel_5102Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
			return getActuatorInstanceName_5108Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5109Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5110Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
			return getSensorInstanceName_5111Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5112Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5113Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getBusInstanceLabel_5114Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getBusInstanceLabel_5115Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getNetworkBridgeInstanceLabel_5116Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes
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
