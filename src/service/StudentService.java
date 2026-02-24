package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Aiperi", 3.6));
        students.add(new Student(2, "Timur", 1.8));
        students.add(new Student(3, "Bek", 2.4));
        students.add(new Student(4, "Jan", 3.9));
        students.add(new Student(5, "Nur", 1.5));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getGpa() < 2.0) it.remove();
        }
    }
    public void findHighestGPA () {
        // TODO: Find and print student with highest GPA
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > best.getGpa()) best = s;
        }
        System.out.println("Highest GPA student: " + best + " (id=" + best.getId() + ")");
    }

    public void insertAtIndex () {
        // TODO: Insert new student at index 2
        if (students.size() < 2) {
            students.add(new Student(999, "Inserted Student", 3.0));
        } else {
            students.add(2, new Student(999, "Inserted Student", 3.0));
        }
        System.out.println("Inserted new student at index 2");
    }

    public void printStudents () {
        // TODO: Print using Iterator
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        System.out.println("=== Students ===");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            }
        }
    }
