/**
 */
package gendev.hw1.impl;

import gendev.hw1.Booking;
import gendev.hw1.BookingAgent;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BookingAgentImpl#getAgentID <em>Agent ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingAgentImpl#getApproves <em>Approves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingAgentImpl extends SystemAdminImpl implements BookingAgent {
	/**
	 * The default value of the '{@link #getAgentID() <em>Agent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentID()
	 * @generated
	 * @ordered
	 */
	protected static final int AGENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgentID() <em>Agent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentID()
	 * @generated
	 * @ordered
	 */
	protected int agentID = AGENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApproves() <em>Approves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproves()
	 * @generated
	 * @ordered
	 */
	protected Booking approves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BOOKING_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAgentID() {
		return agentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentID(int newAgentID) {
		int oldAgentID = agentID;
		agentID = newAgentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING_AGENT__AGENT_ID, oldAgentID,
					agentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getApproves() {
		if (approves != null && approves.eIsProxy()) {
			InternalEObject oldApproves = (InternalEObject) approves;
			approves = (Booking) eResolveProxy(oldApproves);
			if (approves != oldApproves) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.BOOKING_AGENT__APPROVES,
							oldApproves, approves));
			}
		}
		return approves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetApproves() {
		return approves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproves(Booking newApproves) {
		Booking oldApproves = approves;
		approves = newApproves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING_AGENT__APPROVES, oldApproves,
					approves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.BOOKING_AGENT__AGENT_ID:
			return getAgentID();
		case Hw1Package.BOOKING_AGENT__APPROVES:
			if (resolve)
				return getApproves();
			return basicGetApproves();
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
		case Hw1Package.BOOKING_AGENT__AGENT_ID:
			setAgentID((Integer) newValue);
			return;
		case Hw1Package.BOOKING_AGENT__APPROVES:
			setApproves((Booking) newValue);
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
		case Hw1Package.BOOKING_AGENT__AGENT_ID:
			setAgentID(AGENT_ID_EDEFAULT);
			return;
		case Hw1Package.BOOKING_AGENT__APPROVES:
			setApproves((Booking) null);
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
		case Hw1Package.BOOKING_AGENT__AGENT_ID:
			return agentID != AGENT_ID_EDEFAULT;
		case Hw1Package.BOOKING_AGENT__APPROVES:
			return approves != null;
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
		result.append(" (AgentID: ");
		result.append(agentID);
		result.append(')');
		return result.toString();
	}

} //BookingAgentImpl
