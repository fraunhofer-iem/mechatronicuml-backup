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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentFactory;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;


// End of user code

/**
 * 
 * 
 */
public class HardwareNodePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for deployment EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings deploymentSettings;
	
	/**
	 * Settings for deployedInstances ReferencesTable
	 */
	private	ReferencesTableSettings deployedInstancesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwareNodePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareNode, String editing_mode) {
		super(editingContext, hardwareNode, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DeploymentViewsRepository.class;
		partKey = DeploymentViewsRepository.HardwareNode.class;
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
			final HardwareNode hardwareNode = (HardwareNode)elt;
			final HardwareNodePropertiesEditionPart basePart = (HardwareNodePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DeploymentViewsRepository.HardwareNode.Properties.deployment_)) {
				// init part
				deploymentSettings = new EObjectFlatComboSettings(hardwareNode, DeploymentPackage.eINSTANCE.getHardwareNode_Deployment());
				basePart.initDeployment(deploymentSettings);
				// set the button mode
				basePart.setDeploymentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DeploymentViewsRepository.HardwareNode.Properties.deployedInstances)) {
				deployedInstancesSettings = new ReferencesTableSettings(hardwareNode, DeploymentPackage.eINSTANCE.getHardwareNode_DeployedInstances());
				basePart.initDeployedInstances(deployedInstancesSettings);
			}
			// init filters
			basePart.addFilterToDeployment(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Deployment);
				}
			
			});
			// Start of user code for additional businessfilters for deployment
			// End of user code
			
			basePart.addFilterToDeployedInstances(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDeployedInstancesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDeployedInstances(new EObjectFilter(InstancePackage.eINSTANCE.getComponentInstance()));
			// Start of user code for additional businessfilters for deployedInstances
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
		if (editorKey == DeploymentViewsRepository.HardwareNode.Properties.deployment_) {
			return DeploymentPackage.eINSTANCE.getHardwareNode_Deployment();
		}
		if (editorKey == DeploymentViewsRepository.HardwareNode.Properties.deployedInstances) {
			return DeploymentPackage.eINSTANCE.getHardwareNode_DeployedInstances();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareNode hardwareNode = (HardwareNode)semanticObject;
		if (DeploymentViewsRepository.HardwareNode.Properties.deployment_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				deploymentSettings.setToReference((Deployment)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Deployment eObject = DeploymentFactory.eINSTANCE.createDeployment();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				deploymentSettings.setToReference(eObject);
			}
		}
		if (DeploymentViewsRepository.HardwareNode.Properties.deployedInstances == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ComponentInstance) {
					deployedInstancesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				deployedInstancesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				deployedInstancesSettings.move(event.getNewIndex(), (ComponentInstance) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			HardwareNodePropertiesEditionPart basePart = (HardwareNodePropertiesEditionPart)editingPart;
			if (DeploymentPackage.eINSTANCE.getHardwareNode_Deployment().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.HardwareNode.Properties.deployment_))
				basePart.setDeployment((EObject)msg.getNewValue());
			if (DeploymentPackage.eINSTANCE.getHardwareNode_DeployedInstances().equals(msg.getFeature())  && isAccessible(DeploymentViewsRepository.HardwareNode.Properties.deployedInstances))
				basePart.updateDeployedInstances();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == DeploymentViewsRepository.HardwareNode.Properties.deployment_;
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
