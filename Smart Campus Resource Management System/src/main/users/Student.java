package users;

/*
 * Represents a student user of the system.
 * Students are able to request bookings for campus resources.
 */
public class Student extends User {

    /*
     * Creates a student with basic identifying information.
     */
    public Student(int id, String name, String email, String studentNumber) {
        super(id, name, email, studentNumber);
    }

    /*
     * Returns the role of this user.
     * This helps distinguish students from other user types.
     */
    @Override
    public String getRole() {
        return "Student";
    }
}
