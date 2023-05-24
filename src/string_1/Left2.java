package string_1;

public class Left2 {
    public static void main(String[] args) {
        /*
        Given a string, return a "rotated left 2"
        version where the first 2 chars are moved to the end.
        The string length will be at least 2.
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
         */
        System.out.println(left2("Hello"));
    }
    public static String left2(String str) {
         if(str.length()>=2){

         }
        return str.substring(2) + str.substring(0, 2);
    }

    public static class WithoutEnd2 {

        public static void main(String[] args) {
            /*
            Given a string, return a version without both
            the first and last char of the string.
            The string may be any length, including 0.
    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
             */
            System.out.println(withoutEnd2("Hello"));
            System.out.println(withoutEnd2("abc"));
            System.out.println(withoutEnd2("ab"));


        }
        public static String withoutEnd2(String str) {
            return  str.substring(1,str.length()-1);
        }

    }
}
