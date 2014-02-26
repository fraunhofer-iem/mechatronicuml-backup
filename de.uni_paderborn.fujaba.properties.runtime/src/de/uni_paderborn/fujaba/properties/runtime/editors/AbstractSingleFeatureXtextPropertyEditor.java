package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.Injector;

/**
 * Abstract base class for single feature property's xtext
 * editors. If the element is a a multi feature it is treated
 * like a single feature.
 */
public abstract class AbstractSingleFeatureXtextPropertyEditor extends
		AbstractXtextPropertyEditor {
	
	private int saving = 0;
	private int updating = 0;

	public AbstractSingleFeatureXtextPropertyEditor(
			AdapterFactory adapterFactory, EStructuralFeature feature,
			Injector injector) {
		super(adapterFactory, feature, injector);
	}
	
	/**
	 * Parses the passed text using a LanguageResource.
	 * @param text the text
	 * @return the parsed model
	 */
	protected abstract EObject parse(String text);
	
	/**
	 * Serializes the passed object
	 * @param object the model element that should be serialized
	 * @return the serialized form of the passed object or null if it cannot be serialized
	 */
	protected abstract String serializeEObject(EObject object);
	// XXX: consider element!

	private void setSingleValue(Object singleValue) {
		if (feature.isMany()) {
			if (singleValue == null) {
				setValue(Collections.emptyList());
			} else {
				setValue(Collections.singletonList(singleValue));
			}
		} else {
			setValue(singleValue);
		}
	}

	private Object getSingleValue() {
		if (feature.isMany() && value != null) {
			Collection<?> values = (Collection<?>) value;
			if (!values.isEmpty()) {
				return values.iterator().next();
			}
			return null;
		}
		return value;
	}
	
	@Override
	protected void save(String text) {
		saving++;
		try {
			if (text == null || text.isEmpty()) {
				setSingleValue(null);
			} else {
				EObject model = parse(text);
				setSingleValue(model);
			}
		} finally {
			saving--;
		}
	}

	@Override
	protected boolean isSaving() {
		return saving > 0;
	}

	@Override
	protected void updateText() {
		String text = serializeEObject((EObject) getSingleValue());
		if (text == null) {
			text = "";
		}
		updateText(text);
	}
	
	private void updateText(String text) {
		if (embeddedXtextEditor != null && !text.equals(embeddedXtextEditor.getDocument().get())) {
			updating++;
			try {
				embeddedXtextEditor.update(text);
			} finally {
				updating--;
			}
		}
	}

	@Override
	protected boolean isUpdating() {
		return updating > 0;
	}

}
