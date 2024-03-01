/**
 */
package gendev.hw1.impl;

import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Package;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link gendev.hw1.impl.EventBookingImpl#getEventDescription <em>Event Description</em>}</li>
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.EVENT_BOOKING__EVENT_DESCRIPTION,
					oldEventDescription, eventDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculateFinalPrice() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!EventBooking!calculateFinalPrice()
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
		case Hw1Package.EVENT_BOOKING__EVENT_DESCRIPTION:
			return getEventDescription();
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
		case Hw1Package.EVENT_BOOKING__EVENT_DESCRIPTION:
			setEventDescription((String) newValue);
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
		case Hw1Package.EVENT_BOOKING__EVENT_DESCRIPTION:
			setEventDescription(EVENT_DESCRIPTION_EDEFAULT);
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
		case Hw1Package.EVENT_BOOKING__EVENT_DESCRIPTION:
			return EVENT_DESCRIPTION_EDEFAULT == null ? eventDescription != null
					: !EVENT_DESCRIPTION_EDEFAULT.equals(eventDescription);
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
		case Hw1Package.EVENT_BOOKING___CALCULATE_FINAL_PRICE:
			calculateFinalPrice();
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
		result.append(" (EstimatedPriceQuote: ");
		result.append(estimatedPriceQuote);
		result.append(", EventDescription: ");
		result.append(eventDescription);
		result.append(')');
		return result.toString();
	}

} //EventBookingImpl
