package org.muml.core.common.edit.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.core.ExtendableElement;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelInstancePlugin;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.categories.ModelElementCategoryRegistry;

public class StoringExecuteQvtoTransformationCommand extends
		ExecuteQvtoTransformationCommand {
	private static final String TYPES_CATEGORY_KEY = "org.muml.types.category";

	private ModelExtent inputExtent;
	private ModelExtent outputExtent;

	public StoringExecuteQvtoTransformationCommand(
			TransformationExecutor transformationExecutor,
			ModelExtent inputExtent, ModelExtent outputExtent) {
		this(transformationExecutor, inputExtent, outputExtent,
				new ExecutionContextImpl());
	}

	public StoringExecuteQvtoTransformationCommand(
			TransformationExecutor transformationExecutor,
			ModelExtent inputExtent, ModelExtent outputExtent,
			ExecutionContext executionContext) {
		super(transformationExecutor, extentList(inputExtent, outputExtent),
				executionContext);
		this.inputExtent = inputExtent;
		this.outputExtent = outputExtent;

	}

	private static List<ModelExtent> extentList(ModelExtent inputExtent,
			ModelExtent outputExtent) {
		List<ModelExtent> extentList = new ArrayList<ModelExtent>();
		extentList.add(inputExtent);
		extentList.add(outputExtent);
		return extentList;
	}

	@Override
	protected void doExecute() {
		super.doExecute();

		// Find out if we have a .muml file by trying to find a root node.
		IPath directoryPath = null;
		RootNode rootNode = null;
		for (EObject inputElement : inputExtent.getContents()) {

			// Get Directory Path of inputElement
			if (inputElement.eResource() != null) {
				URI uri = inputElement.eResource().getURI();
				IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace()
						.getRoot();
				IFile iFile = workspaceRoot.getFile(new Path(uri
						.toPlatformString(true)));
				directoryPath = iFile.getFullPath().removeLastSegments(1);
			}

			// Find root container
			while (inputElement.eContainer() != null) {
				inputElement = inputElement.eContainer();
			}
			if (inputElement instanceof RootNode) {
				rootNode = (RootNode) inputElement;
				break;
			}
		}

		if (directoryPath == null && rootNode == null) {
			throw new RuntimeException(
					"No path known where files can be created.");
		}

		// Store elements that the transformation put into the output extent
		for (EObject outputElement : outputExtent.getContents()) {

			// Only try to contain elements that have not been contained by the
			// Transformation.
			if (outputElement.eContainer() != null) {
				continue;
			}

			// Do we have a .muml file?
			if (rootNode != null && outputElement instanceof ExtendableElement) {

				// Contain into model element category.
				ModelElementCategoryRegistry registry = ModelInstancePlugin
						.getInstance().getModelElementCategoryRegistry();
				ModelElementCategory category = null;
				for (String key : registry.getAllowedKeys()) {
					if (isValidCategory(key, outputElement)) {
						category = registry.getModelElementCategory(rootNode,
								key);
						break;
					}
				}

				// Do we have a category for that element?
				if (category != null) {
					category.getModelElements().add(
							(ExtendableElement) outputElement);
				} else {
					throw new RuntimeException(
							"Could find ModelElementCategory for type: "
									+ outputElement.eClass().getName());
				}

			} else {
				// put in own file
				String fileExtension = outputElement.eClass().getName()
						.toLowerCase(); // convention by ingo budde ;P
				String hint = outputElement.eClass().getName();

				// Get a unique filename for the new file
				String fileName = DiagramEditorUtil.getUniqueFileName(
						directoryPath, hint, fileExtension);

				// Create the new file
				ResourceSet resourceSet = new ResourceSetImpl();
				URI uri = URI.createPlatformResourceURI(
						directoryPath.append(fileName).toString(), true);
				Resource resource = resourceSet.createResource(uri);
				resource.getContents().add(outputElement);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private boolean isValidCategory(String key, EObject modelElement) {
		ModelElementCategoryRegistry registry = ModelInstancePlugin
				.getInstance().getModelElementCategoryRegistry();
		if (registry.isValidCategory(key, modelElement)) {
			// Make sure that only valid types are put into types category
			if (TYPES_CATEGORY_KEY.equals(key)) {
				if (!modelElement.eClass().getEPackage().getNsURI()
						.equals("http://www.muml.org/pim/types/1.0.0")) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
