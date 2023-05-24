package warmUp_1;

public class MissingChar {
    /*
    Given a non-empty string and an int n, return a new string where the
    char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {
        System.out.println(missingChar("serpil",2));
    }

    public static String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1);//0,n 0 dan basla n e kadar gel / n+1 n i atla bi fazlasindan basla
//serpil >>>se  n+1 >>> rpil

    }
}
