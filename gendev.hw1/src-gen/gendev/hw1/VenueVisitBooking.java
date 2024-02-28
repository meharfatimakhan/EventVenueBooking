/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Venue Visit Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.VenueVisitBooking#getVisitPurpose <em>Visit Purpose</em>}</li>
 *   <li>{@link gendev.hw1.VenueVisitBooking#getVisitID <em>Visit ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getVenueVisitBooking()
 * @model
 * @generated
 */
public interface VenueVisitBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Visit Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Purpose</em>' attribute.
	 * @see #setVisitPurpose(String)
	 * @see gendev.hw1.Hw1Package#getVenueVisitBooking_VisitPurpose()
	 * @model
	 * @generated
	 */
	String getVisitPurpose();

	/**
	 * Sets the value of the '{@link gendev.hw1.VenueVisitBooking#getVisitPurpose <em>Visit Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Purpose</em>' attribute.
	 * @see #getVisitPurpose()
	 * @generated
	 */
	void setVisitPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Visit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit ID</em>' attribute.
	 * @see #setVisitID(int)
	 * @see gendev.hw1.Hw1Package#getVenueVisitBooking_VisitID()
	 * @model
	 * @generated
	 */
	int getVisitID();

	/**
	 * Sets the value of the '{@link gendev.hw1.VenueVisitBooking#getVisitID <em>Visit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit ID</em>' attribute.
	 * @see #getVisitID()
	 * @generated
	 */
	void setVisitID(int value);

} // VenueVisitBooking
