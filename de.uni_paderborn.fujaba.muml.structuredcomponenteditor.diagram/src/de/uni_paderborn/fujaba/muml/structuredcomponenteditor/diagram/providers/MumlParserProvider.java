package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers;

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
public class MumlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	protected IParser staticStructuredComponentName_5021Parser;

	/**
	 * @generated
	 */
	protected IParser getStaticStructuredComponentName_5021Parser() {
		if (staticStructuredComponentName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			staticStructuredComponentName_5021Parser = parser;
		}
		return staticStructuredComponentName_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discretePortName_5012Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortName_5012Parser() {
		if (discretePortName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			discretePortName_5012Parser = parser;
		}
		return discretePortName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.DiscretePortLabelExpressionLabelParser5025 discretePortLabel_5025Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortLabel_5025Parser() {
		if (discretePortLabel_5025Parser == null) {
			discretePortLabel_5025Parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.DiscretePortLabelExpressionLabelParser5025();
		}
		return discretePortLabel_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortName_5013Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortName_5013Parser() {
		if (continuousPortName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortName_5013Parser = parser;
		}
		return continuousPortName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.ComponentPartLabelExpressionLabelParser5017 componentPartLabel_5017Parser;

	/**
	 * @generated
	 */
	protected IParser getComponentPartLabel_5017Parser() {
		if (componentPartLabel_5017Parser == null) {
			componentPartLabel_5017Parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.ComponentPartLabelExpressionLabelParser5017();
		}
		return componentPartLabel_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser hybridPortName_5024Parser;

	/**
	 * @generated
	 */
	protected IParser getHybridPortName_5024Parser() {
		if (hybridPortName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			hybridPortName_5024Parser = parser;
		}
		return hybridPortName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser discretePortName_5015Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortName_5015Parser() {
		if (discretePortName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			discretePortName_5015Parser = parser;
		}
		return discretePortName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.DiscretePortLabelExpressionLabelParser5028 discretePortLabel_5028Parser;

	/**
	 * @generated
	 */
	protected IParser getDiscretePortLabel_5028Parser() {
		if (discretePortLabel_5028Parser == null) {
			discretePortLabel_5028Parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.DiscretePortLabelExpressionLabelParser5028();
		}
		return discretePortLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser continuousPortName_5016Parser;

	/**
	 * @generated
	 */
	protected IParser getContinuousPortName_5016Parser() {
		if (continuousPortName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			continuousPortName_5016Parser = parser;
		}
		return continuousPortName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser assemblyConnectorComment_6001Parser;

	/**
	 * @generated
	 */
	protected IParser getAssemblyConnectorComment_6001Parser() {
		if (assemblyConnectorComment_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getCommentableElement_Comment() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			assemblyConnectorComment_6001Parser = parser;
		}
		return assemblyConnectorComment_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser delegationConnectorComment_6002Parser;

	/**
	 * @generated
	 */
	protected IParser getDelegationConnectorComment_6002Parser() {
		if (delegationConnectorComment_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getCommentableElement_Comment() };
			de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.parsers.MessageFormatParser(
					features);
			delegationConnectorComment_6002Parser = parser;
		}
		return delegationConnectorComment_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID:
			return getStaticStructuredComponentName_5021Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
			return getDiscretePortName_5012Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getDiscretePortLabel_5025Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
			return getContinuousPortName_5013Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getComponentPartLabel_5017Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID:
			return getHybridPortName_5024Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DiscretePortName2EditPart.VISUAL_ID:
			return getDiscretePortName_5015Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getDiscretePortLabel_5028Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ContinuousPortName2EditPart.VISUAL_ID:
			return getContinuousPortName_5016Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyConnectorCommentEditPart.VISUAL_ID:
			return getAssemblyConnectorComment_6001Parser();
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationConnectorCommentEditPart.VISUAL_ID:
			return getDelegationConnectorComment_6002Parser();
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
			return getParser(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes
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
