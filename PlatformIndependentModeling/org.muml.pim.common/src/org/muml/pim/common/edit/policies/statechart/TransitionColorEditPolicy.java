package org.muml.pim.common.edit.policies.statechart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.Transition;

public class TransitionColorEditPolicy extends NotifyingGraphicalEditPolicy implements ISelectionChangedListener {

	protected boolean flashing;
	
	protected static final Color COLOR_COMPATIBLE_TRANSITION = new Color(null, 0, 150, 0);

	protected PolylineConnectionEx polyline;
	
	protected int defaultLineWidth = 1;
	
	protected Color defaultColor = new Color(null, 0, 0, 0);
	
	protected List<EObject> currentSelection = Collections.emptyList();
	
	@Override
	public void activate() {
		super.activate();
		getHost().getViewer().addSelectionChangedListener(this);
		if (getHostFigure() instanceof PolylineConnectionEx) {
			polyline = (PolylineConnectionEx) getHostFigure();
		}
		if (polyline != null) {
			defaultLineWidth = polyline.getLineWidth();
			defaultColor = polyline.getForegroundColor();
		}
	}

	@Override
	public void deactivate() {
		super.deactivate();
		getHost().getViewer().removeSelectionChangedListener(this);
		if (polyline != null) {
			polyline.setLineWidth(defaultLineWidth);
		}
		polyline = null;
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) event.getSelection();
			List<EObject> selectedElements = new ArrayList<EObject>();
			for (Object selectedObject : selection.toList()) {
				if (selectedObject instanceof IAdaptable) {
					EObject element = (EObject) ((IAdaptable) selectedObject).getAdapter(EObject.class);
					if (element != null) {
						selectedElements.add(element);
					}
				}
				
			}
			setSelection(selectedElements);
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

	protected void setSelection(List<EObject> selectedElements) {
		if (!selectedElements.equals(this.currentSelection)) {
			this.currentSelection = selectedElements;
			selectionChanged();
		}
	}
	
	protected void selectionChanged() {
		updateListeners();
		updateFigure();
	}
	
	protected void addListeners() {
		super.addListeners();
		
		for (EObject selectedObject : this.currentSelection) {
			if (selectedObject instanceof Transition) {
				Transition selectedTransition = (Transition) selectedObject;
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
	}
	

	private void updateFigure() {
		Transition transition = (Transition) getSemanticElement();
		boolean selected = false, compatible = false;
		for (EObject selectedObject : this.currentSelection) {
			if (transition == selectedObject) {
				selected = true;
			}
			if (selectedObject instanceof Transition) {
				Transition selectedTransition = (Transition) selectedObject;
				if (isCompatible(transition, selectedTransition)) {
					compatible = true;
				}
			}
		}
		polyline.setLineWidth(selected || compatible ? 3 : defaultLineWidth);
		polyline.setForegroundColor(compatible && !selected ? COLOR_COMPATIBLE_TRANSITION : defaultColor);

		setFlashing(compatible && !selected);
	}
	
	private void setFlashing(boolean flashing) {
		if (this.flashing != flashing) {
			this.flashing = flashing;
			
			if (flashing) {
				Display.getCurrent().asyncExec(new Runnable() {
					private int times = 0;

					@Override
					public void run() {
						if (!TransitionColorEditPolicy.this.flashing) {
							times = 0;
							return;
						}

						if (times < 5) {
							Display.getCurrent().timerExec(200, this);
							polyline.setForegroundColor((times % 2) == 0 ? COLOR_COMPATIBLE_TRANSITION : defaultColor);
							times++;

						} else {
							times = 0;
							setFlashing(false);
						}
					}
				});
			}
		}
	}
	
	protected boolean isCompatible(Transition a, Transition b) {
		if (a.getSynchronization() != null && b.getSynchronization() != null) {
			return a.getSynchronization().getKind() != b.getSynchronization().getKind() && a.getSynchronization().getSyncChannel() == b.getSynchronization().getSyncChannel();
		}
		return false;		
	}


}
