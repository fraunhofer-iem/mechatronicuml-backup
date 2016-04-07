/**
 */
package org.muml.testlanguage.specification.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.testlanguage.specification.CompareModels;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Compare Models</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CompareModelsImpl extends NodeSpecificationImpl implements CompareModels {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompareModelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.COMPARE_MODELS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Compare Models");
		this.addPortSpecification(PortType.IN, "model_1", false, org.eclipse.emf.common.notify.Notifier.class);
		this.addPortSpecification(PortType.IN, "model_2", false, org.eclipse.emf.common.notify.Notifier.class);
		this.addPortSpecification(PortType.OUT, "bool", false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs, final Map<String, Object> outputs)
			throws ExecutionException, Exception {
		// Local variable to carry the result.
		boolean result = false;

		// Check if the given models are actually the same model.
		if (inputs.get("model_1") == inputs.get("model_2")) {
			result = true;
		} else {

			// Setup the matching engine.
			IMatchEngine.Factory factory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
			IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
			matchEngineRegistry.add(factory);
			IComparisonScope scope = new DefaultComparisonScope((Notifier) inputs.get("model_1"),
					(Notifier) inputs.get("model_2"), null);

			// Avoid order checking for unordered containments.
			IDiffProcessor diffProcessor = new DiffBuilder();
			IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
				@Override
				protected FeatureFilter createFeatureFilter() {
					return new FeatureFilter() {
						@Override
						public boolean checkForOrderingChanges(EStructuralFeature feature) {
							return feature.isMany() && feature.isOrdered();
						}
					};
				}
			};

			Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry)
					.setDiffEngine(diffEngine).build().compare(scope);

			OutputStream stream = new OutputStream() {

				private StringBuilder builder = new StringBuilder();

				@Override
				public void write(int b) throws IOException {
					builder.append((char) b);
				}

				@Override
				public String toString() {
					return builder.toString();
				}

			};

			EMFComparePrettyPrinter.printDifferences(comparison, new PrintStream(stream));

			if (comparison.getDifferences().isEmpty()) {
				result = true;
			}
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
				return SpecificationPackage.COMPARE_MODELS___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.COMPARE_MODELS___EXECUTE__MAP_MAP;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.COMPARE_MODELS___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.COMPARE_MODELS___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0), (Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}
} // CompareModelsImpl
