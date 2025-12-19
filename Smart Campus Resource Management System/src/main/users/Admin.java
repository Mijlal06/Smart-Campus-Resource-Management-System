package users;

/*
 * Represents an administrative user of the system.
 * Admins could be extended in the future to manage
 * resources or view all bookings.
 */
public class Admin extends User {

    /*
     * Creates an admin user with basic identifying information.
     */
    public Admin(int id, String name, String email, String studentNumber) {
        super(id, name, email, studentNumber);
    }

    /*
     * Returns the role of this user.
     * Used to distinguish admins from other user types.
     */
    @Override
    public String getRole() {
        return "Admin";
    }
}

