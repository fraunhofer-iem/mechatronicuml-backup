package de.uni_paderborn.fujaba.export.pages;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


public abstract class AbstractFujabaExportTargetPage extends WizardDataTransferPage implements IWizardPage {

	protected FormToolkit toolkit;
	protected TreeViewer treeViewer;
	protected Text destinationText;
	
    public AbstractFujabaExportTargetPage(String name, FormToolkit toolkit) {
    	super(name); 
    	this.toolkit = toolkit;
    	setTitle("Select Transformation Target");
        setDescription("Target");
    
    }


//    /**
//     *	The Finish button was pressed.  Try to do the required work now and answer
//     *	a boolean indicating success.  If false is returned then the wizard will
//     *	not close.
//     *
//     *	@return boolean
//     */
//    public boolean finish() {
//       
//        // about to invoke the operation so save our state
//        //saveWidgetValues();
//       }
//
//    /**
//     *	Hook method for saving widget values for restoration by the next instance
//     *	of this class.
//     */
//    protected void internalSaveWidgetValues() {
//        // update directory names history
//        IDialogSettings settings = getDialogSettings();
//        if (settings != null) {
//            String[] directoryNames = settings
//                    .getArray(STORE_DESTINATION_NAMES_ID);
//            if (directoryNames == null) {
//				directoryNames = new String[0];
//			}
//
//            directoryNames = addToHistory(directoryNames, getDestinationValue());
//            settings.put(STORE_DESTINATION_NAMES_ID, directoryNames);
//
//            // options
//            settings.put(STORE_OVERWRITE_EXISTING_FILES_ID,
//                    overwriteExistingFilesCheckbox.getSelection());
//
//            settings.put(STORE_CREATE_STRUCTURE_ID,
//                    createDirectoryStructureButton.getSelection());
//
//        }
//    }

//    /**
//     *	Hook method for restoring widget values to the values that they held
//     *	last time this wizard was used to completion.
//     */
//    protected void restoreWidgetValues() {
//        IDialogSettings settings = getDialogSettings();
//        if (settings != null) {
//            String[] directoryNames = settings
//                    .getArray(STORE_DESTINATION_NAMES_ID);
//            if (directoryNames == null) {
//				return; // ie.- no settings stored
//			}
//
//            // destination
//            setDestinationValue(directoryNames[0]);
//            for (int i = 0; i < directoryNames.length; i++) {
//				addDestinationItem(directoryNames[i]);
//			}
//
//            // options
//            overwriteExistingFilesCheckbox.setSelection(settings
//                    .getBoolean(STORE_OVERWRITE_EXISTING_FILES_ID));
//
//            boolean createDirectories = settings
//                    .getBoolean(STORE_CREATE_STRUCTURE_ID);
//            createDirectoryStructureButton.setSelection(createDirectories);
//            createSelectionOnlyButton.setSelection(!createDirectories);
//        }
//    }

    /**
     *	Answer a boolean indicating whether the receivers destination specification
     *	widgets currently all contain valid values.
     */
    protected boolean validateDestinationGroup() {
        String destinationValue = getDestinationValue();
        if (destinationValue.length() == 0) {
            setMessage(destinationEmptyMessage());
            return false;
        }
        
        setMessage(null);
        return true;
    }

	private String getDestinationValue() {
		return destinationText.getText();
	}

	/**
     * Get the message used to denote an empty destination.
     */
    protected String destinationEmptyMessage() {
    	
        return "Please enter an export destination."; // XXX NLS
    }
//
//    /**
//     * Returns the name of a container with a location that encompasses targetDirectory.
//     * Returns null if there is no conflict.
//     * 
//     * @param targetDirectory the path of the directory to check.
//     * @return the conflicting container name or <code>null</code>
//     */
//    protected String getConflictingContainerNameFor(String targetDirectory) {
//
//        IPath rootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
//        IPath testPath = new Path(targetDirectory);
//        // cannot export into workspace root
//        if(testPath.equals(rootPath))
//        	return rootPath.lastSegment();
//        
//        //Are they the same?
//        if(testPath.matchingFirstSegments(rootPath) == rootPath.segmentCount()){
//        	String firstSegment = testPath.removeFirstSegments(rootPath.segmentCount()).segment(0);
//        	if(!Character.isLetterOrDigit(firstSegment.charAt(0)))
//        		return firstSegment;
//        }
//
//        return null;
//
//    }

