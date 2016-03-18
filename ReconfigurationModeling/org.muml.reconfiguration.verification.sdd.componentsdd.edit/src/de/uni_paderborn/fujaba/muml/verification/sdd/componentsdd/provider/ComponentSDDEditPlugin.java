/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.storydriven.core.provider.CoreEditPlugin;
import org.storydriven.storydiagrams.provider.StorydiagramsEditPlugin;

import de.uni_paderborn.fujaba.muml.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.componentstorypattern.provider.ComponentStoryPatternEditPlugin;
import de.uni_paderborn.fujaba.muml.reconfiguration.provider.MumlReconfigurationEditPlugin;
import de.uni_paderborn.fujaba.muml.verification.sdd.provider.SDDEditPlugin;

/**
 * This is the central singleton for the ComponentSDD edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ComponentSDDEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentSDDEditPlugin INSTANCE = new ComponentSDDEditPlugin();

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
	public ComponentSDDEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ComponentStoryPatternEditPlugin.INSTANCE,
		     CoreEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     MumlEditPlugin.INSTANCE,
		     MumlReconfigurationEditPlugin.INSTANCE,
		     SDDEditPlugin.INSTANCE,
		     StorydiagramsEditPlugin.INSTANCE,
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
