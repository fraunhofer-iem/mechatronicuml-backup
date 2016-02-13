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
public class HardwareParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser hWPlatformName_5069Parser;

	/**
	* @generated
	*/
	private IParser getHWPlatformName_5069Parser() {
		if (hWPlatformName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			hWPlatformName_5069Parser = parser;
		}
		return hWPlatformName_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5057Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5058Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.BusLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getNetworkBridgeLabel_5059Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.NetworkBridgeLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser hWPlatformPartName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartName_5061Parser() {
		if (hWPlatformPartName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			hWPlatformPartName_5061Parser = parser;
		}
		return hWPlatformPartName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5062Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5063Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortPartLabel_5060Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.HWPortPartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser resourcePartName_5064Parser;

	/**
	 * @generated
	 */
	private IParser getResourcePartName_5064Parser() {
		if (resourcePartName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			resourcePartName_5064Parser = parser;
		}
		return resourcePartName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5065Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5066Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5067Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5068Parser() {
		return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getHWPlatformName_5069Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getBusLabel_5057Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getBusLabel_5058Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getNetworkBridgeLabel_5059Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID:
			return getHWPlatformPartName_5061Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5062Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5063Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
			return getHWPortPartLabel_5060Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart.VISUAL_ID:
			return getResourcePartName_5064Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getResourcePartLabel_5065Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getResourcePartLabel_5066Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getResourcePartLabel_5067Parser();
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
			return getResourcePartLabel_5068Parser();
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
