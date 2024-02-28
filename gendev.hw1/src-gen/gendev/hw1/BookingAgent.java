/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.BookingAgent#getAgentID <em>Agent ID</em>}</li>
 *   <li>{@link gendev.hw1.BookingAgent#getApprovedBy <em>Approved By</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBookingAgent()
 * @model
 * @generated
 */
public interface BookingAgent extends SystemAdmin {
	/**
	 * Returns the value of the '<em><b>Agent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent ID</em>' attribute.
	 * @see #setAgentID(int)
	 * @see gendev.hw1.Hw1Package#getBookingAgent_AgentID()
	 * @model
	 * @generated
	 */
	int getAgentID();

	/**
	 * Sets the value of the '{@link gendev.hw1.BookingAgent#getAgentID <em>Agent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent ID</em>' attribute.
	 * @see #getAgentID()
	 * @generated
	 */
	void setAgentID(int value);

	/**
	 * Returns the value of the '<em><b>Approved By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.EventBooking#getApprovedBookings <em>Approved Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By</em>' reference.
	 * @see #setApprovedBy(EventBooking)
	 * @see gendev.hw1.Hw1Package#getBookingAgent_ApprovedBy()
	 * @see gendev.hw1.EventBooking#getApprovedBookings
	 * @model opposite="approvedBookings"
	 * @generated
	 */
	EventBooking getApprovedBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.BookingAgent#getApprovedBy <em>Approved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved By</em>' reference.
	 * @see #getApprovedBy()
	 * @generated
	 */
	void setApprovedBy(EventBooking value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void approveBookings();

} // BookingAgent
