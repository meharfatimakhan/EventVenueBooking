/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Review#getRating <em>Rating</em>}</li>
 *   <li>{@link gendev.hw1.Review#getComment <em>Comment</em>}</li>
 *   <li>{@link gendev.hw1.Review#getReviewBookingID <em>Review Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.Review#getReviewID <em>Review ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getReview()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='reviewValidations'"
 * @generated
 */
public interface Review extends EObject {
	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(int)
	 * @see gendev.hw1.Hw1Package#getReview_Rating()
	 * @model required="true"
	 * @generated
	 */
	int getRating();

	/**
	 * Sets the value of the '{@link gendev.hw1.Review#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see gendev.hw1.Hw1Package#getReview_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link gendev.hw1.Review#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Review Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Booking ID</em>' attribute.
	 * @see #setReviewBookingID(int)
	 * @see gendev.hw1.Hw1Package#getReview_ReviewBookingID()
	 * @model required="true"
	 * @generated
	 */
	int getReviewBookingID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Review#getReviewBookingID <em>Review Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Booking ID</em>' attribute.
	 * @see #getReviewBookingID()
	 * @generated
	 */
	void setReviewBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Review ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review ID</em>' attribute.
	 * @see #setReviewID(int)
	 * @see gendev.hw1.Hw1Package#getReview_ReviewID()
	 * @model required="true"
	 * @generated
	 */
	int getReviewID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Review#getReviewID <em>Review ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review ID</em>' attribute.
	 * @see #getReviewID()
	 * @generated
	 */
	void setReviewID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Rating &gt;= 1 and self.Rating &lt;= 5 and self.Comment-&gt;notEmpty() and self.Comment.size() &lt;= 100'"
	 * @generated
	 */
	boolean reviewValidations(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Review
