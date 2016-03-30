package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.resource;

import com.google.inject.Injector;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class LPSolveResource /* implements AbstractLanguageResource  */{
  @Override
  protected Injector getInjector() {
    LPSolveStandaloneSetup _lPSolveStandaloneSetup = new LPSolveStandaloneSetup();
    return _lPSolveStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
  
  @Override
  protected boolean isSerializable(final EObject object) {
    return (object instanceof IntegerLinearProgram);
  }
}
