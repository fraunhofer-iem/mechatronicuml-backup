package org.muml.emm.ui;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateMigrationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<ResourceSet> resourceSets = new ArrayList<ResourceSet>();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Iterator<?> iterator = ((IStructuredSelection) selection).iterator();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				if (object instanceof IFile) {
					IFile iFile = (IFile) object;
					URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getResource(uri, true);
					resourceSets.add(resourceSet);
				}
			}
		}
		if (resourceSets.size() == 2) {
			ResourceSet a = resourceSets.get(0);
			ResourceSet b = resourceSets.get(1);
			
			//EcoreUtil.resolveAll(a);
			//EcoreUtil.resolveAll(b);

//			IComparisonScope scope = new DefaultComparisonScope(a, b, null);
//			Comparison comparison = EMFCompare.builder().build().compare(scope);
//			comparison.getEquivalences();
//			List<Diff> differences = comparison.getDifferences();
			// Let's merge every single diff
			//IMerger.Registry mergerRegistry = new IMerger.RegistryImpl();
			//IBatchMerger merger = new BatchMerger(mergerRegistry);
			//merger.copyAllLeftToRight(differences, new BasicMonitor());
			System.out.println(a);
		}
		return null;
	}
//	public void compare(File model1, File model2) {
//		URI uri1 = URI.createFileURI("path/to/first/model.xmi");
//		URI uri2 = URI.createFileURI("path/to/second/model.xmi");
//
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
//
//		ResourceSet resourceSet1 = new ResourceSetImpl();
//		ResourceSet resourceSet2 = new ResourceSetImpl();
//
//		resourceSet1.getResource(uri1, true);
//		resourceSet2.getResource(uri2, true);
//
//		IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2);
//		Comparison comparison = EMFCompare.builder().build().compare(scope);
//
//		List<Diff> differences = comparison.getDifferences();
//		// Let's merge every single diff
//		IMerger.Registry mergerRegistry = new IMerger.RegistryImpl();
//		IBatchMerger merger = new BatchMerger(mergerRegistry);
//		merger.copyAllLeftToRight(differences, new BasicMonitor());
//	}
}
