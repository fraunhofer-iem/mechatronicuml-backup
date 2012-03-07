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

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentFactory;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CommunicationLinkPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for deployment EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings deploymentSettings;
	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CommunicationLinkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject communicationLink, String editing_mode) {
		super(editingContext, communicationLink, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DeploymentViewsRepository.class;
		partKey = DeploymentViewsRepository.CommunicationLink.class;
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
			final CommunicationLink communicationLink = (CommunicationLink)elt;
			final CommunicationLinkPropertiesEditionPart basePart = (CommunicationLinkPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DeploymentViewsRepository.CommunicationLink.Properties.deployment_)) {
				// init part
				deploymentSettings = new EObjectFlatComboSettings(communicationLink, DeploymentPackage.eINSTANCE.getCommunicationLink_Deployment());
				basePart.initDeployment(deploymentSettings);
				// set the button mode
				basePart.setDeploymentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DeploymentViewsRepository.CommunicationLink.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(communicationLink, DeploymentPackage.eINSTANCE.getCommunicationLink_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DeploymentViewsRepository.CommunicationLink.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(communicationLink, DeploymentPackage.eINSTANCE.getCommunicationLink_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
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
			
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof HardwarePort);
				}
			
			});
			// Start of user code for additional businessfilters for source
			// End of user code
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof HardwarePort);
				}
			
			});
			// Start of user code for additional businessfilters for target
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
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == DeploymentViewsRepository.CommunicationLink.Properties.deployment_) {
			return DeploymentPackage.eINSTANCE.getCommunicationLink_Deployment();
		}
		if (editorKey == DeploymentViewsRepository.CommunicationLink.Properties.source) {
			return DeploymentPackage.eINSTANCE.getCommunicationLink_Source();
		}
		if (editorKey == DeploymentViewsRepository.CommunicationLink.Properties.target) {
			return DeploymentPackage.eINSTANCE.getCommunicationLink_Target();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CommunicationLink communicationLink = (CommunicationLink)semanticObject;
		if (DeploymentViewsRepository.CommunicationLink.Properties.deployment_ == event.getAffectedEditor()) {
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
		if (DeploymentViewsRepository.CommunicationLink.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((HardwarePort)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HardwarePort eObject = DeploymentFactory.eINSTANCE.createHardwarePort();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sourceSettings.setToReference(eObject);
			}
		}
		if (DeploymentViewsRepository.CommunicationLink.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((HardwarePort)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HardwarePort eObject = DeploymentFactory.eINSTANCE.createHardwarePort();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				targetSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CommunicationLinkPropertiesEditionPart basePart = (CommunicationLinkPropertiesEditionPart)editingPart;
			if (DeploymentPackage.eINSTANCE.getCommunicationLink_Deployment().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.CommunicationLink.Properties.deployment_))
				basePart.setDeployment((EObject)msg.getNewValue());
			if (DeploymentPackage.eINSTANCE.getCommunicationLink_Source().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.CommunicationLink.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (DeploymentPackage.eINSTANCE.getCommunicationLink_Target().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.CommunicationLink.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == DeploymentViewsRepository.CommunicationLink.Properties.deployment_ || key == DeploymentViewsRepository.CommunicationLink.Properties.source || key == DeploymentViewsRepository.CommunicationLink.Properties.target;
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
