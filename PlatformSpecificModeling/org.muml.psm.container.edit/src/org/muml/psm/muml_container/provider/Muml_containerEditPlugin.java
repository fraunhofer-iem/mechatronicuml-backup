/**
 */
package org.muml.psm.muml_container.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.muml.core.provider.CoreEditPlugin;

import org.muml.pim.actionlanguage.provider.ActionlanguageEditPlugin;

import org.muml.pim.provider.MumlEditPlugin;

import org.muml.pm.hardware.hwplatform.provider.HardwareEditPlugin;

import org.muml.pm.software.provider.SoftwareEditPlugin;

import org.muml.psm.provider.PsmEditPlugin;

import org.opendds.modeling.model.opendds.provider.OpenDDSEditPlugin;

/**
 * This is the central singleton for the Muml_container edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Muml_containerEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Muml_containerEditPlugin INSTANCE = new Muml_containerEditPlugin();

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
	public Muml_containerEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ActionlanguageEditPlugin.INSTANCE,
		     CoreEditPlugin.INSTANCE,
		     HardwareEditPlugin.INSTANCE,
		     MumlEditPlugin.INSTANCE,
		     OpenDDSEditPlugin.INSTANCE,
		     PsmEditPlugin.INSTANCE,
		     SoftwareEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipsePlugin {
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
