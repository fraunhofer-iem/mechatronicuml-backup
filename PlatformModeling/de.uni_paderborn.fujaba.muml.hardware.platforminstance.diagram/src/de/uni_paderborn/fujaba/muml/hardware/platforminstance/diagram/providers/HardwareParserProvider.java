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
	private IParser getHWPlatformInstanceLabel_5096Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPlatformInstanceLabelExpressionLabelParser5096();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformInstanceLabel_5095Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPlatformInstanceLabelExpressionLabelParser5095();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceInstanceName_5083Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceName_5083Parser() {
		if (structuredResourceInstanceName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			structuredResourceInstanceName_5083Parser = parser;
		}
		return structuredResourceInstanceName_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5084Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5084();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5085Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5085();
	}

	/**
	 * @generated
	 */
	private IParser cacheInstanceName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getCacheInstanceName_5042Parser() {
		if (cacheInstanceName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			cacheInstanceName_5042Parser = parser;
		}
		return cacheInstanceName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5043Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5044Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5044();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5045Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5045();
	}

	/**
	 * @generated
	 */
	private IParser programmableLogicDeviceInstanceName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceName_5046Parser() {
		if (programmableLogicDeviceInstanceName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			programmableLogicDeviceInstanceName_5046Parser = parser;
		}
		return programmableLogicDeviceInstanceName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5047Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5047();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5048Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5048();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5049Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5049();
	}

	/**
	 * @generated
	 */
	private IParser processorInstanceName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceName_5050Parser() {
		if (processorInstanceName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			processorInstanceName_5050Parser = parser;
		}
		return processorInstanceName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5051Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5051();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5052Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5052();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5053Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5053();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5054Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5054();
	}

	/**
	 * @generated
	 */
	private IParser processingMemoryInstanceName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceName_5055Parser() {
		if (processingMemoryInstanceName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			processingMemoryInstanceName_5055Parser = parser;
		}
		return processingMemoryInstanceName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5056Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5056();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5057Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5057();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5058Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5058();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5059Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5059();
	}

	/**
	 * @generated
	 */
	private IParser storageMemoryInstanceName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceName_5060Parser() {
		if (storageMemoryInstanceName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			storageMemoryInstanceName_5060Parser = parser;
		}
		return storageMemoryInstanceName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5061Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5061();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5062Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5062();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5063Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5063();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5064Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5064();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortInstanceLabel_5082Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPortInstanceLabelExpressionLabelParser5082();
	}

	/**
	 * @generated
	 */
	private IParser actuatorInstanceName_5086Parser;

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceName_5086Parser() {
		if (actuatorInstanceName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			actuatorInstanceName_5086Parser = parser;
		}
		return actuatorInstanceName_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5087Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5087();
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5088Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5088();
	}

	/**
	 * @generated
	 */
	private IParser sensorInstanceName_5089Parser;

	/**
	 * @generated
	 */
	private IParser getSensorInstanceName_5089Parser() {
		if (sensorInstanceName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sensorInstanceName_5089Parser = parser;
		}
		return sensorInstanceName_5089Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5090Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5090();
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5091Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5091();
	}

	/**
	 * @generated
	 */
	private IParser getBusInstanceLabel_5092Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusInstanceLabelExpressionLabelParser5092();
	}

	/**
	 * @generated
	 */
	private IParser getBusInstanceLabel_5093Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusInstanceLabelExpressionLabelParser5093();
	}

	/**
	 * @generated
	 */
	private IParser getNetworkBridgeInstanceLabel_5097Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.NetworkBridgeInstanceLabelExpressionLabelParser5097();
	}

	/**
	 * @generated
	 */
	private IParser getDelegationHWPortInstanceLabel_5078Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.DelegationHWPortInstanceLabelExpressionLabelParser5078();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID:
			return getHWPlatformInstanceLabel_5096Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getHWPlatformInstanceLabel_5095Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
			return getDelegationHWPortInstanceLabel_5078Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
			return getStructuredResourceInstanceName_5083Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5084Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5085Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID:
			return getCacheInstanceName_5042Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5045Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceName_5046Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5047Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5048Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5049Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID:
			return getProcessorInstanceName_5050Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5051Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5052Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5053Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5054Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
			return getProcessingMemoryInstanceName_5055Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5056Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5057Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5058Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5059Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID:
			return getStorageMemoryInstanceName_5060Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5061Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5062Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5063Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5064Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getHWPortInstanceLabel_5082Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
			return getActuatorInstanceName_5086Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5087Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5088Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
			return getSensorInstanceName_5089Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5090Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5091Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel26EditPart.VISUAL_ID:
			return getBusInstanceLabel_5092Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID:
			return getBusInstanceLabel_5093Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel28EditPart.VISUAL_ID:
			return getNetworkBridgeInstanceLabel_5097Parser();
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
