package org.muml.pim.common.emf.edit.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.muml.core.common.xtext.ILoadResult;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;

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
			if (value instanceof String) {
				ILoadResult loadResult = loadFromString((String) value);
				if (loadResult != null && loadResult.hasError()) {
					return loadResult.getError();
				}
			}
			return "";
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
	private EObject container;

	public ActionLanguageCellEditor(Composite parent, EObject object) {
		super(parent);
		valueWrapper = new ValueWrapper(object);
		setValidator(valueWrapper);
		container = object;
	}

	@Override
	public Object doGetValue() {
		return valueWrapper.toValue((String) super.doGetValue());
	}

	@Override
	public void doSetValue(Object value) {
		if (value instanceof EObject) {
			//System.out.println(value);
			value = LanguageResource.serializeEObjectSafe((EObject) value, container);
		}
		super.doSetValue(value == null ? "" : value);
	}
}