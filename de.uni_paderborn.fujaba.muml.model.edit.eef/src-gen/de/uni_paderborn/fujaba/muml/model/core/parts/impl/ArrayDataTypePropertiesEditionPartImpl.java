/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.window.Window;
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

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.providers.CoreMessages;


// End of user code

/**
 * 
 * 
 */
public class ArrayDataTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArrayDataTypePropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected Text cardinality;
	protected Button editCardinality;
	private EList cardinalityList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArrayDataTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence arrayDataTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = arrayDataTypeStep.addStep(CoreViewsRepository.ArrayDataType.Properties.class);
		propertiesStep.addStep(CoreViewsRepository.ArrayDataType.Properties.name);
		propertiesStep.addStep(CoreViewsRepository.ArrayDataType.Properties.comment);
		propertiesStep.addStep(CoreViewsRepository.ArrayDataType.Properties.cardinality);
		
		
		composer = new PartComposer(arrayDataTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreViewsRepository.ArrayDataType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreViewsRepository.ArrayDataType.Properties.name) {
					return createNameText(parent);
				}
				if (key == CoreViewsRepository.ArrayDataType.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == CoreViewsRepository.ArrayDataType.Properties.cardinality) {
					return createCardinalityMultiValuedEditor(parent);
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
		propertiesGroup.setText(CoreMessages.ArrayDataTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.ArrayDataTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.ArrayDataType.Properties.name, CoreViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArrayDataTypePropertiesEditionPartImpl.this, CoreViewsRepository.ArrayDataType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArrayDataTypePropertiesEditionPartImpl.this, CoreViewsRepository.ArrayDataType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CoreViewsRepository.ArrayDataType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.ArrayDataType.Properties.name, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.ArrayDataTypePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.ArrayDataType.Properties.comment, CoreViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArrayDataTypePropertiesEditionPartImpl.this, CoreViewsRepository.ArrayDataType.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArrayDataTypePropertiesEditionPartImpl.this, CoreViewsRepository.ArrayDataType.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, CoreViewsRepository.ArrayDataType.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.ArrayDataType.Properties.comment, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createCardinalityMultiValuedEditor(Composite parent) {
		cardinality = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData cardinalityData = new GridData(GridData.FILL_HORIZONTAL);
		cardinalityData.horizontalSpan = 2;
		cardinality.setLayoutData(cardinalityData);
		EditingUtils.setID(cardinality, CoreViewsRepository.ArrayDataType.Properties.cardinality);
		EditingUtils.setEEFtype(cardinality, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editCardinality = new Button(parent, SWT.NONE);
		editCardinality.setText(CoreMessages.ArrayDataTypePropertiesEditionPart_CardinalityLabel);
		GridData editCardinalityData = new GridData();
		editCardinality.setLayoutData(editCardinalityData);
		editCardinality.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						cardinality.getShell(), "ArrayDataType", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						cardinalityList, CorePackage.eINSTANCE.getArrayDataType_Cardinality().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					cardinalityList = dialog.getResult();
					if (cardinalityList == null) {
						cardinalityList = new BasicEList();
					}
					cardinality.setText(cardinalityList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArrayDataTypePropertiesEditionPartImpl.this, CoreViewsRepository.ArrayDataType.Properties.cardinality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(cardinalityList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editCardinality, CoreViewsRepository.ArrayDataType.Properties.cardinality);
		EditingUtils.setEEFtype(editCardinality, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart#getCardinality()
	 * 
	 */
	public EList getCardinality() {
		return cardinalityList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ArrayDataTypePropertiesEditionPart#setCardinality(EList newValue)
	 * 
	 */
	public void setCardinality(EList newValue) {
		cardinalityList = newValue;
		if (newValue != null) {
			cardinality.setText(cardinalityList.toString());
		} else {
			cardinality.setText(""); //$NON-NLS-1$
		}
	}

	public void addToCardinality(Object newValue) {
		cardinalityList.add(newValue);
		if (newValue != null) {
			cardinality.setText(cardinalityList.toString());
		} else {
			cardinality.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToCardinality(Object newValue) {
		cardinalityList.remove(newValue);
		if (newValue != null) {
			cardinality.setText(cardinalityList.toString());
		} else {
			cardinality.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreMessages.ArrayDataType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
