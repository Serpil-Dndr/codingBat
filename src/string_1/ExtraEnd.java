package string_1;

public class ExtraEnd {
    public static void main(String[] args) {
        /*

Given a string, return a new string made of
3 copies of the last 2 chars of the original string.
The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
         */
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));

        System.out.println(extraEnd("Hi"));
    }
    public static String extraEnd(String str) {
    String newStr =str.substring(str.length()-2,str.length());
    return newStr+newStr+newStr;
    }

    public static class Hello_Name {
        public static void main(String[] args) {
            /*

    Given a string name, e.g. "Bob", return a greeting of the form
    "Hello Bob!".
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
             */
            System.out.println(helloName("Bob"));
            System.out.println(helloName("Alice"));
            System.out.println(helloName("X"));

        }
        public static String helloName(String name) {
                  return "Hello " +name+ "!";
        }

    }
}
