package Array_1;

import java.util.Arrays;

public class Start1 {
    public static void main(String[] args) {
        /*
        Start with 2 int arrays, a and b,
        of any length. Return how many
        of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
         */
        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 3, 6};


        System.out.println((start1(a1, b1)));  // Output: 1

    }
    public static int start1(int[] a, int[] b) {
         int result = 0;
        if (a.length > 0 && a[0] == 1) {
            result++;
        }

        if (b.length > 0 && b[0] == 1) {
            result++;
        }

        return result;
    }

}


