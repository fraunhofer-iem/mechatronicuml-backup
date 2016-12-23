package org.muml.storydiagram.interpreter.core.mdelab.patternmatcher.patternPartBased;

/**
 * Enumeration of the possible outcomes of checks.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public enum ECheckResult
{
	/*
	 * The check failed.
	 */
	FAIL,

	/*
	 * The check was ok.
	 */
	OK,

	/*
	 * The check did not yield a result.
	 */
	UNKNOWN
}
