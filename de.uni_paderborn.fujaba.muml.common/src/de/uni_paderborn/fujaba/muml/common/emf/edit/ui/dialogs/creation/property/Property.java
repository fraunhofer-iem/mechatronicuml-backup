package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A Property to show in the MultiFeatureCreationDialog.
 * 
 * @author bingo
 * 
 */
public class Property {
	/**
	 * The structural feature of the property.
	 */
	private EStructuralFeature feature;

	/**
	 * The property editor to use.
	 */
	private AbstractPropertyEditor propertyEditor;

	/**
	 * Constructs this Property.
	 * 
	 * @param feature
	 *            The structural feature of this property.
	 * @param propertyEditor
	 *            The property editor to use.
	 */
	public Property(EStructuralFeature feature,
			AbstractPropertyEditor propertyEditor) {
		this.feature = feature;
		this.propertyEditor = propertyEditor;
		propertyEditor.init(this);
	}

	/**
	 * Gets the structural feature of this property.
	 * 
	 * @return The structural feature.
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}

	/**
	 * Gets the property editor of this property.
	 * 
	 * @return The property editor.
	 */
	public AbstractPropertyEditor getPropertyEditor() {
		return propertyEditor;
	}

	/**
	 * Creates the display name for this property.
	 * 
	 * @return The display name.
	 */
	public String getDisplayName() {
		return feature.getName().substring(0, 1).toUpperCase()
				+ feature.getName().substring(1);
	}
}
