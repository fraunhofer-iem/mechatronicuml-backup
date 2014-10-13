package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers;

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
	private IParser sensorInstanceName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getSensorInstanceName_5036Parser() {
		if (sensorInstanceName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sensorInstanceName_5036Parser = parser;
		}
		return sensorInstanceName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5037Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5037();
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5038Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5038();
	}

	/**
	 * @generated
	 */
	private IParser actuatorInstanceName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceName_5039Parser() {
		if (actuatorInstanceName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			actuatorInstanceName_5039Parser = parser;
		}
		return actuatorInstanceName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5040Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5040();
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5041Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5041();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceInstanceName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceName_5065Parser() {
		if (structuredResourceInstanceName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			structuredResourceInstanceName_5065Parser = parser;
		}
		return structuredResourceInstanceName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5066Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5066();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5067Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5067();
	}

	/**
	 * @generated
	 */
	private IParser getCommunicationResourceLabel_5068Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CommunicationResourceLabelExpressionLabelParser5068();
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
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			cacheInstanceName_5042Parser = parser;
		}
		return cacheInstanceName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5043Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5044Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5044();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5045Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5045();
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
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			programmableLogicDeviceInstanceName_5046Parser = parser;
		}
		return programmableLogicDeviceInstanceName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5047Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5047();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5048Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5048();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5049Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5049();
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
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			processorInstanceName_5050Parser = parser;
		}
		return processorInstanceName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5051Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5051();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5052Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5052();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5053Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5053();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5054Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5054();
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
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			processingMemoryInstanceName_5055Parser = parser;
		}
		return processingMemoryInstanceName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5056Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5056();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5057Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5057();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5058Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5058();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5059Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5059();
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
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			storageMemoryInstanceName_5060Parser = parser;
		}
		return storageMemoryInstanceName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5061Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5061();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5062Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5062();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5063Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5063();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5064Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5064();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
			return getSensorInstanceName_5036Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getSensorInstanceLabel_5037Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5038Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
			return getActuatorInstanceName_5039Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5040Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5041Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
			return getStructuredResourceInstanceName_5065Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5066Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5067Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getCommunicationResourceLabel_5068Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID:
			return getCacheInstanceName_5042Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5045Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceName_5046Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5047Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5048Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5049Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID:
			return getProcessorInstanceName_5050Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5051Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5052Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5053Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5054Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
			return getProcessingMemoryInstanceName_5055Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5056Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5057Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5058Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5059Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID:
			return getStorageMemoryInstanceName_5060Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5061Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5062Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5063Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5064Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes
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
