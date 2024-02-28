/**
 */
package gendev.hw1.impl;

import gendev.hw1.Booking;
import gendev.hw1.Hw1Package;

import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getEventDescription <em>Event Description</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getBookingDate <em>Booking Date</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getBookingStatus <em>Booking Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getEventDescription() <em>Event Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventDescription() <em>Event Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDescription()
	 * @generated
	 * @ordered
	 */
	protected String eventDescription = EVENT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected int bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingDate() <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar BOOKING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingDate() <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar bookingDate = BOOKING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingStatus() <em>Booking Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingStatus() <em>Booking Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingStatus()
	 * @generated
	 * @ordered
	 */
	protected String bookingStatus = BOOKING_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDescription(String newEventDescription) {
		String oldEventDescription = eventDescription;
		eventDescription = newEventDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__EVENT_DESCRIPTION,
					oldEventDescription, eventDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(int newBookingID) {
		int oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__BOOKING_ID, oldBookingID,
					bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getBookingDate() {
		return bookingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingDate(Calendar newBookingDate) {
		Calendar oldBookingDate = bookingDate;
		bookingDate = newBookingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__BOOKING_DATE, oldBookingDate,
					bookingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingStatus() {
		return bookingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingStatus(String newBookingStatus) {
		String oldBookingStatus = bookingStatus;
		bookingStatus = newBookingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__BOOKING_STATUS, oldBookingStatus,
					bookingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.BOOKING__EVENT_DESCRIPTION:
			return getEventDescription();
		case Hw1Package.BOOKING__BOOKING_ID:
			return getBookingID();
		case Hw1Package.BOOKING__BOOKING_DATE:
			return getBookingDate();
		case Hw1Package.BOOKING__BOOKING_STATUS:
			return getBookingStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.BOOKING__EVENT_DESCRIPTION:
			setEventDescription((String) newValue);
			return;
		case Hw1Package.BOOKING__BOOKING_ID:
			setBookingID((Integer) newValue);
			return;
		case Hw1Package.BOOKING__BOOKING_DATE:
			setBookingDate((Calendar) newValue);
			return;
		case Hw1Package.BOOKING__BOOKING_STATUS:
			setBookingStatus((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.BOOKING__EVENT_DESCRIPTION:
			setEventDescription(EVENT_DESCRIPTION_EDEFAULT);
			return;
		case Hw1Package.BOOKING__BOOKING_ID:
			setBookingID(BOOKING_ID_EDEFAULT);
			return;
		case Hw1Package.BOOKING__BOOKING_DATE:
			setBookingDate(BOOKING_DATE_EDEFAULT);
			return;
		case Hw1Package.BOOKING__BOOKING_STATUS:
			setBookingStatus(BOOKING_STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.BOOKING__EVENT_DESCRIPTION:
			return EVENT_DESCRIPTION_EDEFAULT == null ? eventDescription != null
					: !EVENT_DESCRIPTION_EDEFAULT.equals(eventDescription);
		case Hw1Package.BOOKING__BOOKING_ID:
			return bookingID != BOOKING_ID_EDEFAULT;
		case Hw1Package.BOOKING__BOOKING_DATE:
			return BOOKING_DATE_EDEFAULT == null ? bookingDate != null : !BOOKING_DATE_EDEFAULT.equals(bookingDate);
		case Hw1Package.BOOKING__BOOKING_STATUS:
			return BOOKING_STATUS_EDEFAULT == null ? bookingStatus != null
					: !BOOKING_STATUS_EDEFAULT.equals(bookingStatus);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (EventDescription: ");
		result.append(eventDescription);
		result.append(", BookingID: ");
		result.append(bookingID);
		result.append(", BookingDate: ");
		result.append(bookingDate);
		result.append(", BookingStatus: ");
		result.append(bookingStatus);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
