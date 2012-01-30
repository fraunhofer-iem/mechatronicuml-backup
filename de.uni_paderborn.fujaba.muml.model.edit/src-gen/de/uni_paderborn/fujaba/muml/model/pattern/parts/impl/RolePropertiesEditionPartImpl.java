/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.pattern.parts.PatternViewsRepository;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.pattern.providers.PatternMessages;


// End of user code

/**
 * 
 * 
 */
public class RolePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RolePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer behavior;
	protected EObjectFlatComboViewer incomingRoleConnector;
	protected EObjectFlatComboViewer coordinationPattern;
	protected EObjectFlatComboViewer senderMessageInterface;
	protected EObjectFlatComboViewer receiverMessageInterface;
	protected ReferencesTable port;
	protected List<ViewerFilter> portBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> portFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer adaptationBehavior;
	protected EObjectFlatComboViewer roleAndAdaptationBehavior;
	protected Button ordered;
	protected EObjectFlatComboViewer orderVariable;
	protected EObjectFlatComboViewer outgoingRoleConnector;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RolePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence roleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = roleStep.addStep(PatternViewsRepository.Role.Properties.class);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.name);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.behavior);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.incomingRoleConnector);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.coordinationPattern);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.senderMessageInterface);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.receiverMessageInterface);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.port);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.adaptationBehavior);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.ordered);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.orderVariable);
		propertiesStep.addStep(PatternViewsRepository.Role.Properties.outgoingRoleConnector);
		
		
		composer = new PartComposer(roleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternViewsRepository.Role.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.name) {
					return createNameText(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.incomingRoleConnector) {
					return createIncomingRoleConnectorFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.coordinationPattern) {
					return createCoordinationPatternFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.senderMessageInterface) {
					return createSenderMessageInterfaceFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.receiverMessageInterface) {
					return createReceiverMessageInterfaceFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.port) {
					return createPortAdvancedReferencesTable(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.adaptationBehavior) {
					return createAdaptationBehaviorFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior) {
					return createRoleAndAdaptationBehaviorFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.ordered) {
					return createOrderedCheckbox(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.orderVariable) {
					return createOrderVariableFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.Role.Properties.outgoingRoleConnector) {
					return createOutgoingRoleConnectorFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(PatternMessages.RolePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.name, PatternViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, PatternViewsRepository.Role.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.name, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.behavior, PatternViewsRepository.SWT_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.behavior, PatternViewsRepository.SWT_KIND));
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.behavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.setID(PatternViewsRepository.Role.Properties.behavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.behavior, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createIncomingRoleConnectorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_IncomingRoleConnectorLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.incomingRoleConnector, PatternViewsRepository.SWT_KIND));
		incomingRoleConnector = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.incomingRoleConnector, PatternViewsRepository.SWT_KIND));
		incomingRoleConnector.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		incomingRoleConnector.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.incomingRoleConnector, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getIncomingRoleConnector()));
			}

		});
		GridData incomingRoleConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		incomingRoleConnector.setLayoutData(incomingRoleConnectorData);
		incomingRoleConnector.setID(PatternViewsRepository.Role.Properties.incomingRoleConnector);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.incomingRoleConnector, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCoordinationPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_CoordinationPatternLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.coordinationPattern, PatternViewsRepository.SWT_KIND));
		coordinationPattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.coordinationPattern, PatternViewsRepository.SWT_KIND));
		coordinationPattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		coordinationPattern.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.coordinationPattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCoordinationPattern()));
			}

		});
		GridData coordinationPatternData = new GridData(GridData.FILL_HORIZONTAL);
		coordinationPattern.setLayoutData(coordinationPatternData);
		coordinationPattern.setID(PatternViewsRepository.Role.Properties.coordinationPattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.coordinationPattern, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSenderMessageInterfaceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_SenderMessageInterfaceLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.senderMessageInterface, PatternViewsRepository.SWT_KIND));
		senderMessageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.senderMessageInterface, PatternViewsRepository.SWT_KIND));
		senderMessageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		senderMessageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.senderMessageInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSenderMessageInterface()));
			}

		});
		GridData senderMessageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		senderMessageInterface.setLayoutData(senderMessageInterfaceData);
		senderMessageInterface.setID(PatternViewsRepository.Role.Properties.senderMessageInterface);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.senderMessageInterface, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReceiverMessageInterfaceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_ReceiverMessageInterfaceLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.receiverMessageInterface, PatternViewsRepository.SWT_KIND));
		receiverMessageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.receiverMessageInterface, PatternViewsRepository.SWT_KIND));
		receiverMessageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		receiverMessageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.receiverMessageInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReceiverMessageInterface()));
			}

		});
		GridData receiverMessageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		receiverMessageInterface.setLayoutData(receiverMessageInterfaceData);
		receiverMessageInterface.setID(PatternViewsRepository.Role.Properties.receiverMessageInterface);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.receiverMessageInterface, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPortAdvancedReferencesTable(Composite parent) {
		this.port = new ReferencesTable(PatternMessages.RolePropertiesEditionPart_PortLabel, new ReferencesTableListener() {
			public void handleAdd() { addPort(); }
			public void handleEdit(EObject element) { editPort(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePort(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPort(element); }
			public void navigateTo(EObject element) { }
		});
		this.port.setHelpText(propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.port, PatternViewsRepository.SWT_KIND));
		this.port.createControls(parent);
		this.port.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.port, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portData = new GridData(GridData.FILL_HORIZONTAL);
		portData.horizontalSpan = 3;
		this.port.setLayoutData(portData);
		this.port.disableMove();
		port.setID(PatternViewsRepository.Role.Properties.port);
		port.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPort() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(port.getInput(), portFilters, portBusinessFilters,
		"port", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.port,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				port.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePort(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.port, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		port.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPort(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.port, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		port.refresh();
	}

	/**
	 * 
	 */
	protected void editPort(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				port.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAdaptationBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_AdaptationBehaviorLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.adaptationBehavior, PatternViewsRepository.SWT_KIND));
		adaptationBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.adaptationBehavior, PatternViewsRepository.SWT_KIND));
		adaptationBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		adaptationBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.adaptationBehavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAdaptationBehavior()));
			}

		});
		GridData adaptationBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		adaptationBehavior.setLayoutData(adaptationBehaviorData);
		adaptationBehavior.setID(PatternViewsRepository.Role.Properties.adaptationBehavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.adaptationBehavior, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRoleAndAdaptationBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_RoleAndAdaptationBehaviorLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior, PatternViewsRepository.SWT_KIND));
		roleAndAdaptationBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior, PatternViewsRepository.SWT_KIND));
		roleAndAdaptationBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		roleAndAdaptationBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRoleAndAdaptationBehavior()));
			}

		});
		GridData roleAndAdaptationBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		roleAndAdaptationBehavior.setLayoutData(roleAndAdaptationBehaviorData);
		roleAndAdaptationBehavior.setID(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrderedCheckbox(Composite parent) {
		ordered = new Button(parent, SWT.CHECK);
		ordered.setText(PatternMessages.RolePropertiesEditionPart_OrderedLabel);
		ordered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.ordered, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(ordered.getSelection())));
			}

		});
		GridData orderedData = new GridData(GridData.FILL_HORIZONTAL);
		orderedData.horizontalSpan = 2;
		ordered.setLayoutData(orderedData);
		EditingUtils.setID(ordered, PatternViewsRepository.Role.Properties.ordered);
		EditingUtils.setEEFtype(ordered, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.ordered, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrderVariableFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_OrderVariableLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.orderVariable, PatternViewsRepository.SWT_KIND));
		orderVariable = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.orderVariable, PatternViewsRepository.SWT_KIND));
		orderVariable.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		orderVariable.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.orderVariable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrderVariable()));
			}

		});
		GridData orderVariableData = new GridData(GridData.FILL_HORIZONTAL);
		orderVariable.setLayoutData(orderVariableData);
		orderVariable.setID(PatternViewsRepository.Role.Properties.orderVariable);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.orderVariable, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOutgoingRoleConnectorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RolePropertiesEditionPart_OutgoingRoleConnectorLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.outgoingRoleConnector, PatternViewsRepository.SWT_KIND));
		outgoingRoleConnector = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.Role.Properties.outgoingRoleConnector, PatternViewsRepository.SWT_KIND));
		outgoingRoleConnector.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		outgoingRoleConnector.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolePropertiesEditionPartImpl.this, PatternViewsRepository.Role.Properties.outgoingRoleConnector, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOutgoingRoleConnector()));
			}

		});
		GridData outgoingRoleConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingRoleConnector.setLayoutData(outgoingRoleConnectorData);
		outgoingRoleConnector.setID(PatternViewsRepository.Role.Properties.outgoingRoleConnector);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.Role.Properties.outgoingRoleConnector, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getBehavior()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setBehavior(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getIncomingRoleConnector()
	 * 
	 */
	public EObject getIncomingRoleConnector() {
		if (incomingRoleConnector.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) incomingRoleConnector.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initIncomingRoleConnector(EObjectFlatComboSettings)
	 */
	public void initIncomingRoleConnector(EObjectFlatComboSettings settings) {
		incomingRoleConnector.setInput(settings);
		if (current != null) {
			incomingRoleConnector.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setIncomingRoleConnector(EObject newValue)
	 * 
	 */
	public void setIncomingRoleConnector(EObject newValue) {
		if (newValue != null) {
			incomingRoleConnector.setSelection(new StructuredSelection(newValue));
		} else {
			incomingRoleConnector.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setIncomingRoleConnectorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setIncomingRoleConnectorButtonMode(ButtonsModeEnum newValue) {
		incomingRoleConnector.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterIncomingRoleConnector(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingRoleConnector(ViewerFilter filter) {
		incomingRoleConnector.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterIncomingRoleConnector(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingRoleConnector(ViewerFilter filter) {
		incomingRoleConnector.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getCoordinationPattern()
	 * 
	 */
	public EObject getCoordinationPattern() {
		if (coordinationPattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) coordinationPattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initCoordinationPattern(EObjectFlatComboSettings)
	 */
	public void initCoordinationPattern(EObjectFlatComboSettings settings) {
		coordinationPattern.setInput(settings);
		if (current != null) {
			coordinationPattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setCoordinationPattern(EObject newValue)
	 * 
	 */
	public void setCoordinationPattern(EObject newValue) {
		if (newValue != null) {
			coordinationPattern.setSelection(new StructuredSelection(newValue));
		} else {
			coordinationPattern.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setCoordinationPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCoordinationPatternButtonMode(ButtonsModeEnum newValue) {
		coordinationPattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterCoordinationPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCoordinationPattern(ViewerFilter filter) {
		coordinationPattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterCoordinationPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCoordinationPattern(ViewerFilter filter) {
		coordinationPattern.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getSenderMessageInterface()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initSenderMessageInterface(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setSenderMessageInterface(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		senderMessageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterSenderMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSenderMessageInterface(ViewerFilter filter) {
		senderMessageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterSenderMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSenderMessageInterface(ViewerFilter filter) {
		senderMessageInterface.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getReceiverMessageInterface()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initReceiverMessageInterface(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setReceiverMessageInterface(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		receiverMessageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterReceiverMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReceiverMessageInterface(ViewerFilter filter) {
		receiverMessageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterReceiverMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReceiverMessageInterface(ViewerFilter filter) {
		receiverMessageInterface.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initPort(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPort(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		port.setContentProvider(contentProvider);
		port.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#updatePort()
	 * 
	 */
	public void updatePort() {
	port.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPort(ViewerFilter filter) {
		portFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPort(ViewerFilter filter) {
		portBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#isContainedInPortTable(EObject element)
	 * 
	 */
	public boolean isContainedInPortTable(EObject element) {
		return ((ReferencesTableSettings)port.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getAdaptationBehavior()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initAdaptationBehavior(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setAdaptationBehavior(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue) {
		adaptationBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAdaptationBehavior(ViewerFilter filter) {
		adaptationBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAdaptationBehavior(ViewerFilter filter) {
		adaptationBehavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getRoleAndAdaptationBehavior()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initRoleAndAdaptationBehavior(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setRoleAndAdaptationBehavior(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue) {
		roleAndAdaptationBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterRoleAndAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRoleAndAdaptationBehavior(ViewerFilter filter) {
		roleAndAdaptationBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterRoleAndAdaptationBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRoleAndAdaptationBehavior(ViewerFilter filter) {
		roleAndAdaptationBehavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getOrdered()
	 * 
	 */
	public Boolean getOrdered() {
		return Boolean.valueOf(ordered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setOrdered(Boolean newValue)
	 * 
	 */
	public void setOrdered(Boolean newValue) {
		if (newValue != null) {
			ordered.setSelection(newValue.booleanValue());
		} else {
			ordered.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getOrderVariable()
	 * 
	 */
	public EObject getOrderVariable() {
		if (orderVariable.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) orderVariable.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initOrderVariable(EObjectFlatComboSettings)
	 */
	public void initOrderVariable(EObjectFlatComboSettings settings) {
		orderVariable.setInput(settings);
		if (current != null) {
			orderVariable.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setOrderVariable(EObject newValue)
	 * 
	 */
	public void setOrderVariable(EObject newValue) {
		if (newValue != null) {
			orderVariable.setSelection(new StructuredSelection(newValue));
		} else {
			orderVariable.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setOrderVariableButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrderVariableButtonMode(ButtonsModeEnum newValue) {
		orderVariable.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterOrderVariable(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrderVariable(ViewerFilter filter) {
		orderVariable.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterOrderVariable(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrderVariable(ViewerFilter filter) {
		orderVariable.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#getOutgoingRoleConnector()
	 * 
	 */
	public EObject getOutgoingRoleConnector() {
		if (outgoingRoleConnector.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) outgoingRoleConnector.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#initOutgoingRoleConnector(EObjectFlatComboSettings)
	 */
	public void initOutgoingRoleConnector(EObjectFlatComboSettings settings) {
		outgoingRoleConnector.setInput(settings);
		if (current != null) {
			outgoingRoleConnector.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setOutgoingRoleConnector(EObject newValue)
	 * 
	 */
	public void setOutgoingRoleConnector(EObject newValue) {
		if (newValue != null) {
			outgoingRoleConnector.setSelection(new StructuredSelection(newValue));
		} else {
			outgoingRoleConnector.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#setOutgoingRoleConnectorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOutgoingRoleConnectorButtonMode(ButtonsModeEnum newValue) {
		outgoingRoleConnector.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addFilterOutgoingRoleConnector(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingRoleConnector(ViewerFilter filter) {
		outgoingRoleConnector.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart#addBusinessFilterOutgoingRoleConnector(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingRoleConnector(ViewerFilter filter) {
		outgoingRoleConnector.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternMessages.Role_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
