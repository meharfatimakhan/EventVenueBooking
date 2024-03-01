/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingStatus <em>Booking Status</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingBy <em>Booking By</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingType <em>Booking Type</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getMenuOptions <em>Menu Options</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingDate <em>Booking Date</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBooking()
 * @model abstract="true"
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingID()
	 * @model required="true"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Date</em>' attribute.
	 * @see #setBookingDate(String)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingDate()
	 * @model
	 * @generated
	 */
	String getBookingDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getBookingDate <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Date</em>' attribute.
	 * @see #getBookingDate()
	 * @generated
	 */
	void setBookingDate(String value);

	/**
	 * Returns the value of the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Status</em>' attribute.
	 * @see #setBookingStatus(String)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingStatus()
	 * @model
	 * @generated
	 */
	String getBookingStatus();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getBookingStatus <em>Booking Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Status</em>' attribute.
	 * @see #getBookingStatus()
	 * @generated
	 */
	void setBookingStatus(String value);

	/**
	 * Returns the value of the '<em><b>Booking By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking By</em>' containment reference.
	 * @see #setBookingBy(Customer)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Customer getBookingBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getBookingBy <em>Booking By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking By</em>' containment reference.
	 * @see #getBookingBy()
	 * @generated
	 */
	void setBookingBy(Customer value);

	/**
	 * Returns the value of the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Type</em>' attribute.
	 * @see #setBookingType(String)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingType()
	 * @model
	 * @generated
	 */
	String getBookingType();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getBookingType <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Type</em>' attribute.
	 * @see #getBookingType()
	 * @generated
	 */
	void setBookingType(String value);

	/**
	 * Returns the value of the '<em><b>Menu Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Options</em>' attribute.
	 * @see #setMenuOptions(EList)
	 * @see gendev.hw1.Hw1Package#getBooking_MenuOptions()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getMenuOptions();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getMenuOptions <em>Menu Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Options</em>' attribute.
	 * @see #getMenuOptions()
	 * @generated
	 */
	void setMenuOptions(EList<?> value);

	/**
	 * Returns the value of the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Guests</em>' attribute.
	 * @see #setNumberOfGuests(int)
	 * @see gendev.hw1.Hw1Package#getBooking_NumberOfGuests()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewBookingInfo();

} // Booking
