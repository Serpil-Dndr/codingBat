package string_1;

public class WithoutX {
    public static void main(String[] args) {
        /*
        Given a string, if the first or last chars are 'x',
        return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
         */
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    public static String withoutX(String str) {
        if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        }

        if(str.startsWith("x")) {
            return str.substring(1);

        }
        if(str.endsWith("x")){
            return str.substring(0,str.length()-1);
        }
      return str;
    }
}
