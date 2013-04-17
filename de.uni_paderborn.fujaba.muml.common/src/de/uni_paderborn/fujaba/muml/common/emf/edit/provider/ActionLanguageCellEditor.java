package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

import de.uni_paderborn.fujaba.muml.common.ILoadResult;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;

public class ActionLanguageCellEditor extends TextCellEditor {

	/**
	 * Convenience class to transform expression <-> String. Inspired by
	 * EDataTypeValueHandler.
	 * 
	 */
	static class ValueWrapper implements ICellEditorValidator {

		private EObject container;

		public ValueWrapper(EObject object) {
			container = object;
		}

		@Override
		public String isValid(Object value) {
			ILoadResult loadResult = loadFromString((String) value);
			if (loadResult != null && loadResult.hasError()) {
				return loadResult.getError();
			}
			return null;
		}

		private ILoadResult loadFromString(String text) {
			if (text == null) {
				return null;
			}
			// ILoadResult loadResult = LanguageResource.loadFromString(text,
			// getAttributeList(container));
			ILoadResult loadResult = LanguageResource.loadFromString(text,
					container);
			return loadResult;
		}

		public EObject toValue(String text) {
			ILoadResult loadResult = loadFromString(text);
			return loadResult == null ? null : loadResult.getEObject();
		}

	}

	private ValueWrapper valueWrapper;

	public ActionLanguageCellEditor(Composite parent, EObject object) {
		super(parent);
		valueWrapper = new ValueWrapper(object);
		setValidator(valueWrapper);
	}

	@Override
	public Object doGetValue() {
		return valueWrapper.toValue((String) super.doGetValue());
	}

	@Override
	public void doSetValue(Object value) {
		super.doSetValue(value == null ? "" : value);
	}
}