/**
 */
package de.uni_paderborn.uppaal.trace.diagnosticTrace.impl;

import de.uni_paderborn.uppaal.templates.AbstractTemplate;

import de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.ProcessIdentifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.impl.ProcessIdentifierImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.trace.diagnosticTrace.impl.ProcessIdentifierImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessIdentifierImpl extends MinimalEObjectImpl.Container implements ProcessIdentifier
{
  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected AbstractTemplate template;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Integer> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessIdentifierImpl()
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
    return DiagnosticTracePackage.Literals.PROCESS_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractTemplate getTemplate()
  {
    if (template != null && template.eIsProxy())
    {
      InternalEObject oldTemplate = (InternalEObject)template;
      template = (AbstractTemplate)eResolveProxy(oldTemplate);
      if (template != oldTemplate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagnosticTracePackage.PROCESS_IDENTIFIER__TEMPLATE, oldTemplate, template));
      }
    }
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractTemplate basicGetTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(AbstractTemplate newTemplate)
  {
    AbstractTemplate oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticTracePackage.PROCESS_IDENTIFIER__TEMPLATE, oldTemplate, template));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EDataTypeEList<Integer>(Integer.class, this, DiagnosticTracePackage.PROCESS_IDENTIFIER__ARGUMENTS);
    }
    return arguments;
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
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__TEMPLATE:
        if (resolve) return getTemplate();
        return basicGetTemplate();
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__ARGUMENTS:
        return getArguments();
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
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__TEMPLATE:
        setTemplate((AbstractTemplate)newValue);
        return;
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Integer>)newValue);
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
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__TEMPLATE:
        setTemplate((AbstractTemplate)null);
        return;
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__ARGUMENTS:
        getArguments().clear();
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
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__TEMPLATE:
        return template != null;
      case DiagnosticTracePackage.PROCESS_IDENTIFIER__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (arguments: ");
    result.append(arguments);
    result.append(')');
    return result.toString();
  }

} //ProcessIdentifierImpl
