package javalearn.oop;

public class Employee extends Person {
    private static int idCounter = 0;  // Static counter to auto-generate employee IDs
    private final String id;
    private String department;
    private double salary;

    public Employee(String name, int age, char gender, String department, double salary) {
        this.id = String.format("EM%04d", ++idCounter);  // Auto-generate employee ID with leading zeros
        this.department = department;
        this.salary = salary;
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void giveRaise(double percentage) {
        salary += salary * (percentage / 100);
    }

    @Override
    public String eat() {
        return "Eating normally";
    }

    @Override
    public String eat(String food) {
        return "Eating " + food;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Gender: " + super.getGender());
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
