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
	private IParser sensorInstanceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSensorInstanceName_5001Parser() {
		if (sensorInstanceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sensorInstanceName_5001Parser = parser;
		}
		return sensorInstanceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5023Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5023();
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5024Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser actuatorInstanceName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceName_5002Parser() {
		if (actuatorInstanceName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			actuatorInstanceName_5002Parser = parser;
		}
		return actuatorInstanceName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5025Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5034Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5034();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceInstanceName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceName_5008Parser() {
		if (structuredResourceInstanceName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			structuredResourceInstanceName_5008Parser = parser;
		}
		return structuredResourceInstanceName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5009Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5009();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5010Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5010();
	}

	/**
	 * @generated
	 */
	private IParser getBusPortInstanceLabel_5021Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.BusPortInstanceLabelExpressionLabelParser5021();
	}

	/**
	 * @generated
	 */
	private IParser getLinkPortInstanceLabel_5022Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.LinkPortInstanceLabelExpressionLabelParser5022();
	}

	/**
	 * @generated
	 */
	private IParser cacheInstanceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCacheInstanceName_5003Parser() {
		if (cacheInstanceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			cacheInstanceName_5003Parser = parser;
		}
		return cacheInstanceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5011Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5011();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5012Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5012();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5026Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	private IParser programmableLogicDeviceInstanceName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceName_5004Parser() {
		if (programmableLogicDeviceInstanceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			programmableLogicDeviceInstanceName_5004Parser = parser;
		}
		return programmableLogicDeviceInstanceName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5013Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5013();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5014Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5014();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5027Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser processorInstanceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceName_5005Parser() {
		if (processorInstanceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			processorInstanceName_5005Parser = parser;
		}
		return processorInstanceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5015Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5015();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5016Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5016();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5028Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5029Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser storageMemoryInstanceName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceName_5006Parser() {
		if (storageMemoryInstanceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			storageMemoryInstanceName_5006Parser = parser;
		}
		return storageMemoryInstanceName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5017Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5017();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5018Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5018();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5030Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5030();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5031Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5031();
	}

	/**
	 * @generated
	 */
	private IParser processingMemoryInstanceName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceName_5007Parser() {
		if (processingMemoryInstanceName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.MessageFormatParser(
					features);
			processingMemoryInstanceName_5007Parser = parser;
		}
		return processingMemoryInstanceName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5019Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5019();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5020Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5020();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5032Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5032();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5033Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5033();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
			return getSensorInstanceName_5001Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5023Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5024Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
			return getActuatorInstanceName_5002Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5034Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
			return getStructuredResourceInstanceName_5008Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5009Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5010Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getBusPortInstanceLabel_5021Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
			return getLinkPortInstanceLabel_5022Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID:
			return getCacheInstanceName_5003Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5011Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5012Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5026Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceName_5004Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5013Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5014Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID:
			return getProcessorInstanceName_5005Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5015Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5016Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5029Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID:
			return getStorageMemoryInstanceName_5006Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5017Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5018Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5030Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5031Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
			return getProcessingMemoryInstanceName_5007Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5019Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5020Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5032Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5033Parser();
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
