package recursion;

public class EvenNumbersRange {
    public static void printEvens(int start, int end) {
        int direction = (end - start);
        if ((start%2) == 0){
            System.out.print(start + "\s");
        }
        if (direction != 0){
            printEvens(start + (direction/Math.abs(direction)), end);
        }
    }
    public static void main(String[] args) {
        printEvens(15,4); // outputs: 14 12 10 8 6 4
        printEvens(6, 10); // outputs: 6 8 10
    }
}
