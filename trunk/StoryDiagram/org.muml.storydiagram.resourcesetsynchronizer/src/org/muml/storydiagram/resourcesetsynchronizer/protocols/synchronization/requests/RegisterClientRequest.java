package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.requests;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerRequestWithConfirmation;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Register a synchronizer adapter at another synchronizer adapter. Send the
 * server port of this adapter so the other adapter can establish a connection
 * in the opposite direction.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class RegisterClientRequest extends SynchronizerRequestWithConfirmation<String>
{
	private final int	ownServerPort;

	public RegisterClientRequest(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter, int ownServerPort)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.REGISTER_CLIENT, synchronizerAdapter);

		this.ownServerPort = ownServerPort;
	}

	@Override
	protected void doRequesting(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(this.ownServerPort);
	}

	@Override
	protected String doConfirming(ExtendedDataInputStream in) throws Exception
	{
		return this.getRemoteAdapterUUID();
	}

}
