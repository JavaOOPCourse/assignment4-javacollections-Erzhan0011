package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.addFirst("URGENT: Meet Dean (Academic Warning)");
        // TODO: Add 1 urgent appointment at the beginning
        appointments.addLast("Advisor Meeting: Course Plan");
        appointments.addLast("Finance Office: Scholarship Info");
        appointments.addLast("Library: Book Renewal Help");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments to cancel.");
            return;
        }
        String removed = appointments.removeLast();
        System.out.println("Canceled: " + removed);
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        System.out.println("First appointment: " + appointments.getFirst());
        System.out.println("Last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        System.out.println("=== Appointments ===");
        Iterator<String> it = appointments.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }
}
