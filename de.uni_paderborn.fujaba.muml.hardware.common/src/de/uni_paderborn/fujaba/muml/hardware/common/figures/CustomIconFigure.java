package de.uni_paderborn.fujaba.muml.hardware.common.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

import de.uni_paderborn.fujaba.muml.hardware.common.icons.Cpu;

/**
 * The custom icon figure gallery for all {@link ResourceType}s and {@link ResourceInstance}s.
 * @author adann
 *
 */
public class CustomIconFigure extends RectangleFigure {

	public static enum ResourceType {
		PROCESSOR, PLD, MEMORY, ACTUATOR, SENSOR, CACHE, STRUCTURED, PLATFORM
	}

	private RectangleFigure sensorIconFigure;

	private RectangleFigure actuatorIconFigure;

	private RectangleFigure processorIconFigure;

	private RectangleFigure pldIconFigure;

	private RectangleFigure memoryIconFigure;

	private RectangleFigure structuredIconFigure;

	private RectangleFigure platformIconFigure;

	public CustomIconFigure() {
		GridLayout layoutCustomIconFigure = new GridLayout();
		layoutCustomIconFigure.numColumns = 1;
		layoutCustomIconFigure.makeColumnsEqualWidth = true;
		this.setLayoutManager(layoutCustomIconFigure);
		this.setBorder(new MarginBorder(5));
		this.setFill(false);
		this.setOutline(false);
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		// Icon Container
		RectangleFigure container = new RectangleFigure();
		container.setLayoutManager(new StackLayout());
		container.setOutline(false);
		container.setFill(false);

		GridData constraintContainerFigure = new GridData();
		constraintContainerFigure.verticalAlignment = GridData.END;
		constraintContainerFigure.horizontalAlignment = GridData.END;
		constraintContainerFigure.horizontalIndent = 0;
		constraintContainerFigure.horizontalSpan = 1;
		constraintContainerFigure.verticalSpan = 1;
		constraintContainerFigure.grabExcessHorizontalSpace = true;
		constraintContainerFigure.grabExcessVerticalSpace = true;

		this.add(container, constraintContainerFigure);

		drawSensorIcon(container);
		drawActuatorIcon(container);
		drawProcessorIcon(container);
		drawMemoryIcon(container);
		drawStructuredIcon(container);
		// drawPlatformIcon(container);

		// PLDIcon
		pldIconFigure = new RectangleFigure();

		container.add(pldIconFigure);

	}

	private void drawPlatformIcon(RectangleFigure container) {

		platformIconFigure = new RectangleFigure();
		platformIconFigure.setLayoutManager(new StackLayout());
		platformIconFigure.setFill(false);
		platformIconFigure.setOutline(false);
		platformIconFigure.setPreferredSize(30, 30);

		drawStructuredIcon(platformIconFigure);

		container.add(platformIconFigure);

	}

	private void drawMemoryIcon(RectangleFigure container) {
		// MemoryIcon
		memoryIconFigure = new RectangleFigure();
		memoryIconFigure.setLayoutManager(new StackLayout());
		memoryIconFigure.setOutline(false);

		RectangleFigure icon = new RectangleFigure();
		icon.setLayoutManager(new XYLayout());
		icon.setOutline(false);

		Ellipse disk = new Ellipse();
		disk.setFill(true);

		Ellipse disk2 = new Ellipse();

		Ellipse disk3 = new Ellipse();
		disk3.setBackgroundColor(ColorConstants.gray);
		disk3.setFill(true);
		disk3.setOutline(false);

		PolylineShape line = new PolylineShape();
		line.addPoint(new Point(1, 0));
		line.addPoint(new Point(1, 23));
		line.setBackgroundColor(ColorConstants.black);

		PolylineShape line2 = new PolylineShape();
		line2.addPoint(new Point(28, 0));
		line2.addPoint(new Point(28, 23));
		line2.setBackgroundColor(ColorConstants.black);

		RectangleFigure shadow = new RectangleFigure();
		shadow.setOutline(false);
		shadow.setFill(true);
		shadow.setBackgroundColor(ColorConstants.gray);

		icon.add(disk2, new Rectangle(1, 21, 28, 10));

		icon.add(shadow, new Rectangle(1, 3, 28, 24));

		icon.add(disk3, new Rectangle(1, 21, 28, 10));

		icon.add(disk, new Rectangle(1, 0, 28, 10));
		icon.add(line, new Rectangle(0, 4, 30, 23));
		icon.add(line2, new Rectangle(0, 4, 30, 23)); 

		memoryIconFigure.add(icon); 
	
//		memoryIconFigure.add(icon,new Rectangle(0,10,30,10)); 
//		memoryIconFigure.add(icon,new Rectangle(0,20,30,10)); 



		container.add(memoryIconFigure);

	}

	private void drawSensorIcon(RectangleFigure container) {
		// SensorICON
		sensorIconFigure = new RectangleFigure();
		sensorIconFigure.setLayoutManager(new StackLayout());
		sensorIconFigure.setOutline(false);
		sensorIconFigure.setFill(false);

		RectangleFigure icon = new RectangleFigure();
		icon.setLayoutManager(new XYLayout());
		icon.setOutline(false);
		icon.setFill(true);

		Ellipse sensorCircle = new Ellipse();
		sensorCircle.setFill(false);
		PolylineShape sensorLine = new PolylineShape();
		sensorLine.addPoint(new Point(0, 15));
		sensorLine.addPoint(new Point(6, 15));
		sensorLine.addPoint(new Point(9, 5));
		sensorLine.addPoint(new Point(12, 15));
		sensorLine.addPoint(new Point(30, 15));
		sensorLine.setBackgroundColor(ColorConstants.black);

		icon.add(sensorCircle, new Rectangle(0, 0, 30, 30));
		icon.add(sensorLine, new Rectangle(0, 0, 30, 30));

		sensorIconFigure.add(icon);

		container.add(sensorIconFigure);

	}

