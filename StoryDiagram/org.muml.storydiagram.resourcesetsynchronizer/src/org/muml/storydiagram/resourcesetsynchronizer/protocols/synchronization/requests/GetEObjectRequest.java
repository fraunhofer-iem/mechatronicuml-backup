package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerRequestWithConfirmation;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.AbstractSerializedEObject;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.ObjectDeserializer;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Request an EObject from another synchronizer adapter.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class GetEObjectRequest extends SynchronizerRequestWithConfirmation<EObject>
{

	private final String	eObjectUUID;

	public GetEObjectRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, String eObjectUUID)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.GET_EOBJECT, synchronizerAdapter);

		assert eObjectUUID != null;
		assert !"".equals(eObjectUUID);

		this.eObjectUUID = eObjectUUID;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		/*
		 * Send EObject UUID
		 */
		out.writeObject(this.eObjectUUID);
	}

	@Override
	protected EObject doConfirming(ExtendedDataInputStream in) throws Exception
	{
		AbstractSerializedEObject serializedEObject = (AbstractSerializedEObject) in.readObject(this.getClass().getClassLoader());

		ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

		EObject eObject = deserializer.deserializeEObject(serializedEObject);

		assert eObject != null;

		return eObject;
	}
}
