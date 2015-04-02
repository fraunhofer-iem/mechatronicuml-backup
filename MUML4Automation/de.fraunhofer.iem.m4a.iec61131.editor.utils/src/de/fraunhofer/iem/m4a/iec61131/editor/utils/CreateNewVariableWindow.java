package de.fraunhofer.iem.m4a.iec61131.editor.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.Reflect;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.command.*;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.DisplayAccess;
import org.eclipse.ui.handlers.HandlerUtil;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CreateNewVariableWindow extends Shell {
	// Variables
	private HashMap<String, EObject> availableContainerTypeElements = new HashMap<String, EObject>();
	private EditingDomain domain;
	
	// WindowBuilder
	private Combo comboContainerType;
	private ISelection selection;
	private Label lblContainerType;
	private Text textName;
	private Text textValue;
	
	/**
	 * Create the shell.
	 * @param display
	 */
	public CreateNewVariableWindow(Display display, ISelection selection) {
		super(display, SWT.SHELL_TRIM);
		
		// Get selected Element in the tree editor
		this.selection = selection;
		// Get the editingDomain
		IEditorPart activeEditorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		domain = ((IEditingDomainProvider)activeEditorPart).getEditingDomain();
		
		Button btnOk = new Button(this, SWT.NONE);
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				String selectedContainerType = comboContainerType.getItem(comboContainerType.getSelectionIndex());
				EObject selectedContainerTypeElement = availableContainerTypeElements.get(selectedContainerType);
				
				CreateNewVariable.createVariable(selectedContainerTypeElement, textName.getText(), textValue.getText(), CreateNewVariableWindow.this.selection);
				dispose();
			}
		});
		btnOk.setBounds(348, 77, 75, 25);
		btnOk.setText("OK");

		comboContainerType = new Combo(this, SWT.NONE);		
		comboContainerType.setEnabled(false);
		comboContainerType.setBounds(107, 10, 317, 23);
		
		
		lblContainerType = new Label(this, SWT.NONE);
		lblContainerType.setBounds(10, 13, 81, 15);
		lblContainerType.setText("Container type:");
		
		textName = new Text(this, SWT.BORDER);
		textName.setBounds(107, 39, 76, 21);
		
		Label lblName = new Label(this, SWT.NONE);
		lblName.setBounds(10, 42, 55, 15);
		lblName.setText("Name:");
		
		textValue = new Text(this, SWT.BORDER);
		textValue.setBounds(348, 39, 76, 21);
		
		Label lblValue = new Label(this, SWT.NONE);
		lblValue.setBounds(287, 42, 55, 15);
		lblValue.setText("Value:");
		
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Create a new Variable");
		setSize(450, 150);

		createComboBoxEntriesContainerType();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	/**
	 * Create the comboBoxEntries for the containerTypes
	 */
	@SuppressWarnings("unchecked")
	protected void createComboBoxEntriesContainerType(){
		Collection<?> newChildDescriptors = null;
		LibraryElement selectedComboElement = null;
		
		comboContainerType.removeAll();
		
		// Get selected element
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			
		    for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
		        Object element = iterator.next();
		        
		        if (element != null & element instanceof LibraryElement) {
		        	selectedComboElement = (LibraryElement)element;
		        	newChildDescriptors = domain.getNewChildDescriptors(selectedComboElement, null);
		    		
		        	// Get all children of the element and add all IOVarDeclarations to the comboBox
		    		for (Object object : newChildDescriptors) {
		    			CommandParameter child = (CommandParameter)object;
		    			if(child.value instanceof IOVarDeclaration && child.value != null && (child.value instanceof InputVarContainer || child.value instanceof OutputVarContainer)){
		    				String name = ((IOVarDeclaration)child.value).eClass().getName();
		    				comboContainerType.add(name);
		    				availableContainerTypeElements.put(name, (IOVarDeclaration)child.value);
		    			}
		    		}
		        }
		    }
		}
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
