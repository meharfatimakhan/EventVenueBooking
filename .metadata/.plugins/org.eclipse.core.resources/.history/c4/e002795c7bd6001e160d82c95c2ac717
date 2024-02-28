/**
 */
package gendev.hw1.impl;

import gendev.hw1.Booking;
import gendev.hw1.BookingAgent;
import gendev.hw1.Customer;
import gendev.hw1.Hw1Package;

import gendev.hw1.Review;
import gendev.hw1.Venue;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link gendev.hw1.impl.BookingImpl#getMadeBy <em>Made By</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getApprovedBookings <em>Approved Bookings</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getHosted_at <em>Hosted at</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingImpl#getCanHave <em>Can Have</em>}</li>
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
	 * The cached value of the '{@link #getMadeBy() <em>Made By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMadeBy()
	 * @generated
	 * @ordered
	 */
	protected Customer madeBy;

	/**
	 * The cached value of the '{@link #getApprovedBookings() <em>Approved Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingAgent> approvedBookings;

	/**
	 * The cached value of the '{@link #getHosted_at() <em>Hosted at</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosted_at()
	 * @generated
	 * @ordered
	 */
	protected Venue hosted_at;

	/**
	 * The cached value of the '{@link #getCanHave() <em>Can Have</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanHave()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> canHave;

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
	public Customer getMadeBy() {
		if (madeBy != null && madeBy.eIsProxy()) {
			InternalEObject oldMadeBy = (InternalEObject) madeBy;
			madeBy = (Customer) eResolveProxy(oldMadeBy);
			if (madeBy != oldMadeBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.BOOKING__MADE_BY, oldMadeBy,
							madeBy));
			}
		}
		return madeBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetMadeBy() {
		return madeBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMadeBy(Customer newMadeBy) {
		Customer oldMadeBy = madeBy;
		madeBy = newMadeBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__MADE_BY, oldMadeBy, madeBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingAgent> getApprovedBookings() {
		if (approvedBookings == null) {
			approvedBookings = new EObjectWithInverseResolvingEList<BookingAgent>(BookingAgent.class, this,
					Hw1Package.BOOKING__APPROVED_BOOKINGS, Hw1Package.BOOKING_AGENT__APPROVED_BY);
		}
		return approvedBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue getHosted_at() {
		if (hosted_at != null && hosted_at.eIsProxy()) {
			InternalEObject oldHosted_at = (InternalEObject) hosted_at;
			hosted_at = (Venue) eResolveProxy(oldHosted_at);
			if (hosted_at != oldHosted_at) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.BOOKING__HOSTED_AT,
							oldHosted_at, hosted_at));
			}
		}
		return hosted_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue basicGetHosted_at() {
		return hosted_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHosted_at(Venue newHosted_at) {
		Venue oldHosted_at = hosted_at;
		hosted_at = newHosted_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING__HOSTED_AT, oldHosted_at,
					hosted_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Review> getCanHave() {
		if (canHave == null) {
			canHave = new EObjectResolvingEList<Review>(Review.class, this, Hw1Package.BOOKING__CAN_HAVE);
		}
		return canHave;
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
		case Hw1Package.BOOKING__APPROVED_BOOKINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getApprovedBookings()).basicAdd(otherEnd, msgs);
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
		case Hw1Package.BOOKING__APPROVED_BOOKINGS:
			return ((InternalEList<?>) getApprovedBookings()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.BOOKING__MADE_BY:
			if (resolve)
				return getMadeBy();
			return basicGetMadeBy();
		case Hw1Package.BOOKING__APPROVED_BOOKINGS:
			return getApprovedBookings();
		case Hw1Package.BOOKING__HOSTED_AT:
			if (resolve)
				return getHosted_at();
			return basicGetHosted_at();
		case Hw1Package.BOOKING__CAN_HAVE:
			return getCanHave();
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
		case Hw1Package.BOOKING__MADE_BY:
			setMadeBy((Customer) newValue);
			return;
		case Hw1Package.BOOKING__APPROVED_BOOKINGS:
			getApprovedBookings().clear();
			getApprovedBookings().addAll((Collection<? extends BookingAgent>) newValue);
			return;
		case Hw1Package.BOOKING__HOSTED_AT:
			setHosted_at((Venue) newValue);
			return;
		case Hw1Package.BOOKING__CAN_HAVE:
			getCanHave().clear();
			getCanHave().addAll((Collection<? extends Review>) newValue);
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
		case Hw1Package.BOOKING__MADE_BY:
			setMadeBy((Customer) null);
			return;
		case Hw1Package.BOOKING__APPROVED_BOOKINGS:
			getApprovedBookings().clear();
			return;
		case Hw1Package.BOOKING__HOSTED_AT:
			setHosted_at((Venue) null);
			return;
		case Hw1Package.BOOKING__CAN_HAVE:
			getCanHave().clear();
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
		case Hw1Package.BOOKING__MADE_BY:
			return madeBy != null;
		case Hw1Package.BOOKING__APPROVED_BOOKINGS:
			return approvedBookings != null && !approvedBookings.isEmpty();
		case Hw1Package.BOOKING__HOSTED_AT:
			return hosted_at != null;
		case Hw1Package.BOOKING__CAN_HAVE:
			return canHave != null && !canHave.isEmpty();
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
