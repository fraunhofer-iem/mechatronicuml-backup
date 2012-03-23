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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DoEventPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public DoEventPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject doEvent, String editing_mode) {
		super(editingContext, doEvent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.DoEvent.class;
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
			final DoEvent doEvent = (DoEvent)elt;
			final DoEventPropertiesEditionPart basePart = (DoEventPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RealtimestatechartViewsRepository.DoEvent.Properties.kind)) {
				basePart.initKind(EEFUtils.choiceOfValues(doEvent, RealtimestatechartPackage.eINSTANCE.getEvent_Kind()), doEvent.getKind());
			}
			if (isAccessible(RealtimestatechartViewsRepository.DoEvent.Properties.periodLower)) {
				basePart.setPeriodLower(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), doEvent.getPeriodLower()));
			}
			
			if (isAccessible(RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper)) {
				basePart.setPeriodUpper(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), doEvent.getPeriodUpper()));
			}
			
			// init filters
			
			
			
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
		if (editorKey == RealtimestatechartViewsRepository.DoEvent.Properties.kind) {
			return RealtimestatechartPackage.eINSTANCE.getEvent_Kind();
		}
		if (editorKey == RealtimestatechartViewsRepository.DoEvent.Properties.periodLower) {
			return RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodLower();
		}
		if (editorKey == RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper) {
			return RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodUpper();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DoEvent doEvent = (DoEvent)semanticObject;
		if (RealtimestatechartViewsRepository.DoEvent.Properties.kind == event.getAffectedEditor()) {
			doEvent.setKind((EventKind)event.getNewValue());
		}
		if (RealtimestatechartViewsRepository.DoEvent.Properties.periodLower == event.getAffectedEditor()) {
			doEvent.setPeriodLower((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper == event.getAffectedEditor()) {
			doEvent.setPeriodUpper((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DoEventPropertiesEditionPart basePart = (DoEventPropertiesEditionPart)editingPart;
			if (RealtimestatechartPackage.eINSTANCE.getEvent_Kind().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.DoEvent.Properties.kind))
				basePart.setKind((EventKind)msg.getNewValue());
			
			if (RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodLower().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.DoEvent.Properties.periodLower)) {
				if (msg.getNewValue() != null) {
					basePart.setPeriodLower(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPeriodLower("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodUpper().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper)) {
				if (msg.getNewValue() != null) {
					basePart.setPeriodUpper(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPeriodUpper("");
				}
			}
			
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
				if (RealtimestatechartViewsRepository.DoEvent.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getEvent_Kind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getEvent_Kind().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.DoEvent.Properties.periodLower == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodLower().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodLower().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodUpper().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getDoEvent_PeriodUpper().getEAttributeType(), newValue);
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
