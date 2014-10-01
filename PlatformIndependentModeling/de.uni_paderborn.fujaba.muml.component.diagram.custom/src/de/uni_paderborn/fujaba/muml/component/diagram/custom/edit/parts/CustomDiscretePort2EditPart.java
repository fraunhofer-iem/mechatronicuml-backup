package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.ecore.EReference;
//import org.eclipse.emf.ecore.InternalEObject;
//import org.eclipse.emf.ecore.impl.ENotificationImpl;
//import org.eclipse.gmf.runtime.notation.View;
//
//import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
//import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
//import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePort2EditPart;
//
///**
// * A customized PortEditPart for discrete ports.
// * 
// * @author bingo
// * 
// */
//public class CustomDiscretePort2EditPart extends DiscretePort2EditPart {
//
//	/**
//	 * Constructs this EditPart.
//	 * 
//	 * @param view
//	 *            The graphical model.
//	 */
//	public CustomDiscretePort2EditPart(View view) {
//		super(view);
//	}
//
//	/**
//	 * Updates the visual representation of this Port according to model
//	 * changes.
//	 */
//	@Override
//	protected final void handleNotificationEvent(final Notification notification) {
//		if (notification.getFeature() == ComponentPackage.Literals.DISCRETE_PORT__COORDINATION_PROTOCOL) {
//			View view = (View) getNotationView().eContainer().eContainer();
//			if (view.getElement() instanceof StructuredComponent) {
//				InternalEObject object = (InternalEObject) view.getElement();
//				final EReference ref = ComponentPackage.Literals.DISCRETE_PORT__COORDINATION_PROTOCOL;
//				Object value = object.eGet(ref);
//				// Notify
//				object.eNotify(new ENotificationImpl(object,
//						Notification.ADD_MANY, ref, value, value));
//				
//			}
//
//		}
//		super.handleNotificationEvent(notification);
//	}
//}
