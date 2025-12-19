package booking;

import users.User;
import resources.Resource;

/*
 * This class represents a single booking made by a user.
 * It links together the user, the resource being booked,
 * and the date of the booking.
 */
public class Booking {

    // The user who made the booking
    private User user;

    // The resource that was booked (e.g., lab or classroom)
    private Resource resource;

    // The date the resource is booked for
    private String date;

    /*
     * Constructor used to create a new booking.
     * It stores all required information at the time of booking.
     */
    public Booking(User user, Resource resource, String date) {
        this.user = user;
        this.resource = resource;
        this.date = date;
    }

    /*
     * Returns a readable summary of the booking.
     * This is mainly used for displaying output in the console.
     */
    public String getDetails() {
        return user.getName() + " booked " + resource.getType() +
               " on " + date;
    }
}

