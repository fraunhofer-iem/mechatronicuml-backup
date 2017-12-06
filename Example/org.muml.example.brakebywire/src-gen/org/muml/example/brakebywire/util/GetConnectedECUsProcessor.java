/**
 * Generated from platform:/resource/org.muml.example.brakebywire/src/org/muml/example/brakebywire/MUMLPattern.vql
 */
package org.muml.example.brakebywire.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.muml.example.brakebywire.GetConnectedECUsMatch;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * A match processor tailored for the org.muml.example.brakebywire.getConnectedECUs pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GetConnectedECUsProcessor implements IMatchProcessor<GetConnectedECUsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEcu1 the value of pattern parameter ecu1 in the currently processed match
   * @param pEcu2 the value of pattern parameter ecu2 in the currently processed match
   * 
   */
  public abstract void process(final StructuredResourceInstance pEcu1, final StructuredResourceInstance pEcu2);
  
  @Override
  public void process(final GetConnectedECUsMatch match) {
    process(match.getEcu1(), match.getEcu2());
  }
}
