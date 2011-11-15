package de.uni_paderborn.fujaba.common.descriptor;

import java.util.Collection;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class DelegatingItemPropertyDescriptor implements
		IItemPropertyDescriptor {

	protected IItemPropertyDescriptor delegation;

	public DelegatingItemPropertyDescriptor(IItemPropertyDescriptor delegation) {
		this.delegation = delegation;
	}

	protected EReference[] getParentReferences(Object object) {
		Object feature = delegation.getFeature(object);
		if (feature instanceof EReference[]) {
			return (EReference[]) feature;
		}
		return null;
	}
	
	@Override
	public Object getPropertyValue(Object object) {
		return delegation.getPropertyValue(object);
	}

	@Override
	public boolean isPropertySet(Object object) {
		return delegation.isPropertySet(object);
	}

	@Override
	public boolean canSetProperty(Object object) {
		return delegation.canSetProperty(object);
	}

	@Override
	public void resetPropertyValue(Object object) {
		delegation.resetPropertyValue(object);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		delegation.setPropertyValue(object, value);
	}

	@Override
	public String getCategory(Object object) {
		return delegation.getCategory(object);
	}

	@Override
	public String getDescription(Object object) {
		return delegation.getDescription(object);
	}

	@Override
	public String getDisplayName(Object object) {
		return delegation.getDisplayName(object);
	}

	@Override
	public String[] getFilterFlags(Object object) {
		return delegation.getFilterFlags(object);
	}

	@Override
	public Object getHelpContextIds(Object object) {
		return delegation.getHelpContextIds(object);
	}

	@Override
	public String getId(Object object) {
		return delegation.getId(object);
	}

	@Override
	public IItemLabelProvider getLabelProvider(Object object) {
		return delegation.getLabelProvider(object);
	}

	@Override
	public boolean isCompatibleWith(Object object, Object anotherObject,
			IItemPropertyDescriptor anotherPropertyDescriptor) {
		return delegation.isCompatibleWith(object, anotherObject,
				anotherPropertyDescriptor);
	}

	@Override
	public Object getFeature(Object object) {
		return delegation.getFeature(object);
	}

	@Override
	public boolean isMany(Object object) {
		return delegation.isMany(object);
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		return delegation.getChoiceOfValues(object);
	}

	@Override
	public boolean isMultiLine(Object object) {
		return delegation.isMultiLine(object);
	}

	@Override
	public boolean isSortChoices(Object object) {
		return delegation.isSortChoices(object);
	}

}
