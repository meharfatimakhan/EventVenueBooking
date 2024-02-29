/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.MenuTastingBooking;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Tasting Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.MenuTastingBookingImpl#getMenuTastingVisitID <em>Menu Tasting Visit ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuTastingBookingImpl extends BookingImpl implements MenuTastingBooking {
	/**
	 * The default value of the '{@link #getMenuTastingVisitID() <em>Menu Tasting Visit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuTastingVisitID()
	 * @generated
	 * @ordered
	 */
	protected static final String MENU_TASTING_VISIT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMenuTastingVisitID() <em>Menu Tasting Visit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuTastingVisitID()
	 * @generated
	 * @ordered
	 */
	protected String menuTastingVisitID = MENU_TASTING_VISIT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuTastingBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.MENU_TASTING_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMenuTastingVisitID() {
		return menuTastingVisitID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuTastingVisitID(String newMenuTastingVisitID) {
		String oldMenuTastingVisitID = menuTastingVisitID;
		menuTastingVisitID = newMenuTastingVisitID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Hw1Package.MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID, oldMenuTastingVisitID, menuTastingVisitID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendMenuTastingVisitEmail() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!MenuTastingBooking!sendMenuTastingVisitEmail()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID:
			return getMenuTastingVisitID();
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
		case Hw1Package.MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID:
			setMenuTastingVisitID((String) newValue);
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
		case Hw1Package.MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID:
			setMenuTastingVisitID(MENU_TASTING_VISIT_ID_EDEFAULT);
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
		case Hw1Package.MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID:
			return MENU_TASTING_VISIT_ID_EDEFAULT == null ? menuTastingVisitID != null
					: !MENU_TASTING_VISIT_ID_EDEFAULT.equals(menuTastingVisitID);
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
		case Hw1Package.MENU_TASTING_BOOKING___SEND_MENU_TASTING_VISIT_EMAIL:
			sendMenuTastingVisitEmail();
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
		result.append(" (MenuTastingVisitID: ");
		result.append(menuTastingVisitID);
		result.append(')');
		return result.toString();
	}

} //MenuTastingBookingImpl
