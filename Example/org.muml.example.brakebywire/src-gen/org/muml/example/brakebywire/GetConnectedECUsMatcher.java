/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.muml.example.brakebywire.GetConnectedECUsMatch;
import org.muml.example.brakebywire.util.GetConnectedECUsQuerySpecification;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * Generated pattern matcher API of the org.muml.example.brakebywire.getConnectedECUs pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link GetConnectedECUsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern getConnectedECUs(ecu1 : StructuredResourceInstance, ecu2 : StructuredResourceInstance) {
 * 	StructuredResourceInstance.hwports(ecu1, ep1);
 * 	StructuredResourceInstance.hwports(ecu2, ep2);
 * 	find connected+(ep1, ep2);
 * 	ecu1 != ecu2;
 * } or {
 * 	// the same ECUs are trivially connected
 * 	ecu1 == ecu2;
 * }
 * </pre></code>
 * 
 * @see GetConnectedECUsMatch
 * @see GetConnectedECUsProcessor
 * @see GetConnectedECUsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class GetConnectedECUsMatcher extends BaseMatcher<GetConnectedECUsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static GetConnectedECUsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    GetConnectedECUsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (GetConnectedECUsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static GetConnectedECUsMatcher create() throws ViatraQueryException {
    return new GetConnectedECUsMatcher();
  }
  
  private final static int POSITION_ECU1 = 0;
  
  private final static int POSITION_ECU2 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GetConnectedECUsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private GetConnectedECUsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @return matches represented as a GetConnectedECUsMatch object.
   * 
   */
  public Collection<GetConnectedECUsMatch> getAllMatches(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return rawGetAllMatches(new Object[]{pEcu1, pEcu2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @return a match represented as a GetConnectedECUsMatch object, or null if no match is found.
   * 
   */
  public GetConnectedECUsMatch getOneArbitraryMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return rawGetOneArbitraryMatch(new Object[]{pEcu1, pEcu2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return rawHasMatch(new Object[]{pEcu1, pEcu2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return rawCountMatches(new Object[]{pEcu1, pEcu2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2, final IMatchProcessor<? super GetConnectedECUsMatch> processor) {
    rawForEachMatch(new Object[]{pEcu1, pEcu2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2, final IMatchProcessor<? super GetConnectedECUsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEcu1, pEcu2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public GetConnectedECUsMatch newMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return GetConnectedECUsMatch.newMatch(pEcu1, pEcu2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<StructuredResourceInstance> rawAccumulateAllValuesOfecu1(final Object[] parameters) {
    Set<StructuredResourceInstance> results = new HashSet<StructuredResourceInstance>();
    rawAccumulateAllValues(POSITION_ECU1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<StructuredResourceInstance> getAllValuesOfecu1() {
    return rawAccumulateAllValuesOfecu1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<StructuredResourceInstance> getAllValuesOfecu1(final GetConnectedECUsMatch partialMatch) {
    return rawAccumulateAllValuesOfecu1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu1.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<StructuredResourceInstance> getAllValuesOfecu1(final StructuredResourceInstance pEcu2) {
    return rawAccumulateAllValuesOfecu1(new Object[]{
    null, 
    pEcu2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu2.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<StructuredResourceInstance> rawAccumulateAllValuesOfecu2(final Object[] parameters) {
    Set<StructuredResourceInstance> results = new HashSet<StructuredResourceInstance>();
    rawAccumulateAllValues(POSITION_ECU2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu2.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<StructuredResourceInstance> getAllValuesOfecu2() {
    return rawAccumulateAllValuesOfecu2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu2.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<StructuredResourceInstance> getAllValuesOfecu2(final GetConnectedECUsMatch partialMatch) {
    return rawAccumulateAllValuesOfecu2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ecu2.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<StructuredResourceInstance> getAllValuesOfecu2(final StructuredResourceInstance pEcu1) {
    return rawAccumulateAllValuesOfecu2(new Object[]{
    pEcu1, 
    null
    });
  }
  
  @Override
  protected GetConnectedECUsMatch tupleToMatch(final Tuple t) {
    try {
        return GetConnectedECUsMatch.newMatch((StructuredResourceInstance) t.get(POSITION_ECU1), (StructuredResourceInstance) t.get(POSITION_ECU2));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected GetConnectedECUsMatch arrayToMatch(final Object[] match) {
    try {
        return GetConnectedECUsMatch.newMatch((StructuredResourceInstance) match[POSITION_ECU1], (StructuredResourceInstance) match[POSITION_ECU2]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected GetConnectedECUsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return GetConnectedECUsMatch.newMutableMatch((StructuredResourceInstance) match[POSITION_ECU1], (StructuredResourceInstance) match[POSITION_ECU2]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<GetConnectedECUsMatcher> querySpecification() throws ViatraQueryException {
    return GetConnectedECUsQuerySpecification.instance();
  }
}
