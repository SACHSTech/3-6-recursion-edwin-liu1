package recursion;

public class CheckStringPalindrome {
    
    public static boolean isPalindrome(String s){
        boolean palindrome = true;
        if (!s.isEmpty()){
            if (s.charAt(0) == s.charAt(s.length()-1)){
                isPalindrome(s.substring(1, s.length()-2));
            } else {
                palindrome = false;
            }
        }
        return palindrome;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // output: true
        System.out.println(isPalindrome("train")); // output: false
    }
}
