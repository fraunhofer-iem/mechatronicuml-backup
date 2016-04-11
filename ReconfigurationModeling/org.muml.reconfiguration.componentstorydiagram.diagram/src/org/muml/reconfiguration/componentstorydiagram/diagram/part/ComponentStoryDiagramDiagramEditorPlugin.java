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
package org.muml.reconfiguration.componentstorydiagram.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.tooling.runtime.LogHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.core.common.FujabaCommonPlugin;
import org.muml.core.expressions.common.provider.CommonExpressionsItemProviderAdapterFactory;
import org.muml.core.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.muml.core.provider.CoreItemProviderAdapterFactory;
import org.muml.pim.behavior.provider.BehaviorItemProviderAdapterFactory;
import org.muml.pim.component.provider.ComponentItemProviderAdapterFactory;
import org.muml.pim.connector.provider.ConnectorItemProviderAdapterFactory;
import org.muml.pim.constraint.provider.ConstraintItemProviderAdapterFactory;
import org.muml.pim.instance.provider.InstanceItemProviderAdapterFactory;
import org.muml.pim.msgtype.provider.MsgtypeItemProviderAdapterFactory;
import org.muml.pim.pattern.provider.PatternItemProviderAdapterFactory;
import org.muml.pim.protocol.provider.ProtocolItemProviderAdapterFactory;
import org.muml.pim.provider.PimItemProviderAdapterFactory;
import org.muml.pim.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory;
import org.muml.pim.types.provider.TypesItemProviderAdapterFactory;
import org.muml.pim.valuetype.provider.ValuetypeItemProviderAdapterFactory;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy;
import org.muml.reconfiguration.componentstorydiagram.diagram.expressions.ComponentStoryDiagramOCLFactory;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ElementInitializers;
import org.muml.reconfiguration.componentstorydiagram.provider.ComponentstorydiagramItemProviderAdapterFactory;
import org.muml.reconfiguration.componentstorypattern.provider.ComponentstorypatternItemProviderAdapterFactory;
import org.muml.reconfiguration.expression.provider.ExpressionItemProviderAdapterFactory;
import org.muml.reconfiguration.protocolinstantiation.provider.ProtocolinstantiationItemProviderAdapterFactory;
import org.muml.reconfiguration.provider.ReconfigurationItemProviderAdapterFactory;
import org.muml.reconfiguration.structdatatype.provider.StructdatatypeItemProviderAdapterFactory;
import org.muml.storydiagram.activities.expressions.provider.ActivitiesExpressionsItemProviderAdapterFactory;
import org.muml.storydiagram.activities.provider.ActivitiesItemProviderAdapterFactory;
import org.muml.storydiagram.calls.expressions.provider.CallsExpressionsItemProviderAdapterFactory;
import org.muml.storydiagram.calls.provider.CallsItemProviderAdapterFactory;
import org.muml.storydiagram.patterns.expressions.provider.PatternsExpressionsItemProviderAdapterFactory;
import org.muml.storydiagram.patterns.provider.PatternsItemProviderAdapterFactory;
import org.muml.storydiagram.provider.StorydiagramItemProviderAdapterFactory;
import org.muml.storydiagram.templates.provider.TemplatesItemProviderAdapterFactory;
import org.osgi.framework.BundleContext;

/**
 * @generated
 */
