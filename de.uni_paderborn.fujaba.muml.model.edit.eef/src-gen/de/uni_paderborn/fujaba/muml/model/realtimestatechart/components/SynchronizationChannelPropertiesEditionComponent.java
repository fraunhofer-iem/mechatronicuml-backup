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
import org.eclipse.emf.ecore.EParameter;
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
import org.storydriven.modeling.calls.CallsPackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class SynchronizationChannelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for inParameter ReferencesTable
	 */
	private	ReferencesTableSettings inParameterSettings;
	
	/**
	 * Settings for outParameter ReferencesTable
	 */
	private	ReferencesTableSettings outParameterSettings;
	
	/**
	 * Settings for state EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings stateSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SynchronizationChannelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject synchronizationChannel, String editing_mode) {
		super(editingContext, synchronizationChannel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.SynchronizationChannel.class;
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
			final SynchronizationChannel synchronizationChannel = (SynchronizationChannel)elt;
			final SynchronizationChannelPropertiesEditionPart basePart = (SynchronizationChannelPropertiesEditionPart)editingPart;
			// init values
			if (synchronizationChannel.getComment() != null && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), synchronizationChannel.getComment()));
			
			if (isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter)) {
				inParameterSettings = new ReferencesTableSettings(synchronizationChannel, CallsPackage.eINSTANCE.getCallable_InParameter());
				basePart.initInParameter(inParameterSettings);
			}
			if (isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter)) {
				outParameterSettings = new ReferencesTableSettings(synchronizationChannel, CallsPackage.eINSTANCE.getCallable_OutParameter());
				basePart.initOutParameter(outParameterSettings);
			}
			if (synchronizationChannel.getName() != null && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), synchronizationChannel.getName()));
			
			if (isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state)) {
				// init part
				stateSettings = new EObjectFlatComboSettings(synchronizationChannel, RealtimestatechartPackage.eINSTANCE.getSynchronizationChannel_State());
				basePart.initState(stateSettings);
				// set the button mode
				basePart.setStateButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToInParameter(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInInParameterTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToInParameter(new EObjectFilter(EcorePackage.eINSTANCE.getEParameter()));
			// Start of user code for additional businessfilters for inParameter
			// End of user code
			
			basePart.addFilterToOutParameter(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutParameterTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutParameter(new EObjectFilter(EcorePackage.eINSTANCE.getEParameter()));
			// Start of user code for additional businessfilters for outParameter
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
		if (editorKey == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter) {
			return CallsPackage.eINSTANCE.getCallable_InParameter();
		}
		if (editorKey == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter) {
			return CallsPackage.eINSTANCE.getCallable_OutParameter();
		}
		if (editorKey == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state) {
			return RealtimestatechartPackage.eINSTANCE.getSynchronizationChannel_State();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SynchronizationChannel synchronizationChannel = (SynchronizationChannel)semanticObject;
		if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment == event.getAffectedEditor()) {
			synchronizationChannel.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EParameter) {
					inParameterSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inParameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inParameterSettings.move(event.getNewIndex(), (EParameter) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EParameter) {
					outParameterSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outParameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outParameterSettings.move(event.getNewIndex(), (EParameter) event.getNewValue());
			}
		}
		if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name == event.getAffectedEditor()) {
			synchronizationChannel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SynchronizationChannelPropertiesEditionPart basePart = (SynchronizationChannelPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getCallable_InParameter().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter))
				basePart.updateInParameter();
			if (CallsPackage.eINSTANCE.getCallable_OutParameter().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter))
				basePart.updateOutParameter();
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getSynchronizationChannel_State().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state))
				basePart.setState((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name || key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state;
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
				if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name == event.getAffectedEditor()) {
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
