package javatestprograms;

public class OddEvenChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void displayOddEven(int number) {
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}