package resources;

/*
 * Abstract base class for all bookable resources.
 * It defines common properties and behaviour shared
 * by classrooms, labs, or any future resource types.
 */
public abstract class Resource {

    // Unique identifier for the resource
    protected String resourceId;

    // Human-readable name of the resource
    protected String name;

    // Indicates whether the resource is currently available
    protected boolean available;
    
    /*
     * Constructor used by subclasses to initialize
     * basic resource information.
     */
    public Resource(String resourceId, String name) {
        this.resourceId = resourceId;
        this.name = name;
        this.available = true; // resources start as available
    }

    /*
     * Returns true if the resource is available for booking.
     */
    public boolean isAvailable() {
        return available;
    }

    /*
     * Updates the availability status of the resource.
     */
    public void setAvailable(boolean status) {
        this.available = status;
    }

    /*
     * Each resource type must specify what it is.
     * This is used by the booking system when matching resources.
     */
    public abstract String getType();
}
