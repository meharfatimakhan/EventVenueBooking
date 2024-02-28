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
	 * @model
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

} // EventBooking
