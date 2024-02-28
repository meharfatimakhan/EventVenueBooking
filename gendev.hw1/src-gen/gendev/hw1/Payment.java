/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Payment#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getPaidFor <em>Paid For</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Paid</em>' attribute.
	 * @see #setAmountPaid(int)
	 * @see gendev.hw1.Hw1Package#getPayment_AmountPaid()
	 * @model
	 * @generated
	 */
	int getAmountPaid();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getAmountPaid <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Paid</em>' attribute.
	 * @see #getAmountPaid()
	 * @generated
	 */
	void setAmountPaid(int value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see #setPaymentMethod(String)
	 * @see gendev.hw1.Hw1Package#getPayment_PaymentMethod()
	 * @model
	 * @generated
	 */
	String getPaymentMethod();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(String value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see #setPaymentStatus(String)
	 * @see gendev.hw1.Hw1Package#getPayment_PaymentStatus()
	 * @model
	 * @generated
	 */
	String getPaymentStatus();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(String value);

	/**
	 * Returns the value of the '<em><b>Paid For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid For</em>' reference.
	 * @see #setPaidFor(EventBooking)
	 * @see gendev.hw1.Hw1Package#getPayment_PaidFor()
	 * @model required="true"
	 * @generated
	 */
	EventBooking getPaidFor();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getPaidFor <em>Paid For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid For</em>' reference.
	 * @see #getPaidFor()
	 * @generated
	 */
	void setPaidFor(EventBooking value);

} // Payment
