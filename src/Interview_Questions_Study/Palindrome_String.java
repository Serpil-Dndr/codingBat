package Interview_Questions_Study;

public class Palindrome_String {

    public static void main(String[] args) {
        System.out.println(isPalindrome2("MadaM"));

    }
    public static boolean IsPalindrome(String str){
        String reversed  = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

    }
    public static boolean isPalindrome2(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}