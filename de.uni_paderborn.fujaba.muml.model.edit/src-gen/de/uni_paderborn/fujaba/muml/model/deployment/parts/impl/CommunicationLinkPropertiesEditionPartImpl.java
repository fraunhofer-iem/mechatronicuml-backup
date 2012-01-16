/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.providers.DeploymentMessages;


// End of user code

/**
 * 
 * 
 */
public class CommunicationLinkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CommunicationLinkPropertiesEditionPart {

	protected EObjectFlatComboViewer deployment;
	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer target;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CommunicationLinkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence communicationLinkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = communicationLinkStep.addStep(DeploymentViewsRepository.CommunicationLink.Properties.class);
		propertiesStep.addStep(DeploymentViewsRepository.CommunicationLink.Properties.deployment_);
		propertiesStep.addStep(DeploymentViewsRepository.CommunicationLink.Properties.source);
		propertiesStep.addStep(DeploymentViewsRepository.CommunicationLink.Properties.target);
		
		
		composer = new PartComposer(communicationLinkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DeploymentViewsRepository.CommunicationLink.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DeploymentViewsRepository.CommunicationLink.Properties.deployment_) {
					return createDeploymentFlatComboViewer(parent);
				}
				if (key == DeploymentViewsRepository.CommunicationLink.Properties.source) {
					return createSourceFlatComboViewer(parent);
				}
				if (key == DeploymentViewsRepository.CommunicationLink.Properties.target) {
					return createTargetFlatComboViewer(parent);
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
		propertiesGroup.setText(DeploymentMessages.CommunicationLinkPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createDeploymentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.CommunicationLinkPropertiesEditionPart_DeploymentLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.CommunicationLink.Properties.deployment_, DeploymentViewsRepository.SWT_KIND));
		deployment = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.CommunicationLink.Properties.deployment_, DeploymentViewsRepository.SWT_KIND));
		deployment.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		deployment.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationLinkPropertiesEditionPartImpl.this, DeploymentViewsRepository.CommunicationLink.Properties.deployment_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDeployment()));
			}

		});
		GridData deploymentData = new GridData(GridData.FILL_HORIZONTAL);
		deployment.setLayoutData(deploymentData);
		deployment.setID(DeploymentViewsRepository.CommunicationLink.Properties.deployment_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.CommunicationLink.Properties.deployment_, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.CommunicationLinkPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.CommunicationLink.Properties.source, DeploymentViewsRepository.SWT_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.CommunicationLink.Properties.source, DeploymentViewsRepository.SWT_KIND));
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		source.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationLinkPropertiesEditionPartImpl.this, DeploymentViewsRepository.CommunicationLink.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.setID(DeploymentViewsRepository.CommunicationLink.Properties.source);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.CommunicationLink.Properties.source, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.CommunicationLinkPropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.CommunicationLink.Properties.target, DeploymentViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.CommunicationLink.Properties.target, DeploymentViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationLinkPropertiesEditionPartImpl.this, DeploymentViewsRepository.CommunicationLink.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(DeploymentViewsRepository.CommunicationLink.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.CommunicationLink.Properties.target, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#getDeployment()
	 * 
	 */
	public EObject getDeployment() {
		if (deployment.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) deployment.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#initDeployment(EObjectFlatComboSettings)
	 */
	public void initDeployment(EObjectFlatComboSettings settings) {
		deployment.setInput(settings);
		if (current != null) {
			deployment.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#setDeployment(EObject newValue)
	 * 
	 */
	public void setDeployment(EObject newValue) {
		if (newValue != null) {
			deployment.setSelection(new StructuredSelection(newValue));
		} else {
			deployment.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#setDeploymentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDeploymentButtonMode(ButtonsModeEnum newValue) {
		deployment.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#addFilterDeployment(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDeployment(ViewerFilter filter) {
		deployment.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#addBusinessFilterDeployment(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDeployment(ViewerFilter filter) {
		deployment.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#getSource()
	 * 
	 */
	public EObject getSource() {
		if (source.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) source.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#initSource(EObjectFlatComboSettings)
	 */
	public void initSource(EObjectFlatComboSettings settings) {
		source.setInput(settings);
		if (current != null) {
			source.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#setSource(EObject newValue)
	 * 
	 */
	public void setSource(EObject newValue) {
		if (newValue != null) {
			source.setSelection(new StructuredSelection(newValue));
		} else {
			source.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#getTarget()
	 * 
	 */
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.CommunicationLinkPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DeploymentMessages.CommunicationLink_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
