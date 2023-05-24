package string_1;

public class LastChars {
    /*
    bidaha bak

Given 2 strings, a and b, return a new string
made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is
length 0, use '@' for its missing char.
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
     */
    public static String lastChars(String a, String b) {

//       String firstChar ="@";
//       String lastChar ="@";
        if(a.length() > 0)
            return  a.substring(0,1);

        if(b.length() > 0)
           return b.substring(b.length() - 1);

        return "@@";
    }





    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("", ""));
    }
}
