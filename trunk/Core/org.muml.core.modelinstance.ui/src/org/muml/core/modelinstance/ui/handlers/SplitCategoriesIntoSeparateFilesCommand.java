	
package org.muml.core.modelinstance.ui.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstanceFactory;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.core.modelinstance.RootNode;

public class SplitCategoriesIntoSeparateFilesCommand extends org.eclipse.core.commands.AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ResourceSet rset = new ResourceSetImpl();
		List<RootNode> rootNodes = new ArrayList<RootNode>();

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Iterator<?> it = ssel.iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if (obj instanceof IFile) {
					IFile iFile = (IFile) obj;
					URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
					Resource resource = rset.getResource(uri, true);
					for (EObject element : resource.getContents()) {
						if (element instanceof RootNode) {
							rootNodes.add((RootNode) element);
						}
					}
				} else if (obj instanceof EObject) {
					EObject element = (EObject) obj;
					while (element.eContainer() != null) {
						element = element.eContainer();
					}
					if (element instanceof RootNode) {
						rootNodes.add((RootNode) element);
					}
				}
			}
		}
		
		doSplitOperation(rootNodes, rset);
		
		return null;
	}

	private void doSplitOperation(List<RootNode> rootNodes, ResourceSet resourceSet) {
		Set<Resource> resources = new HashSet<Resource>();
		for (RootNode rootNode : rootNodes) {
			if (rootNode.getCategories().size() > 1) {
				Resource resource = rootNode.eResource();
				resources.add(resource);
				for (ModelElementCategory category : new ArrayList<ModelElementCategory>(rootNode.getCategories())) {
					String fileExtension = resource.getURI().fileExtension();
					String newSegment = resource.getURI().trimFileExtension().lastSegment();
					newSegment += "-" + category.getName() + "." + fileExtension;
					URI newUri = resource.getURI().trimSegments(1).appendSegment(newSegment);
					Resource newResource = resourceSet.createResource(newUri);
					rootNode.getCategories().remove(category);
					RootNode newRootNode = ModelinstanceFactory.eINSTANCE.createRootNode();
					newRootNode.getCategories().add(category);
					newResource.getContents().add(newRootNode);
					resources.add(newResource);
				}
			}
		}

		for (Resource resource : resources) {
			Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
			try {
				resource.save(saveOptions);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
