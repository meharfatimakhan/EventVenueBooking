/**
 */
package gendev.hw1.impl;

import gendev.hw1.Booking;
import gendev.hw1.Customer;
import gendev.hw1.Hw1Package;

import gendev.hw1.Review;
import gendev.hw1.Venue;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link gendev.hw1.impl.BookingImpl#getBookingBy <em>Booking By</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getHasReviews <em>Has Reviews</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getBookingType <em>Booking Type</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getHostedAt <em>Hosted At</em>}</li>
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
	 * The cached value of the '{@link #getBookingBy() <em>Booking By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingBy()
	 * @generated
	 * @ordered
	 */
	protected Customer bookingBy;

	/**
	 * The cached value of the '{@link #getHasReviews() <em>Has Reviews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReviews()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> hasReviews;

	/**
	 * The default value of the '{@link #getBookingType() <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingType()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingType() <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingType()
	 * @generated
	 * @ordered
	 */
	protected String bookingType = BOOKING_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostedAt() <em>Hosted At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedAt()
	 * @generated
	 * @ordered
	 */
	protected Venue hostedAt;

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
	public Customer getBookingBy() {
		if (bookingBy != null && bookingBy.eIsProxy()) {
			InternalEObject oldBookingBy = (InternalEObject) bookingBy;
			bookingBy = (Customer) eResolveProxy(oldBookingBy);
			if (bookingBy != oldBookingBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.BOOKING__BOOKING_BY,
							oldBookingBy, bookingBy));
			}
		}
		return bookingBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetBookingBy() {
		return bookingBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingBy(Customer newBookingBy) {
		Customer oldBookingBy = bookingBy;
		bookingBy = newBookingBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__BOOKING_BY, oldBookingBy,
					bookingBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Review> getHasReviews() {
		if (hasReviews == null) {
			hasReviews = new EObjectResolvingEList<Review>(Review.class, this, Hw1Package.BOOKING__HAS_REVIEWS);
		}
		return hasReviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingType() {
		return bookingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingType(String newBookingType) {
		String oldBookingType = bookingType;
		bookingType = newBookingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__BOOKING_TYPE, oldBookingType,
					bookingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue getHostedAt() {
		if (hostedAt != null && hostedAt.eIsProxy()) {
			InternalEObject oldHostedAt = (InternalEObject) hostedAt;
			hostedAt = (Venue) eResolveProxy(oldHostedAt);
			if (hostedAt != oldHostedAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.BOOKING__HOSTED_AT,
							oldHostedAt, hostedAt));
			}
		}
		return hostedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue basicGetHostedAt() {
		return hostedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostedAt(Venue newHostedAt, NotificationChain msgs) {
		Venue oldHostedAt = hostedAt;
		hostedAt = newHostedAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.BOOKING__HOSTED_AT, oldHostedAt, newHostedAt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostedAt(Venue newHostedAt) {
		if (newHostedAt != hostedAt) {
			NotificationChain msgs = null;
			if (hostedAt != null)
				msgs = ((InternalEObject) hostedAt).eInverseRemove(this, Hw1Package.VENUE__BOOKINGS, Venue.class, msgs);
			if (newHostedAt != null)
				msgs = ((InternalEObject) newHostedAt).eInverseAdd(this, Hw1Package.VENUE__BOOKINGS, Venue.class, msgs);
			msgs = basicSetHostedAt(newHostedAt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__HOSTED_AT, newHostedAt,
					newHostedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewBookingInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.BOOKING__HOSTED_AT:
			if (hostedAt != null)
				msgs = ((InternalEObject) hostedAt).eInverseRemove(this, Hw1Package.VENUE__BOOKINGS, Venue.class, msgs);
			return basicSetHostedAt((Venue) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.BOOKING__HOSTED_AT:
			return basicSetHostedAt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case Hw1Package.BOOKING__BOOKING_BY:
			if (resolve)
				return getBookingBy();
			return basicGetBookingBy();
		case Hw1Package.BOOKING__HAS_REVIEWS:
			return getHasReviews();
		case Hw1Package.BOOKING__BOOKING_TYPE:
			return getBookingType();
		case Hw1Package.BOOKING__HOSTED_AT:
			if (resolve)
				return getHostedAt();
			return basicGetHostedAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
		case Hw1Package.BOOKING__BOOKING_BY:
			setBookingBy((Customer) newValue);
			return;
		case Hw1Package.BOOKING__HAS_REVIEWS:
			getHasReviews().clear();
			getHasReviews().addAll((Collection<? extends Review>) newValue);
			return;
		case Hw1Package.BOOKING__BOOKING_TYPE:
			setBookingType((String) newValue);
			return;
		case Hw1Package.BOOKING__HOSTED_AT:
			setHostedAt((Venue) newValue);
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
		case Hw1Package.BOOKING__BOOKING_BY:
			setBookingBy((Customer) null);
			return;
		case Hw1Package.BOOKING__HAS_REVIEWS:
			getHasReviews().clear();
			return;
		case Hw1Package.BOOKING__BOOKING_TYPE:
			setBookingType(BOOKING_TYPE_EDEFAULT);
			return;
		case Hw1Package.BOOKING__HOSTED_AT:
			setHostedAt((Venue) null);
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
		case Hw1Package.BOOKING__BOOKING_BY:
			return bookingBy != null;
		case Hw1Package.BOOKING__HAS_REVIEWS:
			return hasReviews != null && !hasReviews.isEmpty();
		case Hw1Package.BOOKING__BOOKING_TYPE:
			return BOOKING_TYPE_EDEFAULT == null ? bookingType != null : !BOOKING_TYPE_EDEFAULT.equals(bookingType);
		case Hw1Package.BOOKING__HOSTED_AT:
			return hostedAt != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.BOOKING___VIEW_BOOKING_INFO:
			viewBookingInfo();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", BookingType: ");
		result.append(bookingType);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
