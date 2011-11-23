package de.uni_paderborn.fujaba.common.descriptor;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public abstract class AbstractItemPropertyDescriptor implements IItemPropertyDescriptor {

	@Override
	public Object getPropertyValue(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPropertySet(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canSetProperty(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPropertyValue(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCategory(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getFilterFlags(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getHelpContextIds(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IItemLabelProvider getLabelProvider(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCompatibleWith(Object object, Object anotherObject,
			IItemPropertyDescriptor anotherPropertyDescriptor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getFeature(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMany(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMultiLine(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSortChoices(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}
