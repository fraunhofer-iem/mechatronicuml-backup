package org.muml.storydiagram.interpreter.core.debug.protocol.indications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.interpreter.core.debug.SDDebugger;
import org.muml.storydiagram.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class StepBackOverIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandIndicationWithResponse<StoryDiagramElement>
{

	private Exception	exception;

	public StepBackOverIndication(SignalProtocol<?> protocol, SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.STEP_BACK_OVER, debuggingInterpreter);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		try
		{
			this.getDebugger().stepBackOver();
		}
		catch (Exception ex)
		{
			this.exception = ex;
		}
	}

	@Override
	protected void responding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(this.exception);
	}

}
