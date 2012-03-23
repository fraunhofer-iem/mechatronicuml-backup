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

import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;


// End of user code

/**
 * 
 * 
 */
public class AssemblyPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for behavior EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings behaviorSettings;
	
	/**
	 * Settings for to EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings toSettings;
	
	/**
	 * Settings for from EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings fromSettings;
	
	/**
	 * Settings for coordinationPattern EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings coordinationPatternSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AssemblyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assembly, String editing_mode) {
		super(editingContext, assembly, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.Assembly.class;
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
			final Assembly assembly = (Assembly)elt;
			final AssemblyPropertiesEditionPart basePart = (AssemblyPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.fromPort)) {
				// init part
				fromPortSettings = new EObjectFlatComboSettings(assembly, ComponentPackage.eINSTANCE.getConnectorType_FromPort());
				basePart.initFromPort(fromPortSettings);
				// set the button mode
				basePart.setFromPortButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.toPort)) {
				// init part
				toPortSettings = new EObjectFlatComboSettings(assembly, ComponentPackage.eINSTANCE.getConnectorType_ToPort());
				basePart.initToPort(toPortSettings);
				// set the button mode
				basePart.setToPortButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.parentComponent)) {
				// init part
				parentComponentSettings = new EObjectFlatComboSettings(assembly, ComponentPackage.eINSTANCE.getConnectorType_ParentComponent());
				basePart.initParentComponent(parentComponentSettings);
				// set the button mode
				basePart.setParentComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.behavior)) {
				// init part
				behaviorSettings = new EObjectFlatComboSettings(assembly, CorePackage.eINSTANCE.getBehavioralElement_Behavior());
				basePart.initBehavior(behaviorSettings);
				// set the button mode
				basePart.setBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.to)) {
				// init part
				toSettings = new EObjectFlatComboSettings(assembly, ComponentPackage.eINSTANCE.getAssembly_To());
				basePart.initTo(toSettings);
				// set the button mode
				basePart.setToButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.from)) {
				// init part
				fromSettings = new EObjectFlatComboSettings(assembly, ComponentPackage.eINSTANCE.getAssembly_From());
				basePart.initFrom(fromSettings);
				// set the button mode
				basePart.setFromButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.Assembly.Properties.coordinationPattern)) {
				// init part
				coordinationPatternSettings = new EObjectFlatComboSettings(assembly, ComponentPackage.eINSTANCE.getAssembly_CoordinationPattern());
				basePart.initCoordinationPattern(coordinationPatternSettings);
				// set the button mode
				basePart.setCoordinationPatternButtonMode(ButtonsModeEnum.BROWSE);
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
			
			basePart.addFilterToTo(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ComponentPart);
				}
			
			});
			// Start of user code for additional businessfilters for to
			// End of user code
			
			basePart.addFilterToFrom(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ComponentPart);
				}
			
			});
			// Start of user code for additional businessfilters for from
			// End of user code
			
			basePart.addFilterToCoordinationPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof CoordinationPattern); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for coordinationPattern
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
		if (editorKey == ComponentViewsRepository.Assembly.Properties.fromPort) {
			return ComponentPackage.eINSTANCE.getConnectorType_FromPort();
		}
		if (editorKey == ComponentViewsRepository.Assembly.Properties.toPort) {
			return ComponentPackage.eINSTANCE.getConnectorType_ToPort();
		}
		if (editorKey == ComponentViewsRepository.Assembly.Properties.parentComponent) {
			return ComponentPackage.eINSTANCE.getConnectorType_ParentComponent();
		}
		if (editorKey == ComponentViewsRepository.Assembly.Properties.behavior) {
			return CorePackage.eINSTANCE.getBehavioralElement_Behavior();
		}
		if (editorKey == ComponentViewsRepository.Assembly.Properties.to) {
			return ComponentPackage.eINSTANCE.getAssembly_To();
		}
		if (editorKey == ComponentViewsRepository.Assembly.Properties.from) {
			return ComponentPackage.eINSTANCE.getAssembly_From();
		}
		if (editorKey == ComponentViewsRepository.Assembly.Properties.coordinationPattern) {
			return ComponentPackage.eINSTANCE.getAssembly_CoordinationPattern();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Assembly assembly = (Assembly)semanticObject;
		if (ComponentViewsRepository.Assembly.Properties.fromPort == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.Assembly.Properties.toPort == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.Assembly.Properties.parentComponent == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.Assembly.Properties.behavior == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.Assembly.Properties.to == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				toSettings.setToReference((ComponentPart)event.getNewValue());
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
				toSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.Assembly.Properties.from == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fromSettings.setToReference((ComponentPart)event.getNewValue());
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
				fromSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.Assembly.Properties.coordinationPattern == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				coordinationPatternSettings.setToReference((CoordinationPattern)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CoordinationPattern eObject = PatternFactory.eINSTANCE.createCoordinationPattern();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				coordinationPatternSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			AssemblyPropertiesEditionPart basePart = (AssemblyPropertiesEditionPart)editingPart;
			if (ComponentPackage.eINSTANCE.getConnectorType_FromPort().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.fromPort))
				basePart.setFromPort((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getConnectorType_ToPort().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.toPort))
				basePart.setToPort((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getConnectorType_ParentComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.parentComponent))
				basePart.setParentComponent((EObject)msg.getNewValue());
			if (CorePackage.eINSTANCE.getBehavioralElement_Behavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.behavior))
				basePart.setBehavior((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getAssembly_To().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.to))
				basePart.setTo((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getAssembly_From().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.from))
				basePart.setFrom((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getAssembly_CoordinationPattern().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.Assembly.Properties.coordinationPattern))
				basePart.setCoordinationPattern((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.Assembly.Properties.fromPort || key == ComponentViewsRepository.Assembly.Properties.toPort || key == ComponentViewsRepository.Assembly.Properties.to || key == ComponentViewsRepository.Assembly.Properties.from;
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
