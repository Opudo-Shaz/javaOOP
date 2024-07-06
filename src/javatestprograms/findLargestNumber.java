package javatestprograms;

public class findLargestNumber {

    public static void findLargestNumber(int a, int b, int c) {
        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}
