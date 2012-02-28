/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.pattern.parts.PatternViewsRepository;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.pattern.providers.PatternMessages;


// End of user code

/**
 * 
 * 
 */
public class RoleConnectorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RoleConnectorPropertiesEditionPart {

	protected EObjectFlatComboViewer behavior;
	protected Button bidirectional;
	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer coordinationPattern;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RoleConnectorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence roleConnectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = roleConnectorStep.addStep(PatternViewsRepository.RoleConnector.Properties.class);
		propertiesStep.addStep(PatternViewsRepository.RoleConnector.Properties.behavior);
		propertiesStep.addStep(PatternViewsRepository.RoleConnector.Properties.bidirectional);
		propertiesStep.addStep(PatternViewsRepository.RoleConnector.Properties.source);
		propertiesStep.addStep(PatternViewsRepository.RoleConnector.Properties.target);
		propertiesStep.addStep(PatternViewsRepository.RoleConnector.Properties.coordinationPattern);
		
		
		composer = new PartComposer(roleConnectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PatternViewsRepository.RoleConnector.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == PatternViewsRepository.RoleConnector.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.RoleConnector.Properties.bidirectional) {
					return createBidirectionalCheckbox(parent);
				}
				if (key == PatternViewsRepository.RoleConnector.Properties.source) {
					return createSourceFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.RoleConnector.Properties.target) {
					return createTargetFlatComboViewer(parent);
				}
				if (key == PatternViewsRepository.RoleConnector.Properties.coordinationPattern) {
					return createCoordinationPatternFlatComboViewer(parent);
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
		propertiesGroup.setText(PatternMessages.RoleConnectorPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RoleConnectorPropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.behavior, PatternViewsRepository.SWT_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.behavior, PatternViewsRepository.SWT_KIND));
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleConnectorPropertiesEditionPartImpl.this, PatternViewsRepository.RoleConnector.Properties.behavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.setID(PatternViewsRepository.RoleConnector.Properties.behavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.RoleConnector.Properties.behavior, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBidirectionalCheckbox(Composite parent) {
		bidirectional = new Button(parent, SWT.CHECK);
		bidirectional.setText(PatternMessages.RoleConnectorPropertiesEditionPart_BidirectionalLabel);
		bidirectional.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleConnectorPropertiesEditionPartImpl.this, PatternViewsRepository.RoleConnector.Properties.bidirectional, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(bidirectional.getSelection())));
			}

		});
		GridData bidirectionalData = new GridData(GridData.FILL_HORIZONTAL);
		bidirectionalData.horizontalSpan = 2;
		bidirectional.setLayoutData(bidirectionalData);
		EditingUtils.setID(bidirectional, PatternViewsRepository.RoleConnector.Properties.bidirectional);
		EditingUtils.setEEFtype(bidirectional, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.RoleConnector.Properties.bidirectional, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RoleConnectorPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.source, PatternViewsRepository.SWT_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.source, PatternViewsRepository.SWT_KIND));
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		source.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleConnectorPropertiesEditionPartImpl.this, PatternViewsRepository.RoleConnector.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.setID(PatternViewsRepository.RoleConnector.Properties.source);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.RoleConnector.Properties.source, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RoleConnectorPropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.target, PatternViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.target, PatternViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleConnectorPropertiesEditionPartImpl.this, PatternViewsRepository.RoleConnector.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(PatternViewsRepository.RoleConnector.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.RoleConnector.Properties.target, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCoordinationPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, PatternMessages.RoleConnectorPropertiesEditionPart_CoordinationPatternLabel, propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.coordinationPattern, PatternViewsRepository.SWT_KIND));
		coordinationPattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PatternViewsRepository.RoleConnector.Properties.coordinationPattern, PatternViewsRepository.SWT_KIND));
		coordinationPattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		coordinationPattern.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleConnectorPropertiesEditionPartImpl.this, PatternViewsRepository.RoleConnector.Properties.coordinationPattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCoordinationPattern()));
			}

		});
		GridData coordinationPatternData = new GridData(GridData.FILL_HORIZONTAL);
		coordinationPattern.setLayoutData(coordinationPatternData);
		coordinationPattern.setID(PatternViewsRepository.RoleConnector.Properties.coordinationPattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PatternViewsRepository.RoleConnector.Properties.coordinationPattern, PatternViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#getBehavior()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setBehavior(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#getBidirectional()
	 * 
	 */
	public Boolean getBidirectional() {
		return Boolean.valueOf(bidirectional.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setBidirectional(Boolean newValue)
	 * 
	 */
	public void setBidirectional(Boolean newValue) {
		if (newValue != null) {
			bidirectional.setSelection(newValue.booleanValue());
		} else {
			bidirectional.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#getSource()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#initSource(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setSource(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#getTarget()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#initTarget(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setTarget(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#getCoordinationPattern()
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#initCoordinationPattern(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setCoordinationPattern(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#setCoordinationPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCoordinationPatternButtonMode(ButtonsModeEnum newValue) {
		coordinationPattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addFilterCoordinationPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCoordinationPattern(ViewerFilter filter) {
		coordinationPattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.parts.RoleConnectorPropertiesEditionPart#addBusinessFilterCoordinationPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCoordinationPattern(ViewerFilter filter) {
		coordinationPattern.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PatternMessages.RoleConnector_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
