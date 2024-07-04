import javalearn.oop.Child;
import javalearn.oop.Employee;
import javalearn.oop.Student;
import javalearn.oop.Woman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Child child1 = new Child(1, 'F', 5);
//        Child child2 = new Child(5, 'M', 8);
////        child1.setAge(1);
//        child1.setGender('F');
//        child1.setName("Emilio");
//        child1.setRemainingDaysToClinic(5);
//
//        System.out.println(child1.eat("Porridge"));
//        System.out.println(child1.breastFeed());
//        System.out.println(child1.breath(1));
//        System.out.println(child1.sleep());
//        System.out.println(child1.findClinicDate(2));
//        Woman woman = new Woman(26, 55);
//        woman.setMCycleDays(26);
//        woman.setName("Jade");
//        woman.setAge(25);
//
//
//        System.out.println(woman.eat("sugarcane"));
//        System.out.println(woman.conceive());
//        System.out.println(woman.giveBirth());
//        System.out.println(woman.startPeriod(5));
//        System.out.println(woman.breath(1));
//        System.out.println(woman.sleep());
        Student student1 = new Student("Mary Owade", 21, 'F', "Computer Science", 3.5);
        student1.displayStudentData();

        Student student2 = new Student("John Doe", 22, 'M', "Mathematics", 3.8);
        student2.displayStudentData();
        Student student3 = new Student("Julie Nyachae", 18, 'F', "Mathematics", 1.5);
        student3.displayStudentData();


        Employee employee1 = new Employee("Charles Nyawara", 54, 'M', "IT", 5000.00);
        employee1.displayInfo();

        Employee employee2 = new Employee("Jane Doe", 30, 'F', "HR", 4500.00);
        employee2.displayInfo();
//        Employee emp1 = new Employee(56789,"Finance",56789.09);
//        emp1.displayInfo();
//        emp1.eat();
    }
}