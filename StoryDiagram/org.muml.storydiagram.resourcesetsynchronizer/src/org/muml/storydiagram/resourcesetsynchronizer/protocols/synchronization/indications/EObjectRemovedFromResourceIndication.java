package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.indications;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.ISynchronizerCommand;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerIndicationWithResponse;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notifications that a root EObject has been removed from a resource.
 * Remove it from this resource as well.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class EObjectRemovedFromResourceIndication extends SynchronizerIndicationWithResponse
{

	public EObjectRemovedFromResourceIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.EOBJECT_REMOVED_FROM_RESOURCE, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Read resource URI and get resource
		 */
		URI resourceURI = URI.createURI((String) in.readObject(this.getClass().getClassLoader()));

		final Resource resource = this.getSynchronizerAdapter().getResourceSet().getResource(resourceURI, false);

		assert resource != null;

		/*
		 * Read EObject UUID
		 */
		String eObjectUUID = (String) in.readObject(this.getClass().getClassLoader());

		final EObject eObject = this.getSynchronizerAdapter().getEObjectUUIDManager().getEObject(eObjectUUID);

		assert eObject != null;

		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				EObjectRemovedFromResourceIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				resource.getContents().remove(eObject);

				/*
				 * Unregister the EObject and all its contained elements
				 */
				EObjectRemovedFromResourceIndication.this.getSynchronizerAdapter().getEObjectUUIDManager()
						.unregisterEObjectWithContents(eObject);

				EObjectRemovedFromResourceIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
