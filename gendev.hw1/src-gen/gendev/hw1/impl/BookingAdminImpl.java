/**
 */
package gendev.hw1.impl;

import gendev.hw1.BookingAdmin;
import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BookingAdminImpl#getApprovedBookings <em>Approved Bookings</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingAdminImpl#getApprovalRate <em>Approval Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingAdminImpl extends SystemAdminImpl implements BookingAdmin {
	/**
	 * The cached value of the '{@link #getApprovedBookings() <em>Approved Bookings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedBookings()
	 * @generated
	 * @ordered
	 */
	protected EventBooking approvedBookings;

	/**
	 * The default value of the '{@link #getApprovalRate() <em>Approval Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalRate()
	 * @generated
	 * @ordered
	 */
	protected static final double APPROVAL_RATE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getApprovalRate() <em>Approval Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalRate()
	 * @generated
	 * @ordered
	 */
	protected double approvalRate = APPROVAL_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BOOKING_ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBooking getApprovedBookings() {
		if (approvedBookings != null && approvedBookings.eIsProxy()) {
			InternalEObject oldApprovedBookings = (InternalEObject) approvedBookings;
			approvedBookings = (EventBooking) eResolveProxy(oldApprovedBookings);
			if (approvedBookings != oldApprovedBookings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS, oldApprovedBookings, approvedBookings));
			}
		}
		return approvedBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBooking basicGetApprovedBookings() {
		return approvedBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovedBookings(EventBooking newApprovedBookings, NotificationChain msgs) {
		EventBooking oldApprovedBookings = approvedBookings;
		approvedBookings = newApprovedBookings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS, oldApprovedBookings, newApprovedBookings);
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
	public void setApprovedBookings(EventBooking newApprovedBookings) {
		if (newApprovedBookings != approvedBookings) {
			NotificationChain msgs = null;
			if (approvedBookings != null)
				msgs = ((InternalEObject) approvedBookings).eInverseRemove(this, Hw1Package.EVENT_BOOKING__APPROVED_BY,
						EventBooking.class, msgs);
			if (newApprovedBookings != null)
				msgs = ((InternalEObject) newApprovedBookings).eInverseAdd(this, Hw1Package.EVENT_BOOKING__APPROVED_BY,
						EventBooking.class, msgs);
			msgs = basicSetApprovedBookings(newApprovedBookings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS,
					newApprovedBookings, newApprovedBookings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApprovalRate() {
		return approvalRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalRate(double newApprovalRate) {
		double oldApprovalRate = approvalRate;
		approvalRate = newApprovalRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING_ADMIN__APPROVAL_RATE,
					oldApprovalRate, approvalRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			if (approvedBookings != null)
				msgs = ((InternalEObject) approvedBookings).eInverseRemove(this, Hw1Package.EVENT_BOOKING__APPROVED_BY,
						EventBooking.class, msgs);
			return basicSetApprovedBookings((EventBooking) otherEnd, msgs);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			return basicSetApprovedBookings(null, msgs);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			if (resolve)
				return getApprovedBookings();
			return basicGetApprovedBookings();
		case Hw1Package.BOOKING_ADMIN__APPROVAL_RATE:
			return getApprovalRate();
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			setApprovedBookings((EventBooking) newValue);
			return;
		case Hw1Package.BOOKING_ADMIN__APPROVAL_RATE:
			setApprovalRate((Double) newValue);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			setApprovedBookings((EventBooking) null);
			return;
		case Hw1Package.BOOKING_ADMIN__APPROVAL_RATE:
			setApprovalRate(APPROVAL_RATE_EDEFAULT);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			return approvedBookings != null;
		case Hw1Package.BOOKING_ADMIN__APPROVAL_RATE:
			return approvalRate != APPROVAL_RATE_EDEFAULT;
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
		result.append(" (approvalRate: ");
		result.append(approvalRate);
		result.append(')');
		return result.toString();
	}

} //BookingAdminImpl
