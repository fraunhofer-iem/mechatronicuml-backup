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

import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.providers.DeploymentMessages;


// End of user code

/**
 * 
 * 
 */
public class DeploymentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DeploymentPropertiesEditionPart {

	protected EObjectFlatComboViewer componentInstanceConfiguration;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DeploymentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence deployment_Step = new BindingCompositionSequence(propertiesEditionComponent);
		deployment_Step
			.addStep(DeploymentViewsRepository.Deployment_.Properties.class)
			.addStep(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration);
		
		
		composer = new PartComposer(deployment_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DeploymentViewsRepository.Deployment_.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration) {
					return createComponentInstanceConfigurationFlatComboViewer(parent);
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
		propertiesGroup.setText(DeploymentMessages.DeploymentPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createComponentInstanceConfigurationFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DeploymentMessages.DeploymentPropertiesEditionPart_ComponentInstanceConfigurationLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, DeploymentViewsRepository.SWT_KIND));
		componentInstanceConfiguration = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, DeploymentViewsRepository.SWT_KIND));
		componentInstanceConfiguration.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		componentInstanceConfiguration.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeploymentPropertiesEditionPartImpl.this, DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getComponentInstanceConfiguration()));
			}

		});
		GridData componentInstanceConfigurationData = new GridData(GridData.FILL_HORIZONTAL);
		componentInstanceConfiguration.setLayoutData(componentInstanceConfigurationData);
		componentInstanceConfiguration.setID(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, DeploymentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#getComponentInstanceConfiguration()
	 * 
	 */
	public EObject getComponentInstanceConfiguration() {
		if (componentInstanceConfiguration.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) componentInstanceConfiguration.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#initComponentInstanceConfiguration(EObjectFlatComboSettings)
	 */
	public void initComponentInstanceConfiguration(EObjectFlatComboSettings settings) {
		componentInstanceConfiguration.setInput(settings);
		if (current != null) {
			componentInstanceConfiguration.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#setComponentInstanceConfiguration(EObject newValue)
	 * 
	 */
	public void setComponentInstanceConfiguration(EObject newValue) {
		if (newValue != null) {
			componentInstanceConfiguration.setSelection(new StructuredSelection(newValue));
		} else {
			componentInstanceConfiguration.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#setComponentInstanceConfigurationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentInstanceConfigurationButtonMode(ButtonsModeEnum newValue) {
		componentInstanceConfiguration.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#addFilterComponentInstanceConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentInstanceConfiguration(ViewerFilter filter) {
		componentInstanceConfiguration.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#addBusinessFilterComponentInstanceConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentInstanceConfiguration(ViewerFilter filter) {
		componentInstanceConfiguration.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DeploymentMessages.Deployment_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
