package org.muml.pm.hardware.resource.diagram.providers;

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
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel12EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel13EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel14EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel15EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel16EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel17EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel18EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel19EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel20EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pm.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5048;
import org.muml.pm.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5049;
import org.muml.pm.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5050;
import org.muml.pm.hardware.resource.diagram.parsers.CacheLabelExpressionLabelParser5051;
import org.muml.pm.hardware.resource.diagram.parsers.CommunicationResourceLabelExpressionLabelParser5040;
import org.muml.pm.hardware.resource.diagram.parsers.CommunicationResourceLabelExpressionLabelParser5045;
import org.muml.pm.hardware.resource.diagram.parsers.CommunicationResourceLabelExpressionLabelParser5046;
import org.muml.pm.hardware.resource.diagram.parsers.DeviceLabelExpressionLabelParser5042;
import org.muml.pm.hardware.resource.diagram.parsers.DeviceLabelExpressionLabelParser5043;
import org.muml.pm.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5061;
import org.muml.pm.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5062;
import org.muml.pm.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5063;
import org.muml.pm.hardware.resource.diagram.parsers.MemoryResourceLabelExpressionLabelParser5064;
import org.muml.pm.hardware.resource.diagram.parsers.MessageFormatParser;
import org.muml.pm.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5052;
import org.muml.pm.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5054;
import org.muml.pm.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5055;
import org.muml.pm.hardware.resource.diagram.parsers.ProcessorLabelExpressionLabelParser5056;
import org.muml.pm.hardware.resource.diagram.parsers.ProgrammableLogicDeviceLabelExpressionLabelParser5058;
import org.muml.pm.hardware.resource.diagram.parsers.ProgrammableLogicDeviceLabelExpressionLabelParser5059;
import org.muml.pm.hardware.resource.diagram.parsers.StructuredResourceLabelExpressionLabelParser5066;
import org.muml.pm.hardware.resource.diagram.parsers.StructuredResourceLabelExpressionLabelParser5067;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HardwareParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser deviceName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5041Parser() {
		if (deviceName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			deviceName_5041Parser = parser;
		}
		return deviceName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser getDeviceLabel_5042Parser() {
		return new DeviceLabelExpressionLabelParser5042();
	}

	/**
	 * @generated
	 */
	private IParser getDeviceLabel_5043Parser() {
		return new DeviceLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceName_5065Parser() {
		if (structuredResourceName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			structuredResourceName_5065Parser = parser;
		}
		return structuredResourceName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceLabel_5066Parser() {
		return new StructuredResourceLabelExpressionLabelParser5066();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceLabel_5067Parser() {
		return new StructuredResourceLabelExpressionLabelParser5067();
	}

	/**
	 * @generated
	 */
	private IParser communicationProtocolRepositoryName_5070Parser;

	/**
	 * @generated
	 */
	private IParser getCommunicationProtocolRepositoryName_5070Parser() {
		if (communicationProtocolRepositoryName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			communicationProtocolRepositoryName_5070Parser = parser;
		}
		return communicationProtocolRepositoryName_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCommunicationResourceLabel_5040Parser() {
		return new CommunicationResourceLabelExpressionLabelParser5040();
	}

	/**
	 * @generated
	 */
	private IParser communicationResourceName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getCommunicationResourceName_5044Parser() {
		if (communicationResourceName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			communicationResourceName_5044Parser = parser;
		}
		return communicationResourceName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCommunicationResourceLabel_5045Parser() {
		return new CommunicationResourceLabelExpressionLabelParser5045();
	}

	/**
	 * @generated
	 */
	private IParser getCommunicationResourceLabel_5046Parser() {
		return new CommunicationResourceLabelExpressionLabelParser5046();
	}

	/**
	 * @generated
	 */
	private IParser cacheName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getCacheName_5047Parser() {
		if (cacheName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			cacheName_5047Parser = parser;
		}
		return cacheName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5048Parser() {
		return new CacheLabelExpressionLabelParser5048();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5049Parser() {
		return new CacheLabelExpressionLabelParser5049();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5050Parser() {
		return new CacheLabelExpressionLabelParser5050();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5051Parser() {
		return new CacheLabelExpressionLabelParser5051();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5052Parser() {
		return new ProcessorLabelExpressionLabelParser5052();
	}

	/**
	 * @generated
	 */
	private IParser processorName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorName_5053Parser() {
		if (processorName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			processorName_5053Parser = parser;
		}
		return processorName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5054Parser() {
		return new ProcessorLabelExpressionLabelParser5054();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5055Parser() {
		return new ProcessorLabelExpressionLabelParser5055();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5056Parser() {
		return new ProcessorLabelExpressionLabelParser5056();
	}

	/**
	 * @generated
	 */
	private IParser programmableLogicDeviceName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceName_5057Parser() {
		if (programmableLogicDeviceName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			programmableLogicDeviceName_5057Parser = parser;
		}
		return programmableLogicDeviceName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceLabel_5058Parser() {
		return new ProgrammableLogicDeviceLabelExpressionLabelParser5058();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceLabel_5059Parser() {
		return new ProgrammableLogicDeviceLabelExpressionLabelParser5059();
	}

	/**
	 * @generated
	 */
	private IParser memoryResourceName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getMemoryResourceName_5060Parser() {
		if (memoryResourceName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			memoryResourceName_5060Parser = parser;
		}
		return memoryResourceName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5061Parser() {
		return new MemoryResourceLabelExpressionLabelParser5061();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5062Parser() {
		return new MemoryResourceLabelExpressionLabelParser5062();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5063Parser() {
		return new MemoryResourceLabelExpressionLabelParser5063();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5064Parser() {
		return new MemoryResourceLabelExpressionLabelParser5064();
	}

	/**
	 * @generated
	 */
	private IParser busProtocolName_5068Parser;

	/**
	 * @generated
	 */
	private IParser getBusProtocolName_5068Parser() {
		if (busProtocolName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			busProtocolName_5068Parser = parser;
		}
		return busProtocolName_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkProtocolName_5069Parser;

	/**
	 * @generated
	 */
	private IParser getLinkProtocolName_5069Parser() {
		if (linkProtocolName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linkProtocolName_5069Parser = parser;
		}
		return linkProtocolName_5069Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5041Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getDeviceLabel_5042Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getDeviceLabel_5043Parser();
		case StructuredResourceNameEditPart.VISUAL_ID:
			return getStructuredResourceName_5065Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getStructuredResourceLabel_5066Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getStructuredResourceLabel_5067Parser();
		case CommunicationProtocolRepositoryNameEditPart.VISUAL_ID:
			return getCommunicationProtocolRepositoryName_5070Parser();
		case HWPortLabelEditPart.VISUAL_ID:
			return getCommunicationResourceLabel_5040Parser();
		case CommunicationResourceNameEditPart.VISUAL_ID:
			return getCommunicationResourceName_5044Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getCommunicationResourceLabel_5045Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getCommunicationResourceLabel_5046Parser();
		case CacheNameEditPart.VISUAL_ID:
			return getCacheName_5047Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getCacheLabel_5048Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getCacheLabel_5049Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getCacheLabel_5050Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getCacheLabel_5051Parser();
		case WrappingLabel11EditPart.VISUAL_ID:
			return getProcessorLabel_5052Parser();
		case ProcessorNameEditPart.VISUAL_ID:
			return getProcessorName_5053Parser();
		case WrappingLabel12EditPart.VISUAL_ID:
			return getProcessorLabel_5054Parser();
		case WrappingLabel13EditPart.VISUAL_ID:
			return getProcessorLabel_5055Parser();
		case WrappingLabel14EditPart.VISUAL_ID:
			return getProcessorLabel_5056Parser();
		case ProgrammableLogicDeviceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceName_5057Parser();
		case WrappingLabel15EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceLabel_5058Parser();
		case WrappingLabel16EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceLabel_5059Parser();
		case MemoryResourceNameEditPart.VISUAL_ID:
			return getMemoryResourceName_5060Parser();
		case WrappingLabel17EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5061Parser();
		case WrappingLabel18EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5062Parser();
		case WrappingLabel19EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5063Parser();
		case WrappingLabel20EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5064Parser();
		case BusProtocolNameEditPart.VISUAL_ID:
			return getBusProtocolName_5068Parser();
		case LinkProtocolNameEditPart.VISUAL_ID:
			return getLinkProtocolName_5069Parser();
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
			return getParser(HardwareVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(HardwareVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (HardwareElementTypes.getElement(hint) == null) {
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
