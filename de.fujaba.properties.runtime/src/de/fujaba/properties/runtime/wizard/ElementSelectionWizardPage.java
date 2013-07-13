package de.fujaba.properties.runtime.wizard;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class ElementSelectionWizardPage extends WizardPage {

	private Object element;
	private TreeViewer treeViewer;
	private AdapterFactory adapterFactory;
	private Collection<?> validChoices;
	private Collection<Resource> resources = new ArrayList<Resource>();
	private String filter = null;
	private Collection<Object> filteredChoices;
	private Collection<Object> allFilteredChoices = new ArrayList<Object>();

	public ElementSelectionWizardPage(AdapterFactory adapterFactory, Collection<?> validChoices) {
		super("Element selection");
		setTitle("Select existing Element");
		setDescription("Select an existing element to be added.");
		this.adapterFactory = adapterFactory;
		this.validChoices = new ArrayList<Object>(validChoices);
		this.validChoices.remove(null);
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new FillLayout(SWT.VERTICAL));
		FormToolkit toolkit = new FormToolkit(container.getDisplay());

		ScrolledForm form = toolkit.createScrolledForm(container);
		// toolkit.paintBordersFor(form);
		// toolkit.decorateFormHeading(form.getForm());
		// form.setText("Eclipse Forms API Example");
		form.getBody().setLayout(new GridLayout(2, false));

		Label label = toolkit.createLabel(form.getBody(), "Search:");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));

		final Text text = toolkit.createText(form.getBody(), "", SWT.NONE);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				setFilter(text.getText());
			}
			
		});

		final Tree tree = toolkit.createTree(form.getBody(), SWT.NONE);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new ITreeContentProvider() {

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return ((Collection<?>) inputElement).toArray();
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof Resource) {
					return ((Resource) parentElement).getContents().toArray();
				} else if (parentElement instanceof EObject) {
					return ((EObject) parentElement).eContents().toArray();
				}
				return new Object[] { };
			}

			@Override
			public Object getParent(Object element) {
				if (element instanceof Resource) {
					return null;
				}
				return ((EObject) element).eContainer();
			}

			@Override
			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}
			
		});
		treeViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return allFilteredChoices.contains(element);
			}
			
		});
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object newElement = null;
				if (event.getSelection() instanceof IStructuredSelection
						&& !event.getSelection().isEmpty()) {
					newElement = ((IStructuredSelection) event.getSelection())
							.iterator().next();
				}
				boolean valid = isValidElement(newElement);
				setPageComplete(valid);

				element = null;
				if (valid) {
					element = newElement;
				}
			}

		});
		tree.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				text.setFocus();
				text.setText(String.valueOf(e.character));
				text.setSelection(1);
				e.doit = false;
			}
		});
		
		treeViewer.setInput(resources);
		setFilter("");
	
		setControl(container);

	}

	public void setFilter(String filter) {
		if (filter == null) {
			filter = "";
		}
		if (this.filter == null || !filter.equals(this.filter)) {
			this.filter = filter;
			recalculateFilteredObjects();
			treeViewer.setInput(resources);
			selectFirst();
		}
	}

	private void recalculateFilteredObjects() {
		filteredChoices = new ArrayList<Object>();
		allFilteredChoices = new ArrayList<Object>();
		resources.clear();
		for (Object choice : validChoices) {
			if (filterSelect(choice)) {
				filteredChoices.add(choice);
				
				if (choice instanceof EObject) {
					EObject element = (EObject) choice;
					if (!resources.contains(element.eResource())) {
						resources.add(element.eResource());
						allFilteredChoices.add(element.eResource());
					}
					do {
						allFilteredChoices.add(element);
						element = element.eContainer();
					} while (element != null);
				}
			}
		}
	}

	private boolean filterSelect(Object choice) {
		if (filter == null || filter.isEmpty()) {
			return true;
		}
		if (false == choice instanceof EObject) {
			return false;
		}
		
		EObject element = (EObject) choice;
		for (EAttribute attribute : element.eClass().getEAllAttributes()) {
			String value = element.eGet(attribute).toString();
			if (value.toLowerCase().contains(filter)) {
				return true;
			}
		}
		
		return false;
	}

	private void selectFirst() {
		if (!filteredChoices.isEmpty()) {
			Object selectedElement = filteredChoices.iterator().next();
			treeViewer.expandAll();
			treeViewer.setSelection(new StructuredSelection(selectedElement), true);
			treeViewer.reveal(selectedElement);
		}
	}

	protected boolean isValidElement(Object newElement) {
		return validChoices.contains(newElement);
	}

	public Object getElement() {
		return element;
	}

}
