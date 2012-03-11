/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.components;

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

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.parts.NaturalNumberPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class NaturalNumberPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public NaturalNumberPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject naturalNumber, String editing_mode) {
		super(editingContext, naturalNumber, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreViewsRepository.class;
		partKey = CoreViewsRepository.NaturalNumber.class;
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
			final NaturalNumber naturalNumber = (NaturalNumber)elt;
			final NaturalNumberPropertiesEditionPart basePart = (NaturalNumberPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CoreViewsRepository.NaturalNumber.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getELong(), naturalNumber.getValue()));
			}
			
			if (isAccessible(CoreViewsRepository.NaturalNumber.Properties.infinity)) {
				basePart.setInfinity(naturalNumber.isInfinity());
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
		if (editorKey == CoreViewsRepository.NaturalNumber.Properties.value) {
			return CorePackage.eINSTANCE.getNaturalNumber_Value();
		}
		if (editorKey == CoreViewsRepository.NaturalNumber.Properties.infinity) {
			return CorePackage.eINSTANCE.getNaturalNumber_Infinity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		NaturalNumber naturalNumber = (NaturalNumber)semanticObject;
		if (CoreViewsRepository.NaturalNumber.Properties.value == event.getAffectedEditor()) {
			naturalNumber.setValue((EEFConverterUtil.createLongFromString(EcorePackage.eINSTANCE.getELong(), (String)event.getNewValue())));
		}
		if (CoreViewsRepository.NaturalNumber.Properties.infinity == event.getAffectedEditor()) {
			naturalNumber.setInfinity((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			NaturalNumberPropertiesEditionPart basePart = (NaturalNumberPropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getNaturalNumber_Value().equals(msg.getFeature()) && basePart != null && isAccessible(CoreViewsRepository.NaturalNumber.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getELong(), msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (CorePackage.eINSTANCE.getNaturalNumber_Infinity().equals(msg.getFeature()) && basePart != null && isAccessible(CoreViewsRepository.NaturalNumber.Properties.infinity))
				basePart.setInfinity((Boolean)msg.getNewValue());
			
			
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
				if (CoreViewsRepository.NaturalNumber.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(CorePackage.eINSTANCE.getNaturalNumber_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getNaturalNumber_Value().getEAttributeType(), newValue);
				}
				if (CoreViewsRepository.NaturalNumber.Properties.infinity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(CorePackage.eINSTANCE.getNaturalNumber_Infinity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getNaturalNumber_Infinity().getEAttributeType(), newValue);
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
