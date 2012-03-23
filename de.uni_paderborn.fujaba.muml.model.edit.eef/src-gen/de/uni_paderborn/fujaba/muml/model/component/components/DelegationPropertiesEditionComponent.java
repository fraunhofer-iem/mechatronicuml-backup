/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.components;

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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class DelegationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for fromPort EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fromPortSettings;
	
	/**
	 * Settings for toPort EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings toPortSettings;
	
	/**
	 * Settings for parentComponent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentComponentSettings;
	
	/**
	 * Settings for componentPart EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings componentPartSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DelegationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject delegation, String editing_mode) {
		super(editingContext, delegation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.Delegation.class;
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
			final Delegation delegation = (Delegation)elt;
			final DelegationPropertiesEditionPart basePart = (DelegationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ComponentViewsRepository.Delegation.Properties.fromPort)) {
				// init part
				fromPortSettings = new EObjectFlatComboSettings(delegation, ComponentPackage.eINSTANCE.getConnectorType_FromPort());
				basePart.initFromPort(fromPortSettings);
				// set the button mode
				basePart.setFromPortButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Delegation.Properties.toPort)) {
				// init part
				toPortSettings = new EObjectFlatComboSettings(delegation, ComponentPackage.eINSTANCE.getConnectorType_ToPort());
				basePart.initToPort(toPortSettings);
				// set the button mode
				basePart.setToPortButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Delegation.Properties.parentComponent)) {
				// init part
				parentComponentSettings = new EObjectFlatComboSettings(delegation, ComponentPackage.eINSTANCE.getConnectorType_ParentComponent());
				basePart.initParentComponent(parentComponentSettings);
				// set the button mode
				basePart.setParentComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Delegation.Properties.componentPart)) {
				// init part
				componentPartSettings = new EObjectFlatComboSettings(delegation, ComponentPackage.eINSTANCE.getDelegation_ComponentPart());
				basePart.initComponentPart(componentPartSettings);
				// set the button mode
				basePart.setComponentPartButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToFromPort(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Port);
				}
			
			});
			// Start of user code for additional businessfilters for fromPort
			// End of user code
			
			basePart.addFilterToToPort(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Port);
				}
			
			});
			// Start of user code for additional businessfilters for toPort
			// End of user code
			
			basePart.addFilterToParentComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof StructuredComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for parentComponent
			// End of user code
			
			basePart.addFilterToComponentPart(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ComponentPart);
				}
			
			});
			// Start of user code for additional businessfilters for componentPart
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
		if (editorKey == ComponentViewsRepository.Delegation.Properties.fromPort) {
			return ComponentPackage.eINSTANCE.getConnectorType_FromPort();
		}
		if (editorKey == ComponentViewsRepository.Delegation.Properties.toPort) {
			return ComponentPackage.eINSTANCE.getConnectorType_ToPort();
		}
		if (editorKey == ComponentViewsRepository.Delegation.Properties.parentComponent) {
			return ComponentPackage.eINSTANCE.getConnectorType_ParentComponent();
		}
		if (editorKey == ComponentViewsRepository.Delegation.Properties.componentPart) {
			return ComponentPackage.eINSTANCE.getDelegation_ComponentPart();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Delegation delegation = (Delegation)semanticObject;
		if (ComponentViewsRepository.Delegation.Properties.fromPort == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fromPortSettings.setToReference((Port)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, fromPortSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.Delegation.Properties.toPort == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				toPortSettings.setToReference((Port)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, toPortSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.Delegation.Properties.parentComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parentComponentSettings.setToReference((StructuredComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				StructuredComponent eObject = ComponentFactory.eINSTANCE.createStructuredComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parentComponentSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.Delegation.Properties.componentPart == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				componentPartSettings.setToReference((ComponentPart)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ComponentPart eObject = ComponentFactory.eINSTANCE.createComponentPart();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				componentPartSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DelegationPropertiesEditionPart basePart = (DelegationPropertiesEditionPart)editingPart;
			if (ComponentPackage.eINSTANCE.getConnectorType_FromPort().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Delegation.Properties.fromPort))
				basePart.setFromPort((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getConnectorType_ToPort().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Delegation.Properties.toPort))
				basePart.setToPort((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getConnectorType_ParentComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Delegation.Properties.parentComponent))
				basePart.setParentComponent((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDelegation_ComponentPart().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Delegation.Properties.componentPart))
				basePart.setComponentPart((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.Delegation.Properties.fromPort || key == ComponentViewsRepository.Delegation.Properties.toPort || key == ComponentViewsRepository.Delegation.Properties.componentPart;
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
