package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.commands.Command;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.figures.CustomHistoryFigure;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes;

public class CustomFujabaRealtimeStatechartEditPart extends
		FujabaRealtimeStatechartEditPart {

	private static final int ELLIPSE_RADIUS = 20;

	private CustomHistoryFigure historyFigure;

	public CustomFujabaRealtimeStatechartEditPart(View view) {
		super(view);
//		CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
//				new EObjectAdapter((EObject) this.getModel()),
//				Node.class,
//				((IHintedType) UmlrtElementTypes
//						.getElementType(FujabaRealtimeStatechartEditPart.VISUAL_ID))
//						.getSemanticHint(), true, null);
//		viewDescriptor.setPersisted(true);
//		CreateViewRequest createViewRequest = new CreateViewRequest(
//				viewDescriptor);
//		Command createViewCommand = this.getCommand(createViewRequest);
//		createViewCommand.execute();
	}

	@Override
	protected IFigure createFigure() {
		IFigure diagram = super.createFigure();
		historyFigure = new CustomHistoryFigure();
		historyFigure.setSize(ELLIPSE_RADIUS * 2, ELLIPSE_RADIUS * 2);
		diagram.add(historyFigure);
		return diagram;
	}

}
