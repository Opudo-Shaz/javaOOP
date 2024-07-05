package javatestprograms;

public class Addition {
    public int sum(int a,int b){
        return a + b;
    }
    public int sumBitValues(int x,int y){
        if (y == 0) return x;
        return sum(x ^ y, (x & y) << 1);
    }
    public double multiplyFloatValues(double a, double b){
        double p = a * b;
        return p;
    }
    @org.jetbrains.annotations.NotNull
    public static String addBinaryValues(String a, String b){
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
}
