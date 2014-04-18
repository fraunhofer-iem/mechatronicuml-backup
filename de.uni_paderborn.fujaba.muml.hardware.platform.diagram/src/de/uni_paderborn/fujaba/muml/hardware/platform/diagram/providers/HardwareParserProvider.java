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
	private IParser getHWPlatformLabel_5050Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformLabelExpressionLabelParser5050();
	}

	/**
	 * @generated
	 */
	private IParser getBusPartLabel_5037Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusPartLabelExpressionLabelParser5037();
	}

	/**
	 * @generated
	 */
	private IParser getBusPartLabel_5038Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusPartLabelExpressionLabelParser5038();
	}

	/**
	 * @generated
	 */
	private IParser getBridgePartLabel_5039Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BridgePartLabelExpressionLabelParser5039();
	}

	/**
	 * @generated
	 */
	private IParser hWPlatformPartName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartName_5041Parser() {
		if (hWPlatformPartName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			hWPlatformPartName_5041Parser = parser;
		}
		return hWPlatformPartName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5042Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5042();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5043Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5043();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortPartLabel_5040Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPortPartLabelExpressionLabelParser5040();
	}

	/**
	 * @generated
	 */
	private IParser getDelegationHWPortLabel_5044Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.DelegationHWPortLabelExpressionLabelParser5044();
	}

	/**
	 * @generated
	 */
	private IParser resourcePartName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getResourcePartName_5045Parser() {
		if (resourcePartName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			resourcePartName_5045Parser = parser;
		}
		return resourcePartName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5046Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5046();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5047Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5047();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5048Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5048();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5049Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5049();
	}

	/**
	 * @generated
	 */
	private IParser getLinkPartLabel_6003Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.LinkPartLabelExpressionLabelParser6003();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getHWPlatformLabel_5050Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getBusPartLabel_5037Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getBusPartLabel_5038Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getBridgePartLabel_5039Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID:
			return getHWPlatformPartName_5041Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5042Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5043Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getHWPortPartLabel_5040Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
			return getDelegationHWPortLabel_5044Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart.VISUAL_ID:
			return getResourcePartName_5045Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getResourcePartLabel_5046Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getResourcePartLabel_5047Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getResourcePartLabel_5048Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getResourcePartLabel_5049Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
			return getLinkPartLabel_6003Parser();
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
