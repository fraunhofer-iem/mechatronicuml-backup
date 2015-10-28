/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.impl;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.NodeSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.PortType;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.ValidateModel;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Validate Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ValidateModelImpl extends NodeSpecificationImpl implements
		ValidateModel {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.VALIDATE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Validate Model");
		this.addPortSpecification(PortType.IN, "model", false,
				org.eclipse.emf.ecore.EObject.class);
		this.addPortSpecification(PortType.OUT, "bool", false,
				java.lang.Boolean.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs,
			final Map<String, Object> outputs) throws ExecutionException,
			Exception {
		// TODO Maybe also get a BatchValidator, see ValidateAction.
		// Validate using a Diagnostic instance.
		Diagnostic diagnostic = Diagnostician.INSTANCE
				.validate((EObject) inputs.get("model"));

		boolean result = true;
		if (diagnostic.getSeverity() == Diagnostic.ERROR) {
			result = false;
		}

		// Wrap the result up and put it on the output port.
		outputs.put("bool", new Boolean(result));

		return;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NodeSpecification.class) {
			switch (baseOperationID) {
			case SpecificationPackage.NODE_SPECIFICATION___INITIALIZE:
				return SpecificationPackage.VALIDATE_MODEL___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.VALIDATE_MODEL___EXECUTE__MAP_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.VALIDATE_MODEL___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.VALIDATE_MODEL___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0),
						(Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}

} // ValidateModelImpl
