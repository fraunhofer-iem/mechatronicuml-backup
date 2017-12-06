/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.muml.example.brakebywire.GetConnectedECUsMatch;
import org.muml.example.brakebywire.GetConnectedECUsMatcher;
import org.muml.example.brakebywire.internal.ConnectedQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate GetConnectedECUsMatcher in a type-safe way.
 * 
 * @see GetConnectedECUsMatcher
 * @see GetConnectedECUsMatch
 * 
 */
@SuppressWarnings("all")
public final class GetConnectedECUsQuerySpecification extends BaseGeneratedEMFQuerySpecification<GetConnectedECUsMatcher> {
  private GetConnectedECUsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static GetConnectedECUsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected GetConnectedECUsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return GetConnectedECUsMatcher.on(engine);
  }
  
  @Override
  public GetConnectedECUsMatcher instantiate() throws ViatraQueryException {
    return GetConnectedECUsMatcher.create();
  }
  
  @Override
  public GetConnectedECUsMatch newEmptyMatch() {
    return GetConnectedECUsMatch.newEmptyMatch();
  }
  
  @Override
  public GetConnectedECUsMatch newMatch(final Object... parameters) {
    return GetConnectedECUsMatch.newMatch((org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance) parameters[0], (org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GetConnectedECUsQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link GetConnectedECUsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static GetConnectedECUsQuerySpecification INSTANCE = new GetConnectedECUsQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static GetConnectedECUsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEcu1 = new PParameter("ecu1", "org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEcu2 = new PParameter("ecu2", "org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEcu1, parameter_pEcu2);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.muml.example.brakebywire.getConnectedECUs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ecu1","ecu2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_ecu1 = body.getOrCreateVariableByName("ecu1");
              PVariable var_ecu2 = body.getOrCreateVariableByName("ecu2");
              PVariable var_ep1 = body.getOrCreateVariableByName("ep1");
              PVariable var_ep2 = body.getOrCreateVariableByName("ep2");
              new TypeConstraint(body, new FlatTuple(var_ecu1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")));
              new TypeConstraint(body, new FlatTuple(var_ecu2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_ecu1, parameter_pEcu1),
                 new ExportedParameter(body, var_ecu2, parameter_pEcu2)
              ));
              // 	StructuredResourceInstance.hwports(ecu1, ep1)
              new TypeConstraint(body, new FlatTuple(var_ecu1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var_ecu1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "ResourceInstance", "hwports")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "HWPort")));
              new Equality(body, var__virtual_0_, var_ep1);
              // 	StructuredResourceInstance.hwports(ecu2, ep2)
              new TypeConstraint(body, new FlatTuple(var_ecu2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, new FlatTuple(var_ecu2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "ResourceInstance", "hwports")));
              new TypeConstraint(body, new FlatTuple(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "HWPort")));
              new Equality(body, var__virtual_1_, var_ep2);
              // 	find connected+(ep1, ep2)
              new BinaryTransitiveClosure(body, new FlatTuple(var_ep1, var_ep2), ConnectedQuerySpecification.instance().getInternalQueryRepresentation());
              // 	ecu1 != ecu2
              new Inequality(body, var_ecu1, var_ecu2);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_ecu1 = body.getOrCreateVariableByName("ecu1");
              PVariable var_ecu2 = body.getOrCreateVariableByName("ecu2");
              new TypeConstraint(body, new FlatTuple(var_ecu1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")));
              new TypeConstraint(body, new FlatTuple(var_ecu2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0", "StructuredResourceInstance")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_ecu1, parameter_pEcu1),
                 new ExportedParameter(body, var_ecu2, parameter_pEcu2)
              ));
              // 	// the same ECUs are trivially connected	ecu1 == ecu2
              new Equality(body, var_ecu1, var_ecu2);
              bodies.add(body);
          }
          // to silence compiler error
          if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
