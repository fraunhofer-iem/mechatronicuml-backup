/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.forms;

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

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class DiscretePortPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DiscretePortPropertiesEditionPart {

	protected Text name;
	protected Text comment;
		protected ReferencesTable incomingConnectors;
		protected List<ViewerFilter> incomingConnectorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> incomingConnectorsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable outgoingConnectors;
		protected List<ViewerFilter> outgoingConnectorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outgoingConnectorsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer component;
	protected EObjectFlatComboViewer behavior;
	protected EObjectFlatComboViewer refines;
	protected EObjectFlatComboViewer senderMessageInterface;
	protected EObjectFlatComboViewer receiverMessageInterface;
	protected EObjectFlatComboViewer adaptationBehavior;
	protected EObjectFlatComboViewer roleAndAdaptationBehavior;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DiscretePortPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence discretePortStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = discretePortStep.addStep(ComponentViewsRepository.DiscretePort.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.name);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.comment);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.component_);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.behavior);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.refines);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior);
		propertiesStep.addStep(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior);
		
		
		composer = new PartComposer(discretePortStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.DiscretePort.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.incomingConnectors) {
					return createIncomingConnectorsReferencesTable(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors) {
					return createOutgoingConnectorsReferencesTable(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.component_) {
					return createComponentFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.refines) {
					return createRefinesFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface) {
					return createSenderMessageInterfaceFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface) {
					return createReceiverMessageInterfaceFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior) {
					return createAdaptationBehaviorFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior) {
					return createRoleAndAdaptationBehaviorFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ComponentMessages.DiscretePortPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.name, ComponentViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ComponentViewsRepository.DiscretePort.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.name, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.comment, ComponentViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ComponentViewsRepository.DiscretePort.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.comment, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingConnectorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingConnectors = new ReferencesTable(ComponentMessages.DiscretePortPropertiesEditionPart_IncomingConnectorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncomingConnectors(); }
			public void handleEdit(EObject element) { editIncomingConnectors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingConnectors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingConnectors(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingConnectors.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, ComponentViewsRepository.FORM_KIND));
		this.incomingConnectors.createControls(parent, widgetFactory);
		this.incomingConnectors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingConnectorsData = new GridData(GridData.FILL_HORIZONTAL);
		incomingConnectorsData.horizontalSpan = 3;
		this.incomingConnectors.setLayoutData(incomingConnectorsData);
		this.incomingConnectors.disableMove();
		incomingConnectors.setID(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors);
		incomingConnectors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingConnectors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingConnectors.getInput(), incomingConnectorsFilters, incomingConnectorsBusinessFilters,
		"incomingConnectors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingConnectors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingConnectors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingConnectors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.incomingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingConnectors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingConnectors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingConnectorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoingConnectors = new ReferencesTable(ComponentMessages.DiscretePortPropertiesEditionPart_OutgoingConnectorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoingConnectors(); }
			public void handleEdit(EObject element) { editOutgoingConnectors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingConnectors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingConnectors(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingConnectors.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, ComponentViewsRepository.FORM_KIND));
		this.outgoingConnectors.createControls(parent, widgetFactory);
		this.outgoingConnectors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingConnectorsData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingConnectorsData.horizontalSpan = 3;
		this.outgoingConnectors.setLayoutData(outgoingConnectorsData);
		this.outgoingConnectors.disableMove();
		outgoingConnectors.setID(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors);
		outgoingConnectors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingConnectors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingConnectors.getInput(), outgoingConnectorsFilters, outgoingConnectorsBusinessFilters,
		"outgoingConnectors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingConnectors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingConnectors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingConnectors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingConnectors.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingConnectors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingConnectors.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createComponentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_ComponentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.component_, ComponentViewsRepository.FORM_KIND));
		component = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.component_, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(component);
		component.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData componentData = new GridData(GridData.FILL_HORIZONTAL);
		component.setLayoutData(componentData);
		component.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.component_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponent()));
			}

		});
		component.setID(ComponentViewsRepository.DiscretePort.Properties.component_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.component_, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.behavior, ComponentViewsRepository.FORM_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.behavior, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(behavior);
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.behavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		behavior.setID(ComponentViewsRepository.DiscretePort.Properties.behavior);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.behavior, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRefinesFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_RefinesLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.refines, ComponentViewsRepository.FORM_KIND));
		refines = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.refines, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(refines);
		refines.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData refinesData = new GridData(GridData.FILL_HORIZONTAL);
		refines.setLayoutData(refinesData);
		refines.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.refines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRefines()));
			}

		});
		refines.setID(ComponentViewsRepository.DiscretePort.Properties.refines);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.refines, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSenderMessageInterfaceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_SenderMessageInterfaceLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, ComponentViewsRepository.FORM_KIND));
		senderMessageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(senderMessageInterface);
		senderMessageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData senderMessageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		senderMessageInterface.setLayoutData(senderMessageInterfaceData);
		senderMessageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSenderMessageInterface()));
			}

		});
		senderMessageInterface.setID(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReceiverMessageInterfaceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_ReceiverMessageInterfaceLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, ComponentViewsRepository.FORM_KIND));
		receiverMessageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(receiverMessageInterface);
		receiverMessageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData receiverMessageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		receiverMessageInterface.setLayoutData(receiverMessageInterfaceData);
		receiverMessageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReceiverMessageInterface()));
			}

		});
		receiverMessageInterface.setID(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createAdaptationBehaviorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_AdaptationBehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, ComponentViewsRepository.FORM_KIND));
		adaptationBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(adaptationBehavior);
		adaptationBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData adaptationBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		adaptationBehavior.setLayoutData(adaptationBehaviorData);
		adaptationBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAdaptationBehavior()));
			}

		});
		adaptationBehavior.setID(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRoleAndAdaptationBehaviorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DiscretePortPropertiesEditionPart_RoleAndAdaptationBehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, ComponentViewsRepository.FORM_KIND));
		roleAndAdaptationBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(roleAndAdaptationBehavior);
		roleAndAdaptationBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData roleAndAdaptationBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		roleAndAdaptationBehavior.setLayoutData(roleAndAdaptationBehaviorData);
		roleAndAdaptationBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DiscretePortPropertiesEditionPartForm.this, ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRoleAndAdaptationBehavior()));
			}

		});
		roleAndAdaptationBehavior.setID(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initIncomingConnectors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingConnectors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingConnectors.setContentProvider(contentProvider);
		incomingConnectors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#updateIncomingConnectors()
	 * 
	 */
	public void updateIncomingConnectors() {
	incomingConnectors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterIncomingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingConnectors(ViewerFilter filter) {
		incomingConnectorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterIncomingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectors(ViewerFilter filter) {
		incomingConnectorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#isContainedInIncomingConnectorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingConnectorsTable(EObject element) {
		return ((ReferencesTableSettings)incomingConnectors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initOutgoingConnectors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoingConnectors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingConnectors.setContentProvider(contentProvider);
		outgoingConnectors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#updateOutgoingConnectors()
	 * 
	 */
	public void updateOutgoingConnectors() {
	outgoingConnectors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterOutgoingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingConnectors(ViewerFilter filter) {
		outgoingConnectorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterOutgoingConnectors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectors(ViewerFilter filter) {
		outgoingConnectorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#isContainedInOutgoingConnectorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingConnectorsTable(EObject element) {
		return ((ReferencesTableSettings)outgoingConnectors.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getComponent()
	 * 
	 */
	public EObject getComponent() {
		if (component.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) component.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initComponent(EObjectFlatComboSettings)
	 */
	public void initComponent(EObjectFlatComboSettings settings) {
		component.setInput(settings);
		if (current != null) {
			component.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setComponent(EObject newValue)
	 * 
	 */
	public void setComponent(EObject newValue) {
		if (newValue != null) {
			component.setSelection(new StructuredSelection(newValue));
		} else {
			component.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentButtonMode(ButtonsModeEnum newValue) {
		component.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponent(ViewerFilter filter) {
		component.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponent(ViewerFilter filter) {
		component.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getBehavior()
	 * 
	 */
	public EObject getBehavior() {
		if (behavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) behavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
	 */
	public void initBehavior(EObjectFlatComboSettings settings) {
		behavior.setInput(settings);
		if (current != null) {
			behavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setBehavior(EObject newValue)
	 * 
	 */
	public void setBehavior(EObject newValue) {
		if (newValue != null) {
			behavior.setSelection(new StructuredSelection(newValue));
		} else {
			behavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getRefines()
	 * 
	 */
	public EObject getRefines() {
		if (refines.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) refines.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initRefines(EObjectFlatComboSettings)
	 */
	public void initRefines(EObjectFlatComboSettings settings) {
		refines.setInput(settings);
		if (current != null) {
			refines.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRefines(EObject newValue)
	 * 
	 */
	public void setRefines(EObject newValue) {
		if (newValue != null) {
			refines.setSelection(new StructuredSelection(newValue));
		} else {
			refines.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRefinesButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRefinesButtonMode(ButtonsModeEnum newValue) {
		refines.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterRefines(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRefines(ViewerFilter filter) {
		refines.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterRefines(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRefines(ViewerFilter filter) {
		refines.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getSenderMessageInterface()
	 * 
	 */
	public EObject getSenderMessageInterface() {
		if (senderMessageInterface.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) senderMessageInterface.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initSenderMessageInterface(EObjectFlatComboSettings)
	 */
	public void initSenderMessageInterface(EObjectFlatComboSettings settings) {
		senderMessageInterface.setInput(settings);
		if (current != null) {
			senderMessageInterface.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setSenderMessageInterface(EObject newValue)
	 * 
	 */
	public void setSenderMessageInterface(EObject newValue) {
		if (newValue != null) {
			senderMessageInterface.setSelection(new StructuredSelection(newValue));
		} else {
			senderMessageInterface.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		senderMessageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterSenderMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSenderMessageInterface(ViewerFilter filter) {
		senderMessageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterSenderMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSenderMessageInterface(ViewerFilter filter) {
		senderMessageInterface.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getReceiverMessageInterface()
	 * 
	 */
	public EObject getReceiverMessageInterface() {
		if (receiverMessageInterface.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) receiverMessageInterface.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initReceiverMessageInterface(EObjectFlatComboSettings)
	 */
	public void initReceiverMessageInterface(EObjectFlatComboSettings settings) {
		receiverMessageInterface.setInput(settings);
		if (current != null) {
			receiverMessageInterface.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setReceiverMessageInterface(EObject newValue)
	 * 
	 */
	public void setReceiverMessageInterface(EObject newValue) {
		if (newValue != null) {
			receiverMessageInterface.setSelection(new StructuredSelection(newValue));
		} else {
			receiverMessageInterface.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		receiverMessageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterReceiverMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReceiverMessageInterface(ViewerFilter filter) {
		receiverMessageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterReceiverMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReceiverMessageInterface(ViewerFilter filter) {
		receiverMessageInterface.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getAdaptationBehavior()
	 * 
	 */
	public EObject getAdaptationBehavior() {
		if (adaptationBehavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) adaptationBehavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initAdaptationBehavior(EObjectFlatComboSettings)
	 */
	public void initAdaptationBehavior(EObjectFlatComboSettings settings) {
		adaptationBehavior.setInput(settings);
		if (current != null) {
			adaptationBehavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setAdaptationBehavior(EObject newValue)
	 * 
	 */
	public void setAdaptationBehavior(EObject newValue) {
		if (newValue != null) {
			adaptationBehavior.setSelection(new StructuredSelection(newValue));
		} else {
			adaptationBehavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue) {
		adaptationBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdaptationBehavior(ViewerFilter filter) {
		adaptationBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdaptationBehavior(ViewerFilter filter) {
		adaptationBehavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#getRoleAndAdaptationBehavior()
	 * 
	 */
	public EObject getRoleAndAdaptationBehavior() {
		if (roleAndAdaptationBehavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) roleAndAdaptationBehavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#initRoleAndAdaptationBehavior(EObjectFlatComboSettings)
	 */
	public void initRoleAndAdaptationBehavior(EObjectFlatComboSettings settings) {
		roleAndAdaptationBehavior.setInput(settings);
		if (current != null) {
			roleAndAdaptationBehavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRoleAndAdaptationBehavior(EObject newValue)
	 * 
	 */
	public void setRoleAndAdaptationBehavior(EObject newValue) {
		if (newValue != null) {
			roleAndAdaptationBehavior.setSelection(new StructuredSelection(newValue));
		} else {
			roleAndAdaptationBehavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue) {
		roleAndAdaptationBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addFilterRoleAndAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRoleAndAdaptationBehavior(ViewerFilter filter) {
		roleAndAdaptationBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart#addBusinessFilterRoleAndAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRoleAndAdaptationBehavior(ViewerFilter filter) {
		roleAndAdaptationBehavior.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.DiscretePort_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
