/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.BookingAdmin#getApprovedBookings <em>Approved Bookings</em>}</li>
 *   <li>{@link gendev.hw1.BookingAdmin#getNumberOfApprovals <em>Number Of Approvals</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBookingAdmin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='null'"
 * @generated
 */
public interface BookingAdmin extends SystemAdmin {
	/**
	 * Returns the value of the '<em><b>Approved Bookings</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.EventBooking}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.EventBooking#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Bookings</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getBookingAdmin_ApprovedBookings()
	 * @see gendev.hw1.EventBooking#getApprovedBy
	 * @model opposite="approvedBy"
	 * @generated
	 */
	EList<EventBooking> getApprovedBookings();

	/**
	 * Returns the value of the '<em><b>Number Of Approvals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Approvals</em>' attribute.
	 * @see #setNumberOfApprovals(int)
	 * @see gendev.hw1.Hw1Package#getBookingAdmin_NumberOfApprovals()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfApprovals();

	/**
	 * Sets the value of the '{@link gendev.hw1.BookingAdmin#getNumberOfApprovals <em>Number Of Approvals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Approvals</em>' attribute.
	 * @see #getNumberOfApprovals()
	 * @generated
	 */
	void setNumberOfApprovals(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void approveCustomerBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.venuesManaged-&gt;notEmpty()\n    \tand self.approvedBookings-&gt;exists(booking | not booking.oclIsUndefined())\n    \tand self.NumberOfApprovals &gt;= 0'"
	 * @generated
	 */
	boolean null_(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BookingAdmin
