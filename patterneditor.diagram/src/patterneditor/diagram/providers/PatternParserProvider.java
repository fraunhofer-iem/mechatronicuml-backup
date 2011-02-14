package patterneditor.diagram.providers;

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

import patterneditor.diagram.edit.parts.CoordinationPatternNameEditPart;
import patterneditor.diagram.edit.parts.RoleNameEditPart;
import patterneditor.diagram.parsers.MessageFormatParser;
import patterneditor.diagram.part.PatternVisualIDRegistry;

/**
 * @generated
 */
public class PatternParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser coordinationPatternName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getCoordinationPatternName_5101Parser() {
		if (coordinationPatternName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			coordinationPatternName_5101Parser = parser;
		}
		return coordinationPatternName_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5102Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5102Parser() {
		if (roleName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { SDMPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5102Parser = parser;
		}
		return roleName_5102Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CoordinationPatternNameEditPart.VISUAL_ID:
			return getCoordinationPatternName_5101Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5102Parser();
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
			return getParser(PatternVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PatternVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PatternElementTypes.getElement(hint) == null) {
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
