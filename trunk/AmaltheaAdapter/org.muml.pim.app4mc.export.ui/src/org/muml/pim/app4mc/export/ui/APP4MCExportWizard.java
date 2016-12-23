/*******************************************************************************
 * Copyright (c) 2016 Fraunhofer IEM.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Schmelter - initial implementation
 *******************************************************************************/
package org.muml.pim.app4mc.export.ui;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResource;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.ui.IWorkbench;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.AbstractFujabaExportTargetPage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.app4mc.export.edit.commands.ClearAMALTHEAModelCommand;
import org.muml.pim.app4mc.export.edit.commands.ClearMUMLRunnablesCommand;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.runnable.Runnable;

/**
 * MechatroniclUML export wizard that 1) generates {@link Runnable}s and
 * runnable information by means of an in-place qvto transformation 2) generates
 * an {@link Amalthea} {@link SWModel} from the resulting MechatronicUML model.
 * 
 * @author David Schmelter
 */
public class APP4MCExportWizard extends AbstractFujabaExportWizard {

	/**
	 * Page for selecting the {@link ComponentInstanceConfiguration}
	 */
	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportTargetPage targetPage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.muml.core.export.wizard.AbstractFujabaExportWizard#wizardGetId()
	 */
	@Override
	public String wizardGetId() {
		return Activator.PLUGIN_ID + ".wizard";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.muml.core.export.pages.AbstractFujabaExportSourcePage#
			 * wizardPageGetSourceFileExtension()
			 */
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.muml.core.export.pages.AbstractFujabaExportSourcePage#
			 * wizardPageSupportsSourceModelElement(org.eclipse.emf.ecore.
			 * EObject)
			 */
			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {

				// we are filtering for {@link ComponentInstanceConfiguration}s.
				return element instanceof ComponentInstanceConfiguration;
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.muml.core.export.pages.AbstractFujabaExportSourcePage#
			 * wizardPageGetSupportedSelectionMode()
			 */
			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				// TODO finalize support/testing for transformation multiple
				// CICs at once (should work in general already).
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

		};
		addPage(sourcePage);

		// Target page
		targetPage = new AbstractFujabaExportTargetPage("target", toolkit) {

			public final static String DESTINATION_KEY = "destination";

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.muml.core.export.pages.AbstractFujabaExportTargetPage#
			 * wizardPageSupportsOverwriteOption()
			 */
			@Override
			public boolean wizardPageSupportsOverwriteOption() {
				return false;
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.muml.core.export.pages.AbstractFujabaExportTargetPage#
			 * wizardPageDirectoryDestination()
			 */
			@Override
			public boolean wizardPageDirectoryDestination() {
				return false;
			}

			public void validatePage() {

				final URI uri = getDestinationURI();

				// check if the destination is valid...
				boolean validDestination = false;
				if (uri != null && uri.isFile()) {
					File file = new File(uri.toFileString());
					if (file != null && file.getAbsolutePath().endsWith("amxmi")) {
						validDestination = true;
					}
				} else if (uri != null && uri.isPlatformResource()) {
					String platformString = uri.toPlatformString(true);
					if (platformString != null && platformString.endsWith("amxmi")) {
						validDestination = true;
					}
				}

				// Display error in case destination is invalid.
				String error = null;
				if (!validDestination) {
					// TODO externalize strings
					error = "Target model name must end with *.amxmi";
				}
				setErrorMessage(error);
				setPageComplete(error == null);
			}

			@Override
			public void restoreWidgetValues() {
				super.restoreWidgetValues();
				final IDialogSettings settings = getDialogSettings();
				if (settings != null && settings.get(DESTINATION_KEY) != null) {
					// TODO support serialization of selected CIC - implement
					// feature in super class?
					destinationText.setText(settings.get(DESTINATION_KEY));
				}
			}

			@Override
			public void saveWidgetValues() {
				super.saveWidgetValues();
				final IDialogSettings settings = getDialogSettings();
				if (settings != null && destinationText != null) {
					// TODO support serialization of selected CIC - implement
					// feature in super class?
					settings.put(DESTINATION_KEY, destinationText.getText());
				}
			}
		};
		addPage(targetPage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.muml.core.export.wizard.AbstractFujabaExportWizard#init(org.eclipse.
	 * ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		// TODO externalize strings
		setWindowTitle("Generate APP4MC Model");
		setDefaultPageImageDescriptor(
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/app4mc-logo-16.png"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.muml.core.export.wizard.AbstractFujabaExportWizard#
	 * wizardCreateExportOperation()
	 */
	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {

		final EObject[] sourceElements = sourcePage.getSourceElements();
		final URI amaltheaTarget = targetPage.getDestinationURI();

		return new AbstractFujabaExportOperation() {

			private TransactionalEditingDomain ted;

			protected void clearMUMLModel(RootNode rootNode) {
				// removes the runnable category from the MechatronicUML model
				ted.getCommandStack().execute(new ClearMUMLRunnablesCommand(rootNode));
			}

			protected void clearAmaltheaModel(Amalthea amalthea) {
				// removes the software model from the Amalthea model
				ted.getCommandStack().execute(new ClearAMALTHEAModelCommand(amalthea));
			}

			protected void saveResource(EObject e) {
				try {
					ted.getResourceSet().getResource(e.eResource().getURI(), true).save(Collections.EMPTY_MAP);
				} catch (IOException ioe) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, ioe.getMessage(), ioe);
					Activator.getDefault().getLog().log(status);
				}
			}

			protected Amalthea initializeAmaltheaModel(URI amaltheaURI) {

				Amalthea amalthea = null;
				AmaltheaResource amaltheaResource = null;
				boolean resourceExists = false;

				if (amaltheaURI.isPlatformResource() && ResourcesPlugin.getWorkspace().getRoot()
						.findMember(amaltheaURI.toPlatformString(false)) != null) {
					resourceExists = true;
				} else if (amaltheaURI.isFile()) {
					File file = new File(amaltheaURI.toFileString());
					if (file.exists()) {
						resourceExists = true;
					}
				}

				// initialize the Amalthea resource. If it exists, load it...
				if (resourceExists) {
					try {
						amaltheaResource = (AmaltheaResource) ted.getResourceSet().getResource(amaltheaURI, true);
						amaltheaResource.load(Collections.EMPTY_MAP);
						if (amaltheaResource.getContents().size() > 0) {
							amalthea = (Amalthea) amaltheaResource.getContents().get(0);
						}
					} catch (IOException ioe) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, ioe.getMessage(), ioe);
						Activator.getDefault().getLog().log(status);
					}
				}
				// ...otherwise, create a new Resource
				else {
					amaltheaResource = (AmaltheaResource) new AmaltheaResourceFactory().createResource(amaltheaURI);
					final AmaltheaResource ar = amaltheaResource;
					ted.getCommandStack().execute(new ChangeCommand(Collections.emptyList()) {
						@Override
						protected void doExecute() {
							ted.getResourceSet().getResources().add(ar);
						}
					});
				}

				// instantiate the Amalthea model if it's not available
				if (amalthea == null) {
					amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();

					final Amalthea a = amalthea;
					final AmaltheaResource ar = amaltheaResource;
					ted.getCommandStack().execute(new ChangeCommand(Collections.emptyList()) {
						@Override
						protected void doExecute() {
							ar.getContents().add(a);
						}
					});

					saveResource(amalthea);
				}

				return amalthea;
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.muml.core.export.operation.AbstractFujabaExportOperation#
			 * doExecute(org.eclipse.core.runtime.IProgressMonitor)
			 */
			@Override
			protected IStatus doExecute(IProgressMonitor monitor) {

				final SubMonitor subMonitor = SubMonitor.convert(monitor, sourceElements.length * 2 + 1);

				final RootNode rootNode = (RootNode) EcoreUtil.getRootContainer(sourceElements[0]);
				ted = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(rootNode);

				// step 1: clear the MechatronicUML model, i.e., remove the
				// runnable category
				clearMUMLModel(rootNode);
				saveResource(rootNode);

				subMonitor.split(1);

				final Amalthea amalthea = initializeAmaltheaModel(amaltheaTarget);

				// step 2: clear the Amalthea model, i.e., remove the SWModel
				clearAmaltheaModel(amalthea);
				saveResource(amalthea);

				subMonitor.split(1);

				// step 3: process each selected CIC
				for (EObject element : sourceElements) {

					final TransformationExecutor muml2RunnableExecutor = Activator.getDefault()
							.getMUML2RunnableTransformationExecutor(false);

					final ModelExtent startCICExtent = new BasicModelExtent(
							new BasicEList<EObject>(Arrays.asList(element)));
					final ModelExtent rootNodeExtent = new BasicModelExtent(
							new BasicEList<EObject>(Arrays.asList(EcoreUtil.getRootContainer(element))));

					// execute the first transformation (in-place) to create
					// MechatronicUML runnables, label, etc.
					ExecutionContextImpl context = new ExecutionContextImpl();
					context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
					ExecuteQvtoTransformationCommand cmd = new ExecuteQvtoTransformationCommand(muml2RunnableExecutor,
							new BasicEList<ModelExtent>(Arrays.asList(startCICExtent, rootNodeExtent)), context);
					ted.getCommandStack().execute(cmd);

					saveResource(rootNode);

					subMonitor.split(1);

					// execute the second transformation to APP4MC
					context = new ExecutionContextImpl();
					context.setLog(new WriterLog(new OutputStreamWriter(System.out)));

					final ModelExtent amaltheaExtent = new BasicModelExtent(
							new BasicEList<EObject>(Arrays.asList(amalthea)));

					final TransformationExecutor muml2APP4MCExecutor = Activator.getDefault()
							.getMUML2APP4MCRunnableTransformationExecutor(false);

					cmd = new ExecuteQvtoTransformationCommand(muml2APP4MCExecutor,
							new BasicEList<ModelExtent>(Arrays.asList(startCICExtent, amaltheaExtent)), context);
					ted.getCommandStack().execute(cmd);

					saveResource(amalthea);

					subMonitor.split(1);
				}

				return Status.OK_STATUS;
			}
		};
	}
}
