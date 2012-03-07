/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.components;

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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class SynchronizationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for callee EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings calleeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SynchronizationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject synchronization, String editing_mode) {
		super(editingContext, synchronization, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.Synchronization.class;
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
			final Synchronization synchronization = (Synchronization)elt;
			final SynchronizationPropertiesEditionPart basePart = (SynchronizationPropertiesEditionPart)editingPart;
			// init values
			if (synchronization.getComment() != null && isAccessible(RealtimestatechartViewsRepository.Synchronization.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), synchronization.getComment()));
			
			if (isAccessible(RealtimestatechartViewsRepository.Synchronization.Properties.callee)) {
				// init part
				calleeSettings = new EObjectFlatComboSettings(synchronization, CallsPackage.eINSTANCE.getInvocation_Callee());
				basePart.initCallee(calleeSettings);
				// set the button mode
				basePart.setCalleeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.Synchronization.Properties.kind)) {
				basePart.initKind((EEnum) RealtimestatechartPackage.eINSTANCE.getSynchronization_Kind().getEType(), synchronization.getKind());
			}
			// init filters
			
			basePart.addFilterToCallee(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Callable); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for callee
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
		if (editorKey == RealtimestatechartViewsRepository.Synchronization.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == RealtimestatechartViewsRepository.Synchronization.Properties.callee) {
			return CallsPackage.eINSTANCE.getInvocation_Callee();
		}
		if (editorKey == RealtimestatechartViewsRepository.Synchronization.Properties.kind) {
			return RealtimestatechartPackage.eINSTANCE.getSynchronization_Kind();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Synchronization synchronization = (Synchronization)semanticObject;
		if (RealtimestatechartViewsRepository.Synchronization.Properties.comment == event.getAffectedEditor()) {
			synchronization.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.Synchronization.Properties.callee == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				calleeSettings.setToReference((Callable)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, calleeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (RealtimestatechartViewsRepository.Synchronization.Properties.kind == event.getAffectedEditor()) {
			synchronization.setKind((SynchronizationKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SynchronizationPropertiesEditionPart basePart = (SynchronizationPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Synchronization.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CallsPackage.eINSTANCE.getInvocation_Callee().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Synchronization.Properties.callee))
				basePart.setCallee((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getSynchronization_Kind().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.Synchronization.Properties.kind))
				basePart.setKind((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.Synchronization.Properties.kind;
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
				if (RealtimestatechartViewsRepository.Synchronization.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.Synchronization.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getSynchronization_Kind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getSynchronization_Kind().getEAttributeType(), newValue);
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
