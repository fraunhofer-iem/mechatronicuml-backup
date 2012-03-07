/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.PatternViewsRepository;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class RoleConnectorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for behavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings behaviorSettings;
	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	/**
	 * Settings for coordinationPattern EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings coordinationPatternSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RoleConnectorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject roleConnector, String editing_mode) {
		super(editingContext, roleConnector, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternViewsRepository.class;
		partKey = PatternViewsRepository.RoleConnector.class;
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
			final RoleConnector roleConnector = (RoleConnector)elt;
			final RoleConnectorPropertiesEditionPart basePart = (RoleConnectorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(PatternViewsRepository.RoleConnector.Properties.behavior)) {
				// init part
				behaviorSettings = new EObjectFlatComboSettings(roleConnector, CorePackage.eINSTANCE.getBehavioralElement_Behavior());
				basePart.initBehavior(behaviorSettings);
				// set the button mode
				basePart.setBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.RoleConnector.Properties.bidirectional)) {
				basePart.setBidirectional(roleConnector.isBidirectional());
			}
			if (isAccessible(PatternViewsRepository.RoleConnector.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(roleConnector, PatternPackage.eINSTANCE.getRoleConnector_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.RoleConnector.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(roleConnector, PatternPackage.eINSTANCE.getRoleConnector_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.RoleConnector.Properties.coordinationPattern)) {
				// init part
				coordinationPatternSettings = new EObjectFlatComboSettings(roleConnector, PatternPackage.eINSTANCE.getRoleConnector_CoordinationPattern());
				basePart.initCoordinationPattern(coordinationPatternSettings);
				// set the button mode
				basePart.setCoordinationPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
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
			
			
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Role);
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
				return (element instanceof Role);
				}
			
			});
			// Start of user code for additional businessfilters for target
			// End of user code
			
			basePart.addFilterToCoordinationPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof CoordinationPattern);
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
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == PatternViewsRepository.RoleConnector.Properties.behavior) {
			return CorePackage.eINSTANCE.getBehavioralElement_Behavior();
		}
		if (editorKey == PatternViewsRepository.RoleConnector.Properties.bidirectional) {
			return PatternPackage.eINSTANCE.getRoleConnector_Bidirectional();
		}
		if (editorKey == PatternViewsRepository.RoleConnector.Properties.source) {
			return PatternPackage.eINSTANCE.getRoleConnector_Source();
		}
		if (editorKey == PatternViewsRepository.RoleConnector.Properties.target) {
			return PatternPackage.eINSTANCE.getRoleConnector_Target();
		}
		if (editorKey == PatternViewsRepository.RoleConnector.Properties.coordinationPattern) {
			return PatternPackage.eINSTANCE.getRoleConnector_CoordinationPattern();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RoleConnector roleConnector = (RoleConnector)semanticObject;
		if (PatternViewsRepository.RoleConnector.Properties.behavior == event.getAffectedEditor()) {
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
		if (PatternViewsRepository.RoleConnector.Properties.bidirectional == event.getAffectedEditor()) {
			roleConnector.setBidirectional((Boolean)event.getNewValue());
		}
		if (PatternViewsRepository.RoleConnector.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((Role)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Role eObject = PatternFactory.eINSTANCE.createRole();
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
		if (PatternViewsRepository.RoleConnector.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((Role)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Role eObject = PatternFactory.eINSTANCE.createRole();
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
		if (PatternViewsRepository.RoleConnector.Properties.coordinationPattern == event.getAffectedEditor()) {
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
			RoleConnectorPropertiesEditionPart basePart = (RoleConnectorPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getBehavioralElement_Behavior().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.RoleConnector.Properties.behavior))
				basePart.setBehavior((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRoleConnector_Bidirectional().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.RoleConnector.Properties.bidirectional))
				basePart.setBidirectional((Boolean)msg.getNewValue());
			
			if (PatternPackage.eINSTANCE.getRoleConnector_Source().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.RoleConnector.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRoleConnector_Target().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.RoleConnector.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRoleConnector_CoordinationPattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.RoleConnector.Properties.coordinationPattern))
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
		return key == PatternViewsRepository.RoleConnector.Properties.source || key == PatternViewsRepository.RoleConnector.Properties.target || key == PatternViewsRepository.RoleConnector.Properties.coordinationPattern;
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
				if (PatternViewsRepository.RoleConnector.Properties.bidirectional == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternPackage.eINSTANCE.getRoleConnector_Bidirectional().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternPackage.eINSTANCE.getRoleConnector_Bidirectional().getEAttributeType(), newValue);
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
