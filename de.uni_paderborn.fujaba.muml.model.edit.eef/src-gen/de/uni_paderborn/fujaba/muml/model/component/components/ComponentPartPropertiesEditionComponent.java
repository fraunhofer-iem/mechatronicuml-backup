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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
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
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentPartPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ComponentPartPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for componentType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings componentTypeSettings;
	
	/**
	 * Settings for parentComponent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentComponentSettings;
	
	/**
	 * Settings for fromRev ReferencesTable
	 */
	private	ReferencesTableSettings fromRevSettings;
	
	/**
	 * Settings for toRev ReferencesTable
	 */
	private	ReferencesTableSettings toRevSettings;
	
	/**
	 * Settings for delegation ReferencesTable
	 */
	private	ReferencesTableSettings delegationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ComponentPartPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject componentPart, String editing_mode) {
		super(editingContext, componentPart, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.ComponentPart.class;
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
			final ComponentPart componentPart = (ComponentPart)elt;
			final ComponentPartPropertiesEditionPart basePart = (ComponentPartPropertiesEditionPart)editingPart;
			// init values
			if (componentPart.getComment() != null && isAccessible(ComponentViewsRepository.ComponentPart.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), componentPart.getComment()));
			
			if (isAccessible(ComponentViewsRepository.ComponentPart.Properties.componentType)) {
				// init part
				componentTypeSettings = new EObjectFlatComboSettings(componentPart, ComponentPackage.eINSTANCE.getComponentPart_ComponentType());
				basePart.initComponentType(componentTypeSettings);
				// set the button mode
				basePart.setComponentTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.ComponentPart.Properties.parentComponent)) {
				// init part
				parentComponentSettings = new EObjectFlatComboSettings(componentPart, ComponentPackage.eINSTANCE.getComponentPart_ParentComponent());
				basePart.initParentComponent(parentComponentSettings);
				// set the button mode
				basePart.setParentComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.ComponentPart.Properties.fromRev)) {
				fromRevSettings = new ReferencesTableSettings(componentPart, ComponentPackage.eINSTANCE.getComponentPart_FromRev());
				basePart.initFromRev(fromRevSettings);
			}
			if (isAccessible(ComponentViewsRepository.ComponentPart.Properties.toRev)) {
				toRevSettings = new ReferencesTableSettings(componentPart, ComponentPackage.eINSTANCE.getComponentPart_ToRev());
				basePart.initToRev(toRevSettings);
			}
			if (isAccessible(ComponentViewsRepository.ComponentPart.Properties.delegation)) {
				delegationSettings = new ReferencesTableSettings(componentPart, ComponentPackage.eINSTANCE.getComponentPart_Delegation());
				basePart.initDelegation(delegationSettings);
			}
			// init filters
			
			basePart.addFilterToComponentType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Component);
				}
			
			});
			// Start of user code for additional businessfilters for componentType
			// End of user code
			
			basePart.addFilterToParentComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof StructuredComponent);
				}
			
			});
			// Start of user code for additional businessfilters for parentComponent
			// End of user code
			
			basePart.addFilterToFromRev(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInFromRevTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToFromRev(new EObjectFilter(ComponentPackage.eINSTANCE.getAssembly()));
			// Start of user code for additional businessfilters for fromRev
			// End of user code
			
			basePart.addFilterToToRev(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInToRevTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToToRev(new EObjectFilter(ComponentPackage.eINSTANCE.getAssembly()));
			// Start of user code for additional businessfilters for toRev
			// End of user code
			
			basePart.addFilterToDelegation(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDelegationTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDelegation(new EObjectFilter(ComponentPackage.eINSTANCE.getDelegation()));
			// Start of user code for additional businessfilters for delegation
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
		if (editorKey == ComponentViewsRepository.ComponentPart.Properties.comment) {
			return CorePackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ComponentViewsRepository.ComponentPart.Properties.componentType) {
			return ComponentPackage.eINSTANCE.getComponentPart_ComponentType();
		}
		if (editorKey == ComponentViewsRepository.ComponentPart.Properties.parentComponent) {
			return ComponentPackage.eINSTANCE.getComponentPart_ParentComponent();
		}
		if (editorKey == ComponentViewsRepository.ComponentPart.Properties.fromRev) {
			return ComponentPackage.eINSTANCE.getComponentPart_FromRev();
		}
		if (editorKey == ComponentViewsRepository.ComponentPart.Properties.toRev) {
			return ComponentPackage.eINSTANCE.getComponentPart_ToRev();
		}
		if (editorKey == ComponentViewsRepository.ComponentPart.Properties.delegation) {
			return ComponentPackage.eINSTANCE.getComponentPart_Delegation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ComponentPart componentPart = (ComponentPart)semanticObject;
		if (ComponentViewsRepository.ComponentPart.Properties.comment == event.getAffectedEditor()) {
			componentPart.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.ComponentPart.Properties.componentType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				componentTypeSettings.setToReference((Component)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, componentTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.ComponentPart.Properties.parentComponent == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.ComponentPart.Properties.fromRev == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Assembly) {
					fromRevSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				fromRevSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				fromRevSettings.move(event.getNewIndex(), (Assembly) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.ComponentPart.Properties.toRev == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Assembly) {
					toRevSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				toRevSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				toRevSettings.move(event.getNewIndex(), (Assembly) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.ComponentPart.Properties.delegation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Delegation) {
					delegationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				delegationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				delegationSettings.move(event.getNewIndex(), (Delegation) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ComponentPartPropertiesEditionPart basePart = (ComponentPartPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ComponentPart.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ComponentPackage.eINSTANCE.getComponentPart_ComponentType().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ComponentPart.Properties.componentType))
				basePart.setComponentType((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getComponentPart_ParentComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ComponentPart.Properties.parentComponent))
				basePart.setParentComponent((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getComponentPart_FromRev().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.ComponentPart.Properties.fromRev))
				basePart.updateFromRev();
			if (ComponentPackage.eINSTANCE.getComponentPart_ToRev().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.ComponentPart.Properties.toRev))
				basePart.updateToRev();
			if (ComponentPackage.eINSTANCE.getComponentPart_Delegation().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.ComponentPart.Properties.delegation))
				basePart.updateDelegation();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.ComponentPart.Properties.componentType || key == ComponentViewsRepository.ComponentPart.Properties.parentComponent;
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
				if (ComponentViewsRepository.ComponentPart.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
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
