/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.VenueVisitBooking;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link gendev.hw1.impl.VenueVisitBookingImpl#getVisitID <em>Visit ID</em>}</li>
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
	 * The default value of the '{@link #getVisitID() <em>Visit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitID()
	 * @generated
	 * @ordered
	 */
	protected static final int VISIT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVisitID() <em>Visit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitID()
	 * @generated
	 * @ordered
	 */
	protected int visitID = VISIT_ID_EDEFAULT;

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
	public int getVisitID() {
		return visitID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitID(int newVisitID) {
		int oldVisitID = visitID;
		visitID = newVisitID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE_VISIT_BOOKING__VISIT_ID, oldVisitID,
					visitID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendVenueVisitBookingEmail() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!VenueVisitBooking!sendVenueVisitBookingEmail()
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_ID:
			return getVisitID();
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_ID:
			setVisitID((Integer) newValue);
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_ID:
			setVisitID(VISIT_ID_EDEFAULT);
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
		case Hw1Package.VENUE_VISIT_BOOKING__VISIT_ID:
			return visitID != VISIT_ID_EDEFAULT;
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
		case Hw1Package.VENUE_VISIT_BOOKING___SEND_VENUE_VISIT_BOOKING_EMAIL:
			sendVenueVisitBookingEmail();
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
		result.append(" (VisitPurpose: ");
		result.append(visitPurpose);
		result.append(", VisitID: ");
		result.append(visitID);
		result.append(')');
		return result.toString();
	}

} //VenueVisitBookingImpl
