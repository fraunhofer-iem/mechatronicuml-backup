/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.muml.pm.hardware.common.refactor;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.modelinstance.ui.ModelinstanceUiPlugin;
import org.muml.core.modelinstance.ui.diagrams.IDiagramInformation;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public abstract class AbstractExtractSubdiagramRefactoring<T extends EObject> extends AbstractRefactoring<View> {

	private Diagram subdiagram;

	protected abstract boolean elementIsHierachical(T element);

	protected abstract String getEditorID();

	protected abstract PreferencesHint getEditorPreferenceHINT();

	protected abstract List<Integer> getCompartmentViewIDs();

	protected abstract EObject getElementToExtract(T element);

	@Override
	public boolean isExecutable() {
		T element = (T) getContextObject().getElement();
		BooleanValueStyle inlineStyle = DiagramPartitioningUtil.getInlineStyle(getContextObject());
		System.out.println("Exe:" + super.isExecutable());
		System.out.println("Hier:" + elementIsHierachical(element));
		return super.isExecutable() && elementIsHierachical(element)
				&& (inlineStyle == null || !inlineStyle.isBooleanValue());
	}

	@Override
	protected void internalExecute() {
		setNotationStyle();
		subdiagram = createSubdiagram();
		setPreferredSize();
	}

	@Override
	protected boolean internalDoUndo() {
		boolean close = DiagramPartitioningUtil.closeSubdiagramEditors((T) subdiagram.getElement());
		if (!close)
			return false;
		// Since the canonical edit policy creates edges for the semantic
		// transitions and it is not done within the TransactionalCommand we
		// have to delete the created edges manually when undo is executed.
		while (subdiagram.getEdges().size() > 0) {
			EcoreUtil.delete((EObject) subdiagram.getEdges().get(0));
		}
		return true;
	}

	/**
	 * Sets the GMF inline {@link Style} to true
	 */
	@SuppressWarnings("unchecked")
	protected void setNotationStyle() {
		BooleanValueStyle inlineStyle = DiagramPartitioningUtil.getInlineStyle(getContextObject());
		if (inlineStyle == null) {
			inlineStyle = DiagramPartitioningUtil.createInlineStyle();
			getContextObject().getStyles().add(inlineStyle);
		}
		inlineStyle.setBooleanValue(false);
	}

	/**
	 * HERE IS THE EDITOR DEPENDEND CODE; adann TODO: modifiy this part it is
	 * editor dependent
	 */
	/**
	 * Creates a new {@link Diagram} and copies child elements
	 */
	protected Diagram createSubdiagram() {
		View contextView = getContextObject();
		T contextElement = (T) contextView.getElement();
		Map<String, IDiagramInformation> diagramInformationMap = ModelinstanceUiPlugin.getDefault()
				.getDiagramInformationMap();
		IDiagramInformation information = diagramInformationMap.get(getEditorID());
		Diagram newSubdiagram = ViewService.createDiagram(getElementToExtract(contextElement), information.getModelId(),
				getEditorPreferenceHINT());
		View figureCompartment = null;
		for (Integer viewID : getCompartmentViewIDs()) {
			figureCompartment = ViewUtil.getChildBySemanticHint(contextView, String.valueOf(viewID));
			if (figureCompartment != null) {
				break;
			}
		}

		getResource().getContents().add(newSubdiagram);

		while (figureCompartment.getChildren().size() > 0) {

			newSubdiagram.insertChild((View) figureCompartment.getChildren().get(0));
		}
		figureCompartment.setVisible(false);
		contextView.removeChild(figureCompartment);

		return newSubdiagram;

	}

	protected void setPreferredSize() {
		Node node = (Node) getContextObject();
		Bounds bounds = (Bounds) node.getLayoutConstraint();
		bounds.setWidth(-1);
		bounds.setHeight(-1);
	}
}
