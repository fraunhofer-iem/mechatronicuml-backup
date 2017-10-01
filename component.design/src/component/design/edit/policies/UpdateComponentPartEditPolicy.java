package component.design.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;

// XXX Register in ComponentPart and listen to change of reference "type", then execute QVTO transformation!
public class UpdateComponentPartEditPolicy extends NotifyingGraphicalEditPolicy {
	
	@Override
	public void activate() {
		super.activate();

	}

	protected void addListeners() {
		super.addListeners();

//		addNotificationListener(selectedTransition);
	}
	

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		
	}
}
