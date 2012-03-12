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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateEntryPointPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class StateEntryPointPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	private	EObjectFlatComboSettings statechartSettings;
	
	/**
	 * Settings for state EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings stateSettings;
	
	/**
	 * Settings for entryPoint ReferencesTable
	 */
	private	ReferencesTableSettings entryPointSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public StateEntryPointPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject stateEntryPoint, String editing_mode) {
		super(editingContext, stateEntryPoint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.StateEntryPoint.class;
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
			final StateEntryPoint stateEntryPoint = (StateEntryPoint)elt;
			final StateEntryPointPropertiesEditionPart basePart = (StateEntryPointPropertiesEditionPart)editingPart;
			// init values
			if (stateEntryPoint.getName() != null && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), stateEntryPoint.getName()));
			
			if (isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.outgoingTransitions)) {
				outgoingTransitionsSettings = new ReferencesTableSettings(stateEntryPoint, RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions());
				basePart.initOutgoingTransitions(outgoingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.incomingTransitions)) {
				incomingTransitionsSettings = new ReferencesTableSettings(stateEntryPoint, RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions());
				basePart.initIncomingTransitions(incomingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.statechart)) {
				// init part
				statechartSettings = new EObjectFlatComboSettings(stateEntryPoint, RealtimestatechartPackage.eINSTANCE.getVertex_Statechart());
				basePart.initStatechart(statechartSettings);
				// set the button mode
				basePart.setStatechartButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.state)) {
				// init part
				stateSettings = new EObjectFlatComboSettings(stateEntryPoint, RealtimestatechartPackage.eINSTANCE.getStateEntryPoint_State());
				basePart.initState(stateSettings);
				// set the button mode
				basePart.setStateButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.entryPoint)) {
				entryPointSettings = new ReferencesTableSettings(stateEntryPoint, RealtimestatechartPackage.eINSTANCE.getStateEntryPoint_EntryPoint());
				basePart.initEntryPoint(entryPointSettings);
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
			
			basePart.addFilterToState(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof State);
				}
			
			});
			// Start of user code for additional businessfilters for state
			// End of user code
			
			basePart.addFilterToEntryPoint(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInEntryPointTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToEntryPoint(new EObjectFilter(RealtimestatechartPackage.eINSTANCE.getEntryPoint()));
			// Start of user code for additional businessfilters for entryPoint
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
		if (editorKey == RealtimestatechartViewsRepository.StateEntryPoint.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateEntryPoint.Properties.outgoingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateEntryPoint.Properties.incomingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateEntryPoint.Properties.statechart) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_Statechart();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateEntryPoint.Properties.state) {
			return RealtimestatechartPackage.eINSTANCE.getStateEntryPoint_State();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateEntryPoint.Properties.entryPoint) {
			return RealtimestatechartPackage.eINSTANCE.getStateEntryPoint_EntryPoint();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		StateEntryPoint stateEntryPoint = (StateEntryPoint)semanticObject;
		if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.name == event.getAffectedEditor()) {
			stateEntryPoint.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.outgoingTransitions == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.incomingTransitions == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.statechart == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.state == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				stateSettings.setToReference((State)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				State eObject = RealtimestatechartFactory.eINSTANCE.createState();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				stateSettings.setToReference(eObject);
			}
		}
		if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.entryPoint == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EntryPoint) {
					entryPointSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				entryPointSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				entryPointSettings.move(event.getNewIndex(), (EntryPoint) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			StateEntryPointPropertiesEditionPart basePart = (StateEntryPointPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.outgoingTransitions))
				basePart.updateOutgoingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.incomingTransitions))
				basePart.updateIncomingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_Statechart().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.statechart))
				basePart.setStatechart((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getStateEntryPoint_State().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.state))
				basePart.setState((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getStateEntryPoint_EntryPoint().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.StateEntryPoint.Properties.entryPoint))
				basePart.updateEntryPoint();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.StateEntryPoint.Properties.name || key == RealtimestatechartViewsRepository.StateEntryPoint.Properties.state || key == RealtimestatechartViewsRepository.StateEntryPoint.Properties.entryPoint;
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
				if (RealtimestatechartViewsRepository.StateEntryPoint.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
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
