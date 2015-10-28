package de.uni_paderborn.fujaba.muml.testlanguage.custom.validation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;

import de.uni_paderborn.fujaba.muml.testlanguage.Input;
import de.uni_paderborn.fujaba.muml.testlanguage.Node;
import de.uni_paderborn.fujaba.muml.testlanguage.Output;
import de.uni_paderborn.fujaba.muml.testlanguage.Port;

public class ValidationErrorDialog extends Dialog {

	HashMap<Node, List<IConstraintStatus>> sortedErrors;
	
	protected ValidationErrorDialog(Shell parentShell,
			List<IConstraintStatus> errors) {
		super(parentShell);


		
		// Sort the errors.
		HashMap<Node, List<IConstraintStatus>> sorted = new HashMap<>();
		for (IConstraintStatus status : errors) {

			// Find the targeted node.
			Node target;
			if (status.getTarget() instanceof Node) {
				target = (Node) status.getTarget();
			} else if (status.getTarget() instanceof Input) {
				target = (Node) ((Input) status.getTarget()).getNode();
			} else if (status.getTarget() instanceof Output) {
				target = (Node) ((Output) status.getTarget()).getNode();
			} else {
				continue;
			}

			// Check if there are already statuses for him. If not, create a
			// corresponding list.
			List<IConstraintStatus> list;
			if (!sorted.containsKey(target)) {
				list = new LinkedList<IConstraintStatus>();
				sorted.put(target, list);
			} else {
				list = sorted.get(target);
			}

			// Add the current status to the list.
			list.add(status);
		}

		this.sortedErrors = sorted;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		Label label = new Label(container, SWT.WRAP);
		label.setText("The test case failed. Please refer "
				+ "to the table below or the markers "
				+ "in the diagram for details.");
		label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, true, false));

		final Table table = new Table(container, SWT.BORDER);
		table.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, true));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		String[] titles = { "Node", "Message" };
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(titles[i]);
		}

		Color red = PlatformUI.getWorkbench().getDisplay()
				.getSystemColor(SWT.COLOR_RED);
		for (Node node : this.sortedErrors.keySet()) {
			TableItem nodeItem = new TableItem(table, SWT.NONE);
			nodeItem.setText(0, this.formatLabel(node));

			for (IConstraintStatus status : this.sortedErrors.get(node)) {
				if (status.getTarget() instanceof Node) {
					nodeItem.setText(1, status.getMessage());
					nodeItem.setForeground(1, red);
				} else if (status.getTarget() instanceof Input
						|| status.getTarget() instanceof Output) {
					TableItem item = new TableItem(table, SWT.NONE);
					item.setText(
							0,
							"--- "
									+ this.formatLabel((Port) status
											.getTarget()));
					item.setText(1, status.getMessage());
					item.setForeground(1, red);
				}
			}
		}

		for (int i = 0; i < titles.length; i++) {
			table.getColumn(i).pack();
		}

		return container;
	}

	private String formatLabel(Node node) {
		return node.getLabel();
	}

	private String formatLabel(Port port) {
		String out = "";
		if (port instanceof Input) {
			out += "Input ";
		} else if (port instanceof Output) {
			out += "Output ";
		}
		out += '"' + port.getName() + '"';
		return out;
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Test Case Failed");
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	
	@Override
	protected Button createButton(Composite parent, int id, String label,
			boolean defaultButton) {
	    if (id == IDialogConstants.CANCEL_ID) return null;
	    return super.createButton(parent, id, label, defaultButton);
	}

}
