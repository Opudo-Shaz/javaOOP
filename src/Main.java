import javalearn.oop.Child;
import javalearn.oop.Employee;
import javalearn.oop.Student;
import javalearn.oop.Woman;
import javatestprograms.Addition;
import javatestprograms.swapNumbers;

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
//        Student student1 = new Student("Mary Owade", 21, 'F', "Computer Science", 3.5);
//        student1.displayStudentData();
//
//        Student student2 = new Student("John Doe", 22, 'M', "Mathematics", 3.8);
//        student2.displayStudentData();
//        Student student3 = new Student("Julie Nyachae", 18, 'F', "Mathematics", 1.5);
//        student3.displayStudentData();
//
//
//        Employee employee1 = new Employee("Charles Nyawara", 54, 'M', "IT", 5000.00);
//        employee1.displayInfo();
//
//        Employee employee2 = new Employee("Jane Doe", 30, 'F', "HR", 4500.00);
//        employee2.displayInfo();
//        Employee emp1 = new Employee(56789,"Finance",56789.09);
//        emp1.displayInfo();
//        emp1.eat();
        Addition obj1 = new Addition();
        int sum = obj1.sum(34,78);
        System.out.println("The sum of a and b is: " + sum);
        Addition obj2 = new Addition();
        sum = obj1.sumBitValues(45, 78);
        System.out.println("The sum of x and y in bitwise is: " + sum);
        Addition obj3 = new Addition();
        System.out.println("The product of a and b floating values is: " + obj3.multiplyFloatValues(23.20,12.90) );
        Addition obj4 = new Addition();
        System.out.println("The product of a and b floating values is: " + obj4.multiplyFloatValues(7.5,6.54));
        // Random integer values
        swapNumbers numbers = new swapNumbers();
        numbers.swap(5,10);
        System.out.println();

        // Sample binary strings
        String binary1 = "101011"; // 10 in decimal
        String binary2 = "110110"; // 13 in decimal

        // Call the addBinaryValues method and print the result
        String result = Addition.addBinaryValues(binary1, binary2);

        // Print the result
        System.out.println("The sum of " + binary1 + " and " + binary2 + " is " + result);


    }
}