package org.muml.ape.runtime.editors;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Injector;

/**
 * Abstract base class for many-feature properties xtext editors. 
 * More specifically, those xtext editors that parse a list of (multiple) items from one "sentence" of the language, and this list should be saved in a many-feature.
 * 
 * If the first xtext rule looks like this, use this class to save the list (in the example: "items") in a many-feature: 
 * ListOfItems: (items+=Item)* ;
 * 
 * Throughout the documentation of this class, we will refer to ListOfItems, items, and Item of that rule (and the corresponding elements in the metamodel)
 * 
 * The general idea is that subclasses do not need to be concerned about the many-feature's format and may simply parse/serialize their model (rooted in ListOfItems)
 * Internal conversion between ListOfItems and Collection<Item> [to save in the many-feature] will be done in toList() and toEObject(). You may override these if the default behavior is not applicable.
 */
public abstract class AbstractManyFeatureXtextPropertyEditor extends AbstractXtextPropertyEditor {

	private int updating = 0;
	private EStructuralFeature rootListFeature;
	private EFactory rootFactory;

	/**
	 * Constructor
	 * @param rootListFeature the EStructuralFeature that is the language metamodel's list of items ("items" in the rule "ListOfItems: (items+=Item)* ;")
	 * @param rootFactory an EFactory capable of creating the EClass containing rootListFeature (i.e. "ListOfItems" in the rule above)
	 * @param adapterFactory as in AbstractXtextPropertyEditor
	 * @param feature as in AbstractXtextPropertyEditor
	 * @param injector as in AbstractXtextPropertyEditor
	 */
	public AbstractManyFeatureXtextPropertyEditor(EStructuralFeature rootListFeature, EFactory rootFactory, AdapterFactory adapterFactory, EStructuralFeature feature, Injector injector) {
		super(adapterFactory, feature, injector);
		
		this.rootListFeature = rootListFeature;
		this.rootFactory = rootFactory;

		if (feature == null || !feature.isMany())
			throw new RuntimeException("AbstractManyFeatureXtextPropertyEditor cannot handle the single-feature " + (feature == null ? "null" : feature.toString()));
	}

	/**
	 * Parses the passed text using a LanguageResource.
	 * 
	 * @param text
	 *            the text
	 * @return the root node (type ListOfItems) of the parsed text (or null) (see AbstractManyFeatureXtextPropertyEditor class comments for naming explanation)
	 */
	protected abstract EObject parse(String text);

	/**
	 * Serializes the document to text.
	 * 
	 * 
	 * @param object
	 *            the EObject (type ListOfItems) to serialize
	 * @return the serialized EObject or null if it cannot be serialized (see AbstractManyFeatureXtextPropertyEditor class comments for naming explanation)
	 */
	protected abstract String serializeEObject(EObject object);

	private void setList(Collection<?> list) {
		if (list == null) {
			setValue(Collections.emptyList());
		} else {
			setValue(list);
		}
	}

	@SuppressWarnings("unchecked")
	private Collection<EObject> getList() {
		return (Collection<EObject>) value;
	}

	@Override
	protected void save(String text) {
		if (text == null || text.isEmpty())
			setList(null);
		else
			setList(toList(parse(text)));
	}

	@Override
	protected void updateText() {
		String text = serializeEObject(toEObject(getList()));
		if (text == null)
			text = "";
		
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

	/**
	 * Converts a ListOfItems to a list of items.
	 * (see AbstractManyFeatureXtextPropertyEditor class comments for naming explanation)
	 */
	protected Collection<?> toList(EObject obj) {
		if (obj == null)
			return Collections.emptyList();
		return ((Collection<?>) obj.eGet(rootListFeature));
	}
	
	/**
	 * Converts a list of items to a ListOfItems
	 * (see AbstractManyFeatureXtextPropertyEditor class comments for naming explanation)
	 * 
	 * @param list the list to convert
	 * @return the resulting ListOfItems or null
	 */
	@SuppressWarnings("unchecked")
	protected EObject toEObject(Collection<EObject> list) {
		if (list == null || list.size() == 0)
			return null;
		
		//Create root for the document resulting from the list
		EObject newRoot = rootFactory.create(rootListFeature.getEContainingClass());
		
		//Copy elements from the list into the root's feature
		for (EObject obj : list)
			((Collection<EObject>) newRoot.eGet(rootListFeature)).add(EcoreUtil.copy(obj));
		
		return newRoot;
	}
}
