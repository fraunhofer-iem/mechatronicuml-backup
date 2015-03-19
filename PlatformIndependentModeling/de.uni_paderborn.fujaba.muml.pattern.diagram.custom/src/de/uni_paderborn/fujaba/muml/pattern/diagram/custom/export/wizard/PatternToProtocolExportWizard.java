package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.utilities.batch.BatchDiagramCreationWizard;

/**
 * The export wizard for the pattern to protocol transformation
 * 
 * @author sthiele2
 *
 */
public class PatternToProtocolExportWizard extends AbstractFujabaExportWizard {

	private PatternToProtocolExportWizardPage1 page1;
	private PatternToProtocolExportWizardPage2 page2;
	private ArrayList<CoordinationPattern> patternList = new ArrayList<CoordinationPattern>();

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Transform CoordinationPattern to CoordinationProtocol");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin
				.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
	}

	@Override
	public String wizardGetId() {
		return "de.uni_paderborn.fujaba.export.PatternToProtocolWizard";
	}

	public void addPages() {
		// Source page
		page1 = new PatternToProtocolExportWizardPage1("source", toolkit,
				this.getResourceSet(), this.initialSelection);
		addPage(page1);
		page2 = new PatternToProtocolExportWizardPage2(
				"DefineParameterBinding", toolkit,
				(PatternToProtocolExportWizardPage1) page1);
		addPage(page2);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// final EObject[] sourceElements = page1.getSourceElements();

		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
	}

	/**
	 * Task for finishing the wizard: 1.) fetch the selected Coordination
	 * Pattern and the given Parameter Bindings 2.) check whether the Parameter
	 * Bindings assign correct values to the parameters, create the input for
	 * the transformation 3.) validate the Coordination Pattern, show error
	 * dialog if validation fails 4.) start transformation PatternToProtocol
	 */
	public boolean performFinish() {
		super.performFinish();

		EditingDomain domain = this.getEditingDomain();

		// 1) fetch the selected Coordination Pattern and the given Parameter
		// Bindings
		CoordinationPattern thePattern = null;
		EList<ParameterBinding> bindings = null;
		for (EObject sourceElement : page1.getSourceElements()) {
			if (sourceElement instanceof CoordinationPattern)
				thePattern = (CoordinationPattern) sourceElement;
		}
		// 2)check whether the ParameterBindings assign correct values to the
		// parameters, create the input for the transformation
		bindings = page2.getParameterBindings();
		int bindingSize = (bindings == null) ? 0 : bindings.size();
		EObject[] input = new EObject[bindingSize + 2];

		int i = 0;
		for (ParameterBinding binding : bindings) {
			input[i] = binding;
			i++;
			Expression value = binding.getValue();

			if (!(value instanceof LiteralExpression)
					|| ((LiteralExpression) value).getValue().equals("")) {
				ErrorDialog dialog = new ErrorDialog(
						this.getShell(),
						"ERROR when validating the Parameter Bindings",
						null,
						new org.eclipse.core.runtime.Status(IStatus.ERROR,
								Activator.ID,
								"Each Parameter Binding must bind a value to its Parameter!"),
						IStatus.ERROR);
				dialog.open();
				return false;
			}
			String string = ((LiteralExpression) value).getValue();
			if (!string.equals("false") || !string.equals("true")) {
				try {
					Integer.parseInt(string);
				} catch (NumberFormatException e) {
					ErrorDialog dialog = new ErrorDialog(
							this.getShell(),
							"ERROR when validating the Parameter Bindings",
							null,
							new org.eclipse.core.runtime.Status(
									IStatus.ERROR,
									Activator.ID,
									"Each Parameter Binding must bind a parameter value that is of type integer or boolean!"),
							IStatus.ERROR);
					dialog.open();
					return false;
				}
			}
		}
		input[bindingSize] = thePattern;
		RootNode rootNode = (RootNode) thePattern.eContainer().eContainer();
		input[bindingSize + 1] = rootNode;
		// 3) validate the Coordination Pattern, show error dialog if validation
		// fails
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(page1
				.getSelectedPattern());
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			PatternToProtocolExportWizardDiagnosticDialog dialog = new PatternToProtocolExportWizardDiagnosticDialog(
					this.getShell(),
					"Warning: Validation of Coordination Pattern failed!",
					"The Coordination Pattern does not validate. Press details for further information about the validation errors.",
					diagnostic, Diagnostic.ERROR);
			dialog.open();
			if (dialog.getReturnCode() == PatternToProtocolExportWizardDiagnosticDialog.CANCEL) {
				return false;
			}
		}
		// 4) start transformation PatternToProtocol
		transformPatternToProtocol(domain, rootNode, input, this.getShell(),
				thePattern);
		return true;
	}

	private static void transformPatternToProtocol(EditingDomain editingDomain,
			RootNode rootNode, EObject[] input, Shell shell,
			CoordinationPattern thePattern) {

		// get the protocol category and get the number of protocols within this
		// category
		ModelElementCategory protocolCategory = null;
		for (ModelElementCategory cat : rootNode.getCategories()) {
			if (cat.getKey().contains("protocol")) {
				protocolCategory = cat;
				break;
			}
		}
		int nrOfProtocolsBeforeTranslation = protocolCategory
				.getModelElements().size();

		/*final EObject[] in = input;
		editingDomain.getCommandStack().execute(new ChangeCommand(thePattern) {

			@Override
			protected void doExecute() {

				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.createResource(URI.createPlatformResourceURI("Test/input.xmi", true));
				Collection<EObject> c = Arrays.asList(in);
				resource.getContents().addAll(c);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});*/

		// prepare the input for the transformation, create execution command
		// and execute the command
		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { new BasicModelExtent(Arrays
						.asList(input)) });

		// Load QVTO script PatternToProtocol
		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(
						Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP1, false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute())
			editingDomain.getCommandStack().execute(command);

		// check whether a new protocol was added to the protocol category. If
		// not, do not create any diagrams
		int nrOfProtocolsAfterTranslation = protocolCategory.getModelElements()
				.size();
		if (!(nrOfProtocolsBeforeTranslation < nrOfProtocolsAfterTranslation))
			return;

		CoordinationProtocol newProtocol = (CoordinationProtocol) protocolCategory
				.getModelElements().get(nrOfProtocolsAfterTranslation - 1);

		// save the resource, e.g. the modified modelinstance, such that the
		// changes caused by the transformation are not lost.
		final Resource resource = newProtocol.eResource();
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// check whether there are mtclt constraints
		if (thePattern.getVerificationConstraintRepositories().size() > 1) {
			// create input for the second transformation step.
			EObject[] input2 = new EObject[3];
			input2[0] = thePattern;
			input2[1] = newProtocol;
			input2[2] = thePattern.eContainer().eContainer();
			// second step of the transformation: copy all constraint
			// repositories
			final List<ModelExtent> modelExtents2 = Arrays
					.asList(new ModelExtent[] { new BasicModelExtent(Arrays
							.asList(input2)) });

			// Load QVTO script PatternToProtocol
			final TransformationExecutor transformationExecutor2 = Activator
					.getInstance().getTransformationExecutor(
							Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP2,
							false);

			ExecuteQvtoTransformationCommand command2 = new ExecuteQvtoTransformationCommand(
					transformationExecutor2, modelExtents2);

			if (command2.canExecute())
				editingDomain.getCommandStack().execute(command2);
		}
		// save the resource, e.g. the modified modelinstance, such that the
		// changes caused by the transformation are not lost.

		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// steps to create the diagram files start here
		String finalReportMessage = "Created Diagram of the Coordination Protocol: "
				+ newProtocol.getName()
				+ " and the corresponding realtimestatecharts!";

		// set the elements whose diagrams should be created
		final Collection<EObject> elements = new ArrayList<EObject>();
		elements.add(newProtocol);
		for (Role role : newProtocol.getRoles()) {
			RealtimeStatechart rtsc = (RealtimeStatechart) role.getBehavior();
			if (rtsc != null)
				elements.add(rtsc);
		}
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);

		// run diagram creation
		try {
			dialog.run(true, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {

					BatchDiagramCreationWizard wizard = new BatchDiagramCreationWizard();
					IFile file = getFile(resource);
					IStructuredSelection selection = new StructuredSelection(
							file);
					wizard.init(null, selection);
					wizard.createDiagrams(elements, monitor);
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MessageDialog.openInformation(shell, "Transformation Report",
				finalReportMessage);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		// TODO Auto-generated method stub
		IWizardPage next = super.getNextPage(page);
		if (next == page2)
			page2.refresh();
		return next;
	}

	private static IFile getFile(Resource resource) {

		if (resource != null) {
			org.eclipse.emf.common.util.URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1
					&& "resource".equals(uri.segment(0))) {
				StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}

}
