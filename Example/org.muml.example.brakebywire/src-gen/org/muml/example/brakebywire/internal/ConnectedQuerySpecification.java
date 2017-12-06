/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire.internal;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPrivateEMFQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ConnectedMatcher in a type-safe way.
 * 
 * @see ConnectedMatcher
 * @see ConnectedMatch
 * 
 */
@SuppressWarnings("all")
public final class ConnectedQuerySpecification extends BaseGeneratedPrivateEMFQuerySpecification {
  private ConnectedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ConnectedQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ConnectedQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ConnectedQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ConnectedQuerySpecification INSTANCE = new ConnectedQuerySpecification();
    
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
    private final static ConnectedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEp1 = new PParameter("ep1", "org.muml.pim.connector.ConnectorEndpointInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.muml.org/pim/connector/1.0.0", "ConnectorEndpointInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEp2 = new PParameter("ep2", "org.muml.pim.connector.ConnectorEndpointInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.muml.org/pim/connector/1.0.0", "ConnectorEndpointInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEp1, parameter_pEp2);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.muml.example.brakebywire.connected";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ep1","ep2");
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
              PVariable var_ep1 = body.getOrCreateVariableByName("ep1");
              PVariable var_ep2 = body.getOrCreateVariableByName("ep2");
              PVariable var_connector = body.getOrCreateVariableByName("connector");
              new TypeConstraint(body, new FlatTuple(var_ep1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorEndpointInstance")));
              new TypeConstraint(body, new FlatTuple(var_ep2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorEndpointInstance")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_ep1, parameter_pEp1),
                 new ExportedParameter(body, var_ep2, parameter_pEp2)
              ));
              // 	ConnectorInstance.connectorEndpointInstances(connector, ep1)
              new TypeConstraint(body, new FlatTuple(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorInstance")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var_connector, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorInstance", "connectorEndpointInstances")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorEndpointInstance")));
              new Equality(body, var__virtual_0_, var_ep1);
              // 	ConnectorInstance.connectorEndpointInstances(connector, ep2)
              new TypeConstraint(body, new FlatTuple(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorInstance")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, new FlatTuple(var_connector, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorInstance", "connectorEndpointInstances")));
              new TypeConstraint(body, new FlatTuple(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.muml.org/pim/connector/1.0.0", "ConnectorEndpointInstance")));
              new Equality(body, var__virtual_1_, var_ep2);
              // 	ep1 != ep2
              new Inequality(body, var_ep1, var_ep2);
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
