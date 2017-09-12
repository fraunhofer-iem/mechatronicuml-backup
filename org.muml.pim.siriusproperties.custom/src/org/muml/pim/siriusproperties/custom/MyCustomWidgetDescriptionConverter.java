package org.muml.pim.siriusproperties.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.properties.CustomDescription;
import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.sirius.properties.core.api.DefaultDescriptionConverter;
import org.eclipse.sirius.properties.core.api.TransformationCache;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

// This is a replacement of Sirius internal CustomWidgetDescriptionConverter class.
// The original version did not copy CustomDescription.name to EEFCustomWidgetDescription.identifier.
// 
// CustomDescription inherits the name attribute from IdentifiedElement.
// My guess is that this attribute was former called IdentifiedElement.identifier,
// which was the identical name as EEFCustomWidgetDescription.identifier, and so it was never a problem before
public class MyCustomWidgetDescriptionConverter extends DefaultDescriptionConverter<CustomDescription> {

    public MyCustomWidgetDescriptionConverter() {
    	super(CustomDescription.class, EefPackage.Literals.EEF_CUSTOM_WIDGET_DESCRIPTION);
    }

    // Added method to fix the issue
	@Override
	protected void convertEAttribute(CustomDescription siriusEObject, EObject eefEObject, EAttribute eAttribute,
			Map<String, Object> parameters) {
		super.convertEAttribute(siriusEObject, eefEObject, eAttribute, parameters);
		
		// BEGIN: Do extra work and copy the name as identifier. 
		if (eAttribute == DescriptionPackage.Literals.IDENTIFIED_ELEMENT__NAME) {
			((EEFCustomWidgetDescription)eefEObject).setIdentifier(siriusEObject.getName());
		}
		// END
		
	}
 
	// copied (and not modified) from CustomWidgetDescriptionConverter, because it is internal sirius code.
    @Override
    protected void convertEReference(CustomDescription siriusEObject, EObject eefEObject, EReference eReference, Map<String, Object> parameters, TransformationCache cache) {
        if (eReference.equals(PropertiesPackage.Literals.ABSTRACT_CUSTOM_DESCRIPTION__CUSTOM_OPERATIONS)) {
            EReference eefEReference = EefPackage.Literals.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS;
            Object siriusValue = siriusEObject.eGet(eReference);
            Object eefValue = eefEObject.eGet(eefEReference);
            if (siriusValue instanceof Collection<?> && eefValue instanceof Collection<?>) {
                Collection<?> eefCollectionValue = (Collection<?>) eefValue;
                Collection<?> siriusCollectionValue = (Collection<?>) siriusValue;
                List<EEFCustomExpression> convertedCollection = this.convertCollection(siriusCollectionValue, parameters, cache, EEFCustomExpression.class);
                eefEObject.eSet(eefEReference, this.addAll(this.addAll(new ArrayList<EObject>(), eefCollectionValue), convertedCollection));
            }
        } else {
            super.convertEReference(siriusEObject, eefEObject, eReference, parameters, cache);
        }
    }
}
