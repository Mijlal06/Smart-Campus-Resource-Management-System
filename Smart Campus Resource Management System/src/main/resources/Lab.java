package resources;

/*
 * Represents a computer lab that can be booked.
 * A lab is defined by the number of computers it contains.
 */
public class Lab extends Resource {

    // Number of computers available in the lab
    private int computers;

    /*
     * Creates a lab with an ID, name, and number of computers.
     */
    public Lab(String id, String name, int computers) {
        super(id, name);
        this.computers = computers;
    }

    /*
     * Returns the number of computers in the lab.
     */
    public int getComputers() {
        return computers;
    }

    /*
     * Identifies the type of resource.
     * This is used by the booking system to match resources.
     */
    @Override
    public String getType() {
        return "Lab";
    }
}
