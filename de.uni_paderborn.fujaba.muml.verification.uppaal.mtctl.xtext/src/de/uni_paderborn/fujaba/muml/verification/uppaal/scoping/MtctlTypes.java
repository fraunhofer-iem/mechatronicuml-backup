package de.uni_paderborn.fujaba.muml.verification.uppaal.scoping;

/**
 * Enumeration of Types used in Mtctl. 
 * Every MapExpr (and hence, every MumlElemExpr) has a type that determines what its value can be used for
 *
 */
public enum MtctlTypes {
	NONE,
	INT,
	STATE,
	TRANSITION,
	BUFFER,
	MESSAGE_TYPE,
	CLOCK
}