	private void drawActuatorIcon(RectangleFigure container) {
		// AcutatorIcon
		actuatorIconFigure = new RectangleFigure();
		actuatorIconFigure.setFill(false);
		actuatorIconFigure.setOutline(false);
		actuatorIconFigure.setLayoutManager(new StackLayout());

		RectangleFigure icon = new RectangleFigure();
		icon.setLayoutManager(new XYLayout());
		icon.setOutline(false);

		RectangleFigure upperRect = new RectangleFigure();
		upperRect.setBackgroundColor(ColorConstants.black);
		upperRect.setFill(true);

		PolylineShape spring = new PolylineShape();
		spring.addPoint(new Point(7, 0));
		spring.addPoint(new Point(23, 3));
		spring.addPoint(new Point(7, 6));
		spring.addPoint(new Point(23, 9));
		spring.addPoint(new Point(7, 10));
		spring.addPoint(new Point(10, 10));
		spring.setBackgroundColor(ColorConstants.black);

		RectangleFigure lowerRect = new RectangleFigure();
		lowerRect.setBackgroundColor(ColorConstants.black);
		lowerRect.setFill(true);

		icon.add(upperRect, new Rectangle(5, 0, 20, 10));
		icon.add(spring, new Rectangle(0, 10, 20, 10));
		icon.add(lowerRect, new Rectangle(5, 20, 20, 10));

		actuatorIconFigure.add(icon);

		container.add(actuatorIconFigure);
	}

	private void drawProcessorIcon(RectangleFigure container) {
		// ProessorIcon
		processorIconFigure = new RectangleFigure();
		processorIconFigure.setLayoutManager(new StackLayout());
		processorIconFigure.setOutline(false);

		/*
		 * RectangleFigure icon=new RectangleFigure(); icon.setLayoutManager(new
		 * XYLayout()); icon.setOutline(true);
		 * icon.setBackgroundColor(ColorConstants.black);
		 * 
		 * 
		 * ScalablePolygonShape die = new ScalablePolygonShape();
		 * 
		 * die.addPoint(new Point(0,0)); die.addPoint(new Point(0,5));
		 * die.addPoint(new Point(3,5)); die.addPoint(new Point(5,3));
		 * die.addPoint(new Point(5,0));
		 * 
		 * die.setBackgroundColor(ColorConstants.white);
		 * 
		 * 
		 * 
		 * icon.add(die,new Rectangle(5,5,20,20));
		 * processorIconFigure.add(icon);
		 */

		
		Cpu cpu0 = new Cpu();
		processorIconFigure.add(cpu0);

		container.add(processorIconFigure);
	}

	private void drawStructuredIcon(RectangleFigure container) {
		// StructuredResourcceIcon
		structuredIconFigure = new RectangleFigure();
		structuredIconFigure.setLayoutManager(new StackLayout());
		structuredIconFigure.setFill(false);
		structuredIconFigure.setOutline(false);
		structuredIconFigure.setPreferredSize(30, 30);

		RectangleFigure icon = new RectangleFigure();
		icon.setLayoutManager(new XYLayout());
		icon.setOutline(false);

		Color SHADOW = new Color(null, 140, 140, 140);

		RectangleFigure forder = new RectangleFigure();

		ScalablePolygonShape up = new ScalablePolygonShape();
		up.setOutline(true);
		up.addPoint(new Point(0, 10));
		up.addPoint(new Point(7, 10));
		up.addPoint(new Point(10, 0));
		up.addPoint(new Point(3, 0));
		up.setFill(true);
		up.setBackgroundColor(SHADOW);

		ScalablePolygonShape side = new ScalablePolygonShape();
		side.setOutline(true);
		side.addPoint(new Point(0, 0));
		side.addPoint(new Point(0, 10));
		side.addPoint(new Point(7, 7));
		side.addPoint(new Point(7, 0));
		side.addPoint(new Point(0, 0));
		side.setFill(true);
		side.setBackgroundColor(SHADOW);

		icon.add(side, new Rectangle(18, 3, 12, 29));
		icon.add(up, new Rectangle(0, 3, 30, 8));
		icon.add(forder, new Rectangle(0, 10, 21, 21));

		structuredIconFigure.add(icon);
		container.add(structuredIconFigure);

	}

	public void setIcon(ResourceType resourceType) {
		sensorIconFigure.setVisible(resourceType == ResourceType.SENSOR);
		actuatorIconFigure.setVisible(resourceType == ResourceType.ACTUATOR);
		processorIconFigure.setVisible(resourceType == ResourceType.PROCESSOR);
		pldIconFigure.setVisible(resourceType == ResourceType.PLD);
		memoryIconFigure.setVisible(resourceType == ResourceType.MEMORY);
		structuredIconFigure.setVisible(resourceType == ResourceType.STRUCTURED
				|| resourceType == ResourceType.PLATFORM);
	}
}
