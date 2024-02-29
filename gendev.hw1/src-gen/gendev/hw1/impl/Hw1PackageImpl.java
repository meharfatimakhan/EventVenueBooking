/**
 */
package gendev.hw1.impl;

import gendev.hw1.Booking;
import gendev.hw1.BookingAdmin;
import gendev.hw1.Customer;
import gendev.hw1.EventBooking;
import gendev.hw1.Hw1Factory;
import gendev.hw1.Hw1Package;
import gendev.hw1.MenuTastingBooking;
import gendev.hw1.Payment;
import gendev.hw1.Review;
import gendev.hw1.SystemAdmin;
import gendev.hw1.Venue;
import gendev.hw1.VenueVisitBooking;

import java.util.Calendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1PackageImpl extends EPackageImpl implements Hw1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass venueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass venueVisitBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuTastingBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gendev.hw1.Hw1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hw1PackageImpl() {
		super(eNS_URI, Hw1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hw1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hw1Package init() {
		if (isInited)
			return (Hw1Package) EPackage.Registry.INSTANCE.getEPackage(Hw1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHw1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hw1PackageImpl theHw1Package = registeredHw1Package instanceof Hw1PackageImpl
				? (Hw1PackageImpl) registeredHw1Package
				: new Hw1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHw1Package.createPackageContents();

		// Initialize created meta-data
		theHw1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHw1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hw1Package.eNS_URI, theHw1Package);
		return theHw1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Name() {
		return (EAttribute) customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Email() {
		return (EAttribute) customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Phone() {
		return (EAttribute) customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CustomerBookingID() {
		return (EAttribute) customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Submits() {
		return (EReference) customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SubmitReview() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__CreateBooking() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__CancelBooking() {
		return customerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_Rating() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_Comment() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_ReviewBookingID() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReview_SubmittedBy() {
		return (EReference) reviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_ReviewID() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVenue() {
		return venueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenue_Location() {
		return (EAttribute) venueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenue_Capacity() {
		return (EAttribute) venueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVenue_Bookings() {
		return (EReference) venueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenue_VenueID() {
		return (EAttribute) venueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVenue__CheckAvailibility() {
		return venueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAdmin() {
		return systemAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAdmin_Phone() {
		return (EAttribute) systemAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAdmin_Email() {
		return (EAttribute) systemAdminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAdmin_Name() {
		return (EAttribute) systemAdminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAdmin_VenuesManaged() {
		return (EReference) systemAdminEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAdmin_AdminID() {
		return (EAttribute) systemAdminEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingAdmin() {
		return bookingAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingAdmin_ApprovedBookings() {
		return (EReference) bookingAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingAdmin_ApprovalRate() {
		return (EAttribute) bookingAdminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingID() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingDate() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingStatus() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_BookingBy() {
		return (EReference) bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_HasReviews() {
		return (EReference) bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingType() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_HostedAt() {
		return (EReference) bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_MenuOptions() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_NumberOfGuests() {
		return (EAttribute) bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__ViewBookingInfo() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_AmountPaid() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_PaymentMethod() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_PaymentStatus() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayment_PaidFor() {
		return (EReference) paymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_PaymentID() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_AmountRefunded() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayment_PaymentType() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__ProcessPayment() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__RefundPayment() {
		return paymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__SendPaymenyReceiptEmail() {
		return paymentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVenueVisitBooking() {
		return venueVisitBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenueVisitBooking_VisitPurpose() {
		return (EAttribute) venueVisitBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenueVisitBooking_VisitID() {
		return (EAttribute) venueVisitBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBooking() {
		return eventBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBooking_EstimatedPriceQuote() {
		return (EAttribute) eventBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBooking_ApprovedBy() {
		return (EReference) eventBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBooking_EventDescription() {
		return (EAttribute) eventBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventBooking__CalculateFinalPrice() {
		return eventBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuTastingBooking() {
		return menuTastingBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuTastingBooking_MenuTastingVisitID() {
		return (EAttribute) menuTastingBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Factory getHw1Factory() {
		return (Hw1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__NAME);
		createEAttribute(customerEClass, CUSTOMER__EMAIL);
		createEAttribute(customerEClass, CUSTOMER__PHONE);
		createEAttribute(customerEClass, CUSTOMER__CUSTOMER_BOOKING_ID);
		createEReference(customerEClass, CUSTOMER__SUBMITS);
		createEOperation(customerEClass, CUSTOMER___SUBMIT_REVIEW);
		createEOperation(customerEClass, CUSTOMER___CREATE_BOOKING);
		createEOperation(customerEClass, CUSTOMER___CANCEL_BOOKING);

		reviewEClass = createEClass(REVIEW);
		createEAttribute(reviewEClass, REVIEW__RATING);
		createEAttribute(reviewEClass, REVIEW__COMMENT);
		createEAttribute(reviewEClass, REVIEW__REVIEW_BOOKING_ID);
		createEReference(reviewEClass, REVIEW__SUBMITTED_BY);
		createEAttribute(reviewEClass, REVIEW__REVIEW_ID);

		venueEClass = createEClass(VENUE);
		createEAttribute(venueEClass, VENUE__LOCATION);
		createEAttribute(venueEClass, VENUE__CAPACITY);
		createEReference(venueEClass, VENUE__BOOKINGS);
		createEAttribute(venueEClass, VENUE__VENUE_ID);
		createEOperation(venueEClass, VENUE___CHECK_AVAILIBILITY);

		systemAdminEClass = createEClass(SYSTEM_ADMIN);
		createEAttribute(systemAdminEClass, SYSTEM_ADMIN__PHONE);
		createEAttribute(systemAdminEClass, SYSTEM_ADMIN__EMAIL);
		createEAttribute(systemAdminEClass, SYSTEM_ADMIN__NAME);
		createEReference(systemAdminEClass, SYSTEM_ADMIN__VENUES_MANAGED);
		createEAttribute(systemAdminEClass, SYSTEM_ADMIN__ADMIN_ID);

		bookingAdminEClass = createEClass(BOOKING_ADMIN);
		createEReference(bookingAdminEClass, BOOKING_ADMIN__APPROVED_BOOKINGS);
		createEAttribute(bookingAdminEClass, BOOKING_ADMIN__APPROVAL_RATE);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEAttribute(bookingEClass, BOOKING__BOOKING_DATE);
		createEAttribute(bookingEClass, BOOKING__BOOKING_STATUS);
		createEReference(bookingEClass, BOOKING__BOOKING_BY);
		createEReference(bookingEClass, BOOKING__HAS_REVIEWS);
		createEAttribute(bookingEClass, BOOKING__BOOKING_TYPE);
		createEReference(bookingEClass, BOOKING__HOSTED_AT);
		createEAttribute(bookingEClass, BOOKING__MENU_OPTIONS);
		createEAttribute(bookingEClass, BOOKING__NUMBER_OF_GUESTS);
		createEOperation(bookingEClass, BOOKING___VIEW_BOOKING_INFO);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT_PAID);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_METHOD);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_STATUS);
		createEReference(paymentEClass, PAYMENT__PAID_FOR);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_ID);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT_REFUNDED);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_TYPE);
		createEOperation(paymentEClass, PAYMENT___PROCESS_PAYMENT);
		createEOperation(paymentEClass, PAYMENT___REFUND_PAYMENT);
		createEOperation(paymentEClass, PAYMENT___SEND_PAYMENY_RECEIPT_EMAIL);

		venueVisitBookingEClass = createEClass(VENUE_VISIT_BOOKING);
		createEAttribute(venueVisitBookingEClass, VENUE_VISIT_BOOKING__VISIT_PURPOSE);
		createEAttribute(venueVisitBookingEClass, VENUE_VISIT_BOOKING__VISIT_ID);

		eventBookingEClass = createEClass(EVENT_BOOKING);
		createEAttribute(eventBookingEClass, EVENT_BOOKING__ESTIMATED_PRICE_QUOTE);
		createEReference(eventBookingEClass, EVENT_BOOKING__APPROVED_BY);
		createEAttribute(eventBookingEClass, EVENT_BOOKING__EVENT_DESCRIPTION);
		createEOperation(eventBookingEClass, EVENT_BOOKING___CALCULATE_FINAL_PRICE);

		menuTastingBookingEClass = createEClass(MENU_TASTING_BOOKING);
		createEAttribute(menuTastingBookingEClass, MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bookingAdminEClass.getESuperTypes().add(this.getSystemAdmin());
		venueVisitBookingEClass.getESuperTypes().add(this.getBooking());
		eventBookingEClass.getESuperTypes().add(this.getBooking());
		menuTastingBookingEClass.getESuperTypes().add(this.getBooking());

		// Initialize classes, features, and operations; add parameters
		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Customer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_Email(), ecorePackage.getEString(), "Email", null, 0, 1, Customer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_Phone(), ecorePackage.getEInt(), "Phone", null, 0, 1, Customer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CustomerBookingID(), ecorePackage.getEInt(), "CustomerBookingID", null, 0, 1,
				Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_Submits(), this.getReview(), this.getReview_SubmittedBy(), "submits", null, 0, -1,
				Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCustomer__SubmitReview(), null, "submitReview", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustomer__CreateBooking(), null, "createBooking", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustomer__CancelBooking(), null, "cancelBooking", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReview_Rating(), ecorePackage.getEInt(), "Rating", null, 0, 1, Review.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_Comment(), ecorePackage.getEString(), "Comment", null, 0, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_ReviewBookingID(), ecorePackage.getEInt(), "ReviewBookingID", null, 0, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReview_SubmittedBy(), this.getCustomer(), this.getCustomer_Submits(), "submittedBy", null, 1,
				1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_ReviewID(), ecorePackage.getEInt(), "ReviewID", null, 0, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(venueEClass, Venue.class, "Venue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVenue_Location(), ecorePackage.getEString(), "Location", null, 0, 1, Venue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVenue_Capacity(), ecorePackage.getEInt(), "Capacity", null, 0, 1, Venue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVenue_Bookings(), this.getBooking(), this.getBooking_HostedAt(), "bookings", null, 0, -1,
				Venue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVenue_VenueID(), ecorePackage.getEInt(), "VenueID", null, 0, 1, Venue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVenue__CheckAvailibility(), null, "checkAvailibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemAdminEClass, SystemAdmin.class, "SystemAdmin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemAdmin_Phone(), ecorePackage.getEInt(), "Phone", null, 0, 1, SystemAdmin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemAdmin_Email(), ecorePackage.getEString(), "Email", null, 0, 1, SystemAdmin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemAdmin_Name(), ecorePackage.getEString(), "Name", null, 0, 1, SystemAdmin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAdmin_VenuesManaged(), this.getVenue(), null, "venuesManaged", null, 1, -1,
				SystemAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemAdmin_AdminID(), ecorePackage.getEInt(), "AdminID", null, 0, 1, SystemAdmin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookingAdminEClass, BookingAdmin.class, "BookingAdmin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingAdmin_ApprovedBookings(), this.getEventBooking(), this.getEventBooking_ApprovedBy(),
				"approvedBookings", null, 0, 1, BookingAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookingAdmin_ApprovalRate(), ecorePackage.getEDouble(), "approvalRate", null, 0, 1,
				BookingAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingID(), ecorePackage.getEInt(), "BookingID", null, 0, 1, Booking.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooking_BookingDate(), this.getCalendar(), "BookingDate", null, 0, 1, Booking.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooking_BookingStatus(), ecorePackage.getEString(), "BookingStatus", null, 0, 1,
				Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBooking_BookingBy(), this.getCustomer(), null, "bookingBy", null, 1, 1, Booking.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooking_HasReviews(), this.getReview(), null, "hasReviews", null, 0, -1, Booking.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooking_BookingType(), ecorePackage.getEString(), "BookingType", null, 0, 1, Booking.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooking_HostedAt(), this.getVenue(), this.getVenue_Bookings(), "hostedAt", null, 1, 1,
				Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getBooking_MenuOptions(), g1, "MenuOptions", null, 0, 1, Booking.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooking_NumberOfGuests(), ecorePackage.getEInt(), "NumberOfGuests", null, 0, 1, Booking.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBooking__ViewBookingInfo(), null, "viewBookingInfo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_AmountPaid(), ecorePackage.getEInt(), "AmountPaid", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaymentMethod(), ecorePackage.getEString(), "PaymentMethod", null, 0, 1,
				Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaymentStatus(), ecorePackage.getEString(), "PaymentStatus", null, 0, 1,
				Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_PaidFor(), this.getEventBooking(), null, "paidFor", null, 1, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaymentID(), ecorePackage.getEInt(), "PaymentID", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_AmountRefunded(), ecorePackage.getEInt(), "AmountRefunded", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaymentType(), ecorePackage.getEString(), "PaymentType", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPayment__ProcessPayment(), null, "processPayment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayment__RefundPayment(), null, "refundPayment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayment__SendPaymenyReceiptEmail(), null, "sendPaymenyReceiptEmail", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(venueVisitBookingEClass, VenueVisitBooking.class, "VenueVisitBooking", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVenueVisitBooking_VisitPurpose(), ecorePackage.getEString(), "VisitPurpose", null, 0, 1,
				VenueVisitBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVenueVisitBooking_VisitID(), ecorePackage.getEInt(), "VisitID", null, 0, 1,
				VenueVisitBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eventBookingEClass, EventBooking.class, "EventBooking", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventBooking_EstimatedPriceQuote(), ecorePackage.getEInt(), "EstimatedPriceQuote", null, 0, 1,
				EventBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEventBooking_ApprovedBy(), this.getBookingAdmin(), this.getBookingAdmin_ApprovedBookings(),
				"approvedBy", null, 0, 1, EventBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBooking_EventDescription(), ecorePackage.getEString(), "EventDescription", null, 0, 1,
				EventBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getEventBooking__CalculateFinalPrice(), null, "calculateFinalPrice", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(menuTastingBookingEClass, MenuTastingBooking.class, "MenuTastingBooking", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuTastingBooking_MenuTastingVisitID(), ecorePackage.getEString(), "MenuTastingVisitID",
				null, 0, 1, MenuTastingBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Hw1PackageImpl
