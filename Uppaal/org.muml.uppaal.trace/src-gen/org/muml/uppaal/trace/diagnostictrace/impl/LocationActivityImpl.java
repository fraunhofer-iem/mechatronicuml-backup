/**
 */
package org.muml.uppaal.trace.diagnostictrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.uppaal.templates.Location;

import org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage;
import org.muml.uppaal.trace.diagnostictrace.LocationActivity;
import org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.LocationActivityImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.LocationActivityImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationActivityImpl extends MinimalEObjectImpl.Container implements LocationActivity
{
  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected ProcessIdentifier process;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Location location;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationActivityImpl()
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
    return DiagnostictracePackage.Literals.LOCATION_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessIdentifier getProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcess(ProcessIdentifier newProcess, NotificationChain msgs)
  {
    ProcessIdentifier oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS, oldProcess, newProcess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess(ProcessIdentifier newProcess)
  {
    if (newProcess != process)
    {
      NotificationChain msgs = null;
      if (process != null)
        msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS, null, msgs);
      if (newProcess != null)
        msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS, null, msgs);
      msgs = basicSetProcess(newProcess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS, newProcess, newProcess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location getLocation()
  {
    if (location != null && location.eIsProxy())
    {
      InternalEObject oldLocation = (InternalEObject)location;
      location = (Location)eResolveProxy(oldLocation);
      if (location != oldLocation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagnostictracePackage.LOCATION_ACTIVITY__LOCATION, oldLocation, location));
      }
    }
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location basicGetLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(Location newLocation)
  {
    Location oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagnostictracePackage.LOCATION_ACTIVITY__LOCATION, oldLocation, location));
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
      case DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS:
        return basicSetProcess(null, msgs);
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
      case DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS:
        return getProcess();
      case DiagnostictracePackage.LOCATION_ACTIVITY__LOCATION:
        if (resolve) return getLocation();
        return basicGetLocation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS:
        setProcess((ProcessIdentifier)newValue);
        return;
      case DiagnostictracePackage.LOCATION_ACTIVITY__LOCATION:
        setLocation((Location)newValue);
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
      case DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS:
        setProcess((ProcessIdentifier)null);
        return;
      case DiagnostictracePackage.LOCATION_ACTIVITY__LOCATION:
        setLocation((Location)null);
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
      case DiagnostictracePackage.LOCATION_ACTIVITY__PROCESS:
        return process != null;
      case DiagnostictracePackage.LOCATION_ACTIVITY__LOCATION:
        return location != null;
    }
    return super.eIsSet(featureID);
  }

} //LocationActivityImpl
