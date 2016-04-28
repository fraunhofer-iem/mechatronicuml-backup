package org.muml.core.modelinstance.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.modelinstance.ui.diagrams.DiagramInformation;
import org.muml.core.modelinstance.ui.diagrams.IDiagramInformation;
import org.muml.core.modelinstance.ui.initializer.IModelInitializer;
import org.muml.mumlcore.modelinstance.ModelinstanceFactory;
import org.muml.mumlcore.modelinstance.RootNode;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ModelinstanceUiPlugin extends AbstractUIPlugin {
	
	private List<IModelInitializer> modelInitializers;

	// The plug-in ID
	public static final String ID = "org.muml.core.modelinstance.ui"; //$NON-NLS-1$

	public static final String FUJABA_MODEL_EXTENSION = "muml";

	public static final String DIAGRAM_INFORMATION_EXTENSION_POINT_ID = "org.muml.core.modelinstance.ui.diagraminformation";
	public static final String MODEL_INITIALIZER_EXTENSION_POINT_ID = "org.muml.core.modelinstance.ui.modelinitializer";

	private Map<String, IDiagramInformation> editorIdToDiagramInformation;

	// The shared instance
	private static ModelinstanceUiPlugin plugin;

	/**
	 * The constructor
	 */
	public ModelinstanceUiPlugin() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		// Force reading the extension point
		getDiagramInformationMap();
		getModelInitializers();
	}

	private Collection<IModelInitializer> getModelInitializers() {
		if (modelInitializers == null) {
			modelInitializers = new ArrayList<IModelInitializer>();
			IConfigurationElement[] config = RegistryFactory.getRegistry()
					.getConfigurationElementsFor(
							MODEL_INITIALIZER_EXTENSION_POINT_ID);
			for (IConfigurationElement element : config) {
				Object object = null;
				try {
					object = element.createExecutableExtension("initializer");
					if (object instanceof IModelInitializer) {
						modelInitializers.add((IModelInitializer) object);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			
				
			}
		}
		return modelInitializers;
	}

	private Collection<IModelInitializer> getModelInitializers(EObject object) {
		List<IModelInitializer> initializers = new ArrayList<IModelInitializer>();
		for (IModelInitializer initializer : getModelInitializers()) {
			if (initializer.supports(object)) {
				initializers.add(initializer);
			}
		}
		return initializers;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		// linkConstraints = null;
		// initializers = null;
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ModelinstanceUiPlugin getDefault() {
		return plugin;
	}

	public void logError(String error) {
		logError(error, null);
	}

	public void logError(String error, Throwable throwable) {
		if (error == null && throwable != null) {
			error = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.ERROR, ModelinstanceUiPlugin.ID, IStatus.OK,
						error, throwable));
		debug(error, throwable);
	}

	public void logInfo(String message) {
		logInfo(message, null);
	}

	public void logInfo(String message, Throwable throwable) {
		if (message == null && throwable != null) {
			message = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.INFO, ModelinstanceUiPlugin.ID, IStatus.OK,
						message, throwable));
		debug(message, throwable);
	}

	private void debug(String message, Throwable throwable) {
		if (!isDebugging()) {
			return;
		}
		if (message != null) {
			System.err.println(message);
		}
		if (throwable != null) {
			throwable.printStackTrace();
		}
	}

	public IDiagramInformation getDiagramInformation(String editorId) {
		return getDiagramInformationMap().get(editorId);
	}

	/**
	 * Gets (and lazily creates) the diagram information map (EditorId ->
	 * IDiagramInformation), by reading the extension point
	 * org.muml.core.modelinstance.ui.diagraminformation.
	 * 
	 * @return The map; never null.
	 */
	public Map<String, IDiagramInformation> getDiagramInformationMap() {

		if (editorIdToDiagramInformation == null) {

			// Create the map, in case it does not exist yet.
			editorIdToDiagramInformation = doCreateDiagramInformationMap();
		}

		return editorIdToDiagramInformation;
	}

	private Map<String, IDiagramInformation> doCreateDiagramInformationMap() {
		Map<String, IDiagramInformation> map = new HashMap<String, IDiagramInformation>();

		IConfigurationElement[] config = RegistryFactory.getRegistry()
				.getConfigurationElementsFor(
						DIAGRAM_INFORMATION_EXTENSION_POINT_ID);

		for (IConfigurationElement element : config) {

			// Fill DiagramInformation datastructure
			IDiagramInformation diagramInformation = new DiagramInformation(
					element);

			// Read editorId
			String editorId = diagramInformation.getEditorId();

			// Put this entry into the map
			if (editorId != null) {
				IDiagramInformation existingDiagramInformation = map.get(editorId);
				if (existingDiagramInformation != null) {
					// Append top level nodes to existing diagram information
					existingDiagramInformation.getTopLevelNodes().putAll(diagramInformation.getTopLevelNodes());
					diagramInformation = existingDiagramInformation;
				}
				map.put(editorId, diagramInformation);
			}
		}
		return map;
	}

	public void createModel(IFile newFile,
			TransactionalEditingDomain editingDomain) {
		DiagramEditorUtil.setCharset(newFile);
		ResourceSet resourceSet = editingDomain.getResourceSet();
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		affectedFiles.add(newFile);
		URI diagramModelURI = URI.createPlatformResourceURI(newFile
				.getFullPath().toString(), true);

		final Resource modelResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Initializing diagram contents", affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				RootNode rootNode = ModelinstanceFactory.eINSTANCE
						.createRootNode();

				// Let extensions initialize the model
				initializeModel(rootNode);

				modelResource.getContents().add(rootNode);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			modelResource.save(DiagramEditorUtil.getSaveOptions());

		} catch (ExecutionException e) {
			ModelinstanceUiPlugin.getDefault().logError(
					"Unable to create model", e); //$NON-NLS-1$
		} catch (IOException ex) {
			ModelinstanceUiPlugin.getDefault().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		}
	}

	public void initializeModel(final EObject object) {
		for (final IModelInitializer initializer : getModelInitializers(object)) {
			SafeRunner.run(new ISafeRunnable() {

				@Override
				public void handleException(Throwable exception) {
					// TODO Log exception
				}

				@Override
				public void run() throws Exception {
					initializer.initialize(object);
				}
				
			});
		}
	}
}
