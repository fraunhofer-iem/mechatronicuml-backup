package org.muml.uppaal.adapter.job.operations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage;

/**
 * Clones the resource that contains verifiableElement. It also marks the cloned verifiableElement with an ElementToVerifyExtension.
 * After this ran, you get a cloned ModelExtent and a reference to the cloned verifiableElement via the getter methods. 
 * The cloned verifiableElement will not contain VerificationConstraints other than mtctl PropertyRepositories.
 */
public class PrepareModelOperation implements IWorkspaceRunnable {
	
	protected VerifiableElement verifiableElement;
	private VerifiableElement clonedVerifiableElement;
	private ModelExtent resultExtent;
	
	public PrepareModelOperation(VerifiableElement verifiableElement) {
		this.verifiableElement = verifiableElement;
	}
		
	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, "Preparing verification", 100);
			
			//Clone the model and mark the VerifiableElement that we're interested in
			TransformationOperation cloneOperation = new TransformationOperation("Cloning model", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/CloneAndMark.qvto", true));
			ModelExtent inputExtent = new BasicModelExtent(verifiableElement.eResource().getContents());
			ModelExtent verifiableElementExtent = new BasicModelExtent(Arrays.asList(new VerifiableElement[] {verifiableElement}));
			resultExtent = new BasicModelExtent();
			
			cloneOperation.setTransformationParameters(inputExtent, verifiableElementExtent, resultExtent);
			HashMap<String, Object> configProperties = new HashMap<String, Object>();
			cloneOperation.setTransformationConfigProperties(configProperties);
			cloneOperation.run(subMonitor.newChild(90));
			
			
			//Find the marked element in the copy
			EObject clonedVerifiableElement = null;
			for (EObject root : resultExtent.getContents()) {
				EObject obj = null;
				TreeIterator<EObject> it = root.eAllContents();
				while (it.hasNext()) {
					obj = it.next();
					if (obj instanceof VerifiableElement && ((VerifiableElement) obj).getExtension(VerificationExtensionPackage.eINSTANCE.getElementToVerifyExtension()) != null) {
						clonedVerifiableElement = obj;
						break;
					}
				}
			}
			assert clonedVerifiableElement != null;
			this.clonedVerifiableElement = (VerifiableElement) clonedVerifiableElement;
			
			//Remove foreign verification constraint repositories
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement.getVerificationConstraintRepositories().iterator();
			int propertyCount = 0;
			while (repoIt.hasNext()) {
				VerificationConstraintRepository tmp = repoIt.next();
				if (!(tmp instanceof org.muml.uppaal.adapter.mtctl.PropertyRepository)) { //remove "foreign" repositories
					repoIt.remove();
					continue;
				} else
					propertyCount += ((org.muml.uppaal.adapter.mtctl.PropertyRepository) tmp).getProperties().size();
			}
			
			if (propertyCount == 0)
				throw new CoreException(new Status(Status.ERROR, "org.muml.uppaal.adapter.job", ((NamedElement) this.verifiableElement).getName()+" has no properties to verify"));
			
		}
		finally {
			monitor.done();
		}
	}
	
	public ModelExtent getClonedExtent() {
		return resultExtent;
	}
	
	public VerifiableElement getClonedVerifiableElement()  {
		return clonedVerifiableElement;
	}
}
