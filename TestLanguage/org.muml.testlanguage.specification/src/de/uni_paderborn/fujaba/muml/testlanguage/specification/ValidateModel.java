/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;
import java.util.Map;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Validate Model</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage#getValidateModel()
 * @model
 * @generated
 */
public interface ValidateModel extends NodeSpecification {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Validate Model\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"model\", false,\r\n\t\t\t\torg.eclipse.emf.ecore.EObject.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"bool\", false,\r\n\t\t\t\tjava.lang.Boolean.class);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "de.uni_paderborn.fujaba.muml.testlanguage.specification.ExecutionException de.uni_paderborn.fujaba.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// TODO Maybe also get a BatchValidator, see ValidateAction.\r\n\t\t// Validate using a Diagnostic instance.\r\n\t\tDiagnostic diagnostic = Diagnostician.INSTANCE\r\n\t\t\t\t.validate((EObject) inputs.get(\"model\"));\r\n\r\n\t\tboolean result = true;\r\n\t\tif (diagnostic.getSeverity() == Diagnostic.ERROR) {\r\n\t\t\tresult = false;\r\n\t\t}\r\n\r\n\t\t// Wrap the result up and put it on the output port.\r\n\t\toutputs.put(\"bool\", new Boolean(result));\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs)
			throws ExecutionException, Exception;

} // ValidateModel
