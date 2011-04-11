package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers;

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
import org.storydriven.modeling.SDMPackage;

/**
 * @generated
 */
public class ComponentinstanceconfigurationParserProvider extends
		AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentInstanceNameComponentNameDerived_5003Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceNameComponentNameDerived_5003Parser() {
		if (componentInstanceNameComponentNameDerived_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SDMPackage.eINSTANCE.getNamedElement_Name(),
					de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage.eINSTANCE
							.getComponentInstance_ComponentNameDerived() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			componentInstanceNameComponentNameDerived_5003Parser = parser;
		}
		return componentInstanceNameComponentNameDerived_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentInstanceNameComponentNameDerived_5001Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceNameComponentNameDerived_5001Parser() {
		if (componentInstanceNameComponentNameDerived_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SDMPackage.eINSTANCE.getNamedElement_Name(),
					de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage.eINSTANCE
							.getComponentInstance_ComponentNameDerived() };
			EAttribute[] editableFeatures = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.parsers.MessageFormatParser parser = new de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			componentInstanceNameComponentNameDerived_5001Parser = parser;
		}
		return componentInstanceNameComponentNameDerived_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceNameComponentNameDeriveEditPart.VISUAL_ID:
			return getComponentInstanceNameComponentNameDerived_5003Parser();
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceName2EditPart.VISUAL_ID:
			return getComponentInstanceNameComponentNameDerived_5001Parser();
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
			return getParser(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
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
			if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes
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
