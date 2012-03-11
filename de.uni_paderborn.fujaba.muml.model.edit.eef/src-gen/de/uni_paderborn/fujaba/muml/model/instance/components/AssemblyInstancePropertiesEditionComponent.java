/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class AssemblyInstancePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	/**
	 * Settings for connectorType EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings connectorTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AssemblyInstancePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assemblyInstance, String editing_mode) {
		super(editingContext, assemblyInstance, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = InstanceViewsRepository.class;
		partKey = InstanceViewsRepository.AssemblyInstance.class;
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
			final AssemblyInstance assemblyInstance = (AssemblyInstance)elt;
			final AssemblyInstancePropertiesEditionPart basePart = (AssemblyInstancePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(assemblyInstance, InstancePackage.eINSTANCE.getConnectorInstance_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(assemblyInstance, InstancePackage.eINSTANCE.getConnectorInstance_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.connectorType)) {
				// init part
				connectorTypeSettings = new EObjectFlatComboSettings(assemblyInstance, InstancePackage.eINSTANCE.getConnectorInstance_ConnectorType());
				basePart.initConnectorType(connectorTypeSettings);
				// set the button mode
				basePart.setConnectorTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound)) {
				basePart.setPropagationDelayLowerBound(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), assemblyInstance.getPropagationDelayLowerBound()));
			}
			
			if (isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound)) {
				basePart.setPropagationDelayUpperBound(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), assemblyInstance.getPropagationDelayUpperBound()));
			}
			
			// init filters
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof PortInstance);
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
				return (element instanceof PortInstance);
				}
			
			});
			// Start of user code for additional businessfilters for target
			// End of user code
			
			basePart.addFilterToConnectorType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ConnectorType); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for connectorType
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
		if (editorKey == InstanceViewsRepository.AssemblyInstance.Properties.source) {
			return InstancePackage.eINSTANCE.getConnectorInstance_Source();
		}
		if (editorKey == InstanceViewsRepository.AssemblyInstance.Properties.target) {
			return InstancePackage.eINSTANCE.getConnectorInstance_Target();
		}
		if (editorKey == InstanceViewsRepository.AssemblyInstance.Properties.connectorType) {
			return InstancePackage.eINSTANCE.getConnectorInstance_ConnectorType();
		}
		if (editorKey == InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound) {
			return InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayLowerBound();
		}
		if (editorKey == InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound) {
			return InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayUpperBound();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AssemblyInstance assemblyInstance = (AssemblyInstance)semanticObject;
		if (InstanceViewsRepository.AssemblyInstance.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((PortInstance)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, sourceSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (InstanceViewsRepository.AssemblyInstance.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((PortInstance)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, targetSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (InstanceViewsRepository.AssemblyInstance.Properties.connectorType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				connectorTypeSettings.setToReference((ConnectorType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, connectorTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound == event.getAffectedEditor()) {
			assemblyInstance.setPropagationDelayLowerBound((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound == event.getAffectedEditor()) {
			assemblyInstance.setPropagationDelayUpperBound((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AssemblyInstancePropertiesEditionPart basePart = (AssemblyInstancePropertiesEditionPart)editingPart;
			if (InstancePackage.eINSTANCE.getConnectorInstance_Source().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (InstancePackage.eINSTANCE.getConnectorInstance_Target().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			if (InstancePackage.eINSTANCE.getConnectorInstance_ConnectorType().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.connectorType))
				basePart.setConnectorType((EObject)msg.getNewValue());
			if (InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayLowerBound().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound)) {
				if (msg.getNewValue() != null) {
					basePart.setPropagationDelayLowerBound(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPropagationDelayLowerBound("");
				}
			}
			if (InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayUpperBound().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound)) {
				if (msg.getNewValue() != null) {
					basePart.setPropagationDelayUpperBound(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPropagationDelayUpperBound("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == InstanceViewsRepository.AssemblyInstance.Properties.source || key == InstanceViewsRepository.AssemblyInstance.Properties.target;
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
				if (InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayLowerBound().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayLowerBound().getEAttributeType(), newValue);
				}
				if (InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayUpperBound().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(InstancePackage.eINSTANCE.getAssemblyInstance_PropagationDelayUpperBound().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
