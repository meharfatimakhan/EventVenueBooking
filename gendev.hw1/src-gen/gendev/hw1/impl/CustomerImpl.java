/**
 */
package gendev.hw1.impl;

import gendev.hw1.Customer;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Review;
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
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

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
	 * The cached value of the '{@link #getSubmits() <em>Submits</em>}' containment reference list.
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
			submits = new EObjectContainmentEList<Review>(Review.class, this, Hw1Package.CUSTOMER__SUBMITS);
		}
		return submits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void submitReview() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Customer!submitReview()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Customer!createBooking()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/hw1!Customer!cancelBooking()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Customer::validateCustomers";
		try {
			/**
			 *
			 * inv validateCustomers:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Customer.allInstances()
			 *         ->forAll(c | (c <> self implies c.Email <> self.Email)) and
			 *         self.submits->notEmpty() implies
			 *         self.submits->forAll(review | review.Rating >= 1 and review.Rating <= 5) and
			 *         self.Phone.toString()
			 *         .size() = 10
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.CUSTOMER___VALIDATE_CUSTOMERS__DIAGNOSTICCHAIN_MAP);
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
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_hw1_c_c_Customer = idResolver
									.getClass(Hw1Tables.CLSSid_Customer, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, Hw1Tables.SET_CLSSid_Customer, TYP_hw1_c_c_Customer);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_c = allInstances.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_c.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									} else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Customer c = (Customer) ITERATOR_c.next();
								/**
								 * c <> self implies c.Email <> self.Email
								 */
								final /*@NonInvalid*/ boolean ne = !c.equals(this);
								final /*@NonInvalid*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ String Email = c.getEmail();
									final /*@NonInvalid*/ String Email_0 = this.getEmail();
									final /*@NonInvalid*/ boolean ne_0 = (Email != null) ? !Email.equals(Email_0)
											: (Email_0 != null);
									if (ne_0) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								//
								if (implies == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (implies == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (implies == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<Review> submits = this.getSubmits();
							final /*@NonInvalid*/ OrderedSetValue BOXED_submits = idResolver
									.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Review, submits);
							final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
									.evaluate(BOXED_submits).booleanValue();
							if (!notEmpty) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_forAll instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_forAll;
								}
								if (CAUGHT_forAll == null) {
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
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							/*@Caught*/ Object CAUGHT_forAll_0;
							try {
								final /*@NonInvalid*/ List<Review> submits_0 = this.getSubmits();
								final /*@NonInvalid*/ OrderedSetValue BOXED_submits_0 = idResolver
										.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Review, submits_0);
								/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
								Iterator<Object> ITERATOR_review = BOXED_submits_0.iterator();
								/*@Thrown*/ Boolean forAll_0;
								while (true) {
									if (!ITERATOR_review.hasNext()) {
										if (accumulator_0 == null) {
											forAll_0 = null;
										} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
											forAll_0 = ValueUtil.TRUE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ Review review = (Review) ITERATOR_review.next();
									/**
									 * review.Rating >= 1 and review.Rating <= 5
									 */
									final /*@NonInvalid*/ int Rating_0 = review.getRating();
									final /*@NonInvalid*/ IntegerValue BOXED_Rating_0 = ValueUtil
											.integerValueOf(Rating_0);
									final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
											.evaluate(executor, BOXED_Rating_0, Hw1Tables.INT_1).booleanValue();
									final /*@NonInvalid*/ Boolean and_0;
									if (!ge) {
										and_0 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
												.evaluate(executor, BOXED_Rating_0, Hw1Tables.INT_5).booleanValue();
										if (!le_0) {
											and_0 = ValueUtil.FALSE_VALUE;
										} else {
											and_0 = ValueUtil.TRUE_VALUE;
										}
									}
									//
									if (and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
										forAll_0 = ValueUtil.FALSE_VALUE;
										break; // Stop immediately
									} else if (and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
										; // Carry on
									} else if (and_0 == null) { // Abnormal null body evaluation result
										if (accumulator_0 == ValueUtil.TRUE_VALUE) {
											accumulator_0 = null; // Cache a null failure
										}
									} else { // Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"forAll");
									}
								}
								CAUGHT_forAll_0 = forAll_0;
							} catch (Exception e) {
								CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_eq;
								try {
									final /*@NonInvalid*/ String Phone = this.getPhone();
									final /*@Thrown*/ String toString = OclAnyToStringOperation.INSTANCE
											.evaluate(Phone);
									final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE
											.evaluate(toString);
									final /*@Thrown*/ boolean eq = size.equals(Hw1Tables.INT_10);
									CAUGHT_eq = eq;
								} catch (Exception e) {
									CAUGHT_eq = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
									and_1 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_forAll_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_forAll_0;
									}
									if (CAUGHT_eq instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq;
									}
									if (CAUGHT_forAll_0 == null) {
										and_1 = null;
									} else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_1 = and_1;
						} catch (Exception e) {
							CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_1;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_1 == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
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
			setPhone((String) newValue);
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
			return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
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
	@SuppressWarnings("unchecked")
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
		case Hw1Package.CUSTOMER___VALIDATE_CUSTOMERS__DIAGNOSTICCHAIN_MAP:
			return validateCustomers((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
