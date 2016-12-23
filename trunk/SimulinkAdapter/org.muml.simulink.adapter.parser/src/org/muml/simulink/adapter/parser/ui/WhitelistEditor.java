package org.muml.simulink.adapter.parser.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.swt.widgets.Composite;

public class WhitelistEditor extends ListEditor {

	public WhitelistEditor() {
	}

	public WhitelistEditor(String name, String labelText, Composite parent) {
		super(name, labelText, parent);
	}

	@Override
	protected String createList(String[] items) {
		StringBuffer buffer = new StringBuffer();
		for(String string: items)
			buffer.append(string).append('|');
		buffer.setLength(buffer.length() -1);
		return buffer.toString();
	}

	@Override
	protected String getNewInputObject() {
		InputDialog dialog = new InputDialog(getShell(),"Parameter Whitelist","Parameter Name","", null);
		dialog.open();
		return dialog.getValue();
	}

	@Override
	protected String[] parseString(String stringList) {				
		return stringList.split("|");
	}
	
	public Set<String> getWhitelist()
	{
		Set<String> retval = new HashSet<String>();
		
		for(String item: this.getList().getItems())
			retval.add(item);
		return retval;
	}


}
