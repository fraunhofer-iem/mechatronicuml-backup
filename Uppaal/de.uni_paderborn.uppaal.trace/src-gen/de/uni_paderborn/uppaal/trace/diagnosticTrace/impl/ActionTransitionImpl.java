/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace.impl;

import de.uni_paderborn.uppaal.trace.diagnosticTrace.ActionTransition;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.EdgeActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.impl.ActionTransitionImpl#getEdgeActivities <em>Edge Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionTransitionImpl extends TransitionImpl implements ActionTransition
{
  /**
   * The cached value of the '{@link #getEdgeActivities() <em>Edge Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeActivities()
   * @generated
   * @ordered
   */
  protected EList<EdgeActivity> edgeActivities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionTransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DiagnosticTracePackage.Literals.ACTION_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgeActivity> getEdgeActivities()
  {
    if (edgeActivities == null)
    {
      edgeActivities = new EObjectContainmentEList<EdgeActivity>(EdgeActivity.class, this, DiagnosticTracePackage.ACTION_TRANSITION__EDGE_ACTIVITIES);
    }
    return edgeActivities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DiagnosticTracePackage.ACTION_TRANSITION__EDGE_ACTIVITIES:
        return ((InternalEList<?>)getEdgeActivities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DiagnosticTracePackage.ACTION_TRANSITION__EDGE_ACTIVITIES:
        return getEdgeActivities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DiagnosticTracePackage.ACTION_TRANSITION__EDGE_ACTIVITIES:
        getEdgeActivities().clear();
        getEdgeActivities().addAll((Collection<? extends EdgeActivity>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DiagnosticTracePackage.ACTION_TRANSITION__EDGE_ACTIVITIES:
        getEdgeActivities().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DiagnosticTracePackage.ACTION_TRANSITION__EDGE_ACTIVITIES:
        return edgeActivities != null && !edgeActivities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionTransitionImpl
