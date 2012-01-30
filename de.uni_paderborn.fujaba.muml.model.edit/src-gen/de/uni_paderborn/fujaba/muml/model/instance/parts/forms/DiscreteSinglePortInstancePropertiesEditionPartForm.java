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

import de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class DiscreteSinglePortInstancePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DiscreteSinglePortInstancePropertiesEditionPart {

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
	protected EObjectFlatComboViewer multiPortInstance;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DiscreteSinglePortInstancePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence discreteSinglePortInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = discreteSinglePortInstanceStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances);
		propertiesStep.addStep(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance);
		
		
		composer = new PartComposer(discreteSinglePortInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType) {
					return createPortTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance) {
					return createComponentInstanceFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances) {
					return createIncomingConnectorInstancesReferencesTable(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances) {
					return createOutgoingConnectorInstancesReferencesTable(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance) {
					return createMultiPortInstanceFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createPortTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_PortTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType, InstanceViewsRepository.FORM_KIND));
		portType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPortType()));
			}

		});
		portType.setID(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createComponentInstanceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_ComponentInstanceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance, InstanceViewsRepository.FORM_KIND));
		componentInstance = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentInstance()));
			}

		});
		componentInstance.setID(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingConnectorInstancesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingConnectorInstances = new ReferencesTable(InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_IncomingConnectorInstancesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncomingConnectorInstances(); }
			public void handleEdit(EObject element) { editIncomingConnectorInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingConnectorInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingConnectorInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingConnectorInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances, InstanceViewsRepository.FORM_KIND));
		this.incomingConnectorInstances.createControls(parent, widgetFactory);
		this.incomingConnectorInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingConnectorInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		incomingConnectorInstancesData.horizontalSpan = 3;
		this.incomingConnectorInstances.setLayoutData(incomingConnectorInstancesData);
		this.incomingConnectorInstances.disableMove();
		incomingConnectorInstances.setID(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingConnectorInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.outgoingConnectorInstances = new ReferencesTable(InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_OutgoingConnectorInstancesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoingConnectorInstances(); }
			public void handleEdit(EObject element) { editOutgoingConnectorInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingConnectorInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingConnectorInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingConnectorInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances, InstanceViewsRepository.FORM_KIND));
		this.outgoingConnectorInstances.createControls(parent, widgetFactory);
		this.outgoingConnectorInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingConnectorInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingConnectorInstancesData.horizontalSpan = 3;
		this.outgoingConnectorInstances.setLayoutData(outgoingConnectorInstancesData);
		this.outgoingConnectorInstances.disableMove();
		outgoingConnectorInstances.setID(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingConnectorInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMultiPortInstanceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DiscreteSinglePortInstancePropertiesEditionPart_MultiPortInstanceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance, InstanceViewsRepository.FORM_KIND));
		multiPortInstance = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance, InstanceViewsRepository.FORM_KIND));
		widgetFactory.adapt(multiPortInstance);
		multiPortInstance.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData multiPortInstanceData = new GridData(GridData.FILL_HORIZONTAL);
		multiPortInstance.setLayoutData(multiPortInstanceData);
		multiPortInstance.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscreteSinglePortInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMultiPortInstance()));
			}

		});
		multiPortInstance.setID(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#getPortType()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#initPortType(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setPortType(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setPortTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPortTypeButtonMode(ButtonsModeEnum newValue) {
		portType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addFilterPortType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPortType(ViewerFilter filter) {
		portType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addBusinessFilterPortType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPortType(ViewerFilter filter) {
		portType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#getComponentInstance()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#initComponentInstance(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setComponentInstance(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setComponentInstanceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentInstanceButtonMode(ButtonsModeEnum newValue) {
		componentInstance.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addFilterComponentInstance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentInstance(ViewerFilter filter) {
		componentInstance.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addBusinessFilterComponentInstance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentInstance(ViewerFilter filter) {
		componentInstance.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#initIncomingConnectorInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#updateIncomingConnectorInstances()
	 * 
	 */
	public void updateIncomingConnectorInstances() {
	incomingConnectorInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addFilterIncomingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingConnectorInstances(ViewerFilter filter) {
		incomingConnectorInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addBusinessFilterIncomingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectorInstances(ViewerFilter filter) {
		incomingConnectorInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#isContainedInIncomingConnectorInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingConnectorInstancesTable(EObject element) {
		return ((ReferencesTableSettings)incomingConnectorInstances.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#initOutgoingConnectorInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#updateOutgoingConnectorInstances()
	 * 
	 */
	public void updateOutgoingConnectorInstances() {
	outgoingConnectorInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addFilterOutgoingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingConnectorInstances(ViewerFilter filter) {
		outgoingConnectorInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addBusinessFilterOutgoingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectorInstances(ViewerFilter filter) {
		outgoingConnectorInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#isContainedInOutgoingConnectorInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingConnectorInstancesTable(EObject element) {
		return ((ReferencesTableSettings)outgoingConnectorInstances.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#getMultiPortInstance()
	 * 
	 */
	public EObject getMultiPortInstance() {
		if (multiPortInstance.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) multiPortInstance.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#initMultiPortInstance(EObjectFlatComboSettings)
	 */
	public void initMultiPortInstance(EObjectFlatComboSettings settings) {
		multiPortInstance.setInput(settings);
		if (current != null) {
			multiPortInstance.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setMultiPortInstance(EObject newValue)
	 * 
	 */
	public void setMultiPortInstance(EObject newValue) {
		if (newValue != null) {
			multiPortInstance.setSelection(new StructuredSelection(newValue));
		} else {
			multiPortInstance.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#setMultiPortInstanceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMultiPortInstanceButtonMode(ButtonsModeEnum newValue) {
		multiPortInstance.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addFilterMultiPortInstance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMultiPortInstance(ViewerFilter filter) {
		multiPortInstance.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart#addBusinessFilterMultiPortInstance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMultiPortInstance(ViewerFilter filter) {
		multiPortInstance.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.DiscreteSinglePortInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
