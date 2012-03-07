/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts.impl;

// Start of user code for imports







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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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

import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.parts.NaturalNumberPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.providers.CoreMessages;


// End of user code

/**
 * 
 * 
 */
public class NaturalNumberPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, NaturalNumberPropertiesEditionPart {

	protected Text value;
	protected Button infinity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public NaturalNumberPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence naturalNumberStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = naturalNumberStep.addStep(CoreViewsRepository.NaturalNumber.Properties.class);
		propertiesStep.addStep(CoreViewsRepository.NaturalNumber.Properties.value);
		propertiesStep.addStep(CoreViewsRepository.NaturalNumber.Properties.infinity);
		
		
		composer = new PartComposer(naturalNumberStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreViewsRepository.NaturalNumber.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreViewsRepository.NaturalNumber.Properties.value) {
					return createValueText(parent);
				}
				if (key == CoreViewsRepository.NaturalNumber.Properties.infinity) {
					return createInfinityCheckbox(parent);
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
		propertiesGroup.setText(CoreMessages.NaturalNumberPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createValueText(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.NaturalNumberPropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.NaturalNumber.Properties.value, CoreViewsRepository.SWT_KIND));
		value = new Text(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NaturalNumberPropertiesEditionPartImpl.this, CoreViewsRepository.NaturalNumber.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NaturalNumberPropertiesEditionPartImpl.this, CoreViewsRepository.NaturalNumber.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, CoreViewsRepository.NaturalNumber.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.NaturalNumber.Properties.value, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInfinityCheckbox(Composite parent) {
		infinity = new Button(parent, SWT.CHECK);
		infinity.setText(CoreMessages.NaturalNumberPropertiesEditionPart_InfinityLabel);
		infinity.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NaturalNumberPropertiesEditionPartImpl.this, CoreViewsRepository.NaturalNumber.Properties.infinity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(infinity.getSelection())));
			}

		});
		GridData infinityData = new GridData(GridData.FILL_HORIZONTAL);
		infinityData.horizontalSpan = 2;
		infinity.setLayoutData(infinityData);
		EditingUtils.setID(infinity, CoreViewsRepository.NaturalNumber.Properties.infinity);
		EditingUtils.setEEFtype(infinity, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.NaturalNumber.Properties.infinity, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.NaturalNumberPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.NaturalNumberPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.NaturalNumberPropertiesEditionPart#getInfinity()
	 * 
	 */
	public Boolean getInfinity() {
		return Boolean.valueOf(infinity.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.NaturalNumberPropertiesEditionPart#setInfinity(Boolean newValue)
	 * 
	 */
	public void setInfinity(Boolean newValue) {
		if (newValue != null) {
			infinity.setSelection(newValue.booleanValue());
		} else {
			infinity.setSelection(false);
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreMessages.NaturalNumber_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
