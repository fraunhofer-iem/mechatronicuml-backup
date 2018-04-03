package org.muml.pim.component.design.providers;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;

public class MyEditPartProvider extends AbstractEditPartProvider {
    @Override
    protected Class<?> getNodeEditPartClass(View view) {
//        if (view.getElement() instanceof CustomStyle) {
//            CustomStyle customStyle = (CustomStyle) view.getElement();
//            if (customStyle.getId().equals("org.muml.pim.port.style")) {
//                return HybridPortEditPart.class;
//            }
//        }
        return super.getNodeEditPartClass(view);
    }
}