    public void validatePage() {
    	URI uri = getDestinationURI();

    	// Decide if the destination is valid...
    	// We support file system and platform URIs.
    	boolean validDestination = false;
    	if (uri != null && uri.isFile()) {
    		File file = new File(uri.toFileString());
    		if (file != null && file.exists()) {
    			validDestination = true;
    		}
    	} else if (uri != null && uri.isPlatformResource()) {
    		String platformString = uri.toPlatformString(true);
    		IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
    		if (iResource.exists()) {
    			validDestination = true;
    		}
    	}
    	
    	// Display error in case destination is invalid.
    	String error = null;
    	if (!validDestination) {
    		error = "Specified destination does not exist.";
    	}
    	setErrorMessage(error);
    	setPageComplete(error == null);
    }
    
	@Override
	public void createControl(Composite parent) {

        initializeDialogUnits(parent);
        
		int sectionStyle = Section.TITLE_BAR
				| Section.CLIENT_INDENT | Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Target Properties");
		Composite composite = toolkit.createComposite(section); 
		section.setClient(composite);

        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
                | GridData.HORIZONTAL_ALIGN_FILL));
        composite.setFont(parent.getFont());

        Tree tree = toolkit.createTree(composite, SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        tree.setLayoutData(gridData);
        
        treeViewer = new TreeViewer(tree);
        treeViewer.setContentProvider(new WorkbenchContentProvider());
        treeViewer.setLabelProvider(new WorkbenchLabelProvider());
        treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
        treeViewer.expandAll();
        
        // Hide files if destination must be a directory
        if (wizardPageDirectoryDestination()) {
	        treeViewer.addFilter(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object element) {
					return !(element instanceof IFile);
				}
	        });
        }
        
        // Hide dot files and closed resources
        treeViewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (element instanceof IProject && !((IProject) element).isOpen()) {
					return false;
				}
				if (((IResource) element).getName().startsWith(".")) {
					return false;
				}
				return true;
			}
        });
        treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				String destination = "";
				if (treeViewer.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
					if (!selection.isEmpty() && selection.getFirstElement() instanceof IResource) {
						IResource resource = (IResource) selection.getFirstElement();
						URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
						destination = uri.toString();
					}
				}
				destinationText.setText(destination);
				validatePage();
			}
        	
        });
        Composite destinationComposite = toolkit.createComposite(composite);
        destinationComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        GridLayout destinationLayout = new GridLayout(2, false);
        destinationLayout.marginWidth = 0;
        destinationLayout.marginLeft = destinationLayout.marginRight = 0;
        destinationComposite.setLayout(destinationLayout);
        destinationText = toolkit.createText(destinationComposite, "", SWT.BORDER);
        destinationText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        destinationText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				validatePage();
			}
        	
        });
        Button browse = toolkit.createButton(destinationComposite, "Filesystem...", SWT.FLAT);
        browse.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	        
        browse.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
				fd.setText("Select target");
				String fileName = fd.open();
				if (fileName == null) {
					return;
				}
				treeViewer.setSelection(new StructuredSelection());
				destinationText.setText(URI.createFileURI(fileName).toString());
				destinationText.setFocus();
				destinationText.setSelection(destinationText.getText().length());
				validatePage();
			}
        });
        
        if (shouldDisplayOptions()) {
	        // Options
			sectionStyle = Section.TITLE_BAR
					| Section.CLIENT_INDENT | Section.EXPANDED | Section.TWISTIE;
			Section optionsSection= toolkit.createSection(composite, sectionStyle);
			optionsSection.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
	                | GridData.HORIZONTAL_ALIGN_FILL));
			optionsSection.setText("Options");
			Composite optionsComposite = toolkit.createComposite(optionsSection); 
			optionsSection.setClient(optionsComposite);
	
			optionsComposite.setLayout(new GridLayout());
			optionsComposite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
	                | GridData.HORIZONTAL_ALIGN_FILL));
			optionsComposite.setFont(parent.getFont());
			createOptions(optionsComposite);
        }
        
	        
//        restoreResourceSpecificationWidgetValues(); // ie.- local
        restoreWidgetValues(); // ie.- subclass hook
//        if (initialResourceSelection != null) {
//			setupBasedOnInitialSelections();
//		}

        updateWidgetEnablements();
        setPageComplete(determinePageCompletion());
        setErrorMessage(null);	// should not initially have error message
        
        setControl(section);
    }

	public void createOptions(Composite parent) {
		toolkit.createButton(parent, "Overwrite existing resources", SWT.CHECK);
	}
	
	protected boolean shouldDisplayOptions() {
		return wizardPageSupportsOverwriteOption();
	}


	@Override
	protected boolean allowNewContainerName() {
		return true;
	}

	@Override
	public void handleEvent(Event event) {
	}

	public abstract boolean wizardPageSupportsOverwriteOption();
	public abstract boolean wizardPageDirectoryDestination();
	
	public URI getDestinationURI() {
		return URI.createURI(getDestinationValue()); 
	}
}
