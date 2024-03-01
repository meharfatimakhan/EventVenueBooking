/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.SystemAdmin;
import gendev.hw1.Venue;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.SystemAdminImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link gendev.hw1.impl.SystemAdminImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gendev.hw1.impl.SystemAdminImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.SystemAdminImpl#getVenuesManaged <em>Venues Managed</em>}</li>
 *   <li>{@link gendev.hw1.impl.SystemAdminImpl#getAdminID <em>Admin ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAdminImpl extends MinimalEObjectImpl.Container implements SystemAdmin {
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
	 * The cached value of the '{@link #getVenuesManaged() <em>Venues Managed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenuesManaged()
	 * @generated
	 * @ordered
	 */
	protected EList<Venue> venuesManaged;

	/**
	 * The default value of the '{@link #getAdminID() <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminID()
	 * @generated
	 * @ordered
	 */
	protected static final int ADMIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdminID() <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminID()
	 * @generated
	 * @ordered
	 */
	protected int adminID = ADMIN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.SYSTEM_ADMIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.SYSTEM_ADMIN__PHONE, oldPhone, phone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.SYSTEM_ADMIN__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.SYSTEM_ADMIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Venue> getVenuesManaged() {
		if (venuesManaged == null) {
			venuesManaged = new EObjectContainmentEList<Venue>(Venue.class, this,
					Hw1Package.SYSTEM_ADMIN__VENUES_MANAGED);
		}
		return venuesManaged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdminID() {
		return adminID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminID(int newAdminID) {
		int oldAdminID = adminID;
		adminID = newAdminID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.SYSTEM_ADMIN__ADMIN_ID, oldAdminID,
					adminID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.SYSTEM_ADMIN__VENUES_MANAGED:
			return ((InternalEList<?>) getVenuesManaged()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.SYSTEM_ADMIN__PHONE:
			return getPhone();
		case Hw1Package.SYSTEM_ADMIN__EMAIL:
			return getEmail();
		case Hw1Package.SYSTEM_ADMIN__NAME:
			return getName();
		case Hw1Package.SYSTEM_ADMIN__VENUES_MANAGED:
			return getVenuesManaged();
		case Hw1Package.SYSTEM_ADMIN__ADMIN_ID:
			return getAdminID();
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
		case Hw1Package.SYSTEM_ADMIN__PHONE:
			setPhone((String) newValue);
			return;
		case Hw1Package.SYSTEM_ADMIN__EMAIL:
			setEmail((String) newValue);
			return;
		case Hw1Package.SYSTEM_ADMIN__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.SYSTEM_ADMIN__VENUES_MANAGED:
			getVenuesManaged().clear();
			getVenuesManaged().addAll((Collection<? extends Venue>) newValue);
			return;
		case Hw1Package.SYSTEM_ADMIN__ADMIN_ID:
			setAdminID((Integer) newValue);
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
		case Hw1Package.SYSTEM_ADMIN__PHONE:
			setPhone(PHONE_EDEFAULT);
			return;
		case Hw1Package.SYSTEM_ADMIN__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case Hw1Package.SYSTEM_ADMIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.SYSTEM_ADMIN__VENUES_MANAGED:
			getVenuesManaged().clear();
			return;
		case Hw1Package.SYSTEM_ADMIN__ADMIN_ID:
			setAdminID(ADMIN_ID_EDEFAULT);
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
		case Hw1Package.SYSTEM_ADMIN__PHONE:
			return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
		case Hw1Package.SYSTEM_ADMIN__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case Hw1Package.SYSTEM_ADMIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.SYSTEM_ADMIN__VENUES_MANAGED:
			return venuesManaged != null && !venuesManaged.isEmpty();
		case Hw1Package.SYSTEM_ADMIN__ADMIN_ID:
			return adminID != ADMIN_ID_EDEFAULT;
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
		result.append(" (Phone: ");
		result.append(phone);
		result.append(", Email: ");
		result.append(email);
		result.append(", Name: ");
		result.append(name);
		result.append(", AdminID: ");
		result.append(adminID);
		result.append(')');
		return result.toString();
	}

} //SystemAdminImpl
