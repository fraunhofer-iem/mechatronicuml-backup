package org.muml.storydiagram.interpreter.core.debug.breakpoints;

import java.util.UUID;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.interpreter.core.debug.SDDebugger;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

public abstract class Breakpoint<StoryDiagramElement extends EObject>
{
	public static final String									ANY_ELEMENT_UUID	= "#ANY";

	private final SDDebugger<StoryDiagramElement, ?, ?, ?, ?>	debugger;

	private final String										elementUUID;

	private final String										breakpointUUID;

	public Breakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debugger, String elementUUID)
	{
		assert debugger != null;
		assert elementUUID != null;
		assert !"".equals(elementUUID);

		this.debugger = debugger;
		this.elementUUID = elementUUID;
		this.breakpointUUID = UUID.randomUUID().toString();
	}

	protected SDDebugger<StoryDiagramElement, ?, ?, ?, ?> getDebugger()
	{
		return this.debugger;
	}

	public String getElementUUID()
	{
		return this.elementUUID;
	}

	public String getBreakpointUUID()
	{
		return this.breakpointUUID;
	}

	public abstract boolean evaluate(StoryDiagramElement currentlyExecutedElement,
			VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope);
}
