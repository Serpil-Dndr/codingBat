package string_1;

public class MiddleThree {
//    Given a string of odd length,
//    return the string length 3 from its middle,
//    so "Candy" yields "and".
//    The string length will be at least 3.
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"
       public static String middleThree(String str) {
           //return str.substring(0, str.length() / 2);
           int mid = str.length() / 2;
           return str.substring(mid - 1, mid + 2);
}

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));// sol +lvi
    }

}

