/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.components;

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

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.TransitionEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TransitionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings targetSettings;
	
	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sourceSettings;
	
	/**
	 * Settings for statechart EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings statechartSettings;
	
	/**
	 * Settings for clockResets ReferencesTable
	 */
	private	ReferencesTableSettings clockResetsSettings;
	
	/**
	 * Settings for clockConstraints ReferencesTable
	 */
	protected ReferencesTableSettings clockConstraintsSettings;
	
	/**
	 * Settings for absoluteDeadlines ReferencesTable
	 */
	protected ReferencesTableSettings absoluteDeadlinesSettings;
	
	/**
	 * Settings for events ReferencesTable
	 */
	protected ReferencesTableSettings eventsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TransitionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject transition, String editing_mode) {
		super(editingContext, transition, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.Transition.class;
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
			final Transition transition = (Transition)elt;
			final TransitionPropertiesEditionPart basePart = (TransitionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.priority)) {
				basePart.setPriority(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), transition.getPriority()));
			}
			
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.target)) {
				// init part
				targetSettings = new EObjectFlatComboSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_Target());
				basePart.initTarget(targetSettings);
				// set the button mode
				basePart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.source)) {
				// init part
				sourceSettings = new EObjectFlatComboSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_Source());
				basePart.initSource(sourceSettings);
				// set the button mode
				basePart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.statechart)) {
				// init part
				statechartSettings = new EObjectFlatComboSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_Statechart());
				basePart.initStatechart(statechartSettings);
				// set the button mode
				basePart.setStatechartButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.clockResets)) {
				clockResetsSettings = new ReferencesTableSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_ClockResets());
				basePart.initClockResets(clockResetsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.clockConstraints)) {
				clockConstraintsSettings = new ReferencesTableSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_ClockConstraints());
				basePart.initClockConstraints(clockConstraintsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines)) {
				absoluteDeadlinesSettings = new ReferencesTableSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_AbsoluteDeadlines());
				basePart.initAbsoluteDeadlines(absoluteDeadlinesSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.blockable)) {
				basePart.setBlockable(transition.isBlockable());
			}
			if (isAccessible(RealtimestatechartViewsRepository.Transition.Properties.events)) {
				eventsSettings = new ReferencesTableSettings(transition, RealtimestatechartPackage.eINSTANCE.getTransition_Events());
				basePart.initEvents(eventsSettings);
			}
			// init filters
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Vertex);
				}
			
			});
			// Start of user code for additional businessfilters for target
			// End of user code
			
			basePart.addFilterToSource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Vertex);
				}
			
			});
			// Start of user code for additional businessfilters for source
			// End of user code
			
			basePart.addFilterToStatechart(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof RealtimeStatechart); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for statechart
			// End of user code
			
			basePart.addFilterToClockResets(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInClockResetsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToClockResets(new EObjectFilter(RealtimestatechartPackage.eINSTANCE.getClock()));
			// Start of user code for additional businessfilters for clockResets
			// End of user code
			
			basePart.addFilterToClockConstraints(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ClockConstraint); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for clockConstraints
			// End of user code
			
			basePart.addFilterToAbsoluteDeadlines(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof AbsoluteDeadline); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for absoluteDeadlines
			// End of user code
			
			
			basePart.addFilterToEvents(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TransitionEvent); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for events
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
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.priority) {
			return RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.target) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_Target();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.source) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_Source();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.statechart) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_Statechart();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.clockResets) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_ClockResets();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.clockConstraints) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_ClockConstraints();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_AbsoluteDeadlines();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.blockable) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_Blockable();
		}
		if (editorKey == RealtimestatechartViewsRepository.Transition.Properties.events) {
			return RealtimestatechartPackage.eINSTANCE.getTransition_Events();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Transition transition = (Transition)semanticObject;
		if (RealtimestatechartViewsRepository.Transition.Properties.priority == event.getAffectedEditor()) {
			transition.setPriority((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (RealtimestatechartViewsRepository.Transition.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSettings.setToReference((Vertex)event.getNewValue());
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
		if (RealtimestatechartViewsRepository.Transition.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSettings.setToReference((Vertex)event.getNewValue());
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
		if (RealtimestatechartViewsRepository.Transition.Properties.statechart == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				statechartSettings.setToReference((RealtimeStatechart)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RealtimeStatechart eObject = RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				statechartSettings.setToReference(eObject);
			}
		}
		if (RealtimestatechartViewsRepository.Transition.Properties.clockResets == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Clock) {
					clockResetsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				clockResetsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				clockResetsSettings.move(event.getNewIndex(), (Clock) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.Transition.Properties.clockConstraints == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, clockConstraintsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				clockConstraintsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				clockConstraintsSettings.move(event.getNewIndex(), (ClockConstraint) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, absoluteDeadlinesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				absoluteDeadlinesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				absoluteDeadlinesSettings.move(event.getNewIndex(), (AbsoluteDeadline) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.Transition.Properties.blockable == event.getAffectedEditor()) {
			transition.setBlockable((Boolean)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.Transition.Properties.events == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, eventsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				eventsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eventsSettings.move(event.getNewIndex(), (TransitionEvent) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TransitionPropertiesEditionPart basePart = (TransitionPropertiesEditionPart)editingPart;
			if (RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.priority)) {
				if (msg.getNewValue() != null) {
					basePart.setPriority(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPriority("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getTransition_Target().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.target))
				basePart.setTarget((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getTransition_Source().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.source))
				basePart.setSource((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getTransition_Statechart().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.statechart))
				basePart.setStatechart((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getTransition_ClockResets().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.clockResets))
				basePart.updateClockResets();
			if (RealtimestatechartPackage.eINSTANCE.getTransition_ClockConstraints().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.clockConstraints))
				basePart.updateClockConstraints();
			if (RealtimestatechartPackage.eINSTANCE.getTransition_AbsoluteDeadlines().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines))
				basePart.updateAbsoluteDeadlines();
			if (RealtimestatechartPackage.eINSTANCE.getTransition_Blockable().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.blockable))
				basePart.setBlockable((Boolean)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getTransition_Events().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.Transition.Properties.events))
				basePart.updateEvents();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.Transition.Properties.target || key == RealtimestatechartViewsRepository.Transition.Properties.source;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == RealtimestatechartViewsRepository.Transition.Properties.target)
			return ""; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
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
				if (RealtimestatechartViewsRepository.Transition.Properties.priority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.Transition.Properties.blockable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getTransition_Blockable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getTransition_Blockable().getEAttributeType(), newValue);
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
