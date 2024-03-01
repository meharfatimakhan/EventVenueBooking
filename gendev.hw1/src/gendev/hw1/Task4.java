package gendev.hw1;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collections; 
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.emf.ecore.resource.ResourceSet; 
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl; 
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl; 

public class Task4 {
	public static String instance = "task4-Instances/instance.xmi";

	public static void main(String[] args) throws ParseException {
		System.out.println("Creating and saving instance to file " + instance);

        Hw1Package.eINSTANCE.eClass();
        
     // Create instances of the Ecore Model
        Customer customer1 = Hw1Factory.eINSTANCE.createCustomer();
        customer1.setName("Mehar");
        customer1.setEmail("mehar@gmail.com");
        customer1.setPhone("0091665433");
        
        Customer customer2 = Hw1Factory.eINSTANCE.createCustomer();
        customer2.setName("Nikhil");
        customer2.setEmail("nikhil@gmail.com");
        customer2.setPhone("0091665432");
        
        Customer customer3 = Hw1Factory.eINSTANCE.createCustomer();
        customer3.setName("Ava");
        customer3.setEmail("ava@gmail.com");
        customer3.setPhone("0091665442");
        
        Customer customer4 = Hw1Factory.eINSTANCE.createCustomer();
        customer4.setName("Kakashi");
        customer4.setEmail("kakashi@gmail.com");
        customer4.setPhone("0091663542");

        Review review1 = Hw1Factory.eINSTANCE.createReview();
        review1.setRating(4);
        review1.setComment("Great experience!");
        review1.setReviewBookingID(1);
        review1.setReviewID(1);

        Review review2 = Hw1Factory.eINSTANCE.createReview();
        review2.setRating(5);
        review2.setComment("Nice decor");
        review2.setReviewBookingID(4);
        review2.setReviewID(2);

        Venue venue1 = Hw1Factory.eINSTANCE.createVenue();
        venue1.setLocation("Lark Venues, Leicester LE3GHK");
        venue1.setCapacity(100);
        venue1.setVenueID(1);
        
        Venue venue2 = Hw1Factory.eINSTANCE.createVenue();
        venue2.setLocation("GRU Hall, Leicester LE4198");
        venue2.setCapacity(500);
        venue2.setVenueID(2);

        EventBooking eventBooking = Hw1Factory.eINSTANCE.createEventBooking();
        eventBooking.setEventDescription("A birthday party of a boy 10 year old with toy story theme");
        eventBooking.setEstimatedPriceQuote(2000);
        eventBooking.setBookingBy(customer1);
        eventBooking.setBookingDate("Mon Feb 27 10:30:00 GMT 2024");
        eventBooking.setBookingType("Event");
        eventBooking.setBookingStatus("Confirmed");
        eventBooking.setNumberOfGuests(50);
        eventBooking.setBookingID(2);
        
        
        EventBooking eventBooking2 = Hw1Factory.eINSTANCE.createEventBooking();
        eventBooking2.setEventDescription("A wedding with white balloons");
        eventBooking2.setEstimatedPriceQuote(4000);
        eventBooking2.setBookingBy(customer2);
        eventBooking2.setBookingDate("Mon Feb 29 10:30:00 GMT 2024");
        eventBooking2.setBookingType("Event");
        eventBooking2.setBookingStatus("Confirmed");
        eventBooking2.setNumberOfGuests(80);
        eventBooking2.setBookingID(3);
        
        EventBooking eventBooking3 = Hw1Factory.eINSTANCE.createEventBooking();
        eventBooking3.setEventDescription("A sports event");
        eventBooking3.setEstimatedPriceQuote(900);
        eventBooking3.setBookingBy(customer4);
        eventBooking3.setBookingDate("Mon Feb 26 10:30:00 GMT 2024");
        eventBooking3.setBookingType("Event");
        eventBooking3.setBookingStatus("Confirmed");
        eventBooking3.setNumberOfGuests(290);
        eventBooking3.setBookingID(4);

        BookingAdmin bookingAdmin = Hw1Factory.eINSTANCE.createBookingAdmin();
        bookingAdmin.setAdminID(1);
        bookingAdmin.setEmail("ava@gmail.com");
        bookingAdmin.setPhone("9876543210");
        bookingAdmin.setNumberOfApprovals(2);
        bookingAdmin.setName("Ava John");

        VenueVisitBooking venueVisitBooking = Hw1Factory.eINSTANCE.createVenueVisitBooking();
        venueVisitBooking.setVisitPurpose("Lark Venue Visit");
        venueVisitBooking.setBookingBy(customer3);
        venueVisitBooking.setBookingDate("Mon Feb 28 10:30:00 GMT 2024");
        venueVisitBooking.setBookingStatus("Confirmed");
        venueVisitBooking.setBookingType("Visit");
        venueVisitBooking.setVisitID(3);
        venueVisitBooking.setNumberOfGuests(20);
        venueVisitBooking.setBookingID(3);

        // Establish links between objects
        customer1.getSubmits().add(review1);
        customer1.getSubmits().add(review2);
        venue1.getBookings().add(eventBooking2);
        bookingAdmin.getApprovedBookings().add(eventBooking2);
        bookingAdmin.getVenuesManaged().add(venue2);
        venue2.getBookings().add(venueVisitBooking);
        venue2.getBookings().add(eventBooking3);
        // Save the model to XMI file
        saveModel(instance, customer1, venueVisitBooking, bookingAdmin);
    }
	
	private static void saveModel(String fileName, Customer customer1, 
			 VenueVisitBooking venueVisitBooking, BookingAdmin bookingAdmin) {
	        ResourceSet resourceSet = new ResourceSetImpl();

	        // Register the XMI resource factory
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

	        // Create a resource
	        Resource resource = resourceSet.createResource(URI.createURI(fileName));
	        System.out.println("URI" + URI.createURI(fileName));
	        // Add instances to the resource
	        resource.getContents().add(customer1);
//	        resource.getContents().add(review2);
//	        resource.getContents().add(venue2);
//	        resource.getContents().add(eventBooking);
	        resource.getContents().add(venueVisitBooking);
	        resource.getContents().add(bookingAdmin);
	        // Save the resource
	        try {
	            resource.save(Collections.EMPTY_MAP);
	            System.out.println("Model saved to " + fileName);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	  }
}
