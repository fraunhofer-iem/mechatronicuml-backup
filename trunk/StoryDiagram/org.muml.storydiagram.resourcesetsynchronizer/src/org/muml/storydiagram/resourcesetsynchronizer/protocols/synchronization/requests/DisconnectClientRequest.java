package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.requests;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerRequestWithConfirmation;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

public class DisconnectClientRequest extends SynchronizerRequestWithConfirmation<Boolean>
{

	public DisconnectClientRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.DISCONNECT_CLIENT, synchronizerAdapter);
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		out.writeString(this.getSynchronizerAdapter().getAdapterUUID());
	}

	@Override
	protected Boolean doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return in.readBoolean();
	}

}
