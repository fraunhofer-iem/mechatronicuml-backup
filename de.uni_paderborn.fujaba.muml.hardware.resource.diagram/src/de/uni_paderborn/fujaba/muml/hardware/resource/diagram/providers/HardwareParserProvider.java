package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers;

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
	private IParser deviceName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5002Parser() {
		if (deviceName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			deviceName_5002Parser = parser;
		}
		return deviceName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getDeviceLabel_5003Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.DeviceLabelExpressionLabelParser5003();
	}

	/**
	 * @generated
	 */
	private IParser getDeviceLabel_5004Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.DeviceLabelExpressionLabelParser5004();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceName_5023Parser() {
		if (structuredResourceName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			structuredResourceName_5023Parser = parser;
		}
		return structuredResourceName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceLabel_5024Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.StructuredResourceLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceLabel_5025Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.StructuredResourceLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5026Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.BusLabelExpressionLabelParser5026();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5027Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.BusLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser getLinkLabel_5028Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.LinkLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser getLinkLabel_5029Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.LinkLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser communicationProtocolRepositoryName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getCommunicationProtocolRepositoryName_5032Parser() {
		if (communicationProtocolRepositoryName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features);
			communicationProtocolRepositoryName_5032Parser = parser;
		}
		return communicationProtocolRepositoryName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCommunicationResourceLabel_5001Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.CommunicationResourceLabelExpressionLabelParser5001();
	}

	/**
	 * @generated
	 */
	private IParser cacheName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCacheName_5005Parser() {
		if (cacheName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			cacheName_5005Parser = parser;
		}
		return cacheName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5006Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5006();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5007Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5007();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5008Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5008();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5009Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5009();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5010Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5010();
	}

	/**
	 * @generated
	 */
	private IParser processorName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorName_5011Parser() {
		if (processorName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processorName_5011Parser = parser;
		}
		return processorName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5012Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5012();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5013Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5013();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5014Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5014();
	}

	/**
	 * @generated
	 */
	private IParser programmableLogicDeviceName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceName_5015Parser() {
		if (programmableLogicDeviceName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			programmableLogicDeviceName_5015Parser = parser;
		}
		return programmableLogicDeviceName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceLabel_5016Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.ProgrammableLogicDeviceLabelExpressionLabelParser5016();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceLabel_5017Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.ProgrammableLogicDeviceLabelExpressionLabelParser5017();
	}

	/**
	 * @generated
	 */
	private IParser memoryResourceName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getMemoryResourceName_5018Parser() {
		if (memoryResourceName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			memoryResourceName_5018Parser = parser;
		}
		return memoryResourceName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5019Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5019();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5020Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5020();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5021Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5021();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5022Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5022();
	}

	/**
	 * @generated
	 */
	private IParser busProtocolName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getBusProtocolName_5030Parser() {
		if (busProtocolName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features);
			busProtocolName_5030Parser = parser;
		}
		return busProtocolName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkProtocolName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getLinkProtocolName_5031Parser() {
		if (linkProtocolName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.parsers.MessageFormatParser(
					features);
			linkProtocolName_5031Parser = parser;
		}
		return linkProtocolName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5002Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getDeviceLabel_5003Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getDeviceLabel_5004Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID:
			return getStructuredResourceName_5023Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getStructuredResourceLabel_5024Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getStructuredResourceLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
			return getBusLabel_5026Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
			return getBusLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
			return getLinkLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
			return getLinkLabel_5029Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart.VISUAL_ID:
			return getCommunicationProtocolRepositoryName_5032Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getCommunicationResourceLabel_5001Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheNameEditPart.VISUAL_ID:
			return getCacheName_5005Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getCacheLabel_5006Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getCacheLabel_5007Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getCacheLabel_5008Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getCacheLabel_5009Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getProcessorLabel_5010Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID:
			return getProcessorName_5011Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getProcessorLabel_5012Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProcessorLabel_5013Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getProcessorLabel_5014Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceName_5015Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceLabel_5016Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceLabel_5017Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart.VISUAL_ID:
			return getMemoryResourceName_5018Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5019Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5020Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5021Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5022Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart.VISUAL_ID:
			return getBusProtocolName_5030Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart.VISUAL_ID:
			return getLinkProtocolName_5031Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes
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
