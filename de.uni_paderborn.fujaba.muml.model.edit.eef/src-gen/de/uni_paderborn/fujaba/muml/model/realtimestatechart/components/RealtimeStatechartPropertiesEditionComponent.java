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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
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

import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class RealtimeStatechartPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for behavioralElement EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings behavioralElementSettings;
	
	/**
	 * Settings for embeddingRegion EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings embeddingRegionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RealtimeStatechartPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject realtimeStatechart, String editing_mode) {
		super(editingContext, realtimeStatechart, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.RealtimeStatechart_.class;
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
			final RealtimeStatechart realtimeStatechart = (RealtimeStatechart)elt;
			final RealtimeStatechartPropertiesEditionPart basePart = (RealtimeStatechartPropertiesEditionPart)editingPart;
			// init values
			if (realtimeStatechart.getName() != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), realtimeStatechart.getName()));
			
			if (realtimeStatechart.getComment() != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), realtimeStatechart.getComment()));
			
			if (isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement)) {
				// init part
				behavioralElementSettings = new EObjectFlatComboSettings(realtimeStatechart, CorePackage.eINSTANCE.getBehavior_BehavioralElement());
				basePart.initBehavioralElement(behavioralElementSettings);
				// set the button mode
				basePart.setBehavioralElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion)) {
				// init part
				embeddingRegionSettings = new EObjectFlatComboSettings(realtimeStatechart, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EmbeddingRegion());
				basePart.initEmbeddingRegion(embeddingRegionSettings);
				// set the button mode
				basePart.setEmbeddingRegionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history)) {
				basePart.setHistory(realtimeStatechart.isHistory());
			}
			if (isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize)) {
				basePart.setEventQueueSize(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), realtimeStatechart.getEventQueueSize()));
			}
			
			// init filters
			
			
			basePart.addFilterToBehavioralElement(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof BehavioralElement); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for behavioralElement
			// End of user code
			
			basePart.addFilterToEmbeddingRegion(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Region); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for embeddingRegion
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
		if (editorKey == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement) {
			return CorePackage.eINSTANCE.getBehavior_BehavioralElement();
		}
		if (editorKey == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion) {
			return RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EmbeddingRegion();
		}
		if (editorKey == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history) {
			return RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_History();
		}
		if (editorKey == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize) {
			return RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EventQueueSize();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RealtimeStatechart realtimeStatechart = (RealtimeStatechart)semanticObject;
		if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name == event.getAffectedEditor()) {
			realtimeStatechart.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment == event.getAffectedEditor()) {
			realtimeStatechart.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				behavioralElementSettings.setToReference((BehavioralElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, behavioralElementSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				embeddingRegionSettings.setToReference((Region)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Region eObject = RealtimestatechartFactory.eINSTANCE.createRegion();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				embeddingRegionSettings.setToReference(eObject);
			}
		}
		if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history == event.getAffectedEditor()) {
			realtimeStatechart.setHistory((Boolean)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize == event.getAffectedEditor()) {
			realtimeStatechart.setEventQueueSize((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			RealtimeStatechartPropertiesEditionPart basePart = (RealtimeStatechartPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (CorePackage.eINSTANCE.getBehavior_BehavioralElement().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement))
				basePart.setBehavioralElement((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EmbeddingRegion().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion))
				basePart.setEmbeddingRegion((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_History().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history))
				basePart.setHistory((Boolean)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EventQueueSize().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize)) {
				if (msg.getNewValue() != null) {
					basePart.setEventQueueSize(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setEventQueueSize("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name;
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
				if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_History().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_History().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EventQueueSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart_EventQueueSize().getEAttributeType(), newValue);
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
