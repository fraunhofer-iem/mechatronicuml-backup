/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl;

// Start of user code for imports






import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class DoEventPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DoEventPropertiesEditionPart {

	protected EMFComboViewer kind;
	protected Text periodLower;
	protected Text periodUpper;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DoEventPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence doEventStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = doEventStep.addStep(RealtimestatechartViewsRepository.DoEvent.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.DoEvent.Properties.kind);
		propertiesStep.addStep(RealtimestatechartViewsRepository.DoEvent.Properties.periodLower);
		propertiesStep.addStep(RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper);
		
		
		composer = new PartComposer(doEventStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.DoEvent.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RealtimestatechartViewsRepository.DoEvent.Properties.kind) {
					return createKindEMFComboViewer(parent);
				}
				if (key == RealtimestatechartViewsRepository.DoEvent.Properties.periodLower) {
					return createPeriodLowerText(parent);
				}
				if (key == RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper) {
					return createPeriodUpperText(parent);
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
		propertiesGroup.setText(RealtimestatechartMessages.DoEventPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createKindEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.DoEventPropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.DoEvent.Properties.kind, RealtimestatechartViewsRepository.SWT_KIND));
		kind = new EMFComboViewer(parent);
		kind.setContentProvider(new ArrayContentProvider());
		kind.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.getCombo().setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DoEventPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.DoEvent.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(RealtimestatechartViewsRepository.DoEvent.Properties.kind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.DoEvent.Properties.kind, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeriodLowerText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.DoEventPropertiesEditionPart_PeriodLowerLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.DoEvent.Properties.periodLower, RealtimestatechartViewsRepository.SWT_KIND));
		periodLower = new Text(parent, SWT.BORDER);
		GridData periodLowerData = new GridData(GridData.FILL_HORIZONTAL);
		periodLower.setLayoutData(periodLowerData);
		periodLower.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DoEventPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.DoEvent.Properties.periodLower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, periodLower.getText()));
			}

		});
		periodLower.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DoEventPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.DoEvent.Properties.periodLower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, periodLower.getText()));
				}
			}

		});
		EditingUtils.setID(periodLower, RealtimestatechartViewsRepository.DoEvent.Properties.periodLower);
		EditingUtils.setEEFtype(periodLower, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.DoEvent.Properties.periodLower, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeriodUpperText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.DoEventPropertiesEditionPart_PeriodUpperLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper, RealtimestatechartViewsRepository.SWT_KIND));
		periodUpper = new Text(parent, SWT.BORDER);
		GridData periodUpperData = new GridData(GridData.FILL_HORIZONTAL);
		periodUpper.setLayoutData(periodUpperData);
		periodUpper.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DoEventPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, periodUpper.getText()));
			}

		});
		periodUpper.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DoEventPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, periodUpper.getText()));
				}
			}

		});
		EditingUtils.setID(periodUpper, RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper);
		EditingUtils.setEEFtype(periodUpper, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.DoEvent.Properties.periodUpper, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#getKind()
	 * 
	 */
	public Enumerator getKind() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) kind.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#initKind(EEnum eenum, Enumerator current)
	 */
	public void initKind(EEnum eenum, Enumerator current) {
		kind.setInput(eenum.getELiterals());
		kind.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#setKind(Enumerator newValue)
	 * 
	 */
	public void setKind(Enumerator newValue) {
		kind.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#getPeriodLower()
	 * 
	 */
	public String getPeriodLower() {
		return periodLower.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#setPeriodLower(String newValue)
	 * 
	 */
	public void setPeriodLower(String newValue) {
		if (newValue != null) {
			periodLower.setText(newValue);
		} else {
			periodLower.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#getPeriodUpper()
	 * 
	 */
	public String getPeriodUpper() {
		return periodUpper.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.DoEventPropertiesEditionPart#setPeriodUpper(String newValue)
	 * 
	 */
	public void setPeriodUpper(String newValue) {
		if (newValue != null) {
			periodUpper.setText(newValue);
		} else {
			periodUpper.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.DoEvent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
