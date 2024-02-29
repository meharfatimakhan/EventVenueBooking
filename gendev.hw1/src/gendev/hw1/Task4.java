package gendev.hw1;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections; 
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.emf.ecore.resource.ResourceSet; 
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl; 
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl; 

public class Task4 {
	public static String instance = "task4_Instances/instance.xmi";

	public static void main(String[] args) {
		System.out.println("Creating and saving instance to file " + instance);

        Hw1Package.eINSTANCE.eClass();

        // Create instances of the Ecore Model
        Customer customer1 = Hw1Factory.eINSTANCE.createCustomer(); // object 1
        Customer customer2 = Hw1Factory.eINSTANCE.createCustomer(); // object 2
        Review review1 = Hw1Factory.eINSTANCE.createReview(); // object 3
        Review review2 = Hw1Factory.eINSTANCE.createReview(); // object 4
        Venue venue1 = Hw1Factory.eINSTANCE.createVenue(); // object 5
        Venue venue2 = Hw1Factory.eINSTANCE.createVenue(); // object 6

        // Setting values for the objects
        
        // settings for object 1
        customer1.setName("Nikhil Sukesula");
        customer1.setEmail("nikhilpt75@gmail.com");
        customer1.setPhone("5214508654");
        
        // settings for object 2
        customer2.setName("Mehar Fatima Khan");
        customer2.setEmail("meharf@gmail.com");
        customer2.setPhone("5725208652");
        
        // settings for object 3
        review1.setRating(3);
        review2.setComment("Food was just okay. but venue was nice..");
        review2.setReviewID(0);
        
        // settings for object 4
        review2.setRating(5);
        review2.setComment("Absolutly amazing service! The venue was beautiful and the food tasted heavenly!");
        review2.setReviewID(1);
        
        // settings for object 5
        venue1.setLocation("Valley Suites 105 Graham Road Leicester LE5 1HQ");
        venue1.setCapacity(50);
        venue1.setVenueID(1);

        // settings for object 6
        venue2.setLocation("St Martins House Conference Centre Leicester, The Grand Hall, Leicester, LE1 5PZ");
        venue2.setCapacity(100);
        venue2.setVenueID(2);
  
        // Create links between objects
        customer1.getSubmits().add(review1); // link 1
        customer2.getSubmits().add(review2); // link 2
        
        BookingAdmin bookingAdmin = Hw1Factory.eINSTANCE.createBookingAdmin();
        bookingAdmin.setAdminID(0);
        bookingAdmin.setEmail("ada@gmail.com");
        bookingAdmin.setPhone("3124313262");
        bookingAdmin.setNumberOfApprovals(1);
        bookingAdmin.setName("Ada Jade");
        
        
        // creating EventBooking object
        Calendar calendar = Calendar.getInstance();
        EventBooking eventBooking = Hw1Factory.eINSTANCE.createEventBooking();
        eventBooking.setEventDescription("a wedding being hosted for 100 people with white decor and white baloons all over");
        eventBooking.setEstimatedPriceQuote(1000);
        eventBooking.setBookingBy(customer1); // link 3
        eventBooking.setHostedAt(venue1); // link 4
        eventBooking.setApprovedBy(bookingAdmin); // link 5
        eventBooking.setBookingDate(calendar);
        eventBooking.setBookingType("Event");
        eventBooking.setBookingStatus("Confirmed");
        eventBooking.setNumberOfGuests(30);
        eventBooking.setBookingID(3);
        EList<String> menuItems1 = new BasicEList<String>();
        menuItems1.add("French Fries");
        menuItems1.add("Burgers");
        menuItems1.add("Caviar");
        menuItems1.add("Coke");
        eventBooking.setMenuOptions(menuItems1);	 
                
        // create venue visit object
        VenueVisitBooking venueVisitBooking = Hw1Factory.eINSTANCE.createVenueVisitBooking();
        Calendar calendar2 = Calendar.getInstance();
        venueVisitBooking.setVisitPurpose("FINALIZE DECOR");
        venueVisitBooking.setBookingBy(customer2); // link 6
        venueVisitBooking.setBookingDate(calendar2);
        venueVisitBooking.setBookingStatus("Confirmed");
        venueVisitBooking.setBookingType("Visit");
        venueVisitBooking.setVisitID(3);
        venueVisitBooking.setNumberOfGuests(61);
        venueVisitBooking.setBookingID(5);
        venueVisitBooking.setHostedAt(venue2); // link 7
        EList<String> menuItems2 = new BasicEList<String>();
        menuItems2.add("Biryani");
        menuItems2.add("Chai");
        menuItems2.add("Chicken Curry");
        venueVisitBooking.setMenuOptions(menuItems2);	
        
        // Save the model to XMI file
        saveModel(instance, customer1, customer2, review1, review2, venue1, venue2, eventBooking, venueVisitBooking, bookingAdmin);
    }
	
	private static void saveModel(String fileName, Customer customer1, Customer customer2, Review review1, Review review2, Venue venue1, Venue venue2, EventBooking eventBooking, VenueVisitBooking venueVisitBooking, BookingAdmin bookingAdmin) {
	        ResourceSet resourceSet = new ResourceSetImpl();

	        // Register the XMI resource factory
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

	        // Create a resource
	        Resource resource = resourceSet.createResource(URI.createURI(fileName));

	        // Add instances to the resource
	        resource.getContents().add(customer1);
	        resource.getContents().add(customer2);
	        resource.getContents().add(review1);
	        resource.getContents().add(review2);
	        resource.getContents().add(venue1);
	        resource.getContents().add(venue2);
	        resource.getContents().add(eventBooking);
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
	
	 private static EventBooking createEventBooking(Customer customer) {
		    Calendar calendar = Calendar.getInstance();
	        EventBooking eventBooking = Hw1Factory.eINSTANCE.createEventBooking();
	        eventBooking.setEventDescription("a wedding being hosted for 100 people with white decor and white baloons all over");
	        eventBooking.setEstimatedPriceQuote(1000);
	        eventBooking.setBookingBy(customer);
//	        eventBooking.setBookingDate(calendar);
	        eventBooking.setBookingType("Event");
	        eventBooking.setBookingStatus("Confirmed");
	        eventBooking.setNumberOfGuests(30);
	        eventBooking.setBookingID(3);
	        EList<String> menuItems = new BasicEList<String>();
	        menuItems.add("French Fries");
	        menuItems.add("Burgers");
	        menuItems.add("Caviar");
	        menuItems.add("Coke");
	        eventBooking.setMenuOptions(menuItems);	        
	        
	        return eventBooking;
	    }

	    private static VenueVisitBooking createVenueVisitBooking(Customer customer) {
	        VenueVisitBooking venueVisitBooking = Hw1Factory.eINSTANCE.createVenueVisitBooking();
	        Calendar calendar = Calendar.getInstance();
	        venueVisitBooking.setVisitPurpose("FINALIZE DECOR");
	        venueVisitBooking.setBookingBy(customer);
//	        venueVisitBooking.setBookingDate(calendar);
	        venueVisitBooking.setBookingStatus("Confirmed");
	        venueVisitBooking.setBookingType("Visit");
	        venueVisitBooking.setVisitID(3);
	        venueVisitBooking.setNumberOfGuests(61);
	        venueVisitBooking.setBookingID(5);
	        EList<String> menuItems = new BasicEList<String>();
	        menuItems.add("Biryani");
	        menuItems.add("Chai");
	        menuItems.add("Chicken Curry");
	        venueVisitBooking.setMenuOptions(menuItems);	
	        return venueVisitBooking;
	    }

}
