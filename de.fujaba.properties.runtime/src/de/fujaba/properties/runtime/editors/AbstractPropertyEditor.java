package de.fujaba.properties.runtime.editors;


public abstract class AbstractPropertyEditor implements
		IPropertyEditor {
	
	private String tab = null;
	
	protected Object input = null;
	
	public AbstractPropertyEditor() {
	}

	@Override
	public void setInput(Object object) {
		if (input != object) {
			input = object;
			inputChanged();
		}
	}
	
	protected void inputChanged() {
		refresh();
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public void refresh() {
	}
	
	@Override
	public void setTab(String tab) {
		this.tab = tab;
	}

	@Override
	public String getTab() {
		return tab;
	}
}
