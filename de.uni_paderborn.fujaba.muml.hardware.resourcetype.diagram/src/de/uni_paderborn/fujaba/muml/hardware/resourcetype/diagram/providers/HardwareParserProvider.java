package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers;

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
	private IParser deviceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5005Parser() {
		if (deviceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			deviceName_5005Parser = parser;
		}
		return deviceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getDeviceLabel_5020Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.DeviceLabelExpressionLabelParser5020();
	}

	/**
	 * @generated
	 */
	private IParser getDeviceLabel_5027Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.DeviceLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser structuredResourceName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredResourceName_5007Parser() {
		if (structuredResourceName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			structuredResourceName_5007Parser = parser;
		}
		return structuredResourceName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceLabel_5032Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.StructuredResourceLabelExpressionLabelParser5032();
	}

	/**
	 * @generated
	 */
	private IParser getStructuredResourceLabel_5033Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.StructuredResourceLabelExpressionLabelParser5033();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortLabel_5024Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.HWPortLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser cacheName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getCacheName_5013Parser() {
		if (cacheName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			cacheName_5013Parser = parser;
		}
		return cacheName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5021Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.CacheLabelExpressionLabelParser5021();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5028Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.CacheLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5038Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.CacheLabelExpressionLabelParser5038();
	}

	/**
	 * @generated
	 */
	private IParser getCacheLabel_5039Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.CacheLabelExpressionLabelParser5039();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5014Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.ProcessorLabelExpressionLabelParser5014();
	}

	/**
	 * @generated
	 */
	private IParser processorName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorName_5022Parser() {
		if (processorName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processorName_5022Parser = parser;
		}
		return processorName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5029Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.ProcessorLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5034Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.ProcessorLabelExpressionLabelParser5034();
	}

	/**
	 * @generated
	 */
	private IParser getProcessorLabel_5035Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.ProcessorLabelExpressionLabelParser5035();
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
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			programmableLogicDeviceName_5015Parser = parser;
		}
		return programmableLogicDeviceName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceLabel_5018Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.ProgrammableLogicDeviceLabelExpressionLabelParser5018();
	}

	/**
	 * @generated
	 */
	private IParser getProgrammableLogicDeviceLabel_5030Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.ProgrammableLogicDeviceLabelExpressionLabelParser5030();
	}

	/**
	 * @generated
	 */
	private IParser memoryResourceName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getMemoryResourceName_5016Parser() {
		if (memoryResourceName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			memoryResourceName_5016Parser = parser;
		}
		return memoryResourceName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5023Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MemoryResourceLabelExpressionLabelParser5023();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5031Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MemoryResourceLabelExpressionLabelParser5031();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5036Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MemoryResourceLabelExpressionLabelParser5036();
	}

	/**
	 * @generated
	 */
	private IParser getMemoryResourceLabel_5037Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.parsers.MemoryResourceLabelExpressionLabelParser5037();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5005Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceDeviceTypeEditPart.VISUAL_ID:
			return getDeviceLabel_5020Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getDeviceLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID:
			return getStructuredResourceName_5007Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getStructuredResourceLabel_5032Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getStructuredResourceLabel_5033Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getHWPortLabel_5024Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheNameEditPart.VISUAL_ID:
			return getCacheName_5013Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getCacheLabel_5021Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getCacheLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
			return getCacheLabel_5038Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
			return getCacheLabel_5039Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getProcessorLabel_5014Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID:
			return getProcessorName_5022Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getProcessorLabel_5029Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getProcessorLabel_5034Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getProcessorLabel_5035Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceName_5015Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceLabel_5018Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getProgrammableLogicDeviceLabel_5030Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceNameEditPart.VISUAL_ID:
			return getMemoryResourceName_5016Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5023Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5031Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceIsVolatileEditPart.VISUAL_ID:
			return getMemoryResourceLabel_5036Parser();
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceIsVolatile2EditPart.VISUAL_ID:
			return getMemoryResourceLabel_5037Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes
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
