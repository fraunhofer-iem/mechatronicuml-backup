/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;

import de.uni_paderborn.fujaba.muml.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.model.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;


// End of user code

/**
 * 
 * 
 */
public class AtomicComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for referencingComponentParts ReferencesTable
	 */
	private	ReferencesTableSettings referencingComponentPartsSettings;
	
	/**
	 * Settings for behavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings behaviorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AtomicComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject atomicComponent, String editing_mode) {
		super(editingContext, atomicComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.AtomicComponent.class;
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
			final AtomicComponent atomicComponent = (AtomicComponent)elt;
			final AtomicComponentPropertiesEditionPart basePart = (AtomicComponentPropertiesEditionPart)editingPart;
			// init values
			if (atomicComponent.getName() != null && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), atomicComponent.getName()));
			
			if (atomicComponent.getComment() != null && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), atomicComponent.getComment()));
			
			if (isAccessible(ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts)) {
				referencingComponentPartsSettings = new ReferencesTableSettings(atomicComponent, ComponentPackage.eINSTANCE.getComponent_ReferencingComponentParts());
				basePart.initReferencingComponentParts(referencingComponentPartsSettings);
			}
			if (isAccessible(ComponentViewsRepository.AtomicComponent.Properties.componentType)) {
				basePart.initComponentType((EEnum) ComponentPackage.eINSTANCE.getComponent_ComponentType().getEType(), atomicComponent.getComponentType());
			}
			if (isAccessible(ComponentViewsRepository.AtomicComponent.Properties.behavior)) {
				// init part
				behaviorSettings = new EObjectFlatComboSettings(atomicComponent, CorePackage.eINSTANCE.getBehavioralElement_Behavior());
				basePart.initBehavior(behaviorSettings);
				// set the button mode
				basePart.setBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			basePart.addFilterToReferencingComponentParts(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInReferencingComponentPartsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToReferencingComponentParts(new EObjectFilter(ComponentPackage.eINSTANCE.getComponentPart()));
			// Start of user code for additional businessfilters for referencingComponentParts
			// End of user code
			
			
			basePart.addFilterToBehavior(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Behavior); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for behavior
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
		if (editorKey == ComponentViewsRepository.AtomicComponent.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ComponentViewsRepository.AtomicComponent.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts) {
			return ComponentPackage.eINSTANCE.getComponent_ReferencingComponentParts();
		}
		if (editorKey == ComponentViewsRepository.AtomicComponent.Properties.componentType) {
			return ComponentPackage.eINSTANCE.getComponent_ComponentType();
		}
		if (editorKey == ComponentViewsRepository.AtomicComponent.Properties.behavior) {
			return CorePackage.eINSTANCE.getBehavioralElement_Behavior();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AtomicComponent atomicComponent = (AtomicComponent)semanticObject;
		if (ComponentViewsRepository.AtomicComponent.Properties.name == event.getAffectedEditor()) {
			atomicComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.AtomicComponent.Properties.comment == event.getAffectedEditor()) {
			atomicComponent.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ComponentPart) {
					referencingComponentPartsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				referencingComponentPartsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				referencingComponentPartsSettings.move(event.getNewIndex(), (ComponentPart) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.AtomicComponent.Properties.componentType == event.getAffectedEditor()) {
			atomicComponent.setComponentType((ComponentKind)event.getNewValue());
		}
		if (ComponentViewsRepository.AtomicComponent.Properties.behavior == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				behaviorSettings.setToReference((Behavior)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, behaviorSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AtomicComponentPropertiesEditionPart basePart = (AtomicComponentPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ComponentPackage.eINSTANCE.getComponent_ReferencingComponentParts().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts))
				basePart.updateReferencingComponentParts();
			if (ComponentPackage.eINSTANCE.getComponent_ComponentType().equals(msg.getFeature()) && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.componentType))
				basePart.setComponentType((Enumerator)msg.getNewValue());
			
			if (CorePackage.eINSTANCE.getBehavioralElement_Behavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.AtomicComponent.Properties.behavior))
				basePart.setBehavior((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.AtomicComponent.Properties.name;
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
				if (ComponentViewsRepository.AtomicComponent.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.AtomicComponent.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.AtomicComponent.Properties.componentType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ComponentPackage.eINSTANCE.getComponent_ComponentType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ComponentPackage.eINSTANCE.getComponent_ComponentType().getEAttributeType(), newValue);
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
