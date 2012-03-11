/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;


// End of user code

/**
 * 
 * 
 */
public class DeploymentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for componentInstanceConfiguration EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings componentInstanceConfigurationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DeploymentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deployment, String editing_mode) {
		super(editingContext, deployment, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DeploymentViewsRepository.class;
		partKey = DeploymentViewsRepository.Deployment_.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Deployment deployment = (Deployment)elt;
			final DeploymentPropertiesEditionPart basePart = (DeploymentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration)) {
				// init part
				componentInstanceConfigurationSettings = new EObjectFlatComboSettings(deployment, DeploymentPackage.eINSTANCE.getDeployment_ComponentInstanceConfiguration());
				basePart.initComponentInstanceConfiguration(componentInstanceConfigurationSettings);
				// set the button mode
				basePart.setComponentInstanceConfigurationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToComponentInstanceConfiguration(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ComponentInstanceConfiguration); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for componentInstanceConfiguration
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration) {
			return DeploymentPackage.eINSTANCE.getDeployment_ComponentInstanceConfiguration();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Deployment deployment = (Deployment)semanticObject;
		if (DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				componentInstanceConfigurationSettings.setToReference((ComponentInstanceConfiguration)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ComponentInstanceConfiguration eObject = InstanceFactory.eINSTANCE.createComponentInstanceConfiguration();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				componentInstanceConfigurationSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DeploymentPropertiesEditionPart basePart = (DeploymentPropertiesEditionPart)editingPart;
			if (DeploymentPackage.eINSTANCE.getDeployment_ComponentInstanceConfiguration().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration))
				basePart.setComponentInstanceConfiguration((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
