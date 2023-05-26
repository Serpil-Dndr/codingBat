package Array_1;

import java.util.Arrays;

public class Make_Pi {
    public static void main(String[] args) {
        /*
        Return an int array length 3 containing the first 3
        digits of pi, {3, 1, 4}.
makePi() → [3, 1, 4]

         */
        int [] piDigit= makePi();
        System.out.println(Arrays.toString(piDigit));
    }
    public static int[] makePi() {
        int[] piArray = {3, 1, 4};
        return piArray;
    }

}
