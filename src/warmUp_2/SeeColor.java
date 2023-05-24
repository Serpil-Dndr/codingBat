package warmUp_2;

public class SeeColor {
    public static void main(String[] args) {
        /*
        Given a string, if the string begins with "red" or "blue"
        return that color string, otherwise return the empty string.
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
         */
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    public static String seeColor(String str) {
        if (str.substring(0, 3).equals("red")) {
            return str.substring(0, 3);
        }
        if (str.substring(0, 4).equals("blue")) {
            return str.substring(0, 4);
        } else {
            return "";
        }

    }
}