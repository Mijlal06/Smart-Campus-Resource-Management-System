package exceptions;

/*
 * Custom exception used to handle booking-related errors.
 * This allows the program to clearly signal issues such as
 * unavailable resources or failed booking attempts.
 */
public class BookingException extends Exception {

    /*
     * Creates a new booking exception with a specific message.
     * The message is passed to the parent Exception class.
     */
    public BookingException(String message) {
        super(message);
    }
}
