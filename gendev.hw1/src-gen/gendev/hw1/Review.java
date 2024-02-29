/**
 */
package gendev.hw1;

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
 *   <li>{@link gendev.hw1.Review#getSubmittedBy <em>Submitted By</em>}</li>
 *   <li>{@link gendev.hw1.Review#getReviewID <em>Review ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getReview()
 * @model
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
	 * Returns the value of the '<em><b>Submitted By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Customer#getSubmits <em>Submits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted By</em>' reference.
	 * @see #setSubmittedBy(Customer)
	 * @see gendev.hw1.Hw1Package#getReview_SubmittedBy()
	 * @see gendev.hw1.Customer#getSubmits
	 * @model opposite="submits" required="true"
	 * @generated
	 */
	Customer getSubmittedBy();

	/**
	 * Sets the value of the '{@link gendev.hw1.Review#getSubmittedBy <em>Submitted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted By</em>' reference.
	 * @see #getSubmittedBy()
	 * @generated
	 */
	void setSubmittedBy(Customer value);

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

} // Review
