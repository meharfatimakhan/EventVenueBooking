/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Review;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.ReviewImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link gendev.hw1.impl.ReviewImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link gendev.hw1.impl.ReviewImpl#getReviewBookingID <em>Review Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.ReviewImpl#getReviewID <em>Review ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewImpl extends MinimalEObjectImpl.Container implements Review {
	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final int RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected int rating = RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewBookingID() <em>Review Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int REVIEW_BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReviewBookingID() <em>Review Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewBookingID()
	 * @generated
	 * @ordered
	 */
	protected int reviewBookingID = REVIEW_BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewID() <em>Review ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewID()
	 * @generated
	 * @ordered
	 */
	protected static final int REVIEW_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReviewID() <em>Review ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewID()
	 * @generated
	 * @ordered
	 */
	protected int reviewID = REVIEW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating(int newRating) {
		int oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REVIEW__RATING, oldRating, rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REVIEW__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReviewBookingID() {
		return reviewBookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewBookingID(int newReviewBookingID) {
		int oldReviewBookingID = reviewBookingID;
		reviewBookingID = newReviewBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REVIEW__REVIEW_BOOKING_ID,
					oldReviewBookingID, reviewBookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReviewID() {
		return reviewID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewID(int newReviewID) {
		int oldReviewID = reviewID;
		reviewID = newReviewID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.REVIEW__REVIEW_ID, oldReviewID, reviewID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reviewValidations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Review::reviewValidations";
		try {
			/**
			 *
			 * inv reviewValidations:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.Rating >= 1 and self.Rating <= 5 and
			 *         self.Comment->notEmpty() and
			 *         self.Comment.size() <= 100
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.REVIEW___REVIEW_VALIDATIONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ int Rating_0 = this.getRating();
						final /*@NonInvalid*/ IntegerValue BOXED_Rating_0 = ValueUtil.integerValueOf(Rating_0);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_Rating_0, Hw1Tables.INT_1).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!ge) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_Rating_0, Hw1Tables.INT_5).booleanValue();
							if (!le_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_notEmpty;
							try {
								final /*@NonInvalid*/ String Comment = this.getComment();
								final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
										.evaluate(executor, Hw1Tables.SET_PRIMid_String, Comment);
								final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
										.evaluate(oclAsSet).booleanValue();
								CAUGHT_notEmpty = notEmpty;
							} catch (Exception e) {
								CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_notEmpty == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_notEmpty instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_notEmpty;
								}
								if (and == null) {
									and_0 = null;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					} catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_le_1;
						try {
							final /*@NonInvalid*/ String Comment_0 = this.getComment();
							if (Comment_0 == null) {
								throw new InvalidValueException(
										"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(Comment_0);
							final /*@Thrown*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, size, Hw1Tables.INT_100).booleanValue();
							CAUGHT_le_1 = le_1;
						} catch (Exception e) {
							CAUGHT_le_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_le_1 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if (CAUGHT_le_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_le_1;
							}
							if (CAUGHT_and_0 == null) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.REVIEW__RATING:
			return getRating();
		case Hw1Package.REVIEW__COMMENT:
			return getComment();
		case Hw1Package.REVIEW__REVIEW_BOOKING_ID:
			return getReviewBookingID();
		case Hw1Package.REVIEW__REVIEW_ID:
			return getReviewID();
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
		case Hw1Package.REVIEW__RATING:
			setRating((Integer) newValue);
			return;
		case Hw1Package.REVIEW__COMMENT:
			setComment((String) newValue);
			return;
		case Hw1Package.REVIEW__REVIEW_BOOKING_ID:
			setReviewBookingID((Integer) newValue);
			return;
		case Hw1Package.REVIEW__REVIEW_ID:
			setReviewID((Integer) newValue);
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
		case Hw1Package.REVIEW__RATING:
			setRating(RATING_EDEFAULT);
			return;
		case Hw1Package.REVIEW__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case Hw1Package.REVIEW__REVIEW_BOOKING_ID:
			setReviewBookingID(REVIEW_BOOKING_ID_EDEFAULT);
			return;
		case Hw1Package.REVIEW__REVIEW_ID:
			setReviewID(REVIEW_ID_EDEFAULT);
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
		case Hw1Package.REVIEW__RATING:
			return rating != RATING_EDEFAULT;
		case Hw1Package.REVIEW__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case Hw1Package.REVIEW__REVIEW_BOOKING_ID:
			return reviewBookingID != REVIEW_BOOKING_ID_EDEFAULT;
		case Hw1Package.REVIEW__REVIEW_ID:
			return reviewID != REVIEW_ID_EDEFAULT;
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
		case Hw1Package.REVIEW___REVIEW_VALIDATIONS__DIAGNOSTICCHAIN_MAP:
			return reviewValidations((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (Rating: ");
		result.append(rating);
		result.append(", Comment: ");
		result.append(comment);
		result.append(", ReviewBookingID: ");
		result.append(reviewBookingID);
		result.append(", ReviewID: ");
		result.append(reviewID);
		result.append(')');
		return result.toString();
	}

} //ReviewImpl
