/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.VenueVisitBooking;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Venue Visit Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.VenueVisitBookingImpl#getVisitPurpose <em>Visit Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VenueVisitBookingImpl extends BookingImpl implements VenueVisitBooking {
	/**
	 * The default value of the '{@link #getVisitPurpose() <em>Visit Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitPurpose() <em>Visit Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitPurpose()
	 * @generated
	 * @ordered
	 */
	protected String visitPurpose = VISIT_PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenueVisitBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.VENUE_VISIT_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisitPurpose() {
		return visitPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitPurpose(String newVisitPurpose) {
		String oldVisitPurpose = visitPurpose;
		visitPurpose = newVisitPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE_VISIT_BOOKING__VISIT_PURPOSE,
					oldVisitPurpose, visitPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_PURPOSE:
			return getVisitPurpose();
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_PURPOSE:
			setVisitPurpose((String) newValue);
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_PURPOSE:
			setVisitPurpose(VISIT_PURPOSE_EDEFAULT);
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_PURPOSE:
			return VISIT_PURPOSE_EDEFAULT == null ? visitPurpose != null : !VISIT_PURPOSE_EDEFAULT.equals(visitPurpose);
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
		result.append(" (VisitPurpose: ");
		result.append(visitPurpose);
		result.append(')');
		return result.toString();
	}

} //VenueVisitBookingImpl
