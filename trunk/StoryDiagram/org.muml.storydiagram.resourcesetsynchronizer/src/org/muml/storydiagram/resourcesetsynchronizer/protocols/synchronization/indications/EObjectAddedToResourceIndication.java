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
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.AbstractSerializedEObject;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.ObjectDeserializer;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notification that a root EObject has been added to a resource.
 * Deserialize the added object and add it to this resource as well.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class EObjectAddedToResourceIndication extends SynchronizerIndicationWithResponse
{

	public EObjectAddedToResourceIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.EOBJECT_ADDED_TO_RESOURCE, synchronizerAdapter);
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
		 * Read serialized EObject and deserialize it.
		 */
		final AbstractSerializedEObject serializedEObject = (AbstractSerializedEObject) in.readObject(this.getClass().getClassLoader());

		final ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

		/*
		 * Read EObject UUID
		 */
		final String eObjectUUID = (String) in.readObject(this.getClass().getClassLoader());

		/*
		 * Read position
		 */
		final int position = (Integer) in.readObject(this.getClass().getClassLoader());

		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				EObjectAddedToResourceIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				EObject eObject = deserializer.deserializeEObject(serializedEObject);

				resource.getContents().add(position, eObject);

				EObjectAddedToResourceIndication.this.getSynchronizerAdapter().getEObjectUUIDManager()
						.registerEObject(eObject, eObjectUUID);

				EObjectAddedToResourceIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}
