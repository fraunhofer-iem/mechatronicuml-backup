package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class ModifyRaisedEventPage1 extends CommonModifyPage {

	protected ListViewer messageTypeLViewer = null;
	protected ListViewer existingRaisedEvent = null;

	public ModifyRaisedEventPage1(String pageName) {
		super(pageName);
	}

	@Override
	public void setVisible(boolean visible) {

		if (visible) {
			setPageComplete(false);
		}

		super.setVisible(visible);
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite main = new Composite(parent, SWT.NONE);
		FormLayout layout = new FormLayout();
		main.setLayout(layout);
		main.setFont(parent.getFont());

		setErrorMessage(null);
		setMessage(null);
		setControl(main);

		FormData parameterNameFormData1 = new FormData();
		parameterNameFormData1.left = new FormAttachment(0, 0);
		parameterNameFormData1.right = new FormAttachment(40, 0);
		parameterNameFormData1.top = new FormAttachment(0, 0);
		parameterNameFormData1.bottom = new FormAttachment(10, 0);
		Label pNameLabel = new Label(main, SWT.NONE);
		pNameLabel.setText("Available message types:\n"
				+ "help :- choose via double click");
		pNameLabel.setLayoutData(parameterNameFormData1);

		FormData syncChannelLViewerFormData = new FormData();
		syncChannelLViewerFormData.left = new FormAttachment(0, 0);
		syncChannelLViewerFormData.right = new FormAttachment(40, 0);
		syncChannelLViewerFormData.top = new FormAttachment(10, 0);
		syncChannelLViewerFormData.bottom = new FormAttachment(80, 0);
		Composite syncChannelViewerComposite = new Composite(main, SWT.NONE);
		syncChannelViewerComposite.setLayout(new FillLayout());
		syncChannelViewerComposite.setLayoutData(syncChannelLViewerFormData);
		messageTypeLViewer = new ListViewer(syncChannelViewerComposite);
		messageTypeLViewer.setContentProvider(new MessageTypeContentProvider());
		messageTypeLViewer.setInput(((ModifyRaisedEventWizard) getWizard())
				.getRealtimeStatechart());
		messageTypeLViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				setSelectedMessageType();

				setPageComplete(true);
			}

		});

		FormData triggerEventFormData2 = new FormData();
		triggerEventFormData2.left = new FormAttachment(0, 0);
		triggerEventFormData2.right = new FormAttachment(40, 0);
		triggerEventFormData2.top = new FormAttachment(0, 0);
		triggerEventFormData2.bottom = new FormAttachment(10, 0);
		Label triggerEventLabel = new Label(main, SWT.NONE);
		triggerEventLabel.setText("Existing raised events:\n"
				+ "help :- choose via double click");
		triggerEventLabel.setLayoutData(triggerEventFormData2);

		FormData triggerEventLViewerFormData = new FormData();
		triggerEventLViewerFormData.left = new FormAttachment(50, 0);
		triggerEventLViewerFormData.right = new FormAttachment(90, 0);
		triggerEventLViewerFormData.top = new FormAttachment(10, 0);
		triggerEventLViewerFormData.bottom = new FormAttachment(60, 0);
		Composite triggerEventViewerComposite = new Composite(main, SWT.NONE);
		triggerEventViewerComposite.setLayout(new FillLayout());
		triggerEventViewerComposite.setLayoutData(triggerEventLViewerFormData);
		existingRaisedEvent = new ListViewer(triggerEventViewerComposite);
		existingRaisedEvent
				.setContentProvider(new RaisedEventContentProvider());
		existingRaisedEvent.setInput(((ModifyRaisedEventWizard) getWizard())
				.getSelectedTransition());

		FormData deleteButtonFormData = new FormData();
		deleteButtonFormData.left = new FormAttachment(60, 0);
		deleteButtonFormData.right = new FormAttachment(80, 0);
		deleteButtonFormData.top = new FormAttachment(80, 0);
		deleteButtonFormData.bottom = new FormAttachment(90, 0);
		Button deleteButton = new Button(main, SWT.PUSH);
		deleteButton.setText("Delete Raised Event");
		deleteButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				handleDeleteSynchronizationEvent();
				existingRaisedEvent.refresh();
			}
		});
		deleteButton.setLayoutData(deleteButtonFormData);

	}

	private void handleDeleteSynchronizationEvent() {

		ISelection selection = existingRaisedEvent.getSelection();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;

			for (Object obj : sel.toList()) {

				if (obj != null) {
					AsynchronousMessageEvent tmp = ((ModifyRaisedEventWizard) getWizard())
							.getSelectedTransition().getRaiseMessageEvent();
					if (toMyString(tmp).equals(obj.toString())) {
						deleteObject(tmp);
						break;
					}
				}
			}
		}
	}

	public Object[] getMessageTypes(Object object) {
		if (object instanceof FujabaRealtimeStatechart) {

			FujabaRealtimeStatechart statechart = ((ModifyRaisedEventWizard) getWizard())
					.getRealtimeStatechart();

			MessageInterface messageInterface = null;

			if (statechart.getBehavioralElement() instanceof Role) {

				messageInterface = ((Role) statechart.getBehavioralElement())
						.getSenderMessageInterface();
			} else if (statechart.getBehavioralElement() instanceof DiscretePort) {

				messageInterface = ((DiscretePort) statechart
						.getBehavioralElement()).getSenderMessageInterface();
			}

			ArrayList<String> list = new ArrayList<String>();

			if (messageInterface != null) {
				Iterator<MessageType> iter = messageInterface.getMessageTypes()
						.iterator();
				while (iter.hasNext()) {
					MessageType messageTypeTmp = iter.next();
					list.add(toMyString(messageTypeTmp));
				}
				return list.toArray();
			}
		}

		return new Object[0];
	}

	class MessageTypeContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object parent) {
			return getMessageTypes(parent);
		}

		public void dispose() {
		}

	}

	public Object[] getRaisedEvents(Object object) {
		if (object instanceof Transition) {
			Transition transition = (Transition) object;

			return new String[] { toMyString(transition.getRaiseMessageEvent()) };
		}

		return new Object[0];
	}

	class RaisedEventContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object parent) {
			return getRaisedEvents(parent);
		}

		public void dispose() {
		}

	}

	private void setSelectedMessageType() {

		ISelection selection = messageTypeLViewer.getSelection();

		FujabaRealtimeStatechart statechart = ((ModifyRaisedEventWizard) getWizard())
				.getRealtimeStatechart();

		MessageInterface messageInterface = null;

		if (statechart.getBehavioralElement() instanceof Role) {

			messageInterface = ((Role) statechart.getBehavioralElement())
					.getSenderMessageInterface();
		} else if (statechart.getBehavioralElement() instanceof DiscretePort) {

			messageInterface = ((DiscretePort) statechart
					.getBehavioralElement()).getSenderMessageInterface();
		}

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;

			for (Object obj : sel.toList()) {

				if (messageInterface != null) {
					Iterator<MessageType> iter = messageInterface
							.getMessageTypes().iterator();
					while (iter.hasNext()) {
						MessageType messageTypeTmp = iter.next();

						if (toMyString(messageTypeTmp).equals(obj.toString())) {
							((ModifyRaisedEventWizard) getWizard())
									.setSelectedMessageType(messageTypeTmp);
							break;
						}
					}
				}
			}
		}
	}

	// TODO: Implement toMyString!
	private String toMyString(Object o) {
		return o.toString();
	}
}
