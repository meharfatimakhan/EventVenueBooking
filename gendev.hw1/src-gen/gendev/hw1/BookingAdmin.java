/**
 */
package gendev.hw1;

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
 *   <li>{@link gendev.hw1.BookingAdmin#getApprovalRate <em>Approval Rate</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBookingAdmin()
 * @model
 * @generated
 */
public interface BookingAdmin extends SystemAdmin {
	/**
	 * Returns the value of the '<em><b>Approved Bookings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.EventBooking#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Bookings</em>' reference.
	 * @see #setApprovedBookings(EventBooking)
	 * @see gendev.hw1.Hw1Package#getBookingAdmin_ApprovedBookings()
	 * @see gendev.hw1.EventBooking#getApprovedBy
	 * @model opposite="approvedBy"
	 * @generated
	 */
	EventBooking getApprovedBookings();

	/**
	 * Sets the value of the '{@link gendev.hw1.BookingAdmin#getApprovedBookings <em>Approved Bookings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved Bookings</em>' reference.
	 * @see #getApprovedBookings()
	 * @generated
	 */
	void setApprovedBookings(EventBooking value);

	/**
	 * Returns the value of the '<em><b>Approval Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Rate</em>' attribute.
	 * @see #setApprovalRate(double)
	 * @see gendev.hw1.Hw1Package#getBookingAdmin_ApprovalRate()
	 * @model
	 * @generated
	 */
	double getApprovalRate();

	/**
	 * Sets the value of the '{@link gendev.hw1.BookingAdmin#getApprovalRate <em>Approval Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Rate</em>' attribute.
	 * @see #getApprovalRate()
	 * @generated
	 */
	void setApprovalRate(double value);

} // BookingAdmin
