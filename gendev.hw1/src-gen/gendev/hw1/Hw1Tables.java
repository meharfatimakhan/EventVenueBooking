/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /gendev.hw1/model/hw1.ecore
 * using:
 *   /gendev.hw1/model/hw1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package gendev.hw1;

// import gendev.hw1.Hw1Package;
// import gendev.hw1.Hw1Tables;
import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Hw1Tables provides the dispatch tables for the hw1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Hw1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Hw1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Orphanage", "orphanage", null);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_hw1 = IdManager.getNsURIPackageId("http://www.example.org/hw1", null, Hw1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Booking = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Booking", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BookingAdmin = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("BookingAdmin", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Hw1Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Customer = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Customer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EventBooking = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("EventBooking", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Review = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Review", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SystemAdmin = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("SystemAdmin", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Venue = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Venue", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Calendar = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getDataTypeId("Calendar", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EEList = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage.getDataTypeId("EEList", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_10 = ValueUtil.integerValueOf("10");
	public static final /*@NonInvalid*/ IntegerValue INT_5 = ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ String STR_Fully_32_Booked = "Fully Booked";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Booking = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Booking);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Payment = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Payment);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SystemAdmin = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_SystemAdmin);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Booking = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Booking);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EventBooking = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_EventBooking);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Review = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Review);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Venue = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Venue);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Customer = TypeId.SET.getSpecializedId(Hw1Tables.CLSSid_Customer);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Hw1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Booking = new EcoreExecutorType(Hw1Package.Literals.BOOKING, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _BookingAdmin = new EcoreExecutorType(Hw1Package.Literals.BOOKING_ADMIN, PACKAGE, 0);
		public static final EcoreExecutorType _Calendar = new EcoreExecutorType("Calendar", PACKAGE, 0);
		public static final EcoreExecutorType _Customer = new EcoreExecutorType(Hw1Package.Literals.CUSTOMER, PACKAGE, 0);
		public static final EcoreExecutorType _EventBooking = new EcoreExecutorType(Hw1Package.Literals.EVENT_BOOKING, PACKAGE, 0);
		public static final EcoreExecutorType _MenuTastingBooking = new EcoreExecutorType(Hw1Package.Literals.MENU_TASTING_BOOKING, PACKAGE, 0);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(Hw1Package.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Review = new EcoreExecutorType(Hw1Package.Literals.REVIEW, PACKAGE, 0);
		public static final EcoreExecutorType _SystemAdmin = new EcoreExecutorType(Hw1Package.Literals.SYSTEM_ADMIN, PACKAGE, 0);
		public static final EcoreExecutorType _Venue = new EcoreExecutorType(Hw1Package.Literals.VENUE, PACKAGE, 0);
		public static final EcoreExecutorType _VenueVisitBooking = new EcoreExecutorType(Hw1Package.Literals.VENUE_VISIT_BOOKING, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Booking,
			_BookingAdmin,
			_Calendar,
			_Customer,
			_EventBooking,
			_MenuTastingBooking,
			_Payment,
			_Review,
			_SystemAdmin,
			_Venue,
			_VenueVisitBooking
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Booking__Booking = new ExecutorFragment(Types._Booking, Hw1Tables.Types._Booking);
		private static final ExecutorFragment _Booking__OclAny = new ExecutorFragment(Types._Booking, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Booking__OclElement = new ExecutorFragment(Types._Booking, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BookingAdmin__BookingAdmin = new ExecutorFragment(Types._BookingAdmin, Hw1Tables.Types._BookingAdmin);
		private static final ExecutorFragment _BookingAdmin__OclAny = new ExecutorFragment(Types._BookingAdmin, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BookingAdmin__OclElement = new ExecutorFragment(Types._BookingAdmin, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BookingAdmin__SystemAdmin = new ExecutorFragment(Types._BookingAdmin, Hw1Tables.Types._SystemAdmin);

		private static final ExecutorFragment _Calendar__Calendar = new ExecutorFragment(Types._Calendar, Hw1Tables.Types._Calendar);
		private static final ExecutorFragment _Calendar__OclAny = new ExecutorFragment(Types._Calendar, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Calendar__OclComparable = new ExecutorFragment(Types._Calendar, OCLstdlibTables.Types._OclComparable);

		private static final ExecutorFragment _Customer__Customer = new ExecutorFragment(Types._Customer, Hw1Tables.Types._Customer);
		private static final ExecutorFragment _Customer__OclAny = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Customer__OclElement = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EventBooking__Booking = new ExecutorFragment(Types._EventBooking, Hw1Tables.Types._Booking);
		private static final ExecutorFragment _EventBooking__EventBooking = new ExecutorFragment(Types._EventBooking, Hw1Tables.Types._EventBooking);
		private static final ExecutorFragment _EventBooking__OclAny = new ExecutorFragment(Types._EventBooking, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EventBooking__OclElement = new ExecutorFragment(Types._EventBooking, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MenuTastingBooking__Booking = new ExecutorFragment(Types._MenuTastingBooking, Hw1Tables.Types._Booking);
		private static final ExecutorFragment _MenuTastingBooking__MenuTastingBooking = new ExecutorFragment(Types._MenuTastingBooking, Hw1Tables.Types._MenuTastingBooking);
		private static final ExecutorFragment _MenuTastingBooking__OclAny = new ExecutorFragment(Types._MenuTastingBooking, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MenuTastingBooking__OclElement = new ExecutorFragment(Types._MenuTastingBooking, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, Hw1Tables.Types._Payment);

		private static final ExecutorFragment _Review__OclAny = new ExecutorFragment(Types._Review, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Review__OclElement = new ExecutorFragment(Types._Review, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Review__Review = new ExecutorFragment(Types._Review, Hw1Tables.Types._Review);

		private static final ExecutorFragment _SystemAdmin__OclAny = new ExecutorFragment(Types._SystemAdmin, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SystemAdmin__OclElement = new ExecutorFragment(Types._SystemAdmin, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SystemAdmin__SystemAdmin = new ExecutorFragment(Types._SystemAdmin, Hw1Tables.Types._SystemAdmin);

		private static final ExecutorFragment _Venue__OclAny = new ExecutorFragment(Types._Venue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Venue__OclElement = new ExecutorFragment(Types._Venue, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Venue__Venue = new ExecutorFragment(Types._Venue, Hw1Tables.Types._Venue);

		private static final ExecutorFragment _VenueVisitBooking__Booking = new ExecutorFragment(Types._VenueVisitBooking, Hw1Tables.Types._Booking);
		private static final ExecutorFragment _VenueVisitBooking__OclAny = new ExecutorFragment(Types._VenueVisitBooking, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VenueVisitBooking__OclElement = new ExecutorFragment(Types._VenueVisitBooking, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VenueVisitBooking__VenueVisitBooking = new ExecutorFragment(Types._VenueVisitBooking, Hw1Tables.Types._VenueVisitBooking);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Booking__viewBookingInfo = new ExecutorOperation("viewBookingInfo", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Booking,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _BookingAdmin__approveCustomerBooking = new ExecutorOperation("approveCustomerBooking", TypeUtil.EMPTY_PARAMETER_TYPES, Types._BookingAdmin,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Calendar__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._Calendar,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Customer__cancelBooking = new ExecutorOperation("cancelBooking", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Customer,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Customer__createBooking = new ExecutorOperation("createBooking", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Customer,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Customer__submitReview = new ExecutorOperation("submitReview", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Customer,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _EventBooking__calculateFinalPrice = new ExecutorOperation("calculateFinalPrice", TypeUtil.EMPTY_PARAMETER_TYPES, Types._EventBooking,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _MenuTastingBooking__sendMenuTastingVisitEmail = new ExecutorOperation("sendMenuTastingVisitEmail", TypeUtil.EMPTY_PARAMETER_TYPES, Types._MenuTastingBooking,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Payment__processPayment = new ExecutorOperation("processPayment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Payment,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Payment__refundPayment = new ExecutorOperation("refundPayment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Payment,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Payment__sentPaymentReceiptEmail = new ExecutorOperation("sentPaymentReceiptEmail", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Payment,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Venue__checkAvailibility = new ExecutorOperation("checkAvailibility", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Venue,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _VenueVisitBooking__sendVenueVisitBookingEmail = new ExecutorOperation("sendVenueVisitBookingEmail", TypeUtil.EMPTY_PARAMETER_TYPES, Types._VenueVisitBooking,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Booking__BookingDate = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__BOOKING_DATE, Types._Booking, 0);
		public static final ExecutorProperty _Booking__BookingID = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__BOOKING_ID, Types._Booking, 1);
		public static final ExecutorProperty _Booking__BookingStatus = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__BOOKING_STATUS, Types._Booking, 2);
		public static final ExecutorProperty _Booking__BookingType = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__BOOKING_TYPE, Types._Booking, 3);
		public static final ExecutorProperty _Booking__MenuOptions = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__MENU_OPTIONS, Types._Booking, 4);
		public static final ExecutorProperty _Booking__NumberOfGuests = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__NUMBER_OF_GUESTS, Types._Booking, 5);
		public static final ExecutorProperty _Booking__bookingBy = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__BOOKING_BY, Types._Booking, 6);
		public static final ExecutorProperty _Booking__hasReviews = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__HAS_REVIEWS, Types._Booking, 7);
		public static final ExecutorProperty _Booking__hostedAt = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING__HOSTED_AT, Types._Booking, 8);

		public static final ExecutorProperty _BookingAdmin__NumberOfApprovals = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING_ADMIN__NUMBER_OF_APPROVALS, Types._BookingAdmin, 0);
		public static final ExecutorProperty _BookingAdmin__approvedBookings = new EcoreExecutorProperty(Hw1Package.Literals.BOOKING_ADMIN__APPROVED_BOOKINGS, Types._BookingAdmin, 1);

		public static final ExecutorProperty _Customer__CustomerBookingID = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__CUSTOMER_BOOKING_ID, Types._Customer, 0);
		public static final ExecutorProperty _Customer__Email = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__EMAIL, Types._Customer, 1);
		public static final ExecutorProperty _Customer__Name = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__NAME, Types._Customer, 2);
		public static final ExecutorProperty _Customer__Phone = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__PHONE, Types._Customer, 3);
		public static final ExecutorProperty _Customer__submits = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__SUBMITS, Types._Customer, 4);
		public static final ExecutorProperty _Customer__Booking__bookingBy = new ExecutorPropertyWithImplementation("Booking", Types._Customer, 5, new EcoreLibraryOppositeProperty(Hw1Package.Literals.BOOKING__BOOKING_BY));

		public static final ExecutorProperty _EventBooking__EstimatedPriceQuote = new EcoreExecutorProperty(Hw1Package.Literals.EVENT_BOOKING__ESTIMATED_PRICE_QUOTE, Types._EventBooking, 0);
		public static final ExecutorProperty _EventBooking__EventDescription = new EcoreExecutorProperty(Hw1Package.Literals.EVENT_BOOKING__EVENT_DESCRIPTION, Types._EventBooking, 1);
		public static final ExecutorProperty _EventBooking__approvedBy = new EcoreExecutorProperty(Hw1Package.Literals.EVENT_BOOKING__APPROVED_BY, Types._EventBooking, 2);
		public static final ExecutorProperty _EventBooking__Payment__paidFor = new ExecutorPropertyWithImplementation("Payment", Types._EventBooking, 3, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PAYMENT__PAID_FOR));

		public static final ExecutorProperty _MenuTastingBooking__MenuTastingVisitID = new EcoreExecutorProperty(Hw1Package.Literals.MENU_TASTING_BOOKING__MENU_TASTING_VISIT_ID, Types._MenuTastingBooking, 0);

		public static final ExecutorProperty _Payment__AmountPaid = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__AMOUNT_PAID, Types._Payment, 0);
		public static final ExecutorProperty _Payment__AmountRefunded = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__AMOUNT_REFUNDED, Types._Payment, 1);
		public static final ExecutorProperty _Payment__PaymentID = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PAYMENT_ID, Types._Payment, 2);
		public static final ExecutorProperty _Payment__PaymentMethod = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PAYMENT_METHOD, Types._Payment, 3);
		public static final ExecutorProperty _Payment__PaymentStatus = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PAYMENT_STATUS, Types._Payment, 4);
		public static final ExecutorProperty _Payment__PaymentType = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PAYMENT_TYPE, Types._Payment, 5);
		public static final ExecutorProperty _Payment__paidFor = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PAID_FOR, Types._Payment, 6);

		public static final ExecutorProperty _Review__Comment = new EcoreExecutorProperty(Hw1Package.Literals.REVIEW__COMMENT, Types._Review, 0);
		public static final ExecutorProperty _Review__Rating = new EcoreExecutorProperty(Hw1Package.Literals.REVIEW__RATING, Types._Review, 1);
		public static final ExecutorProperty _Review__ReviewBookingID = new EcoreExecutorProperty(Hw1Package.Literals.REVIEW__REVIEW_BOOKING_ID, Types._Review, 2);
		public static final ExecutorProperty _Review__ReviewID = new EcoreExecutorProperty(Hw1Package.Literals.REVIEW__REVIEW_ID, Types._Review, 3);
		public static final ExecutorProperty _Review__submittedBy = new EcoreExecutorProperty(Hw1Package.Literals.REVIEW__SUBMITTED_BY, Types._Review, 4);
		public static final ExecutorProperty _Review__Booking__hasReviews = new ExecutorPropertyWithImplementation("Booking", Types._Review, 5, new EcoreLibraryOppositeProperty(Hw1Package.Literals.BOOKING__HAS_REVIEWS));

		public static final ExecutorProperty _SystemAdmin__AdminID = new EcoreExecutorProperty(Hw1Package.Literals.SYSTEM_ADMIN__ADMIN_ID, Types._SystemAdmin, 0);
		public static final ExecutorProperty _SystemAdmin__Email = new EcoreExecutorProperty(Hw1Package.Literals.SYSTEM_ADMIN__EMAIL, Types._SystemAdmin, 1);
		public static final ExecutorProperty _SystemAdmin__Name = new EcoreExecutorProperty(Hw1Package.Literals.SYSTEM_ADMIN__NAME, Types._SystemAdmin, 2);
		public static final ExecutorProperty _SystemAdmin__Phone = new EcoreExecutorProperty(Hw1Package.Literals.SYSTEM_ADMIN__PHONE, Types._SystemAdmin, 3);
		public static final ExecutorProperty _SystemAdmin__venuesManaged = new EcoreExecutorProperty(Hw1Package.Literals.SYSTEM_ADMIN__VENUES_MANAGED, Types._SystemAdmin, 4);

		public static final ExecutorProperty _Venue__Capacity = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__CAPACITY, Types._Venue, 0);
		public static final ExecutorProperty _Venue__Location = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__LOCATION, Types._Venue, 1);
		public static final ExecutorProperty _Venue__VenueID = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__VENUE_ID, Types._Venue, 2);
		public static final ExecutorProperty _Venue__bookings = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__BOOKINGS, Types._Venue, 3);
		public static final ExecutorProperty _Venue__SystemAdmin__venuesManaged = new ExecutorPropertyWithImplementation("SystemAdmin", Types._Venue, 4, new EcoreLibraryOppositeProperty(Hw1Package.Literals.SYSTEM_ADMIN__VENUES_MANAGED));

		public static final ExecutorProperty _VenueVisitBooking__VisitID = new EcoreExecutorProperty(Hw1Package.Literals.VENUE_VISIT_BOOKING__VISIT_ID, Types._VenueVisitBooking, 0);
		public static final ExecutorProperty _VenueVisitBooking__VisitPurpose = new EcoreExecutorProperty(Hw1Package.Literals.VENUE_VISIT_BOOKING__VISIT_PURPOSE, Types._VenueVisitBooking, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Booking =
			{
				Fragments._Booking__OclAny /* 0 */,
				Fragments._Booking__OclElement /* 1 */,
				Fragments._Booking__Booking /* 2 */
			};
		private static final int /*@NonNull*/ [] __Booking = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BookingAdmin =
			{
				Fragments._BookingAdmin__OclAny /* 0 */,
				Fragments._BookingAdmin__OclElement /* 1 */,
				Fragments._BookingAdmin__SystemAdmin /* 2 */,
				Fragments._BookingAdmin__BookingAdmin /* 3 */
			};
		private static final int /*@NonNull*/ [] __BookingAdmin = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Calendar =
			{
				Fragments._Calendar__OclAny /* 0 */,
				Fragments._Calendar__OclComparable /* 1 */,
				Fragments._Calendar__Calendar /* 2 */
			};
		private static final int /*@NonNull*/ [] __Calendar = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Customer =
			{
				Fragments._Customer__OclAny /* 0 */,
				Fragments._Customer__OclElement /* 1 */,
				Fragments._Customer__Customer /* 2 */
			};
		private static final int /*@NonNull*/ [] __Customer = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EventBooking =
			{
				Fragments._EventBooking__OclAny /* 0 */,
				Fragments._EventBooking__OclElement /* 1 */,
				Fragments._EventBooking__Booking /* 2 */,
				Fragments._EventBooking__EventBooking /* 3 */
			};
		private static final int /*@NonNull*/ [] __EventBooking = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MenuTastingBooking =
			{
				Fragments._MenuTastingBooking__OclAny /* 0 */,
				Fragments._MenuTastingBooking__OclElement /* 1 */,
				Fragments._MenuTastingBooking__Booking /* 2 */,
				Fragments._MenuTastingBooking__MenuTastingBooking /* 3 */
			};
		private static final int /*@NonNull*/ [] __MenuTastingBooking = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__Payment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Review =
			{
				Fragments._Review__OclAny /* 0 */,
				Fragments._Review__OclElement /* 1 */,
				Fragments._Review__Review /* 2 */
			};
		private static final int /*@NonNull*/ [] __Review = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SystemAdmin =
			{
				Fragments._SystemAdmin__OclAny /* 0 */,
				Fragments._SystemAdmin__OclElement /* 1 */,
				Fragments._SystemAdmin__SystemAdmin /* 2 */
			};
		private static final int /*@NonNull*/ [] __SystemAdmin = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Venue =
			{
				Fragments._Venue__OclAny /* 0 */,
				Fragments._Venue__OclElement /* 1 */,
				Fragments._Venue__Venue /* 2 */
			};
		private static final int /*@NonNull*/ [] __Venue = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VenueVisitBooking =
			{
				Fragments._VenueVisitBooking__OclAny /* 0 */,
				Fragments._VenueVisitBooking__OclElement /* 1 */,
				Fragments._VenueVisitBooking__Booking /* 2 */,
				Fragments._VenueVisitBooking__VenueVisitBooking /* 3 */
			};
		private static final int /*@NonNull*/ [] __VenueVisitBooking = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Booking.initFragments(_Booking, __Booking);
			Types._BookingAdmin.initFragments(_BookingAdmin, __BookingAdmin);
			Types._Calendar.initFragments(_Calendar, __Calendar);
			Types._Customer.initFragments(_Customer, __Customer);
			Types._EventBooking.initFragments(_EventBooking, __EventBooking);
			Types._MenuTastingBooking.initFragments(_MenuTastingBooking, __MenuTastingBooking);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._Review.initFragments(_Review, __Review);
			Types._SystemAdmin.initFragments(_SystemAdmin, __SystemAdmin);
			Types._Venue.initFragments(_Venue, __Venue);
			Types._VenueVisitBooking.initFragments(_VenueVisitBooking, __VenueVisitBooking);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Booking__Booking = {
			Hw1Tables.Operations._Booking__viewBookingInfo /* viewBookingInfo() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Booking__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Booking__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BookingAdmin__BookingAdmin = {
			Hw1Tables.Operations._BookingAdmin__approveCustomerBooking /* approveCustomerBooking() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BookingAdmin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BookingAdmin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BookingAdmin__SystemAdmin = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Calendar__Calendar = {
			Hw1Tables.Operations._Calendar__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Calendar__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Calendar__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[1]) */,
			Hw1Tables.Operations._Calendar__compareTo /* compareTo(OclSelf[1]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Customer__Customer = {
			Hw1Tables.Operations._Customer__cancelBooking /* cancelBooking() */,
			Hw1Tables.Operations._Customer__createBooking /* createBooking() */,
			Hw1Tables.Operations._Customer__submitReview /* submitReview() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EventBooking__EventBooking = {
			Hw1Tables.Operations._EventBooking__calculateFinalPrice /* calculateFinalPrice() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EventBooking__Booking = {
			Hw1Tables.Operations._Booking__viewBookingInfo /* viewBookingInfo() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EventBooking__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EventBooking__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MenuTastingBooking__MenuTastingBooking = {
			Hw1Tables.Operations._MenuTastingBooking__sendMenuTastingVisitEmail /* sendMenuTastingVisitEmail() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MenuTastingBooking__Booking = {
			Hw1Tables.Operations._Booking__viewBookingInfo /* viewBookingInfo() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MenuTastingBooking__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MenuTastingBooking__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {
			Hw1Tables.Operations._Payment__processPayment /* processPayment() */,
			Hw1Tables.Operations._Payment__refundPayment /* refundPayment() */,
			Hw1Tables.Operations._Payment__sentPaymentReceiptEmail /* sentPaymentReceiptEmail() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Review__Review = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SystemAdmin__SystemAdmin = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemAdmin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemAdmin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Venue__Venue = {
			Hw1Tables.Operations._Venue__checkAvailibility /* checkAvailibility() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Venue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Venue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VenueVisitBooking__VenueVisitBooking = {
			Hw1Tables.Operations._VenueVisitBooking__sendVenueVisitBookingEmail /* sendVenueVisitBookingEmail() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VenueVisitBooking__Booking = {
			Hw1Tables.Operations._Booking__viewBookingInfo /* viewBookingInfo() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VenueVisitBooking__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VenueVisitBooking__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Booking__Booking.initOperations(_Booking__Booking);
			Fragments._Booking__OclAny.initOperations(_Booking__OclAny);
			Fragments._Booking__OclElement.initOperations(_Booking__OclElement);

			Fragments._BookingAdmin__BookingAdmin.initOperations(_BookingAdmin__BookingAdmin);
			Fragments._BookingAdmin__OclAny.initOperations(_BookingAdmin__OclAny);
			Fragments._BookingAdmin__OclElement.initOperations(_BookingAdmin__OclElement);
			Fragments._BookingAdmin__SystemAdmin.initOperations(_BookingAdmin__SystemAdmin);

			Fragments._Calendar__Calendar.initOperations(_Calendar__Calendar);
			Fragments._Calendar__OclAny.initOperations(_Calendar__OclAny);
			Fragments._Calendar__OclComparable.initOperations(_Calendar__OclComparable);

			Fragments._Customer__Customer.initOperations(_Customer__Customer);
			Fragments._Customer__OclAny.initOperations(_Customer__OclAny);
			Fragments._Customer__OclElement.initOperations(_Customer__OclElement);

			Fragments._EventBooking__Booking.initOperations(_EventBooking__Booking);
			Fragments._EventBooking__EventBooking.initOperations(_EventBooking__EventBooking);
			Fragments._EventBooking__OclAny.initOperations(_EventBooking__OclAny);
			Fragments._EventBooking__OclElement.initOperations(_EventBooking__OclElement);

			Fragments._MenuTastingBooking__Booking.initOperations(_MenuTastingBooking__Booking);
			Fragments._MenuTastingBooking__MenuTastingBooking.initOperations(_MenuTastingBooking__MenuTastingBooking);
			Fragments._MenuTastingBooking__OclAny.initOperations(_MenuTastingBooking__OclAny);
			Fragments._MenuTastingBooking__OclElement.initOperations(_MenuTastingBooking__OclElement);

			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._Review__OclAny.initOperations(_Review__OclAny);
			Fragments._Review__OclElement.initOperations(_Review__OclElement);
			Fragments._Review__Review.initOperations(_Review__Review);

			Fragments._SystemAdmin__OclAny.initOperations(_SystemAdmin__OclAny);
			Fragments._SystemAdmin__OclElement.initOperations(_SystemAdmin__OclElement);
			Fragments._SystemAdmin__SystemAdmin.initOperations(_SystemAdmin__SystemAdmin);

			Fragments._Venue__OclAny.initOperations(_Venue__OclAny);
			Fragments._Venue__OclElement.initOperations(_Venue__OclElement);
			Fragments._Venue__Venue.initOperations(_Venue__Venue);

			Fragments._VenueVisitBooking__Booking.initOperations(_VenueVisitBooking__Booking);
			Fragments._VenueVisitBooking__OclAny.initOperations(_VenueVisitBooking__OclAny);
			Fragments._VenueVisitBooking__OclElement.initOperations(_VenueVisitBooking__OclElement);
			Fragments._VenueVisitBooking__VenueVisitBooking.initOperations(_VenueVisitBooking__VenueVisitBooking);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Booking = {
			Hw1Tables.Properties._Booking__BookingDate,
			Hw1Tables.Properties._Booking__BookingID,
			Hw1Tables.Properties._Booking__BookingStatus,
			Hw1Tables.Properties._Booking__BookingType,
			Hw1Tables.Properties._Booking__MenuOptions,
			Hw1Tables.Properties._Booking__NumberOfGuests,
			Hw1Tables.Properties._Booking__bookingBy,
			Hw1Tables.Properties._Booking__hasReviews,
			Hw1Tables.Properties._Booking__hostedAt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BookingAdmin = {
			Hw1Tables.Properties._SystemAdmin__AdminID,
			Hw1Tables.Properties._SystemAdmin__Email,
			Hw1Tables.Properties._SystemAdmin__Name,
			Hw1Tables.Properties._BookingAdmin__NumberOfApprovals,
			Hw1Tables.Properties._SystemAdmin__Phone,
			Hw1Tables.Properties._BookingAdmin__approvedBookings,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._SystemAdmin__venuesManaged
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Calendar = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Customer = {
			Hw1Tables.Properties._Customer__CustomerBookingID,
			Hw1Tables.Properties._Customer__Email,
			Hw1Tables.Properties._Customer__Name,
			Hw1Tables.Properties._Customer__Phone,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Customer__submits
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EventBooking = {
			Hw1Tables.Properties._Booking__BookingDate,
			Hw1Tables.Properties._Booking__BookingID,
			Hw1Tables.Properties._Booking__BookingStatus,
			Hw1Tables.Properties._Booking__BookingType,
			Hw1Tables.Properties._EventBooking__EstimatedPriceQuote,
			Hw1Tables.Properties._EventBooking__EventDescription,
			Hw1Tables.Properties._Booking__MenuOptions,
			Hw1Tables.Properties._Booking__NumberOfGuests,
			Hw1Tables.Properties._EventBooking__approvedBy,
			Hw1Tables.Properties._Booking__bookingBy,
			Hw1Tables.Properties._Booking__hasReviews,
			Hw1Tables.Properties._Booking__hostedAt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MenuTastingBooking = {
			Hw1Tables.Properties._Booking__BookingDate,
			Hw1Tables.Properties._Booking__BookingID,
			Hw1Tables.Properties._Booking__BookingStatus,
			Hw1Tables.Properties._Booking__BookingType,
			Hw1Tables.Properties._Booking__MenuOptions,
			Hw1Tables.Properties._MenuTastingBooking__MenuTastingVisitID,
			Hw1Tables.Properties._Booking__NumberOfGuests,
			Hw1Tables.Properties._Booking__bookingBy,
			Hw1Tables.Properties._Booking__hasReviews,
			Hw1Tables.Properties._Booking__hostedAt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			Hw1Tables.Properties._Payment__AmountPaid,
			Hw1Tables.Properties._Payment__AmountRefunded,
			Hw1Tables.Properties._Payment__PaymentID,
			Hw1Tables.Properties._Payment__PaymentMethod,
			Hw1Tables.Properties._Payment__PaymentStatus,
			Hw1Tables.Properties._Payment__PaymentType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Payment__paidFor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Review = {
			Hw1Tables.Properties._Review__Comment,
			Hw1Tables.Properties._Review__Rating,
			Hw1Tables.Properties._Review__ReviewBookingID,
			Hw1Tables.Properties._Review__ReviewID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Review__submittedBy
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SystemAdmin = {
			Hw1Tables.Properties._SystemAdmin__AdminID,
			Hw1Tables.Properties._SystemAdmin__Email,
			Hw1Tables.Properties._SystemAdmin__Name,
			Hw1Tables.Properties._SystemAdmin__Phone,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._SystemAdmin__venuesManaged
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Venue = {
			Hw1Tables.Properties._Venue__Capacity,
			Hw1Tables.Properties._Venue__Location,
			Hw1Tables.Properties._Venue__VenueID,
			Hw1Tables.Properties._Venue__bookings,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VenueVisitBooking = {
			Hw1Tables.Properties._Booking__BookingDate,
			Hw1Tables.Properties._Booking__BookingID,
			Hw1Tables.Properties._Booking__BookingStatus,
			Hw1Tables.Properties._Booking__BookingType,
			Hw1Tables.Properties._Booking__MenuOptions,
			Hw1Tables.Properties._Booking__NumberOfGuests,
			Hw1Tables.Properties._VenueVisitBooking__VisitID,
			Hw1Tables.Properties._VenueVisitBooking__VisitPurpose,
			Hw1Tables.Properties._Booking__bookingBy,
			Hw1Tables.Properties._Booking__hasReviews,
			Hw1Tables.Properties._Booking__hostedAt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Booking__Booking.initProperties(_Booking);
			Fragments._BookingAdmin__BookingAdmin.initProperties(_BookingAdmin);
			Fragments._Calendar__Calendar.initProperties(_Calendar);
			Fragments._Customer__Customer.initProperties(_Customer);
			Fragments._EventBooking__EventBooking.initProperties(_EventBooking);
			Fragments._MenuTastingBooking__MenuTastingBooking.initProperties(_MenuTastingBooking);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._Review__Review.initProperties(_Review);
			Fragments._SystemAdmin__SystemAdmin.initProperties(_SystemAdmin);
			Fragments._Venue__Venue.initProperties(_Venue);
			Fragments._VenueVisitBooking__VenueVisitBooking.initProperties(_VenueVisitBooking);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Hw1Tables();
	}

	private Hw1Tables() {
		super(Hw1Package.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Hw1Package.Literals.CUSTOMER
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
