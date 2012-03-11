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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryEventPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class EntryEventPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for clockResets ReferencesTable
	 */
	private	ReferencesTableSettings clockResetsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EntryEventPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject entryEvent, String editing_mode) {
		super(editingContext, entryEvent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.EntryEvent.class;
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
			final EntryEvent entryEvent = (EntryEvent)elt;
			final EntryEventPropertiesEditionPart basePart = (EntryEventPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RealtimestatechartViewsRepository.EntryEvent.Properties.kind)) {
				basePart.initKind((EEnum) RealtimestatechartPackage.eINSTANCE.getEvent_Kind().getEType(), entryEvent.getKind());
			}
			if (isAccessible(RealtimestatechartViewsRepository.EntryEvent.Properties.clockResets)) {
				clockResetsSettings = new ReferencesTableSettings(entryEvent, RealtimestatechartPackage.eINSTANCE.getEntryOrExitEvent_ClockResets());
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
		if (editorKey == RealtimestatechartViewsRepository.EntryEvent.Properties.kind) {
			return RealtimestatechartPackage.eINSTANCE.getEvent_Kind();
		}
		if (editorKey == RealtimestatechartViewsRepository.EntryEvent.Properties.clockResets) {
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
		EntryEvent entryEvent = (EntryEvent)semanticObject;
		if (RealtimestatechartViewsRepository.EntryEvent.Properties.kind == event.getAffectedEditor()) {
			entryEvent.setKind((EventKind)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.EntryEvent.Properties.clockResets == event.getAffectedEditor()) {
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
			EntryEventPropertiesEditionPart basePart = (EntryEventPropertiesEditionPart)editingPart;
			if (RealtimestatechartPackage.eINSTANCE.getEvent_Kind().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.EntryEvent.Properties.kind))
				basePart.setKind((Enumerator)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getEntryOrExitEvent_ClockResets().equals(msg.getFeature())  && isAccessible(RealtimestatechartViewsRepository.EntryEvent.Properties.clockResets))
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
				if (RealtimestatechartViewsRepository.EntryEvent.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getEvent_Kind().getEAttributeType(), (String)newValue);
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
