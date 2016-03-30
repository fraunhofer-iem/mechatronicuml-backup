package org.muml.pm.hardware.resourceinstance.diagram.providers;

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
import org.muml.core.CorePackage;

/**
 * @generated
 */
public class HardwareParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser sensorInstanceName_5072Parser;

	/**
	 * @generated
	 */
	private IParser getSensorInstanceName_5072Parser() {
		if (sensorInstanceName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sensorInstanceName_5072Parser = parser;
		}
		return sensorInstanceName_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5073Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5073();
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5074Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5074();
	}

	/**
	 * @generated
	 */
	private IParser actuatorInstanceName_5075Parser;

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceName_5075Parser() {
		if (actuatorInstanceName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			actuatorInstanceName_5075Parser = parser;
		}
		return actuatorInstanceName_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5076Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5076();
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5077Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5077();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceInstanceName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceName_5101Parser() {
		if (structuredResourceInstanceName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			structuredResourceInstanceName_5101Parser = parser;
		}
		return structuredResourceInstanceName_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5102Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5102();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5103Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5103();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortLabel_5071Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.HWPortLabelExpressionLabelParser5071();
	}

	/**
	 * @generated
	 */
	private IParser cacheInstanceName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getCacheInstanceName_5078Parser() {
		if (cacheInstanceName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			cacheInstanceName_5078Parser = parser;
		}
		return cacheInstanceName_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5079Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5079();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5080Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5080();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5081Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5081();
	}

	/**
	 * @generated
	 */
	private IParser programmableLogicDeviceInstanceName_5082Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceName_5082Parser() {
		if (programmableLogicDeviceInstanceName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			programmableLogicDeviceInstanceName_5082Parser = parser;
		}
		return programmableLogicDeviceInstanceName_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5083Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5083();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5084Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5084();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5085Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5085();
	}

	/**
	 * @generated
	 */
	private IParser processorInstanceName_5086Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceName_5086Parser() {
		if (processorInstanceName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			processorInstanceName_5086Parser = parser;
		}
		return processorInstanceName_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5087Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5087();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5088Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5088();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5089Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5089();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5090Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5090();
	}

	/**
	 * @generated
	 */
	private IParser processingMemoryInstanceName_5091Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceName_5091Parser() {
		if (processingMemoryInstanceName_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			processingMemoryInstanceName_5091Parser = parser;
		}
		return processingMemoryInstanceName_5091Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5092Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5092();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5093Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5093();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5094Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5094();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5095Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5095();
	}

	/**
	 * @generated
	 */
	private IParser storageMemoryInstanceName_5096Parser;

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceName_5096Parser() {
		if (storageMemoryInstanceName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new org.muml.pm.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			storageMemoryInstanceName_5096Parser = parser;
		}
		return storageMemoryInstanceName_5096Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5097Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5097();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5098Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5098();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5099Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5099();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5100Parser() {
		return new org.muml.pm.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5100();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
			return getSensorInstanceName_5072Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getSensorInstanceLabel_5073Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5074Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
			return getActuatorInstanceName_5075Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5076Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5077Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
			return getStructuredResourceInstanceName_5101Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5102Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5103Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getHWPortLabel_5071Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID:
			return getCacheInstanceName_5078Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5079Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5080Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5081Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceName_5082Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5083Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5084Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5085Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID:
			return getProcessorInstanceName_5086Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5087Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5088Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5089Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5090Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
			return getProcessingMemoryInstanceName_5091Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5092Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5093Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5094Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5095Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID:
			return getStorageMemoryInstanceName_5096Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5097Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5098Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5099Parser();
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5100Parser();
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
					org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
							.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(
					org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
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
			if (org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes
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
