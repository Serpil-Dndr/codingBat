package string_2;

public class StarOut {
    public static void main(String[] args) {
        /*
        Return a version of the given string,
        where for every star (*) in the string
        the star and the chars immediately to its left and right are gone.
        So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
         */
        String inputString = "ab*cd";
        String outputString = starOut(inputString);
        System.out.println(outputString);
    }

    public static String starOut(String str) {
        return str.replaceAll(".\\*+.", "");

            }

        }




