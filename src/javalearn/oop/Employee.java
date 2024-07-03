package javalearn.oop;

public class Employee extends Person{
    private final int id;
    private String department;
    private double salary;

    public Employee(int id, String department, double salary) {
        this.id = id;
        super.setName("Charles Nyawara");
        super.setAge(54);
        super.setGender('M');
        this.department = department;
        this.salary = salary;
    }
//Getters and Setters
public int getId() {
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
        return "Eating";
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
