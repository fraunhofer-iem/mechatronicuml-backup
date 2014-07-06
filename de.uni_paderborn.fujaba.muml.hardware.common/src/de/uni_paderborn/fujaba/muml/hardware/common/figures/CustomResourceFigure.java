package de.uni_paderborn.fujaba.muml.hardware.common.figures;


import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;


/**
 * The custom ResourceFigure for all {@link ResourceType}s and {@link ResourceInstance} except the Resources with a compartment in its figure ({@link StructuredResource}, {@link StructuredResourceInstance}).
 * @author adann
 *
 */
public class CustomResourceFigure extends RectangleFigure implements ICustomResourceFigure{

	/**
	 * @generated
	 */
	private WrappingLabel fFigureResourceNameFigure;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureResourceKindFigure;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureResourceCardinalityFigure;
	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure fFigureCustomIconFigure;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureResourceInfo1;
	/**
	 * @generated
	 */
	private WrappingLabel fFigureResourceInfo2;
	
	private RectangleFigure resourceInfo0;
	
	

	/**
	 * @generated
	 */
	public CustomResourceFigure() {

		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 1;
		layoutThis.makeColumnsEqualWidth = true;
		this.setLayoutManager(layoutThis);

		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		RectangleFigure resourceContainerFigure0 = new RectangleFigure();

		resourceContainerFigure0.setOutline(false);
		resourceContainerFigure0.setBorder(new MarginBorder(5));

		GridData constraintResourceContainerFigure0 = new GridData();
		constraintResourceContainerFigure0.verticalAlignment = GridData.BEGINNING;
		constraintResourceContainerFigure0.horizontalAlignment = GridData.FILL;
		constraintResourceContainerFigure0.horizontalIndent = 0;
		constraintResourceContainerFigure0.horizontalSpan = 1;
		constraintResourceContainerFigure0.verticalSpan = 1;
		constraintResourceContainerFigure0.grabExcessHorizontalSpace = true;
		constraintResourceContainerFigure0.grabExcessVerticalSpace = false;
		this.add(resourceContainerFigure0,
				constraintResourceContainerFigure0);

		
		
		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 2;
		layoutThis.makeColumnsEqualWidth = false;
		resourceContainerFigure0.setLayoutManager(layoutThis);
		
		GridData constraint = new GridData();
		constraint.verticalAlignment = GridData.FILL;
		constraint.horizontalAlignment = GridData.FILL;
		constraint.horizontalIndent = 0;
		constraint.horizontalSpan = 1;
		constraint.verticalSpan = 1;
		constraint.grabExcessHorizontalSpace = true;
		constraint.grabExcessVerticalSpace = true;
		

		RectangleFigure resourceNameRectangle1 = new RectangleFigure();

		resourceNameRectangle1.setFill(false);
		resourceNameRectangle1.setOutline(false);

		resourceContainerFigure0.add(resourceNameRectangle1,constraint);

		GridLayout layoutResourceNameRectangle1 = new GridLayout();
		layoutResourceNameRectangle1.numColumns = 3;
		layoutResourceNameRectangle1.makeColumnsEqualWidth = false;
		resourceNameRectangle1
				.setLayoutManager(layoutResourceNameRectangle1);

		fFigureResourceNameFigure = new WrappingLabel();

		fFigureResourceNameFigure.setText("<...>");

		GridData constraintFFigureResourceNameFigure = new GridData();
		constraintFFigureResourceNameFigure.verticalAlignment = GridData.CENTER;
		constraintFFigureResourceNameFigure.horizontalAlignment = GridData.END;
		constraintFFigureResourceNameFigure.horizontalIndent = 0;
		constraintFFigureResourceNameFigure.horizontalSpan = 1;
		constraintFFigureResourceNameFigure.verticalSpan = 1;
		constraintFFigureResourceNameFigure.grabExcessHorizontalSpace = true;
		constraintFFigureResourceNameFigure.grabExcessVerticalSpace = true;
		resourceNameRectangle1.add(fFigureResourceNameFigure,
				constraintFFigureResourceNameFigure);

		fFigureResourceKindFigure = new WrappingLabel();

		fFigureResourceKindFigure.setText("<...>");

		GridData constraintFFigureResourceKindFigure = new GridData();
		constraintFFigureResourceKindFigure.verticalAlignment = GridData.CENTER;
		constraintFFigureResourceKindFigure.horizontalAlignment = GridData.BEGINNING;
		constraintFFigureResourceKindFigure.horizontalIndent = 0;
		constraintFFigureResourceKindFigure.horizontalSpan = 1;
		constraintFFigureResourceKindFigure.verticalSpan = 1;
		constraintFFigureResourceKindFigure.grabExcessHorizontalSpace = true;
		constraintFFigureResourceKindFigure.grabExcessVerticalSpace = true;
		resourceNameRectangle1.add(fFigureResourceKindFigure,
				constraintFFigureResourceKindFigure);

		fFigureResourceCardinalityFigure = new WrappingLabel();

		fFigureResourceCardinalityFigure.setText("<...>");

		GridData constraintFFigureResourceCardinalityFigure = new GridData();
		constraintFFigureResourceCardinalityFigure.verticalAlignment = GridData.CENTER;
		constraintFFigureResourceCardinalityFigure.horizontalAlignment = GridData.BEGINNING;
		constraintFFigureResourceCardinalityFigure.horizontalIndent = 0;
		constraintFFigureResourceCardinalityFigure.horizontalSpan = 1;
		constraintFFigureResourceCardinalityFigure.verticalSpan = 1;
		constraintFFigureResourceCardinalityFigure.grabExcessHorizontalSpace = true;
		constraintFFigureResourceCardinalityFigure.grabExcessVerticalSpace = true;
		resourceNameRectangle1.add(fFigureResourceCardinalityFigure,
				constraintFFigureResourceCardinalityFigure);


		
		
		GridData constraint2 = new GridData();
		constraint2.verticalAlignment = GridData.FILL;
		constraint2.horizontalAlignment = GridData.FILL;
		constraint2.horizontalIndent = 0;
		constraint2.horizontalSpan = 1;
		constraint2.verticalSpan = 1;
		constraint2.grabExcessHorizontalSpace = false;
		constraint2.grabExcessVerticalSpace = true;

		fFigureCustomIconFigure = new de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure();
		
		RectangleFigure iconContainer=new RectangleFigure();
		iconContainer.setFill(false);
		iconContainer.setOutline(false);
		iconContainer.setBorder(new MarginBorder(0));
		iconContainer.setLayoutManager(new StackLayout());
		iconContainer.add(fFigureCustomIconFigure);
		iconContainer.setPreferredSize(50, 50);
		resourceContainerFigure0.add(iconContainer,constraint2);

		resourceInfo0 = new RectangleFigure();

		 GridData constraintResourceInfo0 = new GridData();
		constraintResourceInfo0.verticalAlignment = GridData.FILL;
		constraintResourceInfo0.horizontalAlignment = GridData.FILL;
		constraintResourceInfo0.horizontalIndent = 0;
		constraintResourceInfo0.horizontalSpan = 1;
		constraintResourceInfo0.verticalSpan = 1;
		constraintResourceInfo0.grabExcessHorizontalSpace = true;
		constraintResourceInfo0.grabExcessVerticalSpace = true;
		this.add(resourceInfo0, constraintResourceInfo0);

		GridLayout layoutResourceInfo0 = new GridLayout();
		layoutResourceInfo0.numColumns = 1;
		layoutResourceInfo0.makeColumnsEqualWidth = false;
		resourceInfo0.setLayoutManager(layoutResourceInfo0);

		fFigureResourceInfo1 = new WrappingLabel();

		fFigureResourceInfo1.setText("");

		GridData constraintFFigureResourceInfo1 = new GridData();
		constraintFFigureResourceInfo1.verticalAlignment = GridData.CENTER;
		constraintFFigureResourceInfo1.horizontalAlignment = GridData.CENTER;
		constraintFFigureResourceInfo1.horizontalIndent = 0;
		constraintFFigureResourceInfo1.horizontalSpan = 1;
		constraintFFigureResourceInfo1.verticalSpan = 1;
		constraintFFigureResourceInfo1.grabExcessHorizontalSpace = false;
		constraintFFigureResourceInfo1.grabExcessVerticalSpace = false;
		resourceInfo0.add(fFigureResourceInfo1,
				constraintFFigureResourceInfo1);

		fFigureResourceInfo2 = new WrappingLabel();

		fFigureResourceInfo2.setText("");

		GridData constraintFFigureResourceInfo2 = new GridData();
		constraintFFigureResourceInfo2.verticalAlignment = GridData.CENTER;
		constraintFFigureResourceInfo2.horizontalAlignment = GridData.CENTER;
		constraintFFigureResourceInfo2.horizontalIndent = 0;
		constraintFFigureResourceInfo2.horizontalSpan = 1;
		constraintFFigureResourceInfo2.verticalSpan = 1;
		constraintFFigureResourceInfo2.grabExcessHorizontalSpace = false;
		constraintFFigureResourceInfo2.grabExcessVerticalSpace = false;
		resourceInfo0.add(fFigureResourceInfo2,
				constraintFFigureResourceInfo2); 
		
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureResourceNameFigure() {
		return fFigureResourceNameFigure;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureResourceKindFigure() {
		return fFigureResourceKindFigure;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureResourceCardinalityFigure() {
		return fFigureResourceCardinalityFigure;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure getFigureCustomIconFigure() {
		return fFigureCustomIconFigure;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureResourceInfo1() {
		return fFigureResourceInfo1;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureResourceInfo2() {
		return fFigureResourceInfo2;
	}

	public RectangleFigure getFigureResourceInfoRectangle(){
		return this.resourceInfo0;
	}

	public void isResourceInstance(Boolean isInstance) {
		this.fFigureResourceNameFigure.setTextUnderline(isInstance);
		this.fFigureResourceKindFigure.setTextUnderline(isInstance);
	}

	@Override
	public void isDevice(Boolean isDevice) {
		// TODO Auto-generated method stub
		
	}

}