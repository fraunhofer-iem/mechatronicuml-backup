package pattern.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
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
import org.osgi.framework.BundleContext;
import org.storydriven.core.expressions.common.provider.CommonExpressionsItemProviderAdapterFactory;
import org.storydriven.core.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.core.provider.CoreItemProviderAdapterFactory;

import pattern.diagram.edit.policies.Pattern2BaseItemSemanticEditPolicy;
import pattern.diagram.expressions.Pattern2OCLFactory;
import pattern.diagram.providers.ElementInitializers;
import pattern.provider.PatternItemProviderAdapterFactory;

/**
 * @generated
 */
public class Pattern2DiagramEditorPlugin extends AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String ID = "de.uni_paderborn.fujaba.muml.coordinationpattern.diagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private LogHelper myLogHelper;

	/**
	 * @generated
	 */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(
			ID);

	/**
	 * @generated
	 */
	private static Pattern2DiagramEditorPlugin instance;

	/**
	 * @generated
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	private Pattern2DocumentProvider documentProvider;

	/**
	 * @generated
	 */
	private Pattern2BaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/**
	 * @generated
	 */
	private ElementInitializers initializers;

	/**
	 * @generated
	 */
	private Pattern2OCLFactory oclFactory;

	/**
	 * @generated
	 */
	public Pattern2DiagramEditorPlugin() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		myLogHelper = new LogHelper(this);
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT,
				getPreferenceStore());
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
	public static Pattern2DiagramEditorPlugin getInstance() {
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
		List<AdapterFactory> positivePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
				.getInstance().getCustomItemProviderAdapterFactories(ID, true);
		List<AdapterFactory> negativePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
				.getInstance().getCustomItemProviderAdapterFactories(ID, false);

		// Custom Factories with positive priority
		factories.addAll(positivePriorityFactories);

		// Default Factories
		factories.add(new PatternItemProviderAdapterFactory());
		factories.add(new CoreItemProviderAdapterFactory());
		factories.add(new ExpressionsItemProviderAdapterFactory());
		factories.add(new CommonExpressionsItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.modelinstance.provider.ModelinstanceItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.component.provider.ComponentItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.constraint.provider.ConstraintItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.instance.provider.InstanceItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.protocol.provider.ProtocolItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.msgtype.provider.MsgtypeItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.types.provider.TypesItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.connector.provider.ConnectorItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.valuetype.provider.ValuetypeItemProviderAdapterFactory());
		factories
				.add(new de.uni_paderborn.fujaba.muml.behavior.provider.BehaviorItemProviderAdapterFactory());

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
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(item));
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
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p
					.removeFirstSegments(1).makeAbsolute().toString());
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
	public Pattern2DocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new Pattern2DocumentProvider();
		}
		return documentProvider;
	}

	/**
	 * @generated
	 */
	public Pattern2BaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	 * @generated
	 */
	public void setLinkConstraints(
			Pattern2BaseItemSemanticEditPolicy.LinkConstraints lc) {
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
	public Pattern2OCLFactory getPattern2OCLFactory() {
		return oclFactory;
	}

	/**
	 * @generated
	 */
	public void setPattern2OCLFactory(Pattern2OCLFactory f) {
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
