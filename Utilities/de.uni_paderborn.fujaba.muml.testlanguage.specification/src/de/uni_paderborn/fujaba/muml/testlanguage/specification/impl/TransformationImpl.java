/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.impl;

import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.NodeSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.PortSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.PortType;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.Transformation;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.URIConversion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transformation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.impl.TransformationImpl#getUri
 * <em>Uri</em>}</li>
 * <li>
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.impl.TransformationImpl#getParameterOrder
 * <em>Parameter Order</em>}</li>
 * <li>
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.impl.TransformationImpl#getConfigProperties
 * <em>Config Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class TransformationImpl extends NodeSpecificationImpl implements
		Transformation {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterOrder()
	 * <em>Parameter Order</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getParameterOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<PortSpecification> parameterOrder;

	/**
	 * The cached value of the '{@link #getConfigProperties()
	 * <em>Config Properties</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConfigProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<String> configProperties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SpecificationPackage.TRANSFORMATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PortSpecification> getParameterOrder() {
		if (parameterOrder == null) {
			parameterOrder = new EObjectResolvingEList<PortSpecification>(
					PortSpecification.class, this,
					SpecificationPackage.TRANSFORMATION__PARAMETER_ORDER);
		}
		return parameterOrder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getConfigProperties() {
		if (configProperties == null) {
			configProperties = new EDataTypeUniqueEList<String>(String.class,
					this,
					SpecificationPackage.TRANSFORMATION__CONFIG_PROPERTIES);
		}
		return configProperties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Transformation");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs,
			final Map<String, Object> outputs) throws ExecutionException,
			Exception {
		URI realURI = URIConversion.convert(URI.createURI(this.getUri()));
		TransformationExecutor executor = new TransformationExecutor(realURI);

		ExecutionContextImpl context;
		IStatus status;

		status = BasicDiagnostic.toIStatus(executor.loadTransformation());

		if (!status.isOK()) {
			throw new ExecutionException(status.getMessage());
		}

		context = new ExecutionContextImpl();

		// Set extents, i.e. the model parameters.
		BasicModelExtent[] extents = new BasicModelExtent[this
				.getParameterOrder().size()];
		int i = 0;
		for (PortSpecification port : this.getParameterOrder()) {
			BasicModelExtent extent = new BasicModelExtent();

			if (port.getType() == PortType.IN) {
				extent.add((EObject) inputs.get(port.getName()));
			} else if (port.getType() == PortType.INOUT) {
				// Copy the EObject to avoid side effects.
				Copier copier = new Copier();
				EObject result = copier.copy((EObject) inputs.get(port
						.getName()));
				copier.copyReferences();
				extent.add(result);
			}

			extents[i] = extent;

			i++;
		}

		// Set configuration properties. They arrive in an EObject wrapper
		// as a string, they are parsed by QVTo.
		for (String property : this.getConfigProperties()) {
			if (inputs.containsKey(property)) {
				context.setConfigProperty(property,
						(String) inputs.get(property));
			}
		}

		// Execute the transformation.
		OutputStreamWriter outStream = new OutputStreamWriter(System.out);
		Log log = new WriterLog(outStream);
		context.setLog(log);
		ExecutionDiagnostic diagnostic = executor.execute(context, extents);

		// Check if everything went fine.
		if (diagnostic.getSeverity() == Diagnostic.ERROR) {
			throw new ExecutionException("Transformation failed: "
					+ diagnostic.getMessage());
		}

		// Get the output.
		i = 0;
		for (PortSpecification port : this.getParameterOrder()) {
			// System.out.println(i + " " + port.getName() + " ("
			// + port.getType() + "): "
			// + extents[i].getContents().get(0));
			if (port.getType() == PortType.OUT
					|| port.getType() == PortType.INOUT) {
				outputs.put(port.getName(), extents[i].getContents().get(0));
			}

			i++;
		}

		return;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean notifyChanged(final Object notification) {
		try {
			Notification n = (Notification) notification;
			EAttribute attr = (EAttribute) n.getFeature();

			if (n.getEventType() == Notification.SET && attr.getName() == "uri") {
				this.getPortSpecifications().clear();
				this.getParameterOrder().clear();
				this.getConfigProperties().clear();

				// Load transformation Ecore in order to get the port count
				// required. (http://www.eclipse.org/forums/index.php/t/478345/)
				URI realURI = URI.createURI(this.uri);
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.getResource(realURI.trimFragment(),
						true);
				EObject result = null;

				if (realURI.hasFragment()) {
					result = resource.getEObject(realURI.fragment());
				}

				OperationalTransformation trans = (OperationalTransformation) (result != null ? result
						: resource.getContents().get(0));

				EList<ModelParameter> params = trans.getModelParameter();

				for (ModelParameter param : params) {
					PortType type = PortType.IN;
					if (param.getKind() == DirectionKind.OUT) {
						type = PortType.OUT;
					} else if (param.getKind() == DirectionKind.INOUT) {
						type = PortType.INOUT;
					}
					PortSpecification spec = this.addPortSpecification(type,
							param.getName(), false,
							org.eclipse.emf.ecore.EObject.class);
					this.getParameterOrder().add(spec);
				}

				// Add configuration properties.
				this.getConfigProperties().clear();
				EList<EStructuralFeature> props = trans.getConfigProperty();
				for (EStructuralFeature feature : props) {
					this.addPortSpecification(PortType.IN, feature.getName(),
							true, java.lang.String.class);
					this.getConfigProperties().add(feature.getName());
				}

				// Return true to signal that the ports changed and need to
				// be rebuilt.
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.TRANSFORMATION__URI:
			return getUri();
		case SpecificationPackage.TRANSFORMATION__PARAMETER_ORDER:
			return getParameterOrder();
		case SpecificationPackage.TRANSFORMATION__CONFIG_PROPERTIES:
			return getConfigProperties();
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
		case SpecificationPackage.TRANSFORMATION__URI:
			setUri((String) newValue);
			return;
		case SpecificationPackage.TRANSFORMATION__PARAMETER_ORDER:
			getParameterOrder().clear();
			getParameterOrder().addAll(
					(Collection<? extends PortSpecification>) newValue);
			return;
		case SpecificationPackage.TRANSFORMATION__CONFIG_PROPERTIES:
			getConfigProperties().clear();
			getConfigProperties().addAll(
					(Collection<? extends String>) newValue);
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
		case SpecificationPackage.TRANSFORMATION__URI:
			setUri(URI_EDEFAULT);
			return;
		case SpecificationPackage.TRANSFORMATION__PARAMETER_ORDER:
			getParameterOrder().clear();
			return;
		case SpecificationPackage.TRANSFORMATION__CONFIG_PROPERTIES:
			getConfigProperties().clear();
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
		case SpecificationPackage.TRANSFORMATION__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT
					.equals(uri);
		case SpecificationPackage.TRANSFORMATION__PARAMETER_ORDER:
			return parameterOrder != null && !parameterOrder.isEmpty();
		case SpecificationPackage.TRANSFORMATION__CONFIG_PROPERTIES:
			return configProperties != null && !configProperties.isEmpty();
		}
		return super.eIsSet(featureID);
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
				return SpecificationPackage.TRANSFORMATION___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.TRANSFORMATION___EXECUTE__MAP_MAP;
			case SpecificationPackage.NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT:
				return SpecificationPackage.TRANSFORMATION___NOTIFY_CHANGED__OBJECT;
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
		case SpecificationPackage.TRANSFORMATION___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.TRANSFORMATION___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0),
						(Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case SpecificationPackage.TRANSFORMATION___NOTIFY_CHANGED__OBJECT:
			return notifyChanged(arguments.get(0));
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", configProperties: ");
		result.append(configProperties);
		result.append(')');
		return result.toString();
	}

} // TransformationImpl
