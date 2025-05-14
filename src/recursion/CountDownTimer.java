package recursion;

public class CountDownTimer {
    public static void countDown(int n) {
        System.out.print(n + "\s");
        if (n > 1){
            countDown(n-1);
        }
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}