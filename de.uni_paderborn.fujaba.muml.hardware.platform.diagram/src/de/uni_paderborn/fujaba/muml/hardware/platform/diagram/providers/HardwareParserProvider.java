package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers;

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
	private IParser getHWPlatformLabel_5036Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformLabelExpressionLabelParser5036();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5023Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusLabelExpressionLabelParser5023();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5024Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusLabelExpressionLabelParser5024();
	}

	/**
	 * @generated
	 */
	private IParser getBridgeLabel_5025Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BridgeLabelExpressionLabelParser5025();
	}

	/**
	 * @generated
	 */
	private IParser hWPlatformPartName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartName_5026Parser() {
		if (hWPlatformPartName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			hWPlatformPartName_5026Parser = parser;
		}
		return hWPlatformPartName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5027Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5027();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5028Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5028();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortPartLabel_5022Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPortPartLabelExpressionLabelParser5022();
	}

	/**
	 * @generated
	 */
	private IParser getBusPortInstanceLabel_5029Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusPortInstanceLabelExpressionLabelParser5029();
	}

	/**
	 * @generated
	 */
	private IParser resourceInstancePartName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getResourceInstancePartName_5030Parser() {
		if (resourceInstancePartName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			resourceInstancePartName_5030Parser = parser;
		}
		return resourceInstancePartName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser getResourceInstancePartLabel_5031Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourceInstancePartLabelExpressionLabelParser5031();
	}

	/**
	 * @generated
	 */
	private IParser getResourceInstancePartLabel_5032Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourceInstancePartLabelExpressionLabelParser5032();
	}

	/**
	 * @generated
	 */
	private IParser getResourceInstancePartLabel_5033Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourceInstancePartLabelExpressionLabelParser5033();
	}

	/**
	 * @generated
	 */
	private IParser getResourceInstancePartLabel_5034Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourceInstancePartLabelExpressionLabelParser5034();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortPartLabel_5019Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPortPartLabelExpressionLabelParser5019();
	}

	/**
	 * @generated
	 */
	private IParser getLinkPortInstanceLabel_5035Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.LinkPortInstanceLabelExpressionLabelParser5035();
	}

	/**
	 * @generated
	 */
	private IParser getLinkLabel_6001Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.LinkLabelExpressionLabelParser6001();
	}

	/**
	 * @generated
	 */
	private IParser getLinkLabel_6002Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.LinkLabelExpressionLabelParser6002();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformNameEditPart.VISUAL_ID:
			return getHWPlatformLabel_5036Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getBusLabel_5023Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getBusLabel_5024Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getBridgeLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID:
			return getHWPlatformPartName_5026Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5027Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabel3EditPart.VISUAL_ID:
			return getHWPortPartLabel_5022Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getBusPortInstanceLabel_5029Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourceInstancePartNameEditPart.VISUAL_ID:
			return getResourceInstancePartName_5030Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getResourceInstancePartLabel_5031Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getResourceInstancePartLabel_5032Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getResourceInstancePartLabel_5033Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getResourceInstancePartLabel_5034Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
			return getHWPortPartLabel_5019Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabel4EditPart.VISUAL_ID:
			return getLinkPortInstanceLabel_5035Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getLinkLabel_6001Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
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
			return getParser(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes
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
