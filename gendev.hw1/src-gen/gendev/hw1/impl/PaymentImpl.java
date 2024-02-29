/**
 */
package gendev.hw1.impl;

import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Package;
import gendev.hw1.Payment;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaidFor <em>Paid For</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaymentID <em>Payment ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getAmountRefunded <em>Amount Refunded</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_PAID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected int amountPaid = AMOUNT_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected String paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaidFor() <em>Paid For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidFor()
	 * @generated
	 * @ordered
	 */
	protected EventBooking paidFor;

	/**
	 * The default value of the '{@link #getPaymentID() <em>Payment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentID()
	 * @generated
	 * @ordered
	 */
	protected static final int PAYMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPaymentID() <em>Payment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentID()
	 * @generated
	 * @ordered
	 */
	protected int paymentID = PAYMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountRefunded() <em>Amount Refunded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRefunded()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_REFUNDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountRefunded() <em>Amount Refunded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRefunded()
	 * @generated
	 * @ordered
	 */
	protected int amountRefunded = AMOUNT_REFUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected String paymentType = PAYMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountPaid() {
		return amountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountPaid(int newAmountPaid) {
		int oldAmountPaid = amountPaid;
		amountPaid = newAmountPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__AMOUNT_PAID, oldAmountPaid,
					amountPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMethod(String newPaymentMethod) {
		String oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAYMENT_METHOD, oldPaymentMethod,
					paymentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(String newPaymentStatus) {
		String oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAYMENT_STATUS, oldPaymentStatus,
					paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBooking getPaidFor() {
		if (paidFor != null && paidFor.eIsProxy()) {
			InternalEObject oldPaidFor = (InternalEObject) paidFor;
			paidFor = (EventBooking) eResolveProxy(oldPaidFor);
			if (paidFor != oldPaidFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.PAYMENT__PAID_FOR, oldPaidFor,
							paidFor));
			}
		}
		return paidFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBooking basicGetPaidFor() {
		return paidFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaidFor(EventBooking newPaidFor) {
		EventBooking oldPaidFor = paidFor;
		paidFor = newPaidFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAID_FOR, oldPaidFor, paidFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPaymentID() {
		return paymentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentID(int newPaymentID) {
		int oldPaymentID = paymentID;
		paymentID = newPaymentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAYMENT_ID, oldPaymentID,
					paymentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountRefunded() {
		return amountRefunded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountRefunded(int newAmountRefunded) {
		int oldAmountRefunded = amountRefunded;
		amountRefunded = newAmountRefunded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__AMOUNT_REFUNDED,
					oldAmountRefunded, amountRefunded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentType(String newPaymentType) {
		String oldPaymentType = paymentType;
		paymentType = newPaymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAYMENT_TYPE, oldPaymentType,
					paymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processPayment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refundPayment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendPaymenyReceiptEmail() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PAYMENT__AMOUNT_PAID:
			return getAmountPaid();
		case Hw1Package.PAYMENT__PAYMENT_METHOD:
			return getPaymentMethod();
		case Hw1Package.PAYMENT__PAYMENT_STATUS:
			return getPaymentStatus();
		case Hw1Package.PAYMENT__PAID_FOR:
			if (resolve)
				return getPaidFor();
			return basicGetPaidFor();
		case Hw1Package.PAYMENT__PAYMENT_ID:
			return getPaymentID();
		case Hw1Package.PAYMENT__AMOUNT_REFUNDED:
			return getAmountRefunded();
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			return getPaymentType();
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
		case Hw1Package.PAYMENT__AMOUNT_PAID:
			setAmountPaid((Integer) newValue);
			return;
		case Hw1Package.PAYMENT__PAYMENT_METHOD:
			setPaymentMethod((String) newValue);
			return;
		case Hw1Package.PAYMENT__PAYMENT_STATUS:
			setPaymentStatus((String) newValue);
			return;
		case Hw1Package.PAYMENT__PAID_FOR:
			setPaidFor((EventBooking) newValue);
			return;
		case Hw1Package.PAYMENT__PAYMENT_ID:
			setPaymentID((Integer) newValue);
			return;
		case Hw1Package.PAYMENT__AMOUNT_REFUNDED:
			setAmountRefunded((Integer) newValue);
			return;
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			setPaymentType((String) newValue);
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
		case Hw1Package.PAYMENT__AMOUNT_PAID:
			setAmountPaid(AMOUNT_PAID_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__PAYMENT_METHOD:
			setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__PAYMENT_STATUS:
			setPaymentStatus(PAYMENT_STATUS_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__PAID_FOR:
			setPaidFor((EventBooking) null);
			return;
		case Hw1Package.PAYMENT__PAYMENT_ID:
			setPaymentID(PAYMENT_ID_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__AMOUNT_REFUNDED:
			setAmountRefunded(AMOUNT_REFUNDED_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			setPaymentType(PAYMENT_TYPE_EDEFAULT);
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
		case Hw1Package.PAYMENT__AMOUNT_PAID:
			return amountPaid != AMOUNT_PAID_EDEFAULT;
		case Hw1Package.PAYMENT__PAYMENT_METHOD:
			return PAYMENT_METHOD_EDEFAULT == null ? paymentMethod != null
					: !PAYMENT_METHOD_EDEFAULT.equals(paymentMethod);
		case Hw1Package.PAYMENT__PAYMENT_STATUS:
			return PAYMENT_STATUS_EDEFAULT == null ? paymentStatus != null
					: !PAYMENT_STATUS_EDEFAULT.equals(paymentStatus);
		case Hw1Package.PAYMENT__PAID_FOR:
			return paidFor != null;
		case Hw1Package.PAYMENT__PAYMENT_ID:
			return paymentID != PAYMENT_ID_EDEFAULT;
		case Hw1Package.PAYMENT__AMOUNT_REFUNDED:
			return amountRefunded != AMOUNT_REFUNDED_EDEFAULT;
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			return PAYMENT_TYPE_EDEFAULT == null ? paymentType != null : !PAYMENT_TYPE_EDEFAULT.equals(paymentType);
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
		case Hw1Package.PAYMENT___PROCESS_PAYMENT:
			processPayment();
			return null;
		case Hw1Package.PAYMENT___REFUND_PAYMENT:
			refundPayment();
			return null;
		case Hw1Package.PAYMENT___SEND_PAYMENY_RECEIPT_EMAIL:
			sendPaymenyReceiptEmail();
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
		result.append(" (AmountPaid: ");
		result.append(amountPaid);
		result.append(", PaymentMethod: ");
		result.append(paymentMethod);
		result.append(", PaymentStatus: ");
		result.append(paymentStatus);
		result.append(", PaymentID: ");
		result.append(paymentID);
		result.append(", AmountRefunded: ");
		result.append(amountRefunded);
		result.append(", PaymentType: ");
		result.append(paymentType);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
