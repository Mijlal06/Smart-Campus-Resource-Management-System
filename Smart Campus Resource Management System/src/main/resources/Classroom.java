package resources;

/*
 * Represents a classroom resource that can be booked.
 * A classroom has a fixed seating capacity.
 */
public class Classroom extends Resource {

    // Maximum number of students the classroom can hold
    private int capacity;

    /*
     * Creates a classroom with an ID, name, and seating capacity.
     */
    public Classroom(String id, String name, int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

    /*
     * Returns the seating capacity of the classroom.
     */
    public int getCapacity() {
        return capacity;
    }

    /*
     * Identifies the type of resource.
     * Used when checking for alternative resources.
     */
    @Override
    public String getType() {
        return "Classroom";
    }
}
