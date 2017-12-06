/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire.internal;

import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.example.brakebywire.internal.ConnectedQuerySpecification;
import org.muml.example.brakebywire.util.GetConnectedECUsQuerySpecification;

/**
 * A pattern group formed of all patterns defined in MUMLPattern.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package org.muml.example.brakebywire, the group contains the definition of the following patterns: <ul>
 * <li>getConnectedECUs</li>
 * <li>connected</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class MUMLPatternAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static MUMLPatternAll instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new MUMLPatternAll();
    }
    return INSTANCE;
  }
  
  private static MUMLPatternAll INSTANCE;
  
  private MUMLPatternAll() throws ViatraQueryException {
    querySpecifications.add(GetConnectedECUsQuerySpecification.instance());
    querySpecifications.add(ConnectedQuerySpecification.instance());
  }
}
