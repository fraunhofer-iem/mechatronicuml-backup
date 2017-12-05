package org.muml.core.common.edit.policies;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;

/**
 * The error feedback behavior for nodes. When registered, the node can show
 * error messages that are automatically hidden after a certain amount of time.
 * 
 * @author bingo
 * 
 */
public class ErrorFeedbackEditPolicy extends GraphicalEditPolicy {

	/**
	 * The default time that a message should be visible, if not set otherwise.
	 */
	private static final long DEFAULT_HIDE_MILLIS = 5000;

	/**
	 * The figure that is used to show the error message.
	 */
	protected IFigure figure;

	/**
	 * A job that hides the feedback after a certain amount of time.
	 */
	private class HideErrorFeedbackJob extends UIJob {

		protected HideErrorFeedbackJob() {
			super("Hide error feedback"); //$NON-NLS-1$
			setSystem(true);
		}

		public IStatus runInUIThread(IProgressMonitor monitor) {
			hideFigure();
			return Status.OK_STATUS;
		}
	}

	/**
	 * The hide job instance.
	 */
	protected HideErrorFeedbackJob hideErrorFeedbackJob = new HideErrorFeedbackJob();

	/**
	 * Shows an error message and hides it after the default time.
	 * 
	 * @param message
	 *            The message to display.
	 */
	public void showErrorMessage(String message) {
		showErrorMessage(message, DEFAULT_HIDE_MILLIS);
	}

	/**
	 * Shows an error message and hides it after a certain amount of time.
	 * 
	 * @param message
	 *            The message to display.
	 * @param millis
	 *            The time that the message should be visible in milliseconds.
	 */
	public void showErrorMessage(String message, long millis) {

		// Only do something if no message was shown yet, or if the message text
		// changed. In this case hide the figure first, so that
		// getPreferredSize() has a chance to return the correct text size again
		// (without the previously added margin).
		if (figure != null && getCurrentText() != message) {
			hideFigure();
		}

		// When no figure was created yet, or the text changed, create a new one
		// and layout it.
		if (figure == null) {
			hideErrorFeedbackJob.cancel();
			hideErrorFeedbackJob.schedule(millis);
			showFigure();

			setCurrentText(message);
			updateBounds();
		}
	}

	/**
	 * Updates the position and size of the figure displaying the error message.
	 */
	protected void updateBounds() {
		Rectangle bounds = getHostFigure().getBounds();
		Point pt = bounds.getBottom();
		getHostFigure().translateToAbsolute(pt);
		Dimension size = getFigure().getPreferredSize();

		// Add a margin.
		size.height += 2;
		size.width += 4;
		pt.x -= size.width / 2;
		pt.y += 10;

		figure.getParent().translateToRelative(pt);
		figure.setBounds(new Rectangle(pt, size));
	}

	/**
	 * Gets the figure that is used to display the error. If it does not exist
	 * yet, it is created using a call to createFigure().
	 * 
	 * @return The figure, never null.
	 */
	protected IFigure getFigure() {
		if (figure == null) {
			figure = createFigure();
			Assert.isNotNull(figure, "createFigure() must not return null!");
		}
		return figure;
	}

	/**
	 * Creates the figure that is used to display the error.
	 * 
	 * @return The figure, never null.
	 */
	protected IFigure createFigure() {
		IFigure figure = new Label();
		Font font = new Font(Display.getCurrent(), Display.getDefault()
				.getSystemFont().getFontData()[0].getName(), 8, SWT.NORMAL);
		figure.setFont(font);
		figure.setForegroundColor(ColorConstants.white);
		figure.setBackgroundColor(new Color(Display.getDefault(), 220, 40, 40));
		figure.setOpaque(true);
		return figure;
	}

	/**
	 * Adds the figure to the feedback layer.
	 */
	protected void showFigure() {
		if (figure == null) {
			getLayer(LayerConstants.FEEDBACK_LAYER).add(getFigure());
		}
	}

	/**
	 * Removes the figure from the feedback layer.
	 */
	protected void hideFigure() {
		if (figure != null) {
			getLayer(LayerConstants.FEEDBACK_LAYER).remove(figure);
			figure = null;
		}
	}

	/**
	 * Sets the error message.
	 * 
	 * @param message
	 *            The message to display.
	 */
	protected void setCurrentText(String message) {
		((Label) getFigure()).setText(message);
	}

	/**
	 * Gets the text that is currently displayed.
	 * 
	 * @return the current error message text.
	 */
	protected String getCurrentText() {
		return ((Label) getFigure()).getText();
	}

	/**
	 * Static convenience method that displays a message.
	 * 
	 * @param view
	 *            The view that the message should be displayed at.
	 * @param message
	 *            The message to display.
	 */
	public static void showMessage(View view, String message) {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		IEditorPart part = page.getActiveEditor();
		if (part instanceof DiagramEditor) {
			DiagramEditor editor = (DiagramEditor) part;
			IDiagramGraphicalViewer viewer = editor.getDiagramGraphicalViewer();
			EditPart editPart = (EditPart) viewer.getEditPartRegistry().get(
					view);
			showMessage(editPart, message);
		}
	}

	/**
	 * Static convenience method that displays a message.
	 * 
	 * @param editPart
	 *            The EditPart that the message should be displayed at.
	 * @param message
	 *            The message to display.
	 */
	public static void showMessage(EditPart editPart, String message) {
		if (editPart != null) {
			ErrorFeedbackEditPolicy errorFeedbackPolicy = (ErrorFeedbackEditPolicy) editPart
					.getEditPolicy(EditPolicyRoles.ERROR_FEEDBACK_ROLE);
			if (errorFeedbackPolicy != null) {
				errorFeedbackPolicy.showErrorMessage(message);
			}
		}
	}

}