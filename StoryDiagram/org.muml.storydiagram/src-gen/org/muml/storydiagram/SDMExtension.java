/**
 */
package org.muml.storydiagram;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDM Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.muml.storydiagram.StorydiagramPackage#getSDMExtension()
 * @model
 * @generated
 */
public interface SDMExtension extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (getEContainer() instanceof EAnnotation && getEContainer().getEContainer() instanceof EModelElement) {\n\treturn (EModelElement) getEContainer().getEContainer();\n}\nreturn null;'"
	 * @generated
	 */
	EModelElement getModelBase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='EAnnotation annotation = null;\nif (modelBase != null) {\n\t// Find annotation via source\n\tfor (EAnnotation currentAnnotation : modelBase.getAnnotations()) {\n\t\tif (\"uri\".equals(currentAnnotation.getSource()) {\n\t\t\tannotation = currentAnnotation;\n\t\t\tbreak;\n\t\t}\n\t}\n\n\t// Create annotation if not found\n\tif (annotation == null) {\n\t\tannotation = EcoreFactory.eINSTANCE.createEAnnotation();\n\t\tannotation.setSource(\"uri\");\n\t\tmodelBase.getAnnotations().add(annotation);\n\t}\n}\n\n// Add to references of annotation\nannotation.getReferences().add(this);'"
	 * @generated
	 */
	void setModelBase(EModelElement modelBase);

} // SDMExtension
