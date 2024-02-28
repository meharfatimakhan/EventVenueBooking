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
 *   <li>{@link gendev.hw1.BookingAgent#getApproves <em>Approves</em>}</li>
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
	 * Returns the value of the '<em><b>Approves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approves</em>' reference.
	 * @see #setApproves(Booking)
	 * @see gendev.hw1.Hw1Package#getBookingAgent_Approves()
	 * @model required="true"
	 * @generated
	 */
	Booking getApproves();

	/**
	 * Sets the value of the '{@link gendev.hw1.BookingAgent#getApproves <em>Approves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approves</em>' reference.
	 * @see #getApproves()
	 * @generated
	 */
	void setApproves(Booking value);

} // BookingAgent
