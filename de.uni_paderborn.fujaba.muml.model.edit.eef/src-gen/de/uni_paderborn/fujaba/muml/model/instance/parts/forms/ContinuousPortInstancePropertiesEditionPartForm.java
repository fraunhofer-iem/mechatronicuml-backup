/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts.forms;

// Start of user code for imports





import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class ContinuousPortInstancePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ContinuousPortInstancePropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected EObjectFlatComboViewer portType;
	protected EObjectFlatComboViewer componentInstance;
		protected ReferencesTable incomingConnectorInstances;
		protected List<ViewerFilter> incomingConnectorInstancesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> incomingConnectorInstancesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable outgoingConnectorInstances;
		protected List<ViewerFilter> outgoingConnectorInstancesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outgoingConnectorInstancesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ContinuousPortInstancePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence continuousPortInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = continuousPortInstanceStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.name);
		propertiesStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.comment);
		propertiesStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.portType);
		propertiesStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance);
		propertiesStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances);
		propertiesStep.addStep(InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances);
		
		
		composer = new PartComposer(continuousPortInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.portType) {
					return createPortTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance) {
					return createComponentInstanceFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances) {
					return createIncomingConnectorInstancesReferencesTable(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances) {
					return createOutgoingConnectorInstancesReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(InstanceMessages.ContinuousPortInstancePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.ContinuousPortInstancePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ContinuousPortInstance.Properties.name, InstanceViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, InstanceViewsRepository.ContinuousPortInstance.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ContinuousPortInstance.Properties.name, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.ContinuousPortInstancePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ContinuousPortInstance.Properties.comment, InstanceViewsRepository.FORM_KIND));
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, InstanceViewsRepository.ContinuousPortInstance.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ContinuousPortInstance.Properties.comment, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPortTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.ContinuousPortInstancePropertiesEditionPart_PortTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ContinuousPortInstance.Properties.portType, InstanceViewsRepository.FORM_KIND));
		portType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.ContinuousPortInstance.Properties.portType, InstanceViewsRepository.FORM_KIND));
		widgetFactory.adapt(portType);
		portType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData portTypeData = new GridData(GridData.FILL_HORIZONTAL);
		portType.setLayoutData(portTypeData);
		portType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.portType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPortType()));
			}

		});
		portType.setID(InstanceViewsRepository.ContinuousPortInstance.Properties.portType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ContinuousPortInstance.Properties.portType, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createComponentInstanceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.ContinuousPortInstancePropertiesEditionPart_ComponentInstanceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance, InstanceViewsRepository.FORM_KIND));
		componentInstance = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance, InstanceViewsRepository.FORM_KIND));
		widgetFactory.adapt(componentInstance);
		componentInstance.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData componentInstanceData = new GridData(GridData.FILL_HORIZONTAL);
		componentInstance.setLayoutData(componentInstanceData);
		componentInstance.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentInstance()));
			}

		});
		componentInstance.setID(InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ContinuousPortInstance.Properties.componentInstance, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingConnectorInstancesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingConnectorInstances = new ReferencesTable(InstanceMessages.ContinuousPortInstancePropertiesEditionPart_IncomingConnectorInstancesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncomingConnectorInstances(); }
			public void handleEdit(EObject element) { editIncomingConnectorInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingConnectorInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingConnectorInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingConnectorInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances, InstanceViewsRepository.FORM_KIND));
		this.incomingConnectorInstances.createControls(parent, widgetFactory);
		this.incomingConnectorInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingConnectorInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		incomingConnectorInstancesData.horizontalSpan = 3;
		this.incomingConnectorInstances.setLayoutData(incomingConnectorInstancesData);
		this.incomingConnectorInstances.disableMove();
		incomingConnectorInstances.setID(InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances);
		incomingConnectorInstances.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingConnectorInstances() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingConnectorInstances.getInput(), incomingConnectorInstancesFilters, incomingConnectorInstancesBusinessFilters,
		"incomingConnectorInstances", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingConnectorInstances.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingConnectorInstances(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingConnectorInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingConnectorInstances(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingConnectorInstances.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingConnectorInstancesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoingConnectorInstances = new ReferencesTable(InstanceMessages.ContinuousPortInstancePropertiesEditionPart_OutgoingConnectorInstancesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoingConnectorInstances(); }
			public void handleEdit(EObject element) { editOutgoingConnectorInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingConnectorInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingConnectorInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingConnectorInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances, InstanceViewsRepository.FORM_KIND));
		this.outgoingConnectorInstances.createControls(parent, widgetFactory);
		this.outgoingConnectorInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingConnectorInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingConnectorInstancesData.horizontalSpan = 3;
		this.outgoingConnectorInstances.setLayoutData(outgoingConnectorInstancesData);
		this.outgoingConnectorInstances.disableMove();
		outgoingConnectorInstances.setID(InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances);
		outgoingConnectorInstances.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingConnectorInstances() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingConnectorInstances.getInput(), outgoingConnectorInstancesFilters, outgoingConnectorInstancesBusinessFilters,
		"outgoingConnectorInstances", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingConnectorInstances.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingConnectorInstances(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingConnectorInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContinuousPortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.ContinuousPortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingConnectorInstances(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingConnectorInstances.refresh();
			}
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#getPortType()
	 * 
	 */
	public EObject getPortType() {
		if (portType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) portType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#initPortType(EObjectFlatComboSettings)
	 */
	public void initPortType(EObjectFlatComboSettings settings) {
		portType.setInput(settings);
		if (current != null) {
			portType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#setPortType(EObject newValue)
	 * 
	 */
	public void setPortType(EObject newValue) {
		if (newValue != null) {
			portType.setSelection(new StructuredSelection(newValue));
		} else {
			portType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#setPortTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPortTypeButtonMode(ButtonsModeEnum newValue) {
		portType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addFilterPortType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPortType(ViewerFilter filter) {
		portType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addBusinessFilterPortType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPortType(ViewerFilter filter) {
		portType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#getComponentInstance()
	 * 
	 */
	public EObject getComponentInstance() {
		if (componentInstance.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) componentInstance.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#initComponentInstance(EObjectFlatComboSettings)
	 */
	public void initComponentInstance(EObjectFlatComboSettings settings) {
		componentInstance.setInput(settings);
		if (current != null) {
			componentInstance.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#setComponentInstance(EObject newValue)
	 * 
	 */
	public void setComponentInstance(EObject newValue) {
		if (newValue != null) {
			componentInstance.setSelection(new StructuredSelection(newValue));
		} else {
			componentInstance.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#setComponentInstanceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentInstanceButtonMode(ButtonsModeEnum newValue) {
		componentInstance.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addFilterComponentInstance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentInstance(ViewerFilter filter) {
		componentInstance.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addBusinessFilterComponentInstance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentInstance(ViewerFilter filter) {
		componentInstance.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#initIncomingConnectorInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingConnectorInstances(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingConnectorInstances.setContentProvider(contentProvider);
		incomingConnectorInstances.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#updateIncomingConnectorInstances()
	 * 
	 */
	public void updateIncomingConnectorInstances() {
	incomingConnectorInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addFilterIncomingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingConnectorInstances(ViewerFilter filter) {
		incomingConnectorInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addBusinessFilterIncomingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectorInstances(ViewerFilter filter) {
		incomingConnectorInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#isContainedInIncomingConnectorInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingConnectorInstancesTable(EObject element) {
		return ((ReferencesTableSettings)incomingConnectorInstances.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#initOutgoingConnectorInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoingConnectorInstances(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingConnectorInstances.setContentProvider(contentProvider);
		outgoingConnectorInstances.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#updateOutgoingConnectorInstances()
	 * 
	 */
	public void updateOutgoingConnectorInstances() {
	outgoingConnectorInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addFilterOutgoingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingConnectorInstances(ViewerFilter filter) {
		outgoingConnectorInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#addBusinessFilterOutgoingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectorInstances(ViewerFilter filter) {
		outgoingConnectorInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ContinuousPortInstancePropertiesEditionPart#isContainedInOutgoingConnectorInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingConnectorInstancesTable(EObject element) {
		return ((ReferencesTableSettings)outgoingConnectorInstances.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.ContinuousPortInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
