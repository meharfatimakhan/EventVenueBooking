/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link gendev.hw1.Venue#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.Venue#getBookings <em>Bookings</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getVenue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='venueBookingsCheck'"
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue ID</em>' attribute.
	 * @see #setVenueID(int)
	 * @see gendev.hw1.Hw1Package#getVenue_VenueID()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getVenue_Bookings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkAvailibility();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.bookings-&gt;notEmpty()\n    \tand self.bookings-&gt;forAll(booking | \n        (if booking.NumberOfGuests &gt;= self.Capacity * 0.8 \n        \tthen booking.BookingStatus = \'Fully Booked\' \n        \telse booking.BookingStatus &lt;&gt; \'Not Fully Booked\' endif\n        ))'"
	 * @generated
	 */
	boolean venueBookingsCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Venue
