package model;

public class Student {

    // TODO: declare fields
    private int id;
    private String name;
    private double gpa;

    // TODO: create constructor
    public Student(int id_, String name_, double gpa_){
        id = id_;
        name = name_;
        gpa = gpa_;
    }

    // TODO: create getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


    // TODO: override toString()
    @Override
    public String toString() {
        return "name: " + name + ", id: " + id + ", gpa: " + gpa;
    }

}
