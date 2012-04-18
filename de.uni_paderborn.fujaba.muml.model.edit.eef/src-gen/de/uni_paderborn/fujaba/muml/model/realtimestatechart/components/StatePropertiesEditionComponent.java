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
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class StatePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for outgoingTransitions ReferencesTable
	 */
	private	ReferencesTableSettings outgoingTransitionsSettings;
	
	/**
	 * Settings for incomingTransitions ReferencesTable
	 */
	private	ReferencesTableSettings incomingTransitionsSettings;
	
	/**
	 * Settings for statechart EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings statechartSettings;
	
	/**
	 * Settings for invariants ReferencesTable
	 */
	protected ReferencesTableSettings invariantsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public StatePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject state, String editing_mode) {
		super(editingContext, state, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.State.class;
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
			final State state = (State)elt;
			final StatePropertiesEditionPart basePart = (StatePropertiesEditionPart)editingPart;
			// init values
			if (state.getName() != null && isAccessible(RealtimestatechartViewsRepository.State.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), state.getName()));
			
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.outgoingTransitions)) {
				outgoingTransitionsSettings = new ReferencesTableSettings(state, RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions());
				basePart.initOutgoingTransitions(outgoingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.incomingTransitions)) {
				incomingTransitionsSettings = new ReferencesTableSettings(state, RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions());
				basePart.initIncomingTransitions(incomingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.statechart)) {
				// init part
				statechartSettings = new EObjectFlatComboSettings(state, RealtimestatechartPackage.eINSTANCE.getVertex_Statechart());
				basePart.initStatechart(statechartSettings);
				// set the button mode
				basePart.setStatechartButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.invariants)) {
				invariantsSettings = new ReferencesTableSettings(state, RealtimestatechartPackage.eINSTANCE.getState_Invariants());
				basePart.initInvariants(invariantsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.initial)) {
				basePart.setInitial(state.isInitial());
			}
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.final_)) {
				basePart.setFinal_(state.isFinal());
			}
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.urgent)) {
				basePart.setUrgent(state.isUrgent());
			}
			// init filters
			
			basePart.addFilterToOutgoingTransitions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingTransitionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoingTransitions(new EObjectFilter(RealtimestatechartPackage.eINSTANCE.getTransition()));
			// Start of user code for additional businessfilters for outgoingTransitions
			// End of user code
			
			basePart.addFilterToIncomingTransitions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingTransitionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncomingTransitions(new EObjectFilter(RealtimestatechartPackage.eINSTANCE.getTransition()));
			// Start of user code for additional businessfilters for incomingTransitions
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
			
			if (isAccessible(RealtimestatechartViewsRepository.State.Properties.invariants)) {
				basePart.addFilterToInvariants(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ClockConstraint); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for invariants
			// End of user code
			}
			
			
			
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
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.name) {
			return CorePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.outgoingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.incomingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.statechart) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_Statechart();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.invariants) {
			return RealtimestatechartPackage.eINSTANCE.getState_Invariants();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.initial) {
			return RealtimestatechartPackage.eINSTANCE.getState_Initial();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.final_) {
			return RealtimestatechartPackage.eINSTANCE.getState_Final();
		}
		if (editorKey == RealtimestatechartViewsRepository.State.Properties.urgent) {
			return RealtimestatechartPackage.eINSTANCE.getState_Urgent();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		State state = (State)semanticObject;
		if (RealtimestatechartViewsRepository.State.Properties.name == event.getAffectedEditor()) {
			state.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.State.Properties.outgoingTransitions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					outgoingTransitionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingTransitionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingTransitionsSettings.move(event.getNewIndex(), (Transition) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.State.Properties.incomingTransitions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					incomingTransitionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingTransitionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingTransitionsSettings.move(event.getNewIndex(), (Transition) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.State.Properties.statechart == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.State.Properties.invariants == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, invariantsSettings, editingContext.getAdapterFactory());
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
				invariantsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				invariantsSettings.move(event.getNewIndex(), (ClockConstraint) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.State.Properties.initial == event.getAffectedEditor()) {
			state.setInitial((Boolean)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.State.Properties.final_ == event.getAffectedEditor()) {
			state.setFinal((Boolean)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.State.Properties.urgent == event.getAffectedEditor()) {
			state.setUrgent((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			StatePropertiesEditionPart basePart = (StatePropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.State.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.State.Properties.outgoingTransitions))
				basePart.updateOutgoingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.State.Properties.incomingTransitions))
				basePart.updateIncomingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_Statechart().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.State.Properties.statechart))
				basePart.setStatechart((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getState_Invariants().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.State.Properties.invariants))
				basePart.updateInvariants();
			if (RealtimestatechartPackage.eINSTANCE.getState_Initial().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.State.Properties.initial))
				basePart.setInitial((Boolean)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getState_Final().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.State.Properties.final_))
				basePart.setFinal_((Boolean)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getState_Urgent().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.State.Properties.urgent))
				basePart.setUrgent((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.State.Properties.name;
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
				if (RealtimestatechartViewsRepository.State.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.State.Properties.initial == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getState_Initial().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getState_Initial().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.State.Properties.final_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getState_Final().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getState_Final().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.State.Properties.urgent == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getState_Urgent().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getState_Urgent().getEAttributeType(), newValue);
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
