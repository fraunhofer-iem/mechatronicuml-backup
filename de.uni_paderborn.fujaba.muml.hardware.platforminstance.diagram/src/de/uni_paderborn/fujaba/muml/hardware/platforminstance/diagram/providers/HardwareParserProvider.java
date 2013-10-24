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
	private IParser getHWPlatformInstanceLabel_5034Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPlatformInstanceLabelExpressionLabelParser5034();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceInstanceName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceName_5026Parser() {
		if (structuredResourceInstanceName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			structuredResourceInstanceName_5026Parser = parser;
		}
		return structuredResourceInstanceName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5027Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceInstanceLabel_5028Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StructuredResourceInstanceLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser cacheInstanceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCacheInstanceName_5001Parser() {
		if (cacheInstanceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			cacheInstanceName_5001Parser = parser;
		}
		return cacheInstanceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5002Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5002();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5003Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5003();
	}

	/**
	 * @generated
	 */
	private IParser getCacheInstanceLabel_5004Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5004();
	}

	/**
	 * @generated
	 */
	private IParser programmableLogicDeviceInstanceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceName_5005Parser() {
		if (programmableLogicDeviceInstanceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			programmableLogicDeviceInstanceName_5005Parser = parser;
		}
		return programmableLogicDeviceInstanceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5006Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5006();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5007Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5007();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceInstanceLabel_5008Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5008();
	}

	/**
	 * @generated
	 */
	private IParser processorInstanceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceName_5009Parser() {
		if (processorInstanceName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			processorInstanceName_5009Parser = parser;
		}
		return processorInstanceName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5010Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5010();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5011Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5011();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5012Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5012();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorInstanceLabel_5013Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessorInstanceLabelExpressionLabelParser5013();
	}

	/**
	 * @generated
	 */
	private IParser storageMemoryInstanceName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceName_5014Parser() {
		if (storageMemoryInstanceName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			storageMemoryInstanceName_5014Parser = parser;
		}
		return storageMemoryInstanceName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5015Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5015();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5016Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5016();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5017Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5017();
	}

	/**
	 * @generated
	 */
	private IParser getStorageMemoryInstanceLabel_5018Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5018();
	}

	/**
	 * @generated
	 */
	private IParser processingMemoryInstanceName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceName_5019Parser() {
		if (processingMemoryInstanceName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features);
			processingMemoryInstanceName_5019Parser = parser;
		}
		return processingMemoryInstanceName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5020Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5020();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5021Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5021();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5022Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5022();
	}

	/**
	 * @generated
	 */
	private IParser getProcessingMemoryInstanceLabel_5023Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ProcessingMemoryInstanceLabelExpressionLabelParser5023();
	}

	/**
	 * @generated
	 */
	private IParser getBusPortInstanceLabel_5024Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusPortInstanceLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser getLinkPortInstanceLabel_5025Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.LinkPortInstanceLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5029Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5030Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusLabelExpressionLabelParser5030();
	}

	/**
	 * @generated
	 */
	private IParser getBridgeLabel_5031Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BridgeLabelExpressionLabelParser5031();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformInstanceLabel_5033Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.HWPlatformInstanceLabelExpressionLabelParser5033();
	}

	/**
	 * @generated
	 */
	private IParser getBusPortInstanceLabel_5032Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.BusPortInstanceLabelExpressionLabelParser5032();
	}

	/**
	 * @generated
	 */
	private IParser actuatorInstanceName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceName_5035Parser() {
		if (actuatorInstanceName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			actuatorInstanceName_5035Parser = parser;
		}
		return actuatorInstanceName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5036Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5036();
	}

	/**
	 * @generated
	 */
	private IParser getActuatorInstanceLabel_5037Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.ActuatorInstanceLabelExpressionLabelParser5037();
	}

	/**
	 * @generated
	 */
	private IParser sensorInstanceName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getSensorInstanceName_5038Parser() {
		if (sensorInstanceName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sensorInstanceName_5038Parser = parser;
		}
		return sensorInstanceName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5039Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5039();
	}

	/**
	 * @generated
	 */
	private IParser getSensorInstanceLabel_5040Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.SensorInstanceLabelExpressionLabelParser5040();
	}

	/**
	 * @generated
	 */
	private IParser getLinkLabel_6001Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.LinkLabelExpressionLabelParser6001();
	}

	/**
	 * @generated
	 */
	private IParser getLinkLabel_6002Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.parsers.LinkLabelExpressionLabelParser6002();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart.VISUAL_ID:
			return getHWPlatformInstanceLabel_5034Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
			return getStructuredResourceInstanceName_5026Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getStructuredResourceInstanceLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID:
			return getCacheInstanceName_5001Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5002Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5003Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getCacheInstanceLabel_5004Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceName_5005Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5006Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5007Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstanceLabel_5008Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID:
			return getProcessorInstanceName_5009Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5010Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5011Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5012Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getProcessorInstanceLabel_5013Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID:
			return getStorageMemoryInstanceName_5014Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5015Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5016Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5017Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getStorageMemoryInstanceLabel_5018Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
			return getProcessingMemoryInstanceName_5019Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5020Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5021Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5022Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getProcessingMemoryInstanceLabel_5023Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getBusPortInstanceLabel_5024Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
			return getLinkPortInstanceLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getBusLabel_5029Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getBusLabel_5030Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
			return getBridgeLabel_5031Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart.VISUAL_ID:
			return getHWPlatformInstanceLabel_5033Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabel3EditPart.VISUAL_ID:
			return getBusPortInstanceLabel_5032Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
			return getActuatorInstanceName_5035Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5036Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID:
			return getActuatorInstanceLabel_5037Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
			return getSensorInstanceName_5038Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel26EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5039Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID:
			return getSensorInstanceLabel_5040Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel28EditPart.VISUAL_ID:
			return getLinkLabel_6001Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID:
			return getLinkLabel_6002Parser();
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
