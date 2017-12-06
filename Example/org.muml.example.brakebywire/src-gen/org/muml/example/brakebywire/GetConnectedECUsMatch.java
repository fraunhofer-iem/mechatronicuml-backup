/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.example.brakebywire.util.GetConnectedECUsQuerySpecification;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * Pattern-specific match representation of the org.muml.example.brakebywire.getConnectedECUs pattern,
 * to be used in conjunction with {@link GetConnectedECUsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GetConnectedECUsMatcher
 * @see GetConnectedECUsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class GetConnectedECUsMatch extends BasePatternMatch {
  private StructuredResourceInstance fEcu1;
  
  private StructuredResourceInstance fEcu2;
  
  private static List<String> parameterNames = makeImmutableList("ecu1", "ecu2");
  
  private GetConnectedECUsMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    this.fEcu1 = pEcu1;
    this.fEcu2 = pEcu2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ecu1".equals(parameterName)) return this.fEcu1;
    if ("ecu2".equals(parameterName)) return this.fEcu2;
    return null;
  }
  
  public StructuredResourceInstance getEcu1() {
    return this.fEcu1;
  }
  
  public StructuredResourceInstance getEcu2() {
    return this.fEcu2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ecu1".equals(parameterName) ) {
        this.fEcu1 = (StructuredResourceInstance) newValue;
        return true;
    }
    if ("ecu2".equals(parameterName) ) {
        this.fEcu2 = (StructuredResourceInstance) newValue;
        return true;
    }
    return false;
  }
  
  public void setEcu1(final StructuredResourceInstance pEcu1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEcu1 = pEcu1;
  }
  
  public void setEcu2(final StructuredResourceInstance pEcu2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEcu2 = pEcu2;
  }
  
  @Override
  public String patternName() {
    return "org.muml.example.brakebywire.getConnectedECUs";
  }
  
  @Override
  public List<String> parameterNames() {
    return GetConnectedECUsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEcu1, fEcu2};
  }
  
  @Override
  public GetConnectedECUsMatch toImmutable() {
    return isMutable() ? newMatch(fEcu1, fEcu2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ecu1\"=" + prettyPrintValue(fEcu1) + ", ");
    
    result.append("\"ecu2\"=" + prettyPrintValue(fEcu2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEcu1 == null) ? 0 : fEcu1.hashCode());
    result = prime * result + ((fEcu2 == null) ? 0 : fEcu2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof GetConnectedECUsMatch)) { // this should be infrequent
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        if (!specification().equals(otherSig.specification()))
            return false;
        return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    GetConnectedECUsMatch other = (GetConnectedECUsMatch) obj;
    if (fEcu1 == null) {if (other.fEcu1 != null) return false;}
    else if (!fEcu1.equals(other.fEcu1)) return false;
    if (fEcu2 == null) {if (other.fEcu2 != null) return false;}
    else if (!fEcu2.equals(other.fEcu2)) return false;
    return true;
  }
  
  @Override
  public GetConnectedECUsQuerySpecification specification() {
    try {
        return GetConnectedECUsQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static GetConnectedECUsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEcu1 the fixed value of pattern parameter ecu1, or null if not bound.
   * @param pEcu2 the fixed value of pattern parameter ecu2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static GetConnectedECUsMatch newMutableMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return new Mutable(pEcu1, pEcu2);
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
  public static GetConnectedECUsMatch newMatch(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
    return new Immutable(pEcu1, pEcu2);
  }
  
  private static final class Mutable extends GetConnectedECUsMatch {
    Mutable(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
      super(pEcu1, pEcu2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends GetConnectedECUsMatch {
    Immutable(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2) {
      super(pEcu1, pEcu2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
