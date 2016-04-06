/**
 */
package org.muml.graphviz.plain;

import org.muml.graphviz.common.Node;
import org.muml.graphviz.util.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.plain.PlainNode#getWidth <em>Width</em>}</li>
 *   <li>{@link org.muml.graphviz.plain.PlainNode#getHeight <em>Height</em>}</li>
 *   <li>{@link org.muml.graphviz.plain.PlainNode#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.muml.graphviz.plain.PlainPackage#getPlainNode()
 * @model
 * @generated
 */
public interface PlainNode extends Node {
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
	 * @see org.muml.graphviz.plain.PlainPackage#getPlainNode_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.plain.PlainNode#getWidth <em>Width</em>}' attribute.
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
	 * @see org.muml.graphviz.plain.PlainPackage#getPlainNode_Height()
	 * @model required="true"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.plain.PlainNode#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see org.muml.graphviz.plain.PlainPackage#getPlainNode_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.plain.PlainNode#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

} // PlainNode
