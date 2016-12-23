/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.navigator;

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
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel9EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDParserProvider;
import org.muml.storydiagram.verification.sdd.Edge;
import org.muml.storydiagram.verification.sdd.LeafNode;

/**
 * @generated
 */
public class ComponentSDDNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ComponentSDDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ComponentSDDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComponentSDDNavigatorItem
				&& !isOwnView(((ComponentSDDNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ComponentSDDNavigatorGroup) {
			ComponentSDDNavigatorGroup group = (ComponentSDDNavigatorGroup) element;
			return ComponentSDDDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ComponentSDDNavigatorItem) {
			ComponentSDDNavigatorItem navigatorItem = (ComponentSDDNavigatorItem) element;
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
		switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.muml.org/reconfiguration/verification/sdd/componentsdd/1.0.0?ComponentStoryDecisionDiagram", //$NON-NLS-1$
					ComponentSDDElementTypes.ComponentStoryDecisionDiagram_1000);
		case LeafNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/verification/sdd/1.0.0?LeafNode", //$NON-NLS-1$
					ComponentSDDElementTypes.LeafNode_2002);
		case ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/reconfiguration/verification/sdd/componentsdd/1.0.0?ComponentStoryPatternNode", //$NON-NLS-1$
					ComponentSDDElementTypes.ComponentStoryPatternNode_2003);
		case InitialNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/reconfiguration/verification/sdd/componentsdd/1.0.0?InitialNode", //$NON-NLS-1$
					ComponentSDDElementTypes.InitialNode_2004);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?ComponentStoryPattern", //$NON-NLS-1$
					ComponentSDDElementTypes.ComponentStoryPattern_3001);
		case ComponentVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?ComponentVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.ComponentVariable_3002);
		case ComponentPartVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?ComponentPartVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.ComponentPartVariable_3003);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?MultiPortVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.MultiPortVariable_3004);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?SinglePortVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.SinglePortVariable_3005);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?SinglePortVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.SinglePortVariable_3006);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?MultiPortVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.MultiPortVariable_3007);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?SinglePortVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.SinglePortVariable_3008);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?FadingComponentPartVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.FadingComponentPartVariable_3009);
		case EdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/verification/sdd/1.0.0?Edge", //$NON-NLS-1$
					ComponentSDDElementTypes.Edge_4001);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?AssemblyVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.AssemblyVariable_4002);
		case DelegationVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?DelegationVariable", //$NON-NLS-1$
					ComponentSDDElementTypes.DelegationVariable_4003);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/reconfiguration/componentstorypattern/1.0.0?MultiPortOrderConstraint", //$NON-NLS-1$
					ComponentSDDElementTypes.MultiPortOrderConstraint_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComponentSDDDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ComponentSDDElementTypes.isKnownElementType(elementType)) {
			image = ComponentSDDElementTypes.getImage(elementType);
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
		if (element instanceof ComponentSDDNavigatorGroup) {
			ComponentSDDNavigatorGroup group = (ComponentSDDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComponentSDDNavigatorItem) {
			ComponentSDDNavigatorItem navigatorItem = (ComponentSDDNavigatorItem) element;
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
		switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
		case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
			return getComponentStoryDecisionDiagram_1000Text(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2002Text(view);
		case ComponentStoryPatternNodeEditPart.VISUAL_ID:
			return getComponentStoryPatternNode_2003Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2004Text(view);
		case ComponentStoryPatternEditPart.VISUAL_ID:
			return getComponentStoryPattern_3001Text(view);
		case ComponentVariableEditPart.VISUAL_ID:
			return getComponentVariable_3002Text(view);
		case ComponentPartVariableEditPart.VISUAL_ID:
			return getComponentPartVariable_3003Text(view);
		case MultiPortVariableEditPart.VISUAL_ID:
			return getMultiPortVariable_3004Text(view);
		case SinglePortVariableEditPart.VISUAL_ID:
			return getSinglePortVariable_3005Text(view);
		case SinglePortVariable2EditPart.VISUAL_ID:
			return getSinglePortVariable_3006Text(view);
		case MultiPortVariable2EditPart.VISUAL_ID:
			return getMultiPortVariable_3007Text(view);
		case SinglePortVariable3EditPart.VISUAL_ID:
			return getSinglePortVariable_3008Text(view);
		case FadingComponentPartVariableEditPart.VISUAL_ID:
			return getFadingComponentPartVariable_3009Text(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case AssemblyVariableEditPart.VISUAL_ID:
			return getAssemblyVariable_4002Text(view);
		case DelegationVariableEditPart.VISUAL_ID:
			return getDelegationVariable_4003Text(view);
		case MultiPortOrderConstraintEditPart.VISUAL_ID:
			return getMultiPortOrderConstraint_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getComponentStoryDecisionDiagram_1000Text(View view) {
		ComponentStoryDecisionDiagram domainModelElement = (ComponentStoryDecisionDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLeafNode_2002Text(View view) {
		LeafNode domainModelElement = (LeafNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentStoryPatternNode_2003Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.ComponentStoryPatternNode_2003,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(ComponentStoryPatternNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2004Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.InitialNode_2004,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentStoryPattern_3001Text(View view) {
		ComponentStoryPattern domainModelElement = (ComponentStoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentVariable_3002Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.ComponentVariable_3002,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(ComponentVariableOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentPartVariable_3003Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.ComponentPartVariable_3003,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiPortVariable_3004Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.MultiPortVariable_3004,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(PortVariableOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSinglePortVariable_3005Text(View view) {
		SinglePortVariable domainModelElement = (SinglePortVariable) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSinglePortVariable_3006Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.SinglePortVariable_3006,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(PortVariableOperator2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiPortVariable_3007Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.MultiPortVariable_3007,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(PortVariableOperator3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSinglePortVariable_3008Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.SinglePortVariable_3008,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(PortVariableOperator4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFadingComponentPartVariable_3009Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.FadingComponentPartVariable_3009,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		Edge domainModelElement = (Edge) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssemblyVariable_4002Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.AssemblyVariable_4002,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(AssemblyVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationVariable_4003Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.DelegationVariable_4003,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(DelegationVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiPortOrderConstraint_4004Text(View view) {
		IParser parser = ComponentSDDParserProvider.getParser(ComponentSDDElementTypes.MultiPortOrderConstraint_4004,
				view.getElement() != null ? view.getElement() : view,
				ComponentSDDVisualIDRegistry.getType(WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return ComponentStoryDecisionDiagramEditPart.MODEL_ID.equals(ComponentSDDVisualIDRegistry.getModelID(view));
	}

}
