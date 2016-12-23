package org.muml.pm.hardware.common.refactor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramImageGenerator;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

public class CustomRenderingHelper {
	private CustomRenderingHelper() {

	}

	public static org.eclipse.swt.graphics.Image renderToSWTImage(Diagram diagram) {
		if (null == diagram) {
			throw new NullPointerException("Argument 'diagram' is null"); //$NON-NLS-1$
		}

		Shell shell = new Shell();
		try {

			DiagramEditPart diagramEP = OffscreenEditPartFactory.getInstance().createDiagramEditPart(diagram, shell);

			DiagramImageGenerator imageGenerator = new DiagramImageGenerator(diagramEP);

			// Image image = imageGenerator.createSWTImageDescriptorForDiagram()
			// .createImage();
			List<EditPart> editParts = new ArrayList<EditPart>();
			editParts.add(diagramEP.getPrimaryChildEditPart());
			Image image = imageGenerator.createSWTImageDescriptorForParts(editParts).createImage();
			return image;
		} finally {
			shell.dispose();
		}

	}

}
