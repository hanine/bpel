/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompletionCondition.java,v 1.2 2006/01/31 14:56:08 james Exp $
 */
package org.eclipse.bpel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel.model.CompletionCondition#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel.model.BPELPackage#getCompletionCondition()
 * @model
 * @generated
 */
public interface CompletionCondition extends EObject{
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference.
	 * @see #setBranches(Branches)
	 * @see org.eclipse.bpel.model.BPELPackage#getCompletionCondition_Branches()
	 * @model containment="true"
	 * @generated
	 */
	Branches getBranches();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.CompletionCondition#getBranches <em>Branches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches</em>' containment reference.
	 * @see #getBranches()
	 * @generated
	 */
	void setBranches(Branches value);

} // CompletionCondition