/**
 */
package gendev.hw1.impl;

import gendev.hw1.Customer;
import gendev.hw1.Hw1Package;
import gendev.hw1.Review;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	protected static final int PHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected int phone = PHONE_EDEFAULT;

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
	 * The cached value of the '{@link #getSubmits() <em>Submits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmits()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> submits;

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
	public int getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(int newPhone) {
		int oldPhone = phone;
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
	public EList<Review> getSubmits() {
		if (submits == null) {
			submits = new EObjectWithInverseResolvingEList<Review>(Review.class, this, Hw1Package.CUSTOMER__SUBMITS,
					Hw1Package.REVIEW__SUBMITTED_BY);
		}
		return submits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void submitReview() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking() {
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
		case Hw1Package.CUSTOMER__SUBMITS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubmits()).basicAdd(otherEnd, msgs);
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
		case Hw1Package.CUSTOMER__SUBMITS:
			return ((InternalEList<?>) getSubmits()).basicRemove(otherEnd, msgs);
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
			setPhone((Integer) newValue);
			return;
		case Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID:
			setCustomerBookingID((Integer) newValue);
			return;
		case Hw1Package.CUSTOMER__SUBMITS:
			getSubmits().clear();
			getSubmits().addAll((Collection<? extends Review>) newValue);
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
			getSubmits().clear();
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
			return phone != PHONE_EDEFAULT;
		case Hw1Package.CUSTOMER__CUSTOMER_BOOKING_ID:
			return customerBookingID != CUSTOMER_BOOKING_ID_EDEFAULT;
		case Hw1Package.CUSTOMER__SUBMITS:
			return submits != null && !submits.isEmpty();
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
