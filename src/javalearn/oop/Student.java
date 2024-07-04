package javalearn.oop;

public class Student extends Person {
    private static int idCounter = 0;  // Static counter to auto-generate student IDs
    private final String studentId;
    private String course;
    private double gpa;

    public Student(String name, int age, char gender, String course, double gpa) {
        this.studentId = String.format("%04d", ++idCounter);  // Auto-generate student ID with leading zeros
        this.course = course;
        this.gpa = gpa;
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setCourse(String course) {
        this.course = course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isEligibleForGraduation() {
        return gpa >= 2.0;
    }

    public void updateGpa(double newGpa) {
        gpa = newGpa;
    }

    @Override
    public String eat() {
        return "Eating like a comrade!";
    }

    @Override
    public String eat(String food) {
        return "Eating Ugali and Veges severally";
    }

    // Function to display student data
    public void displayStudentData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Gender: " + super.getGender());
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
        System.out.println("Eligible for Graduation: " + (isEligibleForGraduation() ? "Yes" : "No"));
    }
}
