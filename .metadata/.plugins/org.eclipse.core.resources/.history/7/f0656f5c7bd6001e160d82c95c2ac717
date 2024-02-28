/**
 */
package gendev.hw1;

import java.util.Calendar;

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
 *   <li>{@link gendev.hw1.Booking#getEventDescription <em>Event Description</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingDate <em>Booking Date</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getBookingStatus <em>Booking Status</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getMadeBy <em>Made By</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getApprovedBookings <em>Approved Bookings</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getHosted_at <em>Hosted at</em>}</li>
 *   <li>{@link gendev.hw1.Booking#getCanHave <em>Can Have</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getBooking()
 * @model abstract="true"
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Description</em>' attribute.
	 * @see #setEventDescription(String)
	 * @see gendev.hw1.Hw1Package#getBooking_EventDescription()
	 * @model
	 * @generated
	 */
	String getEventDescription();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getEventDescription <em>Event Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Description</em>' attribute.
	 * @see #getEventDescription()
	 * @generated
	 */
	void setEventDescription(String value);

	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingID()
	 * @model
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
	 * @see #setBookingDate(Calendar)
	 * @see gendev.hw1.Hw1Package#getBooking_BookingDate()
	 * @model dataType="gendev.hw1.Calendar"
	 * @generated
	 */
	Calendar getBookingDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getBookingDate <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Date</em>' attribute.
	 * @see #getBookingDate()
	 * @generated
	 */
	void setBookingDate(Calendar value);

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
	 * Returns the value of the '<em><b>Made By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Made By</em>' reference.
	 * @see #setMadeBy(Customer)
	 * @see gendev.hw1.Hw1Package#getBooking_MadeBy()
	 * @model required="true"
	 * @generated
	 */
	Customer getMadeBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getMadeBy <em>Made By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Made By</em>' reference.
	 * @see #getMadeBy()
	 * @generated
	 */
	void setMadeBy(Customer value);

	/**
	 * Returns the value of the '<em><b>Approved Bookings</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.BookingAgent}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.BookingAgent#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Bookings</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getBooking_ApprovedBookings()
	 * @see gendev.hw1.BookingAgent#getApprovedBy
	 * @model opposite="approvedBy"
	 * @generated
	 */
	EList<BookingAgent> getApprovedBookings();

	/**
	 * Returns the value of the '<em><b>Hosted at</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted at</em>' reference.
	 * @see #setHosted_at(Venue)
	 * @see gendev.hw1.Hw1Package#getBooking_Hosted_at()
	 * @model required="true"
	 * @generated
	 */
	Venue getHosted_at();

	/**
	 * Sets the value of the '{@link gendev.hw1.Booking#getHosted_at <em>Hosted at</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosted at</em>' reference.
	 * @see #getHosted_at()
	 * @generated
	 */
	void setHosted_at(Venue value);

	/**
	 * Returns the value of the '<em><b>Can Have</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Review}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Have</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getBooking_CanHave()
	 * @model
	 * @generated
	 */
	EList<Review> getCanHave();

} // Booking
