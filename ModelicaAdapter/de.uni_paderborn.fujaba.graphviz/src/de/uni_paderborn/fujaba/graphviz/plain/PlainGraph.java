/**
 */
package de.uni_paderborn.fujaba.graphviz.plain;

import de.uni_paderborn.fujaba.graphviz.common.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getScale <em>Scale</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getWidth <em>Width</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainPackage#getPlainGraph()
 * @model
 * @generated
 */
public interface PlainGraph extends Graph<PlainNode, PlainEdge> {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainPackage#getPlainGraph_Scale()
	 * @model required="true"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainPackage#getPlainGraph_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainPackage#getPlainGraph_Height()
	 * @model required="true"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // PlainGraph
