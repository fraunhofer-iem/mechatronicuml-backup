/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts.impl;

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

import de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class ConnectorInstancePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConnectorInstancePropertiesEditionPart {

	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer connectorType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConnectorInstancePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence connectorInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = connectorInstanceStep.addStep(InstanceViewsRepository.ConnectorInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.ConnectorInstance.Properties.source);
		propertiesStep.addStep(InstanceViewsRepository.ConnectorInstance.Properties.target);
		propertiesStep.addStep(InstanceViewsRepository.ConnectorInstance.Properties.connectorType);
		
		
		composer = new PartComposer(connectorInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.ConnectorInstance.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == InstanceViewsRepository.ConnectorInstance.Properties.source) {
					return createSourceFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.ConnectorInstance.Properties.target) {
					return createTargetFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.ConnectorInstance.Properties.connectorType) {
					return createConnectorTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(InstanceMessages.ConnectorInstancePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createSourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.ConnectorInstancePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ConnectorInstance.Properties.source, InstanceViewsRepository.SWT_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.ConnectorInstance.Properties.source, InstanceViewsRepository.SWT_KIND));
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		source.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConnectorInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.ConnectorInstance.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.setID(InstanceViewsRepository.ConnectorInstance.Properties.source);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ConnectorInstance.Properties.source, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.ConnectorInstancePropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ConnectorInstance.Properties.target, InstanceViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.ConnectorInstance.Properties.target, InstanceViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConnectorInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.ConnectorInstance.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(InstanceViewsRepository.ConnectorInstance.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ConnectorInstance.Properties.target, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createConnectorTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.ConnectorInstancePropertiesEditionPart_ConnectorTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.ConnectorInstance.Properties.connectorType, InstanceViewsRepository.SWT_KIND));
		connectorType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.ConnectorInstance.Properties.connectorType, InstanceViewsRepository.SWT_KIND));
		connectorType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		connectorType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConnectorInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.ConnectorInstance.Properties.connectorType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getConnectorType()));
			}

		});
		GridData connectorTypeData = new GridData(GridData.FILL_HORIZONTAL);
		connectorType.setLayoutData(connectorTypeData);
		connectorType.setID(InstanceViewsRepository.ConnectorInstance.Properties.connectorType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.ConnectorInstance.Properties.connectorType, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#getSource()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#initSource(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#setSource(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#getTarget()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#initTarget(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#setTarget(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#getConnectorType()
	 * 
	 */
	public EObject getConnectorType() {
		if (connectorType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) connectorType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#initConnectorType(EObjectFlatComboSettings)
	 */
	public void initConnectorType(EObjectFlatComboSettings settings) {
		connectorType.setInput(settings);
		if (current != null) {
			connectorType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#setConnectorType(EObject newValue)
	 * 
	 */
	public void setConnectorType(EObject newValue) {
		if (newValue != null) {
			connectorType.setSelection(new StructuredSelection(newValue));
		} else {
			connectorType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#setConnectorTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setConnectorTypeButtonMode(ButtonsModeEnum newValue) {
		connectorType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#addFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConnectorType(ViewerFilter filter) {
		connectorType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.ConnectorInstancePropertiesEditionPart#addBusinessFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConnectorType(ViewerFilter filter) {
		connectorType.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.ConnectorInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
