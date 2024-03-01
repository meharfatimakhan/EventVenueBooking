/**
 */
package gendev.hw1.impl;

import gendev.hw1.BookingAdmin;
import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Venue;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.BookingAdminImpl#getApprovedBookings <em>Approved Bookings</em>}</li>
 *   <li>{@link gendev.hw1.impl.BookingAdminImpl#getNumberOfApprovals <em>Number Of Approvals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingAdminImpl extends SystemAdminImpl implements BookingAdmin {
	/**
	 * The cached value of the '{@link #getApprovedBookings() <em>Approved Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<EventBooking> approvedBookings;

	/**
	 * The default value of the '{@link #getNumberOfApprovals() <em>Number Of Approvals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfApprovals()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_APPROVALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfApprovals() <em>Number Of Approvals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfApprovals()
	 * @generated
	 * @ordered
	 */
	protected int numberOfApprovals = NUMBER_OF_APPROVALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.BOOKING_ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventBooking> getApprovedBookings() {
		if (approvedBookings == null) {
			approvedBookings = new EObjectWithInverseResolvingEList<EventBooking>(EventBooking.class, this,
					Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS, Hw1Package.EVENT_BOOKING__APPROVED_BY);
		}
		return approvedBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfApprovals() {
		return numberOfApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfApprovals(int newNumberOfApprovals) {
		int oldNumberOfApprovals = numberOfApprovals;
		numberOfApprovals = newNumberOfApprovals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.BOOKING_ADMIN__NUMBER_OF_APPROVALS,
					oldNumberOfApprovals, numberOfApprovals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void approveCustomerBooking() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!BookingAdmin!approveCustomerBooking()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean bookingAdminChecks(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "BookingAdmin::bookingAdminChecks";
		try {
			/**
			 *
			 * inv bookingAdminChecks:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.venuesManaged->notEmpty() and
			 *         self.approvedBookings->exists(booking |
			 *           not booking.oclIsUndefined()) and self.NumberOfApprovals >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.BOOKING_ADMIN___BOOKING_ADMIN_CHECKS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ List<Venue> venuesManaged = this.getVenuesManaged();
						final /*@NonInvalid*/ OrderedSetValue BOXED_venuesManaged = idResolver
								.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Venue, venuesManaged);
						final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
								.evaluate(BOXED_venuesManaged).booleanValue();
						final /*@Thrown*/ Boolean and;
						if (!notEmpty) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_exists;
							try {
								final /*@NonInvalid*/ List<EventBooking> approvedBookings = this.getApprovedBookings();
								final /*@NonInvalid*/ OrderedSetValue BOXED_approvedBookings = idResolver
										.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_EventBooking, approvedBookings);
								/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_booking = BOXED_approvedBookings.iterator();
								/*@Thrown*/ Boolean exists;
								while (true) {
									if (!ITERATOR_booking.hasNext()) {
										if (accumulator == null) {
											exists = null;
										} else if (accumulator == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator;
										}
										break;
									}
									/*@NonInvalid*/ EventBooking booking = (EventBooking) ITERATOR_booking.next();
									/**
									 * not booking.oclIsUndefined()
									 */
									final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
									//
									if (not == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
										exists = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (not == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else if (not == null) { // Abnormal null body evaluation result
										if (accumulator == ValueUtil.FALSE_VALUE) {
											accumulator = null; // Cache a null failure
										}
									} else { // Impossible badly typed result
										accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
									}
								}
								CAUGHT_exists = exists;
							} catch (Exception e) {
								CAUGHT_exists = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_exists instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_exists;
								}
								if (CAUGHT_exists == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					} catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ int NumberOfApprovals = this.getNumberOfApprovals();
						final /*@NonInvalid*/ IntegerValue BOXED_NumberOfApprovals = ValueUtil
								.integerValueOf(NumberOfApprovals);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_NumberOfApprovals, Hw1Tables.INT_0).booleanValue();
						if (!ge) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_and == null) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Hw1Tables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getApprovedBookings()).basicAdd(otherEnd, msgs);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			return ((InternalEList<?>) getApprovedBookings()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			return getApprovedBookings();
		case Hw1Package.BOOKING_ADMIN__NUMBER_OF_APPROVALS:
			return getNumberOfApprovals();
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			getApprovedBookings().clear();
			getApprovedBookings().addAll((Collection<? extends EventBooking>) newValue);
			return;
		case Hw1Package.BOOKING_ADMIN__NUMBER_OF_APPROVALS:
			setNumberOfApprovals((Integer) newValue);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			getApprovedBookings().clear();
			return;
		case Hw1Package.BOOKING_ADMIN__NUMBER_OF_APPROVALS:
			setNumberOfApprovals(NUMBER_OF_APPROVALS_EDEFAULT);
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
		case Hw1Package.BOOKING_ADMIN__APPROVED_BOOKINGS:
			return approvedBookings != null && !approvedBookings.isEmpty();
		case Hw1Package.BOOKING_ADMIN__NUMBER_OF_APPROVALS:
			return numberOfApprovals != NUMBER_OF_APPROVALS_EDEFAULT;
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
		case Hw1Package.BOOKING_ADMIN___APPROVE_CUSTOMER_BOOKING:
			approveCustomerBooking();
			return null;
		case Hw1Package.BOOKING_ADMIN___BOOKING_ADMIN_CHECKS__DIAGNOSTICCHAIN_MAP:
			return bookingAdminChecks((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (NumberOfApprovals: ");
		result.append(numberOfApprovals);
		result.append(')');
		return result.toString();
	}

} //BookingAdminImpl