public class ComponentStoryDiagramDiagramEditorPlugin extends AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String ID = "org.muml.reconfiguration.componentstorydiagram.diagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private LogHelper myLogHelper;

	/**
	 * @generated
	 */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(ID);

	/**
	 * @generated
	 */
	private static ComponentStoryDiagramDiagramEditorPlugin instance;

	/**
	 * @generated
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	private ComponentStoryDiagramDocumentProvider documentProvider;

	/**
	 * @generated
	 */
	private ComponentStoryDiagramBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/**
	 * @generated
	 */
	private ElementInitializers initializers;

	/**
	 * @generated
	 */
	private ComponentStoryDiagramOCLFactory oclFactory;

	/**
	 * @generated
	 */
	public ComponentStoryDiagramDiagramEditorPlugin() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		myLogHelper = new LogHelper(this);
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
		adapterFactory = createAdapterFactory();
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		linkConstraints = null;
		initializers = null;
		oclFactory = null;
		instance = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static ComponentStoryDiagramDiagramEditorPlugin getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		List<AdapterFactory> positivePriorityFactories = FujabaCommonPlugin.getInstance()
				.getCustomItemProviderAdapterFactories(ID, true);
		List<AdapterFactory> negativePriorityFactories = FujabaCommonPlugin.getInstance()
				.getCustomItemProviderAdapterFactories(ID, false);

		// Custom Factories with positive priority
		factories.addAll(positivePriorityFactories);

		// Default Factories
		factories.add(new ComponentstorydiagramItemProviderAdapterFactory());
		factories.add(new ComponentstorypatternItemProviderAdapterFactory());
		factories.add(new CoreItemProviderAdapterFactory());
		factories.add(new ExpressionsItemProviderAdapterFactory());
		factories.add(new CommonExpressionsItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new PimItemProviderAdapterFactory());
		factories.add(new ConstraintItemProviderAdapterFactory());
		factories.add(new InstanceItemProviderAdapterFactory());
		factories.add(new ProtocolItemProviderAdapterFactory());
		factories.add(new RealtimestatechartItemProviderAdapterFactory());
		factories.add(
				new org.muml.pim.realtimestatechart.one_to_n_schemata.provider.One_to_n_schemataItemProviderAdapterFactory());
		factories.add(new MsgtypeItemProviderAdapterFactory());
		factories.add(new TypesItemProviderAdapterFactory());
		factories.add(new ConnectorItemProviderAdapterFactory());
		factories.add(new ValuetypeItemProviderAdapterFactory());
		factories.add(new BehaviorItemProviderAdapterFactory());
		factories.add(new ComponentItemProviderAdapterFactory());
		factories.add(new PatternItemProviderAdapterFactory());
		factories.add(new ReconfigurationItemProviderAdapterFactory());
		factories.add(new ExpressionItemProviderAdapterFactory());
		factories.add(new StructdatatypeItemProviderAdapterFactory());
		factories.add(new ProtocolinstantiationItemProviderAdapterFactory());
		factories.add(new org.muml.reconfiguration.reconfInstance.provider.ReconfInstanceItemProviderAdapterFactory());
		factories.add(new StorydiagramItemProviderAdapterFactory());
		factories.add(new ActivitiesItemProviderAdapterFactory());
		factories.add(new ActivitiesExpressionsItemProviderAdapterFactory());
		factories.add(new CallsItemProviderAdapterFactory());
		factories.add(new CallsExpressionsItemProviderAdapterFactory());
		factories.add(new PatternsItemProviderAdapterFactory());
		factories.add(new PatternsExpressionsItemProviderAdapterFactory());
		factories.add(new TemplatesItemProviderAdapterFactory());

		// Custom Factories with negative priority
		factories.addAll(negativePriorityFactories);
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * @generated
	 */
	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(labelProvider.getImage(item));
		}
		return null;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @generated
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute 
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @generated
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0),
					p.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @generated
	 * @param path the path
	 * @return image instance
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}

	/**
	 * Returns string from plug-in's resource bundle
	 *
	 * @generated
	 */
	public static String getString(String key) {
		return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public ComponentStoryDiagramDocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new ComponentStoryDiagramDocumentProvider();
		}
		return documentProvider;
	}

	/**
	 * @generated
	 */
	public ComponentStoryDiagramBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	* @generated
	*/
	public void setLinkConstraints(ComponentStoryDiagramBaseItemSemanticEditPolicy.LinkConstraints lc) {
		this.linkConstraints = lc;
	}

	/**
	 * @generated
	 */
	public ElementInitializers getElementInitializers() {
		return initializers;
	}

	/**
	* @generated
	*/
	public void setElementInitializers(ElementInitializers i) {
		this.initializers = i;
	}

	/**
	 * @generated
	 */
	public ComponentStoryDiagramOCLFactory getComponentStoryDiagramOCLFactory() {
		return oclFactory;
	}

	/**
	* @generated
	*/
	public void setComponentStoryDiagramOCLFactory(ComponentStoryDiagramOCLFactory f) {
		this.oclFactory = f;
	}

	/**
	 * @generated
	 */
	public void logError(String error) {
		getLogHelper().logError(error, null);
	}

	/**
	 * @generated
	 */
	public void logError(String error, Throwable throwable) {
		getLogHelper().logError(error, throwable);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message) {
		getLogHelper().logInfo(message, null);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message, Throwable throwable) {
		getLogHelper().logInfo(message, throwable);
	}

	/**
	 * @generated
	 */
	public LogHelper getLogHelper() {
		return myLogHelper;
	}
}
