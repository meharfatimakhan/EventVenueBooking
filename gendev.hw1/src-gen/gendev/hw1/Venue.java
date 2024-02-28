/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Venue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Venue#getLocation <em>Location</em>}</li>
 *   <li>{@link gendev.hw1.Venue#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link gendev.hw1.Venue#getBookings <em>Bookings</em>}</li>
 *   <li>{@link gendev.hw1.Venue#getVenueID <em>Venue ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getVenue()
 * @model
 * @generated
 */
public interface Venue extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see gendev.hw1.Hw1Package#getVenue_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link gendev.hw1.Venue#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see gendev.hw1.Hw1Package#getVenue_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link gendev.hw1.Venue#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Booking}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Booking#getHostedAt <em>Hosted At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getVenue_Bookings()
	 * @see gendev.hw1.Booking#getHostedAt
	 * @model opposite="hostedAt"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue ID</em>' attribute.
	 * @see #setVenueID(int)
	 * @see gendev.hw1.Hw1Package#getVenue_VenueID()
	 * @model
	 * @generated
	 */
	int getVenueID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Venue#getVenueID <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue ID</em>' attribute.
	 * @see #getVenueID()
	 * @generated
	 */
	void setVenueID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkAvailibility();

} // Venue
