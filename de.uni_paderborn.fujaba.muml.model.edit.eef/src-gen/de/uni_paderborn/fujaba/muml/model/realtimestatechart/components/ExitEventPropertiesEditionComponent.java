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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ExitEventPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for clockResets ReferencesTable
	 */
	private	ReferencesTableSettings clockResetsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ExitEventPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject exitEvent, String editing_mode) {
		super(editingContext, exitEvent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.ExitEvent.class;
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
			final ExitEvent exitEvent = (ExitEvent)elt;
			final ExitEventPropertiesEditionPart basePart = (ExitEventPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RealtimestatechartViewsRepository.ExitEvent.Properties.kind)) {
				basePart.initKind(EEFUtils.choiceOfValues(exitEvent, RealtimestatechartPackage.eINSTANCE.getEvent_Kind()), exitEvent.getKind());
			}
			if (isAccessible(RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets)) {
				clockResetsSettings = new ReferencesTableSettings(exitEvent, RealtimestatechartPackage.eINSTANCE.getEntryOrExitEvent_ClockResets());
				basePart.initClockResets(clockResetsSettings);
			}
			// init filters
			
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
		if (editorKey == RealtimestatechartViewsRepository.ExitEvent.Properties.kind) {
			return RealtimestatechartPackage.eINSTANCE.getEvent_Kind();
		}
		if (editorKey == RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets) {
			return RealtimestatechartPackage.eINSTANCE.getEntryOrExitEvent_ClockResets();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExitEvent exitEvent = (ExitEvent)semanticObject;
		if (RealtimestatechartViewsRepository.ExitEvent.Properties.kind == event.getAffectedEditor()) {
			exitEvent.setKind((EventKind)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ExitEventPropertiesEditionPart basePart = (ExitEventPropertiesEditionPart)editingPart;
			if (RealtimestatechartPackage.eINSTANCE.getEvent_Kind().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.ExitEvent.Properties.kind))
				basePart.setKind((EventKind)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getEntryOrExitEvent_ClockResets().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets))
				basePart.updateClockResets();
			
		}
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
				if (RealtimestatechartViewsRepository.ExitEvent.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getEvent_Kind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getEvent_Kind().getEAttributeType(), newValue);
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
