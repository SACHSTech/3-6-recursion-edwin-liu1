package recursion;

public class PowerFunction {

    public static int power(int base, int exponent){
        int num = base;
        if (exponent > 1){
            num = power(base, exponent-1);
            num *= base;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3)); // output: 8
        System.out.println(power(3, 6)); // output: 729
    }
}
