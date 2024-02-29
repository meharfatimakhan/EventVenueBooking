/**
 */
package gendev.hw1.util;

import gendev.hw1.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Hw1Validator INSTANCE = new Hw1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gendev.hw1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Null ' of 'Customer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUSTOMER__NULL_ = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Null ' of 'Venue'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VENUE__NULL_ = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Null ' of 'Booking Admin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOKING_ADMIN__NULL_ = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Hw1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Hw1Package.CUSTOMER:
			return validateCustomer((Customer) value, diagnostics, context);
		case Hw1Package.REVIEW:
			return validateReview((Review) value, diagnostics, context);
		case Hw1Package.VENUE:
			return validateVenue((Venue) value, diagnostics, context);
		case Hw1Package.SYSTEM_ADMIN:
			return validateSystemAdmin((SystemAdmin) value, diagnostics, context);
		case Hw1Package.BOOKING_ADMIN:
			return validateBookingAdmin((BookingAdmin) value, diagnostics, context);
		case Hw1Package.BOOKING:
			return validateBooking((Booking) value, diagnostics, context);
		case Hw1Package.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case Hw1Package.VENUE_VISIT_BOOKING:
			return validateVenueVisitBooking((VenueVisitBooking) value, diagnostics, context);
		case Hw1Package.EVENT_BOOKING:
			return validateEventBooking((EventBooking) value, diagnostics, context);
		case Hw1Package.MENU_TASTING_BOOKING:
			return validateMenuTastingBooking((MenuTastingBooking) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCustomer_null(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCustomer_null_(customer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the null constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_null(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "null", getObjectLabel(customer, context) },
						new Object[] { customer }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the null_ constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_null_(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return customer.null_(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReview(Review review, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(review, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVenue(Venue venue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(venue, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVenue_null(venue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVenue_null_(venue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the null constraint of '<em>Venue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVenue_null(Venue venue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] { "null", getObjectLabel(venue, context) },
						new Object[] { venue }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the null_ constraint of '<em>Venue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVenue_null_(Venue venue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return venue.null_(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAdmin(SystemAdmin systemAdmin, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemAdmin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingAdmin(BookingAdmin bookingAdmin, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bookingAdmin, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBookingAdmin_null(bookingAdmin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBookingAdmin_null_(bookingAdmin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the null constraint of '<em>Booking Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingAdmin_null(BookingAdmin bookingAdmin, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "null", getObjectLabel(bookingAdmin, context) },
								new Object[] { bookingAdmin }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the null_ constraint of '<em>Booking Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingAdmin_null_(BookingAdmin bookingAdmin, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bookingAdmin.null_(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooking(Booking booking, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booking, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVenueVisitBooking(VenueVisitBooking venueVisitBooking, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(venueVisitBooking, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventBooking(EventBooking eventBooking, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventBooking, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuTastingBooking(MenuTastingBooking menuTastingBooking, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuTastingBooking, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Hw1Validator
