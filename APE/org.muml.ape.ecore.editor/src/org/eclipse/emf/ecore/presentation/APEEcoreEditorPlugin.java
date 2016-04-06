package org.eclipse.emf.ecore.presentation;


import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.presentation.inheritance.InheritanceMode;
import org.eclipse.jface.resource.ImageDescriptor;


/**
 * This is the central singleton for the improved Ecore editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class APEEcoreEditorPlugin extends EMFPlugin
{
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final APEEcoreEditorPlugin INSTANCE = new APEEcoreEditorPlugin();

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
  public APEEcoreEditorPlugin()
  {
    super
      (new ResourceLocator [] 
      {
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
  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin()
  {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipseUIPlugin
  {
    /**
     * Creates an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implementation()
    {
      super();
  
      // Remember the static instance.
      //
      plugin = this;
    }
  }
  
	public static ImageDescriptor getImageDescriptor(String path) {
		return Implementation.imageDescriptorFromPlugin(plugin.getSymbolicName(), path);
	}

	
	public static String getPreferencesValue(String id, String defaultValue) {
		String setting =  getPlugin().getDialogSettings().get(id);
		if (setting == null) {
			setting = defaultValue;
		}
		return setting;
	}

	public static void setPreferencesValue(String id, String value) {
		getPlugin().getDialogSettings().put(id, value);
	}
}
