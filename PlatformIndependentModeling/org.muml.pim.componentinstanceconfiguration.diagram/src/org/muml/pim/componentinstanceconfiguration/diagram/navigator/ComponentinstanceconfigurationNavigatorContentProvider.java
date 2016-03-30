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
package org.muml.pim.componentinstanceconfiguration.diagram.navigator;

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
public class ComponentinstanceconfigurationNavigatorContentProvider implements ICommonContentProvider {

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
	public ComponentinstanceconfigurationNavigatorContentProvider() {
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
			ArrayList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem> result = new ArrayList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) {
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup group = (org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem navigatorItem = (org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) parentElement;
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
		switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup links = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_ComponentInstanceConfiguration_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_HybridPortInstance_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_HybridPortInstance_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteSinglePortInstance_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteSinglePortInstance_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteMultiPortInstance_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteMultiPortInstance_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_ContinuousPortInstance_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_ContinuousPortInstance_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_CoordinationProtocolInstance_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteSinglePortInstance_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteSinglePortInstance_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_HybridPortInstance_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_HybridPortInstance_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteSinglePortInstance_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteSinglePortInstance_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteMultiPortInstance_3033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DiscreteMultiPortInstance_3033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup incominglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_ContinuousPortInstance_3034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_ContinuousPortInstance_3034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Node sv = (Node) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup outgoinglinks = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_CoordinationProtocolInstance_3035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup target = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_AssemblyConnectorInstance_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup source = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_AssemblyConnectorInstance_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup target = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DelegationConnectorInstance_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup source = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_DelegationConnectorInstance_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID: {
			LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem> result = new LinkedList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup target = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_CoordinationProtocolInstancePortInstances_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup source = new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup(
					org.muml.pim.componentinstanceconfiguration.diagram.part.Messages.NavigatorGroupName_CoordinationProtocolInstancePortInstances_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
							.getType(
									org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID));
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
		return org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem> result = new ArrayList<org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(
					new org.muml.pim.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem(
							nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem) {
			org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem abstractNavigatorItem = (org.muml.pim.componentinstanceconfiguration.diagram.navigator.MumlAbstractNavigatorItem) element;
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
