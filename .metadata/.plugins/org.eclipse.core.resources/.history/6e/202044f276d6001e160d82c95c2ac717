/**
 */
package gendev.hw1.impl;

import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Package;
import gendev.hw1.Payment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.EventBookingImpl#getEstimatedPriceQuote <em>Estimated Price Quote</em>}</li>
 *   <li>{@link gendev.hw1.impl.EventBookingImpl#getMade_for <em>Made for</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventBookingImpl extends BookingImpl implements EventBooking {
	/**
	 * The default value of the '{@link #getEstimatedPriceQuote() <em>Estimated Price Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedPriceQuote()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTIMATED_PRICE_QUOTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEstimatedPriceQuote() <em>Estimated Price Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedPriceQuote()
	 * @generated
	 * @ordered
	 */
	protected int estimatedPriceQuote = ESTIMATED_PRICE_QUOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMade_for() <em>Made for</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMade_for()
	 * @generated
	 * @ordered
	 */
	protected Payment made_for;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.EVENT_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstimatedPriceQuote() {
		return estimatedPriceQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedPriceQuote(int newEstimatedPriceQuote) {
		int oldEstimatedPriceQuote = estimatedPriceQuote;
		estimatedPriceQuote = newEstimatedPriceQuote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.EVENT_BOOKING__ESTIMATED_PRICE_QUOTE,
					oldEstimatedPriceQuote, estimatedPriceQuote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment getMade_for() {
		return made_for;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMade_for(Payment newMade_for, NotificationChain msgs) {
		Payment oldMade_for = made_for;
		made_for = newMade_for;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.EVENT_BOOKING__MADE_FOR, oldMade_for, newMade_for);
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
	public void setMade_for(Payment newMade_for) {
		if (newMade_for != made_for) {
			NotificationChain msgs = null;
			if (made_for != null)
				msgs = ((InternalEObject) made_for).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.EVENT_BOOKING__MADE_FOR, null, msgs);
			if (newMade_for != null)
				msgs = ((InternalEObject) newMade_for).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.EVENT_BOOKING__MADE_FOR, null, msgs);
			msgs = basicSetMade_for(newMade_for, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.EVENT_BOOKING__MADE_FOR, newMade_for,
					newMade_for));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.EVENT_BOOKING__MADE_FOR:
			return basicSetMade_for(null, msgs);
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
		case Hw1Package.EVENT_BOOKING__ESTIMATED_PRICE_QUOTE:
			return getEstimatedPriceQuote();
		case Hw1Package.EVENT_BOOKING__MADE_FOR:
			return getMade_for();
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
		case Hw1Package.EVENT_BOOKING__ESTIMATED_PRICE_QUOTE:
			setEstimatedPriceQuote((Integer) newValue);
			return;
		case Hw1Package.EVENT_BOOKING__MADE_FOR:
			setMade_for((Payment) newValue);
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
		case Hw1Package.EVENT_BOOKING__ESTIMATED_PRICE_QUOTE:
			setEstimatedPriceQuote(ESTIMATED_PRICE_QUOTE_EDEFAULT);
			return;
		case Hw1Package.EVENT_BOOKING__MADE_FOR:
			setMade_for((Payment) null);
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
		case Hw1Package.EVENT_BOOKING__ESTIMATED_PRICE_QUOTE:
			return estimatedPriceQuote != ESTIMATED_PRICE_QUOTE_EDEFAULT;
		case Hw1Package.EVENT_BOOKING__MADE_FOR:
			return made_for != null;
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
		result.append(" (EstimatedPriceQuote: ");
		result.append(estimatedPriceQuote);
		result.append(')');
		return result.toString();
	}

} //EventBookingImpl
