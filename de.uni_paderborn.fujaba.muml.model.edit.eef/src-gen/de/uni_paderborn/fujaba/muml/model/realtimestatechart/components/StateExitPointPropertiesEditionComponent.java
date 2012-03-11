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

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class StateExitPointPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public StateExitPointPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject stateExitPoint, String editing_mode) {
		super(editingContext, stateExitPoint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.StateExitPoint.class;
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
			final StateExitPoint stateExitPoint = (StateExitPoint)elt;
			final StateExitPointPropertiesEditionPart basePart = (StateExitPointPropertiesEditionPart)editingPart;
			// init values
			if (stateExitPoint.getName() != null && isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), stateExitPoint.getName()));
			
			if (isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions)) {
				outgoingTransitionsSettings = new ReferencesTableSettings(stateExitPoint, RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions());
				basePart.initOutgoingTransitions(outgoingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions)) {
				incomingTransitionsSettings = new ReferencesTableSettings(stateExitPoint, RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions());
				basePart.initIncomingTransitions(incomingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart)) {
				// init part
				statechartSettings = new EObjectFlatComboSettings(stateExitPoint, RealtimestatechartPackage.eINSTANCE.getVertex_Statechart());
				basePart.initStatechart(statechartSettings);
				// set the button mode
				basePart.setStatechartButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.state)) {
				// init part
				stateSettings = new EObjectFlatComboSettings(stateExitPoint, RealtimestatechartPackage.eINSTANCE.getStateExitPoint_State());
				basePart.initState(stateSettings);
				// set the button mode
				basePart.setStateButtonMode(ButtonsModeEnum.BROWSE);
			}
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : exitPoint, StateExitPoint, StateExitPoint.
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
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : exitPoint, StateExitPoint, StateExitPoint.
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
		if (editorKey == RealtimestatechartViewsRepository.StateExitPoint.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_Statechart();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateExitPoint.Properties.state) {
			return RealtimestatechartPackage.eINSTANCE.getStateExitPoint_State();
		}
		if (editorKey == RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint) {
			return RealtimestatechartPackage.eINSTANCE.getStateExitPoint_ExitPoint();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		StateExitPoint stateExitPoint = (StateExitPoint)semanticObject;
		if (RealtimestatechartViewsRepository.StateExitPoint.Properties.name == event.getAffectedEditor()) {
			stateExitPoint.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateExitPoint.Properties.state == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint == event.getAffectedEditor()) {
			// FIXME INVALID CASE you must override the template 'declareEObjectUpdater' for the case : exitPoint, StateExitPoint, StateExitPoint.
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			StateExitPointPropertiesEditionPart basePart = (StateExitPointPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions))
				basePart.updateOutgoingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions))
				basePart.updateIncomingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_Statechart().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart))
				basePart.setStatechart((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getStateExitPoint_State().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.StateExitPoint.Properties.state))
				basePart.setState((EObject)msg.getNewValue());
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : exitPoint, StateExitPoint, StateExitPoint.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.StateExitPoint.Properties.name || key == RealtimestatechartViewsRepository.StateExitPoint.Properties.state || key == RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint;
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
				if (RealtimestatechartViewsRepository.StateExitPoint.Properties.name == event.getAffectedEditor()) {
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
