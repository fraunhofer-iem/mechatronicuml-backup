package de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator;

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

/**
 * @generated
 */
public class TestLanguageNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorGroup group = (de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://de/uni_paderborn/fujaba/muml/testlanguage?TestCase", de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.TestCase_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://de/uni_paderborn/fujaba/muml/testlanguage?Node", de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://de/uni_paderborn/fujaba/muml/testlanguage?Input", de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://de/uni_paderborn/fujaba/muml/testlanguage?Output", de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://de/uni_paderborn/fujaba/muml/testlanguage?Output?targets", de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
					.getImage(elementType);
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
		if (element instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorGroup group = (de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.testlanguage.diagram.navigator.TestLanguageNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.VISUAL_ID:
			return getTestCase_1000Text(view);
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3001Text(view);
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3002Text(view);
		case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID:
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
		IParser parser = de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_3001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_3002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
						.getModelID(view));
	}

}
