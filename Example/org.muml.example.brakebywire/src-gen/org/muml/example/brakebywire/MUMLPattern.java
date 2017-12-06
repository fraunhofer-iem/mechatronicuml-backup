/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.example.brakebywire.GetConnectedECUsMatcher;
import org.muml.example.brakebywire.util.GetConnectedECUsQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in MUMLPattern.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file MUMLPattern.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.muml.example.brakebywire, the group contains the definition of the following patterns: <ul>
 * <li>getConnectedECUs</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class MUMLPattern extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static MUMLPattern instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new MUMLPattern();
    }
    return INSTANCE;
  }
  
  private static MUMLPattern INSTANCE;
  
  private MUMLPattern() throws ViatraQueryException {
    querySpecifications.add(GetConnectedECUsQuerySpecification.instance());
  }
  
  public GetConnectedECUsQuerySpecification getGetConnectedECUs() throws ViatraQueryException {
    return GetConnectedECUsQuerySpecification.instance();
  }
  
  public GetConnectedECUsMatcher getGetConnectedECUs(final ViatraQueryEngine engine) throws ViatraQueryException {
    return GetConnectedECUsMatcher.on(engine);
  }
}
