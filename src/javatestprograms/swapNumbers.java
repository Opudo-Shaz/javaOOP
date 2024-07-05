package javatestprograms;

public class swapNumbers {
  public void swap(int x, int y) {
    System.out.println("Value of x is " + x + " and y is " + y + " before swapping");
    // Swapping the values
    int temp = x;
    x = y;
    y = temp;
    System.out.println("Value of x is " + x  + " and Value of y  is " + y + " after swapping");
  }
  }


