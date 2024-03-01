/**
 */
package gendev.hw1.impl;

import gendev.hw1.Booking;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
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
 * An implementation of the model object '<em><b>Venue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getBookings <em>Bookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VenueImpl extends MinimalEObjectImpl.Container implements Venue {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVenueID() <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenueID()
	 * @generated
	 * @ordered
	 */
	protected static final int VENUE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVenueID() <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenueID()
	 * @generated
	 * @ordered
	 */
	protected int venueID = VENUE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.VENUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVenueID() {
		return venueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVenueID(int newVenueID) {
		int oldVenueID = venueID;
		venueID = newVenueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__VENUE_ID, oldVenueID, venueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentEList<Booking>(Booking.class, this, Hw1Package.VENUE__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkAvailibility() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Venue!checkAvailibility()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean venueBookingsCheck(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Venue::venueBookingsCheck";
		try {
			/**
			 *
			 * inv venueBookingsCheck:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.bookings->notEmpty() and
			 *         self.bookings->exists(booking | booking.NumberOfGuests <= self.Capacity)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.VENUE___VENUE_BOOKINGS_CHECK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Booking> bookings_0 = this.getBookings();
					final /*@NonInvalid*/ OrderedSetValue BOXED_bookings_0 = idResolver
							.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Booking, bookings_0);
					final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
							.evaluate(BOXED_bookings_0).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!notEmpty) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_booking = BOXED_bookings_0.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_booking.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Booking booking = (Booking) ITERATOR_booking.next();
							/**
							 * booking.NumberOfGuests <= self.Capacity
							 */
							final /*@NonInvalid*/ int NumberOfGuests = booking.getNumberOfGuests();
							final /*@NonInvalid*/ IntegerValue BOXED_NumberOfGuests = ValueUtil
									.integerValueOf(NumberOfGuests);
							final /*@NonInvalid*/ int Capacity = this.getCapacity();
							final /*@NonInvalid*/ IntegerValue BOXED_Capacity = ValueUtil.integerValueOf(Capacity);
							final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_NumberOfGuests, BOXED_Capacity).booleanValue();
							//
							if (le_0) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!le_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (exists == null) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.VENUE__BOOKINGS:
			return ((InternalEList<?>) getBookings()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.VENUE__LOCATION:
			return getLocation();
		case Hw1Package.VENUE__CAPACITY:
			return getCapacity();
		case Hw1Package.VENUE__VENUE_ID:
			return getVenueID();
		case Hw1Package.VENUE__BOOKINGS:
			return getBookings();
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
		case Hw1Package.VENUE__LOCATION:
			setLocation((String) newValue);
			return;
		case Hw1Package.VENUE__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case Hw1Package.VENUE__VENUE_ID:
			setVenueID((Integer) newValue);
			return;
		case Hw1Package.VENUE__BOOKINGS:
			getBookings().clear();
			getBookings().addAll((Collection<? extends Booking>) newValue);
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
		case Hw1Package.VENUE__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case Hw1Package.VENUE__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case Hw1Package.VENUE__VENUE_ID:
			setVenueID(VENUE_ID_EDEFAULT);
			return;
		case Hw1Package.VENUE__BOOKINGS:
			getBookings().clear();
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
		case Hw1Package.VENUE__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case Hw1Package.VENUE__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
		case Hw1Package.VENUE__VENUE_ID:
			return venueID != VENUE_ID_EDEFAULT;
		case Hw1Package.VENUE__BOOKINGS:
			return bookings != null && !bookings.isEmpty();
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
		case Hw1Package.VENUE___CHECK_AVAILIBILITY:
			checkAvailibility();
			return null;
		case Hw1Package.VENUE___VENUE_BOOKINGS_CHECK__DIAGNOSTICCHAIN_MAP:
			return venueBookingsCheck((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (Location: ");
		result.append(location);
		result.append(", Capacity: ");
		result.append(capacity);
		result.append(", VenueID: ");
		result.append(venueID);
		result.append(')');
		return result.toString();
	}

} //VenueImpl
