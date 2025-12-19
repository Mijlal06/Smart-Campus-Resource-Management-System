package main;

import users.*;
import resources.*;
import booking.*;
import exceptions.*;

/*
 * Entry point of the application.
 * This class is used to demonstrate and test the system functionality.
 */
public class Main {

    public static void main(String[] args) {

        // Create a student user
        User student = new Student(
                1,
                "Muhammad Ijlal",
                "mi11",
                "221645155"
        );

        // Create resources that can be booked
        Resource lab1 = new Lab("L1", "Computer Lab A", 30);
        Resource lab2 = new Lab("L2", "Computer Lab B", 25);

        // Booking manager handles all booking logic
        BookingManager manager = new BookingManager();

        // Register resources with the booking system
        manager.addResource(lab1);
        manager.addResource(lab2);

        try {
            // Test Case 1: Successful booking of an available resource
            manager.bookResource(student, lab1, "2025-12-15");

            // Test Case 2: Attempt to book the same resource again (conflict expected)
            manager.bookResource(student, lab1, "2025-12-16");

        } catch (BookingException e) {
            // Expected output for conflict detection
            System.out.println(e.getMessage());
        }

        // Test Case 3: Display all confirmed bookings
        manager.showBookings();
    }
}
