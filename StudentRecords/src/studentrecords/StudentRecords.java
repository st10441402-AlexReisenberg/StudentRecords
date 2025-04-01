/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentrecords;

/**
 *
 * @author ST10441402-AlexReisenberg
 */
public class StudentRecords {

    // Student attributes
    private int studentID;
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;

    // Default constructor
    public StudentRecords() {
    }

    // Master constructor
    public StudentRecords(int studentID, String firstName, String lastName, int age, double gpa) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters and setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        // Example usage
        StudentRecords student = new StudentRecords(101, "John", "Doe", 20, 3.8);
        student.printDetails();
    }
}

