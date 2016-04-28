package org.muml.pm.hardware.platform.diagram.providers;

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
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pm.hardware.platform.diagram.parsers.BusLabelExpressionLabelParser5057;
import org.muml.pm.hardware.platform.diagram.parsers.BusLabelExpressionLabelParser5058;
import org.muml.pm.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5062;
import org.muml.pm.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5063;
import org.muml.pm.hardware.platform.diagram.parsers.HWPortPartLabelExpressionLabelParser5060;
import org.muml.pm.hardware.platform.diagram.parsers.MessageFormatParser;
import org.muml.pm.hardware.platform.diagram.parsers.NetworkBridgeLabelExpressionLabelParser5059;
import org.muml.pm.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5065;
import org.muml.pm.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5066;
import org.muml.pm.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5067;
import org.muml.pm.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5068;
import org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry;

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
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			hWPlatformName_5069Parser = parser;
		}
		return hWPlatformName_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5057Parser() {
		return new BusLabelExpressionLabelParser5057();
	}

	/**
	 * @generated
	 */
	private IParser getBusLabel_5058Parser() {
		return new BusLabelExpressionLabelParser5058();
	}

	/**
	 * @generated
	 */
	private IParser getNetworkBridgeLabel_5059Parser() {
		return new NetworkBridgeLabelExpressionLabelParser5059();
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
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			hWPlatformPartName_5061Parser = parser;
		}
		return hWPlatformPartName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5062Parser() {
		return new HWPlatformPartLabelExpressionLabelParser5062();
	}

	/**
	 * @generated
	 */
	private IParser getHWPlatformPartLabel_5063Parser() {
		return new HWPlatformPartLabelExpressionLabelParser5063();
	}

	/**
	 * @generated
	 */
	private IParser getHWPortPartLabel_5060Parser() {
		return new HWPortPartLabelExpressionLabelParser5060();
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
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			resourcePartName_5064Parser = parser;
		}
		return resourcePartName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5065Parser() {
		return new ResourcePartLabelExpressionLabelParser5065();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5066Parser() {
		return new ResourcePartLabelExpressionLabelParser5066();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5067Parser() {
		return new ResourcePartLabelExpressionLabelParser5067();
	}

	/**
	 * @generated
	 */
	private IParser getResourcePartLabel_5068Parser() {
		return new ResourcePartLabelExpressionLabelParser5068();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabelEditPart.VISUAL_ID:
			return getHWPlatformName_5069Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getBusLabel_5057Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getBusLabel_5058Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getNetworkBridgeLabel_5059Parser();
		case HWPlatformPartNameEditPart.VISUAL_ID:
			return getHWPlatformPartName_5061Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5062Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getHWPlatformPartLabel_5063Parser();
		case HWPortLabelEditPart.VISUAL_ID:
			return getHWPortPartLabel_5060Parser();
		case ResourcePartNameEditPart.VISUAL_ID:
			return getResourcePartName_5064Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getResourcePartLabel_5065Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getResourcePartLabel_5066Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getResourcePartLabel_5067Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
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
