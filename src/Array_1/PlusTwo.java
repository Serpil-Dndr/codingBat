package Array_1;

import java.util.Arrays;

public class PlusTwo {
    public static void main(String[] args) {
        /*
        Given 2 int arrays, each length 2,
        return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
         */
        int[] a1 = {1, 2};
        int[] b1 = {3, 4};
        int[] a2 = {5, 6};
        int[] b2 = {7, 8};

        int[] result1 = plusTwo(a1, b1);
        int[] result2 = plusTwo(a2, b2);

        System.out.println(Arrays.toString(result1));  // Output: [1, 2, 3, 4]
        System.out.println(Arrays.toString(result2));  // Output: [5, 6, 7, 8]
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }
}
