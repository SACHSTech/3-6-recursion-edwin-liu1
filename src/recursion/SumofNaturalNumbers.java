package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        int sum = n;
        if (n>0){
            sum += sum(n-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
