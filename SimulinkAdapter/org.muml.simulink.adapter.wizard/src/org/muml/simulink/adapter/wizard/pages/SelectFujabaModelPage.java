package org.muml.simulink.adapter.wizard.pages;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.simulink.adapter.wizard.NameAnalysis;
import org.muml.simulink.adapter.wizard.TransformationWizard;
import org.muml.simulink.adapter.wizard.editors.FujabaSelectionEditor;
import org.muml.simulink.adapter.wizard.transformation.MUMLAnalysis;

public class SelectFujabaModelPage extends WizardPage 
{
	private FujabaSelectionEditor modelEditor = null;
	private RootNode model = null;
	IStructuredSelection selection = null;
	
	//TODO: Externalize Strings and use the same ones in FujabaSelectionEditor
	
	public SelectFujabaModelPage(String pageName, IStructuredSelection selection) 
	{
		super(pageName);
		this.selection = selection;
		this.setPageComplete(false);
		this.setTitle("MechatronicUML Model");
		this.setDescription("Select a MechatronicUML Model");
	}

	@Override
	public void createControl(Composite parent) {
		// top level group
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		
		this.setControl(topLevel);
		
		this.modelEditor = new FujabaSelectionEditor("modelEditor", "MechatronicUML Model", topLevel);
		this.modelEditor.setPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				SelectFujabaModelPage.this.loadFujabaModel();
				SelectFujabaModelPage.this.setPageComplete(true);				
			}});
		
		
		if(selection.getFirstElement() instanceof IFile)
		{
			IFile initial = (IFile) selection.getFirstElement();
			if("fujaba".equals(initial.getFileExtension()) || "muml".equals(initial.getFileExtension()))
					this.modelEditor.setStringValue(initial.getFullPath().toString());
		}		
		
	}
	
	@Override
	public boolean canFlipToNextPage()
	{
		return super.canFlipToNextPage() && !this.modelEditor.getStringValue().isEmpty();
	}
	
	private void loadFujabaModel()
	{	
		String filename = this.modelEditor.getStringValue();
		
		if(!(filename.endsWith(".fujaba") || filename.endsWith(".muml")))
			return;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("fujaba", new XMIResourceFactoryImpl());
		m.put("muml", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(filename), true);

		if(resource.getContents().isEmpty())
			return;
		
		if(!(resource.getContents().get(0) instanceof RootNode))
			return;
		
		// get the root-element and the components-category
		this.model = (RootNode) resource.getContents().get(0);
		
		// Check if GraphViz is installed
		if(!this.checkGraphvizInstalled())
		{
			if(!MessageDialog.openQuestion(getShell(), "Graphviz not installed", 
					"Graphviz is not installed. Transformed charts will not be layouted. Should the model be transformed nevertheless?"))
				{
					this.getShell().close();
					return;
				}			
		}		
		
		// Check if the model contains multi ports
		if(MUMLAnalysis.modelContainsMultiPorts(this.model))
		{
			if(!MessageDialog.openQuestion(getShell(), "Model contains multi-ports", 
					"Transformation of multi-ports and ports which have cardinality with lower bound 0 is not supported in the current version. Should the model be transformed nevertheless?"))
				{
					this.getShell().close();
					return;
				}			
		}
		
		// Check if the model contains parameters of array data type		
		if(MUMLAnalysis.modelContainsArrayParameters(this.model))
		{
			if(!MessageDialog.openQuestion(getShell(), "Model contains message types with ArrayDataType-parameters", 
					"Transformation of message parameters with an ArrayDataType is not supported in the current version. Should the model be transformed nevertheless?"))
				{
					this.getShell().close();
					return;
				}			
		}
		
		// Check if the model contains attributes of array data type	
		if(MUMLAnalysis.modelContainsMultiDimensionalArrayVariables(this.model))
		{
			if(!MessageDialog.openQuestion(getShell(), "Model contains ArrayDataType-attributes", 
					"Transformation of Multidimensional Array Variables is not supported in the current version. Should the model be transformed nevertheless?"))
				{
					this.getShell().close();
					return;
				}			
		}
		
		// Check if the model contains problematic names
		NameAnalysis analysis = new NameAnalysis();
		
		if(analysis.hasProblematicNames(this.model))
		{
			if(MessageDialog.openQuestion(getShell(), "Model contains problematic names", 
					"The selected model contains problematic names. Should they be replaced automatically?"))
				analysis.replaceProblematicNames(model);
		}

		
		if(this.getWizard()instanceof TransformationWizard)
		{
			String name = resource.getURI().trimFileExtension().lastSegment();
			((TransformationWizard)this.getWizard()).setModel(this.model, name);
		}
		
		//Validate Model
		BasicDiagnostic chain = new BasicDiagnostic();
		if(!Diagnostician.INSTANCE.validate(this.model,chain))
		{
			this.setMessage("Selected Model is not valid. The transformation may produce unexpected output.", IMessageProvider.WARNING);
			MessageDialog.openWarning(getShell(), "Invalid Model", "Your selected model does not validate! \n The transformation may produce unexpected output.");
		}			
		
		
	}

	public RootNode getModel() 
	{
		return this.model;
	}
	
	public String getModelFile()
	{
		return this.modelEditor.getStringValue();
	}
	
	private boolean checkGraphvizInstalled()
	{
		try {
			Runtime.getRuntime().exec("fdp -V");
		} catch (IOException e) {
			return false;
		}
		return true;
	}	
}
