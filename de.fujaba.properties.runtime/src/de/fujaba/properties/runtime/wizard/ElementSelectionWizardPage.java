package de.fujaba.properties.runtime.wizard;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class ElementSelectionWizardPage extends WizardPage {

	private Object element;
	private TreeViewer treeViewer;
	private AdapterFactory adapterFactory;
	private Collection<?> choices;
	private Collection<Resource> resources = new ArrayList<Resource>();
	private String filter = null;
	private Collection<Object> filteredChoices;
	private Collection<Object> allFilteredChoices = new ArrayList<Object>();
	private Collection<IElementValidator> elementValidators = new ArrayList<IElementValidator>();
	private ViewerFilter treeViewerFilter = new ViewerFilter() {

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			return allFilteredChoices.contains(element);
		}
		
	};
	public static final String MESSAGE_NO_ELEMENTS_FOUND = "No results found";

	public ElementSelectionWizardPage(AdapterFactory adapterFactory, Collection<?> choices) {
		super("Element selection");
		setTitle("Select existing Element");
		setDescription("Select an existing element to be added.");
		this.adapterFactory = adapterFactory;
		this.choices = new ArrayList<Object>(choices);
		this.choices.remove(null);
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

		final Text text = toolkit.createText(form.getBody(), "", SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				setFilter(text.getText());
			}
			
		});

		final Tree tree = toolkit.createTree(form.getBody(), SWT.BORDER);
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
				if (inputElement instanceof Collection) {
					return ((Collection<?>) inputElement).toArray();
				}
				return new Object[] { inputElement };
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
				} else if (element instanceof EObject) {
					return ((EObject) element).eContainer();
				}
				return null;
			}

			@Override
			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}
			
		});
		treeViewer.setLabelProvider(new TreeViewerLabelProvider(adapterFactory));
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object newElement = null;
				if (event.getSelection() instanceof IStructuredSelection
						&& !event.getSelection().isEmpty()) {
					newElement = ((IStructuredSelection) event.getSelection())
							.iterator().next();
				}
				boolean valid = choices.contains(newElement);
				String newError = null;
				for (IElementValidator validator : elementValidators) {
					String validationError = validator.validate(newElement);
					if (validationError != null) {
						newError = validationError;
						break;
					}
				}
				if (newError != null) {
					valid = false;
				}
				setErrorMessage(newError);
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
			if (resources.isEmpty()) {
				treeViewer.setFilters(new ViewerFilter[] { });
				treeViewer.setInput(MESSAGE_NO_ELEMENTS_FOUND);
				treeViewer.getTree().setEnabled(false);
			} else {
				treeViewer.setFilters(new ViewerFilter[] { treeViewerFilter } );
				treeViewer.setInput(resources);
				treeViewer.getTree().setEnabled(true);
			}
			selectFirst();
		}
	}

	private void recalculateFilteredObjects() {
		filteredChoices = new ArrayList<Object>();
		allFilteredChoices = new ArrayList<Object>();
		resources.clear();
		for (Object choice : choices) {
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


	public Object getElement() {
		return element;
	}
	
	
	public interface IElementValidator {
		String validate(Object element);
	}
	
	public void addElementValidator(IElementValidator validator) {
		elementValidators.add(validator);
	}	
	
	public void removeElementValidator(IElementValidator validator) {
		elementValidators.remove(validator);
	}

	private class TreeViewerLabelProvider extends AdapterFactoryLabelProvider implements IColorProvider {

		public TreeViewerLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public String getText(Object object) {
			if (object instanceof String) {
				return (String) object;
			}
			return super.getText(object);
		}
		
		@Override
		public Image getImage(Object object) {
			if (MESSAGE_NO_ELEMENTS_FOUND.equals(object)) {
				return null;
			}
			return super.getImage(object);
		}
		
		@Override
		public Color getForeground(Object object) {
			if (!choices.contains(object)) {
				return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
			}
			return super.getForeground(object);
		}
		
	}
}
