package org.muml.core.common.descriptor;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public abstract class AbstractItemPropertyDescriptor implements IItemPropertyDescriptor {

	@Override
	public Object getPropertyValue(Object object) {
		return null;
	}

	@Override
	public boolean isPropertySet(Object object) {
		return false;
	}

	@Override
	public boolean canSetProperty(Object object) {
		return false;
	}

	@Override
	public void resetPropertyValue(Object object) {
		
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
	}

	@Override
	public String getCategory(Object object) {
		return null;
	}

	@Override
	public String getDescription(Object object) {
		return null;
	}

	@Override
	public String getDisplayName(Object object) {
		return null;
	}

	@Override
	public String[] getFilterFlags(Object object) {
		return null;
	}

	@Override
	public Object getHelpContextIds(Object object) {
		return null;
	}

	@Override
	public String getId(Object object) {
		return null;
	}

	@Override
	public IItemLabelProvider getLabelProvider(Object object) {
		return null;
	}

	@Override
	public boolean isCompatibleWith(Object object, Object anotherObject,
			IItemPropertyDescriptor anotherPropertyDescriptor) {
		return false;
	}

	@Override
	public Object getFeature(Object object) {
		return null;
	}

	@Override
	public boolean isMany(Object object) {
		return false;
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		return null;
	}

	@Override
	public boolean isMultiLine(Object object) {
		return false;
	}

	@Override
	public boolean isSortChoices(Object object) {
		return false;
	}

}
