package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerIndicationWithResponse;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.AbstractSerializedEObject;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.ObjectSerializer;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle GetObjectRequests. Serialize the requested EObject and send it back.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class GetEObjectIndication extends SynchronizerIndicationWithResponse
{

	private String	eObjectUUID;

	public GetEObjectIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.GET_EOBJECT, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Receive eObject UUID
		 */
		this.eObjectUUID = (String) in.readObject(this.getClass().getClassLoader());
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Get the EObject
		 */
		EObject eObject = this.getSynchronizerAdapter().getEObjectUUIDManager().getEObject(this.eObjectUUID);

		assert eObject != null;

		/*
		 * Serialize the EObject
		 */
		ObjectSerializer serializer = new ObjectSerializer(this.getSynchronizerAdapter());

		AbstractSerializedEObject serializedEObject = serializer.serializeEObject(eObject);

		assert serializedEObject != null;

		out.writeObject(serializedEObject);
	}

}
