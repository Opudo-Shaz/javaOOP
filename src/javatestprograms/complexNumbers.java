package javatestprograms;

public class complexNumbers {
    int real,image;
    public complexNumbers(int i, int r){
        this.image = i;
        this.real = r;
    }
    public void display() {
        System.out.print("(" + this.real + " + " + this.image + "i" + ")");
    }
    public  static complexNumbers add(complexNumbers a, complexNumbers b){
        complexNumbers sum = new complexNumbers(0,0);
        sum.real = a.real + b.real;
        sum.image = a.image + b.image;
        return sum;
    }
    public static void displayInfo() {
        // Creating two complex numbers
        complexNumbers c1 = new complexNumbers(4,5);
        complexNumbers c2 = new complexNumbers(4,5);

        // Printing the complex numbers
        System.out.print("First Complex number: ");
        c1.display();
        System.out.print("\nSecond Complex number: ");
        c2.display();

        // Calling add() to perform addition
        complexNumbers sum = complexNumbers.add(c1, c2);

        // Displaying the addition
        System.out.println("\nAddition is :");
        sum.display();
    }
}
