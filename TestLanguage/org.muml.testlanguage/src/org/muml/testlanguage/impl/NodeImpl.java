/**
 */
package org.muml.testlanguage.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.testlanguage.Input;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.Output;
import org.muml.testlanguage.TestLanguageFactory;
import org.muml.testlanguage.TestLanguagePackage;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationFactory;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getInputs <em>Inputs</em>}
 * </li>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getOutputs <em>Outputs</em>}
 * </li>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getSpecification
 * <em>Specification</em>}</li>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getSpecificationClassName
 * <em>Specification Class Name</em>}</li>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getInputCache
 * <em>Input Cache</em>}</li>
 * <li>{@link org.muml.testlanguage.impl.NodeImpl#getOutputCache
 * <em>Output Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "node";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecification()
	 * <em>Specification</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected NodeSpecification specification;

	/**
	 * The default value of the '{@link #getSpecificationClassName()
	 * <em>Specification Class Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSpecificationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_CLASS_NAME_EDEFAULT = "Default";

	/**
	 * The cached value of the '{@link #getSpecificationClassName()
	 * <em>Specification Class Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSpecificationClassName()
	 * @generated
	 * @ordered
	 */
	protected String specificationClassName = SPECIFICATION_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputCache() <em>Input Cache</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputCache()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> inputCache;

	/**
	 * The cached value of the '{@link #getOutputCache() <em>Output Cache</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputCache()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> outputCache;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestLanguagePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<Input>(Input.class, this, TestLanguagePackage.NODE__INPUTS,
					TestLanguagePackage.INPUT__NODE);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList<Output>(Output.class, this,
					TestLanguagePackage.NODE__OUTPUTS, TestLanguagePackage.OUTPUT__NODE);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestLanguagePackage.NODE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NodeSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSpecification(NodeSpecification newSpecification, NotificationChain msgs) {
		NodeSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TestLanguagePackage.NODE__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpecification(NodeSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject) specification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TestLanguagePackage.NODE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TestLanguagePackage.NODE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestLanguagePackage.NODE__SPECIFICATION,
					newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSpecificationClassName() {
		return specificationClassName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpecificationClassName(String newSpecificationClassName) {
		String oldSpecificationClassName = specificationClassName;
		specificationClassName = newSpecificationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestLanguagePackage.NODE__SPECIFICATION_CLASS_NAME,
					oldSpecificationClassName, specificationClassName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map<String, Object> getInputCache() {
		return inputCache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInputCache(Map<String, Object> newInputCache) {
		Map<String, Object> oldInputCache = inputCache;
		inputCache = newInputCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestLanguagePackage.NODE__INPUT_CACHE, oldInputCache,
					inputCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map<String, Object> getOutputCache() {
		return outputCache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutputCache(Map<String, Object> newOutputCache) {
		Map<String, Object> oldOutputCache = outputCache;
		outputCache = newOutputCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestLanguagePackage.NODE__OUTPUT_CACHE,
					oldOutputCache, outputCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setupFromSpecification() {
		// Set the label according to the specification.
		this.setLabel(this.specification.getLabel());

		// Remember old in- and outputs for later reuse.
		List<Input> oldInputs = new LinkedList<Input>();
		for (Input input : this.getInputs()) {
			oldInputs.add(input);
		}
		List<Output> oldOutputs = new LinkedList<Output>();
		for (Output output : this.getOutputs()) {
			oldOutputs.add(output);
		}

		// Clear old ports.
		this.getInputs().clear();
		this.getOutputs().clear();

		// Setup new ports and reuse old ones if possible.
		for (EObject specObj : this.specification.getPortSpecifications()) {
			PortSpecification spec = (PortSpecification) specObj;

			boolean specificationIsInOut = spec.getType() == PortType.INOUT;

			if (spec.getType() == PortType.IN || spec.getType() == PortType.INOUT) {

				// Can we reuse an old input port?
				boolean reuse = false;
				Iterator<Input> iter = oldInputs.iterator();
				while (iter.hasNext()) {
					Input input = iter.next();
					if (input.getName().equals(spec.getName()) && input.isOptional() == spec.isOptional()
							&& input.getDataType() == spec.getDataType() && input.isInOut() == specificationIsInOut) {
						this.getInputs().add(input);
						iter.remove();
						reuse = true;
						break;
					}
				}

				// If not, create a new input port.
				if (!reuse) {
					Input input = TestLanguageFactory.eINSTANCE.createInput();
					input.setName(spec.getName());
					input.setOptional(spec.isOptional());
					input.setDataType(spec.getDataType());
					input.setInOut(specificationIsInOut);
					this.getInputs().add(input);
				}
			}

			if (spec.getType() == PortType.OUT || spec.getType() == PortType.INOUT) {

				// Can we reuse an old output port?
				boolean reuse = false;
				Iterator<Output> iter = oldOutputs.iterator();
				while (iter.hasNext()) {
					Output output = iter.next();
					if (output.getName().equals(spec.getName()) && output.isInOut() == specificationIsInOut) {
						this.getOutputs().add(output);
						iter.remove();
						reuse = true;
						break;
					}
				}

				// If not, create a new output port.
				if (!reuse) {
					Output output = TestLanguageFactory.eINSTANCE.createOutput();
					output.setName(spec.getName());
					output.setInOut(specificationIsInOut);
					this.getOutputs().add(output);
				}
			}

		}

		// Disconnect old ports that are not used anymore.
		for (Input input : oldInputs) {
			input.setSource(null);
		}
		for (Output output : oldOutputs) {
			for (Input input : output.getTargets()) {
				input.setSource(null);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute() throws ExecutionException,
			de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException {
		// FIXME Hack to disable notifications so that the transactional editing
		// domain won't complain about me modifying the domain element.
		this.eSetDeliver(false);

		// Initialize caches if needed.
		if (this.getInputCache() == null) {
			this.setInputCache(new HashMap<String, Object>());
		}
		if (this.getOutputCache() == null) {
			this.setOutputCache(new HashMap<String, Object>());
		}

		// Refresh the input cache.
		for (Input input : this.getInputs()) {
			if (input.getSource() == null) {
				this.getInputCache().remove(input.getName());
			} else {
				this.getInputCache().put(input.getName(), input.getData());
			}
		}

		// Clear the output cache.
		this.getOutputCache().clear();

		// NOTE A check whether all non-optional ports actually get data is not
		// necessary, as previous constraints already took care of this.

		try {
			// Execute the behavior that is written in the specification.
			this.specification.execute(this.getInputCache(), this.getOutputCache());

			return;
		} catch (Exception e) {

			// Clear the output cache.
			this.getOutputCache().clear();

			throw new ExecutionException(e);
		} finally {
			this.eSetDeliver(true);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createSpecification() {
		try {
			SpecificationFactory fac = de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationFactory.eINSTANCE;
			java.lang.reflect.Method creator = fac.getClass().getMethod("create" + this.specificationClassName);

			this.setSpecification((NodeSpecification) creator.invoke(fac));
			this.specification.initialize();
		} catch (NoSuchMethodException e) {
			// The desired NodeSpecification does not exist.
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestLanguagePackage.NODE__INPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputs()).basicAdd(otherEnd, msgs);
		case TestLanguagePackage.NODE__OUTPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestLanguagePackage.NODE__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case TestLanguagePackage.NODE__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case TestLanguagePackage.NODE__SPECIFICATION:
			return basicSetSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestLanguagePackage.NODE__INPUTS:
			return getInputs();
		case TestLanguagePackage.NODE__OUTPUTS:
			return getOutputs();
		case TestLanguagePackage.NODE__LABEL:
			return getLabel();
		case TestLanguagePackage.NODE__SPECIFICATION:
			return getSpecification();
		case TestLanguagePackage.NODE__SPECIFICATION_CLASS_NAME:
			return getSpecificationClassName();
		case TestLanguagePackage.NODE__INPUT_CACHE:
			return getInputCache();
		case TestLanguagePackage.NODE__OUTPUT_CACHE:
			return getOutputCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestLanguagePackage.NODE__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Input>) newValue);
			return;
		case TestLanguagePackage.NODE__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case TestLanguagePackage.NODE__LABEL:
			setLabel((String) newValue);
			return;
		case TestLanguagePackage.NODE__SPECIFICATION:
			setSpecification((NodeSpecification) newValue);
			return;
		case TestLanguagePackage.NODE__SPECIFICATION_CLASS_NAME:
			setSpecificationClassName((String) newValue);
			return;
		case TestLanguagePackage.NODE__INPUT_CACHE:
			setInputCache((Map<String, Object>) newValue);
			return;
		case TestLanguagePackage.NODE__OUTPUT_CACHE:
			setOutputCache((Map<String, Object>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestLanguagePackage.NODE__INPUTS:
			getInputs().clear();
			return;
		case TestLanguagePackage.NODE__OUTPUTS:
			getOutputs().clear();
			return;
		case TestLanguagePackage.NODE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case TestLanguagePackage.NODE__SPECIFICATION:
			setSpecification((NodeSpecification) null);
			return;
		case TestLanguagePackage.NODE__SPECIFICATION_CLASS_NAME:
			setSpecificationClassName(SPECIFICATION_CLASS_NAME_EDEFAULT);
			return;
		case TestLanguagePackage.NODE__INPUT_CACHE:
			setInputCache((Map<String, Object>) null);
			return;
		case TestLanguagePackage.NODE__OUTPUT_CACHE:
			setOutputCache((Map<String, Object>) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestLanguagePackage.NODE__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case TestLanguagePackage.NODE__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case TestLanguagePackage.NODE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case TestLanguagePackage.NODE__SPECIFICATION:
			return specification != null;
		case TestLanguagePackage.NODE__SPECIFICATION_CLASS_NAME:
			return SPECIFICATION_CLASS_NAME_EDEFAULT == null ? specificationClassName != null
					: !SPECIFICATION_CLASS_NAME_EDEFAULT.equals(specificationClassName);
		case TestLanguagePackage.NODE__INPUT_CACHE:
			return inputCache != null;
		case TestLanguagePackage.NODE__OUTPUT_CACHE:
			return outputCache != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TestLanguagePackage.NODE___SETUP_FROM_SPECIFICATION:
			setupFromSpecification();
			return null;
		case TestLanguagePackage.NODE___EXECUTE:
			try {
				execute();
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case TestLanguagePackage.NODE___CREATE_SPECIFICATION:
			createSpecification();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", specificationClassName: ");
		result.append(specificationClassName);
		result.append(", inputCache: ");
		result.append(inputCache);
		result.append(", outputCache: ");
		result.append(outputCache);
		result.append(')');
		return result.toString();
	}

} // NodeImpl
