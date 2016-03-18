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
package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class RealtimestatechartNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public RealtimestatechartNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem> result = new ArrayList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup links = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_RealtimeStatechart_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Node sv = (Node) view;
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup incominglinks = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_State_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup outgoinglinks = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_State_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateInvariantCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateChannelCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Node sv = (Node) view;
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup incominglinks = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_EntryPoint_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup outgoinglinks = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_EntryPoint_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Node sv = (Node) view;
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup incominglinks = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_ExitPoint_3041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup outgoinglinks = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_ExitPoint_3041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionRegionContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID: {
			LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem> result = new LinkedList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup target = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_Transition_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup source = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup(
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.NavigatorGroupName_Transition_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
							de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem> result = new ArrayList<de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem(nextView,
					parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem abstractNavigatorItem = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.RealtimestatechartAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}