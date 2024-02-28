/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.SystemAdmin#getPhone <em>Phone</em>}</li>
 *   <li>{@link gendev.hw1.SystemAdmin#getEmail <em>Email</em>}</li>
 *   <li>{@link gendev.hw1.SystemAdmin#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.SystemAdmin#getVenuesManaged <em>Venues Managed</em>}</li>
 *   <li>{@link gendev.hw1.SystemAdmin#getAdminID <em>Admin ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getSystemAdmin()
 * @model
 * @generated
 */
public interface SystemAdmin extends EObject {
	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(int)
	 * @see gendev.hw1.Hw1Package#getSystemAdmin_Phone()
	 * @model
	 * @generated
	 */
	int getPhone();

	/**
	 * Sets the value of the '{@link gendev.hw1.SystemAdmin#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see gendev.hw1.Hw1Package#getSystemAdmin_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link gendev.hw1.SystemAdmin#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getSystemAdmin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.SystemAdmin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Venues Managed</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Venue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venues Managed</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getSystemAdmin_VenuesManaged()
	 * @model required="true"
	 * @generated
	 */
	EList<Venue> getVenuesManaged();

	/**
	 * Returns the value of the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin ID</em>' attribute.
	 * @see #setAdminID(int)
	 * @see gendev.hw1.Hw1Package#getSystemAdmin_AdminID()
	 * @model
	 * @generated
	 */
	int getAdminID();

	/**
	 * Sets the value of the '{@link gendev.hw1.SystemAdmin#getAdminID <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin ID</em>' attribute.
	 * @see #getAdminID()
	 * @generated
	 */
	void setAdminID(int value);

} // SystemAdmin
