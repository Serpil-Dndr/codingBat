package string_1;

public class WithOutEnd {
    public static void main(String[] args) {
        /*
        Given a string, return a version without
        the first and last char, so "Hello" yields "ell".
         The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
         */
        System.out.println(withoutEnd("hello"));

    }
    public static String withoutEnd(String str) {
        if (str.length()>=2){

        }
        return    str.substring(1,str.length()-1);
    }

}
