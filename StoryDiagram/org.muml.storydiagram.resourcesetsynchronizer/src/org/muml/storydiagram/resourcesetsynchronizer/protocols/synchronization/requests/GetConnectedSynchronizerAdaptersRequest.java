package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.requests;

import java.util.Map;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerRequestWithConfirmation;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

public class GetConnectedSynchronizerAdaptersRequest extends SynchronizerRequestWithConfirmation<Map<String, String>>
{
	public GetConnectedSynchronizerAdaptersRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.GET_CONNECTED_SYNCHRONIZER_ADAPTERS, synchronizerAdapter);
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Map<String, String> doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return (Map<String, String>) in.readObject();
	}

}
