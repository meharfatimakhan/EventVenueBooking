/**
 */
package gendev.hw1.impl;

import gendev.hw1.BookingAgent;
import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Package;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link gendev.hw1.impl.BookingAgentImpl#getApprovedBy <em>Approved By</em>}</li>
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
	 * The cached value of the '{@link #getApprovedBy() <em>Approved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedBy()
	 * @generated
	 * @ordered
	 */
	protected EventBooking approvedBy;

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
	public EventBooking getApprovedBy() {
		if (approvedBy != null && approvedBy.eIsProxy()) {
			InternalEObject oldApprovedBy = (InternalEObject) approvedBy;
			approvedBy = (EventBooking) eResolveProxy(oldApprovedBy);
			if (approvedBy != oldApprovedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.BOOKING_AGENT__APPROVED_BY,
							oldApprovedBy, approvedBy));
			}
		}
		return approvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBooking basicGetApprovedBy() {
		return approvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovedBy(EventBooking newApprovedBy, NotificationChain msgs) {
		EventBooking oldApprovedBy = approvedBy;
		approvedBy = newApprovedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.BOOKING_AGENT__APPROVED_BY, oldApprovedBy, newApprovedBy);
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
	public void setApprovedBy(EventBooking newApprovedBy) {
		if (newApprovedBy != approvedBy) {
			NotificationChain msgs = null;
			if (approvedBy != null)
				msgs = ((InternalEObject) approvedBy).eInverseRemove(this, Hw1Package.EVENT_BOOKING__APPROVED_BOOKINGS,
						EventBooking.class, msgs);
			if (newApprovedBy != null)
				msgs = ((InternalEObject) newApprovedBy).eInverseAdd(this, Hw1Package.EVENT_BOOKING__APPROVED_BOOKINGS,
						EventBooking.class, msgs);
			msgs = basicSetApprovedBy(newApprovedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING_AGENT__APPROVED_BY, newApprovedBy,
					newApprovedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void approveBookings() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.BOOKING_AGENT__APPROVED_BY:
			if (approvedBy != null)
				msgs = ((InternalEObject) approvedBy).eInverseRemove(this, Hw1Package.EVENT_BOOKING__APPROVED_BOOKINGS,
						EventBooking.class, msgs);
			return basicSetApprovedBy((EventBooking) otherEnd, msgs);
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
		case Hw1Package.BOOKING_AGENT__APPROVED_BY:
			return basicSetApprovedBy(null, msgs);
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
		case Hw1Package.BOOKING_AGENT__AGENT_ID:
			return getAgentID();
		case Hw1Package.BOOKING_AGENT__APPROVED_BY:
			if (resolve)
				return getApprovedBy();
			return basicGetApprovedBy();
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
		case Hw1Package.BOOKING_AGENT__APPROVED_BY:
			setApprovedBy((EventBooking) newValue);
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
		case Hw1Package.BOOKING_AGENT__APPROVED_BY:
			setApprovedBy((EventBooking) null);
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
		case Hw1Package.BOOKING_AGENT__APPROVED_BY:
			return approvedBy != null;
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
		case Hw1Package.BOOKING_AGENT___APPROVE_BOOKINGS:
			approveBookings();
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
		result.append(" (AgentID: ");
		result.append(agentID);
		result.append(')');
		return result.toString();
	}

} //BookingAgentImpl
