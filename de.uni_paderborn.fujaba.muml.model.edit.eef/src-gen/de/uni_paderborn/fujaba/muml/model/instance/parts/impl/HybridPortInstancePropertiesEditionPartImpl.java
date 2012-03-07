/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts.impl;

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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class HybridPortInstancePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, HybridPortInstancePropertiesEditionPart {

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
	public HybridPortInstancePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hybridPortInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hybridPortInstanceStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.name);
		propertiesStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.comment);
		propertiesStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.portType);
		propertiesStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.componentInstance);
		propertiesStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances);
		propertiesStep.addStep(InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances);
		
		
		composer = new PartComposer(hybridPortInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.name) {
					return createNameText(parent);
				}
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.portType) {
					return createPortTypeFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.componentInstance) {
					return createComponentInstanceFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances) {
					return createIncomingConnectorInstancesAdvancedReferencesTable(parent);
				}
				if (key == InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances) {
					return createOutgoingConnectorInstancesAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(InstanceMessages.HybridPortInstancePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.HybridPortInstancePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.HybridPortInstance.Properties.name, InstanceViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, InstanceViewsRepository.HybridPortInstance.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.HybridPortInstance.Properties.name, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.HybridPortInstancePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.HybridPortInstance.Properties.comment, InstanceViewsRepository.SWT_KIND));
		comment = new Text(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, InstanceViewsRepository.HybridPortInstance.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.HybridPortInstance.Properties.comment, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPortTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.HybridPortInstancePropertiesEditionPart_PortTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.HybridPortInstance.Properties.portType, InstanceViewsRepository.SWT_KIND));
		portType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.HybridPortInstance.Properties.portType, InstanceViewsRepository.SWT_KIND));
		portType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		portType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.portType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPortType()));
			}

		});
		GridData portTypeData = new GridData(GridData.FILL_HORIZONTAL);
		portType.setLayoutData(portTypeData);
		portType.setID(InstanceViewsRepository.HybridPortInstance.Properties.portType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.HybridPortInstance.Properties.portType, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createComponentInstanceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.HybridPortInstancePropertiesEditionPart_ComponentInstanceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.HybridPortInstance.Properties.componentInstance, InstanceViewsRepository.SWT_KIND));
		componentInstance = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.HybridPortInstance.Properties.componentInstance, InstanceViewsRepository.SWT_KIND));
		componentInstance.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		componentInstance.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.componentInstance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getComponentInstance()));
			}

		});
		GridData componentInstanceData = new GridData(GridData.FILL_HORIZONTAL);
		componentInstance.setLayoutData(componentInstanceData);
		componentInstance.setID(InstanceViewsRepository.HybridPortInstance.Properties.componentInstance);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.HybridPortInstance.Properties.componentInstance, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIncomingConnectorInstancesAdvancedReferencesTable(Composite parent) {
		this.incomingConnectorInstances = new ReferencesTable(InstanceMessages.HybridPortInstancePropertiesEditionPart_IncomingConnectorInstancesLabel, new ReferencesTableListener() {
			public void handleAdd() { addIncomingConnectorInstances(); }
			public void handleEdit(EObject element) { editIncomingConnectorInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingConnectorInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingConnectorInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingConnectorInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances, InstanceViewsRepository.SWT_KIND));
		this.incomingConnectorInstances.createControls(parent);
		this.incomingConnectorInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingConnectorInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		incomingConnectorInstancesData.horizontalSpan = 3;
		this.incomingConnectorInstances.setLayoutData(incomingConnectorInstancesData);
		this.incomingConnectorInstances.disableMove();
		incomingConnectorInstances.setID(InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingConnectorInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.incomingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOutgoingConnectorInstancesAdvancedReferencesTable(Composite parent) {
		this.outgoingConnectorInstances = new ReferencesTable(InstanceMessages.HybridPortInstancePropertiesEditionPart_OutgoingConnectorInstancesLabel, new ReferencesTableListener() {
			public void handleAdd() { addOutgoingConnectorInstances(); }
			public void handleEdit(EObject element) { editOutgoingConnectorInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingConnectorInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingConnectorInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingConnectorInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances, InstanceViewsRepository.SWT_KIND));
		this.outgoingConnectorInstances.createControls(parent);
		this.outgoingConnectorInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingConnectorInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingConnectorInstancesData.horizontalSpan = 3;
		this.outgoingConnectorInstances.setLayoutData(outgoingConnectorInstancesData);
		this.outgoingConnectorInstances.disableMove();
		outgoingConnectorInstances.setID(InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingConnectorInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingConnectorInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HybridPortInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.HybridPortInstance.Properties.outgoingConnectorInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#getPortType()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#initPortType(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#setPortType(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#setPortTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPortTypeButtonMode(ButtonsModeEnum newValue) {
		portType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addFilterPortType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPortType(ViewerFilter filter) {
		portType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addBusinessFilterPortType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPortType(ViewerFilter filter) {
		portType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#getComponentInstance()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#initComponentInstance(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#setComponentInstance(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#setComponentInstanceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentInstanceButtonMode(ButtonsModeEnum newValue) {
		componentInstance.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addFilterComponentInstance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentInstance(ViewerFilter filter) {
		componentInstance.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addBusinessFilterComponentInstance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentInstance(ViewerFilter filter) {
		componentInstance.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#initIncomingConnectorInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#updateIncomingConnectorInstances()
	 * 
	 */
	public void updateIncomingConnectorInstances() {
	incomingConnectorInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addFilterIncomingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingConnectorInstances(ViewerFilter filter) {
		incomingConnectorInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addBusinessFilterIncomingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectorInstances(ViewerFilter filter) {
		incomingConnectorInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#isContainedInIncomingConnectorInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingConnectorInstancesTable(EObject element) {
		return ((ReferencesTableSettings)incomingConnectorInstances.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#initOutgoingConnectorInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#updateOutgoingConnectorInstances()
	 * 
	 */
	public void updateOutgoingConnectorInstances() {
	outgoingConnectorInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addFilterOutgoingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingConnectorInstances(ViewerFilter filter) {
		outgoingConnectorInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#addBusinessFilterOutgoingConnectorInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectorInstances(ViewerFilter filter) {
		outgoingConnectorInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.HybridPortInstancePropertiesEditionPart#isContainedInOutgoingConnectorInstancesTable(EObject element)
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
		return InstanceMessages.HybridPortInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
