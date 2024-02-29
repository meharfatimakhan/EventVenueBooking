/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CustomerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE = 2;

	/**
	 * The feature id for the '<em><b>Customer Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_BOOKING_ID = 3;

	/**
	 * The feature id for the '<em><b>Submits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SUBMITS = 4;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Submit Review</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___SUBMIT_REVIEW = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___CREATE_BOOKING = 1;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___CANCEL_BOOKING = 2;

	/**
	 * The operation id for the '<em>Null </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___NULL____DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ReviewImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 1;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__RATING = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Review Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEW_BOOKING_ID = 2;

	/**
	 * The feature id for the '<em><b>Submitted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__SUBMITTED_BY = 3;

	/**
	 * The feature id for the '<em><b>Review ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEW_ID = 4;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.VenueImpl <em>Venue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.VenueImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getVenue()
	 * @generated
	 */
	int VENUE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__BOOKINGS = 2;

	/**
	 * The feature id for the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__VENUE_ID = 3;

	/**
	 * The number of structural features of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Check Availibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE___CHECK_AVAILIBILITY = 0;

	/**
	 * The operation id for the '<em>Null </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE___NULL____DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.SystemAdminImpl <em>System Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.SystemAdminImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getSystemAdmin()
	 * @generated
	 */
	int SYSTEM_ADMIN = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN__PHONE = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Venues Managed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN__VENUES_MANAGED = 3;

	/**
	 * The feature id for the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN__ADMIN_ID = 4;

	/**
	 * The number of structural features of the '<em>System Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.BookingAdminImpl <em>Booking Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.BookingAdminImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getBookingAdmin()
	 * @generated
	 */
	int BOOKING_ADMIN = 4;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__PHONE = SYSTEM_ADMIN__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__EMAIL = SYSTEM_ADMIN__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__NAME = SYSTEM_ADMIN__NAME;

	/**
	 * The feature id for the '<em><b>Venues Managed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__VENUES_MANAGED = SYSTEM_ADMIN__VENUES_MANAGED;

	/**
	 * The feature id for the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__ADMIN_ID = SYSTEM_ADMIN__ADMIN_ID;

	/**
	 * The feature id for the '<em><b>Approved Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__APPROVED_BOOKINGS = SYSTEM_ADMIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Approvals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN__NUMBER_OF_APPROVALS = SYSTEM_ADMIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Booking Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN_FEATURE_COUNT = SYSTEM_ADMIN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Approve Customer Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN___APPROVE_CUSTOMER_BOOKING = SYSTEM_ADMIN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Null </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN___NULL____DIAGNOSTICCHAIN_MAP = SYSTEM_ADMIN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Booking Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ADMIN_OPERATION_COUNT = SYSTEM_ADMIN_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.BookingImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 5;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Booking By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_BY = 2;

	/**
	 * The feature id for the '<em><b>Has Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__HAS_REVIEWS = 3;

	/**
	 * The feature id for the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Hosted At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__HOSTED_AT = 5;

	/**
	 * The feature id for the '<em><b>Menu Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__MENU_OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NUMBER_OF_GUESTS = 7;

	/**
	 * The feature id for the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_DATE = 8;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>View Booking Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VIEW_BOOKING_INFO = 0;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PaymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 6;

	/**
	 * The feature id for the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT_PAID = 0;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Paid For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAID_FOR = 3;

	/**
	 * The feature id for the '<em><b>Payment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = 4;

	/**
	 * The feature id for the '<em><b>Amount Refunded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT_REFUNDED = 5;

	/**
	 * The feature id for the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Process Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___PROCESS_PAYMENT = 0;

	/**
	 * The operation id for the '<em>Refund Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___REFUND_PAYMENT = 1;

	/**
	 * The operation id for the '<em>Sent Payment Receipt Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___SENT_PAYMENT_RECEIPT_EMAIL = 2;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.VenueVisitBookingImpl <em>Venue Visit Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.VenueVisitBookingImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getVenueVisitBooking()
	 * @generated
	 */
	int VENUE_VISIT_BOOKING = 7;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__BOOKING_ID = BOOKING__BOOKING_ID;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__BOOKING_STATUS = BOOKING__BOOKING_STATUS;

	/**
	 * The feature id for the '<em><b>Booking By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__BOOKING_BY = BOOKING__BOOKING_BY;

	/**
	 * The feature id for the '<em><b>Has Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__HAS_REVIEWS = BOOKING__HAS_REVIEWS;

	/**
	 * The feature id for the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__BOOKING_TYPE = BOOKING__BOOKING_TYPE;

	/**
	 * The feature id for the '<em><b>Hosted At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__HOSTED_AT = BOOKING__HOSTED_AT;

	/**
	 * The feature id for the '<em><b>Menu Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__MENU_OPTIONS = BOOKING__MENU_OPTIONS;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__NUMBER_OF_GUESTS = BOOKING__NUMBER_OF_GUESTS;

	/**
	 * The feature id for the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__BOOKING_DATE = BOOKING__BOOKING_DATE;

	/**
	 * The feature id for the '<em><b>Visit Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__VISIT_PURPOSE = BOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING__VISIT_ID = BOOKING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Venue Visit Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING_FEATURE_COUNT = BOOKING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>View Booking Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING___VIEW_BOOKING_INFO = BOOKING___VIEW_BOOKING_INFO;

	/**
	 * The operation id for the '<em>Send Venue Visit Booking Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING___SEND_VENUE_VISIT_BOOKING_EMAIL = BOOKING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Venue Visit Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_VISIT_BOOKING_OPERATION_COUNT = BOOKING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.EventBookingImpl <em>Event Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.EventBookingImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getEventBooking()
	 * @generated
	 */
	int EVENT_BOOKING = 8;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__BOOKING_ID = BOOKING__BOOKING_ID;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__BOOKING_STATUS = BOOKING__BOOKING_STATUS;

	/**
	 * The feature id for the '<em><b>Booking By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__BOOKING_BY = BOOKING__BOOKING_BY;

	/**
	 * The feature id for the '<em><b>Has Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__HAS_REVIEWS = BOOKING__HAS_REVIEWS;

	/**
	 * The feature id for the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__BOOKING_TYPE = BOOKING__BOOKING_TYPE;

	/**
	 * The feature id for the '<em><b>Hosted At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__HOSTED_AT = BOOKING__HOSTED_AT;

	/**
	 * The feature id for the '<em><b>Menu Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__MENU_OPTIONS = BOOKING__MENU_OPTIONS;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__NUMBER_OF_GUESTS = BOOKING__NUMBER_OF_GUESTS;

	/**
	 * The feature id for the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__BOOKING_DATE = BOOKING__BOOKING_DATE;

	/**
	 * The feature id for the '<em><b>Estimated Price Quote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__ESTIMATED_PRICE_QUOTE = BOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__APPROVED_BY = BOOKING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING__EVENT_DESCRIPTION = BOOKING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING_FEATURE_COUNT = BOOKING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>View Booking Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING___VIEW_BOOKING_INFO = BOOKING___VIEW_BOOKING_INFO;

	/**
	 * The operation id for the '<em>Calculate Final Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING___CALCULATE_FINAL_PRICE = BOOKING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BOOKING_OPERATION_COUNT = BOOKING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.MenuTastingBookingImpl <em>Menu Tasting Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.MenuTastingBookingImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getMenuTastingBooking()
	 * @generated
	 */
	int MENU_TASTING_BOOKING = 9;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__BOOKING_ID = BOOKING__BOOKING_ID;

	/**
	 * The feature id for the '<em><b>Booking Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__BOOKING_STATUS = BOOKING__BOOKING_STATUS;

	/**
	 * The feature id for the '<em><b>Booking By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__BOOKING_BY = BOOKING__BOOKING_BY;

	/**
	 * The feature id for the '<em><b>Has Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__HAS_REVIEWS = BOOKING__HAS_REVIEWS;

	/**
	 * The feature id for the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__BOOKING_TYPE = BOOKING__BOOKING_TYPE;

	/**
	 * The feature id for the '<em><b>Hosted At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__HOSTED_AT = BOOKING__HOSTED_AT;

	/**
	 * The feature id for the '<em><b>Menu Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__MENU_OPTIONS = BOOKING__MENU_OPTIONS;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__NUMBER_OF_GUESTS = BOOKING__NUMBER_OF_GUESTS;

	/**
	 * The feature id for the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__BOOKING_DATE = BOOKING__BOOKING_DATE;

	/**
	 * The feature id for the '<em><b>Menu Tasting Visit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID = BOOKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu Tasting Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING_FEATURE_COUNT = BOOKING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>View Booking Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING___VIEW_BOOKING_INFO = BOOKING___VIEW_BOOKING_INFO;

	/**
	 * The operation id for the '<em>Send Menu Tasting Visit Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING___SEND_MENU_TASTING_VISIT_EMAIL = BOOKING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Tasting Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_TASTING_BOOKING_OPERATION_COUNT = BOOKING_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see gendev.hw1.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see gendev.hw1.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see gendev.hw1.Customer#getPhone()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Phone();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getCustomerBookingID <em>Customer Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Booking ID</em>'.
	 * @see gendev.hw1.Customer#getCustomerBookingID()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerBookingID();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Customer#getSubmits <em>Submits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submits</em>'.
	 * @see gendev.hw1.Customer#getSubmits()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Submits();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Customer#submitReview() <em>Submit Review</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit Review</em>' operation.
	 * @see gendev.hw1.Customer#submitReview()
	 * @generated
	 */
	EOperation getCustomer__SubmitReview();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Customer#createBooking() <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see gendev.hw1.Customer#createBooking()
	 * @generated
	 */
	EOperation getCustomer__CreateBooking();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Customer#cancelBooking() <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see gendev.hw1.Customer#cancelBooking()
	 * @generated
	 */
	EOperation getCustomer__CancelBooking();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Customer#null_(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Null </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Null </em>' operation.
	 * @see gendev.hw1.Customer#null_(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCustomer__Null___DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see gendev.hw1.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Review#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see gendev.hw1.Review#getRating()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Rating();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Review#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see gendev.hw1.Review#getComment()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Comment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Review#getReviewBookingID <em>Review Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Booking ID</em>'.
	 * @see gendev.hw1.Review#getReviewBookingID()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_ReviewBookingID();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Review#getSubmittedBy <em>Submitted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Submitted By</em>'.
	 * @see gendev.hw1.Review#getSubmittedBy()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_SubmittedBy();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Review#getReviewID <em>Review ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review ID</em>'.
	 * @see gendev.hw1.Review#getReviewID()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_ReviewID();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Venue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venue</em>'.
	 * @see gendev.hw1.Venue
	 * @generated
	 */
	EClass getVenue();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see gendev.hw1.Venue#getLocation()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_Location();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see gendev.hw1.Venue#getCapacity()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_Capacity();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Venue#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see gendev.hw1.Venue#getBookings()
	 * @see #getVenue()
	 * @generated
	 */
	EReference getVenue_Bookings();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getVenueID <em>Venue ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue ID</em>'.
	 * @see gendev.hw1.Venue#getVenueID()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_VenueID();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Venue#checkAvailibility() <em>Check Availibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Availibility</em>' operation.
	 * @see gendev.hw1.Venue#checkAvailibility()
	 * @generated
	 */
	EOperation getVenue__CheckAvailibility();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Venue#null_(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Null </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Null </em>' operation.
	 * @see gendev.hw1.Venue#null_(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVenue__Null___DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.SystemAdmin <em>System Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Admin</em>'.
	 * @see gendev.hw1.SystemAdmin
	 * @generated
	 */
	EClass getSystemAdmin();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.SystemAdmin#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see gendev.hw1.SystemAdmin#getPhone()
	 * @see #getSystemAdmin()
	 * @generated
	 */
	EAttribute getSystemAdmin_Phone();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.SystemAdmin#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see gendev.hw1.SystemAdmin#getEmail()
	 * @see #getSystemAdmin()
	 * @generated
	 */
	EAttribute getSystemAdmin_Email();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.SystemAdmin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.SystemAdmin#getName()
	 * @see #getSystemAdmin()
	 * @generated
	 */
	EAttribute getSystemAdmin_Name();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.SystemAdmin#getVenuesManaged <em>Venues Managed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Venues Managed</em>'.
	 * @see gendev.hw1.SystemAdmin#getVenuesManaged()
	 * @see #getSystemAdmin()
	 * @generated
	 */
	EReference getSystemAdmin_VenuesManaged();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.SystemAdmin#getAdminID <em>Admin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin ID</em>'.
	 * @see gendev.hw1.SystemAdmin#getAdminID()
	 * @see #getSystemAdmin()
	 * @generated
	 */
	EAttribute getSystemAdmin_AdminID();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.BookingAdmin <em>Booking Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Admin</em>'.
	 * @see gendev.hw1.BookingAdmin
	 * @generated
	 */
	EClass getBookingAdmin();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.BookingAdmin#getApprovedBookings <em>Approved Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Approved Bookings</em>'.
	 * @see gendev.hw1.BookingAdmin#getApprovedBookings()
	 * @see #getBookingAdmin()
	 * @generated
	 */
	EReference getBookingAdmin_ApprovedBookings();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.BookingAdmin#getNumberOfApprovals <em>Number Of Approvals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Approvals</em>'.
	 * @see gendev.hw1.BookingAdmin#getNumberOfApprovals()
	 * @see #getBookingAdmin()
	 * @generated
	 */
	EAttribute getBookingAdmin_NumberOfApprovals();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.BookingAdmin#approveCustomerBooking() <em>Approve Customer Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approve Customer Booking</em>' operation.
	 * @see gendev.hw1.BookingAdmin#approveCustomerBooking()
	 * @generated
	 */
	EOperation getBookingAdmin__ApproveCustomerBooking();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.BookingAdmin#null_(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Null </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Null </em>' operation.
	 * @see gendev.hw1.BookingAdmin#null_(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBookingAdmin__Null___DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see gendev.hw1.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see gendev.hw1.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Booking#getBookingDate <em>Booking Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Date</em>'.
	 * @see gendev.hw1.Booking#getBookingDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingDate();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Booking#getBookingStatus <em>Booking Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Status</em>'.
	 * @see gendev.hw1.Booking#getBookingStatus()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingStatus();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Booking#getBookingBy <em>Booking By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking By</em>'.
	 * @see gendev.hw1.Booking#getBookingBy()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_BookingBy();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Booking#getHasReviews <em>Has Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Reviews</em>'.
	 * @see gendev.hw1.Booking#getHasReviews()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_HasReviews();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Booking#getBookingType <em>Booking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Type</em>'.
	 * @see gendev.hw1.Booking#getBookingType()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingType();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Booking#getHostedAt <em>Hosted At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hosted At</em>'.
	 * @see gendev.hw1.Booking#getHostedAt()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_HostedAt();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Booking#getMenuOptions <em>Menu Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Options</em>'.
	 * @see gendev.hw1.Booking#getMenuOptions()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_MenuOptions();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Booking#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see gendev.hw1.Booking#getNumberOfGuests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NumberOfGuests();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Booking#viewBookingInfo() <em>View Booking Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Booking Info</em>' operation.
	 * @see gendev.hw1.Booking#viewBookingInfo()
	 * @generated
	 */
	EOperation getBooking__ViewBookingInfo();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see gendev.hw1.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getAmountPaid <em>Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Paid</em>'.
	 * @see gendev.hw1.Payment#getAmountPaid()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_AmountPaid();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see gendev.hw1.Payment#getPaymentMethod()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see gendev.hw1.Payment#getPaymentStatus()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentStatus();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Payment#getPaidFor <em>Paid For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paid For</em>'.
	 * @see gendev.hw1.Payment#getPaidFor()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaidFor();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPaymentID <em>Payment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment ID</em>'.
	 * @see gendev.hw1.Payment#getPaymentID()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getAmountRefunded <em>Amount Refunded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Refunded</em>'.
	 * @see gendev.hw1.Payment#getAmountRefunded()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_AmountRefunded();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type</em>'.
	 * @see gendev.hw1.Payment#getPaymentType()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentType();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Payment#processPayment() <em>Process Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process Payment</em>' operation.
	 * @see gendev.hw1.Payment#processPayment()
	 * @generated
	 */
	EOperation getPayment__ProcessPayment();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Payment#refundPayment() <em>Refund Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refund Payment</em>' operation.
	 * @see gendev.hw1.Payment#refundPayment()
	 * @generated
	 */
	EOperation getPayment__RefundPayment();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Payment#sentPaymentReceiptEmail() <em>Sent Payment Receipt Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sent Payment Receipt Email</em>' operation.
	 * @see gendev.hw1.Payment#sentPaymentReceiptEmail()
	 * @generated
	 */
	EOperation getPayment__SentPaymentReceiptEmail();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.VenueVisitBooking <em>Venue Visit Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venue Visit Booking</em>'.
	 * @see gendev.hw1.VenueVisitBooking
	 * @generated
	 */
	EClass getVenueVisitBooking();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.VenueVisitBooking#getVisitPurpose <em>Visit Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Purpose</em>'.
	 * @see gendev.hw1.VenueVisitBooking#getVisitPurpose()
	 * @see #getVenueVisitBooking()
	 * @generated
	 */
	EAttribute getVenueVisitBooking_VisitPurpose();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.VenueVisitBooking#getVisitID <em>Visit ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit ID</em>'.
	 * @see gendev.hw1.VenueVisitBooking#getVisitID()
	 * @see #getVenueVisitBooking()
	 * @generated
	 */
	EAttribute getVenueVisitBooking_VisitID();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.VenueVisitBooking#sendVenueVisitBookingEmail() <em>Send Venue Visit Booking Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Venue Visit Booking Email</em>' operation.
	 * @see gendev.hw1.VenueVisitBooking#sendVenueVisitBookingEmail()
	 * @generated
	 */
	EOperation getVenueVisitBooking__SendVenueVisitBookingEmail();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.EventBooking <em>Event Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Booking</em>'.
	 * @see gendev.hw1.EventBooking
	 * @generated
	 */
	EClass getEventBooking();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.EventBooking#getEstimatedPriceQuote <em>Estimated Price Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Price Quote</em>'.
	 * @see gendev.hw1.EventBooking#getEstimatedPriceQuote()
	 * @see #getEventBooking()
	 * @generated
	 */
	EAttribute getEventBooking_EstimatedPriceQuote();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.EventBooking#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approved By</em>'.
	 * @see gendev.hw1.EventBooking#getApprovedBy()
	 * @see #getEventBooking()
	 * @generated
	 */
	EReference getEventBooking_ApprovedBy();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.EventBooking#getEventDescription <em>Event Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Description</em>'.
	 * @see gendev.hw1.EventBooking#getEventDescription()
	 * @see #getEventBooking()
	 * @generated
	 */
	EAttribute getEventBooking_EventDescription();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.EventBooking#calculateFinalPrice() <em>Calculate Final Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Final Price</em>' operation.
	 * @see gendev.hw1.EventBooking#calculateFinalPrice()
	 * @generated
	 */
	EOperation getEventBooking__CalculateFinalPrice();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.MenuTastingBooking <em>Menu Tasting Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Tasting Booking</em>'.
	 * @see gendev.hw1.MenuTastingBooking
	 * @generated
	 */
	EClass getMenuTastingBooking();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.MenuTastingBooking#getMenuTastingVisitID <em>Menu Tasting Visit ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Tasting Visit ID</em>'.
	 * @see gendev.hw1.MenuTastingBooking#getMenuTastingVisitID()
	 * @see #getMenuTastingBooking()
	 * @generated
	 */
	EAttribute getMenuTastingBooking_MenuTastingVisitID();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.MenuTastingBooking#sendMenuTastingVisitEmail() <em>Send Menu Tasting Visit Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Menu Tasting Visit Email</em>' operation.
	 * @see gendev.hw1.MenuTastingBooking#sendMenuTastingVisitEmail()
	 * @generated
	 */
	EOperation getMenuTastingBooking__SendMenuTastingVisitEmail();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CustomerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE = eINSTANCE.getCustomer_Phone();

		/**
		 * The meta object literal for the '<em><b>Customer Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_BOOKING_ID = eINSTANCE.getCustomer_CustomerBookingID();

		/**
		 * The meta object literal for the '<em><b>Submits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__SUBMITS = eINSTANCE.getCustomer_Submits();

		/**
		 * The meta object literal for the '<em><b>Submit Review</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___SUBMIT_REVIEW = eINSTANCE.getCustomer__SubmitReview();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___CREATE_BOOKING = eINSTANCE.getCustomer__CreateBooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___CANCEL_BOOKING = eINSTANCE.getCustomer__CancelBooking();

		/**
		 * The meta object literal for the '<em><b>Null </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___NULL____DIAGNOSTICCHAIN_MAP = eINSTANCE.getCustomer__Null___DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ReviewImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__RATING = eINSTANCE.getReview_Rating();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__COMMENT = eINSTANCE.getReview_Comment();

		/**
		 * The meta object literal for the '<em><b>Review Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__REVIEW_BOOKING_ID = eINSTANCE.getReview_ReviewBookingID();

		/**
		 * The meta object literal for the '<em><b>Submitted By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__SUBMITTED_BY = eINSTANCE.getReview_SubmittedBy();

		/**
		 * The meta object literal for the '<em><b>Review ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__REVIEW_ID = eINSTANCE.getReview_ReviewID();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.VenueImpl <em>Venue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.VenueImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getVenue()
		 * @generated
		 */
		EClass VENUE = eINSTANCE.getVenue();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__LOCATION = eINSTANCE.getVenue_Location();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__CAPACITY = eINSTANCE.getVenue_Capacity();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENUE__BOOKINGS = eINSTANCE.getVenue_Bookings();

		/**
		 * The meta object literal for the '<em><b>Venue ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__VENUE_ID = eINSTANCE.getVenue_VenueID();

		/**
		 * The meta object literal for the '<em><b>Check Availibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENUE___CHECK_AVAILIBILITY = eINSTANCE.getVenue__CheckAvailibility();

		/**
		 * The meta object literal for the '<em><b>Null </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENUE___NULL____DIAGNOSTICCHAIN_MAP = eINSTANCE.getVenue__Null___DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.SystemAdminImpl <em>System Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.SystemAdminImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getSystemAdmin()
		 * @generated
		 */
		EClass SYSTEM_ADMIN = eINSTANCE.getSystemAdmin();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADMIN__PHONE = eINSTANCE.getSystemAdmin_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADMIN__EMAIL = eINSTANCE.getSystemAdmin_Email();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADMIN__NAME = eINSTANCE.getSystemAdmin_Name();

		/**
		 * The meta object literal for the '<em><b>Venues Managed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ADMIN__VENUES_MANAGED = eINSTANCE.getSystemAdmin_VenuesManaged();

		/**
		 * The meta object literal for the '<em><b>Admin ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADMIN__ADMIN_ID = eINSTANCE.getSystemAdmin_AdminID();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.BookingAdminImpl <em>Booking Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.BookingAdminImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getBookingAdmin()
		 * @generated
		 */
		EClass BOOKING_ADMIN = eINSTANCE.getBookingAdmin();

		/**
		 * The meta object literal for the '<em><b>Approved Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_ADMIN__APPROVED_BOOKINGS = eINSTANCE.getBookingAdmin_ApprovedBookings();

		/**
		 * The meta object literal for the '<em><b>Number Of Approvals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_ADMIN__NUMBER_OF_APPROVALS = eINSTANCE.getBookingAdmin_NumberOfApprovals();

		/**
		 * The meta object literal for the '<em><b>Approve Customer Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_ADMIN___APPROVE_CUSTOMER_BOOKING = eINSTANCE.getBookingAdmin__ApproveCustomerBooking();

		/**
		 * The meta object literal for the '<em><b>Null </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_ADMIN___NULL____DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getBookingAdmin__Null___DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.BookingImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Booking Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_DATE = eINSTANCE.getBooking_BookingDate();

		/**
		 * The meta object literal for the '<em><b>Booking Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_STATUS = eINSTANCE.getBooking_BookingStatus();

		/**
		 * The meta object literal for the '<em><b>Booking By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BOOKING_BY = eINSTANCE.getBooking_BookingBy();

		/**
		 * The meta object literal for the '<em><b>Has Reviews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__HAS_REVIEWS = eINSTANCE.getBooking_HasReviews();

		/**
		 * The meta object literal for the '<em><b>Booking Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_TYPE = eINSTANCE.getBooking_BookingType();

		/**
		 * The meta object literal for the '<em><b>Hosted At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__HOSTED_AT = eINSTANCE.getBooking_HostedAt();

		/**
		 * The meta object literal for the '<em><b>Menu Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__MENU_OPTIONS = eINSTANCE.getBooking_MenuOptions();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NUMBER_OF_GUESTS = eINSTANCE.getBooking_NumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>View Booking Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___VIEW_BOOKING_INFO = eINSTANCE.getBooking__ViewBookingInfo();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PaymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Amount Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT_PAID = eINSTANCE.getPayment_AmountPaid();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_METHOD = eINSTANCE.getPayment_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Payment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_STATUS = eINSTANCE.getPayment_PaymentStatus();

		/**
		 * The meta object literal for the '<em><b>Paid For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAID_FOR = eINSTANCE.getPayment_PaidFor();

		/**
		 * The meta object literal for the '<em><b>Payment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_PaymentID();

		/**
		 * The meta object literal for the '<em><b>Amount Refunded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT_REFUNDED = eINSTANCE.getPayment_AmountRefunded();

		/**
		 * The meta object literal for the '<em><b>Payment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_TYPE = eINSTANCE.getPayment_PaymentType();

		/**
		 * The meta object literal for the '<em><b>Process Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___PROCESS_PAYMENT = eINSTANCE.getPayment__ProcessPayment();

		/**
		 * The meta object literal for the '<em><b>Refund Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___REFUND_PAYMENT = eINSTANCE.getPayment__RefundPayment();

		/**
		 * The meta object literal for the '<em><b>Sent Payment Receipt Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___SENT_PAYMENT_RECEIPT_EMAIL = eINSTANCE.getPayment__SentPaymentReceiptEmail();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.VenueVisitBookingImpl <em>Venue Visit Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.VenueVisitBookingImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getVenueVisitBooking()
		 * @generated
		 */
		EClass VENUE_VISIT_BOOKING = eINSTANCE.getVenueVisitBooking();

		/**
		 * The meta object literal for the '<em><b>Visit Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE_VISIT_BOOKING__VISIT_PURPOSE = eINSTANCE.getVenueVisitBooking_VisitPurpose();

		/**
		 * The meta object literal for the '<em><b>Visit ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE_VISIT_BOOKING__VISIT_ID = eINSTANCE.getVenueVisitBooking_VisitID();

		/**
		 * The meta object literal for the '<em><b>Send Venue Visit Booking Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENUE_VISIT_BOOKING___SEND_VENUE_VISIT_BOOKING_EMAIL = eINSTANCE
				.getVenueVisitBooking__SendVenueVisitBookingEmail();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.EventBookingImpl <em>Event Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.EventBookingImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getEventBooking()
		 * @generated
		 */
		EClass EVENT_BOOKING = eINSTANCE.getEventBooking();

		/**
		 * The meta object literal for the '<em><b>Estimated Price Quote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BOOKING__ESTIMATED_PRICE_QUOTE = eINSTANCE.getEventBooking_EstimatedPriceQuote();

		/**
		 * The meta object literal for the '<em><b>Approved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BOOKING__APPROVED_BY = eINSTANCE.getEventBooking_ApprovedBy();

		/**
		 * The meta object literal for the '<em><b>Event Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BOOKING__EVENT_DESCRIPTION = eINSTANCE.getEventBooking_EventDescription();

		/**
		 * The meta object literal for the '<em><b>Calculate Final Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_BOOKING___CALCULATE_FINAL_PRICE = eINSTANCE.getEventBooking__CalculateFinalPrice();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.MenuTastingBookingImpl <em>Menu Tasting Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.MenuTastingBookingImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getMenuTastingBooking()
		 * @generated
		 */
		EClass MENU_TASTING_BOOKING = eINSTANCE.getMenuTastingBooking();

		/**
		 * The meta object literal for the '<em><b>Menu Tasting Visit ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID = eINSTANCE.getMenuTastingBooking_MenuTastingVisitID();

		/**
		 * The meta object literal for the '<em><b>Send Menu Tasting Visit Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MENU_TASTING_BOOKING___SEND_MENU_TASTING_VISIT_EMAIL = eINSTANCE
				.getMenuTastingBooking__SendMenuTastingVisitEmail();

	}

} //Hw1Package
