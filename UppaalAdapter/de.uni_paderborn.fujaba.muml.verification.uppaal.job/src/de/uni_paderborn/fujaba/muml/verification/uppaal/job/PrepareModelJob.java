package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;
import de.uni_paderborn.fujaba.muml.verification.verificationExtension.VerificationExtensionPackage;

/**
 * Clones the resource that contains verifiableElement. It also marks the cloned verifiableElement with an ElementToVerifyExtension.
 * After this ran, you get a cloned ModelExtent and a reference to the cloned verifiableElement via the getter methods. 
 * The cloned verifiableElement will not contain VerificationConstraints other than mtctl PropertyRepositories.
 */
public class PrepareModelJob extends SynchronousJob {
	
	protected VerifiableElement verifiableElement;
	private VerifiableElement clonedVerifiableElement;
	protected IStatus status = Status.OK_STATUS;
	private ModelExtent resultExtent;
	
	public PrepareModelJob(VerifiableElement verifiableElement) {
		super("Preparing verification");
		this.verifiableElement = verifiableElement;
	}
		
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			//Clone the model and mark the VerifiableElement that we're interested in
			TransformationJob cloneJob = new TransformationJob("Cloning model", URI.createPlatformPluginURI("/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/CloneAndMark.qvto", true));
			ModelExtent inputExtent = new BasicModelExtent(verifiableElement.eResource().getContents());
			ModelExtent verifiableElementExtent = new BasicModelExtent(Arrays.asList(new VerifiableElement[] {verifiableElement}));
			resultExtent = new BasicModelExtent();
			
			cloneJob.setTransformationParameters(inputExtent, verifiableElementExtent, resultExtent);
			HashMap<String, Object> configProperties = new HashMap<String, Object>();
			cloneJob.setTransformationConfigProperties(configProperties);
			status = cloneJob.execute(subMonitor.newChild(90));
			if (!status.isOK())
				return status;
			
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
				if (!(tmp instanceof de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository)) { //remove "foreign" repositories
					repoIt.remove();
					continue;
				} else
					propertyCount += ((de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository) tmp).getProperties().size();
			}
			
			if (propertyCount == 0)
				return new Status(Status.ERROR, "de.uni_paderborn.fujaba.muml.verification.uppaal.job", ((NamedElement) this.verifiableElement).getName()+" has no properties to verify");
			
			return status;
		}
		finally {
			monitor.done();
		}
	}
	
	public ModelExtent getClonedExtent() {
		try {
			this.join();
		} catch (InterruptedException e) {
			return null;
		}
		return resultExtent;
	}
	
	public VerifiableElement getClonedVerifiableElement()  {
		try {
			this.join();
		} catch (InterruptedException e) {
			return null;
		}
		return clonedVerifiableElement;
	}
}
