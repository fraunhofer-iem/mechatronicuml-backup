/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts.impl;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.providers.DeploymentMessages;


// End of user code

/**
 * 
 * 
 */
public class HardwarePortPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, HardwarePortPropertiesEditionPart {

	protected EObjectFlatComboViewer hardwareNode;
	protected EObjectFlatComboViewer outgoingCommunicationLink;
	protected EObjectFlatComboViewer incomingCommunicationLink;
	protected ReferencesTable deployedPortInstance;
	protected List<ViewerFilter> deployedPortInstanceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> deployedPortInstanceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HardwarePortPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hardwarePortStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hardwarePortStep.addStep(DeploymentViewsRepository.HardwarePort.Properties.class);
		propertiesStep.addStep(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode);
		propertiesStep.addStep(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink);
		propertiesStep.addStep(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink);
		propertiesStep.addStep(DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance);
		
		
		composer = new PartComposer(hardwarePortStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DeploymentViewsRepository.HardwarePort.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DeploymentViewsRepository.HardwarePort.Properties.hardwareNode) {
					return createHardwareNodeFlatComboViewer(parent);
				}
				if (key == DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink) {
					return createOutgoingCommunicationLinkFlatComboViewer(parent);
				}
				if (key == DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink) {
					return createIncomingCommunicationLinkFlatComboViewer(parent);
				}
				if (key == DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance) {
					return createDeployedPortInstanceAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(DeploymentMessages.HardwarePortPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createHardwareNodeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.HardwarePortPropertiesEditionPart_HardwareNodeLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode, DeploymentViewsRepository.SWT_KIND));
		hardwareNode = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode, DeploymentViewsRepository.SWT_KIND));
		hardwareNode.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		hardwareNode.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.hardwareNode, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getHardwareNode()));
			}

		});
		GridData hardwareNodeData = new GridData(GridData.FILL_HORIZONTAL);
		hardwareNode.setLayoutData(hardwareNodeData);
		hardwareNode.setID(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.HardwarePort.Properties.hardwareNode, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOutgoingCommunicationLinkFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.HardwarePortPropertiesEditionPart_OutgoingCommunicationLinkLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink, DeploymentViewsRepository.SWT_KIND));
		outgoingCommunicationLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink, DeploymentViewsRepository.SWT_KIND));
		outgoingCommunicationLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		outgoingCommunicationLink.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOutgoingCommunicationLink()));
			}

		});
		GridData outgoingCommunicationLinkData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingCommunicationLink.setLayoutData(outgoingCommunicationLinkData);
		outgoingCommunicationLink.setID(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.HardwarePort.Properties.outgoingCommunicationLink, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createIncomingCommunicationLinkFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.HardwarePortPropertiesEditionPart_IncomingCommunicationLinkLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink, DeploymentViewsRepository.SWT_KIND));
		incomingCommunicationLink = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink, DeploymentViewsRepository.SWT_KIND));
		incomingCommunicationLink.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		incomingCommunicationLink.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getIncomingCommunicationLink()));
			}

		});
		GridData incomingCommunicationLinkData = new GridData(GridData.FILL_HORIZONTAL);
		incomingCommunicationLink.setLayoutData(incomingCommunicationLinkData);
		incomingCommunicationLink.setID(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.HardwarePort.Properties.incomingCommunicationLink, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDeployedPortInstanceAdvancedReferencesTable(Composite parent) {
		this.deployedPortInstance = new ReferencesTable(DeploymentMessages.HardwarePortPropertiesEditionPart_DeployedPortInstanceLabel, new ReferencesTableListener() {
			public void handleAdd() { addDeployedPortInstance(); }
			public void handleEdit(EObject element) { editDeployedPortInstance(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDeployedPortInstance(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDeployedPortInstance(element); }
			public void navigateTo(EObject element) { }
		});
		this.deployedPortInstance.setHelpText(propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance, DeploymentViewsRepository.SWT_KIND));
		this.deployedPortInstance.createControls(parent);
		this.deployedPortInstance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData deployedPortInstanceData = new GridData(GridData.FILL_HORIZONTAL);
		deployedPortInstanceData.horizontalSpan = 3;
		this.deployedPortInstance.setLayoutData(deployedPortInstanceData);
		this.deployedPortInstance.disableMove();
		deployedPortInstance.setID(DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance);
		deployedPortInstance.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDeployedPortInstance() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(deployedPortInstance.getInput(), deployedPortInstanceFilters, deployedPortInstanceBusinessFilters,
		"deployedPortInstance", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				deployedPortInstance.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDeployedPortInstance(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		deployedPortInstance.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDeployedPortInstance(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwarePortPropertiesEditionPartImpl.this, DeploymentViewsRepository.HardwarePort.Properties.deployedPortInstance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		deployedPortInstance.refresh();
	}

	/**
	 * 
	 */
	protected void editDeployedPortInstance(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				deployedPortInstance.refresh();
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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#getHardwareNode()
	 * 
	 */
	public EObject getHardwareNode() {
		if (hardwareNode.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) hardwareNode.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#initHardwareNode(EObjectFlatComboSettings)
	 */
	public void initHardwareNode(EObjectFlatComboSettings settings) {
		hardwareNode.setInput(settings);
		if (current != null) {
			hardwareNode.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#setHardwareNode(EObject newValue)
	 * 
	 */
	public void setHardwareNode(EObject newValue) {
		if (newValue != null) {
			hardwareNode.setSelection(new StructuredSelection(newValue));
		} else {
			hardwareNode.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#setHardwareNodeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setHardwareNodeButtonMode(ButtonsModeEnum newValue) {
		hardwareNode.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addFilterHardwareNode(ViewerFilter filter)
	 * 
	 */
	public void addFilterToHardwareNode(ViewerFilter filter) {
		hardwareNode.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addBusinessFilterHardwareNode(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToHardwareNode(ViewerFilter filter) {
		hardwareNode.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#getOutgoingCommunicationLink()
	 * 
	 */
	public EObject getOutgoingCommunicationLink() {
		if (outgoingCommunicationLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) outgoingCommunicationLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#initOutgoingCommunicationLink(EObjectFlatComboSettings)
	 */
	public void initOutgoingCommunicationLink(EObjectFlatComboSettings settings) {
		outgoingCommunicationLink.setInput(settings);
		if (current != null) {
			outgoingCommunicationLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#setOutgoingCommunicationLink(EObject newValue)
	 * 
	 */
	public void setOutgoingCommunicationLink(EObject newValue) {
		if (newValue != null) {
			outgoingCommunicationLink.setSelection(new StructuredSelection(newValue));
		} else {
			outgoingCommunicationLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#setOutgoingCommunicationLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOutgoingCommunicationLinkButtonMode(ButtonsModeEnum newValue) {
		outgoingCommunicationLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addFilterOutgoingCommunicationLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingCommunicationLink(ViewerFilter filter) {
		outgoingCommunicationLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addBusinessFilterOutgoingCommunicationLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingCommunicationLink(ViewerFilter filter) {
		outgoingCommunicationLink.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#getIncomingCommunicationLink()
	 * 
	 */
	public EObject getIncomingCommunicationLink() {
		if (incomingCommunicationLink.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) incomingCommunicationLink.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#initIncomingCommunicationLink(EObjectFlatComboSettings)
	 */
	public void initIncomingCommunicationLink(EObjectFlatComboSettings settings) {
		incomingCommunicationLink.setInput(settings);
		if (current != null) {
			incomingCommunicationLink.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#setIncomingCommunicationLink(EObject newValue)
	 * 
	 */
	public void setIncomingCommunicationLink(EObject newValue) {
		if (newValue != null) {
			incomingCommunicationLink.setSelection(new StructuredSelection(newValue));
		} else {
			incomingCommunicationLink.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#setIncomingCommunicationLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setIncomingCommunicationLinkButtonMode(ButtonsModeEnum newValue) {
		incomingCommunicationLink.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addFilterIncomingCommunicationLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingCommunicationLink(ViewerFilter filter) {
		incomingCommunicationLink.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addBusinessFilterIncomingCommunicationLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingCommunicationLink(ViewerFilter filter) {
		incomingCommunicationLink.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#initDeployedPortInstance(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDeployedPortInstance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		deployedPortInstance.setContentProvider(contentProvider);
		deployedPortInstance.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#updateDeployedPortInstance()
	 * 
	 */
	public void updateDeployedPortInstance() {
	deployedPortInstance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addFilterDeployedPortInstance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDeployedPortInstance(ViewerFilter filter) {
		deployedPortInstanceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#addBusinessFilterDeployedPortInstance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDeployedPortInstance(ViewerFilter filter) {
		deployedPortInstanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwarePortPropertiesEditionPart#isContainedInDeployedPortInstanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInDeployedPortInstanceTable(EObject element) {
		return ((ReferencesTableSettings)deployedPortInstance.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DeploymentMessages.HardwarePort_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
