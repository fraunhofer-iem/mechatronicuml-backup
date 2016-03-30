package org.muml.storydiagram.interpreter.core.debug.breakpoints;

import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.interpreter.core.debug.SDDebugger;

public abstract class StepBreakpoint<StoryDiagramElement extends EObject> extends Breakpoint<StoryDiagramElement>
{

	public StepBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(debuggingInterpreter, Breakpoint.ANY_ELEMENT_UUID);
	}

}
