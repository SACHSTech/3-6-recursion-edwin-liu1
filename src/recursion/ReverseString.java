package recursion;

public class ReverseString {
    
    public static String reverse(String s){
        String reverse = "";
        reverse += s.charAt(s.length()-1);
        if (!(s.length()<=1)){
            reverse += reverse(s.substring(0, s.length()-1));
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse("dog")); // output: god
    }
}
