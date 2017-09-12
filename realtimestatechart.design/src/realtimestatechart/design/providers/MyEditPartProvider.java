package realtimestatechart.design.providers;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.FlatContainerStyle;
import org.eclipse.sirius.diagram.business.internal.metamodel.description.spec.ContainerMappingSpec;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

import realtimestatechart.design.edit.part.MyNodeListCompartmentEditPart;

public class MyEditPartProvider extends AbstractEditPartProvider {
    @Override
    protected Class<?> getNodeEditPartClass(View view) {
    	if (view.getType().equals("7003")) {
	        if (view.getElement() instanceof DRepresentationElement) {
	        	DRepresentationElement dre = (DRepresentationElement) view.getElement();
	        	if (dre.getMapping() instanceof DocumentedElement) {
	        		String hint = ((DocumentedElement)dre.getMapping()).getDocumentation();
	        		if (hint.contains("@listorientation=horizontal")) {

			        	if (dre.getStyle() instanceof FlatContainerStyle) {
			//	            CustomStyle customStyle = (CustomStyle) dre.getStyle();
			//	            if (customStyle.getId().equals(MyStyleEditPart.STYLE_ID)) {
				                return MyNodeListCompartmentEditPart.class;
			//	            }
			        	}
	        		}
	        	}
	        }
    	}
        return super.getNodeEditPartClass(view);
    }
}
