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

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentFactory;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;


// End of user code

/**
 * 
 * 
 */
public class HardwarePortPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for hardwareNode EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings hardwareNodeSettings;
	
	/**
	 * Settings for outgoingCommunicationLink EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings outgoingCommunicationLinkSettings;
	
	/**
	 * Settings for incomingCommunicationLink EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings incomingCommunicationLinkSettings;
	
	/**
	 * Settings for deployedPortInstance ReferencesTable
	 */
	private	ReferencesTableSettings deployedPortInstanceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwarePortPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwarePort, String editing_mode) {
		super(editingContext, hardwarePort, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DeploymentViewsRepository.class;
		partKey = DeploymentViewsRepository.HardwarePort.class;
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
			final HardwarePort hardwarePort = (HardwarePort)elt;
			final HardwarePortPropertiesEditionPart basePart = (HardwarePortPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode)) {
				// init part
				hardwareNodeSettings = new EObjectFlatComboSettings(hardwarePort, DeploymentPackage.eINSTANCE.getHardwarePort_HardwareNode());
				basePart.initHardwareNode(hardwareNodeSettings);
				// set the button mode
				basePart.setHardwareNodeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink)) {
				// init part
				outgoingCommunicationLinkSettings = new EObjectFlatComboSettings(hardwarePort, DeploymentPackage.eINSTANCE.getHardwarePort_OutgoingCommunicationLink());
				basePart.initOutgoingCommunicationLink(outgoingCommunicationLinkSettings);
				// set the button mode
				basePart.setOutgoingCommunicationLinkButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink)) {
				// init part
				incomingCommunicationLinkSettings = new EObjectFlatComboSettings(hardwarePort, DeploymentPackage.eINSTANCE.getHardwarePort_IncomingCommunicationLink());
				basePart.initIncomingCommunicationLink(incomingCommunicationLinkSettings);
				// set the button mode
				basePart.setIncomingCommunicationLinkButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance)) {
				deployedPortInstanceSettings = new ReferencesTableSettings(hardwarePort, DeploymentPackage.eINSTANCE.getHardwarePort_DeployedPortInstance());
				basePart.initDeployedPortInstance(deployedPortInstanceSettings);
			}
			// init filters
			basePart.addFilterToHardwareNode(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof HardwareNode);
				}
			
			});
			// Start of user code for additional businessfilters for hardwareNode
			// End of user code
			
			basePart.addFilterToOutgoingCommunicationLink(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof CommunicationLink); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for outgoingCommunicationLink
			// End of user code
			
			basePart.addFilterToIncomingCommunicationLink(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof CommunicationLink);
				}
			
			});
			// Start of user code for additional businessfilters for incomingCommunicationLink
			// End of user code
			
			basePart.addFilterToDeployedPortInstance(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDeployedPortInstanceTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDeployedPortInstance(new EObjectFilter(InstancePackage.eINSTANCE.getPortInstance()));
			// Start of user code for additional businessfilters for deployedPortInstance
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
		if (editorKey == DeploymentViewsRepository.HardwarePort.Properties.hardwareNode) {
			return DeploymentPackage.eINSTANCE.getHardwarePort_HardwareNode();
		}
		if (editorKey == DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink) {
			return DeploymentPackage.eINSTANCE.getHardwarePort_OutgoingCommunicationLink();
		}
		if (editorKey == DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink) {
			return DeploymentPackage.eINSTANCE.getHardwarePort_IncomingCommunicationLink();
		}
		if (editorKey == DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance) {
			return DeploymentPackage.eINSTANCE.getHardwarePort_DeployedPortInstance();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwarePort hardwarePort = (HardwarePort)semanticObject;
		if (DeploymentViewsRepository.HardwarePort.Properties.hardwareNode == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				hardwareNodeSettings.setToReference((HardwareNode)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HardwareNode eObject = DeploymentFactory.eINSTANCE.createHardwareNode();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				hardwareNodeSettings.setToReference(eObject);
			}
		}
		if (DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				outgoingCommunicationLinkSettings.setToReference((CommunicationLink)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CommunicationLink eObject = DeploymentFactory.eINSTANCE.createCommunicationLink();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				outgoingCommunicationLinkSettings.setToReference(eObject);
			}
		}
		if (DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				incomingCommunicationLinkSettings.setToReference((CommunicationLink)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CommunicationLink eObject = DeploymentFactory.eINSTANCE.createCommunicationLink();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				incomingCommunicationLinkSettings.setToReference(eObject);
			}
		}
		if (DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PortInstance) {
					deployedPortInstanceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				deployedPortInstanceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				deployedPortInstanceSettings.move(event.getNewIndex(), (PortInstance) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			HardwarePortPropertiesEditionPart basePart = (HardwarePortPropertiesEditionPart)editingPart;
			if (DeploymentPackage.eINSTANCE.getHardwarePort_HardwareNode().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode))
				basePart.setHardwareNode((EObject)msg.getNewValue());
			if (DeploymentPackage.eINSTANCE.getHardwarePort_OutgoingCommunicationLink().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink))
				basePart.setOutgoingCommunicationLink((EObject)msg.getNewValue());
			if (DeploymentPackage.eINSTANCE.getHardwarePort_IncomingCommunicationLink().equals(msg.getFeature()) && basePart != null && isAccessible(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink))
				basePart.setIncomingCommunicationLink((EObject)msg.getNewValue());
			if (DeploymentPackage.eINSTANCE.getHardwarePort_DeployedPortInstance().equals(msg.getFeature())  && isAccessible(DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance))
				basePart.updateDeployedPortInstance();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == DeploymentViewsRepository.HardwarePort.Properties.hardwareNode || key == DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink;
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
