package org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased;

public abstract class Transaction
{
	public abstract void commit();

	public abstract void rollBack();
}
