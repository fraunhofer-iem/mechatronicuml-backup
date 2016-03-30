package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.indications;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerIndicationWithResponse;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

public class DisconnectClientIndication extends SynchronizerIndicationWithResponse
{

	public DisconnectClientIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.DISCONNECT_CLIENT, synchronizerAdapter);
	}

	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		String adapterUUID = in.readString();

		this.getSynchronizerAdapter().disconnect(adapterUUID);
	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeBoolean(true);
	}

}
