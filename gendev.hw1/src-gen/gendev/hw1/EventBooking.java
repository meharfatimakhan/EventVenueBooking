/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.EventBooking#getEstimatedPriceQuote <em>Estimated Price Quote</em>}</li>
 *   <li>{@link gendev.hw1.EventBooking#getEventDescription <em>Event Description</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getEventBooking()
 * @model
 * @generated
 */
public interface EventBooking extends Booking {
	/**
	 * Returns the value of the '<em><b>Estimated Price Quote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Price Quote</em>' attribute.
	 * @see #setEstimatedPriceQuote(int)
	 * @see gendev.hw1.Hw1Package#getEventBooking_EstimatedPriceQuote()
	 * @model required="true"
	 * @generated
	 */
	int getEstimatedPriceQuote();

	/**
	 * Sets the value of the '{@link gendev.hw1.EventBooking#getEstimatedPriceQuote <em>Estimated Price Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Price Quote</em>' attribute.
	 * @see #getEstimatedPriceQuote()
	 * @generated
	 */
	void setEstimatedPriceQuote(int value);

	/**
	 * Returns the value of the '<em><b>Event Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Description</em>' attribute.
	 * @see #setEventDescription(String)
	 * @see gendev.hw1.Hw1Package#getEventBooking_EventDescription()
	 * @model
	 * @generated
	 */
	String getEventDescription();

	/**
	 * Sets the value of the '{@link gendev.hw1.EventBooking#getEventDescription <em>Event Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Description</em>' attribute.
	 * @see #getEventDescription()
	 * @generated
	 */
	void setEventDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateFinalPrice();

} // EventBooking
