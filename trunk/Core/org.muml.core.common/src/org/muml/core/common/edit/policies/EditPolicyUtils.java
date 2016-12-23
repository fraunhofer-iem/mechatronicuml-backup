package org.muml.core.common.edit.policies;

import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.LineTypeStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

public class EditPolicyUtils {
	
	private EditPolicyUtils() {
		// prevent instantiation
	}
	
	
	public static int getLineType(View view) {
		return getLineType((LineTypeStyle) view.getStyle(NotationPackage.eINSTANCE.getLineTypeStyle()));
	}
	
	/**
	 * Get the line type of the shape.
	 * 
	 * @return the line type.
	 */
	public static int getLineType(LineTypeStyle style) {
		// default to a solid line.
		int lineType = Graphics.LINE_SOLID;

		if (style != null) {
			if (style.getLineType() == LineType.SOLID_LITERAL) {
				lineType = Graphics.LINE_SOLID;
			} else if (style.getLineType() == LineType.DASH_LITERAL) {
				lineType = Graphics.LINE_DASH;
			} else if (style.getLineType() == LineType.DOT_LITERAL) {
				lineType = Graphics.LINE_DOT;
			} else if (style.getLineType() == LineType.DASH_DOT_LITERAL) {
				lineType = Graphics.LINE_DASHDOT;
			} else if (style.getLineType() == LineType.DASH_DOT_DOT_LITERAL) {
				lineType = Graphics.LINE_DASHDOTDOT;
			}
		}

		return lineType;
	}
}
