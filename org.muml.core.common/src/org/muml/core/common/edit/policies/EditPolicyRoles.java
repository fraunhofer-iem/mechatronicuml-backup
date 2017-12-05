package org.muml.core.common.edit.policies;

/**
 * Edit policy roles for registering our edit policies in parts.
 */
public interface EditPolicyRoles {

	/**
	 * EditPolicies that are registered with the key "BACKGROUND_COLOR_ROLE" should implement IBackgroundColorEditPolicy.
	 */
	public static final String BACKGROUND_COLOR_ROLE = "BackgroundColorRole"; //$NON-NLS-1$

	public static final String COMPARTMENT_BORDER_ROLE = "CompartmentBorderRole"; //$NON-NLS-1$
	
	public static final String COMPARTMENT_ORIENTATION_ROLE = "CompartmentOrientationRole"; //$NON-NLS-1$
	
	public static final String COMPONENTSTORYPATTERNVARIABLE_VISUALIZATION_ROLE = "ComponentStoryPatternVariableVisualizationRole"; //$NON-NLS-1$
		
	public static final String ERROR_FEEDBACK_ROLE = "ErrorFeedbackPolicy"; //$NON-NLS-1$

	public static final String ENLARGE_COMPARTMENT_ROLE = "EnlargeCompartmentRole"; //$NON-NLS-1$

	public static final String WRAPPING_LABEL_MULTI_LINE_ROLE = "WrappingLabelMultiLineEditPolicy"; //$NON-NLS-1$

	/** creates an anchor for connections. Corresponding classes are:
	 *  org.muml.core.common.edit.policies.anchor.EllipseConnectionAnchorCreationEditPolicy -> creates an ellipse anchor
	 */
	public static final String CONNECTION_ANCHOR_CREATION_ROLE = "ConnectionAnchorCreationRole"; //$NON-NLS-1$
	
	/**
	 * This policy provides an asynchronous refreshment after activation of the editpart it belongs to. Corresponding class:
	 *  org.muml.core.common.edit.policies.CanonicalRefreshEditPolicy
	 */
	public static final String CANONICAL_REFRESH_ROLE = "CanonicalRefreshEditPolicy"; //$NON-NLS-1$

	public static final String COMPARTMENT_HORIZONTAL_LAYOUT_ROLE = "CompartmentHorizontalLayoutRole"; //$NON-NLS-1$
	
	/**
	 * This policy prevents links from being connected to this edit policy.
	 *  org.muml.core.common.edit.policies.NoLinksEditPolicy
	 */
	public static final String NO_LINKS_ROLE = "NoLinksRole"; //$NON-NLS-1$

	/**
	 * This edit policy role blocks deletion requests when used as Custom Behavior Key.
	 * Implementation is done in GMF Templates, no actual editpolicy class has to be specified.
	 */
	public static final String NON_DELETABLE_ROLE = "org.muml.custom.nonDeletable";
}

