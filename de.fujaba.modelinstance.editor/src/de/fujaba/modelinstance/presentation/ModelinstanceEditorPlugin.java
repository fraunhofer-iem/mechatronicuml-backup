/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance.presentation;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import org.storydriven.modeling.activities.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.modeling.activities.provider.ActivitiesItemProviderAdapterFactory;
import org.storydriven.modeling.calls.provider.CallsItemProviderAdapterFactory;
import org.storydriven.modeling.patterns.provider.PatternsItemProviderAdapterFactory;
import org.storydriven.modeling.provider.SDMEditPlugin;
import org.storydriven.modeling.provider.SDMItemProviderAdapterFactory;
import org.storydriven.modeling.templates.provider.TemplatesItemProviderAdapterFactory;

import de.fujaba.modelinstance.provider.ModelinstanceItemProviderAdapterFactory;

/**
 * This is the central singleton for the Modelinstance editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ModelinstanceEditorPlugin extends EMFPlugin {
	
	public static final String ID = "de.fujaba.modelinstance.editor";
	
	public static ComposedAdapterFactory adapterFactory;
	
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelinstanceEditorPlugin INSTANCE = new ModelinstanceEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelinstanceEditorPlugin() {
		super
			(new ResourceLocator [] {
				EcoreEditPlugin.INSTANCE,
				SDMEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
