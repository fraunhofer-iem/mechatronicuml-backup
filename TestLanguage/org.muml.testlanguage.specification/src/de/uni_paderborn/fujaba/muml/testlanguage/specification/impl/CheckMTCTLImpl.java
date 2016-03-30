/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.impl;

import java.io.ByteArrayInputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.impl.ModelElementCategoryImpl;
import org.muml.core.modelinstance.impl.ModelinstanceFactoryImpl;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.protocol.CoordinationProtocol;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.CheckMTCTL;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.NodeSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.PortType;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;
import de.uni_paderborn.fujaba.muml.verification.uppaal.MtctlRuntimeModule;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.CoordinationProtocolOptions;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.TraceOptions;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlScopeProvider;
import de.uni_paderborn.fujaba.muml.verification.verificationExtension.VerificationExtensionFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Check MTCTL</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.impl.CheckMTCTLImpl#getProperties
 * <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckMTCTLImpl extends NodeSpecificationImpl implements CheckMTCTL {
	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected String properties = PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CheckMTCTLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.CHECK_MTCTL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProperties(String newProperties) {
		String oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SpecificationPackage.CHECK_MTCTL__PROPERTIES,
					oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Check MTCTL");
		this.addPortSpecification(PortType.IN, "muml", false,
				EObject.class);
//				de.uni_paderborn.fujaba.modelinstance.RootNode.class);
		this.addPortSpecification(PortType.IN, "options", true,
				de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options.class);
		this.addPortSpecification(PortType.OUT, "results", false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void execute(final Map<String, Object> inputs,
			final Map<String, Object> outputs) throws ExecutionException,
			Exception {
		// Do we even have properties to verify?
		if ("".equals(this.getProperties())) {
			throw new ExecutionException("No properties to verify.");
		}
		
		// Copy the MUML model so we do not destroy it.
		// Copier copier = new Copier();
		
		RootNode muml = null;
		CoordinationProtocol protocol = null;
		
		Extension extension = null;
		
		RootNode rootNode = null;
//		EObject rootNode = null;
		
		if (inputs.get("muml") instanceof RootNode){
			rootNode = (RootNode) inputs.get("muml");
		}
		else if(inputs.get("muml") instanceof CoordinationProtocol){
			
			protocol = (CoordinationProtocol) inputs.get("muml");
			
//			rootNode = (RootNode)((CoordinationProtocol) inputs.get("muml")).eContainer().eContainer();			
			
			
			if ((EcoreUtil.getRootContainer(protocol) instanceof RootNode)){
				rootNode = (RootNode)EcoreUtil.getRootContainer(protocol);
			}else{
				throw new ExecutionException("The coordination protocol doesn't have correct RootContainer");
			}
			
			
			extension = protocol.getExtension(de.uni_paderborn.fujaba.muml.verification.verificationExtension.VerificationExtensionPackage.eINSTANCE.getElementToVerifyExtension());
			if (extension == null) {
				extension = VerificationExtensionFactory.eINSTANCE.createElementToVerifyExtension();
				protocol.getExtensions().add(extension);
			}
		}
		else{
			throw new ExecutionException("Coordination protocol is not specified.");
		}
		
		
		// Copy the MUML model so we do not destroy it.
		Copier copier = new Copier();
		muml = (RootNode) copier.copy(rootNode);
		copier.copyReferences();

			// Get the CoordinationProtocol category.
			ModelElementCategory category = null;
			for (ModelElementCategory cur : muml.getCategories()) {
				if (cur.getKey().equals(
						"de.uni_paderborn.fujaba.muml.protocol.category")) {
					category = cur;
					break;
				}
			}
			
			if (category == null) {
				throw new ExecutionException(
						"Model does not contain a CoordinationProtocol category.");
			}
			
			// Look for a CoordinationProtocol that asks for a verification,
			// otherwise just choose any.

			for (ExtendableElement cur : category.getModelElements()) {
				protocol = (CoordinationProtocol) cur;

				if (protocol
						.getExtension(de.uni_paderborn.fujaba.muml.verification.verificationExtension.VerificationExtensionPackage.eINSTANCE
								.getElementToVerifyExtension()) != null) {
					break;
				}
				// In case there is no protocol with extension,
				// the last coordination protocol is used
			}
			if (protocol == null) {
				throw new ExecutionException(
						"Model does not contain a CoordinationProtocol.");
			}
		
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			MtctlScopeProvider.getInstance().setScopeForEObject(protocol);
			Resource resource = resourceSet.createResource(URI.createURI("dummy:/dummy.mtctl"));
			resource.load(new ByteArrayInputStream(properties.getBytes(StandardCharsets.UTF_8)), resourceSet.getLoadOptions());
			
			// Parse the PropertyRepository we have in the context of the protocol.
			PropertyRepository propertyRepository = (PropertyRepository) resource.getContents().get(0);
			
			///////////////////////////////
			///// Jan's previous code ////
			/////////////////////////////
//			new Object() {
	//
//				@Inject
//				private XtextResourceSet resourceSet;
	//
//				public EObject parse(CoordinationProtocol protocol,
//						String properties) throws Exception {
//					// Source: http://davehofmann.de/blog/?p=101
//					Injector injector = Guice
//							.createInjector(new MtctlRuntimeModule());
//					
//					injector.injectMembers(this);
//					this.resourceSet.addLoadOption(
//							XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	//
//					// Parse the given properties and return it.
//					MtctlScopeProvider.getInstance().setScopeForEObject(protocol);
//					Resource resource = resourceSet.createResource(URI
//							.createURI("dummy:/dummy.mtctl"));
//					resource.load(
//							new ByteArrayInputStream(properties
//									.getBytes(StandardCharsets.UTF_8)), resourceSet
//									.getLoadOptions());
//					return resource.getContents().get(0);
//				}
//			}.parse(protocol, this.getProperties());

			// Replace all existing PropertyRepositories by the one we just created.
			protocol.getVerificationConstraintRepositories().clear();
			protocol.getVerificationConstraintRepositories()
					.add(propertyRepository);

			// Verify for results (= apply the transformation by the MTCTL people).
			URI realURI = URI
					.createURI("platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/VerifiableElement2Results.qvto");
			TransformationExecutor executor = new TransformationExecutor(realURI);
			ExecutionContextImpl context;
			IStatus status;
			status = BasicDiagnostic.toIStatus(executor.loadTransformation());
			if (!status.isOK()) {
				throw new ExecutionException(status.getMessage());
			}
			context = new ExecutionContextImpl();

			// Check if we have custom options or use the default ones.
			CoordinationProtocolOptions options;
			if (inputs.containsKey("options") && inputs.get("options") != null) {
				options = (CoordinationProtocolOptions) inputs.get("options");
			} else {
				options = OptionsFactory.eINSTANCE
						.createCoordinationProtocolOptions();
				options.setTraceOptions(TraceOptions.NONE);
			}
			
			// Create the extents.
			BasicModelExtent mumlExtent = new BasicModelExtent();
			mumlExtent.add(muml);
			BasicModelExtent optionsExtent = new BasicModelExtent();
			optionsExtent.add(options);
			BasicModelExtent resultExtent = new BasicModelExtent();

			// Execute the transformation.
			OutputStreamWriter outStream = new OutputStreamWriter(System.out);
			Log log = new WriterLog(outStream);
			context.setLog(log);
			ExecutionDiagnostic dia = executor.execute(context, mumlExtent, optionsExtent, resultExtent);
			
			if (extension != null){
				extension = null; //Is this enoguh or I should remove the extension from the list of protocol's extensions? 
			}
			
			// Check if we succeeded.
			if (dia.getSeverity() != ExecutionDiagnostic.OK)
			{
				throw new ExecutionException(dia.getMessage());
			}
			
			// Get the output.
			outputs.put("results", resultExtent.getContents().get(0));
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			setProperties((String) newValue);
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
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			setProperties(PROPERTIES_EDEFAULT);
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
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			return PROPERTIES_EDEFAULT == null ? properties != null
					: !PROPERTIES_EDEFAULT.equals(properties);
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
				return SpecificationPackage.CHECK_MTCTL___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.CHECK_MTCTL___EXECUTE__MAP_MAP;
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
		case SpecificationPackage.CHECK_MTCTL___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.CHECK_MTCTL___EXECUTE__MAP_MAP:
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
		result.append(" (properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} // CheckMTCTLImpl
