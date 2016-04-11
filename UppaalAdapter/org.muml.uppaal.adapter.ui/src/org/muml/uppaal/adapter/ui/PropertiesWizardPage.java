package org.muml.uppaal.adapter.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.TextAttributeProvider;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.english.Mtctl2English;
import org.muml.uppaal.adapter.mtctl.xtext.ui.properties.MtctlXtextPropertyEditor;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * Displays a set of MTCTL verification properties on a wizard page.
 * Properties can be selected and are displayed in a two-level hierarchy
 */
public class PropertiesWizardPage extends WizardPage {
	protected CheckboxTreeViewer ctv = null;
	protected Button selectAllButton = null;
	protected Button deselectAllButton = null;
	protected Label advisoryLabel = null;
	protected List<Property> properties;
	protected Map<Property, List<Property>> subProperties;
	protected boolean selectOne = false;
	protected Set<Property> selectedProperties = null;
	protected Map<Property, Boolean> propertySatisfied = new HashMap<Property, Boolean>();
	protected String title = null;

	/**
	 * Constructs the page.
	 * 
	 * All passed properties are assumed to be correctly attached to a Repository and indirectly to a VerifiableElement
	 * 
	 * @param title title of the page
	 * @param properties list of top-level properties
	 * @param subProperties mapping each property to a list of its sub-properties
	 */
	public PropertiesWizardPage(String title, List<Property> properties, Map<Property, List<Property>> subProperties) {
		super("Properties", title, null);
		this.properties = properties;
		this.subProperties = subProperties;
		this.title = title;
	}

