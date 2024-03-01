/**
 */
package gendev.hw1.impl;

import gendev.hw1.Customer;
import gendev.hw1.Hw1Package;
import gendev.hw1.Review;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getCustomerBookingID <em>Customer Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getSubmits <em>Submits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerBookingID() <em>Customer Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerBookingID() <em>Customer Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerBookingID()
	 * @generated
	 * @ordered
	 */
	protected int customerBookingID = CUSTOMER_BOOKING_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubmits() <em>Submits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmits()
	 * @generated
	 * @ordered
	 */
	protected Review submits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerBookingID() {
		return customerBookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerBookingID(int newCustomerBookingID) {
		int oldCustomerBookingID = customerBookingID;
		customerBookingID = newCustomerBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID,
					oldCustomerBookingID, customerBookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Review getSubmits() {
		return submits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmits(Review newSubmits, NotificationChain msgs) {
		Review oldSubmits = submits;
		submits = newSubmits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__SUBMITS,
					oldSubmits, newSubmits);
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
	public void setSubmits(Review newSubmits) {
		if (newSubmits != submits) {
			NotificationChain msgs = null;
			if (submits != null)
				msgs = ((InternalEObject) submits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__SUBMITS, null, msgs);
			if (newSubmits != null)
				msgs = ((InternalEObject) newSubmits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__SUBMITS, null, msgs);
			msgs = basicSetSubmits(newSubmits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__SUBMITS, newSubmits,
					newSubmits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void submitReview() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Customer!submitReview()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Customer!createBooking()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Customer!cancelBooking()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.CUSTOMER__SUBMITS:
			return basicSetSubmits(null, msgs);
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
		case Hw1Package.CUSTOMER__NAME:
			return getName();
		case Hw1Package.CUSTOMER__EMAIL:
			return getEmail();
		case Hw1Package.CUSTOMER__PHONE:
			return getPhone();
		case Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID:
			return getCustomerBookingID();
		case Hw1Package.CUSTOMER__SUBMITS:
			return getSubmits();
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
		case Hw1Package.CUSTOMER__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.CUSTOMER__EMAIL:
			setEmail((String) newValue);
			return;
		case Hw1Package.CUSTOMER__PHONE:
			setPhone((String) newValue);
			return;
		case Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID:
			setCustomerBookingID((Integer) newValue);
			return;
		case Hw1Package.CUSTOMER__SUBMITS:
			setSubmits((Review) newValue);
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
		case Hw1Package.CUSTOMER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__PHONE:
			setPhone(PHONE_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID:
			setCustomerBookingID(CUSTOMER_BOOKING_ID_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__SUBMITS:
			setSubmits((Review) null);
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
		case Hw1Package.CUSTOMER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.CUSTOMER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case Hw1Package.CUSTOMER__PHONE:
			return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
		case Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID:
			return customerBookingID != CUSTOMER_BOOKING_ID_EDEFAULT;
		case Hw1Package.CUSTOMER__SUBMITS:
			return submits != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.CUSTOMER___SUBMIT_REVIEW:
			submitReview();
			return null;
		case Hw1Package.CUSTOMER___CREATE_BOOKING:
			createBooking();
			return null;
		case Hw1Package.CUSTOMER___CANCEL_BOOKING:
			cancelBooking();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Email: ");
		result.append(email);
		result.append(", Phone: ");
		result.append(phone);
		result.append(", CustomerBookingID: ");
		result.append(customerBookingID);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
