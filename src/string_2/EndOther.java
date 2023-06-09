package string_2;

public class EndOther {
    public static void main(String[] args) {
        /*
        Given two strings, return true if either
        of the strings appears at the very end
        of the other string, ignoring upper/lower case
        differences (in other words, the computation
        should not be "case sensitive").
        Note: str.toLowerCase() returns the lowercase
        version of a string.
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
         */
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("hi", "hello"));


    }
    public static  boolean endOther(String a, String b) {
        String str =a.toLowerCase();
        String str2= b.toLowerCase();

          return str.endsWith(str2)|| str2.endsWith(str);

    }

}