	@Override
	public void createControl(Composite parent) {
		setTitle(title);
		
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		advisoryLabel = new Label(container, SWT.NONE);
		advisoryLabel.setText("Properties: ");
		
		ctv = new CheckboxTreeViewer(container, SWT.NONE);
		ColumnViewerToolTipSupport.enableFor(ctv);
		ctv.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		ctv.setContentProvider(new PropertiesContentProvider());
		ctv.setLabelProvider(new PropertiesLabelProvider());
		ctv.setInput("root");
		for (Property property : properties)
			ctv.setSubtreeChecked(property, true);
		
		Composite selectButtonComposite = new Composite(container, SWT.NONE);
		selectButtonComposite.setLayout(new GridLayout(2, false));
		
		selectAllButton = new Button(selectButtonComposite, SWT.PUSH);
		selectAllButton.setText("Select all");
		deselectAllButton = new Button(selectButtonComposite, SWT.PUSH);
		deselectAllButton.setText("Deselect all");
	
		selectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Property property : properties) {
					ctv.setSubtreeChecked(property, true);
					selectedProperties.add(property);
				}
			}
		});
		deselectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Property property : properties) {
					ctv.setSubtreeChecked(property, false);
					selectedProperties.add(property);
				}
			}
		});
		
		selectedProperties = new HashSet<Property>();
		for (Object obj : ctv.getCheckedElements())
				selectedProperties.add((Property) obj);
		
		ctv.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				int numChecked = ctv.getCheckedElements().length;
				setPageComplete(!selectOne && numChecked > 0 || selectOne && numChecked == 1);
				
				selectedProperties.clear();
				for (Object obj : ctv.getCheckedElements())
					selectedProperties.add((Property) obj);
			}
		});
		
		if (selectOne)
			setSelectOne(true);
		
		setControl(container);
	}
	
	public boolean isChecked(Property property) {
		if (selectedProperties == null)
			return false;
		return selectedProperties.contains(property); //(cannot just return ctv.getChecked() because we still need to answer after this widget is disposed)
	}
	
	public void setChecked(Property property, boolean state) {
		ctv.setChecked(property, state);
	}
	
	/**
	 * Sets the property to display as satisfied or not
	 * @param property
	 * @param satisfied true, false, or null (for unknown. Default)
	 */
	public void setSatisfied(Property property, Boolean satisfied) {
		propertySatisfied.put(property, satisfied);
		if (satisfied != null) {
			setChecked(property, satisfied);
		}
	}
	
	/**
	 * Sets the editor to either accept exactly one chosen property or arbitrarily many (at least one).
	 * When invoked with "true", unchecks everything
	 */
	public void setSelectOne(boolean state) {
		if (state && ctv != null) {
			for (Property property : properties)
				ctv.setSubtreeChecked(property, false);
		}
		
		selectOne = state;
	}

	
	//Simple ContentProvider that serves the properties and subProperties
	protected class PropertiesContentProvider implements ITreeContentProvider {
		@Override
		public void dispose() {}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}

		@Override
		public Object[] getElements(Object inputElement) {
			return properties.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			try {
				return subProperties.get(parentElement).toArray();
			} catch (NullPointerException e) {
				return new Object[0];
			}
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			return properties.contains(element) && subProperties.get(element) != null && subProperties.get(element).size() > 0;
		}
	}
	
	protected class PropertiesLabelProvider extends StyledCellLabelProvider {
		MtctlXtextPropertyEditor.VerificationPropertyLanguageResource languageResource = new MtctlXtextPropertyEditor.VerificationPropertyLanguageResource(); //to serialize the VerificationProperty
		Injector uiInjector = org.muml.uppaal.adapter.mtctl.xtext.ui.internal.MtctlActivator.getInstance().getInjector("org.muml.uppaal.adapter.mtctl");
		Lexer lexer = uiInjector.getInstance(Key.get(Lexer.class, Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING))); //to parse the serialized String and emit tokens
		AbstractAntlrTokenToAttributeIdMapper tokenToAttributeIdMapper = uiInjector.getInstance(AbstractAntlrTokenToAttributeIdMapper.class); //to map a token id to its attribute id (i.e. the id of its look)
		TextAttributeProvider attributeProvider = uiInjector.getInstance(TextAttributeProvider.class); //to get an attribute style from an attribute id
		
		//Fonts needed for JFace "setBold()" workaround
		Font normal = JFaceResources.getFontRegistry().get(JFaceResources.DIALOG_FONT);
		Font bold = JFaceResources.getFontRegistry().getBold(JFaceResources.DIALOG_FONT);
		Font italic = JFaceResources.getFontRegistry().getItalic(JFaceResources.DIALOG_FONT);
		
		public PropertiesLabelProvider() {
			super(COLORS_ON_SELECTION);
		}
		
		@Override
		public String getToolTipText(Object element) {
			if (propertySatisfied.get((Property) element) != null)
				return new Mtctl2English().propertyWithResult((Property) element, propertySatisfied.get((Property) element)).toString();
			return new Mtctl2English().serializeProperty((Property) element).toString();
		}
		
		//Called by the framework when showing a property
		@Override
		public void update(ViewerCell cell) {
			final Color red = new Color(Display.getCurrent(), 255, 181, 181);
			final Color green = new Color(Display.getCurrent(), 181, 255, 181);
			
			Property obj = (Property) cell.getElement();
			String serializedText = languageResource.serializeEObject(obj, obj.eContainer().eContainer());
			cell.setText(serializedText);
			cell.setStyleRanges(createHighlighting(serializedText));
			if (propertySatisfied.get(obj) != null) {
				cell.setBackground(propertySatisfied.get(obj) ? green : red);
			}
		}
		
		/**
		 * Creates highlighting according to mtctl's definition for a String by parsing it and coloring each parsed token
		 * @param source mtctl language string
		 */
		private StyleRange[] createHighlighting(String source) {
			ArrayList<StyleRange> result = new ArrayList<StyleRange>();
			lexer.setCharStream(new ANTLRStringStream(source));
			
			Token token = null;
			while ((token = lexer.nextToken()).getType() != Token.EOF) {
				TextAttribute attribute = attributeProvider.getAttribute(
						tokenToAttributeIdMapper.getId(token.getType()));
				if (attribute != null)
					result.add(getStyleRange(token.getCharPositionInLine(), token.getText().length(), attribute));
			}
			
			return result.toArray(new StyleRange[result.size()]);
		}
		
		/**
		 * Helper method. Converts a TextAttribute to a StyleRange
		 */
		private StyleRange getStyleRange(int offset, int length, TextAttribute attr) {
			int style= attr.getStyle();
			int fontStyle= style & (SWT.ITALIC | SWT.BOLD | SWT.NORMAL);
			StyleRange styleRange= new StyleRange(offset, length, attr.getForeground(), attr.getBackground(), fontStyle);
			styleRange.strikeout= (style & TextAttribute.STRIKETHROUGH) != 0;
			styleRange.underline= (style & TextAttribute.UNDERLINE) != 0;
			styleRange.font = (fontStyle & SWT.BOLD) != 0 ? bold : (fontStyle & SWT.ITALIC) != 0 ? italic : normal; //workaround needed because the Cell showing this seems to ignore the passed fontStyle for some reason if we just set styleRange.font = null;
			return styleRange;
		}
	}
}
