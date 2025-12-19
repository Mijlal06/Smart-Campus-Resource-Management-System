package users;

/*
 * Abstract base class for all users in the system.
 * It stores common information shared by students and admins.
 */
public abstract class User {

    // Internal identifier for the user
    protected int id;

    // User's full name
    protected String name;

    // User's email address
    protected String email;

    // Student number used as a unique identifier (for students)
    protected String studentNumber;

    /*
     * Constructor used by subclasses to initialize user information.
     */
    public User(int id, String name, String email, String studentNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.studentNumber = studentNumber;
    }

    /*
     * Returns the student number associated with the user.
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /*
     * Returns the role of the user (e.g., Student or Admin).
     * Implemented by subclasses.
     */
    public abstract String getRole();

    /*
     * Returns the user's name.
     * Used when displaying booking information.
     */
    public String getName() {
        return name;
    }
}

