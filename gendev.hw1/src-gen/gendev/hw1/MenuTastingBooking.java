/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Tasting Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.MenuTastingBooking#getMenuOptions <em>Menu Options</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getMenuTastingBooking()
 * @model
 * @generated
 */
public interface MenuTastingBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Menu Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Options</em>' attribute.
	 * @see #setMenuOptions(EList)
	 * @see gendev.hw1.Hw1Package#getMenuTastingBooking_MenuOptions()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getMenuOptions();

	/**
	 * Sets the value of the '{@link gendev.hw1.MenuTastingBooking#getMenuOptions <em>Menu Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Options</em>' attribute.
	 * @see #getMenuOptions()
	 * @generated
	 */
	void setMenuOptions(EList<?> value);

} // MenuTastingBooking
