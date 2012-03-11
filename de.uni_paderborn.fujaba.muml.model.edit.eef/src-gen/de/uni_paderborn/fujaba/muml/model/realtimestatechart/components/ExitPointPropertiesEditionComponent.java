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

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitPointPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ExitPointPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public ExitPointPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject exitPoint, String editing_mode) {
		super(editingContext, exitPoint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.ExitPoint.class;
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
			final ExitPoint exitPoint = (ExitPoint)elt;
			final ExitPointPropertiesEditionPart basePart = (ExitPointPropertiesEditionPart)editingPart;
			// init values
			if (exitPoint.getName() != null && isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), exitPoint.getName()));
			
			if (isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.outgoingTransitions)) {
				outgoingTransitionsSettings = new ReferencesTableSettings(exitPoint, RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions());
				basePart.initOutgoingTransitions(outgoingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.incomingTransitions)) {
				incomingTransitionsSettings = new ReferencesTableSettings(exitPoint, RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions());
				basePart.initIncomingTransitions(incomingTransitionsSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.statechart)) {
				// init part
				statechartSettings = new EObjectFlatComboSettings(exitPoint, RealtimestatechartPackage.eINSTANCE.getVertex_Statechart());
				basePart.initStatechart(statechartSettings);
				// set the button mode
				basePart.setStatechartButtonMode(ButtonsModeEnum.BROWSE);
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
		if (editorKey == RealtimestatechartViewsRepository.ExitPoint.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.ExitPoint.Properties.outgoingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.ExitPoint.Properties.incomingTransitions) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions();
		}
		if (editorKey == RealtimestatechartViewsRepository.ExitPoint.Properties.statechart) {
			return RealtimestatechartPackage.eINSTANCE.getVertex_Statechart();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExitPoint exitPoint = (ExitPoint)semanticObject;
		if (RealtimestatechartViewsRepository.ExitPoint.Properties.name == event.getAffectedEditor()) {
			exitPoint.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.ExitPoint.Properties.outgoingTransitions == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.ExitPoint.Properties.incomingTransitions == event.getAffectedEditor()) {
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
		if (RealtimestatechartViewsRepository.ExitPoint.Properties.statechart == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ExitPointPropertiesEditionPart basePart = (ExitPointPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getVertex_OutgoingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.outgoingTransitions))
				basePart.updateOutgoingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_IncomingTransitions().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.incomingTransitions))
				basePart.updateIncomingTransitions();
			if (RealtimestatechartPackage.eINSTANCE.getVertex_Statechart().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.ExitPoint.Properties.statechart))
				basePart.setStatechart((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.ExitPoint.Properties.name;
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
				if (RealtimestatechartViewsRepository.ExitPoint.Properties.name == event.getAffectedEditor()) {
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
