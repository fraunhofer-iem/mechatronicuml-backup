package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.part.Activator;

/**
 * The export wizard for the pattern to protocol transformation
 * 
 * @author sthiele2
 *
 */
public class ExportWizardPatternToProtocol2 extends AbstractFujabaExportWizard {

	private AbstractFujabaExportSourcePage sourcePage;

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
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit,
				getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName()
						.contains("CoordinationPattern")
						|| element.getClass().getName()
								.contains("LegalConfiguration");
			}

			@Override
			public void validatePage() {
				ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
				Assert.isNotNull(
						elementSelectionMode,
						"Please implement 'wizardGetSupportedSelectionMode()' to provide a non-null selection mode that your fujaba export wizard supports.");

				String errorMessage = null;
				if (elementSelectionMode != ElementSelectionMode.ELEMENT_SELECTION_MODE_NONE
						&& getSourceElements().length == 0) {
					errorMessage = "Please select a domain element.";
				} else {
					ArrayList<LegalConfiguration> selectedLegalConfigurations = new ArrayList<LegalConfiguration>();
					ArrayList<CoordinationPattern> selectedPatterns = new ArrayList<CoordinationPattern>();
					ArrayList<CoordinationPattern> referencedPatterns = new ArrayList<CoordinationPattern>();
					for (Object element : domainElementExtension
							.getCheckedElements()) {
						if (!wizardPageSupportsSourceModelElement((EObject) element)) {
							errorMessage = "Selection contains unsupported elements.";
							break;
						}
						if (element instanceof LegalConfiguration) {
							selectedLegalConfigurations
									.add((LegalConfiguration) element);
							if (!referencedPatterns
									.contains(((LegalConfiguration) element)
											.getCoordinationPattern()))
								referencedPatterns
										.add(((LegalConfiguration) element)
												.getCoordinationPattern());
							else {
								errorMessage = "Only one legal configuration may be selected for the transformation.";
								break;
							}
						}
						if (element instanceof CoordinationPattern)
							selectedPatterns.add((CoordinationPattern) element);
					}
					if (errorMessage == null
							&& elementSelectionMode != ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI
							&& getSourceElements().length > 1) {
						errorMessage = "Multiple source elements are not supported.";
					}
					if (errorMessage == null) {
						if (selectedPatterns.size() != 1)
							errorMessage = "Choose exactly one CoordinationPattern.";
						if (errorMessage == null
								&& selectedLegalConfigurations.size() > 1)
							errorMessage = "Choose at most one LegalConfiguration.";
					}
					if (errorMessage == null) {
						for (LegalConfiguration config : selectedLegalConfigurations) {
							boolean corrspondentPatternSelected = selectedPatterns
									.contains(config.getCoordinationPattern());
							if (!corrspondentPatternSelected) {
								errorMessage = "Selecting a LegalConfiguration requires the selection of the correspondent CoordinationPattern.";
								break;
							}
						}
					}
				}
				setErrorMessage(errorMessage);
				setPageComplete(errorMessage == null);
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI;
			}
		};

		addPage(sourcePage);

	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		final EObject[] sourceElements = sourcePage.getSourceElements();

		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
	}

	public boolean performFinish() {
		super.performFinish();
		System.out.println("Finished Pressed!!");
		EditingDomain domain = this.getEditingDomain();

		CoordinationPattern thePattern = null;
		EList<ParameterBinding> bindings = null;
		for (EObject sourceElement : sourcePage.getSourceElements()) {
			if (sourceElement instanceof CoordinationPattern)
				thePattern = (CoordinationPattern) sourceElement;
			if (sourceElement instanceof LegalConfiguration)
				bindings = ((LegalConfiguration) sourceElement)
						.getParameterBindings();
		}

		transformPatternToProtocol(domain, thePattern, bindings);
		return true;
	}

	private static void transformPatternToProtocol(EditingDomain editingDomain,
			CoordinationPattern pattern, EList<ParameterBinding> bindings) {

		EObject[] input = new EObject[bindings.size() + 1];
		for (int i = 1; i < input.length; i++) {
			input[i] = bindings.get(i - 1);
		}
		input[0] = pattern;
		ModelExtent inputExtent = new BasicModelExtent(

		Arrays.asList(input));

		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		// Load QVTO script
		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(
						Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL, false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

	}

}
