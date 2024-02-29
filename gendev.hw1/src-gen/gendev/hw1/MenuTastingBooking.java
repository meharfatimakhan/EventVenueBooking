/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Tasting Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.MenuTastingBooking#getMenuTastingVisitID <em>Menu Tasting Visit ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getMenuTastingBooking()
 * @model
 * @generated
 */
public interface MenuTastingBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Menu Tasting Visit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Tasting Visit ID</em>' attribute.
	 * @see #setMenuTastingVisitID(String)
	 * @see gendev.hw1.Hw1Package#getMenuTastingBooking_MenuTastingVisitID()
	 * @model
	 * @generated
	 */
	String getMenuTastingVisitID();

	/**
	 * Sets the value of the '{@link gendev.hw1.MenuTastingBooking#getMenuTastingVisitID <em>Menu Tasting Visit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Tasting Visit ID</em>' attribute.
	 * @see #getMenuTastingVisitID()
	 * @generated
	 */
	void setMenuTastingVisitID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendMenuTastingVisitEmail();

} // MenuTastingBooking
