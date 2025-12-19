package booking;

import java.util.ArrayList;
import resources.Resource;
import users.User;
import exceptions.BookingException;

/*
 * This class is responsible for managing all booking-related logic.
 * It keeps track of existing bookings and available resources,
 * and handles conflict detection.
 */
public class BookingManager {

    // Stores all confirmed bookings in the system
    private ArrayList<Booking> bookings = new ArrayList<>();

    // Stores all resources that can be booked
    private ArrayList<Resource> resources = new ArrayList<>();

    /*
     * Adds a resource to the system so it can be booked.
     * Resources must be registered before booking attempts.
     */
    public void addResource(Resource resource) {
        resources.add(resource);
    }

    /*
     * Attempts to book a resource for a user on a given date.
     * If the resource is unavailable, the method checks for an
     * alternative resource of the same type.
     */
    public void bookResource(User user, Resource resource, String date)
            throws BookingException {

        // Check if the requested resource is already booked
        if (!resource.isAvailable()) {

            // Try to find an available alternative resource
            Resource alternative = findAlternative(resource);

            if (alternative != null) {
                throw new BookingException(
                    "Resource unavailable. Suggested alternative: "
                    + alternative.getType()
                );
            } else {
                throw new BookingException("No alternative resources available.");
            }
        }

        // Mark the resource as unavailable and store the booking
        resource.setAvailable(false);
        bookings.add(new Booking(user, resource, date));
    }

    /*
     * Searches for an available resource of the same type
     * as the one originally requested.
     */
    private Resource findAlternative(Resource requested) {
        for (Resource r : resources) {
            if (r.getType().equals(requested.getType()) && r.isAvailable()) {
                return r;
            }
        }
        return null;
    }

    /*
     * Displays all confirmed bookings in the console.
     * Used mainly for testing and demonstration purposes.
     */
    public void showBookings() {
        for (Booking b : bookings) {
            System.out.println(b.getDetails());
        }
    }
}
