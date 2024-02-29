/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Customer#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getPhone <em>Phone</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getCustomerBookingID <em>Customer Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getSubmits <em>Submits</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getCustomer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='null'"
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see gendev.hw1.Hw1Package#getCustomer_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see gendev.hw1.Hw1Package#getCustomer_Phone()
	 * @model
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Customer Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Booking ID</em>' attribute.
	 * @see #setCustomerBookingID(int)
	 * @see gendev.hw1.Hw1Package#getCustomer_CustomerBookingID()
	 * @model required="true"
	 * @generated
	 */
	int getCustomerBookingID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getCustomerBookingID <em>Customer Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Booking ID</em>' attribute.
	 * @see #getCustomerBookingID()
	 * @generated
	 */
	void setCustomerBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Submits</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Review}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Review#getSubmittedBy <em>Submitted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submits</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getCustomer_Submits()
	 * @see gendev.hw1.Review#getSubmittedBy
	 * @model opposite="submittedBy"
	 * @generated
	 */
	EList<Review> getSubmits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void submitReview();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Customer.allInstances()-&gt;forAll(c | c &lt;&gt; self implies c.Email &lt;&gt; self.Email)\n\t\tand self.submits-&gt;notEmpty() implies self.submits-&gt;forAll(review | review.Rating &gt;= 1 and review.Rating &lt;= 5)\n\t\tand self.Phone.toString().size() = 10'"
	 * @generated
	 */
	boolean null_(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Customer
