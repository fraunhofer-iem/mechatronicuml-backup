package de.uni_paderborn.fujaba.muml.hardware.common.figures;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public interface ICustomResourceFigure {
	public WrappingLabel getFigureResourceCardinalityFigure();
	public WrappingLabel getFigureResourceKindFigure();
	
	public WrappingLabel getFigureResourceNameFigure();

	public de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure getFigureCustomIconFigure();
	public void isResourceInstance(Boolean isInstance);
	

}
