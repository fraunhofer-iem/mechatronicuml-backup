package org.muml.testlanguage.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.muml.testlanguage.diagram.edit.parts.InputEditPart;
import org.muml.testlanguage.diagram.edit.parts.InputNameEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputNameEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart;
import org.muml.testlanguage.diagram.edit.parts.TestCaseEditPart;
import org.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin;
import org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry;
import org.muml.testlanguage.diagram.providers.TestLanguageElementTypes;
import org.muml.testlanguage.diagram.providers.TestLanguageParserProvider;

/**
 * @generated
 */
public class TestLanguageNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TestLanguageDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		TestLanguageDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TestLanguageNavigatorItem
				&& !isOwnView(((TestLanguageNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TestLanguageNavigatorGroup) {
			TestLanguageNavigatorGroup group = (TestLanguageNavigatorGroup) element;
			return TestLanguageDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof TestLanguageNavigatorItem) {
			TestLanguageNavigatorItem navigatorItem = (TestLanguageNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (TestLanguageVisualIDRegistry.getVisualID(view)) {
		case TestCaseEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/testlanguage/1.0?TestCase", //$NON-NLS-1$
					TestLanguageElementTypes.TestCase_1000);
		case NodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/testlanguage/1.0?Node", //$NON-NLS-1$
					TestLanguageElementTypes.Node_2001);
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/testlanguage/1.0?Input", //$NON-NLS-1$
					TestLanguageElementTypes.Input_3001);
		case OutputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/testlanguage/1.0?Output", //$NON-NLS-1$
					TestLanguageElementTypes.Output_3002);
		case OutputTargetsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/testlanguage/1.0?Output?targets", //$NON-NLS-1$
					TestLanguageElementTypes.OutputTargets_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TestLanguageDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && TestLanguageElementTypes.isKnownElementType(elementType)) {
			image = TestLanguageElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof TestLanguageNavigatorGroup) {
			TestLanguageNavigatorGroup group = (TestLanguageNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TestLanguageNavigatorItem) {
			TestLanguageNavigatorItem navigatorItem = (TestLanguageNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TestLanguageVisualIDRegistry.getVisualID(view)) {
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_1000Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002Text(view);
		case OutputTargetsEditPart.VISUAL_ID:
			return getOutputTargets_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTestCase_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNode_2001Text(View view) {
		IParser parser = TestLanguageParserProvider.getParser(TestLanguageElementTypes.Node_2001,
				view.getElement() != null ? view.getElement() : view,
				TestLanguageVisualIDRegistry.getType(NodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TestLanguageDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_3001Text(View view) {
		IParser parser = TestLanguageParserProvider.getParser(TestLanguageElementTypes.Input_3001,
				view.getElement() != null ? view.getElement() : view,
				TestLanguageVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TestLanguageDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_3002Text(View view) {
		IParser parser = TestLanguageParserProvider.getParser(TestLanguageElementTypes.Output_3002,
				view.getElement() != null ? view.getElement() : view,
				TestLanguageVisualIDRegistry.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TestLanguageDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputTargets_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TestCaseEditPart.MODEL_ID.equals(TestLanguageVisualIDRegistry.getModelID(view));
	}

}
