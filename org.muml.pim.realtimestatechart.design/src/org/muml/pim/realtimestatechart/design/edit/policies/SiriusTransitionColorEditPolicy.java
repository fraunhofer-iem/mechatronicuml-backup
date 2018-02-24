package org.muml.pim.realtimestatechart.design.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.Adaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.Transition;

public class SiriusTransitionColorEditPolicy extends NotifyingGraphicalEditPolicy {
	protected static final Color COLOR_COMPATIBLE_TRANSITION = new Color(null, 0, 150, 0);
	protected Transition myTransition;
	protected Transition selectedTransition;
	protected PolylineConnectionEx polyline;
	private boolean flashing;
	private Color flashingAlternateColor;

	@Override
	public void activate() {
		super.activate();
		if (getHostFigure() instanceof PolylineConnectionEx) {
			polyline = (PolylineConnectionEx) getHostFigure();
		}
		myTransition = (Transition) resolveSemanticElement(getHost());

		getHost().getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Transition selectedTransition = null;
				if (event.getSelection() instanceof IStructuredSelection) {
					Iterator<?> it = ((IStructuredSelection) event.getSelection()).iterator();
					while (it.hasNext()) {
						Object object = it.next();
						EObject element = resolveSemanticElement(object);
						if (element instanceof Transition) {
							selectedTransition = (Transition) element;
						}
					}
				}
				setSelectedTransition(selectedTransition);
			}
		});
	}

	protected boolean calculateCompatible(Transition a, Transition b) {
		if (a != null && b != null) {
			if (a.getSynchronization() != null && b.getSynchronization() != null) {
				return a.getSynchronization().getKind() != b.getSynchronization().getKind()
						&& a.getSynchronization().getSyncChannel() == b.getSynchronization().getSyncChannel();
			}
		}
		return false;
	}

	protected void setSelectedTransition(Transition selectedTransition) {
		if (this.selectedTransition != selectedTransition) {
			this.selectedTransition = selectedTransition;

			updateListeners();
			updateFigure();
		}
	}
	
	void updateFigure() {
		setFlashing(calculateCompatible(myTransition, selectedTransition));
	}

	private void setFlashing(boolean flashing) {
		if (this.flashing != flashing) {
			this.flashing = flashing;

			if (flashing) {
				flashingAlternateColor = polyline.getForegroundColor();

				polyline.setLineWidth(3);
				polyline.setForegroundColor(COLOR_COMPATIBLE_TRANSITION);

				Display.getCurrent().asyncExec(new Runnable() {
					private int times = 0;

					@Override
					public void run() {
						if (!SiriusTransitionColorEditPolicy.this.flashing) {
							times = 0;
							return;
						}

						if (times < 5) {
							Display.getCurrent().timerExec(200, this);
							if ((times % 2) == 0) {
								polyline.setForegroundColor(COLOR_COMPATIBLE_TRANSITION);
							} else {
								polyline.setForegroundColor(flashingAlternateColor);
							}
							times++;

						} else {
							times = 0;
							setFlashing(false);
						}
					}
				});
			} else {
				getHost().refresh();
			}
		}
	}

	protected EObject resolveSemanticElement(Object object) {
		EObject element;
		if (object instanceof Adaptable) {
			element = ((Adaptable) object).getAdapter(EObject.class);
		} else if (object instanceof EditPart) {
			element = (EObject) ((EditPart) object).getModel();
			if (element instanceof View) { // should not be necessary, but just in case (prevented an exception,
											// already).
				element = ((View) element).getElement();
			}
			if (element instanceof DRepresentationElement) {
				element = ((DRepresentationElement) element).getTarget();
			}
			return element;
		}
		return null;
	}
	

	protected void addListeners() {
		super.addListeners();

		if (selectedTransition != null) {
			addNotificationListener(selectedTransition);
			Synchronization synchronization = null;
			if (selectedTransition.getSynchronization() != null) {
				synchronization = selectedTransition.getSynchronization();
				addNotificationListener(synchronization);
			}
			if (synchronization != null && synchronization.getSyncChannel() != null) {
				addNotificationListener(synchronization.getSyncChannel());
			}
		}
	}
	

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		updateFigure();
		if (notification.getFeature() == RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION
			|| notification.getFeature() == RealtimestatechartPackage.Literals.SYNCHRONIZATION__SYNC_CHANNEL)
		{
			updateListeners();
		}
	}
}
