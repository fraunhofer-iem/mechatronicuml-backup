package org.muml.storydiagram.resourcesetsynchronizer;

public class SynchronizerCommandExecutor implements ISynchronizerCommandExecutor
{

	@Override
	public void executeCommand(ISynchronizerCommand command)
	{
		command.execute();
	}

}
