/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.CodeGen;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay;
import org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks;
import org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay;
import org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6;
import org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorFactory;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Instance;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Instances;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout;
import org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize;
import org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration;
import org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration;
import org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset;
import org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool;
import org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool;
import org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Transports;
import org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport;
import org.opendds.modeling.sdk.model.GeneratorSpecification.genspec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorPackageImpl extends EPackageImpl implements GeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genspecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetDirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchPathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swapBytesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueMessagesPerPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueInitialPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxPacketSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxSamplesPerPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimumPacketSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadPerConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datalinkReleaseDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datalinkControlChunksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAddressStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableNagleAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connRetryInitialDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connRetryBackoffMultiplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connRetryAttemptsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxOutputPausePeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveReconnectDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveConnectDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultToIPv6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synBackoffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synTimeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nakDepthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nakIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nakMaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nakTimeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rcvBufferSIzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multicastTransportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportRefEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorPackageImpl() {
		super(eNS_URI, GeneratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorPackage init() {
		if (isInited)
			return (GeneratorPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Obtain or create and register package
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GeneratorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorPackage.eNS_URI, theGeneratorPackage);
		return theGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeGen() {
		return codeGenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgenspec() {
		return genspecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgenspec_Source() {
		return (EReference) genspecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgenspec_Target() {
		return (EReference) genspecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgenspec_Instances() {
		return (EReference) genspecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgenspec_SearchPaths() {
		return (EReference) genspecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgenspec_Transports() {
		return (EReference) genspecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFile() {
		return modelFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFile_Name() {
		return (EAttribute) modelFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetDir() {
		return targetDirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetDir_Name() {
		return (EAttribute) targetDirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchPaths() {
		return searchPathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchPaths_SearchLocation() {
		return (EReference) searchPathsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchLocation() {
		return searchLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchLocation_Variable() {
		return (EReference) searchLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchLocation_Path() {
		return (EReference) searchLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationVariable() {
		return locationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationVariable_Value() {
		return (EAttribute) locationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationPath() {
		return locationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPath_Value() {
		return (EAttribute) locationPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstances() {
		return instancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstances_Instance() {
		return (EReference) instancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Name() {
		return (EAttribute) instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Config() {
		return (EReference) instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwapBytes() {
		return swapBytesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwapBytes_Value() {
		return (EAttribute) swapBytesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueMessagesPerPool() {
		return queueMessagesPerPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueMessagesPerPool_Value() {
		return (EAttribute) queueMessagesPerPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueInitialPool() {
		return queueInitialPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueInitialPool_Value() {
		return (EAttribute) queueInitialPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxPacketSize() {
		return maxPacketSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxPacketSize_Value() {
		return (EAttribute) maxPacketSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxSamplesPerPacket() {
		return maxSamplesPerPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxSamplesPerPacket_Value() {
		return (EAttribute) maxSamplesPerPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimumPacketSize() {
		return optimumPacketSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimumPacketSize_Value() {
		return (EAttribute) optimumPacketSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadPerConnection() {
		return threadPerConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadPerConnection_Value() {
		return (EAttribute) threadPerConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatalinkReleaseDelay() {
		return datalinkReleaseDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatalinkReleaseDelay_Value() {
		return (EAttribute) datalinkReleaseDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatalinkControlChunks() {
		return datalinkControlChunksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatalinkControlChunks_Value() {
		return (EAttribute) datalinkControlChunksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAddressString() {
		return localAddressStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAddressString_Value() {
		return (EAttribute) localAddressStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableNagleAlgorithm() {
		return enableNagleAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableNagleAlgorithm_Value() {
		return (EAttribute) enableNagleAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnRetryInitialDelay() {
		return connRetryInitialDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnRetryInitialDelay_Value() {
		return (EAttribute) connRetryInitialDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnRetryBackoffMultiplier() {
		return connRetryBackoffMultiplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnRetryBackoffMultiplier_Value() {
		return (EAttribute) connRetryBackoffMultiplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnRetryAttempts() {
		return connRetryAttemptsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnRetryAttempts_Value() {
		return (EAttribute) connRetryAttemptsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxOutputPausePeriod() {
		return maxOutputPausePeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxOutputPausePeriod_Value() {
		return (EAttribute) maxOutputPausePeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveReconnectDuration() {
		return passiveReconnectDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassiveReconnectDuration_Value() {
		return (EAttribute) passiveReconnectDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveConnectDuration() {
		return passiveConnectDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassiveConnectDuration_Value() {
		return (EAttribute) passiveConnectDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultToIPv6() {
		return defaultToIPv6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultToIPv6_Value() {
		return (EAttribute) defaultToIPv6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortOffset() {
		return portOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortOffset_Value() {
		return (EAttribute) portOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupAddress() {
		return groupAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupAddress_Value() {
		return (EAttribute) groupAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliable() {
		return reliableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliable_Value() {
		return (EAttribute) reliableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynBackoff() {
		return synBackoffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynBackoff_Value() {
		return (EAttribute) synBackoffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynInterval() {
		return synIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynInterval_Value() {
		return (EAttribute) synIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynTimeout() {
		return synTimeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynTimeout_Value() {
		return (EAttribute) synTimeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNakDepth() {
		return nakDepthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNakDepth_Value() {
		return (EAttribute) nakDepthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNakInterval() {
		return nakIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNakInterval_Value() {
		return (EAttribute) nakIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNakMax() {
		return nakMaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNakMax_Value() {
		return (EAttribute) nakMaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNakTimeout() {
		return nakTimeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNakTimeout_Value() {
		return (EAttribute) nakTimeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTL() {
		return ttlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTL_Value() {
		return (EAttribute) ttlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRcvBufferSIze() {
		return rcvBufferSIzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRcvBufferSIze_Value() {
		return (EAttribute) rcvBufferSIzeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportConfig() {
		return transportConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportConfig_Name() {
		return (EAttribute) transportConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportConfig_TransportRef() {
		return (EReference) transportConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportConfig_Passive_connect_duration() {
		return (EReference) transportConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportConfig_Swap_bytes() {
		return (EReference) transportConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportInst() {
		return transportInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportInst_Name() {
		return (EAttribute) transportInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Queue_messages_per_pool() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Queue_initial_pools() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Max_packet_size() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Max_samples_per_packet() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Optimum_packet_size() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Thread_per_connection() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Datalink_release_delay() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportInst_Datalink_control_chunks() {
		return (EReference) transportInstEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUdpTransport() {
		return udpTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUdpTransport_Local_address_str() {
		return (EReference) udpTransportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcpTransport() {
		return tcpTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Local_address_str() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Enable_nagle_algorithm() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Conn_retry_initial_delay() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Conn_retry_backoff_multiplier() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Conn_retry_attempts() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Max_output_pause_period() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcpTransport_Passive_reconnect_duration() {
		return (EReference) tcpTransportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulticastTransport() {
		return multicastTransportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Default_to_ipv6() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Port_offset() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Group_address() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Reliable() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Syn_backoff() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Syn_interval() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Syn_timeout() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Nak_depth() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Nak_interval() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Nak_max() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Nak_timeout() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Ttl() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMulticastTransport_Rcv_buffer_size() {
		return (EReference) multicastTransportEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransports() {
		return transportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransports_Transport() {
		return (EReference) transportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportRef() {
		return transportRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportRef_Transport() {
		return (EReference) transportRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactory getGeneratorFactory() {
		return (GeneratorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		codeGenEClass = createEClass(CODE_GEN);

		genspecEClass = createEClass(GENSPEC);
		createEReference(genspecEClass, GENSPEC__SOURCE);
		createEReference(genspecEClass, GENSPEC__TARGET);
		createEReference(genspecEClass, GENSPEC__INSTANCES);
		createEReference(genspecEClass, GENSPEC__SEARCH_PATHS);
		createEReference(genspecEClass, GENSPEC__TRANSPORTS);

		modelFileEClass = createEClass(MODEL_FILE);
		createEAttribute(modelFileEClass, MODEL_FILE__NAME);

		targetDirEClass = createEClass(TARGET_DIR);
		createEAttribute(targetDirEClass, TARGET_DIR__NAME);

		searchPathsEClass = createEClass(SEARCH_PATHS);
		createEReference(searchPathsEClass, SEARCH_PATHS__SEARCH_LOCATION);

		searchLocationEClass = createEClass(SEARCH_LOCATION);
		createEReference(searchLocationEClass, SEARCH_LOCATION__VARIABLE);
		createEReference(searchLocationEClass, SEARCH_LOCATION__PATH);

		locationVariableEClass = createEClass(LOCATION_VARIABLE);
		createEAttribute(locationVariableEClass, LOCATION_VARIABLE__VALUE);

		locationPathEClass = createEClass(LOCATION_PATH);
		createEAttribute(locationPathEClass, LOCATION_PATH__VALUE);

		instancesEClass = createEClass(INSTANCES);
		createEReference(instancesEClass, INSTANCES__INSTANCE);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__NAME);
		createEReference(instanceEClass, INSTANCE__CONFIG);

		swapBytesEClass = createEClass(SWAP_BYTES);
		createEAttribute(swapBytesEClass, SWAP_BYTES__VALUE);

		queueMessagesPerPoolEClass = createEClass(QUEUE_MESSAGES_PER_POOL);
		createEAttribute(queueMessagesPerPoolEClass, QUEUE_MESSAGES_PER_POOL__VALUE);

		queueInitialPoolEClass = createEClass(QUEUE_INITIAL_POOL);
		createEAttribute(queueInitialPoolEClass, QUEUE_INITIAL_POOL__VALUE);

		maxPacketSizeEClass = createEClass(MAX_PACKET_SIZE);
		createEAttribute(maxPacketSizeEClass, MAX_PACKET_SIZE__VALUE);

		maxSamplesPerPacketEClass = createEClass(MAX_SAMPLES_PER_PACKET);
		createEAttribute(maxSamplesPerPacketEClass, MAX_SAMPLES_PER_PACKET__VALUE);

		optimumPacketSizeEClass = createEClass(OPTIMUM_PACKET_SIZE);
		createEAttribute(optimumPacketSizeEClass, OPTIMUM_PACKET_SIZE__VALUE);

		threadPerConnectionEClass = createEClass(THREAD_PER_CONNECTION);
		createEAttribute(threadPerConnectionEClass, THREAD_PER_CONNECTION__VALUE);

		datalinkReleaseDelayEClass = createEClass(DATALINK_RELEASE_DELAY);
		createEAttribute(datalinkReleaseDelayEClass, DATALINK_RELEASE_DELAY__VALUE);

		datalinkControlChunksEClass = createEClass(DATALINK_CONTROL_CHUNKS);
		createEAttribute(datalinkControlChunksEClass, DATALINK_CONTROL_CHUNKS__VALUE);

		localAddressStringEClass = createEClass(LOCAL_ADDRESS_STRING);
		createEAttribute(localAddressStringEClass, LOCAL_ADDRESS_STRING__VALUE);

		enableNagleAlgorithmEClass = createEClass(ENABLE_NAGLE_ALGORITHM);
		createEAttribute(enableNagleAlgorithmEClass, ENABLE_NAGLE_ALGORITHM__VALUE);

		connRetryInitialDelayEClass = createEClass(CONN_RETRY_INITIAL_DELAY);
		createEAttribute(connRetryInitialDelayEClass, CONN_RETRY_INITIAL_DELAY__VALUE);

		connRetryBackoffMultiplierEClass = createEClass(CONN_RETRY_BACKOFF_MULTIPLIER);
		createEAttribute(connRetryBackoffMultiplierEClass, CONN_RETRY_BACKOFF_MULTIPLIER__VALUE);

		connRetryAttemptsEClass = createEClass(CONN_RETRY_ATTEMPTS);
		createEAttribute(connRetryAttemptsEClass, CONN_RETRY_ATTEMPTS__VALUE);

		maxOutputPausePeriodEClass = createEClass(MAX_OUTPUT_PAUSE_PERIOD);
		createEAttribute(maxOutputPausePeriodEClass, MAX_OUTPUT_PAUSE_PERIOD__VALUE);

		passiveReconnectDurationEClass = createEClass(PASSIVE_RECONNECT_DURATION);
		createEAttribute(passiveReconnectDurationEClass, PASSIVE_RECONNECT_DURATION__VALUE);

		passiveConnectDurationEClass = createEClass(PASSIVE_CONNECT_DURATION);
		createEAttribute(passiveConnectDurationEClass, PASSIVE_CONNECT_DURATION__VALUE);

		defaultToIPv6EClass = createEClass(DEFAULT_TO_IPV6);
		createEAttribute(defaultToIPv6EClass, DEFAULT_TO_IPV6__VALUE);

		portOffsetEClass = createEClass(PORT_OFFSET);
		createEAttribute(portOffsetEClass, PORT_OFFSET__VALUE);

		groupAddressEClass = createEClass(GROUP_ADDRESS);
		createEAttribute(groupAddressEClass, GROUP_ADDRESS__VALUE);

		reliableEClass = createEClass(RELIABLE);
		createEAttribute(reliableEClass, RELIABLE__VALUE);

		synBackoffEClass = createEClass(SYN_BACKOFF);
		createEAttribute(synBackoffEClass, SYN_BACKOFF__VALUE);

		synIntervalEClass = createEClass(SYN_INTERVAL);
		createEAttribute(synIntervalEClass, SYN_INTERVAL__VALUE);

		synTimeoutEClass = createEClass(SYN_TIMEOUT);
		createEAttribute(synTimeoutEClass, SYN_TIMEOUT__VALUE);

		nakDepthEClass = createEClass(NAK_DEPTH);
		createEAttribute(nakDepthEClass, NAK_DEPTH__VALUE);

		nakIntervalEClass = createEClass(NAK_INTERVAL);
		createEAttribute(nakIntervalEClass, NAK_INTERVAL__VALUE);

		nakMaxEClass = createEClass(NAK_MAX);
		createEAttribute(nakMaxEClass, NAK_MAX__VALUE);

		nakTimeoutEClass = createEClass(NAK_TIMEOUT);
		createEAttribute(nakTimeoutEClass, NAK_TIMEOUT__VALUE);

		ttlEClass = createEClass(TTL);
		createEAttribute(ttlEClass, TTL__VALUE);

		rcvBufferSIzeEClass = createEClass(RCV_BUFFER_SIZE);
		createEAttribute(rcvBufferSIzeEClass, RCV_BUFFER_SIZE__VALUE);

		transportConfigEClass = createEClass(TRANSPORT_CONFIG);
		createEAttribute(transportConfigEClass, TRANSPORT_CONFIG__NAME);
		createEReference(transportConfigEClass, TRANSPORT_CONFIG__TRANSPORT_REF);
		createEReference(transportConfigEClass, TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION);
		createEReference(transportConfigEClass, TRANSPORT_CONFIG__SWAP_BYTES);

		transportInstEClass = createEClass(TRANSPORT_INST);
		createEAttribute(transportInstEClass, TRANSPORT_INST__NAME);
		createEReference(transportInstEClass, TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL);
		createEReference(transportInstEClass, TRANSPORT_INST__QUEUE_INITIAL_POOLS);
		createEReference(transportInstEClass, TRANSPORT_INST__MAX_PACKET_SIZE);
		createEReference(transportInstEClass, TRANSPORT_INST__MAX_SAMPLES_PER_PACKET);
		createEReference(transportInstEClass, TRANSPORT_INST__OPTIMUM_PACKET_SIZE);
		createEReference(transportInstEClass, TRANSPORT_INST__THREAD_PER_CONNECTION);
		createEReference(transportInstEClass, TRANSPORT_INST__DATALINK_RELEASE_DELAY);
		createEReference(transportInstEClass, TRANSPORT_INST__DATALINK_CONTROL_CHUNKS);

		udpTransportEClass = createEClass(UDP_TRANSPORT);
		createEReference(udpTransportEClass, UDP_TRANSPORT__LOCAL_ADDRESS_STR);

		tcpTransportEClass = createEClass(TCP_TRANSPORT);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__LOCAL_ADDRESS_STR);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__CONN_RETRY_ATTEMPTS);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD);
		createEReference(tcpTransportEClass, TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION);

		multicastTransportEClass = createEClass(MULTICAST_TRANSPORT);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__DEFAULT_TO_IPV6);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__PORT_OFFSET);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__GROUP_ADDRESS);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__RELIABLE);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__SYN_BACKOFF);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__SYN_INTERVAL);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__SYN_TIMEOUT);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__NAK_DEPTH);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__NAK_INTERVAL);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__NAK_MAX);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__NAK_TIMEOUT);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__TTL);
		createEReference(multicastTransportEClass, MULTICAST_TRANSPORT__RCV_BUFFER_SIZE);

		transportsEClass = createEClass(TRANSPORTS);
		createEReference(transportsEClass, TRANSPORTS__TRANSPORT);

		transportRefEClass = createEClass(TRANSPORT_REF);
		createEReference(transportRefEClass, TRANSPORT_REF__TRANSPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeGenEClass.getESuperTypes().add(this.getgenspec());
		udpTransportEClass.getESuperTypes().add(this.getTransportInst());
		tcpTransportEClass.getESuperTypes().add(this.getTransportInst());
		multicastTransportEClass.getESuperTypes().add(this.getTransportInst());

		// Initialize classes and features; add operations and parameters
		initEClass(codeGenEClass, CodeGen.class, "CodeGen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genspecEClass, genspec.class, "genspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getgenspec_Source(), this.getModelFile(), null, "source", null, 1, 1, genspec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getgenspec_Target(), this.getTargetDir(), null, "target", null, 1, 1, genspec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getgenspec_Instances(), this.getInstances(), null, "instances", null, 0, 1, genspec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getgenspec_SearchPaths(), this.getSearchPaths(), null, "searchPaths", null, 0, 1, genspec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getgenspec_Transports(), this.getTransports(), null, "transports", null, 1, 1, genspec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFileEClass, ModelFile.class, "ModelFile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFile_Name(), ecorePackage.getEString(), "name", "", 1, 1, ModelFile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetDirEClass, TargetDir.class, "TargetDir", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetDir_Name(), ecorePackage.getEString(), "name", "model", 1, 1, TargetDir.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchPathsEClass, SearchPaths.class, "SearchPaths", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchPaths_SearchLocation(), this.getSearchLocation(), null, "searchLocation", null, 0, -1,
				SearchPaths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchLocationEClass, SearchLocation.class, "SearchLocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchLocation_Variable(), this.getLocationVariable(), null, "variable", null, 0, 1,
				SearchLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchLocation_Path(), this.getLocationPath(), null, "path", null, 0, 1, SearchLocation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationVariableEClass, LocationVariable.class, "LocationVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				LocationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(locationPathEClass, LocationPath.class, "LocationPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationPath_Value(), ecorePackage.getEString(), "value", null, 0, 1, LocationPath.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instancesEClass, Instances.class, "Instances", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstances_Instance(), this.getInstance(), null, "instance", null, 0, -1, Instances.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_Name(), ecorePackage.getEString(), "name", "default", 1, 1, Instance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Config(), this.getTransportConfig(), null, "config", null, 0, -1, Instance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swapBytesEClass, SwapBytes.class, "SwapBytes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwapBytes_Value(), ecorePackage.getEBoolean(), "value", "false", 0, 1, SwapBytes.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueMessagesPerPoolEClass, QueueMessagesPerPool.class, "QueueMessagesPerPool", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueueMessagesPerPool_Value(), ecorePackage.getEInt(), "value", "10", 0, 1,
				QueueMessagesPerPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueInitialPoolEClass, QueueInitialPool.class, "QueueInitialPool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueueInitialPool_Value(), ecorePackage.getEInt(), "value", "5", 0, 1, QueueInitialPool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxPacketSizeEClass, MaxPacketSize.class, "MaxPacketSize", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxPacketSize_Value(), ecorePackage.getEInt(), "value", "2147481599", 0, 1,
				MaxPacketSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(maxSamplesPerPacketEClass, MaxSamplesPerPacket.class, "MaxSamplesPerPacket", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxSamplesPerPacket_Value(), ecorePackage.getEInt(), "value", "10", 0, 1,
				MaxSamplesPerPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimumPacketSizeEClass, OptimumPacketSize.class, "OptimumPacketSize", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimumPacketSize_Value(), ecorePackage.getEInt(), "value", "4096", 0, 1,
				OptimumPacketSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(threadPerConnectionEClass, ThreadPerConnection.class, "ThreadPerConnection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadPerConnection_Value(), ecorePackage.getEBoolean(), "value", "false", 0, 1,
				ThreadPerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datalinkReleaseDelayEClass, DatalinkReleaseDelay.class, "DatalinkReleaseDelay", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatalinkReleaseDelay_Value(), ecorePackage.getEInt(), "value", "10000", 0, 1,
				DatalinkReleaseDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datalinkControlChunksEClass, DatalinkControlChunks.class, "DatalinkControlChunks", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatalinkControlChunks_Value(), ecorePackage.getEInt(), "value", "32", 0, 1,
				DatalinkControlChunks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAddressStringEClass, LocalAddressString.class, "LocalAddressString", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalAddressString_Value(), ecorePackage.getEString(), "value", "", 0, 1,
				LocalAddressString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enableNagleAlgorithmEClass, EnableNagleAlgorithm.class, "EnableNagleAlgorithm", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnableNagleAlgorithm_Value(), ecorePackage.getEBoolean(), "value", "false", 0, 1,
				EnableNagleAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connRetryInitialDelayEClass, ConnRetryInitialDelay.class, "ConnRetryInitialDelay", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnRetryInitialDelay_Value(), ecorePackage.getEInt(), "value", "500", 0, 1,
				ConnRetryInitialDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connRetryBackoffMultiplierEClass, ConnRetryBackoffMultiplier.class, "ConnRetryBackoffMultiplier",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnRetryBackoffMultiplier_Value(), ecorePackage.getEFloat(), "value", "2.0", 0, 1,
				ConnRetryBackoffMultiplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connRetryAttemptsEClass, ConnRetryAttempts.class, "ConnRetryAttempts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnRetryAttempts_Value(), ecorePackage.getEInt(), "value", "3", 0, 1,
				ConnRetryAttempts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(maxOutputPausePeriodEClass, MaxOutputPausePeriod.class, "MaxOutputPausePeriod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxOutputPausePeriod_Value(), ecorePackage.getEInt(), "value", "-1", 0, 1,
				MaxOutputPausePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passiveReconnectDurationEClass, PassiveReconnectDuration.class, "PassiveReconnectDuration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassiveReconnectDuration_Value(), ecorePackage.getEInt(), "value", "2000", 0, 1,
				PassiveReconnectDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passiveConnectDurationEClass, PassiveConnectDuration.class, "PassiveConnectDuration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassiveConnectDuration_Value(), ecorePackage.getEInt(), "value", "10000", 0, 1,
				PassiveConnectDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultToIPv6EClass, DefaultToIPv6.class, "DefaultToIPv6", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultToIPv6_Value(), ecorePackage.getEBoolean(), "value", "false", 0, 1,
				DefaultToIPv6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(portOffsetEClass, PortOffset.class, "PortOffset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortOffset_Value(), ecorePackage.getEInt(), "value", "49400", 0, 1, PortOffset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupAddressEClass, GroupAddress.class, "GroupAddress", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupAddress_Value(), ecorePackage.getEString(), "value", "\"224.0.0.128\"", 0, 1,
				GroupAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(reliableEClass, Reliable.class, "Reliable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReliable_Value(), ecorePackage.getEBoolean(), "value", "true", 0, 1, Reliable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synBackoffEClass, SynBackoff.class, "SynBackoff", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynBackoff_Value(), ecorePackage.getEFloat(), "value", "2.0", 0, 1, SynBackoff.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synIntervalEClass, SynInterval.class, "SynInterval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynInterval_Value(), ecorePackage.getEInt(), "value", "250", 0, 1, SynInterval.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synTimeoutEClass, SynTimeout.class, "SynTimeout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynTimeout_Value(), ecorePackage.getEInt(), "value", "30000", 0, 1, SynTimeout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nakDepthEClass, NakDepth.class, "NakDepth", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNakDepth_Value(), ecorePackage.getEInt(), "value", "32", 0, 1, NakDepth.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nakIntervalEClass, NakInterval.class, "NakInterval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNakInterval_Value(), ecorePackage.getEInt(), "value", "500", 0, 1, NakInterval.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nakMaxEClass, NakMax.class, "NakMax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNakMax_Value(), ecorePackage.getEInt(), "value", "3", 0, 1, NakMax.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nakTimeoutEClass, NakTimeout.class, "NakTimeout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNakTimeout_Value(), ecorePackage.getEInt(), "value", "30000", 0, 1, NakTimeout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttlEClass, org.opendds.modeling.sdk.model.GeneratorSpecification.TTL.class, "TTL", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTL_Value(), ecorePackage.getEInt(), "value", "1", 0, 1,
				org.opendds.modeling.sdk.model.GeneratorSpecification.TTL.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rcvBufferSIzeEClass, RcvBufferSIze.class, "RcvBufferSIze", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRcvBufferSIze_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, RcvBufferSIze.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportConfigEClass, TransportConfig.class, "TransportConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportConfig_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransportConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportConfig_TransportRef(), this.getTransportRef(), null, "transportRef", null, 0, -1,
				TransportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportConfig_Passive_connect_duration(), this.getPassiveConnectDuration(), null,
				"passive_connect_duration", null, 0, 1, TransportConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportConfig_Swap_bytes(), this.getSwapBytes(), null, "swap_bytes", null, 0, 1,
				TransportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportInstEClass, TransportInst.class, "TransportInst", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportInst_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransportInst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Queue_messages_per_pool(), this.getQueueMessagesPerPool(), null,
				"queue_messages_per_pool", null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Queue_initial_pools(), this.getQueueInitialPool(), null, "queue_initial_pools",
				null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Max_packet_size(), this.getMaxPacketSize(), null, "max_packet_size", null, 0, 1,
				TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Max_samples_per_packet(), this.getMaxSamplesPerPacket(), null,
				"max_samples_per_packet", null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Optimum_packet_size(), this.getOptimumPacketSize(), null, "optimum_packet_size",
				null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Thread_per_connection(), this.getThreadPerConnection(), null,
				"thread_per_connection", null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Datalink_release_delay(), this.getDatalinkReleaseDelay(), null,
				"datalink_release_delay", null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInst_Datalink_control_chunks(), this.getDatalinkControlChunks(), null,
				"datalink_control_chunks", null, 0, 1, TransportInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(udpTransportEClass, UdpTransport.class, "UdpTransport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUdpTransport_Local_address_str(), this.getLocalAddressString(), null, "local_address_str",
				null, 0, 1, UdpTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcpTransportEClass, TcpTransport.class, "TcpTransport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTcpTransport_Local_address_str(), this.getLocalAddressString(), null, "local_address_str",
				null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcpTransport_Enable_nagle_algorithm(), this.getEnableNagleAlgorithm(), null,
				"enable_nagle_algorithm", null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcpTransport_Conn_retry_initial_delay(), this.getConnRetryInitialDelay(), null,
				"conn_retry_initial_delay", null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcpTransport_Conn_retry_backoff_multiplier(), this.getConnRetryBackoffMultiplier(), null,
				"conn_retry_backoff_multiplier", null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcpTransport_Conn_retry_attempts(), this.getConnRetryAttempts(), null, "conn_retry_attempts",
				null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcpTransport_Max_output_pause_period(), this.getMaxOutputPausePeriod(), null,
				"max_output_pause_period", null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcpTransport_Passive_reconnect_duration(), this.getPassiveReconnectDuration(), null,
				"passive_reconnect_duration", null, 0, 1, TcpTransport.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multicastTransportEClass, MulticastTransport.class, "MulticastTransport", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMulticastTransport_Default_to_ipv6(), this.getDefaultToIPv6(), null, "default_to_ipv6", null,
				0, 1, MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Port_offset(), this.getPortOffset(), null, "port_offset", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Group_address(), this.getGroupAddress(), null, "group_address", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Reliable(), this.getReliable(), null, "reliable", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Syn_backoff(), this.getSynBackoff(), null, "syn_backoff", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Syn_interval(), this.getSynInterval(), null, "syn_interval", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Syn_timeout(), this.getSynTimeout(), null, "syn_timeout", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Nak_depth(), this.getNakDepth(), null, "nak_depth", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Nak_interval(), this.getNakInterval(), null, "nak_interval", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Nak_max(), this.getNakMax(), null, "nak_max", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Nak_timeout(), this.getNakTimeout(), null, "nak_timeout", null, 0, 1,
				MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Ttl(), this.getTTL(), null, "ttl", null, 0, 1, MulticastTransport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulticastTransport_Rcv_buffer_size(), this.getRcvBufferSIze(), null, "rcv_buffer_size", null,
				0, 1, MulticastTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportsEClass, Transports.class, "Transports", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransports_Transport(), this.getTransportInst(), null, "transport", null, 0, -1,
				Transports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportRefEClass, TransportRef.class, "TransportRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportRef_Transport(), this.getTransportInst(), null, "transport", null, 0, 1,
				TransportRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GeneratorPackageImpl
