package org.muml.storydiagram.interpreter.core.debug.client.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.muml.storydiagram.interpreter.core.debug.client.ExecutionResumedEvent;
import org.muml.storydiagram.interpreter.core.debug.client.SDDebugClient;
import org.muml.storydiagram.interpreter.core.debug.protocol.SDDebugProtocolEventMessagesEnum;

public class ExecutionResumedEventIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolEventIndication<StoryDiagramElement>
{

	public ExecutionResumedEventIndication(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, SDDebugProtocolEventMessagesEnum.EXECUTION_RESUMED, debugClient);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		this.getDebugClient().getDebugEventQueue().put(new ExecutionResumedEvent());
	}

}
